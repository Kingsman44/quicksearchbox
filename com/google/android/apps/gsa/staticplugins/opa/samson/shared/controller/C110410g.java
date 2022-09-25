package com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.OpaAmbientUiStatus;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110397a;
import com.google.common.base.C58833ax;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.g */
/* compiled from: PG */
public final class C110410g {

    /* renamed from: a */
    private final C69464a f307740a;

    /* renamed from: b */
    private final C69464a f307741b;

    /* renamed from: c */
    private final C69464a f307742c;

    /* renamed from: d */
    private final C69464a f307743d;

    public C110410g(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4) {
        aVar.getClass();
        this.f307740a = aVar;
        aVar2.getClass();
        this.f307741b = aVar2;
        this.f307742c = aVar3;
        aVar4.getClass();
        this.f307743d = aVar4;
    }

    /* renamed from: a */
    public final ActivityWakeDismissController mo98647a(Runnable runnable, boolean z) {
        runnable.getClass();
        Context context = (Context) this.f307740a.mo17428b();
        context.getClass();
        C58833ax axVar = (C58833ax) this.f307741b.mo17428b();
        axVar.getClass();
        C110397a aVar = (C110397a) this.f307742c.mo17428b();
        aVar.getClass();
        OpaAmbientUiStatus opaAmbientUiStatus = (OpaAmbientUiStatus) this.f307743d.mo17428b();
        opaAmbientUiStatus.getClass();
        return new ActivityWakeDismissController(runnable, z, context, axVar, aVar, opaAmbientUiStatus);
    }
}
