package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83784b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85003f;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88314xb;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90070dv;
import com.google.android.apps.gsa.smartspace.C92116l;
import com.google.android.apps.gsa.smartspace.C92117m;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a.C106434a;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.C110851g;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8448a.C110505b;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110538ac;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110547g;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8453d.C110663a;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f.C110679m;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8460k.C110722g;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8464o.C110843b;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p.C110894s;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d.C123904v;
import com.google.android.apps.search.assistant.verticals.ambient.p9928j.C130812a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.C131650d;
import com.google.assistant.p3994s.p3995a.C53121cd;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.e */
/* compiled from: PG */
public final class C110664e extends C86734a implements C85003f {

    /* renamed from: a */
    public static final C59071e f308358a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.e");

    /* renamed from: b */
    public final C110512ac f308359b;

    /* renamed from: c */
    public final C110679m f308360c;

    /* renamed from: f */
    private final C110547g f308361f;

    /* renamed from: g */
    private final C110538ac f308362g;

    /* renamed from: h */
    private final C110722g f308363h;

    /* renamed from: i */
    private final C110663a f308364i;

    /* renamed from: j */
    private final C110843b f308365j;

    /* renamed from: k */
    private final C110505b f308366k;

    /* renamed from: l */
    private final C110851g f308367l;

    /* renamed from: m */
    private final C83794j f308368m;

    /* renamed from: n */
    private final C123904v f308369n;

    /* renamed from: o */
    private final C86124t f308370o;

    /* renamed from: p */
    private final C131650d f308371p;

    /* renamed from: q */
    private final C83784b f308372q;

    /* renamed from: r */
    private final C108013bm f308373r;

    /* renamed from: s */
    private final C60887da f308374s;

    /* renamed from: t */
    private final C110894s f308375t;

    /* renamed from: u */
    private final C130812a f308376u;

    /* renamed from: v */
    private final C106434a f308377v;

