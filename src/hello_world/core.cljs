(ns hello-world.core
  (:require [goog.dom :as gdom]
            [reagent.core :as r]
            [reagent.dom :as dom]))

(defonce app-state
  (r/atom {:animals ["dog" "cat" "bird"]}))

(defn hello [state]
  (let [{:keys [animals]} @state]
    [:div
      {:style {:font-size "1em"}}
      "Hello, Shayan's friend!"
      (into [:ul] (map #(vector :li %)) animals)]))

(dom/render [hello app-state] (gdom/getElement "app"))
