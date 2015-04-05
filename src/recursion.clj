(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll)
       (product (rest coll)))))

(defn singleton? [coll]
  (if (empty? coll)
    false
    (empty? (rest coll))))

(defn my-last [a-seq]
  (if (empty? (rest a-seq))
    (first a-seq)
    (my-last (rest a-seq))))

(defn max-element [a-seq]
  :-)

(defn seq-max [seq-1 seq-2]
  (if (> (count seq-1) (count seq-2))
    seq-1
    seq-2))

(defn longest-sequence [a-seq]
  (if (empty? (rest a-seq))
    (first a-seq)
    (seq-max (first a-seq)
             (longest-sequence (rest a-seq)))))

(defn my-filter [pred a-seq]
  (if (empty? a-seq)
    a-seq
    (if (pred (first a-seq))
      (cons (first a-seq)
      (my-filter pred (rest a-seq)))
    (my-filter pred (rest a-seq)))))

(defn sequence-contains? [elem a-seq]
  (cond
   (empty? a-seq)
     false
   (not (= elem (first a-seq)))
     (sequence-contains? elem (rest a-seq))
   :else
     true))

(defn my-take-while [pred a-seq]
  (cond
   (empty? a-seq)
     ()
   (pred (first a-seq))
     (cons (first a-seq) (my-take-while pred (rest a-seq)))
   :else
     ()))

(defn my-drop-while [pred a-seq]
  (cond
   (empty? a-seq)
     ()
   (pred (first a-seq))
     (my-drop-while pred (rest a-seq))
   :else
     a-seq
     ))

(defn seq= [seq-1 seq-2]
  (cond
    (and (empty? seq-1) (empty? seq-2)) true
    (= (first seq-1) (first seq-2)) (seq= (rest seq-1) (rest seq-2))
    :else false))

(defn my-map [pred seq-1 seq-2]
  (if (or (empty? seq-1) (empty? seq-2))
    ()
    (cons (pred (first seq-1) (first seq-2))
          (my-map pred (rest seq-1) (rest seq-2))
    )))

(defn power [n k]
  (cond
    (zero? n) 0
    (zero? k) 1
    :else (* n (power n (dec k)))))

(defn fib [n]
  (cond
    (zero? n) 0
    (= n 1) 1
    :else (+ (fib (- n 1)) (fib (- n 2)))))

(defn my-repeat [how-many-times what-to-repeat]
  [:-])

(defn my-range [up-to]
  [:-])

(defn tails [a-seq]
  [:-])

(defn inits [a-seq]
  [:-])

(defn rotations [a-seq]
  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])

