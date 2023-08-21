(ns tri-fusion.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(+ 1 1)

(count [1, 2, 3])

(defn tri-fusion [list]

  )

(tri-fusion [3, 2, 1])


(defn split [list]
  (let [length (count list)
        len-first-part (int (Math/ceil (/ length 2)))
        first-part (vec (take len-first-part list))
        second-part (vec (drop len-first-part list))]
    [first-part second-part]
    )
  )

; [3, 2, 1] => [[3, 2], [1]]
; 2 = 3//2 + 1


; (take 2 [3, 2, 1])
; (drop 2 [3, 2, 1])

; (split [3, 2, 1])
; (split [1, 2, 3, 4, 5])
; (split [1, 2, 3, 4, 5, 6])

; (quot (count [1, 2, 3, 4, 5]) 2)
; (math/round)

; (int (Math/ceil (/ 3 2)))

(vec (map split (split [1, 2, 3, 4, 5, 6])))

(vec (map split (split [3, 2, 1, 5, 4, 6])))

; number of splits to do = ? 
; n-of-splits(len) = 

; len = 3 => 1 split
; len = 5 => 2 splits (len-first-part = 3>2 => +1 split

; calc(len)
; if > 2 => do again and increment counter
; if <= 2 => last split => counter + 1

(defn calc [len]
  (int (Math/ceil (/ len 2))))

(calc 7)

(defn n-of-splits
  ; init
  ([len]
    (if (or (= len 0) (= len 1) (= len 2))
      0 ; no split needed
      (n-of-splits len 0)))
  ; recursive
  ([len counter]
    (if (<= (calc len) 2)
      (inc counter)
      (n-of-splits (calc len) (inc counter))
      )))


(n-of-splits 1)
(n-of-splits 2)
(n-of-splits 3)
(n-of-splits 4)
(n-of-splits 5)
(n-of-splits 10)
(n-of-splits 17)
(n-of-splits 100)


