package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.shared.p7041h.C89777i;
import com.google.android.apps.gsa.shared.p7041h.C89778j;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.r */
/* compiled from: PG */
public final /* synthetic */ class C110558r implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110559s f308218a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f308219b;

    public /* synthetic */ C110558r(C110559s sVar, SettableFuture settableFuture) {
        this.f308218a = sVar;
        this.f308219b = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C110559s sVar = this.f308218a;
        SettableFuture settableFuture = this.f308219b;
        ((C58970a) ((C58970a) sVar.f308227f.mo56224b()).mo56372aa(26553)).mo56386p("#onFetchContentProviderSuccess()");
        C89777i iVar = (C89777i) C89778j.f242996b.createBuilder();
        iVar.mo83622a((Collection) obj);
        C89778j jVar = (C89778j) iVar.build();
        if (!sVar.f308226e.mo79746e(C90014bt.f247646lA)) {
            settableFuture.mo57356n(C58833ax.m90834k(jVar));
            return;
        }
        C108013bm bmVar = sVar.f308223b;
        new C90873ag(bmVar.f300493i.mo96378g(3, 16, C58836b.f156633a, jVar.toByteArray(), TimeUnit.DAYS.toMinutes(bmVar.f300487c.mo79743a(C90014bt.f247652lG))), sVar.f308224c, "writeEventDataToOpaStore", new C110554n(sVar, jVar, settableFuture)).mo85223a(new C110555o(sVar, settableFuture));
    }
}
