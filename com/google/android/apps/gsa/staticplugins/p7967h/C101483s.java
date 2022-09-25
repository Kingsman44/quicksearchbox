package com.google.android.apps.gsa.staticplugins.p7967h;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83692a;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.p6790a.C85789ah;
import com.google.android.apps.gsa.search.core.google.p6790a.C85803av;
import com.google.android.apps.gsa.search.core.google.p6790a.C85841z;
import com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89045bp;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92446c;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92448e;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92455l;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.apps.gsa.staticplugins.p7967h.p7968a.C101437b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3994s.p3995a.C53119cb;
import com.google.assistant.p3994s.p3995a.C53121cd;
import com.google.assistant.p3994s.p3995a.C53122ce;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.amo;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.s */
/* compiled from: PG */
final class C101483s implements C92439c {

    /* renamed from: m */
    public static final /* synthetic */ int f283139m = 0;

    /* renamed from: n */
    private static final C59071e f283140n = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.h.s");

    /* renamed from: o */
    private static final C58528ij f283141o;

    /* renamed from: A */
    private final C85789ah f283142A;

    /* renamed from: B */
    private final C85803av f283143B;

    /* renamed from: C */
    private final C85841z f283144C;

    /* renamed from: D */
    private final C83692a f283145D;

    /* renamed from: E */
    private final C86124t f283146E;

    /* renamed from: F */
    private final C58833ax f283147F;

    /* renamed from: G */
    private final C89994f f283148G;

    /* renamed from: H */
    private final C92302a f283149H;

    /* renamed from: I */
    private final C68214a f283150I;

    /* renamed from: J */
    private final C68214a f283151J;

    /* renamed from: K */
    private final C68214a f283152K;

    /* renamed from: L */
    private final C68214a f283153L;

    /* renamed from: M */
    private final boolean f283154M;

    /* renamed from: N */
    private final C68214a f283155N;

    /* renamed from: O */
    private final boolean f283156O;

    /* renamed from: P */
    private final C68214a f283157P;

    /* renamed from: Q */
    private final C68214a f283158Q;

    /* renamed from: R */
    private final C58009ae f283159R;

    /* renamed from: a */
    C92455l f283160a;

    /* renamed from: b */
    C87696ae f283161b;

    /* renamed from: c */
    Future f283162c;

    /* renamed from: d */
    Future f283163d;

    /* renamed from: e */
    Future f283164e;

    /* renamed from: f */
    Future f283165f;

    /* renamed from: g */
    Future f283166g;

    /* renamed from: h */
    Future f283167h;

    /* renamed from: i */
    Future f283168i;

    /* renamed from: j */
    Future f283169j;

    /* renamed from: k */
    Future f283170k;

    /* renamed from: l */
    C58833ax f283171l;

    /* renamed from: p */
    private final C101455ar f283172p;

    /* renamed from: q */
    private final C90931ca f283173q;

    /* renamed from: r */
    private final Future f283174r;

    /* renamed from: s */
    private final Future f283175s;

    /* renamed from: t */
    private final C21370a f283176t;

    /* renamed from: u */
    private final C85664bo f283177u;

    /* renamed from: v */
    private final SharedPreferences f283178v;

    /* renamed from: w */
    private final C86054o f283179w;

    /* renamed from: x */
    private final Query f283180x;

    /* renamed from: y */
    private final C101437b f283181y;

    /* renamed from: z */
    private final C85494a f283182z;

    static {
        C53119cb cbVar = (C53119cb) C53122ce.f139215b.createBuilder();
        cbVar.mo53961a(C53121cd.FLIGHT_STATUS);
        C63088z byteString = ((C53122ce) cbVar.build()).toByteString();
        C53119cb cbVar2 = (C53119cb) C53122ce.f139215b.createBuilder();
        cbVar2.mo53961a(C53121cd.WEATHER);
        C63088z byteString2 = ((C53122ce) cbVar2.build()).toByteString();
        C53119cb cbVar3 = (C53119cb) C53122ce.f139215b.createBuilder();
        cbVar3.mo53961a(C53121cd.WHEN_IS);
        f283141o = C58528ij.m90012L(byteString, byteString2, ((C53122ce) cbVar3.build()).toByteString());
    }

