package com.google.android.apps.gsa.nowoverlayservice.p6426d;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.nowoverlayservice.C83546s;
import com.google.android.apps.gsa.nowoverlayservice.C83553y;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.search.googleapp.launcher.minusone.C136648e;
import com.google.android.apps.search.googleapp.launcher.minusone.C136651h;
import com.google.android.apps.search.googleapp.launcher.minusone.p10355c.C136622a;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136466b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136467c;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136469e;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10348f.C136470f;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58838bb;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.d.i */
/* compiled from: PG */
public final /* synthetic */ class C83526i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C83531n f227716a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f227717b;

    /* renamed from: c */
    public final /* synthetic */ C83546s f227718c;

    public /* synthetic */ C83526i(C83531n nVar, AccountId accountId, C83546s sVar) {
        this.f227716a = nVar;
        this.f227717b = accountId;
        this.f227718c = sVar;
    }

    public final void run() {
        C83531n nVar = this.f227716a;
        AccountId accountId = this.f227717b;
        C83546s sVar = this.f227718c;
        nVar.f227743e.mo85270f("starting fragment", C90996e.f254198a);
        Context context = nVar.f227745g;
        boolean z = false;
        boolean a = context != null ? C136622a.m222082a(context) : false;
        C136466b bVar = (C136466b) C136467c.f371545i.createBuilder();
        C136469e eVar = C136469e.TNG_MINUS_ONE;
        bVar.copyOnWrite();
        C136467c cVar = (C136467c) bVar.instance;
        cVar.f371548b = eVar.f371559c;
        cVar.f371547a |= 1;
        C136455h hVar = C136455h.f371506d;
        bVar.copyOnWrite();
        C136467c cVar2 = (C136467c) bVar.instance;
        hVar.getClass();
        cVar2.f371550d = hVar;
        cVar2.f371547a |= 4;
        bVar.copyOnWrite();
        C136467c cVar3 = (C136467c) bVar.instance;
        cVar3.f371547a |= 2;
        cVar3.f371549c = !a;
        bVar.copyOnWrite();
        C136467c cVar4 = (C136467c) bVar.instance;
        cVar4.f371547a |= 8;
        cVar4.f371551e = true;
        bVar.copyOnWrite();
        C136467c cVar5 = (C136467c) bVar.instance;
        cVar5.f371547a |= 16;
        cVar5.f371552f = true;
        bVar.copyOnWrite();
        C136467c cVar6 = (C136467c) bVar.instance;
        cVar6.f371547a |= 32;
        cVar6.f371553g = true;
        C136648e a2 = C136651h.m222186a(accountId, (C136467c) bVar.build());
        C83518a aVar = nVar.f227747i;
        C58838bb.m90866a(aVar, "FragmentHost must be initialized first via #prepareTngFragmentHost()");
        FragmentManager q = aVar.mo51122q();
        if (q.f659z) {
            nVar.f227743e.mo85270f("FragmentManager is destroyed, cannot create fragment", C90996e.f254198a);
            ((C39143kr) nVar.f227741c.mo27525b()).mo41722k(nVar.f227744f.f227737h);
            sVar.mo76865a(false);
        } else if (!q.mo461ab()) {
            C0154a aVar2 = new C0154a(q);
            aVar2.mo689v(nVar.f227746h, a2, (String) null);
            aVar2.mo509f();
            C136470f s = C83531n.m132986s(a2);
            if (nVar.f227748j) {
                s.mo113070i();
            }
            if (s != null) {
                z = true;
            }
            C83553y yVar = sVar.f227773a;
            yVar.f227808X = 2;
            yVar.f227807W = z;
            yVar.mo76876A(C59203do.f157270a);
        } else {
            nVar.f227743e.mo85270f("FragmentManager state is saved, cannot create fragment yet", C90996e.f254198a);
            ((C39143kr) nVar.f227741c.mo27525b()).mo41722k(nVar.f227744f.f227737h);
            sVar.mo76865a(true);
        }
    }
}
