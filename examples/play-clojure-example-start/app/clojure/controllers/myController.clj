(ns controllers.myController
  (:import (play.mvc Results))
  (:gen-class
    :methods [#^{:static true} [index [] play.mvc.Result]]
    :extends play.mvc.Controller))

(defn -index []
  (Results/ok "Hello world from Clojure!!"))