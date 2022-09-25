package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.os.IBinder;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.d */
/* compiled from: PG */
final class C107353d implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ C107359j f298765a;

    /* renamed from: b */
    private final IBinder f298766b;

    /* renamed from: c */
    private final int f298767c;

    public C107353d(C107359j jVar, IBinder iBinder, int i) {
        this.f298765a = jVar;
        this.f298766b = iBinder;
        this.f298767c = i;
    }

    /* renamed from: a */
    public final void mo95967a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f298766b.unlinkToDeath(this, 0);
    }

    public final void binderDied() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f298767c == 2) {
            C107359j jVar = this.f298765a;
            C60856cj.m92911t(((C14096x) jVar.f298794q.mo27525b()).f42764b.mo46042d(), new C107351b(jVar), C60826bg.f164896a);
            C107359j jVar2 = this.f298765a;
            jVar2.f298787j = C58836b.f156633a;
            jVar2.mo95973b();
            this.f298765a.mo95976e();
            this.f298765a.mo95974c();
            return;
        }
        this.f298765a.mo95977f();
    }
}
