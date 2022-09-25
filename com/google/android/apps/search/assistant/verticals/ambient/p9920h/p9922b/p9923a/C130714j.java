package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a.C130715k;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.j */
/* compiled from: PG */
final class C130714j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C21850cf f357892a;

    /* renamed from: b */
    final /* synthetic */ C130715k f357893b;

    public C130714j(C130715k kVar, C21850cf cfVar) {
        this.f357893b = kVar;
        this.f357892a = cfVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C130715k.f357894a.mo56226d()).mo56382g(th)).mo56372aa(38951)).mo56386p("Failed to fetch AccountId");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C130715k kVar = this.f357893b;
        C21850cf cfVar = this.f357892a;
        Collection.EL.stream(((C130715k.C130716a) C47245e.m84045a(kVar.f357895b, C130715k.C130716a.class, (AccountId) obj)).mo109804ju()).forEach(new C130713i(cfVar));
    }
}
