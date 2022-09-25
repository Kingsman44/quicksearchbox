package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58832aw;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.dx */
/* compiled from: PG */
public final /* synthetic */ class C114058dx implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114059dy f315761a;

    /* renamed from: b */
    public final /* synthetic */ String f315762b;

    /* renamed from: c */
    public final /* synthetic */ long f315763c;

    public /* synthetic */ C114058dx(C114059dy dyVar, String str, long j) {
        this.f315761a = dyVar;
        this.f315762b = str;
        this.f315763c = j;
    }

    public final void run() {
        String str;
        C114059dy dyVar = this.f315761a;
        String str2 = this.f315762b;
        long j = this.f315763c;
        C114071eg egVar = dyVar.f315764a;
        C108303dt dtVar = egVar.f315819aC;
        if (dtVar != null) {
            dtVar.f301288s = true;
            int b = dtVar.mo96741b() - 1;
            for (int i = 0; i < b; i++) {
                C108303dt dtVar2 = egVar.f315819aC;
                dtVar2.getClass();
                C108232bc e = dtVar2.mo96743e(i);
                if (e instanceof C108451je) {
                    C108451je jeVar = (C108451je) e;
                    if (C58832aw.m90831a(jeVar.mo96890c(), str2) && jeVar.f301035q <= j && (str = e.f301037s) != null) {
                        egVar.f315858ap.mo96722a(str);
                    }
                }
            }
        }
    }
}
