package com.google.android.apps.gsa.nowoverlayservice.p6426d;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.Window;
import com.google.android.apps.gsa.nowoverlayservice.C83546s;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.d.j */
/* compiled from: PG */
public final /* synthetic */ class C83527j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C83531n f227719a;

    /* renamed from: b */
    public final /* synthetic */ Window f227720b;

    /* renamed from: c */
    public final /* synthetic */ View f227721c;

    /* renamed from: d */
    public final /* synthetic */ View f227722d;

    /* renamed from: e */
    public final /* synthetic */ C83546s f227723e;

    public /* synthetic */ C83527j(C83531n nVar, Window window, View view, View view2, C83546s sVar) {
        this.f227719a = nVar;
        this.f227720b = window;
        this.f227721c = view;
        this.f227722d = view2;
        this.f227723e = sVar;
    }

    public final void run() {
        C83531n nVar = this.f227719a;
        Window window = this.f227720b;
        View view = this.f227721c;
        View view2 = this.f227722d;
        C83546s sVar = this.f227723e;
        nVar.f227743e.mo85270f("handling account change", C90996e.f254198a);
        C83518a aVar = nVar.f227747i;
        C58838bb.m90866a(aVar, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
        if (!aVar.mo51122q().f659z) {
            Fragment r = nVar.mo76851r();
            if (r != null) {
                nVar.f227743e.mo85270f("unloading existing fragment", C90996e.f254198a);
                C83518a aVar2 = nVar.f227747i;
                C58838bb.m90866a(aVar2, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
                C0154a aVar3 = new C0154a(aVar2.mo51122q());
                aVar3.mo516m(r);
                aVar3.mo509f();
            }
            nVar.mo76853u(window, view, view2, sVar, true);
            return;
        }
        nVar.f227743e.mo85270f("FragmentManager is destroyed, cannot process account change", C90996e.f254198a);
        ((C39143kr) nVar.f227741c.mo27525b()).mo41722k(nVar.f227744f.f227737h);
    }
}
