# Singletonパターン
クラスについて、生成されるインスタンスを一つに制限するパターン。  
あるクラスに関するインスタンスが一つしかないことを保証する。  
`Main.kt`からも明らかなように、メソッド経由で取得したインスタンスは同一であるので、  
ポインタの指し示すオブジェクトは同一になる。

## コンパイルの注意
Javaで書かれた`Singleton.java`を先に`javac`でコンパイルしておく。  
`Main.kt`はそのままではコンパイルできないので、
```
$ kotlinc -d classes/ -cp classes/ Main.kt
```
依存するクラスファイルをクラスパスのオプションで指定すること。