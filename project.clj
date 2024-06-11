(defproject gdxgame "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.badlogicgames.gdx/gdx "1.12.1"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl "1.12.1"]
                 [com.badlogicgames.gdx/gdx-box2d "1.12.1"]
                 [com.badlogicgames.gdx/gdx-box2d-platform "1.12.1" :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-bullet "1.12.1"]
                 [com.badlogicgames.gdx/gdx-bullet-platform "1.12.1" :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-platform "1.12.1" :classifier "natives-desktop"]
                ]
  :source-paths ["src" "src-common"]
  :javac-options ["-target" "-1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [gdxgame.core.desktop-launcher]
  :main gdxgame.core.desktop-launcher
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
