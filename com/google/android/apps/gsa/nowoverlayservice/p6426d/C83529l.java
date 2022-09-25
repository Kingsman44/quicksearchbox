package com.google.android.apps.gsa.nowoverlayservice.p6426d;

import android.view.View;
import com.google.android.apps.gsa.nowoverlayservice.C83546s;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.d.l */
/* compiled from: PG */
final class C83529l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ View f227725a;

    /* renamed from: b */
    final /* synthetic */ boolean f227726b;

    /* renamed from: c */
    final /* synthetic */ C83531n f227727c;

    /* renamed from: d */
    final /* synthetic */ C83546s f227728d;

    public C83529l(C83531n nVar, View view, boolean z, C83546s sVar) {
        this.f227727c = nVar;
        this.f227725a = view;
        this.f227726b = z;
        this.f227728d = sVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f227728d.mo76865a(false);
        C59104x c = C83531n.f227738a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TngMinusOneShim");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(6738)).mo56386p("Failed to retrieve Account for overlay");
        this.f227727c.f227743e.mo85270f("Failed to retrieve AccountId for overlay.", C90996e.f254198a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        AccountId accountId = (AccountId) obj;
        C83531n nVar = this.f227727c;
        View view = this.f227725a;
        nVar.f227742d.execute(C47810es.m84977q(new C83525h(nVar, this.f227726b, view, accountId)));
        C83531n nVar2 = this.f227727c;
        nVar2.f227742d.execute(C47810es.m84977q(new C83526i(nVar2, accountId, this.f227728d)));
    }
}
