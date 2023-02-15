(ns zengram.utils)

(defn content-map?
  "Used throughout the multi-methods in order to check if content is a map or not."
  [_ content & _]
  (map? content))