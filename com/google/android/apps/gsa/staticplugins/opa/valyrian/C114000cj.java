package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108297dn;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.cj */
/* compiled from: PG */
final class C114000cj implements C108297dn {

    /* renamed from: a */
    final /* synthetic */ C108303dt f315640a;

    /* renamed from: b */
    final /* synthetic */ C114071eg f315641b;

    public C114000cj(C114071eg egVar, C108303dt dtVar) {
        this.f315641b = egVar;
        this.f315640a = dtVar;
    }

    /* renamed from: a */
    public final void mo96728a(int i) {
        C108232bc e = this.f315640a.mo96743e(i);
        if (e instanceof C108451je) {
            C108451je jeVar = (C108451je) e;
            String c = jeVar.mo96890c();
            if (!this.f315641b.f315841aY.containsKey(c) || jeVar.f301035q > ((Long) this.f315641b.f315841aY.get(c)).longValue()) {
                this.f315641b.mo101008bl(e);
                if (this.f315641b.f315840aX.size() >= 50) {
                    this.f315641b.mo101015cE();
                    return;
                }
                return;
            }
            String str = e.f301037s;
            if (str != null) {
                this.f315641b.f315858ap.mo96722a(str);
            }
        } else if ((e instanceof C108212aj) && ((C108212aj) e).f300977c == 4 && !this.f315641b.f315891ba.mo56113h()) {
            this.f315641b.f315891ba = C58833ax.m90834k(e);
        }
    }

    /* renamed from: b */
    public final void mo96729b() {
    }
}
