package com.google.android.libraries.web.lifecycle.internal;

import com.google.android.libraries.web.lifecycle.C43878b;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.lifecycle.internal.i */
/* compiled from: PG */
public final class C43901i {

    /* renamed from: a */
    public final C43878b f114363a;

    /* renamed from: b */
    public final Map f114364b = new LinkedHashMap();

    public C43901i(C43878b bVar) {
        C69664n.m101061g(bVar, "manager");
        this.f114363a = bVar;
        bVar.mo46770d(new C43898f(this));
    }

    /* renamed from: a */
    public final C43900h mo46907a(Class cls) {
        return (C43900h) this.f114364b.get(cls);
    }
}