    public C101483s(C87696ae aeVar, C58009ae aeVar2, C101455ar arVar, Query query, C90931ca caVar, C21370a aVar, C101437b bVar, C85494a aVar2, C85789ah ahVar, C85803av avVar, C85841z zVar, C58833ax axVar, SharedPreferences sharedPreferences, C86124t tVar, C85664bo boVar, C86054o oVar, C89994f fVar, C92302a aVar3, C92461a aVar4, C89037bh bhVar, C89045bp bpVar, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C83692a aVar10, boolean z, C68214a aVar11, C68214a aVar12) {
        C87696ae aeVar3 = aeVar;
        this.f283161b = aeVar3;
        this.f283172p = arVar;
        this.f283159R = aeVar2;
        this.f283173q = caVar;
        this.f283176t = aVar;
        this.f283177u = boVar;
        this.f283178v = sharedPreferences;
        this.f283179w = oVar;
        this.f283180x = query;
        this.f283181y = bVar;
        this.f283182z = aVar2;
        this.f283142A = ahVar;
        this.f283143B = avVar;
        this.f283144C = zVar;
        this.f283147F = axVar;
        this.f283146E = tVar;
        this.f283148G = fVar;
        this.f283149H = aVar3;
        this.f283174r = aeVar2.mo54597a(new C101471g(new C92446c(bhVar, bpVar)));
        this.f283175s = aeVar2.mo54597a(new C101478n(new C92448e(fVar, "assistant-client-sync", aVar4, (String) null, (amo) null, (String) null, (String) null)));
        this.f283150I = aVar5;
        this.f283151J = aVar6;
        this.f283152K = aVar7;
        this.f283153L = aVar8;
        boolean z2 = false;
        if ((aeVar3.f237134a & 2) != 0) {
            C53271hs hsVar = aeVar3.f237136c;
            C53306j a = C53306j.m86809a((hsVar == null ? C53271hs.f139650u : hsVar).f139663l);
            if ((a == null ? C53306j.UNKNOWNN : a) == C53306j.AUTO_EMBEDDED) {
                z2 = true;
            }
        }
        this.f283154M = z2;
        this.f283155N = aVar9;
        this.f283145D = aVar10;
        this.f283156O = z;
        this.f283157P = aVar11;
        this.f283158Q = aVar12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4449cd.p4456g.C57981b mo87118a() {
        /*
            r51 = this;
            r9 = r51
            com.google.android.apps.gsa.speech.k.a.g r10 = new com.google.android.apps.gsa.speech.k.a.g
            com.google.android.apps.gsa.shared.util.c.ca r11 = r9.f283173q
            r12 = 1
            com.google.android.apps.gsa.s3.producers.m[] r13 = new com.google.android.apps.gsa.p6487s3.producers.C84314m[r12]
            com.google.android.apps.gsa.speech.k.b.l r14 = new com.google.android.apps.gsa.speech.k.b.l
            com.google.cd.h.a.ae r2 = r9.f283159R
            com.google.android.apps.gsa.staticplugins.h.a.b r5 = r9.f283181y
            com.google.android.apps.gsa.speech.helper.a r15 = r9.f283149H
            com.google.android.apps.gsa.shared.m.b.f r8 = r9.f283148G
            dagger.a r7 = r9.f283150I
            boolean r6 = r9.f283154M
            boolean r4 = r9.f283156O
            com.google.android.apps.gsa.staticplugins.h.r r16 = new com.google.android.apps.gsa.staticplugins.h.r
            r0 = r16
            r1 = r51
            r3 = r15
            r17 = r4
            r4 = r8
            r18 = r8
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r14
            r1 = r16
            r2 = r11
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.f283160a = r14
            com.google.android.apps.gsa.shared.search.Query r0 = r9.f283180x
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84257T()
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84244G(r12)
            java.lang.String r1 = "and.opa"
            android.os.Bundle r2 = android.os.Bundle.EMPTY
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84264aA(r1, r2)
            boolean r1 = r9.f283154M
            r2 = 0
            if (r1 == 0) goto L_0x005e
            com.google.android.apps.gsa.shared.search.f r0 = r0.mo84480i()
            r4 = 2097152(0x200000, double:1.0361308E-317)
            r0.mo84572d(r2, r4)
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84568a()
        L_0x005e:
            com.google.android.apps.gsa.search.shared.service.b.ae r1 = r9.f283161b
            int r4 = r1.f237134a
            r5 = r4 & 256(0x100, float:3.59E-43)
            r6 = 0
            r7 = 2
            if (r5 == 0) goto L_0x006c
        L_0x0068:
            r22 = r13
            goto L_0x015d
        L_0x006c:
            r4 = r4 & 512(0x200, float:7.175E-43)
            if (r4 != 0) goto L_0x0068
            android.content.SharedPreferences r4 = r9.f283178v
            com.google.android.apps.gsa.search.core.i.t r5 = r9.f283146E
            com.google.android.libraries.f.a r8 = r9.f283176t
            com.google.android.apps.gsa.search.core.google.gaia.o r14 = r9.f283179w
            dagger.a r15 = r9.f283150I
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bm r15 = (com.google.android.apps.gsa.assistant.shared.bm) r15
            int r2 = r1.f237134a
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0105
            com.google.common.b.ij r2 = f283141o
            com.google.assistant.s.a.hs r3 = r1.f237136c
            if (r3 != 0) goto L_0x008d
            com.google.assistant.s.a.hs r3 = com.google.assistant.p3994s.p3995a.C53271hs.f139650u
        L_0x008d:
            com.google.protobuf.z r3 = r3.f139666o
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0068
            boolean r1 = r1.f237145l
            if (r1 == 0) goto L_0x009c
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0068
        L_0x009c:
            long r1 = r8.mo26870b()
            r3 = 4
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r3]
            java.lang.String r18 = "opa_zero_state_last_request_time_millis_"
            r8[r6] = r18
            java.lang.String r19 = r14.mo79659F()
            r8[r12] = r19
            java.lang.String r19 = "_"
            r8[r7] = r19
            java.lang.String r20 = r15.b()
            r21 = 3
            r8[r21] = r20
            java.lang.CharSequence r8 = android.text.TextUtils.concat(r8)
            java.lang.String r8 = r8.toString()
            r22 = r13
            r12 = 0
            long r12 = r4.getLong(r8, r12)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247830oq
            long r6 = r5.mo79743a(r7)
            long r5 = r8.toMillis(r6)
            long r12 = r12 + r5
            int r5 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r5 >= 0) goto L_0x00dd
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0107
        L_0x00dd:
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r3]
            r5 = 0
            r3[r5] = r18
            java.lang.String r5 = r14.mo79659F()
            r6 = 1
            r3[r6] = r5
            r5 = 2
            r3[r5] = r19
            java.lang.String r5 = r15.b()
            r3[r21] = r5
            java.lang.CharSequence r3 = android.text.TextUtils.concat(r3)
            java.lang.String r3 = r3.toString()
            r4.putLong(r3, r1)
            r4.apply()
            goto L_0x015d
        L_0x0105:
            r22 = r13
        L_0x0107:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92898g()
            r9.f283162c = r0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92898g()
            r9.f283163d = r0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92898g()
            r9.f283164e = r0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92898g()
            r9.f283170k = r0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92898g()
            r9.f283166g = r0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92898g()
            r9.f283168i = r0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92898g()
            r9.f283169j = r0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92898g()
            r9.f283167h = r0
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            r9.f283171l = r0
            com.google.android.apps.gsa.search.shared.service.b.ae r0 = r9.f283161b
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ad r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.search.shared.service.b.ae r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae) r1
            r2 = 0
            r1.f237136c = r2
            int r2 = r1.f237134a
            r2 = r2 & -3
            r1.f237134a = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.search.shared.service.b.ae r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae) r0
            r9.f283161b = r0
            goto L_0x02b4
        L_0x015d:
            com.google.android.apps.gsa.search.core.al.i.a r1 = r9.f283182z
            com.google.common.util.concurrent.cx r1 = r1.mo79020e(r0)
            r9.f283162c = r1
            com.google.android.apps.gsa.search.core.al.i.a r1 = r9.f283182z
            com.google.common.util.concurrent.cx r1 = r1.mo79019d(r0)
            com.google.android.apps.gsa.staticplugins.h.m r2 = com.google.android.apps.gsa.staticplugins.p7967h.C101477m.f283126a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r3)
            r9.f283163d = r1
            com.google.android.apps.gsa.search.core.google.a.ah r1 = r9.f283142A
            com.google.common.util.concurrent.cx r0 = r1.mo79443b(r0)
            r9.f283164e = r0
            com.google.common.base.ax r0 = r9.f283147F
            com.google.android.apps.gsa.search.shared.service.b.ae r1 = r9.f283161b
            com.google.assistant.s.a.hs r1 = r1.f237136c
            if (r1 != 0) goto L_0x0187
            com.google.assistant.s.a.hs r1 = com.google.assistant.p3994s.p3995a.C53271hs.f139650u
        L_0x0187:
            int r1 = r1.f139663l
            com.google.assistant.s.a.j r1 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r1)
            if (r1 != 0) goto L_0x0191
            com.google.assistant.s.a.j r1 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
        L_0x0191:
            boolean r2 = r0.mo56113h()
            if (r2 != 0) goto L_0x019e
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x01a8
        L_0x019e:
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.opa.al r0 = (com.google.android.apps.gsa.opa.C83581al) r0
            com.google.common.util.concurrent.cx r0 = r0.mo76936k(r1)
        L_0x01a8:
            r9.f283170k = r0
            com.google.common.base.ax r0 = r9.f283147F
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x01bc
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x01ec
        L_0x01bc:
            com.google.common.base.ax r0 = r9.f283147F
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.opa.al r0 = (com.google.android.apps.gsa.opa.C83581al) r0
            com.google.common.util.concurrent.cx r0 = r0.mo76927b()
            com.google.common.base.ax r1 = r9.f283147F
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.apps.gsa.opa.al r1 = (com.google.android.apps.gsa.opa.C83581al) r1
            com.google.common.util.concurrent.cx r1 = r1.mo76928c()
            r2 = 2
            com.google.common.util.concurrent.cx[] r3 = new com.google.common.util.concurrent.C60870cx[r2]
            r2 = 0
            r3[r2] = r0
            r2 = 1
            r3[r2] = r1
            com.google.common.util.concurrent.cf r2 = com.google.common.util.concurrent.C60856cj.m92893b(r3)
            com.google.android.apps.gsa.staticplugins.h.e r3 = new com.google.android.apps.gsa.staticplugins.h.e
            r3.<init>(r0, r1)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = r2.mo57334a(r3, r0)
        L_0x01ec:
            r9.f283166g = r0
            com.google.android.apps.gsa.search.core.google.a.z r0 = r9.f283144C
            com.google.android.apps.gsa.search.core.i.t r1 = r9.f283146E
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247226dE
            boolean r1 = r1.mo79746e(r2)
            if (r1 != 0) goto L_0x0201
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0207
        L_0x0201:
            com.google.android.apps.gsa.search.core.google.a.y r1 = com.google.android.apps.gsa.search.core.google.p6790a.C85840y.OPA_ZERO_STATE_REQUEST
            com.google.common.util.concurrent.cx r0 = r0.mo79473d(r1)
        L_0x0207:
            r9.f283167h = r0
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f283146E
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90042cu.f248705f
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0239
            dagger.a r0 = r9.f283153L
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x0222
            goto L_0x0239
        L_0x0222:
            dagger.a r0 = r9.f283153L
            java.lang.Object r0 = r0.mo27525b()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.storage.protostore.ab r0 = (com.google.android.libraries.storage.protostore.C42876ab) r0
            com.google.common.util.concurrent.cx r0 = r0.mo46042d()
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x023b
        L_0x0239:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x023b:
            r9.f283171l = r0
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f283146E
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90055dg.f248996a
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x0251
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0257
        L_0x0251:
            com.google.android.apps.gsa.opa.g.c.a r0 = r9.f283145D
            com.google.common.util.concurrent.cx r0 = r0.mo77014g()
        L_0x0257:
            r9.f283168i = r0
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f283146E
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90055dg.f248998c
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x027e
            com.google.common.f.e r0 = f283140n
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "ACS.ReqProdFactory"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "ClientUpdate disabled by flag."
            r2 = 13881(0x3639, float:1.9451E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.assistant.ag.a.z r0 = com.google.assistant.p3803ag.p3804a.C48883z.f126498c
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x02b2
        L_0x027e:
            com.google.android.apps.gsa.opa.g.c.a r0 = r9.f283145D
            com.google.common.util.concurrent.cx r0 = r0.mo77009a()
            com.google.android.apps.gsa.staticplugins.h.h r1 = com.google.android.apps.gsa.staticplugins.p7967h.C101472h.f283120a
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.apps.gsa.opa.g.c.a r1 = r9.f283145D
            com.google.common.util.concurrent.cx r1 = r1.mo77011c()
            com.google.android.apps.gsa.staticplugins.h.i r2 = com.google.android.apps.gsa.staticplugins.p7967h.C101473i.f283121a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r3)
            r2 = 2
            com.google.common.util.concurrent.cx[] r2 = new com.google.common.util.concurrent.C60870cx[r2]
            r3 = 0
            r2[r3] = r0
            r3 = 1
            r2[r3] = r1
            com.google.common.util.concurrent.cf r2 = com.google.common.util.concurrent.C60856cj.m92893b(r2)
            com.google.android.apps.gsa.staticplugins.h.j r3 = new com.google.android.apps.gsa.staticplugins.h.j
            r3.<init>(r0, r1)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = r2.mo57334a(r3, r0)
        L_0x02b2:
            r9.f283169j = r0
        L_0x02b4:
            com.google.android.apps.gsa.search.shared.service.b.ae r0 = r9.f283161b
            com.google.assistant.n.b.a.b r1 = r0.f237146m
            if (r1 != 0) goto L_0x02bc
            com.google.assistant.n.b.a.b r1 = com.google.assistant.p3980n.p3983b.p3984a.C53006b.f138944d
        L_0x02bc:
            int r1 = r1.f138946a
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L_0x02df
            com.google.assistant.n.b.a.b r0 = r0.f237146m
            if (r0 != 0) goto L_0x02c8
            com.google.assistant.n.b.a.b r0 = com.google.assistant.p3980n.p3983b.p3984a.C53006b.f138944d
        L_0x02c8:
            boolean r0 = r0.f138947b
            if (r0 == 0) goto L_0x02df
            com.google.android.apps.gsa.search.core.google.a.av r0 = r9.f283143B
            com.google.assistant.e.i.a.dw r1 = com.google.assistant.p3897e.p3917i.p3918a.C51334dw.f133658ab
            com.google.common.util.concurrent.cx r0 = r0.mo79447a(r1)
            com.google.android.apps.gsa.staticplugins.h.f r1 = com.google.android.apps.gsa.staticplugins.p7967h.C101470f.f283118a
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            r9.f283165f = r0
            goto L_0x02e5
        L_0x02df:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92898g()
            r9.f283165f = r0
        L_0x02e5:
            com.google.android.apps.gsa.staticplugins.h.d r0 = new com.google.android.apps.gsa.staticplugins.h.d
            r23 = r0
            com.google.android.apps.gsa.search.shared.service.b.ae r1 = r9.f283161b
            r24 = r1
            com.google.android.apps.gsa.staticplugins.h.ar r1 = r9.f283172p
            r25 = r1
            java.util.concurrent.Future r1 = r9.f283174r
            r26 = r1
            java.util.concurrent.Future r1 = r9.f283175s
            r27 = r1
            com.google.android.apps.gsa.speech.k.b.l r1 = r9.f283160a
            java.util.concurrent.Future r1 = r1.f257883a
            r28 = r1
            java.lang.String r29 = "assistant-client-sync"
            com.google.android.libraries.f.a r1 = r9.f283176t
            r30 = r1
            com.google.android.apps.gsa.search.core.bo r1 = r9.f283177u
            r31 = r1
            android.content.SharedPreferences r1 = r9.f283178v
            r32 = r1
            com.google.android.apps.gsa.search.core.i.t r1 = r9.f283146E
            r33 = r1
            java.util.concurrent.Future r1 = r9.f283162c
            r34 = r1
            java.util.concurrent.Future r1 = r9.f283163d
            r35 = r1
            java.util.concurrent.Future r1 = r9.f283164e
            r36 = r1
            java.util.concurrent.Future r1 = r9.f283165f
            r37 = r1
            java.util.concurrent.Future r1 = r9.f283170k
            r38 = r1
            java.util.concurrent.Future r1 = r9.f283166g
            r39 = r1
            java.util.concurrent.Future r1 = r9.f283167h
            r40 = r1
            com.google.android.apps.gsa.search.core.google.gaia.o r1 = r9.f283179w
            r41 = r1
            dagger.a r1 = r9.f283150I
            r42 = r1
            dagger.a r1 = r9.f283151J
            r43 = r1
            dagger.a r1 = r9.f283152K
            r44 = r1
            com.google.common.base.ax r1 = r9.f283171l
            r45 = r1
            dagger.a r1 = r9.f283155N
            r46 = r1
            java.util.concurrent.Future r1 = r9.f283168i
            r47 = r1
            java.util.concurrent.Future r1 = r9.f283169j
            r48 = r1
            dagger.a r1 = r9.f283157P
            r49 = r1
            dagger.a r1 = r9.f283158Q
            r50 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r1 = 0
            r22[r1] = r0
            r0 = r22
            r10.<init>((com.google.android.apps.gsa.shared.util.p7159c.C90931ca) r11, (com.google.android.apps.gsa.p6487s3.producers.C84314m[]) r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7967h.C101483s.mo87118a():com.google.cd.g.b");
    }

    /* renamed from: b */
    public final void mo87119b() {
        Future future = this.f283174r;
        if (future != null) {
            future.cancel(true);
        }
        Future future2 = this.f283175s;
        if (future2 != null) {
            future2.cancel(true);
        }
        C92455l lVar = this.f283160a;
        if (lVar != null) {
            lVar.mo87155a();
        }
        Future future3 = this.f283162c;
        if (future3 != null) {
            future3.cancel(true);
        }
        Future future4 = this.f283164e;
        if (future4 != null) {
            future4.cancel(true);
        }
        Future future5 = this.f283166g;
        if (future5 != null) {
            future5.cancel(true);
        }
        Future future6 = this.f283168i;
        if (future6 != null) {
            future6.cancel(true);
        }
        Future future7 = this.f283169j;
        if (future7 != null) {
            future7.cancel(true);
        }
    }

    /* renamed from: c */
    public final void mo87120c() {
        C92455l lVar = this.f283160a;
        if (lVar != null) {
            lVar.mo87156b();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo87121d() {
        return false;
    }
}
