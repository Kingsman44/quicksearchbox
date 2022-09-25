package com.p232a.p233a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.a.a.cg */
/* compiled from: PG */
final class C4752cg {

    /* renamed from: a */
    private static final Map f14928a;

    static {
        HashMap hashMap = new HashMap(13);
        f14928a = hashMap;
        hashMap.put("normal", 400);
        hashMap.put("bold", 700);
        hashMap.put("bolder", 1);
        hashMap.put("lighter", -1);
        hashMap.put("100", 100);
        hashMap.put("200", 200);
        hashMap.put("300", 300);
        hashMap.put("400", 400);
        hashMap.put("500", 500);
        hashMap.put("600", 600);
        hashMap.put("700", 700);
        hashMap.put("800", 800);
        hashMap.put("900", 900);
    }

    /* renamed from: a */
    public static Integer m13205a(String str) {
        return (Integer) f14928a.get(str);
    }
}
