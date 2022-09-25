package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108273cq;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108298do;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108302ds;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ay */
/* compiled from: PG */
public final /* synthetic */ class C113950ay implements C108298do {

    /* renamed from: a */
    public final /* synthetic */ C114071eg f315575a;

    public /* synthetic */ C113950ay(C114071eg egVar) {
        this.f315575a = egVar;
    }

    /* renamed from: a */
    public final void mo96730a(C108302ds dsVar) {
        C114071eg egVar = this.f315575a;
        egVar.f315840aX.clear();
        C108303dt dtVar = egVar.f315819aC;
        dtVar.getClass();
        int min = Math.min(50, dtVar.mo96741b() - 1);
        boolean z = false;
        for (int i = 0; i < min; i++) {
            C108303dt dtVar2 = egVar.f315819aC;
            dtVar2.getClass();
            C108232bc e = dtVar2.mo96743e(i);
            if (e instanceof C108451je) {
                egVar.mo101008bl(e);
            } else if ((e instanceof C108212aj) && ((C108212aj) e).f300977c == 4 && !egVar.f315891ba.mo56113h()) {
                egVar.f315891ba = C58833ax.m90834k(e);
            } else if (e instanceof C108273cq) {
                z = true;
            }
        }
        if (!z) {
            egVar.mo101015cE();
        }
        if (!egVar.f315842aZ) {
            egVar.f315815Y.mo28208h("onDrlHistoryDelayedShow", 500, new C114046dl(egVar));
        }
    }
}
