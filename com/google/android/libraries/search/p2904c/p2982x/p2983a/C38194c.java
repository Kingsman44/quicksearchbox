package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37416bu;
import com.google.android.libraries.search.p2904c.C37422c;
import com.google.android.libraries.search.p2904c.C37638gq;
import com.google.android.libraries.search.p2904c.C37639gr;
import com.google.android.libraries.search.p2904c.C37678hy;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2982x.C38227aj;
import com.google.android.libraries.search.p2904c.p2982x.C38228ak;
import com.google.android.libraries.search.p2904c.p2982x.C38229al;
import com.google.android.libraries.search.p2904c.p2982x.C38236as;
import com.google.android.libraries.search.p2904c.p2982x.C38237at;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.c.x.a.c */
/* compiled from: PG */
final class C38194c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C38227aj f101225a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f101226b;

    /* renamed from: c */
    final /* synthetic */ int f101227c;

    /* renamed from: d */
    final /* synthetic */ int f101228d;

    /* renamed from: e */
    final /* synthetic */ C37402bg f101229e;

    /* renamed from: f */
    final /* synthetic */ C38203l f101230f;

    public C38194c(C38203l lVar, C38227aj ajVar, C70862aj ajVar2, int i, int i2, C37402bg bgVar) {
        this.f101230f = lVar;
        this.f101225a = ajVar;
        this.f101226b = ajVar2;
        this.f101227c = i;
        this.f101228d = i2;
        this.f101229e = bgVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f101226b.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37400be beVar = (C37400be) obj;
        C38193bd bdVar = this.f101230f.f101254c;
        C38227aj ajVar = this.f101225a;
        C70862aj ajVar2 = this.f101226b;
        int i = this.f101227c;
        int i2 = this.f101228d;
        C60870cx a = ((C37401bf) this.f101229e.mo20358e()).mo20353a();
        beVar.getClass();
        a.getClass();
        C37895i iVar = (C37895i) bdVar.f101222a.mo17428b();
        iVar.getClass();
        Executor executor = (Executor) bdVar.f101223b.mo17428b();
        executor.getClass();
        Executor executor2 = (Executor) bdVar.f101224c.mo17428b();
        executor2.getClass();
        C38192bc bcVar = new C38192bc(beVar, ajVar, ajVar2, i, i2, a, iVar, executor, executor2);
        C38236as asVar = (C38236as) C38237at.f101333c.createBuilder();
        C38228ak akVar = (C38228ak) C38229al.f101316f.createBuilder();
        C37416bu a2 = bcVar.f101212b.mo40929a();
        akVar.copyOnWrite();
        C38229al alVar = (C38229al) akVar.instance;
        a2.getClass();
        alVar.f101319b = a2;
        alVar.f101318a |= 1;
        C37638gq gqVar = (C37638gq) C37639gr.f100004c.createBuilder();
        int i3 = bcVar.f101214d;
        gqVar.copyOnWrite();
        C37639gr grVar = (C37639gr) gqVar.instance;
        grVar.f100006a |= 1;
        grVar.f100007b = i3;
        C37639gr grVar2 = (C37639gr) gqVar.build();
        akVar.copyOnWrite();
        C38229al alVar2 = (C38229al) akVar.instance;
        grVar2.getClass();
        alVar2.f101320c = grVar2;
        alVar2.f101318a |= 2;
        C37678hy hyVar = (C37678hy) C37679hz.f100067c.createBuilder();
        int i4 = bcVar.f101215e;
        hyVar.copyOnWrite();
        C37679hz hzVar = (C37679hz) hyVar.instance;
        hzVar.f100069a |= 1;
        hzVar.f100070b = i4;
        C37679hz hzVar2 = (C37679hz) hyVar.build();
        akVar.copyOnWrite();
        C38229al alVar3 = (C38229al) akVar.instance;
        hzVar2.getClass();
        alVar3.f101321d = hzVar2;
        alVar3.f101318a |= 4;
        asVar.copyOnWrite();
        C38237at atVar = (C38237at) asVar.instance;
        C38229al alVar4 = (C38229al) akVar.build();
        alVar4.getClass();
        atVar.f101336b = alVar4;
        atVar.f101335a = 1;
        bcVar.mo41321h((C38237at) asVar.build());
        C38183au auVar = new C38183au(bcVar);
        if (bcVar.f101212b.mo40930b().mo56113h()) {
            bcVar.mo41320g(bcVar.f101212b.mo40932d());
            bcVar.mo41322i();
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(new C38184av(bcVar, auVar)), bcVar.f101217g), "Failed to send audio stream", new Object[0]);
        } else if (bcVar.f101212b.mo40931c().mo56113h()) {
            C59104x b = C38192bc.f101211a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ALT.GrpcARCRespSender");
            ((C59052c) ((C59052c) b).mo56372aa(53053)).mo56386p("#audio# sendAllResponses registering GrpcAudioBytesReceiver");
            bcVar.mo41320g(bcVar.f101212b.mo40932d());
            bcVar.mo41322i();
            C60856cj.m92911t(((C37422c) bcVar.f101212b.mo40931c().mo56107c()).mo40946j(new C38191bb(bcVar, bcVar.f101212b.mo40932d(), auVar)), C47810es.m84974n(new C38187ay(auVar)), bcVar.f101216f);
        } else {
            bcVar.mo41314a(bcVar.f101212b.mo40932d());
        }
    }
}
