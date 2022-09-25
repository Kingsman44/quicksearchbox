package com.google.common.base;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.common.base.cm */
/* compiled from: PG */
final class C58876cm {

    /* renamed from: a */
    private final Map f156713a = new HashMap();

    /* renamed from: b */
    private int f156714b = -1;

    /* renamed from: a */
    public final void mo56165a(char c, String str) {
        this.f156713a.put(Character.valueOf(c), str);
        if (c > this.f156714b) {
            this.f156714b = c;
        }
    }

    /* renamed from: b */
    public final void mo56166b() {
        char[][] cArr = new char[(this.f156714b + 1)][];
        for (Map.Entry entry : this.f156713a.entrySet()) {
            cArr[((Character) entry.getKey()).charValue()] = ((String) entry.getValue()).toCharArray();
        }
    }
}
