package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.C131579a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.i */
/* compiled from: PG */
public final class C131588i implements C131579a {

    /* renamed from: a */
    private final C123789r f359525a;

    /* renamed from: b */
    private final int f359526b;

    /* renamed from: c */
    private final C131251t f359527c;

    /* renamed from: d */
    private final C71422aw f359528d;

    /* renamed from: e */
    private final C60950i f359529e;

    /* renamed from: f */
    private final C130603a f359530f;

    /* renamed from: g */
    private final boolean f359531g;

    /* renamed from: h */
    private final boolean f359532h;

    /* renamed from: i */
    private final C58974d f359533i;

    /* renamed from: j */
    private final Instant f359534j;

    /* renamed from: k */
    private final Instant f359535k;

    /* renamed from: l */
    private final Duration f359536l;

    /* renamed from: m */
    private final Instant f359537m;

    public C131588i(C123789r rVar, int i, C131251t tVar, C71422aw awVar, C60950i iVar, long j, C130603a aVar, boolean z, boolean z2) {
        C69664n.m101061g(rVar, "flightLandingData");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(aVar, "aaFileFluentLoggerFactory");
        this.f359525a = rVar;
        this.f359526b = i;
        this.f359527c = tVar;
        this.f359528d = awVar;
        this.f359529e = iVar;
        this.f359530f = aVar;
        this.f359531g = z;
        this.f359532h = z2;
        this.f359533i = aVar.mo109739a("FlightLandingTempParser");
        Instant a = iVar.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        this.f359534j = a;
        long j2 = rVar.f341968d;
        a = j2 != 0 ? Instant.ofEpochMilli(j2) : a;
        this.f359535k = a;
        Duration ofMillis = Duration.ofMillis(j);
        this.f359536l = ofMillis;
        this.f359537m = a.plus(ofMillis);
    }

