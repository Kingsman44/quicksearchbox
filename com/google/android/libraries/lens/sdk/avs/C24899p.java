package com.google.android.libraries.lens.sdk.avs;

import com.google.android.libraries.lens.sdk.avs.data.C24870e;
import com.google.android.libraries.lens.sdk.avs.data.C24877l;
import com.google.android.libraries.lens.sdk.avs.data.C24882q;
import com.google.android.libraries.lens.sdk.avs.data.C24884s;
import com.google.android.libraries.lens.sdk.avs.p2042c.C24864c;
import com.google.android.libraries.lens.sdk.p2045c.C24914a;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.sdk.avs.p */
/* compiled from: PG */
final class C24899p implements C24897n {

    /* renamed from: a */
    final /* synthetic */ C24914a f68005a;

    /* renamed from: b */
    final /* synthetic */ String f68006b;

    /* renamed from: c */
    final /* synthetic */ C24902s f68007c;

    public C24899p(C24902s sVar, C24914a aVar, String str) {
        this.f68007c = sVar;
        this.f68005a = aVar;
        this.f68006b = str;
    }

    /* renamed from: a */
    public final void mo30121a(C24870e eVar) {
        ((C58970a) ((C58970a) C24902s.f68013a.mo56226d()).mo56372aa(48881)).mo56386p("OnError");
        this.f68007c.f68017d.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo30122b(C24877l lVar) {
        ((C58970a) ((C58970a) C24902s.f68013a.mo56224b()).mo56372aa(48882)).mo56387q("OnQueryResult, numQueryResultEvents=%d", this.f68007c.f68017d.get());
        C24914a aVar = this.f68005a;
        lVar.mo30094c(this.f68007c.f68017d.get() > 0);
        lVar.mo30097f(this.f68006b);
        lVar.mo30098g(1);
        aVar.mo30134a(C24864c.m46002a("QueryResult", lVar.f67960a));
        this.f68007c.f68017d.incrementAndGet();
    }

    /* renamed from: c */
    public final void mo30123c(C24882q qVar) {
        ((C58970a) ((C58970a) C24902s.f68013a.mo56224b()).mo56372aa(48883)).mo56386p("OnSessionCreated");
    }

    /* renamed from: d */
    public final void mo30124d(C24884s sVar) {
        ((C58970a) ((C58970a) C24902s.f68013a.mo56224b()).mo56372aa(48884)).mo56386p("OnSessionEnd");
    }
}
