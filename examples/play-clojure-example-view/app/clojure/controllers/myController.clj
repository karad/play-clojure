(ns controllers.myController
  (:import (play.mvc Results)
           (views.html.MyController index))
  (:gen-class
    :methods [#^{:static true} [index [] play.mvc.Result]
              #^{:static true} [view  [] play.mvc.Result]]
    :extends play.mvc.Controller))

(defn -index []
  (Results/ok "Hello world from Clojure!!"))

(defn -view []
  (Results/ok (index/render "TEST")))