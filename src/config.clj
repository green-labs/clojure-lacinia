(ns config
  (:require
    [clojure.edn :as edn]))

(def env
  (->> (slurp "./env.edn")
       (edn/read-string)
       (:dev)))