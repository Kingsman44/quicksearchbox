package com.google.android.libraries.assistant.soda.p1606e.p1608b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.soda.e.b.a */
/* compiled from: PG */
public final class C19301a {

    /* renamed from: a */
    private C58833ax f54030a = C58836b.f156633a;

    /* renamed from: b */
    private final Map f54031b = new ConcurrentHashMap();

    /* renamed from: a */
    public final synchronized C58833ax mo24446a() {
        return this.f54030a;
    }

    /* renamed from: b */
    public final synchronized Map mo24447b() {
        return this.f54031b;
    }

    /* renamed from: c */
    public final synchronized void mo24448c(String str) {
        this.f54030a = C58833ax.m90834k(str);
    }

    /* renamed from: d */
    public final synchronized void mo24449d(Map map) {
        this.f54031b.clear();
        this.f54031b.putAll(map);
    }
}
