package com.facebook.litho;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.litho.cf */
/* compiled from: PG */
public final class C6158cf {

    /* renamed from: a */
    private Map f18204a;

    /* renamed from: b */
    private Map f18205b;

    /* renamed from: a */
    public final synchronized void mo13141a() {
        Map map = this.f18204a;
        if (map != null) {
            map.clear();
        }
        Map map2 = this.f18205b;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* renamed from: b */
    public final void mo13142b(C6157ce ceVar) {
        synchronized (this) {
            if (this.f18204a == null) {
                this.f18204a = new HashMap();
            }
            if (this.f18205b == null) {
                this.f18205b = new HashMap();
            }
            this.f18204a.put(ceVar.f18203a, ceVar);
        }
    }
}
