(ns gdxgame.core.desktop-launcher
  (:require [gdxgame.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main []
  (LwjglApplication. (gdxgame.core.Game.) "demo" 800 600)
  (Keyboard/enableRepeatEvents true))
