package com.google.android.apps.gsa.staticplugins.opa.p8319bb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.nga.api.C74715bp;
import com.google.android.apps.gsa.opa.C83580ak;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83619ah;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83629ar;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83656h;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C84920a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C84997c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6814o.C86187b;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86248cd;
import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.p6816p.C86252g;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6936c.C88394a;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88427ay;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88428az;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88458h;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88459i;
import com.google.android.apps.gsa.shared.p6983ah.C89150g;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106221b;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107555d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107512af;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107513ag;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107514ah;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8305b.C107551c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8305b.C107552d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8305b.C107553e;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107723b;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107729h;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107733l;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107737p;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107739r;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107740s;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107798x;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107799y;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107849aa;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107852ad;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107874az;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107888ba;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107903g;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107911o;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107912p;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.C107839n;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114456cu;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11246g;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11247h;
import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11248i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2998g.p2999a.C38377r;
import com.google.android.libraries.search.p2998g.p2999a.C38378s;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38358i;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51680al;
import com.google.assistant.p3897e.p3921j.C51681am;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58852bp;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.t */
/* compiled from: PG */
public final class C107945t implements C86686h {

    /* renamed from: a */
    public static final C59071e f300328a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.t");

    /* renamed from: h */
    private static final C58528ij f300329h = C58528ij.m90013M(amo.ACETONE_NOW, amo.GEL, amo.PIXEL_LAUNCHER, amo.SEARCH_API_SERVICE);

    /* renamed from: A */
    private final C107733l f300330A;

    /* renamed from: B */
    private final C68214a f300331B;

    /* renamed from: C */
    private final C68214a f300332C;

    /* renamed from: D */
    private final C58833ax f300333D;

    /* renamed from: E */
    private final C83580ak f300334E;

    /* renamed from: F */
    private final C68214a f300335F;

    /* renamed from: G */
    private final C68214a f300336G;

    /* renamed from: H */
    private final C22871g f300337H;

    /* renamed from: I */
    private final C86187b f300338I;

    /* renamed from: J */
    private final C89150g f300339J;

    /* renamed from: K */
    private final C58833ax f300340K;

    /* renamed from: L */
    private final C68214a f300341L;

    /* renamed from: M */
    private final C68214a f300342M;

    /* renamed from: N */
    private final C68214a f300343N;

    /* renamed from: O */
    private final Optional f300344O;

    /* renamed from: P */
    private final C68214a f300345P;

    /* renamed from: Q */
    private final C11248i f300346Q = C11248i.f36668a;

    /* renamed from: R */
    private C107739r f300347R;

    /* renamed from: c */
    public final C68214a f300348c;

    /* renamed from: d */
    public final C68214a f300349d;

    /* renamed from: e */
    public final C22871g f300350e;

    /* renamed from: f */
    public final C68214a f300351f;

    /* renamed from: g */
    public C86697a f300352g;

    /* renamed from: i */
    private final Context f300353i;

    /* renamed from: j */
    private final long f300354j;

    /* renamed from: k */
    private final C68214a f300355k;

    /* renamed from: l */
    private final C68214a f300356l;

    /* renamed from: m */
    private final C68214a f300357m;

    /* renamed from: n */
    private final C68214a f300358n;

    /* renamed from: o */
    private final C86124t f300359o;

    /* renamed from: p */
    private final C68214a f300360p;

    /* renamed from: q */
    private final C68214a f300361q;

    /* renamed from: r */
    private final C68214a f300362r;

    /* renamed from: s */
    private final C68214a f300363s;

    /* renamed from: t */
    private final C68214a f300364t;

    /* renamed from: u */
    private final C85005h f300365u;

    /* renamed from: v */
    private final C84920a f300366v;

    /* renamed from: w */
    private final C84885a f300367w;

    /* renamed from: x */
    private final C84997c f300368x;

    /* renamed from: y */
    private final C68214a f300369y;

    /* renamed from: z */
    private final C107946u f300370z;

    public C107945t(Context context, long j, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C86124t tVar, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C85005h hVar, C84920a aVar13, C84997c cVar, C84885a aVar14, C107946u uVar, C107733l lVar, C68214a aVar15, C68214a aVar16, C58833ax axVar, C83580ak akVar, C68214a aVar17, C68214a aVar18, C22871g gVar, C22871g gVar2, C86187b bVar, C89150g gVar3, C58833ax axVar2, C68214a aVar19, C68214a aVar20, C68214a aVar21, Optional optional, C68214a aVar22, C68214a aVar23) {
        this.f300353i = context;
        this.f300354j = j;
        this.f300348c = aVar;
        this.f300355k = aVar2;
        this.f300356l = aVar3;
        this.f300357m = aVar4;
        this.f300358n = aVar5;
        this.f300359o = tVar;
        this.f300360p = aVar6;
        this.f300365u = hVar;
        this.f300366v = aVar13;
        this.f300367w = aVar14;
        this.f300368x = cVar;
        this.f300349d = aVar7;
        this.f300361q = aVar8;
        this.f300362r = aVar9;
        this.f300369y = aVar10;
        this.f300363s = aVar11;
        this.f300364t = aVar12;
        this.f300370z = uVar;
        this.f300330A = lVar;
        this.f300331B = aVar15;
        this.f300332C = aVar16;
        this.f300333D = axVar;
        this.f300334E = akVar;
        this.f300335F = aVar17;
        this.f300336G = aVar18;
        this.f300337H = gVar;
        this.f300350e = gVar2;
        this.f300338I = bVar;
        this.f300339J = gVar3;
        this.f300340K = axVar2;
        this.f300341L = aVar19;
        this.f300342M = aVar20;
        this.f300343N = aVar21;
        this.f300344O = optional;
        this.f300351f = aVar22;
        this.f300345P = aVar23;
    }

