package com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.p10057a;

import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10058b.C132164c;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10058b.C132165d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.p4632a.C61349j;
import com.google.frameworks.client.data.android.p4632a.C61358s;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8648b;
import com.google.p427am.p432b.p433a.C8650bb;
import com.google.p427am.p432b.p433a.C8651bc;
import com.google.p427am.p432b.p433a.C8665bq;
import com.google.p427am.p432b.p433a.C8666br;
import com.google.p427am.p432b.p433a.C8674d;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8676f;
import com.google.p427am.p432b.p433a.C8677g;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.time.Duration;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70846h;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.u */
/* compiled from: PG */
public final class C132161u implements C132140a {

    /* renamed from: a */
    public static final Duration f360722a = Duration.ofMinutes(1);

    /* renamed from: b */
    public static final Duration f360723b = Duration.ofMinutes(5);

    /* renamed from: j */
    private static final C58528ij f360724j = C58528ij.m90011K("https://www.googleapis.com/auth/homegraph", "https://www.google.com/accounts/OAuthLogin");

    /* renamed from: c */
    public final C8648b f360725c;

    /* renamed from: d */
    public final C132165d f360726d;

    /* renamed from: e */
    public final C60950i f360727e;

    /* renamed from: f */
    public final C46778cv f360728f;

    /* renamed from: g */
    public final C37215b f360729g;

    /* renamed from: h */
    public final String f360730h;

    /* renamed from: i */
    public final int f360731i;

    /* renamed from: k */
    private final ScheduledExecutorService f360732k;

    /* renamed from: l */
    private final boolean f360733l;

    public C132161u(C8648b bVar, C132165d dVar, C60950i iVar, C46778cv cvVar, C37215b bVar2, String str, int i, ScheduledExecutorService scheduledExecutorService, boolean z) {
        C70334de deVar = new C70334de();
        deVar.mo62033h(new C70290cs("custodio_client_name", C70334de.f187481c), "com.google.android.googlequicksearchbox");
        deVar.mo62033h(new C70290cs("custodio_client_version", C70334de.f187481c), Integer.toString(i));
        C70846h hVar = C61409d.f166071a;
        C61349j jVar = new C61349j();
        jVar.f165909a = C58833ax.m90834k(f360724j);
        this.f360725c = (C8648b) ((C8648b) bVar.mo62577p(hVar, new C61358s(jVar.mo57930b()))).mo62576o(new C70879r(deVar));
        this.f360726d = dVar;
        this.f360727e = iVar;
        this.f360728f = cvVar;
        this.f360729g = bVar2;
        this.f360730h = str;
        this.f360731i = i;
        this.f360732k = scheduledExecutorService;
        this.f360733l = z;
    }

    /* renamed from: i */
    public static C63042fg m214793i(C63042fg fgVar, C63042fg fgVar2) {
        return C62950b.m95474e(fgVar).isAfter(C62950b.m95474e(fgVar2)) ? fgVar2 : fgVar;
    }

    /* renamed from: a */
    public final C46689ag mo110501a(String str, C58485gu guVar, boolean z) {
        return new C132159s(this, str, guVar, z, false);
    }

    /* renamed from: b */
    public final C46689ag mo110502b() {
        return new C132155o(this);
    }

