package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.C73848bu;
import com.google.android.apps.gsa.assistant.shared.g;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.ae.a.av;
import com.google.android.apps.gsa.nga.engine.ae.a.aw;
import com.google.android.apps.gsa.nga.engine.at.a.b;
import com.google.android.apps.gsa.nga.engine.p5894ad.p5895a.C74765a;
import com.google.android.apps.gsa.nga.engine.p5894ad.p5895a.C74766b;
import com.google.android.apps.gsa.nga.engine.p5897ae.p5898a.C74775ax;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74818bc;
import com.google.android.apps.gsa.nga.engine.p5913am.C74867ap;
import com.google.android.apps.gsa.nga.engine.p5913am.p5935p.C74947c;
import com.google.android.apps.gsa.nga.engine.p5961at.C75043a;
import com.google.android.apps.gsa.nga.engine.p6056o.C76537ae;
import com.google.android.apps.gsa.nga.engine.p6056o.C76538b;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.nga.shared.p6407v.C82297c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83314ii;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82906ev;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82907ew;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82980ho;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82981hp;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82983hr;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58835az;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4553a.C59562r;
import com.google.common.p4552o.p4553a.C59564t;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.ck */
/* compiled from: PG */
public final class C76993ck implements C76537ae {

    /* renamed from: a */
    public static final C58974d f212518a = C58974d.m91136j();

    /* renamed from: b */
    public final C74947c f212519b;

    /* renamed from: c */
    private final C21370a f212520c;

    /* renamed from: d */
    private final C76538b f212521d;

    /* renamed from: e */
    private final C74818bc f212522e;

    /* renamed from: f */
    private final C75043a f212523f;

    /* renamed from: g */
    private final C82297c f212524g;

    /* renamed from: h */
    private final C81252aq f212525h;

    /* renamed from: i */
    private final C91142g f212526i;

    /* renamed from: j */
    private final C74765a f212527j;

    /* renamed from: k */
    private final C83314ii f212528k;

    /* renamed from: l */
    private final C73848bu f212529l;

    /* renamed from: m */
    private final C76936br f212530m;

    /* renamed from: n */
    private final C74775ax f212531n;

    public C76993ck(C21370a aVar, C74947c cVar, C76538b bVar, C74818bc bcVar, C75043a aVar2, C82297c cVar2, C74775ax axVar, C81252aq aqVar, C91142g gVar, C74765a aVar3, C83314ii iiVar, C73848bu buVar, C76936br brVar) {
        this.f212520c = aVar;
        this.f212519b = cVar;
        this.f212521d = bVar;
        this.f212522e = bcVar;
        this.f212523f = aVar2;
        this.f212524g = cVar2;
        this.f212531n = axVar;
        this.f212525h = aqVar;
        this.f212526i = gVar;
        this.f212527j = aVar3;
        this.f212528k = iiVar;
        this.f212529l = buVar;
        this.f212530m = brVar;
    }