    /* renamed from: a */
    public final C60870cx mo110197a() {
        return C71663i.m104692e(this.f359528d, (C71424ay) null, new C131587h(this, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.assistant.c.b.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: com.google.assistant.c.b.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: com.google.assistant.c.b.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110201b(boolean r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131585f
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.f r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131585f) r0
            int r1 = r0.f359515e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f359515e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.f r0 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.f
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f359513c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f359515e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r7 = r0.f359512b
            java.lang.Object r0 = r0.f359511a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0093
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            java.lang.Object r7 = r0.f359512b
            java.lang.Object r0 = r0.f359511a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0073
        L_0x003e:
            p5462h.C69714l.m101134b(r8)
            com.google.assistant.c.b.n r8 = com.google.assistant.p3886c.p3888b.C50729n.f132007g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.c.b.m r8 = (com.google.assistant.p3886c.p3888b.C50728m) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.assistant.c.b.n r2 = (com.google.assistant.p3886c.p3888b.C50729n) r2
            int r5 = r2.f132009a
            r5 = r5 | r4
            r2.f132009a = r5
            java.lang.String r5 = "com.google.android.apps.nexuslauncher.extra.SMARTSPACE_ICON"
            r2.f132010b = r5
            if (r7 == 0) goto L_0x0077
            com.google.android.apps.search.assistant.verticals.ambient.q.e.t r7 = r6.f359527c
            r2 = 2131234201(0x7f080d99, float:1.8084561E38)
            com.google.common.util.concurrent.cx r7 = r7.mo110130d(r2)
            r0.f359511a = r8
            r0.f359512b = r8
            r0.f359515e = r4
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 == r1) goto L_0x0076
            r0 = r8
            r8 = r7
            r7 = r0
        L_0x0073:
            j$.util.Optional r8 = (p3186j$.util.Optional) r8
            goto L_0x0095
        L_0x0076:
            return r1
        L_0x0077:
            com.google.android.apps.search.assistant.verticals.ambient.q.e.t r7 = r6.f359527c
            com.google.assistant.c.cr r2 = com.google.assistant.p3886c.C50794cr.FLIGHT
            com.google.common.util.concurrent.cx r7 = r7.mo110129c(r2)
            java.lang.String r2 = "smartspaceSharedUtils.getIconByCardType(FLIGHT)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            r0.f359511a = r8
            r0.f359512b = r8
            r0.f359515e = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r7 == r1) goto L_0x00c8
            r0 = r8
            r8 = r7
            r7 = r0
        L_0x0093:
            j$.util.Optional r8 = (p3186j$.util.Optional) r8
        L_0x0095:
            if (r8 == 0) goto L_0x00bc
            boolean r1 = r8.isPresent()
            if (r1 == 0) goto L_0x00bc
            java.lang.Object r8 = r8.get()
            com.google.protobuf.z r8 = (com.google.protobuf.C63088z) r8
            r1 = r7
            com.google.protobuf.bn r1 = (com.google.protobuf.C62934bn) r1
            r1.copyOnWrite()
            com.google.assistant.c.b.m r7 = (com.google.assistant.p3886c.p3888b.C50728m) r7
            com.google.protobuf.bv r7 = r7.instance
            com.google.assistant.c.b.n r7 = (com.google.assistant.p3886c.p3888b.C50729n) r7
            com.google.assistant.c.b.n r1 = com.google.assistant.p3886c.p3888b.C50729n.f132007g
            r8.getClass()
            int r1 = r7.f132009a
            r1 = r1 | 16
            r7.f132009a = r1
            r7.f132013e = r8
        L_0x00bc:
            com.google.protobuf.bn r0 = (com.google.protobuf.C62934bn) r0
            com.google.protobuf.bv r7 = r0.build()
            java.lang.String r8 = "newBuilder()\n      .appl… }\n      }\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            return r7
        L_0x00c8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131588i.mo110201b(boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110202c(p5462h.p5466c.C69577g r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r1 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131586g
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.g r2 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131586g) r2
            int r3 = r2.f359522g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f359522g = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.g r2 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.g
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f359520e
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f359522g
            r5 = 1
            java.lang.String r6 = "newBuilder()"
            if (r4 == 0) goto L_0x003e
            if (r4 != r5) goto L_0x0036
            java.lang.Object r3 = r2.f359519d
            java.lang.Object r4 = r2.f359518c
            java.lang.Object r7 = r2.f359517b
            java.lang.Object r2 = r2.f359516a
            p5462h.C69714l.m101134b(r1)
            goto L_0x0113
        L_0x0036:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003e:
            p5462h.C69714l.m101134b(r1)
            com.google.assistant.c.b.h r1 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.c.b.a r1 = (com.google.assistant.p3886c.p3888b.C50716a) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)
            com.google.assistant.c.b.j r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.apps.search.assistant.platform.pcp.f.r r4 = r0.f359525a
            java.lang.String r4 = r4.f341966b
            java.lang.String r7 = "flightLandingData.title"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r7)
            r1.mo53433b(r4)
            com.google.assistant.c.b.g r4 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r1.mo53434c(r4)
            com.google.assistant.c.b.h r7 = r1.mo53432a()
            boolean r1 = r0.f359532h
            r4 = 0
            if (r1 == 0) goto L_0x0074
            com.google.android.apps.search.assistant.platform.pcp.f.r r1 = r0.f359525a
            int r1 = r1.f341965a
            r1 = r1 & 2
            if (r1 == 0) goto L_0x0074
            r1 = 1
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            r8 = 0
            if (r1 == 0) goto L_0x009d
            com.google.assistant.c.b.h r9 = com.google.assistant.p3886c.p3888b.C50723h.f131999e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.c.b.a r9 = (com.google.assistant.p3886c.p3888b.C50716a) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r6)
            com.google.assistant.c.b.j r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.android.apps.search.assistant.platform.pcp.f.r r10 = r0.f359525a
            java.lang.String r10 = r10.f341967c
            java.lang.String r11 = "flightLandingData.subtitle"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            r9.mo53433b(r10)
            com.google.assistant.c.b.g r10 = com.google.assistant.p3886c.p3888b.C50722g.UNSPECIFIED
            r9.mo53434c(r10)
            com.google.assistant.c.b.h r9 = r9.mo53432a()
            goto L_0x009e
        L_0x009d:
            r9 = r8
        L_0x009e:
            boolean r10 = r0.f359532h
            if (r10 == 0) goto L_0x00c0
            com.google.android.apps.search.assistant.platform.pcp.f.r r10 = r0.f359525a
            int r11 = r10.f341965a
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x00c0
            java.lang.String r10 = r10.f341976l
            java.lang.String r11 = "flightLandingData.appTapUrl"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x00c0
            com.google.android.apps.search.assistant.platform.pcp.f.r r10 = r0.f359525a
            int r10 = r10.f341965a
            r10 = r10 & 2
            if (r10 == 0) goto L_0x00c0
            r4 = 1
        L_0x00c0:
            if (r4 == 0) goto L_0x00fd
            com.google.android.apps.search.assistant.platform.pcp.f.r r10 = r0.f359525a
            java.lang.String r10 = r10.f341976l
            android.content.Intent r10 = android.content.Intent.parseUri(r10, r5)
            r11 = 268435457(0x10000001, float:2.5243552E-29)
            r10.addFlags(r11)
            com.google.assistant.c.cr r11 = com.google.assistant.p3886c.C50794cr.FLIGHT_LANDING
            com.google.assistant.c.b.p r12 = com.google.assistant.p3886c.p3888b.C50731p.START_ACTIVITY
            android.content.Intent r10 = com.google.android.apps.gsa.h.c.a.a(r10, r8, r11, r12)
            com.google.assistant.c.b.r r11 = com.google.assistant.p3886c.p3888b.C50733r.f132021d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.c.b.q r11 = (com.google.assistant.p3886c.p3888b.C50732q) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r6)
            com.google.assistant.c.b.t r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            com.google.assistant.c.b.p r12 = com.google.assistant.p3886c.p3888b.C50731p.START_ACTIVITY
            r11.mo53443b(r12)
            java.lang.String r10 = r10.toUri(r5)
            java.lang.String r12 = "wrappedIntent.toUri(Intent.URI_INTENT_SCHEME)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r12)
            r11.mo53444c(r10)
            com.google.assistant.c.b.r r10 = r11.mo53442a()
            goto L_0x00fe
        L_0x00fd:
            r10 = r8
        L_0x00fe:
            if (r1 == 0) goto L_0x011a
            r2.f359516a = r0
            r2.f359517b = r7
            r2.f359518c = r9
            r2.f359519d = r10
            r2.f359522g = r5
            java.lang.Object r1 = r0.mo110201b(r4, r2)
            if (r1 == r3) goto L_0x0119
            r2 = r0
            r4 = r9
            r3 = r10
        L_0x0113:
            r8 = r1
            com.google.assistant.c.b.n r8 = (com.google.assistant.p3886c.p3888b.C50729n) r8
            r10 = r3
            r9 = r4
            goto L_0x011b
        L_0x0119:
            return r3
        L_0x011a:
            r2 = r0
        L_0x011b:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.a.a.a.i r2 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131588i) r2
            boolean r1 = r2.f359531g
            if (r1 == 0) goto L_0x0124
            com.google.android.apps.d.a.a.b.a.a r1 = com.google.android.apps.p471d.p472a.p473a.p475b.p476a.C9027a.FLIGHT
            goto L_0x0126
        L_0x0124:
            com.google.android.apps.d.a.a.b.a.a r1 = com.google.android.apps.p471d.p472a.p473a.p475b.p476a.C9027a.FLIGHT_LANDING
        L_0x0126:
            int r3 = r2.f359526b
            com.google.assistant.c.c.e r1 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131593n.m214002a(r3, r1)
            com.google.assistant.c.dj r3 = com.google.assistant.p3886c.C50813dj.f132278a
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.c.di r3 = (com.google.assistant.p3886c.C50812di) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r6)
            java.lang.String r4 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r4)
            com.google.protobuf.bt r11 = com.google.assistant.p3886c.C50755bt.f132079d
            java.lang.String r12 = "ext"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            com.google.assistant.c.bt r12 = com.google.assistant.p3886c.C50755bt.f132078c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.c.bs r12 = (com.google.assistant.p3886c.C50754bs) r12
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r4)
            com.google.android.apps.search.assistant.platform.pcp.f.r r4 = r2.f359525a
            java.lang.String r13 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r13)
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.assistant.c.bt r14 = (com.google.assistant.p3886c.C50755bt) r14
            r4.getClass()
            r14.f132082b = r4
            int r4 = r14.f132081a
            r4 = r4 | r5
            r14.f132081a = r4
            com.google.protobuf.bv r4 = r12.build()
            java.lang.String r12 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r12)
            com.google.assistant.c.bt r4 = (com.google.assistant.p3886c.C50755bt) r4
            java.lang.String r14 = "extension"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r14)
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r13)
            r3.mo58885m(r11, r4)
            com.google.protobuf.bv r3 = r3.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)
            com.google.assistant.c.dj r3 = (com.google.assistant.p3886c.C50813dj) r3
            com.google.common.f.a.d r4 = r2.f359533i
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.a.a r4 = (com.google.common.p4526f.p4527a.C58970a) r4
            java.lang.String r11 = "#getParsedCard: flight landing card, cardId: %s"
            int r12 = r2.f359526b
            r4.mo56387q(r11, r12)
            com.google.assistant.c.do r4 = com.google.assistant.p3886c.C50818do.f132293H
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.c.cn r4 = (com.google.assistant.p3886c.C50790cn) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            com.google.assistant.c.dr r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            int r11 = r2.f359526b
            com.google.assistant.c.cn r12 = r4.f132334a
            r12.copyOnWrite()
            com.google.protobuf.bv r12 = r12.instance
            com.google.assistant.c.do r12 = (com.google.assistant.p3886c.C50818do) r12
            int r14 = r12.f132304a
            r14 = r14 | 4
            r12.f132304a = r14
            r12.f132307d = r11
            r4.mo53477g()
            com.google.assistant.c.cp r11 = com.google.assistant.p3886c.C50792cp.PRIMARY
            r4.mo53472b(r11)
            com.google.assistant.c.cr r11 = com.google.assistant.p3886c.C50794cr.FLIGHT_LANDING
            r4.mo53473c(r11)
            j$.time.Instant r11 = r2.f359535k
            long r11 = r11.toEpochMilli()
            com.google.assistant.c.cn r14 = r4.f132334a
            r14.copyOnWrite()
            com.google.protobuf.bv r14 = r14.instance
            com.google.assistant.c.do r14 = (com.google.assistant.p3886c.C50818do) r14
            int r15 = r14.f132304a
            r15 = r15 | 4096(0x1000, float:5.74E-42)
            r14.f132304a = r15
            r14.f132317n = r11
            j$.time.Instant r11 = r2.f359535k
            long r11 = r11.toEpochMilli()
            com.google.assistant.c.cn r14 = r4.f132334a
            r14.copyOnWrite()
            com.google.protobuf.bv r14 = r14.instance
            com.google.assistant.c.do r14 = (com.google.assistant.p3886c.C50818do) r14
            int r15 = r14.f132304a
            r15 = r15 | 8192(0x2000, float:1.14794E-41)
            r14.f132304a = r15
            r14.f132318o = r11
            j$.time.Duration r11 = r2.f359536l
            long r11 = r11.toMillis()
            com.google.assistant.c.cn r14 = r4.f132334a
            r14.copyOnWrite()
            com.google.protobuf.bv r14 = r14.instance
            com.google.assistant.c.do r14 = (com.google.assistant.p3886c.C50818do) r14
            int r15 = r14.f132304a
            r15 = r15 | 16384(0x4000, float:2.2959E-41)
            r14.f132304a = r15
            r14.f132319p = r11
            r4.mo53476f()
            com.google.assistant.c.ct r11 = com.google.assistant.p3886c.C50796ct.f132223c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.c.cs r11 = (com.google.assistant.p3886c.C50795cs) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r6)
            com.google.assistant.c.dt r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            j$.time.Instant r12 = r2.f359537m
            long r14 = r12.toEpochMilli()
            com.google.assistant.c.cs r12 = r11.f132335a
            r12.copyOnWrite()
            com.google.protobuf.bv r12 = r12.instance
            com.google.assistant.c.ct r12 = (com.google.assistant.p3886c.C50796ct) r12
            int r0 = r12.f132225a
            r0 = r0 | r5
            r12.f132225a = r0
            r12.f132226b = r14
            com.google.assistant.c.ct r0 = r11.mo53478a()
            r4.mo53475e(r0)
            java.lang.String r0 = "loggingInfo"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r0)
            com.google.assistant.c.c.h r0 = com.google.assistant.p3886c.p3889c.C50770h.f132124g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.c.c.a r0 = (com.google.assistant.p3886c.p3889c.C50763a) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            com.google.assistant.c.c.j r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.assistant.c.c.g r5 = com.google.assistant.p3886c.p3889c.C50769g.DEFAULT
            r0.mo53449d(r5)
            com.google.assistant.c.c.c r5 = com.google.assistant.p3886c.p3889c.C50765c.f132101g
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.c.c.b r5 = (com.google.assistant.p3886c.p3889c.C50764b) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.assistant.c.c.l r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.assistant.c.b.h r7 = (com.google.assistant.p3886c.p3888b.C50723h) r7
            r5.mo53454e(r7)
            r5.mo53452c(r1)
            if (r10 == 0) goto L_0x0271
            com.google.assistant.c.b.r r10 = (com.google.assistant.p3886c.p3888b.C50733r) r10
            r5.mo53453d(r10)
        L_0x0271:
            com.google.assistant.c.c.c r1 = r5.mo53450a()
            r0.mo53447b(r1)
            if (r9 == 0) goto L_0x029a
            if (r8 == 0) goto L_0x029a
            com.google.assistant.c.c.c r1 = com.google.assistant.p3886c.p3889c.C50765c.f132101g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.c.c.b r1 = (com.google.assistant.p3886c.p3889c.C50764b) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)
            com.google.assistant.c.c.l r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.assistant.c.b.h r9 = (com.google.assistant.p3886c.p3888b.C50723h) r9
            r1.mo53454e(r9)
            r1.mo53451b(r8)
            com.google.assistant.c.c.c r1 = r1.mo53450a()
            r0.mo53448c(r1)
        L_0x029a:
            com.google.assistant.c.c.c r1 = com.google.assistant.p3886c.p3889c.C50765c.f132101g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.c.c.b r1 = (com.google.assistant.p3886c.p3889c.C50764b) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)
            com.google.assistant.c.c.l r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.apps.search.assistant.platform.pcp.f.r r2 = r2.f359525a
            boolean r2 = r2.f341972h
            com.google.assistant.c.c.b r5 = r1.f132134a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.assistant.c.c.c r5 = (com.google.assistant.p3886c.p3889c.C50765c) r5
            int r6 = r5.f132103a
            r6 = r6 | 16
            r5.f132103a = r6
            r5.f132108f = r2
            com.google.assistant.c.c.c r1 = r1.mo53450a()
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r13)
            com.google.assistant.c.c.a r2 = r0.f132133a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.assistant.c.c.h r2 = (com.google.assistant.p3886c.p3889c.C50770h) r2
            r1.getClass()
            r2.f132130e = r1
            int r1 = r2.f132126a
            r1 = r1 | 8
            r2.f132126a = r1
            com.google.assistant.c.c.h r0 = r0.mo53446a()
            r4.mo53474d(r0)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r13)
            com.google.assistant.c.cn r0 = r4.f132334a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0
            r3.getClass()
            r0.f132329z = r3
            int r1 = r0.f132304a
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r2
            r0.f132304a = r1
            com.google.assistant.c.do r0 = r4.mo53471a()
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            java.lang.String r1 = "of(\n      smartspaceCard…cardPayload\n      }\n    )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9991a.p9992a.p9993a.C131588i.mo110202c(h.c.g):java.lang.Object");
    }
}
