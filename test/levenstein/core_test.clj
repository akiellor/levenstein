(ns levenstein.core-test
  (:use clojure.test
        levenstein.core))

(deftest levenstein-distance-test
  (is (= (levenstein-distance "kitten" "kitten") 0))
  (is (= (levenstein-distance "kitten" "") 6))
  (is (= (levenstein-distance "" "kitten") 6))
  (is (= (levenstein-distance "kitten" "sitting") 3))
  (is (= (levenstein-distance "kitten" "kittens") 1))
  (is (= (levenstein-distance "kitten" "skitten") 1)))