    /* renamed from: o */
    private final void m179207o(C58852bp bpVar) {
        C83619ah ahVar = (C83619ah) C83629ar.f227979f.createBuilder();
        ahVar.copyOnWrite();
        C83629ar arVar = (C83629ar) ahVar.instance;
        arVar.f227984d = 2;
        arVar.f227981a |= 1;
        long j = this.f300354j;
        ahVar.copyOnWrite();
        C83629ar arVar2 = (C83629ar) ahVar.instance;
        arVar2.f227981a = 2 | arVar2.f227981a;
        arVar2.f227985e = j;
        bpVar.mo40846a(ahVar);
        ((C106221b) this.f300361q.mo27525b()).mo95451i((C83629ar) ahVar.build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo96338a(C88458h hVar) {
        C107849aa aaVar = (C107849aa) this.f300369y.mo27525b();
        C58976aa aaVar2 = C58975e.f156826a;
        long j = hVar.f239139b;
        int i = hVar.f239140c;
        new C90873ag(((C84274n) aaVar.f300106f.mo27525b()).mo77786b(), aaVar.f300103c, "get-session-info", new C107911o(aaVar, hVar)).mo85223a(new C107912p(aaVar, hVar));
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final C58528ij mo80292e() {
        return new C58759qy(C87739bu.STOP_SPEAKING);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v23, types: [int] */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: type inference failed for: r7v19, types: [com.google.android.apps.gsa.search.shared.service.b.qa] */
    /* JADX WARNING: type inference failed for: r6v29 */
    /* JADX WARNING: type inference failed for: r6v30 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x05f0  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x067b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80293f(long r17, com.google.android.apps.gsa.search.shared.service.ClientEventData r19, com.google.android.apps.gsa.search.core.service.p6848e.C86681c r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r19
            com.google.android.apps.gsa.search.shared.service.b.bw r2 = r0.f236955a
            int r2 = r2.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r2)
            if (r2 != 0) goto L_0x0010
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x0010:
            com.google.android.apps.gsa.staticplugins.opa.as.b.b.c r3 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8305b.C107551c.UNKNOWN
            int r3 = r2.ordinal()
            r4 = 11
            if (r3 == r4) goto L_0x09cb
            r4 = 92
            r5 = 8
            r6 = 0
            r7 = 0
            r8 = 2
            r9 = 1
            if (r3 == r4) goto L_0x0845
            r4 = 113(0x71, float:1.58E-43)
            if (r3 == r4) goto L_0x07b7
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L_0x0714
            r4 = 117(0x75, float:1.64E-43)
            if (r3 == r4) goto L_0x06d1
            r4 = 177(0xb1, float:2.48E-43)
            r10 = 3
            r11 = 37
            if (r3 == r4) goto L_0x0320
            r4 = 197(0xc5, float:2.76E-43)
            if (r3 == r4) goto L_0x02f8
            r4 = 223(0xdf, float:3.12E-43)
            if (r3 == r4) goto L_0x02bf
            r4 = 230(0xe6, float:3.22E-43)
            if (r3 == r4) goto L_0x02b9
            r4 = 36
            if (r3 == r4) goto L_0x0299
            if (r3 == r11) goto L_0x0281
            r4 = 110(0x6e, float:1.54E-43)
            if (r3 == r4) goto L_0x024f
            r4 = 111(0x6f, float:1.56E-43)
            if (r3 == r4) goto L_0x0174
            r4 = 119(0x77, float:1.67E-43)
            if (r3 == r4) goto L_0x0122
            r4 = 120(0x78, float:1.68E-43)
            if (r3 == r4) goto L_0x005b
            goto L_0x03b7
        L_0x005b:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88121py.f238227a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r3.mo58887l(r2)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 == 0) goto L_0x008f
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88121py.f238227a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x0088
            java.lang.Object r0 = r2.f169969b
            goto L_0x008c
        L_0x0088:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x008c:
            r7 = r0
            com.google.android.apps.gsa.search.shared.service.b.qa r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88124qa) r7
        L_0x008f:
            dagger.a r0 = r1.f300369y
            java.lang.Object r0 = r0.mo27525b()
            r2 = r0
            com.google.android.apps.gsa.staticplugins.opa.bb.e.aa r2 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107849aa) r2
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r7)
            boolean r3 = r0.mo56113h()
            if (r3 == 0) goto L_0x011e
            java.lang.Object r3 = r0.mo56107c()
            com.google.android.apps.gsa.search.shared.service.b.qa r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88124qa) r3
            int r3 = r3.f238230a
            r3 = r3 & r9
            if (r3 == 0) goto L_0x011e
            java.lang.Object r3 = r0.mo56107c()     // Catch:{ ct -> 0x0109 }
            com.google.android.apps.gsa.search.shared.service.b.qa r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88124qa) r3     // Catch:{ ct -> 0x0109 }
            com.google.protobuf.z r3 = r3.f238231b     // Catch:{ ct -> 0x0109 }
            com.google.assistant.e.j.ia r4 = com.google.assistant.p3897e.p3921j.C52176ia.f136911k     // Catch:{ ct -> 0x0109 }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (com.google.protobuf.C63088z) r3)     // Catch:{ ct -> 0x0109 }
            com.google.assistant.e.j.ia r3 = (com.google.assistant.p3897e.p3921j.C52176ia) r3     // Catch:{ ct -> 0x0109 }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ ct -> 0x0109 }
            com.google.android.apps.gsa.search.shared.service.b.qa r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88124qa) r0     // Catch:{ ct -> 0x0109 }
            boolean r0 = r0.f238232c     // Catch:{ ct -> 0x0109 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x0109 }
            long r4 = r3.f136917e     // Catch:{ ct -> 0x0109 }
            dagger.a r4 = r2.f300106f     // Catch:{ ct -> 0x0109 }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ ct -> 0x0109 }
            com.google.android.apps.gsa.s.n r4 = (com.google.android.apps.gsa.p6486s.C84274n) r4     // Catch:{ ct -> 0x0109 }
            com.google.common.util.concurrent.cx r4 = r4.mo77785a()     // Catch:{ ct -> 0x0109 }
            com.google.common.util.concurrent.bs r4 = com.google.common.util.concurrent.C60838bs.m92859i(r4)     // Catch:{ ct -> 0x0109 }
            java.lang.Class<java.lang.RuntimeException> r5 = java.lang.RuntimeException.class
            com.google.android.apps.gsa.staticplugins.opa.bb.e.q r6 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107913q.f300261a     // Catch:{ ct -> 0x0109 }
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ ct -> 0x0109 }
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60846c.m92878g(r4, r5, r6, r7)     // Catch:{ ct -> 0x0109 }
            com.google.android.apps.gsa.staticplugins.opa.bb.e.r r5 = new com.google.android.apps.gsa.staticplugins.opa.bb.e.r     // Catch:{ ct -> 0x0109 }
            r5.<init>(r2, r3, r0)     // Catch:{ ct -> 0x0109 }
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ ct -> 0x0109 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r4, r5, r0)     // Catch:{ ct -> 0x0109 }
            com.google.android.libraries.gsa.k.g r4 = r2.f300103c     // Catch:{ ct -> 0x0109 }
            java.lang.String r5 = "media-session-initiated"
            com.google.android.apps.gsa.staticplugins.opa.bb.e.s r6 = new com.google.android.apps.gsa.staticplugins.opa.bb.e.s     // Catch:{ ct -> 0x0109 }
            r6.<init>(r2, r3)     // Catch:{ ct -> 0x0109 }
            com.google.android.apps.gsa.shared.util.c.ag r3 = new com.google.android.apps.gsa.shared.util.c.ag     // Catch:{ ct -> 0x0109 }
            r3.<init>(r0, r4, r5, r6)     // Catch:{ ct -> 0x0109 }
            java.lang.Class<java.lang.IllegalStateException> r0 = java.lang.IllegalStateException.class
            com.google.android.apps.gsa.staticplugins.opa.bb.e.t r4 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107916t.f300267a     // Catch:{ ct -> 0x0109 }
            r3.mo85224b(r0, r4)     // Catch:{ ct -> 0x0109 }
            com.google.android.apps.gsa.staticplugins.opa.bb.e.u r0 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107917u.f300268a     // Catch:{ ct -> 0x0109 }
            r3.mo85223a(r0)     // Catch:{ ct -> 0x0109 }
            return
        L_0x0109:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107849aa.f300101a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "AudioPlayerSubCtrl"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Trying to parse invalid Media data."
            r5 = 26242(0x6682, float:3.6773E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
        L_0x011e:
            r2.mo96315i()
            return
        L_0x0122:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88108pl.f238209a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r3.mo58887l(r2)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 == 0) goto L_0x0173
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88108pl.f238209a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x014f
            java.lang.Object r0 = r2.f169969b
            goto L_0x0153
        L_0x014f:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x0153:
            com.google.android.apps.gsa.search.shared.service.b.pn r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88110pn) r0
            int r2 = r0.f238212a
            r2 = r2 & r9
            if (r2 == 0) goto L_0x0168
            dagger.a r2 = r1.f300360p
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r2
            java.lang.String r0 = r0.f238213b
            r2.mo96442g(r0)
            return
        L_0x0168:
            dagger.a r0 = r1.f300360p
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r0 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r0
            r0.mo96442g(r7)
        L_0x0173:
            return
        L_0x0174:
            com.google.android.apps.gsa.search.shared.service.b.oj r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj.UNKNOWN
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88076og.f238138a
            com.google.android.apps.gsa.search.shared.service.b.bw r7 = r0.f236955a
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r7.mo58887l(r4)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r4 = r4.f169971d
            boolean r4 = r7.mo58857o(r4)
            if (r4 == 0) goto L_0x01c5
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88076og.f238138a
            com.google.android.apps.gsa.search.shared.service.b.bw r4 = r0.f236955a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r7 = r3.f169971d
            java.lang.Object r4 = r4.mo58854l(r7)
            if (r4 != 0) goto L_0x01a3
            java.lang.Object r3 = r3.f169969b
            goto L_0x01a7
        L_0x01a3:
            java.lang.Object r3 = r3.mo58889c(r4)
        L_0x01a7:
            com.google.android.apps.gsa.search.shared.service.b.ok r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88080ok) r3
            int r4 = r3.f238149b
            com.google.android.apps.gsa.search.shared.service.b.oj r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj.m142780a(r4)
            if (r4 != 0) goto L_0x01b3
            com.google.android.apps.gsa.search.shared.service.b.oj r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj.UNKNOWN
        L_0x01b3:
            long r12 = r3.f238150c
            com.google.android.apps.gsa.shared.ah.g r3 = r1.f300339J
            com.google.android.libraries.gsa.k.g r7 = r3.f241691g
            com.google.android.apps.gsa.shared.ah.e r14 = new com.google.android.apps.gsa.shared.ah.e
            r14.<init>(r3, r4)
            java.lang.String r3 = "onLifeCycleEvent"
            r7.mo28212l(r3, r14)
            r3 = r4
            goto L_0x01c7
        L_0x01c5:
            r12 = 0
        L_0x01c7:
            com.google.android.apps.gsa.search.shared.service.b.oj r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj.RESUMED
            if (r3 != r4) goto L_0x01cc
            r6 = 1
        L_0x01cc:
            if (r6 == 0) goto L_0x0243
            com.google.common.base.ax r3 = r1.f300340K
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x0243
            com.google.common.base.ax r3 = r1.f300340K
            java.lang.Object r3 = r3.mo56107c()
            com.google.android.apps.gsa.nga.api.bp r3 = (com.google.android.apps.gsa.nga.api.C74715bp) r3
            boolean r3 = r3.mo71084e()
            if (r3 == 0) goto L_0x0243
            dagger.a r3 = r1.f300343N
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.q r3 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a.C107820q) r3
            int r4 = r3.f300036o
            if (r4 != r10) goto L_0x0229
            com.google.common.base.ax r4 = r3.f300035n
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x0229
            com.google.common.base.ax r4 = r3.f300035n
            java.lang.Object r4 = r4.mo56107c()
            java.lang.Long r4 = (java.lang.Long) r4
            long r14 = r4.longValue()
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0229
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a.C107820q.f300003a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r14 = "NgaClientEventSubCtrl"
            r4.mo56378ag(r7, r14)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r7 = 26350(0x66ee, float:3.6924E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r7)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r7 = "onOpaConnected(%d): cancel query"
            r4.mo56388r(r7, r12)
            r4 = 21
            r3.mo96305j(r4)
        L_0x0229:
            com.google.android.apps.gsa.staticplugins.opa.ak.d.a.a r4 = r3.f300033l
            com.google.android.apps.gsa.nga.shared.x.g r4 = r4.f296619a
            com.google.android.apps.gsa.nga.shared.x.k r4 = (com.google.android.apps.gsa.nga.shared.p6417x.C83361k) r4
            java.util.concurrent.atomic.AtomicReference r4 = r4.f227199b
            java.lang.Object r4 = r4.get()
            com.google.android.apps.gsa.nga.api.a.bf r4 = (com.google.android.apps.gsa.nga.api.a.bf) r4
            com.google.android.libraries.gsa.k.g r7 = r3.f300027f
            com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.i r12 = new com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.i
            r12.<init>(r3, r4)
            java.lang.String r3 = "handleNotifyNgaToOpaCardStateEvent"
            r7.mo28212l(r3, r12)
        L_0x0243:
            j$.util.Optional r3 = r1.f300344O
            com.google.android.apps.gsa.staticplugins.opa.bb.h r4 = new com.google.android.apps.gsa.staticplugins.opa.bb.h
            r4.<init>(r6)
            r3.ifPresent(r4)
            goto L_0x03b7
        L_0x024f:
            dagger.a r0 = r1.f300362r
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.f r0 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107923f) r0
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f300276a
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247412gf
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x0280
            com.google.android.apps.gsa.search.shared.service.al r2 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_RESPONSE_SHERLOG_ENTRIES
            r2.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r3)
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88278vt.f238764a
            com.google.android.apps.gsa.search.shared.service.b.vx r4 = r0.mo96331a()
            r2.mo81965b(r3, r4)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r2 = r2.mo81964a()
            dagger.a r0 = r0.f300278c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.g r0 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g) r0
            r0.mo96337a(r2)
        L_0x0280:
            return
        L_0x0281:
            dagger.a r3 = r1.f300345P
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.a.b.a r3 = (com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a) r3
            r3.mo77890d()
            dagger.a r3 = r1.f300348c
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.e.ad r3 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107852ad) r3
            r3.mo96319c()
            goto L_0x03b7
        L_0x0299:
            dagger.a r3 = r1.f300342M
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.c.j r3 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j) r3
            r3.mo96269e()
            dagger.a r3 = r1.f300348c
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.e.ad r3 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107852ad) r3
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.a.s r3 = r3.f300121b
            com.google.android.apps.gsa.search.core.a.p r3 = r3.mo77931a()
            r3.mo77925g()
            goto L_0x03b7
        L_0x02b9:
            com.google.android.apps.gsa.search.core.al.bp.c r0 = r1.f300368x
            r0.mo78596a()
            return
        L_0x02bf:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88258v.f238720a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r3.mo58887l(r2)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 == 0) goto L_0x02f7
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88258v.f238720a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x02ec
            java.lang.Object r0 = r2.f169969b
            goto L_0x02f0
        L_0x02ec:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x02f0:
            com.google.android.apps.gsa.search.shared.service.b.ab r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87693ab) r0
            com.google.android.apps.gsa.search.core.al.bp.a r2 = r1.f300366v
            r2.mo78588c(r0)
        L_0x02f7:
            return
        L_0x02f8:
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            android.os.Parcelable r0 = r0.mo81912b(r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r2 = "active_notifications"
            android.os.Parcelable[] r0 = r0.getParcelableArray(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r0 == 0) goto L_0x031a
            int r3 = r0.length
        L_0x030e:
            if (r6 >= r3) goto L_0x031a
            r4 = r0[r6]
            com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper r4 = (com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper) r4
            r2.add(r4)
            int r6 = r6 + 1
            goto L_0x030e
        L_0x031a:
            com.google.android.apps.gsa.search.core.al.bl.a r0 = r1.f300367w
            r0.mo78565h(r2)
            return
        L_0x0320:
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88128qe.f238239a
            com.google.android.apps.gsa.search.shared.service.b.bw r4 = r0.f236955a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r4.mo58857o(r3)
            if (r3 != 0) goto L_0x0344
            com.google.common.f.e r3 = f300328a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "OpaSendReplyToNotificationEvent extension is missing. Bail out."
            r6 = 26105(0x65f9, float:3.6581E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r4)
            goto L_0x03b7
        L_0x0344:
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88128qe.f238239a
            com.google.android.apps.gsa.search.shared.service.b.bw r4 = r0.f236955a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r6 = r3.f169971d
            java.lang.Object r4 = r4.mo58854l(r6)
            if (r4 != 0) goto L_0x035c
            java.lang.Object r3 = r3.f169969b
            goto L_0x0360
        L_0x035c:
            java.lang.Object r3 = r3.mo58889c(r4)
        L_0x0360:
            com.google.android.apps.gsa.search.shared.service.b.qg r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88130qg) r3
            if (r3 != 0) goto L_0x0372
            com.google.common.f.e r3 = f300328a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "OpaSendReplyToNotificationEvent extension is null. Bail out."
            r6 = 26104(0x65f8, float:3.658E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r4)
            goto L_0x03b7
        L_0x0372:
            java.lang.String r4 = r3.f238243b
            java.lang.String r3 = r3.f238244c
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x03aa
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L_0x0383
            goto L_0x03aa
        L_0x0383:
            com.google.android.apps.gsa.search.core.al.bl.a r6 = r1.f300367w
            com.google.common.util.concurrent.cx r3 = r6.mo78568k(r4, r3)
            com.google.android.libraries.gsa.k.g r6 = r1.f300337H
            com.google.android.apps.gsa.staticplugins.opa.bb.j r7 = new com.google.android.apps.gsa.staticplugins.opa.bb.j
            r7.<init>(r1, r4)
            com.google.android.apps.gsa.shared.util.c.ag r12 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r13 = "Reply to Notification"
            r12.<init>(r3, r6, r13, r7)
            com.google.android.apps.gsa.staticplugins.opa.bb.k r3 = new com.google.android.apps.gsa.staticplugins.opa.bb.k
            r3.<init>(r1, r4)
            java.lang.Class<java.lang.RuntimeException> r6 = java.lang.RuntimeException.class
            r12.mo85224b(r6, r3)
            com.google.android.apps.gsa.staticplugins.opa.bb.l r3 = new com.google.android.apps.gsa.staticplugins.opa.bb.l
            r3.<init>(r1, r4)
            r12.mo85223a(r3)
            goto L_0x03b7
        L_0x03aa:
            com.google.common.f.e r3 = f300328a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "OpaSendReplyToNotificationEvent doesn't contain either notification key or the message. Bail out."
            r6 = 26103(0x65f7, float:3.6578E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r4)
        L_0x03b7:
            dagger.a r3 = r1.f300355k
            java.lang.Object r3 = r3.mo27525b()
            java.util.Map r3 = (java.util.Map) r3
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L_0x03de
            dagger.a r3 = r1.f300355k
            java.lang.Object r3 = r3.mo27525b()
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r3.get(r2)
            com.google.android.apps.gsa.staticplugins.opa.bb.e.az r3 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107874az) r3
            r3.getClass()
            boolean r3 = r3.mo96322b(r0)
            if (r3 != 0) goto L_0x03dd
            goto L_0x03de
        L_0x03dd:
            return
        L_0x03de:
            int r3 = r2.ordinal()
            r4 = 47
            if (r3 == r4) goto L_0x06c2
            r4 = 97
            if (r3 == r4) goto L_0x06a6
            r4 = 126(0x7e, float:1.77E-43)
            if (r3 == r4) goto L_0x0583
            r4 = 178(0xb2, float:2.5E-43)
            if (r3 == r4) goto L_0x0526
            com.google.common.b.ij r3 = com.google.android.apps.gsa.search.core.p6814o.C86187b.f232891b
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L_0x0400
            com.google.android.apps.gsa.search.core.o.b r2 = r1.f300338I
            r2.mo79827a(r0)
            return
        L_0x0400:
            dagger.a r3 = r1.f300363s
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.d.y r3 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107799y) r3
            com.google.android.apps.gsa.staticplugins.opa.bb.d.m r4 = r3.f299957g
            java.lang.Class<com.google.android.apps.gsa.search.core.service.a.a> r5 = com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42743c(r5)
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.b.ij r5 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107787m.f299925b
            com.google.android.apps.gsa.search.shared.service.b.bw r6 = r0.f236955a
            int r6 = r6.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r6)
            if (r6 != 0) goto L_0x041f
            com.google.android.apps.gsa.search.shared.service.b.bu r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x041f:
            com.google.common.b.qy r5 = (com.google.common.p4522b.C58759qy) r5
            java.lang.Object r5 = r5.f156534a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x044e
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r0.f236955a
            int r0 = r0.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r0)
            if (r0 != 0) goto L_0x0435
            com.google.android.apps.gsa.search.shared.service.b.bu r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x0435:
            int r0 = r0.ordinal()
            if (r0 == r11) goto L_0x043c
            goto L_0x0484
        L_0x043c:
            com.google.android.apps.gsa.search.core.a.b.a r0 = r4.f299930g
            boolean r0 = r0.mo77891e()
            if (r0 == 0) goto L_0x0484
            boolean r0 = r4.f299932i
            if (r0 == 0) goto L_0x0484
            com.google.android.apps.gsa.search.core.a.b.a r0 = r4.f299930g
            r0.mo77890d()
            return
        L_0x044e:
            com.google.android.apps.gsa.staticplugins.opa.bb.d.ai r3 = r3.f299958h
            java.lang.Class<com.google.android.apps.gsa.search.core.service.a.a> r4 = com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42743c(r4)
            com.google.common.b.ij r4 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d.C107773ai.f299882b
            com.google.android.apps.gsa.search.shared.service.b.bw r5 = r0.f236955a
            int r5 = r5.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r5)
            if (r5 != 0) goto L_0x0463
            com.google.android.apps.gsa.search.shared.service.b.bu r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x0463:
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x04f9
            com.google.android.apps.gsa.search.shared.service.b.bw r2 = r0.f236955a
            int r2 = r2.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r2)
            if (r2 != 0) goto L_0x0475
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x0475:
            int r2 = r2.ordinal()
            r4 = 6
            if (r2 == r4) goto L_0x04c7
            r4 = 10
            if (r2 == r4) goto L_0x04a7
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 == r4) goto L_0x0485
        L_0x0484:
            return
        L_0x0485:
            java.lang.Class<com.google.android.libraries.searchbox.shared.suggestion.Suggestion> r2 = com.google.android.libraries.searchbox.shared.suggestion.Suggestion.class
            android.os.Parcelable r0 = r0.mo81912b(r2)
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r0 = (com.google.android.libraries.searchbox.shared.suggestion.Suggestion) r0
            com.google.android.apps.gsa.search.core.al.df.a r2 = r3.f299886f
            com.google.android.apps.gsa.staticplugins.opa.bb.a.l r4 = r3.f299883c
            com.google.android.apps.gsa.shared.search.Query r4 = r4.mo96254b()
            java.lang.String r4 = r4.mo84352bk()
            com.google.android.apps.gsa.staticplugins.opa.bb.a.l r3 = r3.f299883c
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo96253a()
            java.lang.String r3 = r3.mo84352bk()
            r2.mo78886a(r4, r3, r0)
            return
        L_0x04a7:
            java.lang.Class<com.google.android.libraries.searchbox.shared.suggestion.Suggestion> r2 = com.google.android.libraries.searchbox.shared.suggestion.Suggestion.class
            android.os.Parcelable r0 = r0.mo81912b(r2)
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r0 = (com.google.android.libraries.searchbox.shared.suggestion.Suggestion) r0
            java.lang.Class<com.google.android.apps.gsa.search.core.service.a.a> r2 = com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42742b(r2)
            com.google.android.libraries.gsa.k.g r2 = r3.f299885e
            com.google.android.apps.gsa.search.core.al.cq.a r4 = r3.f299884d
            com.google.common.util.concurrent.cx r0 = r4.mo78767h(r0)
            com.google.android.apps.gsa.staticplugins.opa.bb.d.af r4 = new com.google.android.apps.gsa.staticplugins.opa.bb.d.af
            r4.<init>(r3)
            java.lang.String r3 = "removeSuggestionFromHistory"
            r2.mo28211k(r0, r3, r4)
            return
        L_0x04c7:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88327xo.f238866a
            com.google.android.apps.gsa.search.shared.service.b.bw r4 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r4.mo58887l(r2)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r5 = r2.f169971d
            java.lang.Object r4 = r4.mo58854l(r5)
            if (r4 != 0) goto L_0x04df
            java.lang.Object r2 = r2.f169969b
            goto L_0x04e3
        L_0x04df:
            java.lang.Object r2 = r2.mo58889c(r4)
        L_0x04e3:
            com.google.android.apps.gsa.search.shared.service.b.xq r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88329xq) r2
            com.google.android.apps.gsa.search.core.al.cq.a r4 = r3.f299884d
            java.lang.Class<com.google.android.libraries.searchbox.shared.response.Response> r5 = com.google.android.libraries.searchbox.shared.response.Response.class
            android.os.Parcelable r0 = r0.mo81912b(r5)
            com.google.android.libraries.searchbox.shared.response.Response r0 = (com.google.android.libraries.searchbox.shared.response.Response) r0
            com.google.android.apps.gsa.staticplugins.opa.bb.a.l r3 = r3.f299883c
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo96254b()
            r4.mo78774p(r0, r2, r3)
            return
        L_0x04f9:
            dagger.a r3 = r1.f300331B
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.a.n r3 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107735n) r3
            com.google.common.b.ij r3 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107735n.f299784b
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L_0x050f
            r3 = r20
            r3.mo80279a(r0)
            return
        L_0x050f:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107735n.f299783a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "OpaClientEventForwarder"
            r0.mo56378ag(r3, r4)
            java.lang.String r3 = "Client event : %s NOT fowarding to event bus. Please add it in GlobalEventBusClientEventWhitelist or contact opa-android-infra@"
            r4 = 26130(0x6612, float:3.6616E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r3, r2)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            return
        L_0x0526:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a.f299029a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r3.mo58887l(r2)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r4 = r2.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x053e
            java.lang.Object r2 = r2.f169969b
            goto L_0x0542
        L_0x053e:
            java.lang.Object r2 = r2.mo58889c(r3)
        L_0x0542:
            com.google.android.apps.gsa.staticplugins.opa.as.a.e r2 = (com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e) r2
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            boolean r3 = r0.mo81913d(r3)
            if (r3 == 0) goto L_0x055d
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            android.os.Parcelable r0 = r0.mo81912b(r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.Bundle r0 = com.google.android.apps.gsa.shared.util.C90772bp.m148299g(r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            goto L_0x055f
        L_0x055d:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x055f:
            dagger.a r3 = r1.f300356l
            java.lang.Object r3 = r3.mo27525b()
            java.util.Map r3 = (java.util.Map) r3
            int r4 = r2.f299118b
            com.google.android.apps.gsa.staticplugins.opa.as.a.c r4 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c.m178394a(r4)
            if (r4 != 0) goto L_0x0571
            com.google.android.apps.gsa.staticplugins.opa.as.a.c r4 = com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c.UNDEFINED
        L_0x0571:
            java.lang.Object r3 = r3.get(r4)
            com.google.android.apps.gsa.staticplugins.opa.bb.e.a.n r3 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.C107839n) r3
            r3.getClass()
            com.google.android.apps.gsa.staticplugins.opa.bb.s r4 = new com.google.android.apps.gsa.staticplugins.opa.bb.s
            r4.<init>(r1)
            r3.mo96297b(r2, r0, r4)
            return
        L_0x0583:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88087or.f238162a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r3.mo58887l(r2)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 == 0) goto L_0x05d5
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88087or.f238162a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x05b0
            java.lang.Object r0 = r2.f169969b
            goto L_0x05b4
        L_0x05b0:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x05b4:
            com.google.android.apps.gsa.search.shared.service.b.ov r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88091ov) r0
            int r2 = r0.f238172b
            com.google.android.apps.gsa.search.shared.service.b.ou r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88090ou.m142782a(r2)
            if (r2 != 0) goto L_0x05c0
            com.google.android.apps.gsa.search.shared.service.b.ou r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88090ou.DEFAULT
        L_0x05c0:
            com.google.android.apps.gsa.search.shared.service.b.ou r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88090ou.FINISH_EXECUTION
            if (r2 != r3) goto L_0x05c5
            goto L_0x05d6
        L_0x05c5:
            int r0 = r0.f238172b
            com.google.android.apps.gsa.search.shared.service.b.ou r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88090ou.m142782a(r0)
            if (r0 != 0) goto L_0x05cf
            com.google.android.apps.gsa.search.shared.service.b.ou r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88090ou.DEFAULT
        L_0x05cf:
            com.google.android.apps.gsa.search.shared.service.b.ou r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88090ou.SEND_PARTIAL_RESULTS
            if (r0 != r2) goto L_0x05d5
            r10 = 2
            goto L_0x05d6
        L_0x05d5:
            r10 = 1
        L_0x05d6:
            com.google.android.apps.gsa.staticplugins.opa.bb.a.l r0 = r1.f300330A
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo96253a()
            dagger.a r2 = r1.f300342M
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.c.j r2 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j) r2
            com.google.android.apps.gsa.opa.f.a.k r3 = com.google.android.apps.gsa.opa.p6441f.p6442a.C83659k.OPA_CONVERSATION_CANCEL
            com.google.common.base.ax r4 = com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j.m178903a(r0)
            boolean r6 = r4.mo56113h()
            if (r6 == 0) goto L_0x0646
            com.google.android.apps.gsa.opa.f.a.y r6 = com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y.f228080e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.opa.f.a.w r6 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w) r6
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.android.apps.gsa.opa.f.a.y r7 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y) r7
            r4.getClass()
            int r11 = r7.f228082a
            r11 = r11 | r9
            r7.f228082a = r11
            r7.f228085d = r4
            com.google.android.apps.gsa.opa.f.a.l r4 = com.google.android.apps.gsa.opa.p6441f.p6442a.C83660l.f228044c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.gsa.opa.f.a.i r4 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83657i) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.android.apps.gsa.opa.f.a.l r7 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83660l) r7
            int r3 = r3.f228043d
            r7.f228047b = r3
            int r3 = r7.f228046a
            r3 = r3 | r9
            r7.f228046a = r3
            com.google.protobuf.bv r3 = r4.build()
            com.google.android.apps.gsa.opa.f.a.l r3 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83660l) r3
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.gsa.opa.f.a.y r4 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y) r4
            r3.getClass()
            r4.f228084c = r3
            r4.f228083b = r5
            com.google.protobuf.bv r3 = r6.build()
            com.google.android.apps.gsa.opa.f.a.y r3 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y) r3
            android.os.Bundle r4 = android.os.Bundle.EMPTY
            r2.mo96275k(r3, r4)
        L_0x0646:
            dagger.a r2 = r1.f300348c
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.e.ad r2 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107852ad) r2
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.a.s r2 = r2.f300121b
            com.google.android.apps.gsa.search.core.a.p r2 = r2.mo77931a()
            r2.mo77928j(r10)
            com.google.android.apps.gsa.search.shared.service.b.pb r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88098pb.f238184d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.pa r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88097pa) r2
            long r3 = r0.f252749G
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.gsa.search.shared.service.b.pb r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88098pb) r5
            int r6 = r5.f238186a
            r6 = r6 | r9
            r5.f238186a = r6
            r5.f238187b = r3
            java.lang.String r0 = r0.mo84355bn()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x068c
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.gsa.search.shared.service.b.pb r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88098pb) r3
            r0.getClass()
            int r4 = r3.f238186a
            r4 = r4 | r8
            r3.f238186a = r4
            r3.f238188c = r0
        L_0x068c:
            com.google.android.apps.gsa.search.shared.service.al r0 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.OPA_CONVERSATION_CANCELLED
            r0.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r3)
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88095oz.f238182a
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.search.shared.service.b.pb r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88098pb) r2
            r0.mo81965b(r3, r2)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r0 = r0.mo81964a()
            r1.mo96340m(r0)
            return
        L_0x06a6:
            dagger.a r2 = r1.f300364t
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.g r2 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g) r2
            com.google.android.apps.gsa.search.shared.service.ClientConfig r2 = r2.f300312b
            boolean r2 = r2.mo81904u()
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            android.os.Parcelable r0 = r0.mo81912b(r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.google.android.apps.gsa.search.core.al.bp.h r3 = r1.f300365u
            r3.mo78612H(r0, r2)
            return
        L_0x06c2:
            com.google.android.apps.gsa.staticplugins.opa.bb.a.l r0 = r1.f300330A
            java.lang.Class<com.google.android.apps.gsa.search.core.service.a.a> r2 = com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42743c(r2)
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.state.fn r0 = r0.f299774a
            r0.mo80461o()
            return
        L_0x06d1:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88081ol.f238151a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r3.mo58887l(r2)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 == 0) goto L_0x0713
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88081ol.f238151a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x06fe
            java.lang.Object r0 = r2.f169969b
            goto L_0x0702
        L_0x06fe:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x0702:
            com.google.android.apps.gsa.search.shared.service.b.on r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88083on) r0
            dagger.a r2 = r1.f300360p
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r2
            int r3 = r0.f238155b
            int r0 = r0.f238156c
            r2.mo96440e(r3, r0)
        L_0x0713:
            return
        L_0x0714:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88105pi.f238198a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r3.mo58887l(r2)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 == 0) goto L_0x07b6
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88105pi.f238198a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x0741
            java.lang.Object r0 = r2.f169969b
            goto L_0x0745
        L_0x0741:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x0745:
            com.google.android.apps.gsa.search.shared.service.b.pk r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88107pk) r0
            int r2 = r0.f238201a
            r2 = r2 & r9
            if (r2 == 0) goto L_0x0759
            dagger.a r2 = r1.f300360p
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r2
            boolean r3 = r0.f238202b
            r2.mo96441f(r3)
        L_0x0759:
            int r2 = r0.f238201a
            r2 = r2 & r8
            if (r2 == 0) goto L_0x076b
            dagger.a r2 = r1.f300360p
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r2
            boolean r3 = r0.f238203c
            r2.mo96446k(r3)
        L_0x076b:
            int r2 = r0.f238201a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x077e
            dagger.a r2 = r1.f300360p
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r2
            boolean r3 = r0.f238204d
            r2.mo96447l(r3)
        L_0x077e:
            boolean r2 = r0.f238205e
            if (r2 == 0) goto L_0x0787
            com.google.android.apps.gsa.opa.ak r2 = r1.f300334E
            r2.mo76921b()
        L_0x0787:
            int r2 = r0.f238201a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x07a0
            dagger.a r2 = r1.f300360p
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r2
            com.google.knowledge.b.ag r3 = r0.f238206f
            if (r3 != 0) goto L_0x079b
            com.google.knowledge.b.ag r3 = com.google.knowledge.p4671b.C61788ag.f166893c
        L_0x079b:
            java.util.concurrent.atomic.AtomicReference r2 = r2.f300690d
            r2.set(r3)
        L_0x07a0:
            int r2 = r0.f238201a
            r2 = r2 & 32
            if (r2 == 0) goto L_0x07b6
            dagger.a r2 = r1.f300360p
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r2
            a.b.b.a.g r0 = r0.f238207g
            if (r0 != 0) goto L_0x07b4
            a.b.b.a.g r0 = p001a.p007b.p011b.p012a.C0031g.f92d
        L_0x07b4:
            r2.f300691e = r0
        L_0x07b6:
            return
        L_0x07b7:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87967kf.f237913a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r3.mo58887l(r2)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 != 0) goto L_0x07da
            com.google.common.f.e r0 = f300328a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "LogAppFlowEvent extension in missing. Bail out."
            r3 = 26096(0x65f0, float:3.6568E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x07da:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87967kf.f237913a
            com.google.android.apps.gsa.search.shared.service.b.bw r0 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x07f2
            java.lang.Object r0 = r2.f169969b
            goto L_0x07f6
        L_0x07f2:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x07f6:
            com.google.android.apps.gsa.search.shared.service.b.kh r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87969kh) r0
            if (r0 != 0) goto L_0x0808
            com.google.common.f.e r0 = f300328a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "LogAppFlowEvent extension in null. Bail out."
            r3 = 26095(0x65ef, float:3.6567E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0808:
            int r2 = r0.f237917b
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.m146281a(r2)
            if (r2 != 0) goto L_0x0812
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.UNKNOWN_EVENT
        L_0x0812:
            int r3 = r0.f237916a
            r3 = r3 & r8
            if (r3 == 0) goto L_0x0839
            dagger.a r3 = r1.f300349d
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r3 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r3
            com.google.android.apps.gsa.shared.logger.b.f r4 = new com.google.android.apps.gsa.shared.logger.b.f
            r4.<init>()
            r4.f246201a = r2
            long r5 = r0.f237918c
            java.lang.String r0 = java.lang.Long.toString(r5)
            java.lang.String r2 = "rId"
            r4.mo83701c(r2, r0)
            com.google.android.apps.gsa.shared.logger.b.g r0 = r4.mo83699a()
            r3.mo74236a(r0)
            return
        L_0x0839:
            dagger.a r0 = r1.f300349d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            r0.mo83702b(r2)
            return
        L_0x0845:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow.f238173a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r3.mo58887l(r2)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 != 0) goto L_0x0868
            com.google.common.f.e r0 = f300328a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "OpaClientInputEvent extension is missing. Bail out."
            r3 = 26102(0x65f6, float:3.6577E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0868:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow.f238173a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r3.mo58887l(r2)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r4 = r2.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x0880
            java.lang.Object r2 = r2.f169969b
            goto L_0x0884
        L_0x0880:
            java.lang.Object r2 = r2.mo58889c(r3)
        L_0x0884:
            com.google.android.apps.gsa.search.shared.service.b.oy r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r2
            if (r2 != 0) goto L_0x0896
            com.google.common.f.e r0 = f300328a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "OpaClientInputEvent extension is null. Bail out."
            r3 = 26101(0x65f5, float:3.6575E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0896:
            int r3 = r2.f238176a
            r3 = r3 & r9
            if (r3 == 0) goto L_0x09bd
            com.google.protobuf.z r3 = r2.f238177b
            int r3 = r3.mo59031d()
            if (r3 != 0) goto L_0x08a5
            goto L_0x09bd
        L_0x08a5:
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r3 = com.google.android.apps.gsa.shared.search.Query.class
            boolean r3 = r0.mo81913d(r3)
            if (r3 == 0) goto L_0x08d7
            int r3 = r2.f238181f
            com.google.assistant.e.f.d r3 = com.google.assistant.p3897e.p3912f.C51209d.m86086a(r3)
            if (r3 != 0) goto L_0x08b7
            com.google.assistant.e.f.d r3 = com.google.assistant.p3897e.p3912f.C51209d.UNKNOWN_SOURCE
        L_0x08b7:
            com.google.assistant.e.f.d r4 = com.google.assistant.p3897e.p3912f.C51209d.UNKNOWN_SOURCE
            if (r3 == r4) goto L_0x08c9
            com.google.common.f.e r0 = f300328a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "handleOpaClient receive both a Query and a RequestSourceType. Bail out."
            r3 = 26100(0x65f4, float:3.6574E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x08c9:
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r3 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r0 = r0.mo81912b(r3)
            com.google.android.apps.gsa.shared.search.Query r0 = (com.google.android.apps.gsa.shared.search.Query) r0
            com.google.android.apps.gsa.search.core.a.m r3 = new com.google.android.apps.gsa.search.core.a.m
            r3.<init>(r0)
            goto L_0x08e8
        L_0x08d7:
            com.google.android.apps.gsa.search.core.a.ag r3 = new com.google.android.apps.gsa.search.core.a.ag
            int r0 = r2.f238181f
            com.google.assistant.e.f.d r0 = com.google.assistant.p3897e.p3912f.C51209d.m86086a(r0)
            if (r0 != 0) goto L_0x08e3
            com.google.assistant.e.f.d r0 = com.google.assistant.p3897e.p3912f.C51209d.UNKNOWN_SOURCE
        L_0x08e3:
            com.google.android.apps.gsa.assistant.shared.l.e r4 = com.google.android.apps.gsa.assistant.shared.l.e.t
            r3.<init>(r0, r4)
        L_0x08e8:
            com.google.protobuf.z r0 = r2.f238177b     // Catch:{ ct -> 0x08f4 }
            com.google.assistant.e.j.du r4 = com.google.assistant.p3897e.p3921j.C51805du.f135924e     // Catch:{ ct -> 0x08f4 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (com.google.protobuf.C63088z) r0)     // Catch:{ ct -> 0x08f4 }
            com.google.assistant.e.j.du r0 = (com.google.assistant.p3897e.p3921j.C51805du) r0     // Catch:{ ct -> 0x08f4 }
            r4 = r0
            goto L_0x0903
        L_0x08f4:
            r0 = move-exception
            com.google.common.f.e r4 = f300328a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r9 = "Trying to parse invalid ClientInput."
            r10 = 26099(0x65f3, float:3.6572E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r10)).mo56386p(r9)
            r4 = r7
        L_0x0903:
            int r0 = r2.f238176a
            r9 = r0 & 2
            if (r9 == 0) goto L_0x090b
            int r6 = r2.f238178c
        L_0x090b:
            if (r4 == 0) goto L_0x09bc
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0981
            com.google.assistant.e.j.ek r0 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
            com.google.protobuf.bn r0 = r0.createBuilder()
            r9 = r0
            com.google.assistant.e.j.ej r9 = (com.google.assistant.p3897e.p3921j.C52077ej) r9
            java.lang.String r0 = r2.f238179d
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.ek r10 = (com.google.assistant.p3897e.p3921j.C52078ek) r10
            r0.getClass()
            int r11 = r10.f136673a
            r8 = r8 | r11
            r10.f136673a = r8
            r10.f136676d = r0
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.assistant.e.j.ek r0 = (com.google.assistant.p3897e.p3921j.C52078ek) r0
            r0.f136675c = r4
            r8 = 5
            r0.f136674b = r8
            int r0 = r2.f238176a
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0969
            com.google.protobuf.z r0 = r2.f238180e     // Catch:{ ct -> 0x094a }
            com.google.assistant.e.j.ev r2 = com.google.assistant.p3897e.p3921j.C52089ev.f136706c     // Catch:{ ct -> 0x094a }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (com.google.protobuf.C63088z) r0)     // Catch:{ ct -> 0x094a }
            com.google.assistant.e.j.ev r0 = (com.google.assistant.p3897e.p3921j.C52089ev) r0     // Catch:{ ct -> 0x094a }
            r7 = r0
            goto L_0x0958
        L_0x094a:
            r0 = move-exception
            com.google.common.f.e r2 = f300328a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r5 = "Trying to parse invalid WhatsNext."
            r8 = 26098(0x65f2, float:3.6571E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r8)).mo56386p(r5)
        L_0x0958:
            if (r7 == 0) goto L_0x0969
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.assistant.e.j.ek r0 = (com.google.assistant.p3897e.p3921j.C52078ek) r0
            r0.f136677e = r7
            int r2 = r0.f136673a
            r2 = r2 | 4
            r0.f136673a = r2
        L_0x0969:
            dagger.a r0 = r1.f300348c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.e.ad r0 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107852ad) r0
            com.google.protobuf.bv r2 = r9.build()
            com.google.assistant.e.j.ek r2 = (com.google.assistant.p3897e.p3921j.C52078ek) r2
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90833j(r3)
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo96318b(r6, r2, r3)
            goto L_0x0990
        L_0x0981:
            dagger.a r0 = r1.f300348c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.bb.e.ad r0 = (com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.C107852ad) r0
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90833j(r3)
            r0.mo96317a(r6, r4, r2)
        L_0x0990:
            java.lang.String r0 = r4.f135927b
            java.lang.String r2 = "ui.TAP_EXIT_THIRD_PARTY"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x09ae
            java.lang.String r0 = r4.f135927b
            java.lang.String r2 = "message_notification.READ"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x09ae
            java.lang.String r0 = r4.f135927b
            java.lang.String r2 = "message_notification.REPLY"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x09bc
        L_0x09ae:
            com.google.android.apps.gsa.staticplugins.opa.bb.a.l r0 = r1.f300330A
            java.lang.Class<com.google.android.apps.gsa.search.core.service.a.a> r2 = com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class
            com.google.android.libraries.gsa.p1876k.C22872h.m42743c(r2)
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.state.dh r0 = r0.f299778e
            r0.mo80622a()
        L_0x09bc:
            return
        L_0x09bd:
            com.google.common.f.e r0 = f300328a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Client input is empty. Bail out."
            r3 = 26097(0x65f1, float:3.657E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x09cb:
            com.google.android.apps.gsa.search.core.al.bp.h r0 = r1.f300365u
            r2 = r17
            r0.mo78638w(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107945t.mo80293f(long, com.google.android.apps.gsa.search.shared.service.ClientEventData, com.google.android.apps.gsa.search.core.service.e.c):void");
    }

    /* renamed from: g */
    public final void mo80294g(boolean z) {
        Query a = this.f300330A.mo96253a();
        C107759j jVar = (C107759j) this.f300342M.mo27525b();
        C58833ax a2 = C107759j.m178903a(a);
        if (a2.mo56113h()) {
            C83671w wVar = (C83671w) C83673y.f228080e.createBuilder();
            String str = (String) a2.mo56107c();
            wVar.copyOnWrite();
            C83673y yVar = (C83673y) wVar.instance;
            str.getClass();
            yVar.f228082a |= 1;
            yVar.f228085d = str;
            C83656h hVar = C83656h.f228036a;
            wVar.copyOnWrite();
            C83673y yVar2 = (C83673y) wVar.instance;
            hVar.getClass();
            yVar2.f228084c = hVar;
            yVar2.f228083b = 12;
            jVar.mo96275k((C83673y) wVar.build(), Bundle.EMPTY);
        }
        m179207o(new C107939n(this));
        this.f300352g = null;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C91006f fVar2 = fVar;
        fVar2.mo85291r(getClass().getName());
        fVar2.mo85287n((C91007g) this.f300362r.mo27525b());
        fVar2.mo85286m((C90991b) this.f300348c.mo27525b());
        C11248i iVar = this.f300346Q;
        StringBuilder sb = new StringBuilder();
        synchronized (iVar.f36669b) {
            sb.append(String.format(Locale.US, "Last %d FluidActions Triggers\n", new Object[]{Integer.valueOf(iVar.f36669b.size())}));
            Iterator it = iVar.f36669b.iterator();
            int i = 0;
            while (it.hasNext()) {
                sb.append("FluidActions Fulfillment ");
                int i2 = i + 1;
                sb.append(i);
                sb.append("\n");
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                boolean z = true;
                boolean z2 = false;
                for (C11246g gVar : ((C11247h) it.next()).f36667b) {
                    int i3 = gVar.f36662a;
                    String[] strArr = C11247h.f36666a;
                    int length = strArr.length;
                    String str = strArr[1];
                    String gVar2 = gVar.toString();
                    int i4 = gVar.f36663b;
                    int i5 = gVar.f36662a;
                    if (!z2 || sb3.length() + gVar2.length() > 97) {
                        if (sb3.length() > 0) {
                            if (!z) {
                                sb2.append("\n");
                            }
                            sb2.append(sb3);
                            sb3 = new StringBuilder();
                            z = false;
                        }
                        int i6 = gVar.f36662a;
                        sb3.append(str);
                        sb3.append(gVar2);
                        int i7 = gVar.f36663b;
                    } else {
                        if (sb3.length() != 0) {
                            str = " | ";
                        }
                        sb3.append(str);
                        sb3.append(gVar2);
                    }
                    z2 = true;
                }
                if (sb3.length() > 0) {
                    if (!z) {
                        sb2.append("\n");
                    }
                    sb2.append(sb3);
                }
                sb.append(sb2.toString());
                sb.append("\n");
                i = i2;
            }
        }
        fVar2.mo85292s(C90752i.m148229c(sb.toString()));
    }

    /* renamed from: h */
    public final void mo80295h() {
        m179207o(C107938m.f300321a);
        C107946u uVar = this.f300370z;
        if (uVar.f300372b == this) {
            uVar.f300372b = null;
        }
        uVar.f300371a.remove(this);
        C107849aa aaVar = (C107849aa) this.f300369y.mo27525b();
        C58976aa aaVar2 = C58975e.f156826a;
        aaVar.f300107g.set(false);
        C107922z zVar = aaVar.f300108h;
        if (zVar != null) {
            ((C84274n) aaVar.f300106f.mo27525b()).mo77792h(zVar);
            aaVar.f300108h = null;
        }
        C107740s sVar = (C107740s) this.f300357m.mo27525b();
        sVar.f299797b.clear();
        sVar.f299798c = null;
        sVar.f299796a.mo80761o(sVar);
        C107737p pVar = (C107737p) this.f300358n.mo27525b();
        pVar.f299786a.mo80761o(pVar);
        C107932g gVar = (C107932g) this.f300364t.mo27525b();
        gVar.f300311a = null;
        gVar.f300312b = ClientConfig.f236948a;
        ((b) this.f300341L.mo27525b()).a();
        for (C107874az a : ((Map) this.f300355k.mo27525b()).values()) {
            a.mo96296a();
        }
        for (C107839n a2 : ((Map) this.f300356l.mo27525b()).values()) {
            a2.mo96296a();
        }
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        this.f300352g = aVar;
        C107932g gVar = (C107932g) this.f300364t.mo27525b();
        C86775r rVar = (C86775r) aVar;
        C86771n nVar = rVar.f234383e;
        ClientConfig clientConfig = rVar.f234384f;
        gVar.f300311a = nVar;
        gVar.f300312b = clientConfig;
        C107740s sVar = (C107740s) this.f300357m.mo27525b();
        sVar.f299796a.mo80760l(sVar);
        m179207o(new C107940o(aVar));
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        Object obj;
        Object obj2;
        C58833ax axVar2;
        C86232bo boVar;
        Query query;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        m179207o(C107934i.f300314a);
        C107946u uVar = this.f300370z;
        if (uVar.f300372b == null) {
            uVar.f300372b = this;
        }
        uVar.f300371a.add(this);
        C107737p pVar = (C107737p) this.f300358n.mo27525b();
        pVar.f299786a.mo80760l(pVar);
        C107740s sVar = (C107740s) this.f300357m.mo27525b();
        if (this.f300347R == null) {
            this.f300347R = new C107943r(this);
        }
        sVar.mo96265b(this.f300347R);
        C107799y yVar = (C107799y) this.f300363s.mo27525b();
        C107740s sVar2 = yVar.f299951a;
        sVar2.f299798c = yVar;
        sVar2.mo96265b(new C107798x(yVar));
        this.f300365u.mo78624h();
        if (bbVar != null) {
            C62940bt r0 = C62942bv.checkIsLite(C38358i.f101564a);
            bbVar.mo58887l(r0);
            if (bbVar.f169962ag.mo58857o(r0.f169971d)) {
                C62940bt r8 = C62942bv.checkIsLite(C38358i.f101564a);
                bbVar.mo58887l(r8);
                Object l = bbVar.f169962ag.mo58854l(r8.f169971d);
                if (l == null) {
                    obj5 = r8.f169969b;
                } else {
                    obj5 = r8.mo58889c(l);
                }
                C38355f fVar = (C38355f) obj5;
                if (fVar == null || (fVar.f101545a & 1) == 0) {
                    ((C59052c) ((C59052c) f300328a.mo56226d()).mo56372aa(26109)).mo56389s("Invalid OPA deeplink: %s.", fVar);
                    int i = C90755l.f253831a;
                    return;
                }
                C62940bt r9 = C62942bv.checkIsLite(C38378s.f101619a);
                bbVar.mo58887l(r9);
                Object l2 = bbVar.f169962ag.mo58854l(r9.f169971d);
                if (l2 == null) {
                    obj6 = r9.f169969b;
                } else {
                    obj6 = r9.mo58889c(l2);
                }
                this.f300365u.mo78635t(fVar, (C38377r) obj6, ((C108100a) this.f300360p.mo27525b()).mo96449n());
                mo80295h();
                return;
            }
        }
        C107945t tVar = null;
        if (bbVar != null) {
            C62940bt r1 = C62942bv.checkIsLite(C88459i.f239145a);
            bbVar.mo58887l(r1);
            if (bbVar.f169962ag.mo58857o(r1.f169971d)) {
                Iterator it = this.f300370z.f300371a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C107945t tVar2 = (C107945t) it.next();
                    C107849aa aaVar = (C107849aa) tVar2.f300369y.mo27525b();
                    C58976aa aaVar2 = C58975e.f156826a;
                    aaVar.f300107g.get();
                    if (aaVar.f300107g.get()) {
                        tVar = tVar2;
                        break;
                    }
                }
                if (tVar != null) {
                    C62940bt r82 = C62942bv.checkIsLite(C88459i.f239145a);
                    bbVar.mo58887l(r82);
                    Object l3 = bbVar.f169962ag.mo58854l(r82.f169971d);
                    if (l3 == null) {
                        obj4 = r82.f169969b;
                    } else {
                        obj4 = r82.mo58889c(l3);
                    }
                    tVar.mo96338a((C88458h) obj4);
                    return;
                }
                C62940bt r83 = C62942bv.checkIsLite(C88459i.f239145a);
                bbVar.mo58887l(r83);
                Object l4 = bbVar.f169962ag.mo58854l(r83.f169971d);
                if (l4 == null) {
                    obj3 = r83.f169969b;
                } else {
                    obj3 = r83.mo58889c(l4);
                }
                mo96338a((C88458h) obj3);
                return;
            }
        }
        if (bbVar != null) {
            C62940bt r12 = C62942bv.checkIsLite(C88428az.f239080a);
            bbVar.mo58887l(r12);
            if (bbVar.f169962ag.mo58857o(r12.f169971d)) {
                C62940bt r13 = C62942bv.checkIsLite(C88428az.f239080a);
                bbVar.mo58887l(r13);
                Object l5 = bbVar.f169962ag.mo58854l(r13.f169971d);
                if (l5 == null) {
                    obj2 = r13.f169969b;
                } else {
                    obj2 = r13.mo58889c(l5);
                }
                C88427ay ayVar = (C88427ay) obj2;
                if (ayVar != null && (ayVar.f239078a & 1) != 0) {
                    C86248cd cdVar = (C86248cd) this.f300332C.mo27525b();
                    long j2 = ayVar.f239079b;
                    synchronized (cdVar.f233138b) {
                        if (cdVar.f233140d != j2 || (boVar = cdVar.f233139c) == null || (query = (Query) C90918bo.m148516c(boVar.mo79865A(), (Object) null)) == null) {
                            C59104x d = C86248cd.f233137a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "VoiceAccessSRCache");
                            ((C59052c) ((C59052c) d).mo56372aa(7815)).mo56386p("Optional.empty returned from VoiceAccessSearchResultCache.");
                            int i2 = C90755l.f253831a;
                            axVar2 = C58836b.f156633a;
                        } else {
                            axVar2 = C58833ax.m90834k(query);
                        }
                    }
                    if (axVar2.mo56113h()) {
                        C107733l lVar = this.f300330A;
                        C88394a aVar = new C88394a(j, "opa");
                        C58976aa aaVar3 = C58975e.f156826a;
                        if (C22872h.m42744d(C86593a.class)) {
                            lVar.mo96261i(aVar);
                        } else {
                            lVar.f299775b.mo28212l("GlobalEventBusAccessor#setHeadlessActiveSession", new C107723b(lVar, aVar));
                        }
                        C107733l lVar2 = this.f300330A;
                        if (C22872h.m42744d(C86593a.class)) {
                            lVar2.f299777d.mo80525e();
                        } else {
                            lVar2.f299775b.mo28212l("GlobalEventBusAccessor#setCurrentSessionHeadless", new C107729h(lVar2));
                        }
                        C87565h hVar = new C87565h();
                        hVar.f236563i = j;
                        hVar.f236560f = 3;
                        hVar.f236556b = e.bI;
                        hVar.f236497A = true;
                        hVar.f236565k = (Query) axVar2.mo56107c();
                        ((C87568k) this.f300333D.mo56107c()).mo81689c(this.f300353i, hVar.mo81685a(), 268435456);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (bbVar != null) {
            C62940bt r84 = C62942bv.checkIsLite(C107553e.f299209a);
            bbVar.mo58887l(r84);
            if (bbVar.f169962ag.mo58857o(r84.f169971d)) {
                C62940bt r85 = C62942bv.checkIsLite(C107553e.f299209a);
                bbVar.mo58887l(r85);
                Object l6 = bbVar.f169962ag.mo58854l(r85.f169971d);
                if (l6 == null) {
                    obj = r85.f169969b;
                } else {
                    obj = r85.mo58889c(l6);
                }
                C107552d dVar = (C107552d) obj;
                C107945t tVar3 = this.f300370z.f300372b;
                if (tVar3 == null || tVar3 == this) {
                    mo96339c(dVar);
                } else {
                    tVar3.mo96339c(dVar);
                }
                mo80295h();
            }
        }
    }

    /* renamed from: k */
    public final boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        boolean z = this.f300340K.mo56113h() && ((C74715bp) this.f300340K.mo56107c()).mo71084e() && this.f300359o.mo79746e(C90014bt.f247449hP);
        boolean contains = f300329h.contains(clientConfig2.f236951d);
        if (!z || !contains) {
            return C86685g.m139633b(clientConfig, clientConfig2);
        }
        return false;
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }

    /* renamed from: m */
    public final void mo96340m(ServiceEventData serviceEventData) {
        ((C107932g) this.f300364t.mo27525b()).mo96337a(serviceEventData);
    }

    /* renamed from: n */
    public final void mo96341n(String str, boolean z, String str2) {
        if (!z) {
            ((C59052c) ((C59052c) f300328a.mo56226d()).mo56372aa(26111)).mo56389s("Send a reply failed. Error: %s", str2);
        }
        C107513ag agVar = (C107513ag) C107514ah.f299136e.createBuilder();
        agVar.copyOnWrite();
        C107514ah ahVar = (C107514ah) agVar.instance;
        str.getClass();
        ahVar.f299138a |= 1;
        ahVar.f299139b = str;
        agVar.copyOnWrite();
        C107514ah ahVar2 = (C107514ah) agVar.instance;
        ahVar2.f299138a |= 2;
        ahVar2.f299140c = z;
        String g = C58837ba.m90858g(str2);
        agVar.copyOnWrite();
        C107514ah ahVar3 = (C107514ah) agVar.instance;
        ahVar3.f299138a |= 4;
        ahVar3.f299141d = g;
        C107555d dVar = (C107555d) C107556e.f299210c.createBuilder();
        dVar.copyOnWrite();
        C107556e eVar = (C107556e) dVar.instance;
        eVar.f299213b = 4;
        eVar.f299212a |= 1;
        dVar.mo58885m(C107512af.f299135a, (C107514ah) agVar.build());
        C87684al alVar = new C87684al(C88244um.OPA_SESSION_SERVICE_EVENT);
        alVar.mo81965b(C107505a.f299120a, (C107556e) dVar.build());
        mo96340m(alVar.mo81964a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo96339c(C107552d dVar) {
        C51680al alVar;
        C51680al alVar2;
        C51805du duVar;
        if ((dVar.f299206a & 2) != 0) {
            C107551c cVar = C107551c.UNKNOWN;
            C87739bu buVar = C87739bu.UNKNOWN;
            C107551c a = C107551c.m178396a(dVar.f299207b);
            if (a == null) {
                a = C107551c.UNKNOWN;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                C107888ba baVar = (C107888ba) this.f300335F.mo27525b();
                C63088z zVar = dVar.f299208c;
                C58976aa aaVar = C58975e.f156826a;
                byte[] N = zVar.mo59174N();
                C114464db dbVar = (C114464db) baVar.f300197a.mo27525b();
                dbVar.f317383d.mo28210j(dbVar.mo101329f(N), "triggerPushMessageNotification", new C114456cu(dbVar, baVar.f300198b));
            } else if (ordinal != 2) {
                C59052c cVar2 = (C59052c) ((C59052c) f300328a.mo56226d()).mo56372aa(26092);
                C107551c a2 = C107551c.m178396a(dVar.f299207b);
                if (a2 == null) {
                    a2 = C107551c.UNKNOWN;
                }
                cVar2.mo56389s("Received unexpected GCM type: %s", a2);
            } else {
                C107903g gVar = (C107903g) this.f300336G.mo27525b();
                try {
                    C51681am amVar = (C51681am) C62942bv.parseFrom((C62942bv) C51681am.f135358d, dVar.f299208c);
                    if (amVar.f135362c.size() > 0 && !TextUtils.isEmpty(((C86106b) gVar.f300242c.mo27525b()).mo79727b())) {
                        for (C52428rj rjVar : amVar.f135362c) {
                            if ((rjVar.f137560a & 8) == 0 || !rjVar.f137563d.equals(((C86106b) gVar.f300242c.mo27525b()).mo79727b())) {
                            }
                        }
                        C59104x d = C107903g.f300240a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "AsyncEventSubController");
                        ((C59052c) ((C59052c) d).mo56372aa(26217)).mo56386p("Received AssistantAsyncEvent not intended for current device");
                        C62971cq cqVar = amVar.f135362c;
                        return;
                    }
                    if (amVar.f135360a == 2) {
                        C107852ad adVar = (C107852ad) gVar.f300241b.mo27525b();
                        if (amVar.f135360a == 2) {
                            duVar = (C51805du) amVar.f135361b;
                        } else {
                            duVar = C51805du.f135924e;
                        }
                        adVar.mo96320e(duVar);
                    }
                    if (amVar.f135360a == 4) {
                        alVar = (C51680al) amVar.f135361b;
                    } else {
                        alVar = C51680al.f135302c;
                    }
                    if ((alVar.f135304a & 1) != 0) {
                        if (amVar.f135360a == 4) {
                            alVar2 = (C51680al) amVar.f135361b;
                        } else {
                            alVar2 = C51680al.f135302c;
                        }
                        C52081en enVar = alVar2.f135305b;
                        if (enVar == null) {
                            enVar = C52081en.f136679i;
                        }
                        C86252g gVar2 = (C86252g) gVar.f300245f.mo27525b();
                        C86251f fVar = new C86251f();
                        fVar.mo79946b();
                        fVar.mo79947c();
                        C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
                        eVar.copyOnWrite();
                        C51195j jVar = (C51195j) eVar.instance;
                        enVar.getClass();
                        jVar.f133275j = enVar;
                        jVar.f133266a |= 128;
                        ((C85005h) gVar.f300243d.mo27525b()).mo78623g(C58833ax.m90834k((C51195j) eVar.build()), gVar.f300244e, C60856cj.m92900i(C58836b.f156633a), fVar);
                    }
                } catch (C62974ct e) {
                    C59104x c = C107903g.f300240a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "AsyncEventSubController");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(26219)).mo56386p("Failed to parse AssistantAsyncEvent");
                }
            }
        } else {
            ((C59052c) ((C59052c) f300328a.mo56225c()).mo56372aa(26093)).mo56386p("Missing GCM payload");
        }
    }
}
