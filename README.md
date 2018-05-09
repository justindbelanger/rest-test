# server

Provides a brief demonstration of a server-side ReSTful API, written in Clojure.

## Usage

Run `boot dev` in a terminal to have the boot build tool begin serving the REPL for development purposes.

Then, run `boot repl -c` in another terminal session to connect to the REPL.
``` clojure
(require '[rest-test.core :as c])
(c/start-app-server!)
```
 to begin serving the app. In the second case, you may then evaluate
``` clojure
(c/stop-app-server!)
```
 to stop serving the app. Don't forget that you can then evaluate `(exit)` to end the REPL.

## License

Distributed under the [WTFPL](http://www.wtfpl.net/).
