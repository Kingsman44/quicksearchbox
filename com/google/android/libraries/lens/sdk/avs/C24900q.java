package com.google.android.libraries.lens.sdk.avs;

import com.google.android.libraries.lens.sdk.avs.data.C24870e;
import com.google.android.libraries.lens.sdk.avs.data.C24877l;
import com.google.android.libraries.lens.sdk.avs.data.C24882q;
import com.google.android.libraries.lens.sdk.avs.data.C24884s;
import com.google.android.libraries.lens.sdk.avs.p2042c.C24864c;
import com.google.android.libraries.lens.sdk.p2045c.C24914a;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.sdk.avs.q */
/* compiled from: PG */
final class C24900q implements C24897n {

    /* renamed from: a */
    final /* synthetic */ C24914a f68008a;

    /* renamed from: b */
    final /* synthetic */ String f68009b;

    /* renamed from: c */
    final /* synthetic */ C24902s f68010c;

    public C24900q(C24902s sVar, C24914a aVar, String str) {
        this.f68010c = sVar;
        this.f68008a = aVar;
        this.f68009b = str;
    }

    /* renamed from: a */
    public final void mo30121a(C24870e eVar) {
        ((C58970a) ((C58970a) C24902s.f68013a.mo56226d()).mo56372aa(48885)).mo56386p("OnError");
        this.f68008a.mo30134a(C24864c.m46002a("Error", eVar.f67930a));
    }

    /* renamed from: b */
    public final void mo30122b(C24877l lVar) {
        ((C58970a) ((C58970a) C24902s.f68013a.mo56224b()).mo56372aa(48886)).mo56386p("OnQueryResult");
        C24914a aVar = this.f68008a;
        lVar.mo30097f(this.f68009b);
        lVar.mo30094c(true);
        aVar.mo30134a(C24864c.m46002a("QueryResult", lVar.f67960a));
    }

    /* renamed from: c */
    public final void mo30123c(C24882q qVar) {
        ((C58970a) ((C58970a) C24902s.f68013a.mo56224b()).mo56372aa(48887)).mo56386p("OnSessionCreated");
        C24914a aVar = this.f68008a;
        qVar.mo30110b(this.f68009b);
        aVar.mo30134a(C24864c.m46002a("StartSession", qVar.f67963a));
    }

    /* renamed from: d */
    public final void mo30124d(C24884s sVar) {
        ((C58970a) ((C58970a) C24902s.f68013a.mo56224b()).mo56372aa(48888)).mo56386p("OnSessionEnd");
        C24914a aVar = this.f68008a;
        sVar.mo30114b(this.f68009b);
        aVar.mo30134a(C24864c.m46002a("StopSession", sVar.f67965a));
        this.f68010c.f68016c.remove(this.f68009b);
    }
}
