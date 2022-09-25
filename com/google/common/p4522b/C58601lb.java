package com.google.common.p4522b;

import com.google.common.base.C58815af;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.common.b.lb */
/* compiled from: PG */
class C58601lb extends C58433ew implements Serializable {
    private static final long serialVersionUID = 3;

    /* renamed from: a */
    final C58615lp f156303a;

    /* renamed from: b */
    final C58615lp f156304b;

    /* renamed from: c */
    final C58815af f156305c;

    /* renamed from: d */
    final int f156306d;

    /* renamed from: e */
    transient ConcurrentMap f156307e;

    public C58601lb(C58615lp lpVar, C58615lp lpVar2, C58815af afVar, int i, ConcurrentMap concurrentMap) {
        this.f156303a = lpVar;
        this.f156304b = lpVar2;
        this.f156305c = afVar;
        this.f156306d = i;
        this.f156307e = concurrentMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Map mo5942b() {
        return this.f156307e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ConcurrentMap mo55254c() {
        return this.f156307e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f156307e;
    }
}
