package com.google.frameworks.client.data.android.p4643j;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.frameworks.client.data.android.C61372an;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.C70846h;

/* renamed from: com.google.frameworks.client.data.android.j.d */
/* compiled from: PG */
public final class C61516d implements C61513a {

    /* renamed from: b */
    public static final C70846h f166297b = new C70846h("com.google.frameworks.client.data.android.metrics.MutableMetricsContext", (Object) null);

    /* renamed from: c */
    public final C61372an f166298c;

    /* renamed from: d */
    public final AtomicBoolean f166299d = new AtomicBoolean(false);

    /* renamed from: e */
    public final AtomicBoolean f166300e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicInteger f166301f = new AtomicInteger(0);

    /* renamed from: g */
    public final AtomicInteger f166302g = new AtomicInteger(0);

    /* renamed from: h */
    public final AtomicInteger f166303h = new AtomicInteger(0);

    /* renamed from: i */
    public final AtomicInteger f166304i = new AtomicInteger(-1);

    /* renamed from: j */
    public final ConcurrentLinkedQueue f166305j = new ConcurrentLinkedQueue();

    /* renamed from: k */
    public final ConcurrentLinkedQueue f166306k = new ConcurrentLinkedQueue();

    /* renamed from: l */
    public final AtomicLong f166307l = new AtomicLong(-1);

    /* renamed from: m */
    public final AtomicReference f166308m = new AtomicReference((Object) null);

    public C61516d(C61372an anVar) {
        this.f166298c = anVar;
    }

    /* renamed from: a */
    public final int mo58099a() {
        return this.f166304i.get();
    }

    /* renamed from: b */
    public final C58485gu mo58100b() {
        return C58485gu.m89842j(this.f166305j);
    }

    /* renamed from: c */
    public final C58485gu mo58101c() {
        return C58485gu.m89842j(this.f166306k);
    }

    /* renamed from: d */
    public final void mo58102d() {
        C58838bb.m90884s(!this.f166300e.getAndSet(true), "Already recorded cache lookup.");
    }
}
