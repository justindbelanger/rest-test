(defproject rest-test "0.0.1-SNAPSHOT"
  :description "Demonstrate a ReSTful API in Clojure."
  :license {:name "WTFPL"
            :url "http://www.wtfpl.net/"}
  :url "https://github.com/justindbelanger/rest-test"
  :plugins [[lein-ring "0.12.4"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [pandeiro/boot-http "0.7.6"]
                 [adzerk/boot-reload "0.5.1"]
                 [com.cemerick/piggieback "0.2.1"]
                 [weasel "0.7.0"]
                 [org.clojure/tools.nrepl "0.2.12"]
                 [org.clojars.magomimmo/domina "2.0.0-SNAPSHOT"]
                 [hiccups "0.3.0"]
                 [compojure "1.5.2"]
                 [org.clojars.magomimmo/shoreleave-remote-ring "0.3.3"]
                 [org.clojars.magomimmo/shoreleave-remote "0.3.1"]
                 [javax.servlet/javax.servlet-api "3.1.0"]
                 [org.clojars.magomimmo/valip "0.4.0-SNAPSHOT"]
                 [enlive "1.1.6"]
                 [adzerk/boot-test "1.2.0"]
                 [http-kit "2.2.0"]]
  :ring {:handler rest-test.core/routes
         :nrepl {:start? true}}
  :source-paths ["src/clj"]
  :main rest-test.core)
