package com.google.android.libraries.storage.protostore;

import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60845bz;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.storage.protostore.q */
/* compiled from: PG */
final class C43014q implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ AtomicBoolean f112478a;

    /* renamed from: b */
    final /* synthetic */ Set f112479b;

    /* renamed from: c */
    final /* synthetic */ C58872ci f112480c;

    /* renamed from: d */
    final /* synthetic */ C43017t f112481d;

    /* renamed from: e */
    final /* synthetic */ Integer f112482e;

    /* renamed from: f */
    final /* synthetic */ C43018u f112483f;

    public C43014q(C43018u uVar, AtomicBoolean atomicBoolean, Set set, C58872ci ciVar, C43017t tVar, Integer num) {
        this.f112483f = uVar;
        this.f112478a = atomicBoolean;
        this.f112479b = set;
        this.f112480c = ciVar;
        this.f112481d = tVar;
        this.f112482e = num;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        if (this.f112478a.get()) {
            this.f112479b.size();
            this.f112480c.mo56158a(C43018u.f112495a);
            return;
        }
        this.f112479b.size();
        C43017t tVar = this.f112481d;
        synchronized (tVar.f112494c) {
            C58528ij.m90006F(tVar.f112493b);
        }
        C43018u.f112495a.convert((long) this.f112482e.intValue(), this.f112483f.f112499e);
    }
}