    /* renamed from: w */
    private final C130895ag f308378w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110664e(C110512ac acVar, C110547g gVar, C110538ac acVar2, C110722g gVar2, C110663a aVar, C110843b bVar, C110505b bVar2, C110851g gVar3, C83794j jVar, C123904v vVar, C131650d dVar, C83784b bVar3, C110679m mVar, C108013bm bmVar, C60887da daVar, C110894s sVar, C106434a aVar2, C86124t tVar, C130812a aVar3, C130895ag agVar) {
        super(C118575h.WORKER_OPA_SMARTSPACE, "opasmartspace");
        this.f308359b = acVar;
        this.f308361f = gVar;
        this.f308362g = acVar2;
        this.f308363h = gVar2;
        this.f308364i = aVar;
        this.f308365j = bVar;
        this.f308366k = bVar2;
        this.f308367l = gVar3;
        this.f308368m = jVar;
        this.f308369n = vVar;
        this.f308371p = dVar;
        this.f308372q = bVar3;
        this.f308360c = mVar;
        this.f308373r = bmVar;
        this.f308374s = daVar;
        this.f308375t = sVar;
        this.f308377v = aVar2;
        this.f308370o = tVar;
        this.f308376u = aVar3;
        this.f308378w = agVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo78601a(android.content.Intent r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = r17.getAction()
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.WEATHER_DATA_UPDATE"
            boolean r3 = r3.equals(r2)
            java.lang.String r4 = "SmartspaceUpdate_"
            r5 = 0
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x0048
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.d r2 = r1.f308371p
            com.google.android.libraries.performance.primes.au r3 = com.google.android.libraries.performance.primes.C31164au.m58092b(r4)
            com.google.android.libraries.performance.primes.au[] r4 = new com.google.android.libraries.performance.primes.C31164au[r7]
            com.google.assistant.c.cr r8 = com.google.assistant.p3886c.C50794cr.WEATHER
            com.google.android.libraries.performance.primes.au r5 = com.google.android.libraries.performance.primes.C31164au.m58093c(r5, r8)
            r4[r6] = r5
            com.google.android.libraries.performance.primes.au r3 = com.google.android.libraries.performance.primes.C31164au.m58091a(r3, r4)
            r2.mo110242a(r3)
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_SEND_DEVICE_LOCATION_EXTRA"
            boolean r0 = r0.getBooleanExtra(r2, r6)
            if (r0 == 0) goto L_0x003f
            com.google.android.apps.gsa.staticplugins.opa.smartspace.ac r0 = r1.f308359b
            com.google.assistant.s.a.cd r2 = com.google.assistant.p3994s.p3995a.C53121cd.WEATHER
            com.google.bv.d.b.c.i r3 = com.google.p4283bv.p4345d.p4350b.p4353c.C57017i.f152204o
            r0.mo98751d(r2, r7, r3)
            goto L_0x068f
        L_0x003f:
            com.google.android.apps.gsa.staticplugins.opa.smartspace.ac r0 = r1.f308359b
            com.google.assistant.s.a.cd r2 = com.google.assistant.p3994s.p3995a.C53121cd.WEATHER
            r0.mo98750c(r2)
            goto L_0x068f
        L_0x0048:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.CALENDAR_DATA_UPDATE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x05da
            java.lang.String r3 = "com.google.android.apps.gsa.broadcastreceiver.CALENDAR_DATA_UPDATE"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x005a
            goto L_0x05da
        L_0x005a:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.CALENDAR_DATA_REFRESH"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0069
            com.google.android.apps.gsa.staticplugins.opa.smartspace.c.ac r0 = r1.f308362g
            r0.mo98758a()
            goto L_0x068f
        L_0x0069:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.REMINDER_DATA_UPDATE"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x00c4
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.d r0 = r1.f308371p
            com.google.android.libraries.performance.primes.au r2 = com.google.android.libraries.performance.primes.C31164au.m58092b(r4)
            com.google.android.libraries.performance.primes.au[] r3 = new com.google.android.libraries.performance.primes.C31164au[r7]
            com.google.assistant.c.cr r4 = com.google.assistant.p3886c.C50794cr.REMINDER
            com.google.android.libraries.performance.primes.au r4 = com.google.android.libraries.performance.primes.C31164au.m58093c(r5, r4)
            r3[r6] = r4
            com.google.android.libraries.performance.primes.au r2 = com.google.android.libraries.performance.primes.C31164au.m58091a(r2, r3)
            r0.mo110242a(r2)
            com.google.android.apps.gsa.opa.smartspace.j r0 = r1.f308368m
            boolean r0 = r0.mo77186y()
            if (r0 == 0) goto L_0x0097
            com.google.android.apps.search.assistant.platform.pcp.featuredata.d.v r0 = r1.f308369n
            r0.mo106151a()
            goto L_0x068f
        L_0x0097:
            com.google.android.apps.gsa.staticplugins.opa.smartspace.k.g r0 = r1.f308363h
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.opa.smartspace.j r2 = r0.f308515i
            boolean r2 = r2.mo77174l()
            if (r2 == 0) goto L_0x00aa
            com.google.android.apps.gsa.assistant.settings.features.d.u r2 = r0.f308517k
            com.google.common.util.concurrent.cx r2 = r2.c()
            goto L_0x00b6
        L_0x00aa:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
        L_0x00b6:
            com.google.android.libraries.gsa.k.g r3 = r0.f308512f
            com.google.android.apps.gsa.staticplugins.opa.smartspace.k.b r4 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.k.b
            r4.<init>(r0)
            java.lang.String r0 = "isPersonalResponseAllowed"
            r3.mo28210j(r2, r0, r4)
            goto L_0x068f
        L_0x00c4:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_COMMUTE_DATA_UPDATE"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0102
            com.google.android.apps.gsa.staticplugins.opa.smartspace.d.a r2 = r1.f308364i
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.COMMUTE_DATA_UPDATE_EXTRA"
            byte[] r0 = r0.getByteArrayExtra(r3)
            if (r0 == 0) goto L_0x00fe
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x00e9 }
            com.google.android.apps.gsa.smartspace.e r4 = com.google.android.apps.gsa.smartspace.C92109e.f256805i     // Catch:{ ct -> 0x00e9 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r0, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x00e9 }
            com.google.android.apps.gsa.smartspace.e r0 = (com.google.android.apps.gsa.smartspace.C92109e) r0     // Catch:{ ct -> 0x00e9 }
            com.google.android.apps.gsa.search.core.al.db.b r2 = r2.f308357b     // Catch:{ ct -> 0x00e9 }
            r2.mo78853f(r0)     // Catch:{ ct -> 0x00e9 }
            goto L_0x068f
        L_0x00e9:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8453d.C110663a.f308356a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "OpaSSCommuteCtrl"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "invalid Opa-Smartspace commute update proto bytes"
            r4 = 26582(0x67d6, float:3.725E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
        L_0x00fe:
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            goto L_0x068f
        L_0x0102:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.FLIGHT_DATA_UPDATE"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x016d
            com.google.common.f.e r2 = f308358a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Received ACTION_FLIGHT_DATA_UPDATE."
            r8 = 26448(0x6750, float:3.7062E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r8)).mo56386p(r3)
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.d r2 = r1.f308371p
            com.google.android.libraries.performance.primes.au r3 = com.google.android.libraries.performance.primes.C31164au.m58092b(r4)
            com.google.android.libraries.performance.primes.au[] r4 = new com.google.android.libraries.performance.primes.C31164au[r7]
            com.google.assistant.c.cr r7 = com.google.assistant.p3886c.C50794cr.FLIGHT
            com.google.android.libraries.performance.primes.au r5 = com.google.android.libraries.performance.primes.C31164au.m58093c(r5, r7)
            r4[r6] = r5
            com.google.android.libraries.performance.primes.au r3 = com.google.android.libraries.performance.primes.C31164au.m58091a(r3, r4)
            r2.mo110242a(r3)
            com.google.android.apps.gsa.opa.smartspace.j r2 = r1.f308368m
            boolean r2 = r2.mo77182u()
            if (r2 != 0) goto L_0x0165
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.PUSH_MESSAGE"
            byte[] r0 = r0.getByteArrayExtra(r2)
            com.google.bv.d.b.c.i r2 = com.google.p4283bv.p4345d.p4350b.p4353c.C57017i.f152204o
            if (r0 == 0) goto L_0x015c
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x014e }
            com.google.bv.d.b.c.i r4 = com.google.p4283bv.p4345d.p4350b.p4353c.C57017i.f152204o     // Catch:{ ct -> 0x014e }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r0, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x014e }
            com.google.bv.d.b.c.i r0 = (com.google.p4283bv.p4345d.p4350b.p4353c.C57017i) r0     // Catch:{ ct -> 0x014e }
            r2 = r0
            goto L_0x015c
        L_0x014e:
            r0 = move-exception
            com.google.common.f.e r3 = f308358a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "Failed parsing Smartspace FlightStatus push message."
            r5 = 26449(0x6751, float:3.7063E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
        L_0x015c:
            com.google.android.apps.gsa.staticplugins.opa.smartspace.ac r0 = r1.f308359b
            com.google.assistant.s.a.cd r3 = com.google.assistant.p3994s.p3995a.C53121cd.FLIGHT_STATUS
            r0.mo98751d(r3, r6, r2)
            goto L_0x068f
        L_0x0165:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "PCP integration is not supported yet!"
            r0.<init>(r2)
            throw r0
        L_0x016d:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.BIRTHDAY_DATA_UPDATE"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x017e
            com.google.android.apps.gsa.staticplugins.opa.smartspace.ac r0 = r1.f308359b
            com.google.assistant.s.a.cd r2 = com.google.assistant.p3994s.p3995a.C53121cd.BIRTHDAY
            r0.mo98750c(r2)
            goto L_0x068f
        L_0x017e:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.ALARM_DATA_UPDATE"
            boolean r3 = r3.equals(r2)
            r4 = 2
            if (r3 == 0) goto L_0x023d
            com.google.android.apps.gsa.staticplugins.opa.smartspace.a.b r2 = r1.f308366k
            com.google.android.apps.gsa.opa.smartspace.j r0 = r2.f308089c
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f228394e
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247694lw
            boolean r0 = r0.mo79746e(r3)
            if (r0 != 0) goto L_0x019b
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            goto L_0x068f
        L_0x019b:
            com.google.android.apps.gsa.staticplugins.opa.smartspace.p.p r0 = r2.f308090d
            int r3 = r0.mo98917a()
            r5 = 21
            if (r3 >= r5) goto L_0x01b0
            long r5 = r0.mo98918b(r5, r6)
            com.google.android.libraries.f.a r0 = r0.f308928a
            long r8 = r0.mo26870b()
            goto L_0x01ba
        L_0x01b0:
            long r5 = r0.mo98918b(r5, r7)
            com.google.android.libraries.f.a r0 = r0.f308928a
            long r8 = r0.mo26870b()
        L_0x01ba:
            long r5 = r5 - r8
            r8 = 0
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c4
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0208
        L_0x01c4:
            com.google.android.apps.gsa.tasks.t r0 = r2.f308092f
            com.google.android.apps.gsa.tasks.by r3 = com.google.android.apps.gsa.tasks.C118522by.OPA_SMARTSPACE_ALARM_REFRESH
            r0.mo103752c(r3)
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.tasks.t r0 = r2.f308092f
            com.google.android.apps.gsa.tasks.by r3 = com.google.android.apps.gsa.tasks.C118522by.OPA_SMARTSPACE_ALARM_REFRESH
            com.google.android.apps.gsa.tasks.ag r8 = com.google.android.apps.gsa.tasks.C118472ag.f328819i
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.tasks.af r8 = (com.google.android.apps.gsa.tasks.C118471af) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.tasks.ag r9 = (com.google.android.apps.gsa.tasks.C118472ag) r9
            int r10 = r9.f328821a
            r7 = r7 | r10
            r9.f328821a = r7
            r9.f328822b = r5
            r5 = 10
            j$.time.Duration r5 = p3186j$.time.Duration.ofSeconds(r5)
            long r5 = r5.toMillis()
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.android.apps.gsa.tasks.ag r7 = (com.google.android.apps.gsa.tasks.C118472ag) r7
            int r9 = r7.f328821a
            r4 = r4 | r9
            r7.f328821a = r4
            r7.f328823c = r5
            com.google.protobuf.bv r4 = r8.build()
            com.google.android.apps.gsa.tasks.ag r4 = (com.google.android.apps.gsa.tasks.C118472ag) r4
            r0.mo103754e(r3, r4)
        L_0x0208:
            com.google.android.apps.gsa.staticplugins.opa.smartspace.p.p r0 = r2.f308090d
            boolean r0 = r0.mo98919c()
            if (r0 != 0) goto L_0x0214
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            goto L_0x068f
        L_0x0214:
            android.content.Context r0 = r2.f308088b     // Catch:{ all -> 0x0223 }
            com.google.android.apps.gsa.staticplugins.opa.smartspace.a.a r3 = r2.f308091e     // Catch:{ all -> 0x0223 }
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch:{ all -> 0x0223 }
            java.lang.String r5 = "android.app.action.NEXT_ALARM_CLOCK_CHANGED"
            r4.<init>(r5)     // Catch:{ all -> 0x0223 }
            r0.registerReceiver(r3, r4)     // Catch:{ all -> 0x0223 }
            goto L_0x0238
        L_0x0223:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8448a.C110505b.f308087a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "OpaSSAlarmCtrl"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Error thrown when registering alarm receiver"
            r5 = 26509(0x678d, float:3.7147E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
        L_0x0238:
            r2.mo98747a()
            goto L_0x068f
        L_0x023d:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.OOBE_INTRO_UPDATE"
            boolean r3 = r3.equals(r2)
            r5 = -1
            if (r3 == 0) goto L_0x0455
            com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.g r2 = r1.f308367l
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_OOBE_DISCARD_EXTRA"
            boolean r3 = r0.getBooleanExtra(r3, r6)
            java.lang.String r8 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.SMARTSPACE_OOBE_LOCATION_ONLY"
            boolean r0 = r0.getBooleanExtra(r8, r6)
            if (r0 != 0) goto L_0x0267
            com.google.android.apps.gsa.search.core.i.t r8 = r2.f308842d
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247899aN
            boolean r8 = r8.mo79746e(r9)
            if (r8 != 0) goto L_0x0267
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x068f
        L_0x0267:
            if (r0 == 0) goto L_0x027a
            com.google.android.apps.gsa.search.core.i.t r8 = r2.f308842d
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247903aR
            boolean r8 = r8.mo79746e(r9)
            if (r8 != 0) goto L_0x027a
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x068f
        L_0x027a:
            r8 = 16
            if (r0 == 0) goto L_0x0281
            r9 = 16
            goto L_0x0283
        L_0x0281:
            r9 = 13
        L_0x0283:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r3 == 0) goto L_0x02c4
            com.google.android.apps.gsa.smartspace.m r0 = com.google.android.apps.gsa.smartspace.C92117m.f256824i
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.smartspace.j r0 = (com.google.android.apps.gsa.smartspace.C92114j) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.smartspace.m r3 = (com.google.android.apps.gsa.smartspace.C92117m) r3
            int r9 = r9 + r5
            r3.f256832g = r9
            int r4 = r3.f256826a
            r4 = r4 | 64
            r3.f256826a = r4
            com.google.common.v.g r3 = com.google.common.p4580v.C60948g.f165068a
            j$.time.Instant r3 = p3186j$.time.Instant.now()
            long r3 = r3.toEpochMilli()
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.gsa.smartspace.m r5 = (com.google.android.apps.gsa.smartspace.C92117m) r5
            int r6 = r5.f256826a
            r6 = r6 | r8
            r5.f256826a = r6
            r5.f256830e = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.smartspace.m r0 = (com.google.android.apps.gsa.smartspace.C92117m) r0
            com.google.android.apps.gsa.search.core.al.db.b r2 = r2.f308840b
            r2.mo78853f(r0)
            goto L_0x068f
        L_0x02c4:
            com.google.common.v.g r3 = com.google.common.p4580v.C60948g.f165068a
            j$.time.Instant r3 = p3186j$.time.Instant.now()
            j$.time.Duration r10 = com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.C110851g.f308839a
            long r10 = r10.toMillis()
            j$.time.Instant r3 = r3.plusMillis(r10)
            long r10 = r3.toEpochMilli()
            if (r7 == r0) goto L_0x02dd
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.SmartspaceOOBEActivity"
            goto L_0x02df
        L_0x02dd:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.location.SmartspaceOOBELocationActivity"
        L_0x02df:
            com.google.android.apps.gsa.tasks.t r12 = r2.f308843e
            com.google.android.apps.gsa.tasks.by r13 = com.google.android.apps.gsa.tasks.C118522by.SMARTSPACE_OOBE_POPUP
            com.google.android.apps.gsa.tasks.ag r14 = com.google.android.apps.gsa.tasks.C118472ag.f328819i
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.gsa.tasks.af r14 = (com.google.android.apps.gsa.tasks.C118471af) r14
            j$.time.Duration r15 = com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.C110851g.f308839a
            r17 = r9
            long r8 = r15.toMillis()
            r14.copyOnWrite()
            com.google.protobuf.bv r15 = r14.instance
            com.google.android.apps.gsa.tasks.ag r15 = (com.google.android.apps.gsa.tasks.C118472ag) r15
            int r6 = r15.f328821a
            r6 = r6 | r7
            r15.f328821a = r6
            r15.f328822b = r8
            r8 = 30
            j$.time.Duration r6 = p3186j$.time.Duration.ofMinutes(r8)
            long r8 = r6.toMillis()
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.android.apps.gsa.tasks.ag r6 = (com.google.android.apps.gsa.tasks.C118472ag) r6
            int r15 = r6.f328821a
            r15 = r15 | r4
            r6.f328821a = r15
            r6.f328823c = r8
            com.google.protobuf.bv r6 = r14.build()
            com.google.android.apps.gsa.tasks.ag r6 = (com.google.android.apps.gsa.tasks.C118472ag) r6
            r12.mo103754e(r13, r6)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.Context r8 = r2.f308841c
            r6.setClassName(r8, r3)
            com.google.assistant.c.bb r3 = com.google.assistant.p3886c.C50737bb.f132027d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.ay r3 = (com.google.assistant.p3886c.C50713ay) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.assistant.c.bb r8 = (com.google.assistant.p3886c.C50737bb) r8
            r8.f132031c = r4
            int r9 = r8.f132029a
            r9 = r9 | r4
            r8.f132029a = r9
            java.lang.String r6 = r6.toUri(r7)
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.assistant.c.bb r8 = (com.google.assistant.p3886c.C50737bb) r8
            r6.getClass()
            int r9 = r8.f132029a
            r9 = r9 | r7
            r8.f132029a = r9
            r8.f132030b = r6
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.c.bb r3 = (com.google.assistant.p3886c.C50737bb) r3
            r6 = 2132088508(0x7f1516bc, float:1.9817301E38)
            if (r0 == 0) goto L_0x036c
            android.content.Context r8 = r2.f308841c
            r9 = 2132089156(0x7f151944, float:1.9818616E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0372
        L_0x036c:
            android.content.Context r8 = r2.f308841c
            java.lang.String r8 = r8.getString(r6)
        L_0x0372:
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x03bd
            com.google.android.apps.gsa.search.core.i.t r8 = r2.f308842d
            com.google.android.apps.gsa.shared.m.h r9 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f248002cb
            java.lang.String r8 = r8.mo79758x(r9)
            boolean r9 = com.google.common.base.C58837ba.m90859h(r8)
            if (r9 == 0) goto L_0x038c
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            goto L_0x03a9
        L_0x038c:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r12 = "#"
            java.lang.String[] r8 = r8.split(r12, r5)
            r12 = 0
        L_0x0398:
            int r13 = r8.length
            int r13 = r13 + r5
            if (r12 >= r13) goto L_0x03a8
            r13 = r8[r12]
            int r14 = r12 + 1
            r14 = r8[r14]
            r9.put(r13, r14)
            int r12 = r12 + 2
            goto L_0x0398
        L_0x03a8:
            r8 = r9
        L_0x03a9:
            if (r0 == 0) goto L_0x03b7
            java.lang.String r6 = "title"
            java.lang.String r9 = ""
            java.lang.Object r6 = p3186j$.util.Map.EL.getOrDefault(r8, r6, r9)
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x03bd
        L_0x03b7:
            android.content.Context r8 = r2.f308841c
            java.lang.String r8 = r8.getString(r6)
        L_0x03bd:
            if (r0 == 0) goto L_0x03c9
            android.content.Context r0 = r2.f308841c
            r6 = 2132089155(0x7f151943, float:1.9818614E38)
            java.lang.String r0 = r0.getString(r6)
            goto L_0x03d2
        L_0x03c9:
            android.content.Context r0 = r2.f308841c
            r6 = 2132088507(0x7f1516bb, float:1.98173E38)
            java.lang.String r0 = r0.getString(r6)
        L_0x03d2:
            com.google.android.apps.gsa.smartspace.m r6 = com.google.android.apps.gsa.smartspace.C92117m.f256824i
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.smartspace.j r6 = (com.google.android.apps.gsa.smartspace.C92114j) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.smartspace.m r9 = (com.google.android.apps.gsa.smartspace.C92117m) r9
            int r5 = r17 + -1
            r9.f256832g = r5
            int r5 = r9.f256826a
            r5 = r5 | 64
            r9.f256826a = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.android.apps.gsa.smartspace.m r5 = (com.google.android.apps.gsa.smartspace.C92117m) r5
            r8.getClass()
            int r9 = r5.f256826a
            r7 = r7 | r9
            r5.f256826a = r7
            r5.f256827b = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.android.apps.gsa.smartspace.m r5 = (com.google.android.apps.gsa.smartspace.C92117m) r5
            r0.getClass()
            int r7 = r5.f256826a
            r4 = r4 | r7
            r5.f256826a = r4
            r5.f256828c = r0
            j$.time.Instant r0 = p3186j$.time.Instant.now()
            long r4 = r0.toEpochMilli()
            r6.copyOnWrite()
            com.google.protobuf.bv r0 = r6.instance
            com.google.android.apps.gsa.smartspace.m r0 = (com.google.android.apps.gsa.smartspace.C92117m) r0
            int r7 = r0.f256826a
            r8 = 16
            r7 = r7 | r8
            r0.f256826a = r7
            r0.f256830e = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r0 = r6.instance
            com.google.android.apps.gsa.smartspace.m r0 = (com.google.android.apps.gsa.smartspace.C92117m) r0
            int r4 = r0.f256826a
            r4 = r4 | 32
            r0.f256826a = r4
            r0.f256831f = r10
            java.lang.String r0 = r3.f132030b
            r6.copyOnWrite()
            com.google.protobuf.bv r3 = r6.instance
            com.google.android.apps.gsa.smartspace.m r3 = (com.google.android.apps.gsa.smartspace.C92117m) r3
            r0.getClass()
            int r4 = r3.f256826a
            r4 = r4 | 128(0x80, float:1.794E-43)
            r3.f256826a = r4
            r3.f256833h = r0
            com.google.protobuf.bv r0 = r6.build()
            com.google.android.apps.gsa.smartspace.m r0 = (com.google.android.apps.gsa.smartspace.C92117m) r0
            com.google.android.apps.gsa.search.core.al.db.b r2 = r2.f308840b
            r2.mo78853f(r0)
            goto L_0x068f
        L_0x0455:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_UPDATE_CURRENT_CARD"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0464
            com.google.android.apps.gsa.opa.smartspace.e.b r0 = r1.f308372q
            r0.mo77117c()
            goto L_0x068f
        L_0x0464:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.FETCH_HOLIDAYS_DEBUG"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0475
            com.google.android.apps.gsa.staticplugins.opa.smartspace.ac r0 = r1.f308359b
            com.google.assistant.s.a.cd r2 = com.google.assistant.p3994s.p3995a.C53121cd.WHEN_IS
            r0.mo98750c(r2)
            goto L_0x068f
        L_0x0475:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_CARD_UPDATE"
            boolean r3 = r3.equals(r2)
            r8 = 1
            if (r3 == 0) goto L_0x04c7
            com.google.android.apps.gsa.staticplugins.opa.smartspace.f.m r0 = r1.f308360c
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f308405e
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247945bG
            boolean r2 = r2.mo79746e(r3)
            if (r2 != 0) goto L_0x04a3
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f.C110679m.f308400a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "EvtSuggsManager"
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Holiday alarms lockscreen UI disabled. Abort."
            r3 = 26631(0x6807, float:3.7318E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            goto L_0x068f
        L_0x04a3:
            com.google.common.v.i r2 = r0.f308409i
            j$.time.ZoneId r3 = r0.f308411k
            j$.time.LocalDate r2 = r2.mo57445b(r3)
            j$.time.LocalDate r2 = r2.plusDays(r8)
            com.google.android.apps.gsa.staticplugins.opa.be.bm r3 = r0.f308408h
            com.google.assistant.s.a.j r4 = com.google.assistant.p3994s.p3995a.C53306j.OPA_SMARTSPACE
            com.google.common.util.concurrent.cx r3 = r3.mo76936k(r4)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.f.b r4 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.f.b
            r4.<init>(r0, r2)
            com.google.common.util.concurrent.da r0 = r0.f308410j
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r4)
            com.google.common.util.concurrent.C60922j.m93045h(r3, r2, r0)
            goto L_0x068f
        L_0x04c7:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_NOTIFICATION_UPDATE"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0502
            com.google.android.apps.gsa.staticplugins.opa.smartspace.f.m r0 = r1.f308360c
            com.google.common.v.i r2 = r0.f308409i
            j$.time.ZoneId r3 = r0.f308411k
            j$.time.LocalDate r2 = r2.mo57445b(r3)
            j$.time.LocalDate r2 = r2.plusDays(r8)
            com.google.android.apps.search.assistant.verticals.ambient.j.a r3 = r0.f308403c
            com.google.common.util.concurrent.cx r3 = r3.mo109828a()
            com.google.android.apps.gsa.staticplugins.opa.be.bm r5 = r0.f308408h
            com.google.assistant.s.a.j r6 = com.google.assistant.p3994s.p3995a.C53306j.OPA_SMARTSPACE
            com.google.common.util.concurrent.cx r5 = r5.mo76936k(r6)
            com.google.common.util.concurrent.cx[] r4 = new com.google.common.util.concurrent.C60870cx[r4]
            r6 = 0
            r4[r6] = r3
            r4[r7] = r5
            com.google.apps.tiktok.tracing.contrib.b.j r4 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84751b(r4)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.f.c r6 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.f.c
            r6.<init>(r0, r3, r2, r5)
            com.google.common.util.concurrent.da r0 = r0.f308410j
            r4.mo51520a(r6, r0)
            goto L_0x068f
        L_0x0502:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_TIME_FENCES"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0522
            com.google.android.apps.gsa.staticplugins.opa.be.bm r0 = r1.f308373r
            com.google.assistant.s.a.j r2 = com.google.assistant.p3994s.p3995a.C53306j.OPA_SMARTSPACE
            com.google.common.util.concurrent.cx r0 = r0.mo76936k(r2)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.c r2 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.c
            r2.<init>(r1)
            com.google.common.util.concurrent.da r3 = r1.f308374s
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r0, r2, r3)
            return r0
        L_0x0522:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.HOLIDAY_ALARMS_MONITORING"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x0569
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.HOLIDAY_ALARMS_MONITORING_HOUR_EXTRA"
            int r2 = r0.getIntExtra(r2, r5)
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.HOLIDAY_ALARMS_MONITORING_MINUTE_EXTRA"
            int r0 = r0.getIntExtra(r3, r5)
            if (r2 < 0) goto L_0x0551
            if (r0 >= 0) goto L_0x053b
            goto L_0x0551
        L_0x053b:
            com.google.android.apps.search.assistant.verticals.ambient.j.a r3 = r1.f308376u
            com.google.common.util.concurrent.cx r3 = r3.mo109828a()
            com.google.android.apps.gsa.staticplugins.opa.smartspace.d r4 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.d
            r4.<init>(r1, r2, r0)
            com.google.common.util.concurrent.da r0 = r1.f308374s
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r4)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r3, r2, r0)
            return r0
        L_0x0551:
            com.google.common.f.e r3 = f308358a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 26447(0x674f, float:3.706E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "Invalid holiday alarms monitoring intent extra! alarmHour=%d, alarmMinute=%d"
            r3.mo56393w(r4, r2, r0)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        L_0x0569:
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_TEST_UPDATE"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x05bc
            com.google.android.apps.gsa.staticplugins.opa.smartspace.p.s r2 = r1.f308375t
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.TEST_REMINDER_EXTRA"
            boolean r3 = r0.hasExtra(r3)
            if (r3 == 0) goto L_0x05b8
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.TEST_REMINDER_DUEDATE_MILLIS"
            r4 = -1
            long r3 = r0.getLongExtra(r3, r4)
            java.lang.String r5 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.TEST_REMINDER_TITLE"
            java.lang.String r0 = r0.getStringExtra(r5)
            if (r0 != 0) goto L_0x058f
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            goto L_0x068f
        L_0x058f:
            com.google.android.gms.reminders.model.ab r5 = new com.google.android.gms.reminders.model.ab
            r5.<init>()
            r5.f394341a = r0
            com.google.android.gms.reminders.model.f r0 = new com.google.android.gms.reminders.model.f
            r0.<init>()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.f394372f = r3
            com.google.android.gms.reminders.model.DateTime r0 = r0.mo122198a()
            r5.mo122170b(r0)
            com.google.android.gms.reminders.model.Task r0 = r5.mo122169a()
            com.google.android.apps.gsa.search.core.al.db.b r2 = r2.f308930a
            com.google.android.gms.reminders.model.TaskEntity r3 = new com.google.android.gms.reminders.model.TaskEntity
            r3.<init>(r0)
            r2.mo78853f(r3)
            goto L_0x068f
        L_0x05b8:
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            goto L_0x068f
        L_0x05bc:
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_GENERATE_ON_DEVICE_MODEL"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x05cb
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.a r0 = r1.f308377v
            r0.mo95531a()
            goto L_0x068f
        L_0x05cb:
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.opa.smartspace.ACTION_REMOVE_ON_DEVICE_MODEL"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x068f
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.a r0 = r1.f308377v
            r0.mo95533c()
            goto L_0x068f
        L_0x05da:
            com.google.android.apps.gsa.staticplugins.opa.smartspace.c.g r2 = r1.f308361f
            com.google.common.f.a.d r0 = r2.f308197j
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r3 = "CalendarController#updateCalendarData()"
            r4 = 26527(0x679f, float:3.7172E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.gsa.opa.smartspace.j r0 = r2.f308196i
            boolean r0 = r0.mo77185x()
            if (r0 == 0) goto L_0x0602
            com.google.common.f.a.d r0 = r2.f308197j
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "PCP migration is enabled for calendar, skip the calendar update."
            r3 = 26530(0x67a2, float:3.7176E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            goto L_0x068f
        L_0x0602:
            com.google.android.apps.gsa.opa.smartspace.j r0 = r2.f308196i
            boolean r0 = r0.mo77171i()
            if (r0 == 0) goto L_0x066e
            android.content.Context r0 = r2.f308198k
            java.lang.String r3 = "jobscheduler"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            if (r0 == 0) goto L_0x066e
            java.util.List r5 = r0.getAllPendingJobs()     // Catch:{ all -> 0x061b }
            goto L_0x062a
        L_0x061b:
            r0 = move-exception
            r3 = r0
            com.google.common.f.a.d r0 = r2.f308197j
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r4 = "Exception when calling getAllPendingJobs()"
            r8 = 26529(0x67a1, float:3.7175E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56382g(r3)).mo56372aa(r8)).mo56386p(r4)
        L_0x062a:
            if (r5 != 0) goto L_0x062f
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            goto L_0x068f
        L_0x062f:
            java.util.Iterator r0 = r5.iterator()
            r3 = 0
        L_0x0634:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x064e
            java.lang.Object r4 = r0.next()
            android.app.job.JobInfo r4 = (android.app.job.JobInfo) r4
            int r4 = r4.getId()
            r5 = -285(0xfffffffffffffee3, float:NaN)
            if (r4 != r5) goto L_0x064a
            r4 = 0
            goto L_0x064b
        L_0x064a:
            r4 = 1
        L_0x064b:
            r4 = r4 ^ r7
            r3 = r3 | r4
            goto L_0x0634
        L_0x064e:
            if (r3 != 0) goto L_0x066e
            com.google.android.apps.gsa.opa.smartspace.i r0 = r2.f308199l
            r0.mo77148d()
            com.google.common.f.a.d r0 = r2.f308197j
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101863a
            r3 = 2883585(0x2c0001, float:4.040763E-39)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "Missing calendar refresh task on Smartspace!"
            r5 = 26528(0x67a0, float:3.7174E-41)
            com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa.m158983d(r0, r4, r5, r2, r3)
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            goto L_0x068f
        L_0x066e:
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture
            r0.<init>()
            com.google.android.apps.gsa.opa.smartspace.a.a r3 = r2.f308195h
            com.google.common.util.concurrent.cx r3 = r3.mo77050b()
            com.google.android.libraries.gsa.k.g r4 = r2.f308191d
            com.google.android.apps.gsa.staticplugins.opa.smartspace.c.b r5 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.c.b
            r5.<init>(r2, r0)
            com.google.android.apps.gsa.shared.util.c.ag r6 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r7 = "loadActiveEventsFromOpaStore"
            r6.<init>(r3, r4, r7, r5)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.c.c r3 = new com.google.android.apps.gsa.staticplugins.opa.smartspace.c.c
            r3.<init>(r2, r0)
            r6.mo85223a(r3)
        L_0x068f:
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.smartspace.C110664e.mo78601a(android.content.Intent):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo78602b(C88314xb xbVar) {
        int i = 1;
        if ((xbVar.f238838a & 1) != 0) {
            try {
                C92117m mVar = (C92117m) C62942bv.parseFrom((C62942bv) C92117m.f256824i, xbVar.f238839b);
                if ((mVar.f256826a & 64) != 0) {
                    int a = C92116l.m151154a(mVar.f256832g);
                    if (a != 0) {
                        i = a;
                    }
                    if (i - 1 != 7) {
                        return C118826c.f331423b;
                    }
                    if (this.f308370o.mo79746e(C90070dv.f249749a)) {
                        return C118826c.f331423b;
                    }
                    return this.f308365j.f308817a.mo78853f(mVar);
                }
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f308358a.mo56225c()).mo56382g(e)).mo56372aa(26451)).mo56386p("Invalid SmartspaceGenericUpdate proto bytes");
            }
            return C118826c.f331423b;
        }
        ((C59052c) ((C59052c) f308358a.mo56226d()).mo56372aa(26452)).mo56386p("Received empty data.");
        return C118826c.f331423b;
    }

    /* renamed from: c */
    public final C60870cx mo78603c(C53422nh nhVar) {
        C110512ac acVar = this.f308359b;
        if (!acVar.f308101d.f228394e.mo79746e(C90014bt.f247608kP)) {
            return C118826c.f331423b;
        }
        ArrayList arrayList = new ArrayList();
        C58800sl lA = C83794j.f228389b.iterator();
        while (lA.hasNext()) {
            C53121cd cdVar = (C53121cd) lA.next();
            C59104x b = C110512ac.f308097a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
            ((C59052c) ((C59052c) b).mo56372aa(26486)).mo56389s("sendSmartspaceDataTypes dataType = %s", cdVar.name());
            arrayList.add(acVar.mo98749b(nhVar, cdVar, C57017i.f152204o));
        }
        return C118826c.m197212b(arrayList);
    }

    /* renamed from: e */
    public final void mo98837e(boolean z) {
        this.f308378w.mo109877M(z);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
