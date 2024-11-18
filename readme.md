## 核心代码说明

```java
public String greeting(long timestamp) {
        long tag = timestamp % (24 * 3600000) + TimeZone.getDefault().getRawOffset();//时间戳对24小时取余后加上当前时区偏移量
        if (tag >= 6 * 3600000 && tag < 12 * 3600000) {//6-12点
            return "Good morning";
        }
        if (tag >= 12 * 3600000 && tag < 18 * 3600000) {//12-18点
            return "Good afternoon";
        }
        return "Good evening";//其他
    }
```

### 简述

1. 要求根据不同的系统时间执行不同的业务逻辑
2. 使用时间戳+当地时区偏移量，对24小时取余，可以知道当前的时间距离当日零点的时间差（毫秒），利用此数据执行业务逻辑
3. 时间戳是动态数据，编码时将时间戳做入参，以方便单元测试直接使用此方法进行测试。

