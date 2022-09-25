package com.google.android.libraries.web.p3416i.p3417a;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.web.i.a.c */
/* compiled from: PG */
public final class C43810c {

    /* renamed from: a */
    public final Map f114230a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo46830a(String str) {
        if (this.f114230a.containsKey("X-Silk-Capabilities")) {
            ((String) this.f114230a.get("X-Silk-Capabilities")).equals(str);
        }
        this.f114230a.put("X-Silk-Capabilities", str);
    }
}
