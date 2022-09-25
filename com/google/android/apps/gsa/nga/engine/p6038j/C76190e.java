package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.e */
/* compiled from: PG */
public final /* synthetic */ class C76190e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76193h f211189a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f211190b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f211191c;

    public /* synthetic */ C76190e(C76193h hVar, AccountId accountId, Throwable th) {
        this.f211189a = hVar;
        this.f211190b = accountId;
        this.f211191c = th;
    }

    public final void run() {
        C76193h hVar = this.f211189a;
        AccountId accountId = this.f211190b;
        Throwable th = this.f211191c;
        if (hVar.f211196c.equals(accountId)) {
            C59104x c = C76164aa.f211144a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConvHandler");
            ((C58970a) ((C58970a) ((C58970a) c).mo56382g(th)).mo56372aa(3144)).mo56386p("Error received from conversation controller");
            return;
        }
        ((C59052c) ((C59052c) C76194i.f211198a.mo56226d()).mo56372aa(3132)).mo56386p("Event received on non primary account.");
        hVar.f211195b.mo106410c();
    }
}
