(ns roman.core)

(def dictionary
  {1  "I"
   5  "V"
   10 "X"
   50 "L"})

(defn convert [num]
  (dictionary num))
