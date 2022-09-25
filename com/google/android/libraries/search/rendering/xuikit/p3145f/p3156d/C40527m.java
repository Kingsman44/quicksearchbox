package com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.web.profile.p3431a.C44051c;
import com.google.common.p4526f.C59071e;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61531o;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57809f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.d.m */
/* compiled from: PG */
public final class C40527m {

    /* renamed from: a */
    private static final C61362ad f106371a = C61362ad.m93870b("Cookie");

    /* renamed from: b */
    private static final C61362ad f106372b = C61362ad.m93870b("Authorization");

    /* renamed from: c */
    private static final C61362ad f106373c = C61362ad.m93870b("X-Goog-Api-Key");

    /* renamed from: d */
    private static final C61362ad f106374d = C61362ad.m93870b("X-Protobuffer-Request-Payload");

    /* renamed from: e */
    private static final C61362ad f106375e = C61362ad.m93870b("X-XBlend-Prefix-Length-Encoded");

    /* renamed from: f */
    private static final C61362ad f106376f = C61362ad.m93870b("X-XBlend-Response-Envelope-Wrapped");

    /* renamed from: g */
    private static final C59071e f106377g = C59071e.m91331h();

    /* renamed from: h */
    private final C44051c f106378h;

    /* renamed from: i */
    private final Optional f106379i;

    /* renamed from: j */
    private final C57809f f106380j;

    /* renamed from: k */
    private final C40364q f106381k;

    /* renamed from: l */
    private final C61531o f106382l;

