package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.libraries.p1730f.C21370a;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.a */
/* compiled from: PG */
public final class C111792a {

    /* renamed from: a */
    public final Map f310696a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Map f310697b = new ConcurrentHashMap();

    /* renamed from: c */
    private final C21370a f310698c;

    public C111792a(C21370a aVar) {
        this.f310698c = aVar;
    }

    /* renamed from: a */
    public final void mo99235a(long j, String str) {
        this.f310697b.put(Long.valueOf(j), str);
    }

    /* renamed from: b */
    public final void mo99236b(long j) {
        this.f310696a.put(Long.valueOf(j), Long.valueOf(this.f310698c.mo26870b()));
    }
}