    /* renamed from: c */
    public final C60870cx mo110503c(String str, String str2, String str3) {
        C8665bq bqVar = (C8665bq) C8666br.f29976b.createBuilder();
        C8676f fVar = (C8676f) C8677g.f29998d.createBuilder();
        fVar.copyOnWrite();
        ((C8677g) fVar.instance).f30000a = str2;
        C8650bb bbVar = (C8650bb) C8651bc.f29941c.createBuilder();
        bbVar.copyOnWrite();
        ((C8651bc) bbVar.instance).f29943a = str3;
        bbVar.copyOnWrite();
        ((C8651bc) bbVar.instance).f29944b = 1;
        fVar.copyOnWrite();
        C8651bc bcVar = (C8651bc) bbVar.build();
        bcVar.getClass();
        ((C8677g) fVar.instance).f30002c = bcVar;
        bqVar.copyOnWrite();
        C8677g gVar = (C8677g) fVar.build();
        gVar.getClass();
        ((C8666br) bqVar.instance).f29978a = gVar;
        this.f360729g.mo19974a(C37176a.f97017dc);
        C60870cx b = this.f360725c.mo17208b((C8666br) bqVar.build());
        C132151k kVar = new C132151k(this);
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(kVar), C60826bg.f164896a);
        C132152l lVar = new C132152l(this, str, str2);
        return C60922j.m93045h(g, C47810es.m84966f(lVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo110504d(String str, String str2, C8633al alVar) {
        C8665bq bqVar = (C8665bq) C8666br.f29976b.createBuilder();
        C8676f fVar = (C8676f) C8677g.f29998d.createBuilder();
        fVar.copyOnWrite();
        ((C8677g) fVar.instance).f30000a = str2;
        C8674d dVar = (C8674d) C8675e.f29990g.createBuilder();
        dVar.copyOnWrite();
        alVar.getClass();
        ((C8675e) dVar.instance).f29993b = alVar;
        fVar.copyOnWrite();
        C8675e eVar = (C8675e) dVar.build();
        eVar.getClass();
        ((C8677g) fVar.instance).f30001b = eVar;
        bqVar.copyOnWrite();
        C8677g gVar = (C8677g) fVar.build();
        gVar.getClass();
        ((C8666br) bqVar.instance).f29978a = gVar;
        this.f360729g.mo19974a(C37176a.f97017dc);
        C60870cx b = this.f360725c.mo17208b((C8666br) bqVar.build());
        C132142b bVar = new C132142b(this);
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(bVar), C60826bg.f164896a);
        C132143c cVar = new C132143c(this, str, str2);
        return C60922j.m93045h(g, C47810es.m84966f(cVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo110505e(String str, String str2, C8633al alVar) {
        C8665bq bqVar = (C8665bq) C8666br.f29976b.createBuilder();
        C8676f fVar = (C8676f) C8677g.f29998d.createBuilder();
        fVar.copyOnWrite();
        ((C8677g) fVar.instance).f30000a = str2;
        C8674d dVar = (C8674d) C8675e.f29990g.createBuilder();
        dVar.copyOnWrite();
        alVar.getClass();
        ((C8675e) dVar.instance).f29993b = alVar;
        dVar.copyOnWrite();
        ((C8675e) dVar.instance).f29995d = true;
        fVar.copyOnWrite();
        C8675e eVar = (C8675e) dVar.build();
        eVar.getClass();
        ((C8677g) fVar.instance).f30001b = eVar;
        bqVar.copyOnWrite();
        C8677g gVar = (C8677g) fVar.build();
        gVar.getClass();
        ((C8666br) bqVar.instance).f29978a = gVar;
        this.f360729g.mo19974a(C37176a.f97017dc);
        C60870cx b = this.f360725c.mo17208b((C8666br) bqVar.build());
        C132141a aVar = new C132141a(this);
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(aVar), C60826bg.f164896a);
        C132145e eVar2 = new C132145e(this, str, str2);
        return C60922j.m93045h(g, C47810es.m84966f(eVar2), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final void mo110506f(String str) {
        this.f360728f.mo50788b(this.f360726d.f360741a.mo46039a(new C132164c(str), C60826bg.f164896a), new C46885y(str));
    }

    /* renamed from: g */
    public final C46689ag mo110507g(String str, C58485gu guVar) {
        return new C132159s(this, str, guVar, false, true);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo110509h(java.lang.String r17, com.google.common.p4522b.C58485gu r18, boolean r19, boolean r20, com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.p10057a.C132160t r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            com.google.am.b.a.bj r3 = com.google.p427am.p432b.p433a.C8658bj.f29956d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.am.b.a.bi r3 = (com.google.p427am.p432b.p433a.C8657bi) r3
            int r4 = r17.hashCode()
            r5 = 9
            r6 = 10
            r7 = 3
            r8 = 7
            r9 = 11
            r10 = 6
            r11 = 5
            r12 = 8
            r13 = 4
            r14 = 2
            r15 = 1
            switch(r4) {
                case -1410280908: goto L_0x009a;
                case -1272117067: goto L_0x0090;
                case -1247182279: goto L_0x0086;
                case -587559043: goto L_0x007b;
                case -7933803: goto L_0x0071;
                case 3122: goto L_0x0067;
                case 3434992: goto L_0x005d;
                case 62009815: goto L_0x0052;
                case 95466924: goto L_0x0048;
                case 1151923259: goto L_0x003e;
                case 1823843082: goto L_0x0032;
                case 2104657944: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x00a4
        L_0x0026:
            java.lang.String r4 = "odyssey-dg"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 9
            goto L_0x00a5
        L_0x0032:
            java.lang.String r4 = "gha-child-sla"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 10
            goto L_0x00a5
        L_0x003e:
            java.lang.String r4 = "fla-ps-ad"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 3
            goto L_0x00a5
        L_0x0048:
            java.lang.String r4 = "dg-ac"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 7
            goto L_0x00a5
        L_0x0052:
            java.lang.String r4 = "gks-unicorn-enrollment"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 11
            goto L_0x00a5
        L_0x005d:
            java.lang.String r4 = "pcfc"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 6
            goto L_0x00a5
        L_0x0067:
            java.lang.String r4 = "as"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 0
            goto L_0x00a5
        L_0x0071:
            java.lang.String r4 = "gha-sds"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 5
            goto L_0x00a5
        L_0x007b:
            java.lang.String r4 = "gha-mmv2-kd"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 8
            goto L_0x00a5
        L_0x0086:
            java.lang.String r4 = "gha-gs"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 4
            goto L_0x00a5
        L_0x0090:
            java.lang.String r4 = "fla-ps"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 2
            goto L_0x00a5
        L_0x009a:
            java.lang.String r4 = "as-rsp"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00a4
            r1 = 1
            goto L_0x00a5
        L_0x00a4:
            r1 = -1
        L_0x00a5:
            switch(r1) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00c2;
                case 2: goto L_0x00c0;
                case 3: goto L_0x00be;
                case 4: goto L_0x00bc;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00c5;
                case 7: goto L_0x00b6;
                case 8: goto L_0x00b3;
                case 9: goto L_0x00b0;
                case 10: goto L_0x00ad;
                case 11: goto L_0x00aa;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            r5 = 2
            goto L_0x00c5
        L_0x00aa:
            r5 = 14
            goto L_0x00c5
        L_0x00ad:
            r5 = 13
            goto L_0x00c5
        L_0x00b0:
            r5 = 12
            goto L_0x00c5
        L_0x00b3:
            r5 = 11
            goto L_0x00c5
        L_0x00b6:
            r5 = 10
            goto L_0x00c5
        L_0x00b9:
            r5 = 8
            goto L_0x00c5
        L_0x00bc:
            r5 = 7
            goto L_0x00c5
        L_0x00be:
            r5 = 4
            goto L_0x00c5
        L_0x00c0:
            r5 = 3
            goto L_0x00c5
        L_0x00c2:
            r5 = 6
            goto L_0x00c5
        L_0x00c4:
            r5 = 5
        L_0x00c5:
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.am.b.a.bj r1 = (com.google.p427am.p432b.p433a.C8658bj) r1
            int r5 = r5 + -2
            r1.f29960c = r5
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.am.b.a.bj r1 = (com.google.p427am.p432b.p433a.C8658bj) r1
            com.google.protobuf.cq r4 = r1.f29958a
            boolean r5 = r4.mo58948c()
            if (r5 != 0) goto L_0x00e5
            com.google.protobuf.cq r4 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r4)
            r1.f29958a = r4
        L_0x00e5:
            com.google.protobuf.cq r1 = r1.f29958a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r1)
            com.google.am.b.a.bh r1 = com.google.p427am.p432b.p433a.C8656bh.f29949f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.am.b.a.bg r1 = (com.google.p427am.p432b.p433a.C8655bg) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.am.b.a.bh r4 = (com.google.p427am.p432b.p433a.C8656bh) r4
            r5 = r19
            r4.f29953c = r5
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.am.b.a.bh r4 = (com.google.p427am.p432b.p433a.C8656bh) r4
            r4.f29952b = r15
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.am.b.a.bh r4 = (com.google.p427am.p432b.p433a.C8656bh) r4
            r4.f29951a = r15
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.am.b.a.bh r4 = (com.google.p427am.p432b.p433a.C8656bh) r4
            r4.f29954d = r15
            boolean r4 = r0.f360733l
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.am.b.a.bh r5 = (com.google.p427am.p432b.p433a.C8656bh) r5
            r5.f29955e = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.am.b.a.bj r4 = (com.google.p427am.p432b.p433a.C8658bj) r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.am.b.a.bh r1 = (com.google.p427am.p432b.p433a.C8656bh) r1
            r1.getClass()
            r4.f29959b = r1
            com.google.protobuf.bv r1 = r3.build()
            com.google.am.b.a.bj r1 = (com.google.p427am.p432b.p433a.C8658bj) r1
            com.google.android.libraries.search.b.b r3 = r0.f360729g
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97019de
            r3.mo19974a(r4)
            com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.i r3 = new com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.i
            r4 = r21
            r3.<init>(r0, r1, r2, r4)
            com.google.common.base.cr r1 = com.google.apps.tiktok.tracing.C47810es.m84964d(r3)
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 30
            com.google.common.n.c.o r2 = com.google.common.p4543n.p4546c.C59407o.m92309e(r2, r4)
            com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.j r3 = new com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.j
            r4 = r20
            r3.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r4 = r0.f360732k
            com.google.common.n.c.y r1 = com.google.common.p4543n.p4546c.C59417y.m92319e(r1, r2, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.p10057a.C132161u.mo110509h(java.lang.String, com.google.common.b.gu, boolean, boolean, com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.t):com.google.common.util.concurrent.cx");
    }
}
