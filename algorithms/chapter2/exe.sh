#!/bin/bash

# 標準出力ログ
# @param $1 開始する処理の内容
function printStartLog() {
    echo "/_/_/_/_/_/_/_/_/_/_ $1 kotlin sources... /_/_/_/_/_/_/_/_/_/_"
}

# 生成先ディレクトリの存在チェック、なければ生成
if [ ! -e dest ]; then
    echo "/_/_/_/_/_/_/_/_/_/_ make directory 'dest'... /_/_/_/_/_/_/_/_/_/_"
    mkdir dest
fi

# 関係するKotlinファイルをすべてコンパイル
printStartLog compile
kotlinc -d dest *.kt

if [ $? == 0 ]; then
    ls -alR dest
fi

# destディレクトリの、メインメソッドを実行（クラス名は引数で指定）
printStartLog execute
kotlin -cp dest $1