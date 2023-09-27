**zyFishingrod**

**赵阳的钓鱼竿项目**

```
一、启动页广告页
二、更新app模块儿
三、网络请求模块
四、基础类
五、工具类

该项目本着即插即用的态度！
```

方式一：gradle
Step 1.Add it in your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Step 2. Add the dependency

```
dependencies {

        implementation 'com.github.cuilingling.zyFishingrod:base:v1.0.6-alpha'
        implementation 'com.github.cuilingling.zyFishingrod:net:v1.0.6-alpha'
        
        }


