# CDK-workshop

AWS CDKでインフラ構築するためのソース(空プロジェクト)

以下のページを事前に必要な必要条件にあるSWを入れてること。

[AWS CDK Workshop](https://cdkworkshop.com/ja/)

## ソース入手

以下のコマンドで入手する。

```bash
git clone https://github.com/naritomo08/cdk-workshop.git
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
lib/cdk-workshop-stack.ts

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

現在の環境とのソース差分確認
cdk diff

作成したリソースの削除(別途必要に応じbootstrapしたときのStack,S3を削除すること。)
cdk destroy
```

## .NET

以下のコマンドで実施可能。

```bash
cd NET

新規プロジェクト作成(すでに作成している為必要ない。)
cdk init sample-app --language csharp

以下のファイルに各種作成したいソースコードを記載する
src/CdkWorkshop/CdkWorkshopStack.cs

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
```

## Java

以下のコマンドで実施可能。

```bash
cd Java

新規プロジェクト作成(すでに作成している為必要ない。)
cdk init sample-app --language java

以下のファイルに各種作成したいソースコードを記載する
src/main/java/com/myorg/CdkWorkshopStack.java

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
```

## Go

以下のコマンドで実施可能。

```bash
cd Go

新規プロジェクト作成(すでに作成している為必要ない。)
cdk init sample-app --language go

以下のファイルに各種作成したいソースコードを記載する
cdk-workshop.go

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
```