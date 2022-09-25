package com.google.android.apps.gsa.staticplugins.avocado;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.features.av.bg;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.avocado.ai;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.avocado.p7420b.C94189f;
import com.google.android.apps.gsa.staticplugins.avocado.p7420b.C94194k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ca */
/* compiled from: PG */
public final class C94222ca extends C83870ad {

    /* renamed from: a */
    public static final C59071e f263259a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.ca");

    /* renamed from: b */
    public Bundle f263260b = new Bundle();

    /* renamed from: c */
    public int f263261c = 0;

    /* renamed from: d */
    public int f263262d = 0;

    /* renamed from: e */
    public int f263263e = 1;

    /* renamed from: f */
    int f263264f = 1;

    /* renamed from: g */
    private final C94324k f263265g;

    /* renamed from: h */
    private final C94315fm f263266h;

    /* renamed from: i */
    private final C94263do f263267i;

    /* renamed from: j */
    private final C94175as f263268j;

    /* renamed from: k */
    private final C94194k f263269k;

    /* renamed from: l */
    private final C94189f f263270l;

    /* renamed from: m */
    private final ai f263271m;

    /* renamed from: n */
    private final C90021c f263272n;

    /* renamed from: o */
    private final Bundle f263273o;

    /* renamed from: p */
    private final C94197bc f263274p;

    /* renamed from: q */
    private final C68214a f263275q;

    /* renamed from: r */
    private final C68214a f263276r;

    /* renamed from: s */
    private final C84026u f263277s;

    /* renamed from: t */
    private final C83893b f263278t;

    /* renamed from: u */
    private C83923j f263279u;

    /* renamed from: v */
    private C94323j f263280v;

    /* renamed from: w */
    private C60870cx f263281w;

    public C94222ca(Bundle bundle, C94197bc bcVar, C94324k kVar, C94315fm fmVar, C94263do doVar, C94175as asVar, C94194k kVar2, C94189f fVar, ai aiVar, C90021c cVar, C68214a aVar, C68214a aVar2, C84026u uVar, C83893b bVar) {
        this.f263273o = bundle;
        this.f263274p = bcVar;
        this.f263265g = kVar;
        this.f263266h = fmVar;
        this.f263267i = doVar;
        this.f263268j = asVar;
        this.f263269k = kVar2;
        this.f263270l = fVar;
        this.f263271m = aiVar;
        this.f263272n = cVar;
        this.f263275q = aVar;
        this.f263276r = aVar2;
        this.f263277s = uVar;
        this.f263278t = bVar;
    }

    /* renamed from: a */
    private final C58833ax m155500a() {
        Bundle bundle = new Bundle();
        bg createBuilder = bh.c.createBuilder();
        C83923j jVar = this.f263279u;
        if ((jVar.f228572a & 1) != 0) {
            String str = jVar.f228574c;
            createBuilder.copyOnWrite();
            bh bhVar = createBuilder.instance;
            str.getClass();
            bhVar.a = 2;
            bhVar.b = str;
        } else if (jVar.f228573b.size() > 0) {
            String str2 = ((C83917d) this.f263279u.f228573b.get(0)).f228555b;
            createBuilder.copyOnWrite();
            bh bhVar2 = createBuilder.instance;
            str2.getClass();
            bhVar2.a = 1;
            bhVar2.b = str2;
        }
        ProtoParsers.m95532o(bundle, "recognition_settings_selector_key", createBuilder.build());
        return C58833ax.m90834k(C83875ai.m133541f(this.f263266h, bundle, new C94216bv(this)));
    }

    /* renamed from: b */
    private final C58833ax m155501b() {
        C94323j a = this.f263265g.mo88460a(this.f263279u, this.f263272n.mo79746e(C90082eg.f249909aY));
        this.f263280v = a;
        return C58833ax.m90834k(a);
    }

    /* renamed from: e */
    private final boolean m155502e() {
        C58838bb.m90883r(this.f263281w != null);
        C58838bb.m90883r(C90877ak.m148480n(this.f263281w));
        return this.f263278t.mo77278a().mo56113h() && ((Boolean) C90877ak.m148474h(this.f263281w)).booleanValue();
    }

