package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6106c;

import com.google.android.apps.gsa.nga.engine.p6011e.C75371a;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77568au;
import com.google.android.apps.gsa.nga.engine.recognition.p6101a.C77496a;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80560e;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80561f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.InputStream;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.c.ag */
/* compiled from: PG */
public final class C77516ag implements C77496a {

    /* renamed from: a */
    private final C77515af f213587a;

    /* renamed from: b */
    private final C77542z f213588b;

    /* renamed from: c */
    private final C77510aa f213589c;

    public C77516ag(C77515af afVar, C77542z zVar, C77510aa aaVar) {
        this.f213587a = afVar;
        this.f213588b = zVar;
        this.f213589c = aaVar;
    }

    /* renamed from: a */
    public final synchronized InputStream mo72590a(C77566as asVar) {
        C77541y yVar;
        C77510aa aaVar = this.f213589c;
        C80560e eVar = (C80560e) C80561f.f221124c.createBuilder();
        int incrementAndGet = aaVar.f213574a.incrementAndGet();
        eVar.copyOnWrite();
        C80561f fVar = (C80561f) eVar.instance;
        fVar.f221126a |= 1;
        fVar.f221127b = incrementAndGet;
        C80561f fVar2 = (C80561f) eVar.build();
        C77515af afVar = this.f213587a;
        C37410bo a = afVar.f213585c.mo72594a(asVar);
        ((C58970a) ((C58970a) C77515af.f213583a.mo56224b()).mo56372aa(4297)).mo56387q("Opening mic with id: %d", fVar2.f221127b);
        C37402bg a2 = afVar.f213586d.mo72600c().mo40933a(a);
        C77534r rVar = afVar.f213584b;
        rVar.f213624j.mo75090a(asVar.mo72691n());
        new C90873ag(rVar.f213616b.mo28209i(a2.mo20357d(), "[NGA] AudioLibraryMicStateHandler.scheduleOnMicOpened", new C77532p(rVar, C58872ci.m90947d(rVar.f213620f), asVar, fVar2)), rVar.f213616b, "[NGA] onNewAudioSession.scheduleOnMicClosed", new C77523g(rVar, a2, asVar, fVar2)).mo85223a(C77524h.f213600a);
        C77542z zVar = this.f213588b;
        a2.getClass();
        fVar2.getClass();
        C58889cz czVar = (C58889cz) zVar.f213652a.mo17428b();
        czVar.getClass();
        C77509a aVar = (C77509a) zVar.f213653b.mo17428b();
        aVar.getClass();
        C91142g gVar = (C91142g) zVar.f213654c.mo17428b();
        gVar.getClass();
        C118843f fVar3 = (C118843f) zVar.f213655d.mo17428b();
        fVar3.getClass();
        C75371a aVar2 = (C75371a) zVar.f213656e.mo17428b();
        aVar2.getClass();
        C22871g gVar2 = (C22871g) zVar.f213657f.mo17428b();
        gVar2.getClass();
        C81465n nVar = (C81465n) zVar.f213658g.mo17428b();
        nVar.getClass();
        C22871g gVar3 = (C22871g) zVar.f213659h.mo17428b();
        gVar3.getClass();
        yVar = new C77541y(a2, asVar, fVar2, czVar, aVar, gVar, fVar3, aVar2, gVar2, nVar, gVar3);
        Duration ofSeconds = Duration.ofSeconds(yVar.f213637c.mo85399d(C90126fx.f251609lz));
        yVar.f213645k = yVar.f213641g.mo28208h("[NGA] HotwordListeningSessionInputStream.micSafeGuard", ofSeconds.toMillis(), new C77536t(yVar, ofSeconds));
        new C90873ag(yVar.f213642h, yVar.f213641g, "[NGA] AudioListeningSessionInputStream", new C77537u(yVar)).mo85223a(C77538v.f213631a);
        C58970a aVar3 = (C58970a) ((C58970a) C77541y.f213634a.mo56224b()).mo56372aa(4292);
        int m = yVar.f213643i.mo72690m();
        String a3 = C77568au.m124486a(m);
        if (m != 0) {
            aVar3.mo56352E("Opening input stream for %s with id %d", a3, yVar.f213636b.f221127b);
        } else {
            throw null;
        }
        return yVar;
    }
}
