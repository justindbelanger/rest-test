# server

Provides data storage, validation, and serving of some static resources for a video game speedrunning community Web application. The application will allow users to submit speedruns, to browse them, and to annotate the runs with comments and/or discussions. A Vue.js-based client is also being developed, which will serve the data and mediate between this server app and the users themselves.

## Usage

Run `boot dev` in a terminal to have the boot build tool begin serving the app for development purposes.

Alternatively, run `boot repl` in a terminal, then evaluate
``` clojure
(require '[vue-server.core :as vsc] :reload)
(vsc/start-app-server!)
```
 to begin serving the app. In the second case, you may then evaluate
``` clojure
(vsc/stop-app-server!)
```
 to stop serving the app. Don't forget that you can then evaluate `(exit)` to end the REPL.

Running the server via those two functions is more intended for real-world use than for development purposes, though.

## License

Distributed under the [WTFPL](http://www.wtfpl.net/).
