package com.google.android.gms.appdatasearch;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.appdatasearch.y */
/* compiled from: PG */
public final class C142828y {

    /* renamed from: a */
    static final String[] f387618a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};

    /* renamed from: b */
    public static final /* synthetic */ int f387619b = 0;

    /* renamed from: c */
    private static final Map f387620c = new HashMap(10);

    static {
        for (int i = 0; i < 10; i++) {
            f387620c.put(f387618a[i], Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static int m231758a(String str) {
        Integer num = (Integer) f387620c.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("[" + str + "] is not a valid global search section name");
    }

    /* renamed from: b */
    public static String m231759b(int i) {
        if (i < 0 || i >= 10) {
            return null;
        }
        return f387618a[i];
    }
}
