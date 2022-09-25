package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.p732a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12022l;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12023m;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37704j;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.C38121w;
import com.google.android.libraries.search.p2904c.C38160x;
import com.google.android.libraries.search.p2904c.C38284z;
import com.google.common.p4526f.C59052c;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.d.a.b */
/* compiled from: PG */
final class C12007b implements C57974a {

    /* renamed from: a */
    final /* synthetic */ C70862aj f38533a;

    public C12007b(C70862aj ajVar) {
        this.f38533a = ajVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C37680i iVar = (C37680i) obj;
        iVar.f100074b.mo59031d();
        C70862aj ajVar = this.f38533a;
        C12022l lVar = (C12022l) C12023m.f38551c.createBuilder();
        C37704j jVar = (C37704j) C37819l.f100340e.createBuilder();
        jVar.copyOnWrite();
        C37819l lVar2 = (C37819l) jVar.instance;
        iVar.getClass();
        lVar2.f100344c = iVar;
        lVar2.f100343b = 1;
        lVar.copyOnWrite();
        C12023m mVar = (C12023m) lVar.instance;
        C37819l lVar3 = (C37819l) jVar.build();
        lVar3.getClass();
        mVar.f38554b = lVar3;
        mVar.f38553a = 2;
        ajVar.mo20123c((C12023m) lVar.build());
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C70862aj ajVar = this.f38533a;
        C12022l lVar = (C12022l) C12023m.f38551c.createBuilder();
        C37704j jVar = (C37704j) C37819l.f100340e.createBuilder();
        C38121w wVar = (C38121w) C38160x.f101118c.createBuilder();
        C38284z zVar = C38284z.SUCCESS;
        wVar.copyOnWrite();
        C38160x xVar = (C38160x) wVar.instance;
        xVar.f101121b = zVar.f101427c;
        xVar.f101120a |= 1;
        jVar.copyOnWrite();
        C37819l lVar2 = (C37819l) jVar.instance;
        C38160x xVar2 = (C38160x) wVar.build();
        xVar2.getClass();
        lVar2.f100344c = xVar2;
        lVar2.f100343b = 2;
        lVar.copyOnWrite();
        C12023m mVar = (C12023m) lVar.instance;
        C37819l lVar3 = (C37819l) jVar.build();
        lVar3.getClass();
        mVar.f38554b = lVar3;
        mVar.f38553a = 2;
        ajVar.mo20123c((C12023m) lVar.build());
        this.f38533a.mo20121a();
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C12008c.f38534a.mo56226d()).mo56382g(th)).mo56372aa(43961)).mo56386p("Sink<Audio> #onFailure.");
        this.f38533a.mo20122b(th);
    }
}
