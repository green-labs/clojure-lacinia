(ns core
  (:require
    [schemafy :as schemafy]
    [io.pedestal.http :as http]
    [com.walmartlabs.lacinia.pedestal2 :as lp]
    [clojure.java.browse :refer [browse-url]])
  (:gen-class
    :main true))

(def schema (schemafy/load-schema))
(def service (lp/default-service schema {:port 8080
                                         :host "0.0.0.0"}))

(defonce runnable-service (-> service
                              (merge {::http/allowed-origins (constantly true)})
                              http/create-server))
(defn stop-server
  [server]
  (http/stop server)
  nil)

(defn -main [& args]
  (println "\nCreating your server...")
  (http/start runnable-service)
  (browse-url "http://localhost:8080/ide"))