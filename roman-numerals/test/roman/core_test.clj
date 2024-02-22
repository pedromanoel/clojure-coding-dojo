(ns roman.core-test
  (:require [clojure.test :refer [deftest is run-all-tests]]
            [roman.core :refer [convert]]))

(deftest one-is-I
  (is (= "I" (convert 1))))

(deftest five-is-V
  (is (= "V" (convert 5))))

(deftest ten-is-X
  (is (= "X" (convert 10))))

(deftest fifty-is-L
  (is (= "L" (convert 50))))
