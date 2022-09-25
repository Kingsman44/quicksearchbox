package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.social.peoplekit.common.dataservice.populous.b */
/* compiled from: PG */
public final class C42108b {

    /* renamed from: a */
    private static final Map f110124a;

    /* renamed from: b */
    private static final Map f110125b;

    /* renamed from: c */
    private static final Map f110126c;

    static {
        HashMap hashMap = new HashMap();
        f110124a = hashMap;
        hashMap.put(1, 0);
        hashMap.put(5, 1);
        HashMap hashMap2 = new HashMap();
        f110125b = hashMap2;
        hashMap2.put(2, 0);
        hashMap2.put(4, 1);
        HashMap hashMap3 = new HashMap();
        f110126c = hashMap3;
        hashMap3.put(3, 0);
    }

    /* renamed from: a */
    public static Map m73898a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return f110126c;
                }
                if (i != 4) {
                    if (i != 5) {
                        return new HashMap();
                    }
                }
            }
            return f110125b;
        }
        return f110124a;
    }
}