    public C40527m(C44051c cVar, Optional optional, C57809f fVar, C40364q qVar, C61531o oVar) {
        this.f106378h = cVar;
        this.f106379i = optional;
        this.f106380j = fVar;
        this.f106381k = qVar;
        this.f106382l = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02d6, code lost:
        if (r2 != r4) goto L_0x02d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01f9 A[LOOP:0: B:44:0x01f3->B:46:0x01f9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42488a(com.google.p4283bv.p4287b.p4342b.C56943g r20, java.util.Locale r21, p3186j$.util.Optional r22, java.lang.String r23, java.util.Map r24, p5462h.p5466c.C69577g r25) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r25
            boolean r3 = r2 instanceof com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40526l
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.libraries.search.rendering.xuikit.f.d.l r3 = (com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40526l) r3
            int r4 = r3.f106370k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f106370k = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.libraries.search.rendering.xuikit.f.d.l r3 = new com.google.android.libraries.search.rendering.xuikit.f.d.l
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f106368i
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f106370k
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0084
            if (r5 == r8) goto L_0x0058
            if (r5 == r7) goto L_0x003d
            if (r5 != r6) goto L_0x0035
            p5462h.C69714l.m101134b(r2)
            goto L_0x02d8
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            java.lang.Object r1 = r3.f106366g
            byte[] r1 = (byte[]) r1
            java.lang.Object r5 = r3.f106365f
            com.google.frameworks.client.data.android.ae r5 = (com.google.frameworks.client.data.android.C61363ae) r5
            java.lang.Object r10 = r3.f106364e
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r3.f106363d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r3.f106362c
            java.lang.Object r13 = r3.f106361b
            java.lang.Object r14 = r3.f106360a
            p5462h.C69714l.m101134b(r2)
            goto L_0x01b6
        L_0x0058:
            java.lang.Object r1 = r3.f106367h
            byte[] r1 = (byte[]) r1
            java.lang.Object r5 = r3.f106366g
            com.google.frameworks.client.data.android.ae r5 = (com.google.frameworks.client.data.android.C61363ae) r5
            java.lang.Object r10 = r3.f106365f
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r3.f106364e
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r3.f106363d
            j$.util.Optional r12 = (p3186j$.util.Optional) r12
            java.lang.Object r13 = r3.f106362c
            java.lang.Object r14 = r3.f106361b
            java.lang.Object r15 = r3.f106360a
            p5462h.C69714l.m101134b(r2)
            r17 = r2
            r2 = r1
            r1 = r10
            r10 = r13
            r13 = r5
            r5 = r17
            r18 = r12
            r12 = r11
            r11 = r18
            goto L_0x0152
        L_0x0084:
            p5462h.C69714l.m101134b(r2)
            com.google.bv.j.b.b.t r2 = com.google.p4283bv.p4380j.p4385b.p4411b.C57823t.f154488d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bv.j.b.b.s r2 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57822s) r2
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            java.lang.String r10 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r10)
            com.google.protobuf.z r11 = r1.f151986c
            com.google.protobuf.ba r12 = com.google.protobuf.C62921ba.m95368a()
            com.google.bv.b.b.k r13 = com.google.p4283bv.p4287b.p4342b.C56947k.f151990a
            com.google.protobuf.bv r11 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r13, (com.google.protobuf.C63088z) r11, (com.google.protobuf.C62921ba) r12)
            com.google.bv.b.b.k r11 = (com.google.p4283bv.p4287b.p4342b.C56947k) r11
            java.lang.String r12 = "parseFrom(\n          xBl…ratedRegistry()\n        )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            java.lang.String r12 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r12)
            r2.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.bv.j.b.b.t r13 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57823t) r13
            r11.getClass()
            r13.f154491b = r11
            int r11 = r13.f154490a
            r11 = r11 | r8
            r13.f154490a = r11
            com.google.bv.j.b.b.f r11 = r0.f106380j
            r2.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            com.google.bv.j.b.b.t r13 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57823t) r13
            r13.f154492c = r11
            int r11 = r13.f154490a
            r11 = r11 | r7
            r13.f154490a = r11
            com.google.protobuf.bv r2 = r2.build()
            java.lang.String r11 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r11)
            com.google.bv.j.b.b.t r2 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57823t) r2
            j$.util.Optional r13 = r0.f106379i
            com.google.frameworks.client.data.android.ae r14 = new com.google.frameworks.client.data.android.ae
            r14.<init>()
            java.lang.Object r13 = r13.orElse(r14)
            com.google.frameworks.client.data.android.ae r13 = (com.google.frameworks.client.data.android.C61363ae) r13
            r13.f165933d = r8
            boolean r14 = r1.f151988e
            if (r14 == 0) goto L_0x0120
            com.google.bv.j.b.b.v r14 = com.google.p4283bv.p4380j.p4385b.p4411b.C57825v.f154494c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.bv.j.b.b.u r14 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57824u) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r5)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r12)
            r14.copyOnWrite()
            com.google.protobuf.bv r5 = r14.instance
            com.google.bv.j.b.b.v r5 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57825v) r5
            r2.getClass()
            r5.f154497b = r2
            int r2 = r5.f154496a
            r2 = r2 | r8
            r5.f154496a = r2
            com.google.protobuf.bv r2 = r14.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r11)
            com.google.bv.j.b.b.v r2 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57825v) r2
            byte[] r2 = r2.toByteArray()
            goto L_0x0128
        L_0x0120:
            com.google.protobuf.z r2 = r2.toByteString()
            byte[] r2 = r2.mo59174N()
        L_0x0128:
            com.google.android.libraries.web.profile.a.c r5 = r0.f106378h
            r3.f106360a = r0
            r3.f106361b = r1
            r10 = r21
            r3.f106362c = r10
            r11 = r22
            r3.f106363d = r11
            r12 = r23
            r3.f106364e = r12
            r14 = r24
            r3.f106365f = r14
            r3.f106366g = r13
            r3.f106367h = r2
            r3.f106370k = r8
            java.lang.String r15 = "https://www.google.com"
            java.lang.Object r5 = r5.mo47015d(r15, r3)
            if (r5 == r4) goto L_0x0378
            r15 = r0
            r17 = r14
            r14 = r1
            r1 = r17
        L_0x0152:
            java.lang.String r5 = (java.lang.String) r5
            int r16 = r5.length()
            if (r16 <= 0) goto L_0x0160
            com.google.frameworks.client.data.android.ad r6 = f106371a
            r13.mo57932a(r6, r5)
            goto L_0x0186
        L_0x0160:
            com.google.common.f.e r5 = f106377g
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.aa r6 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q.f106014a
            r8 = r15
            com.google.android.libraries.search.rendering.xuikit.f.d.m r8 = (com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40527m) r8
            com.google.android.libraries.search.rendering.xuikit.d.f.q r8 = r8.f106381k
            com.google.protos.aw.c.a.b.a.b r8 = r8.mo42422a()
            r5.mo56378ag(r6, r8)
            com.google.common.f.n r6 = new com.google.common.f.n
            r8 = 53350(0xd066, float:7.4759E-41)
            r6.<init>(r8)
            r5.mo56379ah(r6)
            java.lang.String r6 = "XBlend failed to get cookies for data service request."
            r5.mo56386p(r6)
        L_0x0186:
            java.lang.Object r5 = r11.orElse(r9)
            com.google.android.libraries.search.rendering.xuikit.f.b.a r5 = (com.google.android.libraries.search.rendering.xuikit.p3145f.p3154b.C40509a) r5
            if (r5 == 0) goto L_0x01ca
            java.lang.Object r5 = r5.mo17428b()
            com.google.common.util.concurrent.cx r5 = (com.google.common.util.concurrent.C60870cx) r5
            if (r5 == 0) goto L_0x01ca
            r3.f106360a = r15
            r3.f106361b = r14
            r3.f106362c = r10
            r3.f106363d = r12
            r3.f106364e = r1
            r3.f106365f = r13
            r3.f106366g = r2
            r3.f106367h = r9
            r3.f106370k = r7
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r3)
            if (r5 == r4) goto L_0x01c9
            r11 = r12
            r12 = r10
            r10 = r1
            r1 = r2
            r2 = r5
            r5 = r13
            r13 = r14
            r14 = r15
        L_0x01b6:
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            if (r2 == 0) goto L_0x01c1
            java.lang.Object r2 = r2.mo56111f()
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x01d2
        L_0x01c1:
            r2 = r1
            r1 = r10
            r10 = r12
            r15 = r14
            r12 = r11
            r14 = r13
            r13 = r5
            goto L_0x01ca
        L_0x01c9:
            return r4
        L_0x01ca:
            r11 = r12
            r5 = r13
            r13 = r14
            r14 = r15
            r12 = r10
            r10 = r1
            r1 = r2
            r2 = r9
        L_0x01d2:
            if (r2 != 0) goto L_0x01da
            com.google.frameworks.client.data.android.ad r2 = f106373c
            r5.mo57932a(r2, r11)
            goto L_0x01df
        L_0x01da:
            com.google.frameworks.client.data.android.ad r6 = f106372b
            r5.mo57932a(r6, r2)
        L_0x01df:
            com.google.bv.b.b.g r13 = (com.google.p4283bv.p4287b.p4342b.C56943g) r13
            java.lang.String r2 = r13.f151985b
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.util.Set r6 = r10.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x01f3:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x020f
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r11 = r8.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r2.appendQueryParameter(r11, r8)
            goto L_0x01f3
        L_0x020f:
            android.net.Uri r2 = r2.build()
            int r6 = r13.f151987d
            com.google.bv.b.b.e r6 = com.google.p4283bv.p4287b.p4342b.C56941e.m88234a(r6)
            if (r6 != 0) goto L_0x021d
            com.google.bv.b.b.e r6 = com.google.p4283bv.p4287b.p4342b.C56941e.PLATFORM_UNSPECIFIED
        L_0x021d:
            int r6 = r6.ordinal()
            java.lang.String r8 = "payload"
            java.lang.String r11 = "initialUri"
            java.lang.String r13 = "requestBuilder"
            r15 = 1
            if (r6 == r15) goto L_0x0269
            if (r6 == r7) goto L_0x0238
            r7 = 3
            if (r6 != r7) goto L_0x0230
            goto L_0x0238
        L_0x0230:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Specify the server inside the XBlendAddress: the value should not be ServerType.PLATFORM_UNSPECIFIED."
            r1.<init>(r2)
            throw r1
        L_0x0238:
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r13)
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r11)
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r8)
            java.lang.String r6 = "POST"
            r5.mo57933b(r6)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.lang.String r6 = "alt"
            java.lang.String r7 = "proto"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r6, r7)
            android.net.Uri r2 = r2.build()
            java.lang.String r2 = r2.toString()
            r2.getClass()
            r5.f165930a = r2
            java.lang.String r2 = "application/x-protobuf"
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            r5.mo57934c(r2, r1)
            goto L_0x02ac
        L_0x0269:
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r13)
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r11)
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r8)
            java.lang.String r6 = "GET"
            r5.mo57933b(r6)
            com.google.frameworks.client.data.android.ad r6 = f106374d
            com.google.common.l.i r7 = com.google.common.p4541l.C59326i.f157517e
            int r8 = r1.length
            java.lang.String r1 = r7.mo56837l(r1, r8)
            r5.mo57932a(r6, r1)
            android.net.Uri$Builder r1 = r2.buildUpon()
            java.lang.String r2 = "fmt"
            java.lang.String r6 = "bin"
            r1.appendQueryParameter(r2, r6)
            java.lang.String r2 = "hl"
            boolean r6 = r10.containsKey(r2)
            if (r6 != 0) goto L_0x029f
            java.util.Locale r12 = (java.util.Locale) r12
            java.lang.String r6 = r12.toLanguageTag()
            r1.appendQueryParameter(r2, r6)
        L_0x029f:
            android.net.Uri r1 = r1.build()
            java.lang.String r1 = r1.toString()
            r1.getClass()
            r5.f165930a = r1
        L_0x02ac:
            r1 = r14
            com.google.android.libraries.search.rendering.xuikit.f.d.m r1 = (com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40527m) r1
            com.google.frameworks.client.data.android.o r1 = r1.f106382l
            com.google.frameworks.client.data.android.ag r2 = new com.google.frameworks.client.data.android.ag
            r2.<init>(r5)
            com.google.common.util.concurrent.cx r1 = r1.mo42484a(r2)
            java.lang.String r2 = "httpClient.makeRequest(requestBuilder.build())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r3.f106360a = r14
            r3.f106361b = r9
            r3.f106362c = r9
            r3.f106363d = r9
            r3.f106364e = r9
            r3.f106365f = r9
            r3.f106366g = r9
            r3.f106367h = r9
            r2 = 3
            r3.f106370k = r2
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r3)
            if (r2 == r4) goto L_0x0378
        L_0x02d8:
            com.google.frameworks.client.data.android.ah r2 = (com.google.frameworks.client.data.android.C61366ah) r2
            if (r2 == 0) goto L_0x034e
            int r1 = r2.f165947c
            com.google.net.a.a.b r1 = com.google.frameworks.client.data.android.C61367ai.m93875a(r1)
            com.google.net.a.a.b r3 = com.google.net.p4726a.p4727a.C62722b.OK
            if (r1 != r3) goto L_0x034e
            com.google.common.b.km r1 = r2.f165945a
            com.google.frameworks.client.data.android.ad r3 = f106376f
            java.util.List r1 = r1.mo55277g(r3)
            java.lang.String r3 = "response.headers.get(XBL…DER_ENVELOPE_WRAPPED_KEY)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            java.lang.Object r1 = p5462h.p5463a.C69540x.m100821C(r1)
            java.lang.String r3 = "true"
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r1)
            com.google.common.b.km r4 = r2.f165945a
            com.google.frameworks.client.data.android.ad r5 = f106375e
            java.util.List r4 = r4.mo55277g(r5)
            java.lang.String r5 = "response.headers.get(XBL…REFIX_LENGTH_ENCODED_KEY)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            java.lang.Object r4 = p5462h.p5463a.C69540x.m100821C(r4)
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r4)
            java.nio.ByteBuffer r2 = r2.f165946b
            java.lang.String r4 = "response.responseBody"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.protobuf.ae r2 = com.google.protobuf.C62897ae.m95111N(r2)
            if (r3 == 0) goto L_0x0322
            r2.mo58675j()
        L_0x0322:
            if (r1 == 0) goto L_0x033c
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()
            com.google.bv.j.b.b.z r3 = com.google.p4283bv.p4380j.p4385b.p4411b.C57829z.f154506b
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (com.google.protobuf.C62897ae) r2, (com.google.protobuf.C62921ba) r1)
            com.google.bv.j.b.b.z r1 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57829z) r1
            com.google.bv.j.b.b.x r1 = r1.f154508a
            if (r1 != 0) goto L_0x0336
            com.google.bv.j.b.b.x r1 = com.google.p4283bv.p4380j.p4385b.p4411b.C57827x.f154499e
        L_0x0336:
            java.lang.String r2 = "{\n      XBlendResponseEn…    .xblendResponse\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            goto L_0x034d
        L_0x033c:
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()
            com.google.bv.j.b.b.x r3 = com.google.p4283bv.p4380j.p4385b.p4411b.C57827x.f154499e
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (com.google.protobuf.C62897ae) r2, (com.google.protobuf.C62921ba) r1)
            com.google.bv.j.b.b.x r1 = (com.google.p4283bv.p4380j.p4385b.p4411b.C57827x) r1
            java.lang.String r2 = "{\n      XBlendResponse.p…eneratedRegistry())\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
        L_0x034d:
            return r1
        L_0x034e:
            java.io.IOException r1 = new java.io.IOException
            if (r2 == 0) goto L_0x0359
            int r3 = r2.f165947c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x035a
        L_0x0359:
            r3 = r9
        L_0x035a:
            if (r2 == 0) goto L_0x035e
            com.google.common.b.km r9 = r2.f165945a
        L_0x035e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Request failed: status="
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = ", headers="
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0378:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d.C40527m.mo42488a(com.google.bv.b.b.g, java.util.Locale, j$.util.Optional, java.lang.String, java.util.Map, h.c.g):java.lang.Object");
    }
}
