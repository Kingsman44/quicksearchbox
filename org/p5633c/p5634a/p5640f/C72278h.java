package org.p5633c.p5634a.p5640f;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.p5633c.p5634a.C72285i;

/* renamed from: org.c.a.f.h */
/* compiled from: PG */
public final class C72278h {

    /* renamed from: a */
    private final HashMap f192379a = m106751c();

    /* renamed from: b */
    private final HashMap f192380b = m106751c();

    /* renamed from: c */
    private static final HashMap m106751c() {
        return new HashMap(7);
    }

    /* renamed from: a */
    public final synchronized String[] mo63659a(Locale locale, String str, String str2) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null) {
            return null;
        }
        Map map = (Map) this.f192379a.get(locale);
        if (map == null) {
            HashMap hashMap = this.f192379a;
            HashMap c = m106751c();
            hashMap.put(locale, c);
            map = c;
        }
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = m106751c();
            map.put(str, map2);
            String[][] zoneStrings = C72285i.m106774b(Locale.ENGLISH).getZoneStrings();
            int length = zoneStrings.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    strArr = null;
                    break;
                }
                strArr = zoneStrings[i];
                if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                    break;
                }
                i++;
            }
            String[][] zoneStrings2 = C72285i.m106774b(locale).getZoneStrings();
            int length2 = zoneStrings2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    String[] strArr3 = zoneStrings2[i2];
                    if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (!(strArr == null || strArr2 == null)) {
                map2.put(strArr[2], new String[]{strArr2[2], strArr2[1]});
                if (strArr[2].equals(strArr[4])) {
                    map2.put(String.valueOf(strArr[4]).concat("-Summer"), new String[]{strArr2[4], strArr2[3]});
                } else {
                    map2.put(strArr[4], new String[]{strArr2[4], strArr2[3]});
                }
            }
        }
        return (String[]) map2.get(str2);
    }

    /* renamed from: b */
    public final synchronized String[] mo63660b(Locale locale, String str, boolean z) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null) {
            return null;
        }
        Map map = (Map) this.f192380b.get(locale);
        if (map == null) {
            HashMap hashMap = this.f192380b;
            HashMap c = m106751c();
            hashMap.put(locale, c);
            map = c;
        }
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = m106751c();
            map.put(str, map2);
            String[][] zoneStrings = C72285i.m106774b(Locale.ENGLISH).getZoneStrings();
            int length = zoneStrings.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    strArr = null;
                    break;
                }
                strArr = zoneStrings[i];
                if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                    break;
                }
                i++;
            }
            String[][] zoneStrings2 = C72285i.m106774b(locale).getZoneStrings();
            int length2 = zoneStrings2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    String[] strArr3 = zoneStrings2[i2];
                    if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (!(strArr == null || strArr2 == null)) {
                map2.put(Boolean.TRUE, new String[]{strArr2[2], strArr2[1]});
                map2.put(Boolean.FALSE, new String[]{strArr2[4], strArr2[3]});
            }
        }
        return (String[]) map2.get(Boolean.valueOf(z));
    }
}
