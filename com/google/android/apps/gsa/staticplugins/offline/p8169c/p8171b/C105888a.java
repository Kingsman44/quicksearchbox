package com.google.android.apps.gsa.staticplugins.offline.p8169c.p8171b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.c.b.a */
/* compiled from: PG */
class C105888a implements C105890c {

    /* renamed from: a */
    private final Map f295535a = new HashMap();

    protected C105888a() {
    }

    /* renamed from: a */
    public final List mo95143a(Object obj) {
        return (List) this.f295535a.get(obj);
    }

    /* renamed from: b */
    public final void mo95144b(Object obj, Object obj2) {
        List list = (List) this.f295535a.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f295535a.put(obj, list);
        }
        list.add(obj2);
    }
}
