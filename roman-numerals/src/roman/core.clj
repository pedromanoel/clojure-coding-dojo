(ns roman.core)

(def dictionary
  {1  "I"
   5  "V"
   10 "X"
   50 "L"
   3  "III"})

(defn convert [num]
  (dictionary num))
