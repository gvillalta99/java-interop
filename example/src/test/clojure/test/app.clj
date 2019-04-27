(ns test.app
  (:require [clojure.test :refer :all]
            [app :as app]))

(deftest test-main
  (let [result (with-out-str (app/-main))]
    (is
      (= "" result))))
