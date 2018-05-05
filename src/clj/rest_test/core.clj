(ns rest-test.core
  (:require [compojure.core :refer [defroutes GET POST]]
            [compojure.route :refer [not-found files resources]]
            [compojure.handler :refer [site]]
            [org.httpkit.server :refer [run-server]]))

;; (defonce ^:dynamic cats (atom {:name "Java"}))
(def ^:dynamic cats (atom {:name "Java"}))

(defn get-cats []
  (pr-str @cats))

(defroutes routes
  (GET "/" [] (get-cats))
  (files "/" {:root "target"})
  (resources "/" {:root "target"})
  (not-found "Page Not Found"))

(defonce app-server (atom nil))

(defn stop-app-server! []
  (when-not (nil? @app-server)
    (@app-server :timeout 100)
    (reset! app-server nil)))

(defn start-app-server! []
  (when (nil? @app-server)
    (reset! app-server (run-server (site routes) {:port 8090}))))

(defn -main [& args]
  (start-app-server!)) ; for Lein
