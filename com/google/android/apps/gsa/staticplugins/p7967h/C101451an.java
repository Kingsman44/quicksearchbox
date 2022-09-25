package com.google.android.apps.gsa.staticplugins.p7967h;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.binaries.satin.app.C73978cr;
import com.google.android.apps.gsa.binaries.satin.app.ct;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C84924b;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85002e;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85003f;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85006i;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85007j;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85477a;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85485b;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85486c;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85487d;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85488e;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85489f;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85490g;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85491h;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.shared.p7066m.C90055dg;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109029a;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.assistant.p3803ag.p3804a.p3805a.C48789i;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5036r.C65327m;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.an */
/* compiled from: PG */
public final class C101451an extends C86734a implements C85492i {

    /* renamed from: a */
    public static final C59071e f283032a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.h.an");

    /* renamed from: m */
    private static final long f283033m = TimeUnit.HOURS.toMillis(1);

    /* renamed from: b */
    public final C86124t f283034b;

    /* renamed from: c */
    public final C85006i f283035c;

    /* renamed from: f */
    public final C84924b f283036f;

    /* renamed from: g */
    public final C85002e f283037g;

    /* renamed from: h */
    public final C22871g f283038h;

    /* renamed from: i */
    public final C85003f f283039i;

    /* renamed from: j */
    public final C85007j f283040j;

    /* renamed from: k */
    public final C58833ax f283041k;

    /* renamed from: l */
    public SettableFuture f283042l = new SettableFuture();

    /* renamed from: n */
    private final Context f283043n;

    /* renamed from: o */
    private final C68214a f283044o;

    /* renamed from: p */
    private final C21370a f283045p;

    /* renamed from: q */
    private final C86054o f283046q;

    /* renamed from: r */
    private final C58833ax f283047r;

    /* renamed from: s */
    private final List f283048s = new ArrayList();

    /* renamed from: t */
    private final SharedPreferences f283049t;

    /* renamed from: u */
    private final C22871g f283050u;

    /* renamed from: v */
    private final C68214a f283051v;

    /* renamed from: w */
    private final bm f283052w;

    /* renamed from: x */
    private final C68214a f283053x;

