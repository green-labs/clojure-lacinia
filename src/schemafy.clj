(ns schemafy
  (:require
    [clojure.java.io :as io]
    [resolver :as r]
    [com.walmartlabs.lacinia.util :as util]
    [com.walmartlabs.lacinia.schema :as schema]
    [clojure.edn :as edn]))

(defn load-schema
  []
  (-> (io/resource "schema.edn")
      slurp
      edn/read-string
      (util/attach-resolvers {:hello r/hello})
      schema/compile))