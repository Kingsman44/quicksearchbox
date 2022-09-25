package com.google.android.apps.search.assistant.libraries.p8946b;

import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.geller.p1820g.C21878a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.C65163dx;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5130a.C65705ad;
import com.google.protos.p5129p.p5130a.C65706ae;
import com.google.protos.p5129p.p5130a.C65707af;
import com.google.protos.p5129p.p5130a.C65708ag;
import com.google.protos.p5129p.p5130a.C65726k;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65844m;
import com.google.protos.p5129p.p5131b.C65845n;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.l */
/* compiled from: PG */
public final class C119249l implements C119247j {

    /* renamed from: a */
    public static final C58974d f332553a = C58974d.m91136j();

    /* renamed from: b */
    public final C21878a f332554b;

    /* renamed from: c */
    private final C65726k f332555c;

    /* renamed from: d */
    private final ExecutorService f332556d;

    public C119249l(C65726k kVar, C21878a aVar, ExecutorService executorService) {
        this.f332555c = kVar;
        this.f332554b = aVar;
        this.f332556d = executorService;
    }

    /* renamed from: a */
    public final void mo104259a(C65163dx dxVar) {
        this.f332554b.mo27173c(dxVar);
    }

    /* renamed from: b */
    public final void mo104260b(C19088t tVar, C60218r rVar) {
        if ((tVar.f53535a & 16) != 0) {
            C65726k kVar = this.f332555c;
            C65705ad adVar = (C65705ad) C65708ag.f178520d.createBuilder();
            C65706ae aeVar = (C65706ae) C65707af.f178514d.createBuilder();
            C65753ak akVar = C65753ak.ASSISTANT_HISTORY;
            aeVar.copyOnWrite();
            C65707af afVar = (C65707af) aeVar.instance;
            afVar.f178517b = akVar.f178757bE;
            afVar.f178516a |= 1;
            C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
            C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
            C60220t tVar2 = rVar.f162928b;
            if (tVar2 == null) {
                tVar2 = C60220t.f162931e;
            }
            long j = tVar2.f162934b;
            cVar.copyOnWrite();
            C65139d dVar = (C65139d) cVar.instance;
            dVar.f176309a |= 1;
            dVar.f176310b = j;
            C60220t tVar3 = rVar.f162928b;
            if (tVar3 == null) {
                tVar3 = C60220t.f162931e;
            }
            int i = tVar3.f162935c;
            cVar.copyOnWrite();
            C65139d dVar2 = (C65139d) cVar.instance;
            dVar2.f176309a |= 2;
            dVar2.f176311c = i;
            C60220t tVar4 = rVar.f162928b;
            if (tVar4 == null) {
                tVar4 = C60220t.f162931e;
            }
            int i2 = tVar4.f162936d;
            cVar.copyOnWrite();
            C65139d dVar3 = (C65139d) cVar.instance;
            dVar3.f176309a |= 4;
            dVar3.f176312d = i2;
            ayVar.copyOnWrite();
            C65768az azVar = (C65768az) ayVar.instance;
            C65139d dVar4 = (C65139d) cVar.build();
            dVar4.getClass();
            azVar.f178796b = dVar4;
            azVar.f178795a |= 1;
            C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
            gVar.copyOnWrite();
            ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.AssistantHistoryElement";
            C65844m mVar = (C65844m) C65845n.f178992c.createBuilder();
            mVar.copyOnWrite();
            C65845n nVar = (C65845n) mVar.instance;
            tVar.getClass();
            nVar.f178995b = tVar;
            nVar.f178994a |= 2;
            C63088z byteString = ((C65845n) mVar.build()).toByteString();
            gVar.copyOnWrite();
            byteString.getClass();
            ((C63070h) gVar.instance).f170218b = byteString;
            ayVar.copyOnWrite();
            C65768az azVar2 = (C65768az) ayVar.instance;
            C63070h hVar = (C63070h) gVar.build();
            hVar.getClass();
            azVar2.f178799e = hVar;
            azVar2.f178795a |= 8;
            C65768az azVar3 = (C65768az) ayVar.build();
            aeVar.copyOnWrite();
            C65707af afVar2 = (C65707af) aeVar.instance;
            azVar3.getClass();
            afVar2.f178518c = azVar3;
            afVar2.f178516a |= 2;
            adVar.mo59417a(aeVar);
            adVar.copyOnWrite();
            C65708ag agVar = (C65708ag) adVar.instance;
            agVar.f178522a |= 2;
            agVar.f178524c = true;
            C60856cj.m92911t(C47633f.m84733g(kVar.mo59421b((C65708ag) adVar.build())).f164926b, C47810es.m84974n(new C119248k(this, rVar)), this.f332556d);
            return;
        }
        C46459k.m82829b(this.f332554b.mo27172b(rVar), "Failed to persist on-device only pending state writes", new Object[0]);
    }
}
