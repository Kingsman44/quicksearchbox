package com.google.android.apps.gsa.staticplugins.p7666ci;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.p8839t.p8845f.C118359a;
import com.google.android.apps.gsa.p8839t.p8845f.C118361c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85006i;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.aw */
/* compiled from: PG */
public final class C97783aw implements C118549h {

    /* renamed from: a */
    public static final C59071e f273010a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ci.aw");

    /* renamed from: b */
    public final C22871g f273011b;

    /* renamed from: c */
    public final C85006i f273012c;

    /* renamed from: d */
    public final long f273013d;

    /* renamed from: e */
    public final long f273014e;

    /* renamed from: f */
    C2164c f273015f;

    /* renamed from: g */
    private final C85492i f273016g;

    /* renamed from: h */
    private final C118561t f273017h;

    /* renamed from: i */
    private final C22871g f273018i;

    /* renamed from: j */
    private final C86124t f273019j;

    /* renamed from: k */
    private C60870cx f273020k;

    public C97783aw(C85492i iVar, C118561t tVar, C86124t tVar2, C22871g gVar, C22871g gVar2, C85006i iVar2) {
        this.f273016g = iVar;
        this.f273017h = tVar;
        this.f273019j = tVar2;
        this.f273018i = gVar;
        this.f273011b = gVar2;
        this.f273012c = iVar2;
        this.f273013d = tVar2.mo79743a(C90014bt.f247556jQ);
        this.f273014e = tVar2.mo79743a(C90014bt.f247557jR);
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        C59071e eVar = f273010a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.AutoBgTask");
        ((C59052c) ((C59052c) b).mo56372aa(30254)).mo56386p("Perform ProactiveClientPlatformEmbeddedAutoBackgroundRefreshTask.");
        if (this.f273019j.mo79746e(C90069du.f249725c)) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "PCP.AutoBgTask");
            ((C59052c) ((C59052c) b2).mo56372aa(30257)).mo56386p("NOT an embedded auto device, background task stops.");
            return C60856cj.m92900i(C118826c.f331422a);
        }
        C62940bt r1 = C62942bv.checkIsLite(C118359a.f328525a);
        akVar.mo58887l(r1);
        Object l = akVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C118361c cVar = (C118361c) obj;
        C53306j a = C53306j.m86809a(cVar.f328530c);
        if (a == null) {
            a = C53306j.UNKNOWNN;
        }
        boolean z = cVar.f328529b;
        if (a != C53306j.AUTO_EMBEDDED) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.AutoBgTask");
            ((C59052c) ((C59052c) d).mo56372aa(30256)).mo56386p("This background task is designed for AUTO_EMBEDDED only.");
            return C60856cj.m92900i(C118826c.f331422a);
        }
        this.f273020k = C2169h.m6027a(new C97777aq(this));
        C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
        adVar.copyOnWrite();
        C87696ae aeVar = (C87696ae) adVar.instance;
        aeVar.f237134a |= 1024;
        aeVar.f237144k = z;
        C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
        hpVar.copyOnWrite();
        C53271hs hsVar = (C53271hs) hpVar.instance;
        hsVar.f139663l = a.f139793X;
        hsVar.f139652a |= 512;
        C53270hr hrVar = C53270hr.BACKGROUND_REFRESH;
        hpVar.copyOnWrite();
        C53271hs hsVar2 = (C53271hs) hpVar.instance;
        hsVar2.f139665n = hrVar.f139649g;
        hsVar2.f139652a |= 2048;
        adVar.copyOnWrite();
        C87696ae aeVar2 = (C87696ae) adVar.instance;
        C53271hs hsVar3 = (C53271hs) hpVar.build();
        hsVar3.getClass();
        aeVar2.f237136c = hsVar3;
        aeVar2.f237134a |= 2;
        adVar.copyOnWrite();
        C87696ae aeVar3 = (C87696ae) adVar.instance;
        aeVar3.f237134a |= 2048;
        aeVar3.f237145l = true;
        try {
            this.f273016g.mo79001f((C87696ae) adVar.build(), new C97782av(this));
            C60870cx cxVar = this.f273020k;
            cxVar.getClass();
            new C90873ag(C90877ak.m148471e(cxVar, 5000, TimeUnit.MILLISECONDS, this.f273018i), this.f273011b, "doneFromZeroStateFuture", new C97778ar(this, z, akVar, cVar)).mo85223a(new C97779as(this, akVar));
        } catch (Exception e) {
            C59104x c = f273010a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PCP.AutoBgTask");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30255)).mo56386p("Error in PCP background refresh task. Reschedule another one.");
            mo90812b(akVar, this.f273013d);
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: b */
    public final void mo90812b(C118476ak akVar, long j) {
        C58976aa aaVar = C58975e.f156826a;
        C118561t tVar = this.f273017h;
        C118522by byVar = C118522by.PROACTIVE_CLIENT_PLATFORM_EMBEDDED_AUTO_REFRESH;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = j;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a |= 2;
        agVar2.f328823c = 30000;
        afVar.copyOnWrite();
        C118472ag agVar3 = (C118472ag) afVar.instance;
        agVar3.f328824d = 1;
        agVar3.f328821a |= 4;
        afVar.copyOnWrite();
        C118472ag agVar4 = (C118472ag) afVar.instance;
        akVar.getClass();
        agVar4.f328827g = akVar;
        agVar4.f328821a |= 32;
        tVar.mo103754e(byVar, (C118472ag) afVar.build());
    }
}
