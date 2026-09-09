(ns zebra-puzzle)


(def red-house {:nationality "English" :color "Red"})
(def yellow-house {:nationality "??" :occupation "painter"})
(def first-house {:nationality "Norwegian"})
(def second-house {:nationality "??" :color "Blue"})
(def third-house {:nationality "??" :drinks-milk? true})

(def colour-houses [{:color "Red"}
                    {:color "Blue" :position "Second"}
                    {:color "Green"}
                    {:color "Yellow" :hobby "Painting"}
                    {:color "Ivory"}])

(def nationality-houses [{:nationality "Norwegian" :position "First"}
             {:nationality "English" :color "Red"}
             {:nationality "Ukrainian" :drink "Tea"}
             {:nationality "Japanese" :hobby "Chess"}
             {:nationality "Spanish" :pet "Dog"}])

(defn drinks-water
  "Returns who drinks water."
  []
  ;; function body
  :norwegian)

(defn owns-zebra
  "Returns who owns the zebra."
  []
  ;; function body
  :japanese)
