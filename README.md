# zyFishingrod
赵阳的钓鱼竿项目
    一、启动页广告页
    二、更新app模块儿
    三、网络请求模块
    四、基础类
    五、工具类
    本着即插即用的态度！



方式一：gradle
Step 1.Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.cuilingling:zyFishingrod:1.0.1'
	}


方式二 ：maven
Step 1. Add the JitPack repository to your build file

	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

Step 2. Add the dependency

	<dependency>
	    <groupId>com.github.cuilingling</groupId>
	    <artifactId>zyFishingrod</artifactId>
	    <version>1.0.1</version>
	</dependency>