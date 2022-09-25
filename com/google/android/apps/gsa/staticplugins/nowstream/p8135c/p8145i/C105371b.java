package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i;

import com.google.common.p4552o.p4566l.C60220t;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.i.b */
/* compiled from: PG */
public final class C105371b {

    /* renamed from: a */
    private final Map f293979a = new HashMap();

    /* renamed from: b */
    private int f293980b = 0;

    /* renamed from: a */
    public final int mo94772a(C60220t tVar) {
        if (!this.f293979a.containsKey(tVar)) {
            Map map = this.f293979a;
            int i = this.f293980b;
            this.f293980b = i + 1;
            map.put(tVar, Integer.valueOf(i));
        }
        return ((Integer) this.f293979a.get(tVar)).intValue();
    }
}
