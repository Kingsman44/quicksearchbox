package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.p1646ay.C19601c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.br */
/* compiled from: PG */
public final /* synthetic */ class C114821br implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C114822bs f318589a;

    /* renamed from: b */
    public final /* synthetic */ C91097g f318590b;

    public /* synthetic */ C114821br(C114822bs bsVar, C91097g gVar) {
        this.f318589a = bsVar;
        this.f318590b = gVar;
    }

    public final void run() {
        C114822bs bsVar = this.f318589a;
        C91097g gVar = this.f318590b;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(402653184);
        gVar.mo65089a(C19601c.m37400g(intent, new ComponentName(bsVar.f318592b, "com.google.android.apps.gsa.velour.dynamichosts.VelvetDynamicHostActivity")));
    }
}
