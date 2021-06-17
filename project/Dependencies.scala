import sbt._

object Dependencies {
  object Versions {
    val caseInsensitive = "1.1.4"
    val cats = "2.6.1"
    val catsEffect = "3.1.1"
    val collectionCompat = "2.4.4"
    val commonsCodec = "1.15"
    val circe = "0.14.1"
    val fs2 = "3.0.4"
    val hotswapRef = "0.2.0"
    val http4s = "0.23.0-RC1"
    val kittens = "2.3.2"
    val log4cats = "2.1.1"
    val logback = "1.2.3"
    val scala212 = "2.12.14"
    val scala213 = "2.13.6"

    val catsTestkitScalatest = "2.1.5"
    val disciplineScalatest = "2.1.5"
    val discipline = "1.1.5"
    val scalaCheck = "1.15.4"
    val scalaCheckShapeless = "1.3.0"
    val scalaTest = "3.2.9"
  }

  lazy val caseInsensitive = "org.typelevel"           %% "case-insensitive"        % Versions.caseInsensitive
  lazy val cats = "org.typelevel"                      %% "cats-core"               % Versions.cats
  lazy val catsEffectKernel = "org.typelevel"          %% "cats-effect-kernel"      % Versions.catsEffect
  lazy val catsEffectStd = "org.typelevel"             %% "cats-effect-std"         % Versions.catsEffect
  lazy val catsEffect = "org.typelevel"                %% "cats-effect"             % Versions.catsEffect
  lazy val commonsCodec = "commons-codec"               % "commons-codec"           % Versions.commonsCodec
  lazy val collectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % Versions.collectionCompat
  lazy val circeGeneric = "io.circe"                   %% "circe-generic-extras"    % Versions.circe
  lazy val fs2 = "co.fs2"                              %% "fs2-core"                % Versions.fs2
  lazy val fs2Io = "co.fs2"                            %% "fs2-io"                  % Versions.fs2
  lazy val hotswapRef = "io.janstenpickle"             %% "hotswap-ref"             % Versions.hotswapRef
  lazy val http4sBlazeClient = "org.http4s"            %% "http4s-blaze-client"     % Versions.http4s
  lazy val http4sClient = "org.http4s"                 %% "http4s-client"           % Versions.http4s
  lazy val http4sCirce = "org.http4s"                  %% "http4s-circe"            % Versions.http4s
  lazy val kittens = "org.typelevel"                   %% "kittens"                 % Versions.kittens
  lazy val log4cats = "org.typelevel"                  %% "log4cats-slf4j"          % Versions.log4cats
  lazy val logback = "ch.qos.logback"                   % "logback-classic"         % Versions.logback

  lazy val catsLaws = "org.typelevel"             %% "cats-laws"              % Versions.cats
  lazy val catsEffectLaws = "org.typelevel"       %% "cats-effect-laws"       % Versions.catsEffect
  lazy val catsEffectTestkit = "org.typelevel"    %% "cats-effect-testkit"    % Versions.catsEffect
  lazy val catsTestkitScalatest = "org.typelevel" %% "cats-testkit-scalatest" % Versions.catsTestkitScalatest
  lazy val disciplineScalatest = "org.typelevel"  %% "discipline-scalatest"   % Versions.disciplineScalatest
  lazy val disciplineCore = "org.typelevel"       %% "discipline-core"        % Versions.discipline
  lazy val scalacheck = "org.scalacheck"          %% "scalacheck"             % Versions.scalaCheck
  lazy val scalacheckShapeless =
    "com.github.alexarchambault"       %% "scalacheck-shapeless_1.15" % Versions.scalaCheckShapeless
  lazy val scalaTest = "org.scalatest" %% "scalatest"                 % Versions.scalaTest

  lazy val test =
    Seq(
      catsLaws,
      catsEffectLaws,
      catsEffectTestkit,
      catsTestkitScalatest,
      disciplineScalatest,
      disciplineCore,
      scalacheck,
      scalacheckShapeless,
      scalaTest
    )
}