    /* renamed from: y */
    private final C113787bc f283054y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101451an(Context context, C68214a aVar, C21370a aVar2, C68214a aVar3, C86054o oVar, C68214a aVar4, C85006i iVar, C84924b bVar, C85002e eVar, SharedPreferences sharedPreferences, C22871g gVar, C22871g gVar2, C68214a aVar5, C113787bc bcVar, bm bmVar, C68214a aVar6, C85003f fVar, C85007j jVar, C58833ax axVar) {
        super(C118575h.WORKER_ASSISTANT_CLIENT_SYNC, "assistantclientsync");
        this.f283043n = context;
        this.f283044o = aVar;
        this.f283045p = aVar2;
        this.f283034b = (C86124t) aVar3.mo27525b();
        this.f283046q = oVar;
        this.f283047r = (C58833ax) aVar4.mo27525b();
        this.f283035c = iVar;
        this.f283036f = bVar;
        this.f283037g = eVar;
        this.f283049t = sharedPreferences;
        this.f283038h = gVar;
        this.f283050u = gVar2;
        this.f283051v = aVar5;
        this.f283054y = bcVar;
        this.f283052w = bmVar;
        this.f283053x = aVar6;
        this.f283039i = fVar;
        this.f283040j = jVar;
        this.f283041k = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo78997a(long j) {
        C58976aa aaVar = C58975e.f156826a;
        return C90877ak.m148471e(this.f283042l, j, TimeUnit.MILLISECONDS, this.f283050u);
    }

    /* JADX WARNING: type inference failed for: r5v15, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo78998c(byte[] r5) {
        /*
            r4 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.shared.service.b.ae r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae.f237132p
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ad r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.search.shared.service.b.ae r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae) r1
            int r2 = r1.f237134a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r1.f237134a = r2
            r2 = 0
            r1.f237144k = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.search.shared.service.b.ae r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae) r0
            com.google.android.apps.gsa.search.core.i.t r1 = r4.f283034b
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90080ee.f249819r
            boolean r1 = r1.mo79746e(r2)
            if (r1 != 0) goto L_0x0090
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ad r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad) r0
            com.google.assistant.s.a.hs r1 = com.google.assistant.p3994s.p3995a.C53271hs.f139650u
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.s.a.hp r1 = (com.google.assistant.p3994s.p3995a.C53268hp) r1
            com.google.protobuf.z r5 = com.google.protobuf.C63088z.m96139A(r5)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.s.a.hs r2 = (com.google.assistant.p3994s.p3995a.C53271hs) r2
            int r3 = r2.f139652a
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r2.f139652a = r3
            r2.f139666o = r5
            com.google.assistant.s.a.j r5 = com.google.assistant.p3994s.p3995a.C53306j.MAIN_APP
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.s.a.hs r2 = (com.google.assistant.p3994s.p3995a.C53271hs) r2
            int r5 = r5.f139793X
            r2.f139663l = r5
            int r5 = r2.f139652a
            r5 = r5 | 512(0x200, float:7.175E-43)
            r2.f139652a = r5
            com.google.assistant.s.a.hr r5 = com.google.assistant.p3994s.p3995a.C53270hr.PUSH_TO_REFRESH
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.s.a.hs r2 = (com.google.assistant.p3994s.p3995a.C53271hs) r2
            int r5 = r5.f139649g
            r2.f139665n = r5
            int r5 = r2.f139652a
            r5 = r5 | 2048(0x800, float:2.87E-42)
            r2.f139652a = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.gsa.search.shared.service.b.ae r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae) r5
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.s.a.hs r1 = (com.google.assistant.p3994s.p3995a.C53271hs) r1
            r1.getClass()
            r5.f237136c = r1
            int r1 = r5.f237134a
            r1 = r1 | 2
            r5.f237134a = r1
            com.google.protobuf.bv r5 = r0.build()
            r0 = r5
            com.google.android.apps.gsa.search.shared.service.b.ae r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae) r0
        L_0x0090:
            com.google.android.apps.gsa.staticplugins.h.ag r5 = new com.google.android.apps.gsa.staticplugins.h.ag
            r5.<init>(r4)
            r4.mo79001f(r0, r5)
            com.google.common.util.concurrent.SettableFuture r5 = r5.f283020a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            com.google.android.libraries.gsa.k.g r1 = r4.f283050u
            r2 = 10
            com.google.common.util.concurrent.cx r5 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148471e(r5, r2, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7967h.C101451an.mo78998c(byte[]):com.google.common.util.concurrent.cx");
    }

    /* renamed from: d */
    public final C60870cx mo78999d(C53271hs hsVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = hsVar.f139663l;
        C53306j jVar = C53306j.UNKNOWNN;
        C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
        adVar.copyOnWrite();
        C87696ae aeVar = (C87696ae) adVar.instance;
        aeVar.f237134a |= 1024;
        aeVar.f237144k = false;
        int i2 = 2;
        if (!this.f283034b.mo79746e(C90080ee.f249819r)) {
            C53268hp hpVar = (C53268hp) hsVar.toBuilder();
            C53270hr hrVar = C53270hr.BACKGROUND_REFRESH;
            hpVar.copyOnWrite();
            C53271hs hsVar2 = (C53271hs) hpVar.instance;
            hsVar2.f139665n = hrVar.f139649g;
            hsVar2.f139652a |= 2048;
            C53271hs hsVar3 = (C53271hs) hpVar.build();
            adVar.copyOnWrite();
            C87696ae aeVar2 = (C87696ae) adVar.instance;
            hsVar3.getClass();
            aeVar2.f237136c = hsVar3;
            aeVar2.f237134a |= 2;
        }
        if (this.f283034b.mo79746e(C90014bt.f247273dz)) {
            C65327m mVar = C65327m.f176666i;
            adVar.copyOnWrite();
            C87696ae aeVar3 = (C87696ae) adVar.instance;
            mVar.getClass();
            aeVar3.f237147n = mVar;
            aeVar3.f237134a |= 8192;
        }
        if (this.f283034b.mo79746e(C90055dg.f248997b)) {
            C48789i iVar = C48789i.f126241e;
            adVar.copyOnWrite();
            C87696ae aeVar4 = (C87696ae) adVar.instance;
            iVar.getClass();
            aeVar4.f237142i = iVar;
            aeVar4.f237134a |= 256;
        }
        if (this.f283034b.mo79746e(C90080ee.f249823v)) {
            boolean e = this.f283034b.mo79746e(C90080ee.f249817p);
            PackageManager packageManager = this.f283043n.getPackageManager();
            ComponentName componentName = new ComponentName(this.f283043n, "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.WeatherWidget_Receiver");
            if (true == e) {
                i2 = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, i2, 1);
            this.f283043n.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f283043n, "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.FreeformWeatherWidget_Receiver"), i2, 1);
        }
        C53306j a = C53306j.m86809a(hsVar.f139663l);
        if (a == null) {
            a = C53306j.UNKNOWNN;
        }
        if (a.equals(C53306j.MAIN_APP) && !this.f283034b.mo79746e(C90053de.f248939F) && (!this.f283034b.mo79746e(C90037cp.f248401I) || this.f283034b.mo79746e(C90037cp.f248605dw))) {
            return mo92301h((C87696ae) adVar.build());
        }
        if (this.f283034b.mo79746e(C90037cp.f248401I)) {
            return this.f283038h.mo28210j(this.f283036f.mo78592a(), "opaChalkBoard#buildChalkboardPrefetchRequest", new C101487w(this, adVar));
        }
        return this.f283038h.mo28210j(this.f283036f.mo78593b(), "opaChalkBoard#buildPrefetchRequest", new C101488x(this, adVar));
    }

    /* renamed from: e */
    public final void mo79000e(C53306j jVar) {
        C86124t tVar = this.f283034b;
        C58833ax axVar = this.f283047r;
        if (!axVar.mo56113h() || !((C109029a) axVar.mo56107c()).mo97399d()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (!tVar.mo79746e(C90014bt.f247188cT)) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else {
            long b = this.f283045p.mo26870b() - this.f283049t.getLong(String.format("%s%s_%s_%s", new Object[]{"opa_zero_state_last_updated_time_millis_", this.f283046q.mo79659F(), this.f283052w.b(), jVar.name()}), 0);
            long a = this.f283034b.mo79743a(C90014bt.f247406gZ) * f283033m;
            if (this.f283034b.mo79746e(C90014bt.f247282eH) && b >= a) {
                C58976aa aaVar3 = C58975e.f156826a;
                if (!this.f283034b.mo79746e(C90080ee.f249819r)) {
                    C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
                    adVar.copyOnWrite();
                    C87696ae aeVar = (C87696ae) adVar.instance;
                    aeVar.f237134a |= 1024;
                    aeVar.f237144k = false;
                    C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
                    hpVar.copyOnWrite();
                    C53271hs hsVar = (C53271hs) hpVar.instance;
                    hsVar.f139663l = jVar.f139793X;
                    hsVar.f139652a |= 512;
                    C53270hr hrVar = C53270hr.PREFETCH;
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
                    mo79001f((C87696ae) adVar.build(), new C101447aj(this));
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo79001f(C87696ae aeVar, C85491h hVar) {
        C58976aa aaVar = C58975e.f156826a;
        if ((aeVar.f237134a & 2) != 0) {
            C53271hs hsVar = aeVar.f237136c;
            if (hsVar == null) {
                hsVar = C53271hs.f139650u;
            }
            C53268hp hpVar = (C53268hp) hsVar.toBuilder();
            boolean z = false;
            if (!((Boolean) this.f283051v.mo27525b()).booleanValue() && ((this.f283054y.mo100632l() && this.f283046q.mo79668a() != null) || !this.f283052w.l())) {
                z = true;
            }
            hpVar.copyOnWrite();
            C53271hs hsVar2 = (C53271hs) hpVar.instance;
            hsVar2.f139652a |= 1024;
            hsVar2.f139664m = z;
            C53271hs hsVar3 = (C53271hs) hpVar.build();
            C87695ad adVar = (C87695ad) aeVar.toBuilder();
            adVar.copyOnWrite();
            C87696ae aeVar2 = (C87696ae) adVar.instance;
            hsVar3.getClass();
            aeVar2.f237136c = hsVar3;
            aeVar2.f237134a |= 2;
            aeVar = (C87696ae) adVar.build();
            C68214a aVar = this.f283053x;
            C22871g gVar = this.f283050u;
            C86124t tVar = this.f283034b;
            C53306j a = C53306j.m86809a(hsVar3.f139663l);
            if (a == null) {
                a = C53306j.UNKNOWNN;
            }
            C53306j jVar = a;
            C53270hr a2 = C53270hr.m86801a(hsVar3.f139665n);
            if (a2 == null) {
                a2 = C53270hr.UNKNOWN;
            }
            C85490g gVar2 = new C85490g(hVar, aVar, gVar, tVar, jVar, a2);
            int i = aeVar.f237134a & 64;
            C53306j a3 = C53306j.m86809a(hsVar3.f139663l);
            if (a3 == null) {
                a3 = C53306j.UNKNOWNN;
            }
            C53270hr a4 = C53270hr.m86801a(hsVar3.f139665n);
            if (a4 == null) {
                a4 = C53270hr.UNKNOWN;
            }
            C60856cj.m92911t(C90877ak.m148471e(gVar2.f231332c, gVar2.f231335f.mo79743a(C90014bt.f247810oF), TimeUnit.SECONDS, gVar2.f231334e), new C85488e(gVar2, C31167ax.m58112a().mo36912c()), C60826bg.f164896a);
            if (a4 == C53270hr.REFRESH || a3 != C53306j.MAIN_APP) {
                C89849ae aeVar3 = (C89849ae) C85489f.REQUEST_SEND.f231329d.get(gVar2.f231336g);
                if (aeVar3 != null) {
                    String l = Long.toString(C90719ac.f253778a.f253779b.nextLong());
                    gVar2.mo79003b(aeVar3, l, C58836b.f156633a);
                    C60870cx e = C90877ak.m148471e(gVar2.f231331b, gVar2.f231335f.mo79743a(C90014bt.f247810oF), TimeUnit.SECONDS, gVar2.f231334e);
                    C89849ae aeVar4 = (C89849ae) C85489f.REQUEST_SUCCESS.f231329d.get(gVar2.f231336g);
                    C89849ae aeVar5 = (C89849ae) C85489f.REQUEST_TIMEOUT.f231329d.get(gVar2.f231336g);
                    if (!(aeVar4 == null || aeVar5 == null)) {
                        new C90873ag(e, gVar2.f231334e, "attach proactive assistant request timeout callback", new C85477a(gVar2, aeVar4, l)).mo85223a(new C85485b(gVar2, aeVar5, l));
                    }
                }
                if (i != 0) {
                    ((C89859i) gVar2.f231330a.mo27525b()).mo83702b(C89849ae.OPA_ZERO_STATE_MEDIA_RECOMMENDATION_CLIENT_SYNC_REQUEST_SENT);
                    C60870cx e2 = C90877ak.m148471e(gVar2.f231333d, gVar2.f231335f.mo79743a(C90014bt.f247810oF), TimeUnit.SECONDS, gVar2.f231334e);
                    C89849ae aeVar6 = C89849ae.OPA_ZERO_STATE_MEDIA_RECOMMENDATION_CLIENT_SYNC_REQUEST_SUCCESS;
                    C89849ae aeVar7 = C89849ae.OPA_ZERO_STATE_MEDIA_RECOMMENDATION_CLIENT_SYNC_REQUEST_TIMEOUT;
                    if (!(aeVar6 == null || aeVar7 == null)) {
                        new C90873ag(e2, gVar2.f231334e, "attach proactive assistant media recommendation request timeout callback", new C85486c(gVar2, aeVar6)).mo85223a(new C85487d(gVar2, aeVar7));
                    }
                }
            }
            hVar = gVar2;
        }
        C101486v vVar = (C101486v) this.f283044o.mo27525b();
        aeVar.getClass();
        hVar.getClass();
        C84466a aVar2 = (C84466a) vVar.f283216a.mo17428b();
        aVar2.getClass();
        C101485u uVar = new C101485u(aeVar, hVar, aVar2, vVar.f283217b);
        C89356b bVar = uVar.f283214d;
        if (bVar != null) {
            bVar.mo83286e().mo54566a();
        }
        C89356b a5 = uVar.f283215e.mo78025a("AssistantClientSync", 560, 523);
        uVar.f283214d = a5;
        C73978cr crVar = (C73978cr) uVar.f283213c.mo17428b();
        crVar.f205870c = uVar.f283211a;
        crVar.f205872e = uVar.f283212b;
        crVar.f205871d = a5;
        C68225k.m98529a(crVar.f205870c, C87696ae.class);
        C68225k.m98529a(crVar.f205871d, C89356b.class);
        C68225k.m98529a(crVar.f205872e, C85491h.class);
        new ct(crVar.f205868a, crVar.f205869b, crVar.f205870c, crVar.f205871d, crVar.f205872e).c.mo60297gq();
        this.f283048s.add(new WeakReference(uVar));
    }

    /* renamed from: g */
    public final C60870cx mo79002g(byte[] bArr, boolean z, boolean z2) {
        C53306j jVar;
        C58976aa aaVar = C58975e.f156826a;
        C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
        adVar.copyOnWrite();
        C87696ae aeVar = (C87696ae) adVar.instance;
        aeVar.f237134a |= 1024;
        aeVar.f237144k = z;
        C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
        C63088z A = C63088z.m96139A(bArr);
        hpVar.copyOnWrite();
        C53271hs hsVar = (C53271hs) hpVar.instance;
        hsVar.f139652a |= 4096;
        hsVar.f139666o = A;
        if (!z2 || !this.f283034b.mo79746e(C90014bt.f247302eb)) {
            jVar = C53306j.MAIN_APP;
        } else {
            jVar = C53306j.OPA_SMARTSPACE;
        }
        hpVar.copyOnWrite();
        C53271hs hsVar2 = (C53271hs) hpVar.instance;
        hsVar2.f139663l = jVar.f139793X;
        hsVar2.f139652a |= 512;
        C53270hr hrVar = C53270hr.BACKGROUND_REFRESH;
        hpVar.copyOnWrite();
        C53271hs hsVar3 = (C53271hs) hpVar.instance;
        hsVar3.f139665n = hrVar.f139649g;
        hsVar3.f139652a |= 2048;
        adVar.copyOnWrite();
        C87696ae aeVar2 = (C87696ae) adVar.instance;
        C53271hs hsVar4 = (C53271hs) hpVar.build();
        hsVar4.getClass();
        aeVar2.f237136c = hsVar4;
        aeVar2.f237134a |= 2;
        C101450am amVar = new C101450am(this, true, Boolean.valueOf(z2));
        mo79001f((C87696ae) adVar.build(), amVar);
        return C90877ak.m148471e(amVar.f283028a, 10, TimeUnit.MINUTES, this.f283050u);
    }

    /* renamed from: h */
    public final C60870cx mo92301h(C87696ae aeVar) {
        C101444ag agVar = new C101444ag(this);
        mo79001f(aeVar, agVar);
        return C90877ak.m148471e(agVar.f283020a, 10, TimeUnit.MINUTES, this.f283050u);
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        C89356b bVar;
        C58976aa aaVar = C58975e.f156826a;
        for (WeakReference weakReference : this.f283048s) {
            C101485u uVar = (C101485u) weakReference.get();
            if (!(uVar == null || (bVar = uVar.f283214d) == null)) {
                bVar.mo83286e().mo54566a();
                uVar.f283214d = null;
            }
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
