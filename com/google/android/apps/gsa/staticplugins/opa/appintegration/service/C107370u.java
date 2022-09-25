package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.os.IBinder;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.u */
/* compiled from: PG */
public final /* synthetic */ class C107370u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C107371v f298826a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f298827b;

    public /* synthetic */ C107370u(C107371v vVar, IBinder iBinder) {
        this.f298826a = vVar;
        this.f298827b = iBinder;
    }

    public final void run() {
        C107371v vVar = this.f298826a;
        IBinder iBinder = this.f298827b;
        vVar.f298828a.f298835g.mo95994b();
        C107367r rVar = vVar.f298828a.f298833e;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (rVar.f298817c) {
            rVar.f298821g = Optional.m71637of(iBinder);
        }
        rVar.mo95986a();
    }
}
