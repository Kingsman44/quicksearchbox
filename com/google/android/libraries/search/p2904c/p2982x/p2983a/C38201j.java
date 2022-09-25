package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.C37670hq;
import com.google.android.libraries.search.p2904c.p2982x.C38218aa;
import com.google.android.libraries.search.p2904c.p2982x.C38219ab;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.c.x.a.j */
/* compiled from: PG */
final class C38201j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f101249a;

    /* renamed from: b */
    final /* synthetic */ C37666hm f101250b;

    public C38201j(C70862aj ajVar, C37666hm hmVar) {
        this.f101249a = ajVar;
        this.f101250b = hmVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C38203l.f101252a.mo56226d()).mo56372aa(52993)).mo56386p("#audio# Failed to get StopListeningStatus.");
        C70862aj ajVar = this.f101249a;
        C38218aa aaVar = (C38218aa) C38219ab.f101295d.createBuilder();
        C37666hm hmVar = this.f101250b;
        aaVar.copyOnWrite();
        C38219ab abVar = (C38219ab) aaVar.instance;
        hmVar.getClass();
        abVar.f101298b = hmVar;
        abVar.f101297a |= 1;
        C37670hq hqVar = C37670hq.f100052c;
        aaVar.copyOnWrite();
        C38219ab abVar2 = (C38219ab) aaVar.instance;
        hqVar.getClass();
        abVar2.f101299c = hqVar;
        abVar2.f101297a |= 2;
        ajVar.mo20123c((C38219ab) aaVar.build());
        this.f101249a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37670hq hqVar = (C37670hq) obj;
        C70862aj ajVar = this.f101249a;
        C38218aa aaVar = (C38218aa) C38219ab.f101295d.createBuilder();
        C37666hm hmVar = this.f101250b;
        aaVar.copyOnWrite();
        C38219ab abVar = (C38219ab) aaVar.instance;
        hmVar.getClass();
        abVar.f101298b = hmVar;
        abVar.f101297a |= 1;
        aaVar.copyOnWrite();
        C38219ab abVar2 = (C38219ab) aaVar.instance;
        hqVar.getClass();
        abVar2.f101299c = hqVar;
        abVar2.f101297a |= 2;
        ajVar.mo20123c((C38219ab) aaVar.build());
        this.f101249a.mo20121a();
    }
}
