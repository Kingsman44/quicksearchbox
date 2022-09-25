package com.google.android.libraries.home.p1940a.p1943c.p1944a;

import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5463a.C69505av;

/* renamed from: com.google.android.libraries.home.a.c.a.w */
/* compiled from: PG */
public enum C23394w {
    NONE("NONE"),
    OAUTH("OAUTH"),
    N_LINK("NEST_AUTH_PROXY"),
    THIRD_PARTY("THIRD_PARTY"),
    WWN("OPEN_AUTH"),
    UNKNOWN("UNKNOWN");
    

    /* renamed from: a */
    public static final Map f63949a = null;

    /* renamed from: h */
    public final String f63957h;

    static {
        int i;
        int b = C69505av.m100860b(r1);
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (C23394w wVar : values()) {
            linkedHashMap.put(wVar.f63957h, wVar);
        }
        f63949a = linkedHashMap;
    }

    private C23394w(String str) {
        this.f63957h = str;
    }
}
