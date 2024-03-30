# CDK-workshop

AWS CDKでインフラ構築するためのソース(空プロジェクト)

以下のページを事前に必要な必要条件にあるSWを入れてること。

[AWS CDK Workshop](https://cdkworkshop.com/ja/)

## ソース入手

以下のコマンドで入手する。

空のリソース

```bash
git clone https://github.com/naritomo08/cdk-workshop.git
cd cdk-workshop
rm -rf .git
```

Lambda/APIGatewayリソース

本ソースは以下の文句を返すAPIになります。

Hello, CDK! You've hit /

```bash
git clone -b hello https://github.com/naritomo08/cdk-workshop.git
cd cdk-workshop
rm -rf .git
```

## Typescript

以下のコマンドで実施可能。

```bash
cd Typescript

新規プロジェクト作成(すでに作成している為必要ない。)
cdk init sample-app --language typescript

以下のファイルに各種作成したいソースコードを記載する
lib/typescript-stack.ts

CDK アプリケーションからテンプレートを合成
(AWS CloudFormation テンプレート確認)
cdk synth

環境のブートストラップ(初回構築時)
cdk bootstrap

ソースデプロイ
cdk deploy

ソースデプロイ(ホットスワップ、本番で使用しないこと。)
cdk deploy --hotswap

ソースを監視しながらの自動デプロイ実施
(cdk.jsonのexcludeから"**/*.js"を消すこと。)
cdk watch

現在の環境とのソース差分確認
cdk diff

作成したリソースの削除(別途必要に応じbootstrapしたときのStack,S3を削除すること。)
cdk destroy

動作確認(helloリソースブランチ)

curl 表示URL
"Hello, CDK! You've hit /"が返ってくること。
```

## Python

以下のコマンドで実施可能。

```bash
cd python

新規プロジェクト作成(すでに作成している為必要ない。)
cdk init sample-app --language python

以下のファイルに各種作成したいソースコードを記載する
python/python_stack.py

CDK実行Python仮想環境実行
source .venv/bin/activate

必要なPythonモジュール導入(必要に応じ)
pip install -r requirements.txt

CDK アプリケーションからテンプレートを合成
(AWS CloudFormation テンプレート確認,必要に応じ)
cdk synth

環境のブートストラップ(初回構築時)
cdk bootstrap

ソースデプロイ
cdk deploy

ソースデプロイ(ホットスワップ、本番で使用しないこと。)
cdk deploy --hotswap

ソースを監視しながらの自動デプロイ実施
cdk watch

現在の環境とのソース差分確認
cdk diff

作成したリソースの削除(別途必要に応じbootstrapしたときのStack,S3を削除すること。)
cdk destroy

動作確認(helloリソースブランチ)

curl 表示URL
"Hello, CDK! You've hit /"が返ってくること。
```

## .NET

以下のコマンドで実施可能。

```bash
cd Net

新規プロジェクト作成(すでに作成している為必要ない。)
cdk init sample-app --language csharp

以下のファイルに各種作成したいソースコードを記載する
src/Net/NetStack.cs

CDK アプリケーションからテンプレートを合成
(AWS CloudFormation テンプレート確認)
cdk synth

環境のブートストラップ(初回構築時)
cdk bootstrap

ソースデプロイ
cdk deploy

現在の環境とのソース差分確認
cdk diff

作成したリソースの削除(別途必要に応じbootstrapしたときのStack,S3を削除すること。)
cdk destroy

動作確認(helloリソースブランチ)

curl 表示URL
"Hello, CDK! You've hit /"が返ってくること。
```

## Java

以下のコマンドで実施可能。

```bash
cd Java

新規プロジェクト作成(すでに作成している為必要ない。)
cdk init sample-app --language java

以下のファイルに各種作成したいソースコードを記載する
src/main/java/com/myorg/JavaStack.java

必要に応じ、mvnコマンドを使用するためのSW導入
brew install maven

mvnパッケージ導入(必要に応じ)
mvn package

CDK アプリケーションからテンプレートを合成
(AWS CloudFormation テンプレート確認)
cdk synth

環境のブートストラップ(初回構築時)
cdk bootstrap

ソースデプロイ
cdk deploy

ソースデプロイ(ホットスワップ、本番で使用しないこと。)
cdk deploy --hotswap

ソースを監視しながらの自動デプロイ実施
cdk watch

ソースデプロイ(ホットスワップ、本番で使用しないこと。)
cdk deploy --hotswap

ソースを監視しながらの自動デプロイ実施
cdk watch

現在の環境とのソース差分確認
cdk diff

作成したリソースの削除(別途必要に応じbootstrapしたときのStack,S3を削除すること。)
cdk destroy

動作確認(helloリソースブランチ)

curl 表示URL
"Hello, CDK! You've hit /"が返ってくること。
```

## Go

以下のコマンドで実施可能。

```bash
cd gosource

新規プロジェクト作成(すでに作成している為必要ない。)
cdk init sample-app --language go

以下のファイルに各種作成したいソースコードを記載する
gosource.go

モジュール入手
go get gosource

CDK アプリケーションからテンプレートを合成
(AWS CloudFormation テンプレート確認)
cdk synth

環境のブートストラップ(初回構築時)
cdk bootstrap

ソースデプロイ
cdk deploy

ソースデプロイ(ホットスワップ、本番で使用しないこと。)
cdk deploy --hotswap

ソースを監視しながらの自動デプロイ実施
cdk watch

現在の環境とのソース差分確認
cdk diff

作成したリソースの削除(別途必要に応じbootstrapしたときのStack,S3を削除すること。)
cdk destroy

動作確認(helloリソースブランチ)

curl 表示URL
"Hello, CDK! You've hit /"が返ってくること。
```
