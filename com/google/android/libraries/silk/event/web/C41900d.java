package com.google.android.libraries.silk.event.web;

import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.silk.event.web.d */
/* compiled from: PG */
public final class C41900d implements C44107h {

    /* renamed from: a */
    public static final C59071e f109302a = C59071e.m91332i("com.google.android.libraries.silk.event.web.d");

    /* renamed from: b */
    public final Map f109303b = new HashMap();

    /* renamed from: c */
    private final Map f109304c = new HashMap();

    /* renamed from: a */
    public final void mo44356a() {
        this.f109303b.clear();
        mo44358c();
    }

    /* renamed from: b */
    public final Set mo44357b(Class cls) {
        if (!this.f109304c.containsKey(cls)) {
            this.f109304c.put(cls, new HashSet());
        }
        return (Set) this.f109304c.get(cls);
    }

    /* renamed from: c */
    public final void mo44358c() {
        this.f109304c.clear();
    }
}