    /* renamed from: a */
    public final void mo72229a(Bundle bundle, int i) {
        int i2;
        int i3 = i;
        if (!((i3 & 1) == 0 && (i3 & 4) == 0)) {
            C82297c cVar = this.f212524g;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 724;
            cVar.mo74231n((C60555uf) tzVar.build());
        }
        Duration ofMillis = Duration.ofMillis(this.f212520c.mo26871c());
        Duration ofMillis2 = Duration.ofMillis(this.f212520c.mo26874f());
        Bundle g = C90772bp.m148299g(bundle);
        this.f212521d.mo72232e(i3);
        C82906ev evVar = (C82906ev) C82907ew.f226160o.createBuilder();
        e eVar = e.a;
        if (g != null) {
            Intent a = C74867ap.m121045a(g);
            if (a == null || !a.hasExtra("utterance_id")) {
                C58835az b = g.b(g, ofMillis, ofMillis2, C59562r.NGA_ON_SHOW);
                String str = null;
                if (((C59562r) b.f156632b).equals(C59562r.SYS_UI)) {
                    b bVar = this.f212523f;
                    C82983hr hrVar = C82983hr.SYSUI_INVOCATION;
                    long nanos = ((Duration) b.f156631a).toNanos();
                    C82980ho hoVar = (C82980ho) C82981hp.f226382f.createBuilder();
                    hoVar.copyOnWrite();
                    C82981hp hpVar = (C82981hp) hoVar.instance;
                    hpVar.f226385b = hrVar.f226438V;
                    hpVar.f226384a |= 1;
                    b bVar2 = bVar;
                    long a2 = bVar2.c.mo26884a();
                    hoVar.copyOnWrite();
                    C82981hp hpVar2 = (C82981hp) hoVar.instance;
                    hpVar2.f226384a |= 8;
                    hpVar2.f226388e = a2 - nanos;
                    bVar2.a(hoVar, (String) null, (String) null);
                }
                e b2 = C74867ap.m121046b(g, a, i3, this.f212522e);
                if (g.getBoolean("is_optimized_on_show", false)) {
                    evVar.copyOnWrite();
                    C82907ew ewVar = (C82907ew) evVar.instance;
                    ewVar.f226162a |= 4096;
                    ewVar.f226175n = true;
                }
                if (a != null) {
                    str = a.getStringExtra("nga_source");
                }
                if (str == null) {
                    str = g.c(b2, g);
                }
                evVar.copyOnWrite();
                C82907ew ewVar2 = (C82907ew) evVar.instance;
                str.getClass();
                ewVar2.f226162a |= 2;
                ewVar2.f226164c = str;
                long millis = ((Duration) b.f156631a).toMillis();
                evVar.copyOnWrite();
                C82907ew ewVar3 = (C82907ew) evVar.instance;
                ewVar3.f226162a |= 8;
                ewVar3.f226166e = millis;
                evVar.copyOnWrite();
                C82907ew ewVar4 = (C82907ew) evVar.instance;
                ewVar4.f226165d = ((C59562r) b.f156632b).f158049e;
                ewVar4.f226162a |= 4;
                long millis2 = ofMillis.toMillis();
                evVar.copyOnWrite();
                C82907ew ewVar5 = (C82907ew) evVar.instance;
                ewVar5.f226162a |= 64;
                ewVar5.f226169h = millis2;
                if (g.containsKey("invocation_phone_state")) {
                    int i4 = g.getInt("invocation_phone_state");
                    int a3 = C59564t.m92367a(i4);
                    if (a3 == 0) {
                        ((C58970a) ((C58970a) f212518a.mo56226d()).mo56372aa(3714)).mo56387q("Unexpected phone state: %s", i4);
                        a3 = 1;
                    }
                    evVar.copyOnWrite();
                    C82907ew ewVar6 = (C82907ew) evVar.instance;
                    ewVar6.f226168g = a3 - 1;
                    ewVar6.f226162a |= 32;
                }
                if (g.containsKey("latency_id")) {
                    long j = g.getLong("latency_id");
                    evVar.copyOnWrite();
                    C82907ew ewVar7 = (C82907ew) evVar.instance;
                    ewVar7.f226162a |= 16;
                    ewVar7.f226167f = j;
                }
                if (a != null && a.getBooleanExtra("nga_request_from_opa", false)) {
                    evVar.copyOnWrite();
                    C82907ew ewVar8 = (C82907ew) evVar.instance;
                    ewVar8.f226162a |= 128;
                    ewVar8.f226170i = true;
                }
                eVar = b2;
            } else {
                return;
            }
        }
        evVar.copyOnWrite();
        C82907ew ewVar9 = (C82907ew) evVar.instance;
        ewVar9.f226163b = eVar.ca;
        ewVar9.f226162a |= 1;
        if (this.f212526i.mo85405j(C90063do.f249392cf) && C89988b.m146549b(this.f212526i.mo85403h(C90063do.f249514ev)).contains(Integer.valueOf(eVar.ca))) {
            C74775ax axVar = this.f212531n;
            axVar.f208903b.mo28212l("[NGA] OpaKeyboardEntryPointImpl.openIntentLauncher", new aw(axVar, ((C82907ew) evVar.instance).f226164c));
        } else if (this.f212525h.mo74958s() || C89988b.m146549b(this.f212526i.mo85403h(C90126fx.f251534kd)).contains(Integer.valueOf(eVar.ca))) {
            C58800sl lA = this.f212527j.f208880a.iterator();
            while (lA.hasNext()) {
                if (((C74766b) lA.next()).mo71169a(eVar)) {
                    ((C58970a) ((C58970a) f212518a.mo56224b()).mo56372aa(3711)).mo56386p("Invocation cancelled for OOBE.");
                    i2 = 4;
                    break;
                }
            }
            if (!this.f212526i.mo85405j(C90037cp.f248426aG) || !C89988b.m146549b(this.f212526i.mo85403h(C90037cp.f248598dp)).contains(Integer.valueOf(eVar.ca))) {
                this.f212519b.mo71316a((C82907ew) evVar.build());
            } else if (this.f212526i.mo85405j(C90037cp.f248428aI)) {
                int b3 = mo72380b(((Boolean) this.f212530m.f212422a.get()).booleanValue());
                evVar.copyOnWrite();
                C82907ew ewVar10 = (C82907ew) evVar.instance;
                ewVar10.f226171j = b3 - 1;
                ewVar10.f226162a |= 256;
                this.f212519b.mo71316a((C82907ew) evVar.build());
            } else if (!this.f212530m.mo71200a()) {
                C73848bu buVar = this.f212529l;
                C60856cj.m92911t(buVar.mo65334a(buVar.f195151a), new C76992cj(this, evVar), C60826bg.f164896a);
            } else {
                evVar.copyOnWrite();
                C82907ew ewVar11 = (C82907ew) evVar.instance;
                ewVar11.f226171j = 2;
                ewVar11.f226162a |= 256;
                this.f212519b.mo71316a((C82907ew) evVar.build());
            }
        } else {
            C74775ax axVar2 = this.f212531n;
            axVar2.f208903b.mo28212l("[NGA] OpaKeyboardEntryPointImpl.openWithKeyboard", new av(axVar2, ((C82907ew) evVar.instance).f226164c));
        }
        i2 = 1;
        this.f212528k.mo75556c(11, eVar.ca, i2);
    }

    /* renamed from: b */
    public final int mo72380b(boolean z) {
        if (z) {
            return this.f212526i.mo85405j(C90037cp.f248427aH) ? 4 : 2;
        }
        return 3;
    }
}
