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
  (cond
   (empty? a-seq)
     nil
   (empty? (rest a-seq))
     (first a-seq)
   :else
     (max (first a-seq) (max-element (rest a-seq)))))

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
    (not (= (first seq-1) (first seq-2))) false
    (or (empty? seq-1) (empty? seq-2)) false
    :else (seq= (rest seq-1) (rest seq-2))))

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
  (if (>= 0 how-many-times)
    ()
    (cons what-to-repeat (my-repeat (dec how-many-times) what-to-repeat))))

(defn my-range [up-to]
  (if (zero? up-to)
    ()
    (cons (dec up-to) (my-range (dec up-to)))))

(defn tails [a-seq]
  (if (zero? (count a-seq))
    '(())
    (cons (seq a-seq) (tails (rest a-seq)))))

(defn inits [a-seq]
  (let [a-seq (reverse a-seq)]
  (if (empty? a-seq)
    '(())
    (cons (sort (seq a-seq)) (inits (reverse (rest a-seq)))))))

(defn rotations [a-seq]
  (if (empty? a-seq)
    '(())
    (cons (seq a-seq) (rest (reverse (rest (map concat (tails a-seq) (reverse (inits a-seq)))))))))

(defn frequencies-helper [freqs a-seq]
  (if (empty? a-seq)
    freqs
    (let [freqs-2 (assoc freqs
                        (first a-seq)
                        (inc (get freqs (first a-seq) 0)))]
      (frequencies-helper freqs-2 (rest a-seq)))))

(defn my-frequencies [a-seq]
  (frequencies-helper {} a-seq))

(defn un-frequencies [a-map]
  (if (empty? a-map)
    ()
    (concat (repeat (last (first a-map)) (first (first a-map))) (un-frequencies (rest a-map)))))

(defn my-take [n coll]
  (if (or (zero? n) (empty? coll))
    ()
    (cons (first coll) (my-take (dec n) (rest coll)))))

(defn my-drop [n coll]
  (if (zero? n)
    coll
    (my-drop (dec n) (rest coll))))

(defn halve [a-seq]
  (let [n (count a-seq)
        half-n (int (/ n 2))]
    (if (zero? n)
      ()
      (cons (my-take half-n a-seq) (cons (my-drop half-n a-seq) ())))))

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

