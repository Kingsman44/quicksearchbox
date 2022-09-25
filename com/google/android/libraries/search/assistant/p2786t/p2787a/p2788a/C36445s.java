package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a;

import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36409c;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36410d;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36424r;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36425s;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36426t;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36427u;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36476g;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.s */
/* compiled from: PG */
final class C36445s implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f95156a;

    /* renamed from: b */
    final /* synthetic */ C36447u f95157b;

    public C36445s(C36447u uVar, C70862aj ajVar) {
        this.f95157b = uVar;
        this.f95156a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C36447u.f95161a.mo56226d()).mo56382g(th)).mo56372aa(51478)).mo56386p("Failed to fetch active notifications");
        this.f95156a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C59071e eVar = C36447u.f95161a;
        C36409c cVar = (C36409c) C36410d.f95091d.createBuilder();
        if (!guVar.isEmpty()) {
            cVar.copyOnWrite();
            C36410d dVar = (C36410d) cVar.instance;
            dVar.f95093a |= 1;
            dVar.f95094b = true;
            C36447u.m64996g((C36476g) guVar.get(0));
            if (guVar.size() > 1) {
                String uuid = UUID.randomUUID().toString();
                C36435i iVar = this.f95157b.f95163c;
                Duration duration = C36447u.f95162b;
                guVar.size();
                iVar.f95135a.put(uuid, guVar);
                C46459k.m82829b(iVar.f95136b.mo29164d(C47810es.m84977q(new C36434h(iVar, uuid)), duration.toMillis(), TimeUnit.MILLISECONDS), "Failed to schedule eviction task", new Object[0]);
                C36424r rVar = (C36424r) C36427u.f95119c.createBuilder();
                C36425s sVar = (C36425s) C36426t.f95114d.createBuilder();
                sVar.copyOnWrite();
                C36426t tVar = (C36426t) sVar.instance;
                uuid.getClass();
                tVar.f95116a |= 1;
                tVar.f95117b = uuid;
                sVar.copyOnWrite();
                C36426t tVar2 = (C36426t) sVar.instance;
                tVar2.f95116a |= 2;
                tVar2.f95118c = 1;
                rVar.copyOnWrite();
                C36427u uVar = (C36427u) rVar.instance;
                C36426t tVar3 = (C36426t) sVar.build();
                tVar3.getClass();
                uVar.f95122b = tVar3;
                uVar.f95121a |= 1;
                cVar.copyOnWrite();
                C36410d dVar2 = (C36410d) cVar.instance;
                C36427u uVar2 = (C36427u) rVar.build();
                uVar2.getClass();
                dVar2.f95095c = uVar2;
                dVar2.f95093a |= 2;
            }
        }
        this.f95156a.mo20123c((C36410d) cVar.build());
        this.f95156a.mo20121a();
    }
}
