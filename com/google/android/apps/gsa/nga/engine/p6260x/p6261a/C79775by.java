package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.eventlogger.p5849b.C74511d;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.engine.p6096p.C77439af;
import com.google.android.apps.gsa.nga.engine.p6096p.C77440ag;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.ahg;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4500cm.p4518d.C58192i;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65844m;
import com.google.protos.p5129p.p5131b.C65845n;
import com.google.speech.p5218j.C66913ec;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.by */
/* compiled from: PG */
final class C79775by implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C60218r f218710a;

    /* renamed from: b */
    final /* synthetic */ C79814dj f218711b;

    /* renamed from: c */
    final /* synthetic */ C79783cf f218712c;

    public C79775by(C79783cf cfVar, C60218r rVar, C79814dj djVar) {
        this.f218712c = cfVar;
        this.f218710a = rVar;
        this.f218711b = djVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C79783cf.f218738a.mo56226d()).mo56382g(th)).mo56372aa(3989)).mo56386p("Query log event construction failed.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C79781cd cdVar = (C79781cd) obj;
        if (cdVar != null) {
            C79783cf cfVar = this.f218712c;
            C60218r rVar = this.f218710a;
            C79814dj djVar = this.f218711b;
            C79782ce ceVar = cdVar.f218721a;
            C58192i iVar = cdVar.f218722b;
            C60321oe oeVar = (C60321oe) ceVar.f218729e.build();
            for (aqs aqs : oeVar.f163228c) {
                if (aqs.f159783b == 110769) {
                    return;
                }
            }
            C60555uf ufVar = iVar.f155607c;
            if (ufVar == null) {
                ufVar = C60555uf.f164065cO;
            }
            ahg ahg = ufVar.f164238cp;
            if (ahg == null) {
                ahg = ahg.f158704D;
            }
            if (!Collection.EL.stream(ahg.f158717f).filter(C79759bi.f218688a).flatMap(C79760bj.f218689a).anyMatch(C79761bk.f218690a)) {
                C143657j d = ((C143658k) cfVar.f218742e.mo27525b()).mo118999d(iVar);
                d.f389463e = oeVar;
                C58528ij ijVar = C74511d.f208656a;
                d.f389473o = 4;
                Optional d2 = cfVar.f218745h.mo72021b().mo72038d();
                Objects.requireNonNull(d);
                d2.ifPresent(new C79766bp(d));
                d.mo118992a();
                if (cdVar.f218723c && (djVar.f218851a & 2) != 0 && cfVar.f218743f.mo85405j(C90126fx.f251042bO)) {
                    ((Optional) cfVar.f218744g.mo27525b()).ifPresent(new C79764bn((C66913ec) ceVar.f218730f.build()));
                }
                if (cdVar.f218724d) {
                    C77440ag agVar = cfVar.f218749l;
                    C19088t tVar = (C19088t) ceVar.f218728d.build();
                    C76455a aVar = (C76455a) agVar.f213468b.mo27525b();
                    C65753ak akVar = C65753ak.ASSISTANT_HISTORY;
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
                    dVar3.f176309a = 4 | dVar3.f176309a;
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
                    C60856cj.m92911t(C60838bs.m92859i(aVar.mo72195f(akVar, (C65768az) ayVar.build(), true)), new C77439af(agVar), C60826bg.f164896a);
                }
            }
        }
    }
}
