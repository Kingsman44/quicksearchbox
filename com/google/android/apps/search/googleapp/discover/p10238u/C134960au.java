package com.google.android.apps.search.googleapp.discover.p10238u;

import android.net.Uri;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40448h;
import com.google.common.p4522b.C58487gw;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.DiscoverUrlFetcher$fetchInternal$2", mo61344c = "DiscoverUrlFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {137, 138, 141, 145, 150, 181})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.au */
/* compiled from: PG */
final class C134960au extends C69572j implements C69630p {

    /* renamed from: a */
    Object f367456a;

    /* renamed from: b */
    Object f367457b;

    /* renamed from: c */
    Object f367458c;

    /* renamed from: d */
    int f367459d;

    /* renamed from: e */
    final /* synthetic */ Uri f367460e;

    /* renamed from: f */
    final /* synthetic */ C134962aw f367461f;

    /* renamed from: g */
    final /* synthetic */ C40448h f367462g;

    /* renamed from: h */
    final /* synthetic */ boolean f367463h;

    /* renamed from: i */
    final /* synthetic */ C58487gw f367464i;

    /* renamed from: j */
    final /* synthetic */ C63088z f367465j;

    /* renamed from: k */
    private /* synthetic */ Object f367466k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134960au(Uri uri, C134962aw awVar, C40448h hVar, boolean z, C58487gw gwVar, C63088z zVar, C69577g gVar) {
        super(2, gVar);
        this.f367460e = uri;
        this.f367461f = awVar;
        this.f367462g = hVar;
        this.f367463h = z;
        this.f367464i = gwVar;
        this.f367465j = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134960au) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0129, code lost:
        if (r11 != r0) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0172, code lost:
        if (r2 == r0) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0192, code lost:
        if (r2 != r0) goto L_0x0194;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02c0 A[Catch:{ Exception -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02e0 A[Catch:{ Exception -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0360 A[Catch:{ Exception -> 0x0022 }, LOOP:2: B:76:0x035a->B:78:0x0360, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r1.f367459d
            r3 = 5
            r4 = 4
            r5 = 0
            r6 = 2
            r7 = 1
            r8 = 3
            java.lang.String r9 = "uri.toString()"
            r10 = 0
            if (r2 == 0) goto L_0x0080
            if (r2 == r7) goto L_0x0065
            if (r2 == r6) goto L_0x0051
            if (r2 == r8) goto L_0x003d
            if (r2 == r4) goto L_0x0031
            if (r2 == r3) goto L_0x0025
            p5462h.C69714l.m101134b(r18)     // Catch:{ Exception -> 0x0022 }
            r2 = r18
            goto L_0x02b3
        L_0x0022:
            r0 = move-exception
            goto L_0x0399
        L_0x0025:
            java.lang.Object r2 = r1.f367466k
            com.google.frameworks.client.data.android.ae r2 = (com.google.frameworks.client.data.android.C61363ae) r2
            p5462h.C69714l.m101134b(r18)
            r11 = r2
            r2 = r18
            goto L_0x0194
        L_0x0031:
            java.lang.Object r2 = r1.f367466k
            com.google.frameworks.client.data.android.ae r2 = (com.google.frameworks.client.data.android.C61363ae) r2
            p5462h.C69714l.m101134b(r18)
            r11 = r2
            r2 = r18
            goto L_0x0174
        L_0x003d:
            java.lang.Object r2 = r1.f367457b
            com.google.common.l.i r2 = (com.google.common.p4541l.C59326i) r2
            java.lang.Object r8 = r1.f367456a
            com.google.frameworks.client.data.android.ad r8 = (com.google.frameworks.client.data.android.C61362ad) r8
            java.lang.Object r11 = r1.f367466k
            com.google.frameworks.client.data.android.ae r11 = (com.google.frameworks.client.data.android.C61363ae) r11
            p5462h.C69714l.m101134b(r18)
            r3 = r8
            r8 = r18
            goto L_0x0150
        L_0x0051:
            java.lang.Object r2 = r1.f367457b
            com.google.frameworks.client.data.android.ad r2 = (com.google.frameworks.client.data.android.C61362ad) r2
            java.lang.Object r11 = r1.f367456a
            com.google.frameworks.client.data.android.ae r11 = (com.google.frameworks.client.data.android.C61363ae) r11
            java.lang.Object r12 = r1.f367466k
            kotlinx.coroutines.be r12 = (kotlinx.coroutines.C71604be) r12
            p5462h.C69714l.m101134b(r18)
            r3 = r11
            r11 = r18
            goto L_0x012b
        L_0x0065:
            java.lang.Object r2 = r1.f367458c
            java.lang.Object r11 = r1.f367457b
            com.google.frameworks.client.data.android.ae r11 = (com.google.frameworks.client.data.android.C61363ae) r11
            java.lang.Object r12 = r1.f367456a
            kotlinx.coroutines.be r12 = (kotlinx.coroutines.C71604be) r12
            java.lang.Object r13 = r1.f367466k
            kotlinx.coroutines.be r13 = (kotlinx.coroutines.C71604be) r13
            p5462h.C69714l.m101134b(r18)
            r3 = r11
            r11 = r18
            r16 = r13
        L_0x007b:
            r13 = r12
            r12 = r16
            goto L_0x010e
        L_0x0080:
            p5462h.C69714l.m101134b(r18)
            java.lang.Object r2 = r1.f367466k
            kotlinx.coroutines.aw r2 = (kotlinx.coroutines.C71422aw) r2
            com.google.android.apps.search.googleapp.discover.u.aw r11 = r1.f367461f
            java.util.List r11 = r11.f367477h
            android.net.Uri r12 = r1.f367460e
            java.util.Iterator r11 = r11.iterator()
        L_0x0091:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00b3
            java.lang.Object r13 = r11.next()
            r14 = r13
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = r12.toString()
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r9)
            java.lang.String r3 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r3)
            boolean r3 = p5462h.p5483m.C69764m.m101205y(r15, r14, r5)
            if (r3 == 0) goto L_0x00b1
            goto L_0x00b4
        L_0x00b1:
            r3 = 5
            goto L_0x0091
        L_0x00b3:
            r13 = r10
        L_0x00b4:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L_0x0416
            com.google.android.apps.search.googleapp.discover.u.as r3 = new com.google.android.apps.search.googleapp.discover.u.as
            com.google.android.apps.search.googleapp.discover.u.aw r11 = r1.f367461f
            r3.<init>(r11, r10)
            kotlinx.coroutines.be r3 = kotlinx.coroutines.C71803m.m105042c(r2, r10, r10, r3, r8)
            com.google.android.apps.search.googleapp.discover.u.at r11 = new com.google.android.apps.search.googleapp.discover.u.at
            com.google.android.apps.search.googleapp.discover.u.aw r12 = r1.f367461f
            r11.<init>(r12, r10)
            kotlinx.coroutines.be r11 = kotlinx.coroutines.C71803m.m105042c(r2, r10, r10, r11, r8)
            com.google.android.apps.search.googleapp.discover.u.ar r12 = new com.google.android.apps.search.googleapp.discover.u.ar
            com.google.android.apps.search.googleapp.discover.u.aw r13 = r1.f367461f
            r12.<init>(r13, r10)
            kotlinx.coroutines.be r12 = kotlinx.coroutines.C71803m.m105042c(r2, r10, r10, r12, r8)
            com.google.frameworks.client.data.android.ae r2 = new com.google.frameworks.client.data.android.ae
            r2.<init>()
            android.net.Uri r13 = r1.f367460e
            java.lang.String r13 = r13.toString()
            r13.getClass()
            r2.f165930a = r13
            com.google.android.libraries.search.rendering.xuikit.d.j.h r13 = r1.f367462g
            java.lang.String r13 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40446f.m70145a(r13)
            r2.mo57933b(r13)
            java.lang.String r13 = "User-Agent"
            com.google.frameworks.client.data.android.ad r13 = com.google.frameworks.client.data.android.C61362ad.m93870b(r13)
            r1.f367466k = r3
            r1.f367456a = r12
            r1.f367457b = r2
            r1.f367458c = r13
            r1.f367459d = r7
            java.lang.Object r11 = r11.mo62825a(r1)
            if (r11 == r0) goto L_0x0415
            r16 = r3
            r3 = r2
            r2 = r13
            goto L_0x007b
        L_0x010e:
            java.lang.String r11 = (java.lang.String) r11
            com.google.frameworks.client.data.android.ad r2 = (com.google.frameworks.client.data.android.C61362ad) r2
            r3.mo57932a(r2, r11)
            java.lang.String r2 = "X-Client-Data"
            com.google.frameworks.client.data.android.ad r2 = com.google.frameworks.client.data.android.C61362ad.m93870b(r2)
            r1.f367466k = r12
            r1.f367456a = r3
            r1.f367457b = r2
            r1.f367458c = r10
            r1.f367459d = r6
            java.lang.Object r11 = r13.mo62825a(r1)
            if (r11 == r0) goto L_0x0415
        L_0x012b:
            java.lang.String r11 = (java.lang.String) r11
            r3.mo57932a(r2, r11)
            java.lang.String r2 = "search.now.ClientInfo-bin"
            com.google.frameworks.client.data.android.ad r2 = com.google.frameworks.client.data.android.C61362ad.m93870b(r2)
            com.google.common.l.i r11 = com.google.common.p4541l.C59326i.f157516d
            com.google.common.l.i r11 = r11.mo56826f()
            r1.f367466k = r3
            r1.f367456a = r2
            r1.f367457b = r11
            r1.f367459d = r8
            java.lang.Object r8 = r12.mo62825a(r1)
            if (r8 == r0) goto L_0x0415
            r16 = r3
            r3 = r2
            r2 = r11
            r11 = r16
        L_0x0150:
            com.google.bv.e.b.c.a.u r8 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u) r8
            byte[] r8 = r8.toByteArray()
            int r12 = r8.length
            java.lang.String r2 = r2.mo56837l(r8, r12)
            r11.mo57932a(r3, r2)
            boolean r2 = r1.f367463h
            r11.f165933d = r2
            com.google.android.apps.search.googleapp.discover.u.aw r2 = r1.f367461f
            android.net.Uri r3 = r1.f367460e
            r1.f367466k = r11
            r1.f367456a = r10
            r1.f367457b = r10
            r1.f367459d = r4
            java.lang.Object r2 = r2.mo112095e(r3, r1)
            if (r2 == r0) goto L_0x0415
        L_0x0174:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0181
            java.lang.String r3 = "Cookie"
            com.google.frameworks.client.data.android.ad r3 = com.google.frameworks.client.data.android.C61362ad.m93870b(r3)
            r11.mo57932a(r3, r2)
        L_0x0181:
            com.google.android.apps.search.googleapp.discover.u.aw r2 = r1.f367461f
            com.google.android.libraries.search.d.j r2 = r2.f367475f
            com.google.common.util.concurrent.cx r2 = r2.mo17428b()
            r1.f367466k = r11
            r3 = 5
            r1.f367459d = r3
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r1)
            if (r2 == r0) goto L_0x0415
        L_0x0194:
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2
            java.lang.Object r2 = r2.mo56111f()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x01a8
            java.lang.String r3 = "Authorization"
            com.google.frameworks.client.data.android.ad r3 = com.google.frameworks.client.data.android.C61362ad.m93870b(r3)
            r11.mo57932a(r3, r2)
            goto L_0x01c9
        L_0x01a8:
            com.google.common.f.e r2 = com.google.android.apps.search.googleapp.discover.p10238u.C134962aw.f367470a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 40391(0x9dc7, float:5.66E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "AuthHeader is absent"
            r2.mo56386p(r3)
            com.google.android.apps.search.googleapp.discover.u.aw r2 = r1.f367461f
            com.google.android.libraries.search.logging.d.kr r2 = r2.f367479j
            java.lang.String r3 = "XUIKIT_FETCHER"
            r2.mo41719h(r3)
        L_0x01c9:
            com.google.common.b.gw r2 = r1.f367464i
            if (r2 == 0) goto L_0x0207
            java.lang.String r2 = "httpRequestBuilder"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            com.google.common.b.gw r2 = r1.f367464i
            com.google.android.libraries.search.rendering.xuikit.d.j.g r3 = com.google.android.apps.search.googleapp.discover.p10238u.C134963ax.f367484a
            com.google.common.b.gg r2 = r2.mo54948A()
            com.google.common.b.sl r2 = r2.iterator()
        L_0x01de:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0207
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.String r4 = "headerKeyMap.entries()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            java.lang.Object r4 = r3.getKey()
            com.google.android.libraries.search.rendering.xuikit.d.j.g r4 = (com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40447g) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r4.mo42435a()
            com.google.frameworks.client.data.android.ad r4 = com.google.frameworks.client.data.android.C61362ad.m93870b(r4)
            r11.mo57932a(r4, r3)
            goto L_0x01de
        L_0x0207:
            com.google.protobuf.z r2 = r1.f367465j
            if (r2 == 0) goto L_0x0295
            com.google.common.b.gw r2 = r1.f367464i
            if (r2 == 0) goto L_0x0277
            com.google.android.libraries.search.rendering.xuikit.d.j.g r3 = com.google.android.apps.search.googleapp.discover.p10238u.C134963ax.f367484a
            com.google.common.b.hd r2 = r2.map
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x0277
            com.google.android.libraries.search.rendering.xuikit.d.j.h r2 = r1.f367462g
            com.google.android.libraries.search.rendering.xuikit.d.j.h r3 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40448h.POST
            if (r2 == r3) goto L_0x025b
            com.google.android.libraries.search.rendering.xuikit.d.j.h r2 = r1.f367462g
            com.google.android.libraries.search.rendering.xuikit.d.j.h r3 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40448h.PUT
            if (r2 != r3) goto L_0x0226
            goto L_0x025b
        L_0x0226:
            com.google.android.apps.search.googleapp.discover.u.aw r0 = r1.f367461f
            java.util.Collection r2 = r0.f367478i
            android.net.Uri r3 = r1.f367460e
            java.lang.String r3 = r3.toString()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r9)
            java.lang.String r4 = "Post body data specified for wrong http method."
            com.google.android.apps.search.googleapp.discover.u.ap r0 = r0.mo112094b(r3, r4)
            r2.add(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            com.google.android.libraries.search.rendering.xuikit.d.j.h r2 = r1.f367462g
            java.lang.String r2 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40446f.m70145a(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't send post body data for a "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " http method."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x025b:
            com.google.common.b.gw r2 = r1.f367464i
            com.google.android.libraries.search.rendering.xuikit.d.j.g r3 = com.google.android.apps.search.googleapp.discover.p10238u.C134963ax.f367484a
            com.google.common.b.gu r2 = r2.mo55277g(r3)
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            com.google.protobuf.z r3 = r1.f367465j
            byte[] r3 = r3.mo59174N()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            r11.mo57934c(r2, r3)
            goto L_0x0295
        L_0x0277:
            com.google.android.apps.search.googleapp.discover.u.aw r0 = r1.f367461f
            java.util.Collection r2 = r0.f367478i
            android.net.Uri r3 = r1.f367460e
            java.lang.String r3 = r3.toString()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r9)
            java.lang.String r4 = "Missing CONTENT-TYPE header"
            com.google.android.apps.search.googleapp.discover.u.ap r0 = r0.mo112094b(r3, r4)
            r2.add(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Can't send post data without Content-Type header."
            r0.<init>(r2)
            throw r0
        L_0x0295:
            com.google.frameworks.client.data.android.ag r2 = new com.google.frameworks.client.data.android.ag
            r2.<init>(r11)
            com.google.android.apps.search.googleapp.discover.u.aw r3 = r1.f367461f     // Catch:{ Exception -> 0x0022 }
            com.google.frameworks.client.data.android.o r3 = r3.f367471b     // Catch:{ Exception -> 0x0022 }
            com.google.common.util.concurrent.cx r2 = r3.mo42484a(r2)     // Catch:{ Exception -> 0x0022 }
            java.lang.String r3 = "httpClient.makeRequest(httpRequest)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ Exception -> 0x0022 }
            r1.f367466k = r10     // Catch:{ Exception -> 0x0022 }
            r3 = 6
            r1.f367459d = r3     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r1)     // Catch:{ Exception -> 0x0022 }
            if (r2 != r0) goto L_0x02b3
            return r0
        L_0x02b3:
            com.google.frameworks.client.data.android.ah r2 = (com.google.frameworks.client.data.android.C61366ah) r2     // Catch:{ Exception -> 0x0022 }
            java.lang.String r0 = "httpResponse"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r0)     // Catch:{ Exception -> 0x0022 }
            boolean r0 = com.google.android.apps.search.googleapp.discover.p10238u.C134963ax.m218867a(r2)     // Catch:{ Exception -> 0x0022 }
            if (r0 == 0) goto L_0x02e0
            com.google.android.apps.search.googleapp.discover.u.aw r0 = r1.f367461f     // Catch:{ Exception -> 0x0022 }
            java.util.Collection r3 = r0.f367478i     // Catch:{ Exception -> 0x0022 }
            android.net.Uri r4 = r1.f367460e     // Catch:{ Exception -> 0x0022 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0022 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r9)     // Catch:{ Exception -> 0x0022 }
            java.lang.String r5 = "Success"
            com.google.android.apps.search.googleapp.discover.u.ap r0 = r0.mo112094b(r4, r5)     // Catch:{ Exception -> 0x0022 }
            r3.add(r0)     // Catch:{ Exception -> 0x0022 }
            com.google.android.apps.search.googleapp.discover.u.aw r0 = r1.f367461f     // Catch:{ Exception -> 0x0022 }
            com.google.android.libraries.search.logging.d.kr r0 = r0.f367479j     // Catch:{ Exception -> 0x0022 }
            java.lang.String r3 = "SUCCESS"
            r0.mo41720i(r3)     // Catch:{ Exception -> 0x0022 }
            goto L_0x032d
        L_0x02e0:
            com.google.android.apps.search.googleapp.discover.u.aw r0 = r1.f367461f     // Catch:{ Exception -> 0x0022 }
            java.util.Collection r3 = r0.f367478i     // Catch:{ Exception -> 0x0022 }
            android.net.Uri r4 = r1.f367460e     // Catch:{ Exception -> 0x0022 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0022 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r9)     // Catch:{ Exception -> 0x0022 }
            int r8 = r2.f165947c     // Catch:{ Exception -> 0x0022 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0022 }
            r11.<init>()     // Catch:{ Exception -> 0x0022 }
            java.lang.String r12 = "Response was "
            r11.append(r12)     // Catch:{ Exception -> 0x0022 }
            r11.append(r8)     // Catch:{ Exception -> 0x0022 }
            java.lang.String r8 = r11.toString()     // Catch:{ Exception -> 0x0022 }
            com.google.android.apps.search.googleapp.discover.u.ap r0 = r0.mo112094b(r4, r8)     // Catch:{ Exception -> 0x0022 }
            r3.add(r0)     // Catch:{ Exception -> 0x0022 }
            com.google.android.apps.search.googleapp.discover.u.aw r0 = r1.f367461f     // Catch:{ Exception -> 0x0022 }
            com.google.android.libraries.search.logging.d.kr r0 = r0.f367479j     // Catch:{ Exception -> 0x0022 }
            java.lang.String r3 = "HTTP_FAILURE"
            r0.mo41720i(r3)     // Catch:{ Exception -> 0x0022 }
            com.google.android.apps.search.googleapp.discover.u.aw r0 = r1.f367461f     // Catch:{ Exception -> 0x0022 }
            com.google.android.libraries.search.logging.d.kr r0 = r0.f367479j     // Catch:{ Exception -> 0x0022 }
            int r3 = r2.f165947c     // Catch:{ Exception -> 0x0022 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0022 }
            com.google.android.libraries.search.logging.d.lw r0 = r0.f103056a     // Catch:{ Exception -> 0x0022 }
            com.google.common.base.cr r0 = r0.f103089B     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r0 = r0.mo6453a()     // Catch:{ Exception -> 0x0022 }
            com.google.android.libraries.au.d r0 = (com.google.android.libraries.p1635au.C19567d) r0     // Catch:{ Exception -> 0x0022 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0022 }
            r4[r5] = r3     // Catch:{ Exception -> 0x0022 }
            r7 = 1
            r0.mo24822a(r7, r4)     // Catch:{ Exception -> 0x0022 }
        L_0x032d:
            com.google.android.libraries.search.rendering.xuikit.d.j.b r0 = new com.google.android.libraries.search.rendering.xuikit.d.j.b     // Catch:{ Exception -> 0x0022 }
            r0.<init>()     // Catch:{ Exception -> 0x0022 }
            java.nio.ByteBuffer r3 = r2.f165946b     // Catch:{ Exception -> 0x0022 }
            com.google.protobuf.z r3 = com.google.protobuf.C63088z.m96153z(r3)     // Catch:{ Exception -> 0x0022 }
            r0.f106151a = r3     // Catch:{ Exception -> 0x0022 }
            int r3 = r2.f165947c     // Catch:{ Exception -> 0x0022 }
            r0.mo42440b(r3)     // Catch:{ Exception -> 0x0022 }
            boolean r3 = com.google.android.apps.search.googleapp.discover.p10238u.C134963ax.m218867a(r2)     // Catch:{ Exception -> 0x0022 }
            r0.mo42441c(r3)     // Catch:{ Exception -> 0x0022 }
            com.google.common.b.km r2 = r2.f165945a     // Catch:{ Exception -> 0x0022 }
            java.lang.String r3 = "headers"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ Exception -> 0x0022 }
            com.google.common.b.gv r3 = new com.google.common.b.gv     // Catch:{ Exception -> 0x0022 }
            r3.<init>()     // Catch:{ Exception -> 0x0022 }
            java.util.Collection r2 = r2.mo54948A()     // Catch:{ Exception -> 0x0022 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0022 }
        L_0x035a:
            boolean r4 = r2.hasNext()     // Catch:{ Exception -> 0x0022 }
            if (r4 == 0) goto L_0x0380
            java.lang.Object r4 = r2.next()     // Catch:{ Exception -> 0x0022 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ Exception -> 0x0022 }
            com.google.frameworks.client.data.android.ad r5 = (com.google.frameworks.client.data.android.C61362ad) r5     // Catch:{ Exception -> 0x0022 }
            java.lang.String r5 = r5.mo57931a()     // Catch:{ Exception -> 0x0022 }
            com.google.android.libraries.search.rendering.xuikit.d.j.g r5 = com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40447g.m70146b(r5)     // Catch:{ Exception -> 0x0022 }
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)     // Catch:{ Exception -> 0x0022 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x0022 }
            r3.mo55419c(r5, r4)     // Catch:{ Exception -> 0x0022 }
            goto L_0x035a
        L_0x0380:
            com.google.common.b.gw r2 = r3.mo55417a()     // Catch:{ Exception -> 0x0022 }
            java.lang.String r3 = "builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ Exception -> 0x0022 }
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)     // Catch:{ Exception -> 0x0022 }
            r0.f106152b = r2     // Catch:{ Exception -> 0x0022 }
            com.google.android.libraries.search.rendering.xuikit.d.j.j r0 = r0.mo42439a()     // Catch:{ Exception -> 0x0022 }
            java.lang.String r2 = "builder()\n    .setRawDat…derKeyMap())\n    .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)     // Catch:{ Exception -> 0x0022 }
            return r0
        L_0x0399:
            boolean r2 = r0 instanceof com.google.frameworks.client.data.android.C61361ac
            if (r2 == 0) goto L_0x03a1
            java.lang.Throwable r10 = r0.getCause()
        L_0x03a1:
            if (r10 == 0) goto L_0x03d7
            boolean r2 = r10 instanceof org.chromium.net.NetworkException
            if (r2 == 0) goto L_0x03d7
            org.chromium.net.NetworkException r10 = (org.chromium.net.NetworkException) r10
            int r2 = r10.getErrorCode()
            if (r2 != r6) goto L_0x03d7
            com.google.common.f.e r2 = com.google.android.apps.search.googleapp.discover.p10238u.C134962aw.f367470a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.x r2 = r2.mo56382g(r0)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 40393(0x9dc9, float:5.6603E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "No network available when fetching URL"
            r2.mo56386p(r3)
            com.google.android.apps.search.googleapp.discover.u.aw r2 = r1.f367461f
            com.google.android.libraries.search.logging.d.kr r2 = r2.f367479j
            java.lang.String r3 = "NO_NETWORK_FAILURE"
            r2.mo41720i(r3)
            goto L_0x03fe
        L_0x03d7:
            com.google.common.f.e r2 = com.google.android.apps.search.googleapp.discover.p10238u.C134962aw.f367470a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.x r2 = r2.mo56382g(r0)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 40392(0x9dc8, float:5.6601E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "An error occurred fetching URL"
            r2.mo56386p(r3)
            com.google.android.apps.search.googleapp.discover.u.aw r2 = r1.f367461f
            com.google.android.libraries.search.logging.d.kr r2 = r2.f367479j
            java.lang.String r3 = "FAILURE"
            r2.mo41720i(r3)
        L_0x03fe:
            com.google.android.apps.search.googleapp.discover.u.aw r2 = r1.f367461f
            java.util.Collection r3 = r2.f367478i
            android.net.Uri r4 = r1.f367460e
            java.lang.String r4 = r4.toString()
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r9)
            java.lang.String r5 = "Error during request"
            com.google.android.apps.search.googleapp.discover.u.ap r2 = r2.mo112094b(r4, r5)
            r3.add(r2)
            throw r0
        L_0x0415:
            return r0
        L_0x0416:
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.p10238u.C134962aw.f367470a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            android.net.Uri r2 = r1.f367460e
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 40394(0x9dca, float:5.6604E-41)
            r3.<init>(r4)
            r0.mo56379ah(r3)
            java.lang.String r3 = "Blocklisted async url: %s (matching: %s)"
            r0.mo56354G(r3, r2, r13)
            com.google.android.apps.search.googleapp.discover.u.aw r0 = r1.f367461f
            java.util.Collection r2 = r0.f367478i
            android.net.Uri r3 = r1.f367460e
            java.lang.String r3 = r3.toString()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r9)
            java.lang.String r4 = "Blocklisted"
            com.google.android.apps.search.googleapp.discover.u.ap r0 = r0.mo112094b(r3, r4)
            r2.add(r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            android.net.Uri r2 = r1.f367460e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Blocklisted async url: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " (matching: "
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            goto L_0x046a
        L_0x0469:
            throw r0
        L_0x046a:
            goto L_0x0469
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C134960au.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C134960au auVar = new C134960au(this.f367460e, this.f367461f, this.f367462g, this.f367463h, this.f367464i, this.f367465j, gVar);
        auVar.f367466k = obj;
        return auVar;
    }
}
