(ns levenstein.core)

(defn head-cost [x y]
  (cond
   (= (subs x 0 1) (subs y 0 1)) 0
   :else 1))

(defn levenstein-distance [x y]
  (cond
   (empty? x) (count y)
   (empty? y) (count x)
   :else (min
          (+ 1 (levenstein-distance (subs x 1) y))
          (+ 1 (levenstein-distance x (subs y 1)))
          (+ (head-cost x y) (levenstein-distance (subs x 1) (subs y 1)))
          )))
