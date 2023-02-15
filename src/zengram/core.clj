(ns zengram.core
  (:require [zen.core :as zen]))

(def ztx (zen/new-context))
(zen/read-ns ztx 'zengram)
(zen/validate ztx #{'zengram.api.edit/edit-message-text} {:text "1" :inline_message_id "id"
                                                              :parse_mode "HTML"})