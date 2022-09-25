package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37422c;
import com.google.android.libraries.search.p2904c.C37656hc;
import com.google.android.libraries.search.p2904c.C37659hf;
import com.google.android.libraries.search.p2904c.C37664hk;
import com.google.android.libraries.search.p2904c.C37678hy;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2982x.C38234aq;
import com.google.android.libraries.search.p2904c.p2982x.C38235ar;
import com.google.android.libraries.search.p2904c.p2982x.C38265x;
import com.google.android.libraries.search.p2904c.p2982x.C38266y;
import com.google.android.libraries.search.p2904c.p2982x.C38267z;
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

/* renamed from: com.google.android.libraries.search.c.x.a.e */
/* compiled from: PG */
final class C38196e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C38265x f101234a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f101235b;

    /* renamed from: c */
    final /* synthetic */ int f101236c;

    /* renamed from: d */
    final /* synthetic */ C37659hf f101237d;

    /* renamed from: e */
    final /* synthetic */ C38203l f101238e;

    public C38196e(C38203l lVar, C38265x xVar, C70862aj ajVar, int i, C37659hf hfVar) {
        this.f101238e = lVar;
        this.f101234a = xVar;
        this.f101235b = ajVar;
        this.f101236c = i;
        this.f101237d = hfVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f101235b.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37656hc hcVar = (C37656hc) obj;
        C38167ae aeVar = this.f101238e.f101255d;
        C38265x xVar = this.f101234a;
        C70862aj ajVar = this.f101235b;
        int i = this.f101236c;
        C60870cx a = this.f101237d.mo41057a().mo41053a();
        hcVar.getClass();
        a.getClass();
        C37895i iVar = (C37895i) aeVar.f101138a.mo17428b();
        iVar.getClass();
        Executor executor = (Executor) aeVar.f101139b.mo17428b();
        executor.getClass();
        Executor executor2 = (Executor) aeVar.f101140c.mo17428b();
        executor2.getClass();
        C38166ad adVar = new C38166ad(hcVar, xVar, ajVar, i, a, iVar, executor, executor2);
        C38234aq aqVar = (C38234aq) C38235ar.f101329c.createBuilder();
        C38266y yVar = (C38266y) C38267z.f101378d.createBuilder();
        C37664hk a2 = adVar.f101129b.mo41049a();
        yVar.copyOnWrite();
        C38267z zVar = (C38267z) yVar.instance;
        a2.getClass();
        zVar.f101381b = a2;
        zVar.f101380a |= 1;
        C37678hy hyVar = (C37678hy) C37679hz.f100067c.createBuilder();
        int i2 = adVar.f101131d;
        hyVar.copyOnWrite();
        C37679hz hzVar = (C37679hz) hyVar.instance;
        hzVar.f100069a |= 1;
        hzVar.f100070b = i2;
        C37679hz hzVar2 = (C37679hz) hyVar.build();
        yVar.copyOnWrite();
        C38267z zVar2 = (C38267z) yVar.instance;
        hzVar2.getClass();
        zVar2.f101382c = hzVar2;
        zVar2.f101380a |= 2;
        aqVar.copyOnWrite();
        C38235ar arVar = (C38235ar) aqVar.instance;
        C38267z zVar3 = (C38267z) yVar.build();
        zVar3.getClass();
        arVar.f101332b = zVar3;
        arVar.f101331a = 1;
        adVar.mo41302h((C38235ar) aqVar.build());
        C38213v vVar = new C38213v(adVar);
        if (adVar.f101129b.mo41050b().mo56113h()) {
            adVar.mo41301g();
            adVar.mo41300f(adVar.f101129b.mo41052d());
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(new C38214w(adVar, vVar)), adVar.f101133f), "Failed to send audio stream for hotword", new Object[0]);
        } else if (adVar.f101129b.mo41051c().mo56113h()) {
            C59104x b = C38166ad.f101128a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ALT.GrpcHWCRespSender");
            ((C59052c) ((C59052c) b).mo56372aa(53023)).mo56386p("#audio# sendAllResponses registering GrpcAudioBytesReceiver");
            adVar.mo41300f(adVar.f101129b.mo41052d());
            adVar.mo41301g();
            C60856cj.m92911t(((C37422c) adVar.f101129b.mo41051c().mo56107c()).mo40946j(new C38165ac(adVar, adVar.f101129b.mo41052d(), vVar)), C47810es.m84974n(new C38164ab(vVar)), adVar.f101132e);
        } else {
            adVar.mo41296b();
        }
    }
}
