package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.accounts.Account;
import com.google.android.gms.reminders.C145773b;
import com.google.android.gms.reminders.C145778g;
import com.google.android.libraries.p3339v.C43205e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.b */
/* compiled from: PG */
public final /* synthetic */ class C114405b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C114469h f317221a;

    public /* synthetic */ C114405b(C114469h hVar) {
        this.f317221a = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C114469h hVar = this.f317221a;
        Account a = hVar.f317413e.mo79668a();
        if (a != null) {
            return C60922j.m93044g(C43205e.m76192b(C145778g.m237071a(hVar.f317411c, new C145773b(a)).mo121954d(C114469h.f317410b)), C114468g.f317408a, hVar.f317418j);
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
