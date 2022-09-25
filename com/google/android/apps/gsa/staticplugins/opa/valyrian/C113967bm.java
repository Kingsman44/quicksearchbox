package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108298do;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108302ds;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108412ht;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114109an;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.bm */
/* compiled from: PG */
public final /* synthetic */ class C113967bm implements C108298do {

    /* renamed from: a */
    public final /* synthetic */ C114071eg f315598a;

    /* renamed from: b */
    public final /* synthetic */ boolean f315599b;

    public /* synthetic */ C113967bm(C114071eg egVar, boolean z) {
        this.f315598a = egVar;
        this.f315599b = z;
    }

    /* renamed from: a */
    public final void mo96730a(C108302ds dsVar) {
        C114071eg egVar = this.f315598a;
        if (this.f315599b && dsVar.mo96738a() != null) {
            C114109an anVar = egVar.f315857ao;
            C108232bc b = anVar.mo101152b(anVar.mo101151a() - 1);
            if (b != null && b.mo96602l() == 2 && C58832aw.m90831a(b.f301037s, dsVar.mo96739b())) {
                C58485gu a = dsVar.mo96738a();
                a.getClass();
                C108412ht aq = egVar.mo95406aq(a, false, 3, true);
                if (!(aq == null || egVar.f315819aC == null)) {
                    a.size();
                    aq.f301034p = 2;
                    aq.f301037s = dsVar.mo96739b();
                    aq.f301530b.mo96868n();
                }
            }
        }
        egVar.f315857ao.mObservable.mo2879a();
        egVar.f315856an.f316342d.scrollToPosition(egVar.f315857ao.mo101151a() + 1);
    }
}
