package com.google.android.apps.gsa.opa.p6429a.p6433c;

import com.google.common.base.C58837ba;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.opa.a.c.a */
/* compiled from: PG */
public final class C83568a {
    /* renamed from: a */
    public static Map m133100a(String str) {
        if (C58837ba.m90859h(str)) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        String[] split = str.split("#", -1);
        for (int i = 0; i < split.length - 1; i += 2) {
            hashMap.put(split[i], split[i + 1]);
        }
        return hashMap;
    }
}
