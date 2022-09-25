package com.google.common.p4525e;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.common.e.f */
/* compiled from: PG */
public final class C58958f {

    /* renamed from: a */
    private final Map f156817a = new HashMap();

    /* renamed from: b */
    private int f156818b = -1;

    /* renamed from: a */
    public final C58959g mo56220a() {
        char[][] cArr = new char[(this.f156818b + 1)][];
        for (Map.Entry entry : this.f156817a.entrySet()) {
            cArr[((Character) entry.getKey()).charValue()] = ((String) entry.getValue()).toCharArray();
        }
        return new C58957e(cArr);
    }

    /* renamed from: b */
    public final void mo56221b(char c, String str) {
        this.f156817a.put(Character.valueOf(c), str);
        if (c > this.f156818b) {
            this.f156818b = c;
        }
    }
}
