# SaveMoneyValue

```java
public class GblFunction {

    /*
    good formoney
    12345678 = 12.345.678
    */
    public static String saparator(String value) {
        if (value == null || value.equals("") || value.equals("0") || value.equals("0.0")) {
            return "0";
        }
        if (value.contains(",")){
            value = value.substring(0, value.indexOf(","));
        }
        value = idrComma(value);
        return value.substring(0, value.indexOf(","));
    }

    /*
    good formoney
    12345678 = 12.345.678,00
    */
    public static String idrComma(String value) {
        if (value == null || value.equals("") || value.equals("0") || value.equals("0.0")) {
            return "0";
        } else {
            if (value.contains(",")){
                value = value.substring(0, value.indexOf(","));
            }
            Locale localeID = new Locale("in", "ID");
            NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
            return formatRupiah.format(Double.valueOf(value)).replace("Rp", "");
        }
    }

    /*
    good formoney
    12345678 = Rp 12.345.678
    */
    public static String idr(String value) {
        return "Rp " + idrComma(value).replace(",00","");
    }
}
```

```java
int sum = 12345678;

Log.d(TAG, "onCreate: "+saparator(String.valueOf(sum)));    // 12345678  = 12.345.678
Log.d(TAG, "onCreate: "+idrComma(String.valueOf(sum)));     // 12345678  = 12.345.678,00
Log.d(TAG, "onCreate: "+idr(String.valueOf(sum)));          // 12345678  = Rp 12.345.678
```

---

```
Copyright 2021 M. Fadli Zein
```