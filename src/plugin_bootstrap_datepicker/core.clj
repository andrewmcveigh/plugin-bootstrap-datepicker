(ns plugin-bootstrap-datepicker.core
  (:require
    [plugin-bootstrap.core :as bootstrap]))

(def css
  [:link {:rel "stylesheet"
          :href "/plugins/bootstrap-datepicker/css/datepicker.css"}])

(def js
  [:script {:src "/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js"}])
