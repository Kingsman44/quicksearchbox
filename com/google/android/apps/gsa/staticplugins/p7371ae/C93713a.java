package com.google.android.apps.gsa.staticplugins.p7371ae;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.a */
/* compiled from: PG */
final class C93713a {

    /* renamed from: a */
    public final long f261529a;

    /* renamed from: b */
    private C93742ba f261530b;

    /* renamed from: c */
    private final Queue f261531c = new ArrayDeque();

    /* renamed from: d */
    private boolean f261532d;

    public C93713a(long j) {
        this.f261529a = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C93742ba mo88152a() {
        return this.f261530b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C93742ba mo88153b() {
        return (C93742ba) this.f261531c.poll();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo88154c(C93742ba baVar) {
        this.f261531c.add(baVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo88155d() {
        this.f261532d = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo88156e(C93742ba baVar) {
        this.f261530b = baVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized boolean mo88157f() {
        if (this.f261532d) {
            return false;
        }
        this.f261532d = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo88158g() {
    }
}
