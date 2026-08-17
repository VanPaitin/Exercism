(ns bird-watcher)

(def last-week 
  (vector 0 2 5 3 7 8 4))

(defn today [birds]
  (last birds))

(defn inc-bird [birds]
  (update birds (dec (count birds)) inc))

(defn day-without-birds? [birds]
  (boolean (some #{0} birds)))

(defn n-days-count [birds n]
  (loop [col birds total 0 counter n]
    (if (<= counter 0) total (recur (rest col) (+ total (first col)) (dec counter)))))

(defn busy-days [birds]
  (count (filter #(>= % 5) birds)))

(defn parity [[_ index]]
  (if (even? index) :even :odd))

(defn check [bird value] (= (get bird 0) value))

(defmulti valid? parity)
(defmethod valid? :even [bird] (check bird 1))
(defmethod valid? :odd [bird] (check bird 0))

(defn odd-week?
  ([birds]
    (odd-week? birds 0))
  ([birds index]
   (if (empty? birds) true
     (if (valid? [(first birds) index]) (recur (rest birds) (inc index))
     false))))