    /* JADX WARNING: type inference failed for: r1v26, types: [java.io.Serializable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo77210d() {
        /*
            r9 = this;
            com.google.common.f.e r0 = f263259a
            com.google.common.f.x r1 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "AvocadoSLA"
            r1.mo56378ag(r2, r3)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 14264(0x37b8, float:1.9988E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            int r2 = r9.f263264f
            int r4 = r2 + -1
            r5 = 0
            if (r2 == 0) goto L_0x025f
            java.lang.String r2 = "#getNextDelegate currentState %d"
            r1.mo56387q(r2, r4)
            com.google.android.apps.gsa.shared.m.c r1 = r9.f263272n
            boolean r1 = com.google.android.apps.gsa.assistant.shared.p5809c.C73849a.m108439a(r1)
            if (r1 != 0) goto L_0x002e
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x002e:
            int r1 = r9.f263264f
            int r2 = r1 + -1
            if (r1 == 0) goto L_0x025e
            r1 = 6
            r4 = 5
            r6 = 2
            r7 = 0
            r8 = 1
            switch(r2) {
                case 0: goto L_0x01a4;
                case 1: goto L_0x0137;
                case 2: goto L_0x010e;
                case 3: goto L_0x00f3;
                case 4: goto L_0x00b1;
                case 5: goto L_0x0059;
                case 6: goto L_0x0047;
                case 7: goto L_0x0044;
                default: goto L_0x003c;
            }
        L_0x003c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown State."
            r0.<init>(r1)
            throw r0
        L_0x0044:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x0047:
            int r0 = r9.f263262d
            if (r0 != 0) goto L_0x0052
            com.google.android.apps.gsa.staticplugins.avocado.bc r0 = r9.f263274p
            r0.f263196a = r7
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x0052:
            r9.f263264f = r1
            com.google.common.base.ax r0 = r9.m155501b()
            return r0
        L_0x0059:
            com.google.android.apps.gsa.staticplugins.avocado.bc r1 = r9.f263274p
            com.google.android.apps.gsa.staticplugins.avocado.j r2 = r9.f263280v
            int r2 = r2.f263584a
            if (r2 != r6) goto L_0x0062
            r7 = 1
        L_0x0062:
            r1.f263196a = r7
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 14267(0x37bb, float:1.9992E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.android.apps.gsa.staticplugins.avocado.j r1 = r9.f263280v
            int r1 = r1.f263584a
            java.lang.String r2 = "enrollResult is %d"
            r0.mo56387q(r2, r1)
            com.google.android.apps.gsa.shared.m.c r0 = r9.f263272n
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249924an
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x00ae
            com.google.android.apps.gsa.assistant.settings.features.avocado.ai r0 = r9.f263271m
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x0098
            boolean r0 = r9.m155502e()
            if (r0 == 0) goto L_0x00ae
        L_0x0098:
            r0 = 8
            r9.f263264f = r0
            com.google.android.apps.gsa.staticplugins.avocado.as r0 = r9.f263268j
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.apps.gsa.staticplugins.avocado.bz r2 = com.google.android.apps.gsa.staticplugins.avocado.C94220bz.f263254a
            com.google.android.apps.gsa.opaonboarding.t r0 = com.google.android.apps.gsa.opaonboarding.C83875ai.m133541f(r0, r1, r2)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            return r0
        L_0x00ae:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x00b1:
            int r0 = r9.f263261c
            if (r0 != 0) goto L_0x00bc
            com.google.android.apps.gsa.staticplugins.avocado.bc r0 = r9.f263274p
            r0.f263196a = r7
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x00bc:
            com.google.android.apps.gsa.shared.m.c r0 = r9.f263272n
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249924an
            boolean r0 = r0.mo79746e(r2)
            if (r0 == 0) goto L_0x00ec
            com.google.android.apps.gsa.assistant.settings.features.avocado.ai r0 = r9.f263271m
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r9.m155502e()
            if (r0 == 0) goto L_0x00ec
        L_0x00d4:
            r0 = 7
            r9.f263264f = r0
            com.google.android.apps.gsa.staticplugins.avocado.do r0 = r9.f263267i
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.apps.gsa.staticplugins.avocado.by r2 = new com.google.android.apps.gsa.staticplugins.avocado.by
            r2.<init>(r9)
            com.google.android.apps.gsa.opaonboarding.t r0 = com.google.android.apps.gsa.opaonboarding.C83875ai.m133541f(r0, r1, r2)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            return r0
        L_0x00ec:
            r9.f263264f = r1
            com.google.common.base.ax r0 = r9.m155501b()
            return r0
        L_0x00f3:
            int r0 = r9.f263263e
            if (r0 != r8) goto L_0x0107
            dagger.a r0 = r9.f263275q
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_FAILED
            r0.mo83702b(r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x0107:
            r9.f263264f = r4
            com.google.common.base.ax r0 = r9.m155500a()
            return r0
        L_0x010e:
            int r0 = r9.f263263e
            if (r0 != r8) goto L_0x0122
            dagger.a r0 = r9.f263275q
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_FAILED
            r0.mo83702b(r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x0122:
            r0 = 4
            r9.f263264f = r0
            com.google.android.apps.gsa.staticplugins.avocado.b.f r0 = r9.f263270l
            android.os.Bundle r1 = r9.f263260b
            com.google.android.apps.gsa.staticplugins.avocado.bx r2 = new com.google.android.apps.gsa.staticplugins.avocado.bx
            r2.<init>(r9)
            com.google.android.apps.gsa.opaonboarding.t r0 = com.google.android.apps.gsa.opaonboarding.C83875ai.m133541f(r0, r1, r2)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            return r0
        L_0x0137:
            com.google.common.util.concurrent.cx r0 = r9.f263281w
            if (r0 == 0) goto L_0x013c
            r7 = 1
        L_0x013c:
            com.google.common.base.C58838bb.m90883r(r7)
            com.google.common.util.concurrent.cx r0 = r9.f263281w
            boolean r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148480n(r0)
            if (r0 != 0) goto L_0x0157
            dagger.a r0 = r9.f263275q
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_FM_FAILED
            r0.mo83702b(r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x0157:
            com.google.android.apps.gsa.shared.m.c r0 = r9.f263272n
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249924an
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x019d
            boolean r0 = r9.m155502e()
            if (r0 == 0) goto L_0x019d
            com.google.android.apps.gsa.assistant.settings.features.avocado.ai r0 = r9.f263271m
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x019d
            r0 = 3
            r9.f263264f = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.apps.gsa.assistant.b.a.b r1 = com.google.android.apps.gsa.assistant.p510b.p511a.C9439b.FACE_MATCH_ENROLLMENT_ASSISTANT_SETTINGS
            int r1 = r1.f32835aq
            java.lang.String r2 = "enrollment_entry_id"
            r0.putInt(r2, r1)
            com.google.android.apps.gsa.shared.util.ac r1 = com.google.android.apps.gsa.shared.util.C90719ac.f253778a
            java.util.Random r1 = r1.f253779b
            long r1 = r1.nextLong()
            java.lang.String r3 = "enrollment_request_id"
            r0.putLong(r3, r1)
            com.google.android.apps.gsa.staticplugins.avocado.b.k r1 = r9.f263269k
            com.google.android.apps.gsa.staticplugins.avocado.bu r2 = new com.google.android.apps.gsa.staticplugins.avocado.bu
            r2.<init>(r9)
            com.google.android.apps.gsa.opaonboarding.t r0 = com.google.android.apps.gsa.opaonboarding.C83875ai.m133541f(r1, r0, r2)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            return r0
        L_0x019d:
            r9.f263264f = r4
            com.google.common.base.ax r0 = r9.m155500a()
            return r0
        L_0x01a4:
            dagger.a r1 = r9.f263275q
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FACE_MATCH_ENROLLMENT_START
            r1.mo83702b(r2)
            android.os.Bundle r1 = r9.f263273o
            java.lang.String r2 = "avocadoEnrollDeviceMap"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x01c4
            android.os.Bundle r1 = r9.f263273o
            java.io.Serializable r1 = r1.getSerializable(r2)
            r5 = r1
            java.util.HashMap r5 = (java.util.HashMap) r5
        L_0x01c4:
            if (r5 == 0) goto L_0x024b
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x01ce
            goto L_0x024b
        L_0x01ce:
            android.os.Bundle r0 = r9.f263273o
            java.lang.String r1 = "avocadoEnrollStructureId"
            java.lang.String r0 = r0.getString(r1)
            com.google.android.apps.gsa.opaonboarding.d.j r1 = com.google.android.apps.gsa.opaonboarding.p6462d.C83923j.f228570d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.opaonboarding.d.i r1 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83922i) r1
            java.util.Set r2 = r5.entrySet()
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.staticplugins.avocado.bt r3 = com.google.android.apps.gsa.staticplugins.avocado.C94214bt.f263248a
            j$.util.stream.Stream r2 = r2.map(r3)
            j$.util.stream.Collector r3 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r2 = r2.collect(r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.opaonboarding.d.j r3 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83923j) r3
            r3.mo77331a()
            com.google.protobuf.cq r3 = r3.f228573b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r3)
            if (r0 == 0) goto L_0x0215
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.opaonboarding.d.j r2 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83923j) r2
            int r3 = r2.f228572a
            r3 = r3 | r8
            r2.f228572a = r3
            r2.f228574c = r0
        L_0x0215:
            com.google.protobuf.bv r0 = r1.build()
            com.google.android.apps.gsa.opaonboarding.d.j r0 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83923j) r0
            r9.f263279u = r0
            r9.f263264f = r6
            dagger.a r0 = r9.f263276r
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.assistant.shared.cb r0 = (com.google.android.apps.gsa.assistant.shared.cb) r0
            com.google.android.apps.gsa.opaonboarding.b r1 = r9.f263278t
            com.google.common.base.ax r1 = r1.mo77278a()
            java.lang.Object r1 = r1.mo56107c()
            android.accounts.Account r1 = (android.accounts.Account) r1
            int[] r2 = new int[r6]
            r2 = {0, 1} // fill-array
            com.google.common.util.concurrent.cx r0 = r0.c(r1, r2)
            r9.f263281w = r0
            com.google.android.apps.gsa.opaonboarding.ui.u r1 = r9.f263277s
            com.google.android.apps.gsa.staticplugins.avocado.bw r2 = com.google.android.apps.gsa.staticplugins.avocado.C94217bw.f263251a
            com.google.android.apps.gsa.opaonboarding.ui.t r0 = r1.mo77487a(r0, r2)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            return r0
        L_0x024b:
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r3)
            java.lang.String r1 = "No device to enroll"
            r2 = 14265(0x37b9, float:1.999E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            return r0
        L_0x025e:
            throw r5
        L_0x025f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.avocado.C94222ca.mo77210d():com.google.common.base.ax");
    }
}
