package com.google.android.apps.search.googleapp.notifications.p10360a.p10361a;

import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.libraries.web.profile.C44074i;
import com.google.android.libraries.web.profile.p3439b.C44065d;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a.a.c */
/* compiled from: PG */
public final class C136718c {

    /* renamed from: a */
    private static final C59071e f372148a = C59071e.m91331h();

    /* renamed from: b */
    private final C44065d f372149b;

    /* renamed from: c */
    private final C44074i f372150c;

    /* renamed from: d */
    private final String f372151d;

    /* renamed from: e */
    private final C133665d f372152e;

    public C136718c(C44065d dVar, C44074i iVar, String str, C133665d dVar2) {
        C69664n.m101061g(dVar2, "userAgentHelper");
        this.f372149b = dVar;
        this.f372150c = iVar;
        this.f372151d = str;
        this.f372152e = dVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0110, code lost:
        if (r15 == r1) goto L_0x01f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0097 A[Catch:{ ac -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113337a(com.google.p4283bv.p4345d.C57029h r13, java.lang.String r14, p5462h.p5466c.C69577g r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136717b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.google.android.apps.search.googleapp.notifications.a.a.b r0 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136717b) r0
            int r1 = r0.f372147h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f372147h = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.notifications.a.a.b r0 = new com.google.android.apps.search.googleapp.notifications.a.a.b
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f372145f
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f372147h
            java.lang.String r3 = "Unable to send upload request"
            r4 = 3
            r5 = 2
            java.lang.String r6 = "getDefaultInstance()"
            r7 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r7) goto L_0x004b
            if (r2 == r5) goto L_0x003d
            if (r2 != r4) goto L_0x0035
            p5462h.C69714l.m101134b(r15)     // Catch:{ ac -> 0x0032 }
            goto L_0x0112
        L_0x0032:
            r13 = move-exception
            goto L_0x01f8
        L_0x0035:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003d:
            java.lang.Object r13 = r0.f372144e
            java.lang.Object r14 = r0.f372143d
            java.lang.Object r2 = r0.f372142c
            java.lang.Object r5 = r0.f372141b
            java.lang.Object r8 = r0.f372140a
            p5462h.C69714l.m101134b(r15)     // Catch:{ ac -> 0x0032 }
            goto L_0x009d
        L_0x004b:
            java.lang.Object r14 = r0.f372142c
            java.lang.Object r13 = r0.f372141b
            java.lang.Object r2 = r0.f372140a
            p5462h.C69714l.m101134b(r15)
            r8 = r2
            goto L_0x0073
        L_0x0056:
            p5462h.C69714l.m101134b(r15)
            com.google.android.apps.search.googleapp.config.d r15 = r12.f372152e
            com.google.common.util.concurrent.cx r15 = r15.mo111320a()
            java.lang.String r2 = "userAgentHelper.getUserAgent()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r2)
            r0.f372140a = r12
            r0.f372141b = r13
            r0.f372142c = r14
            r0.f372147h = r7
            java.lang.Object r15 = kotlinx.coroutines.p5578d.C71663i.m104690c(r15, r0)
            if (r15 == r1) goto L_0x0223
            r8 = r12
        L_0x0073:
            java.lang.String r15 = (java.lang.String) r15
            r2 = r8
            com.google.android.apps.search.googleapp.notifications.a.a.c r2 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136718c) r2     // Catch:{ ac -> 0x0032 }
            com.google.android.libraries.web.profile.b.d r2 = r2.f372149b     // Catch:{ ac -> 0x0032 }
            r9 = r8
            com.google.android.apps.search.googleapp.notifications.a.a.c r9 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136718c) r9     // Catch:{ ac -> 0x0032 }
            com.google.android.libraries.web.profile.i r9 = r9.f372150c     // Catch:{ ac -> 0x0032 }
            com.google.android.libraries.web.base.v r10 = com.google.android.libraries.web.base.C43271v.WEB_VIEW     // Catch:{ ac -> 0x0032 }
            com.google.common.util.concurrent.cx r9 = r9.mo47042b(r10)     // Catch:{ ac -> 0x0032 }
            r0.f372140a = r8     // Catch:{ ac -> 0x0032 }
            r0.f372141b = r13     // Catch:{ ac -> 0x0032 }
            r0.f372142c = r14     // Catch:{ ac -> 0x0032 }
            r0.f372143d = r15     // Catch:{ ac -> 0x0032 }
            r0.f372144e = r2     // Catch:{ ac -> 0x0032 }
            r0.f372147h = r5     // Catch:{ ac -> 0x0032 }
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)     // Catch:{ ac -> 0x0032 }
            if (r5 == r1) goto L_0x01f7
            r11 = r5
            r5 = r13
            r13 = r2
            r2 = r14
            r14 = r15
            r15 = r11
        L_0x009d:
            com.google.android.libraries.web.profile.Profile r15 = (com.google.android.libraries.web.profile.Profile) r15     // Catch:{ ac -> 0x0032 }
            com.google.android.libraries.web.profile.b.d r13 = (com.google.android.libraries.web.profile.p3439b.C44065d) r13     // Catch:{ ac -> 0x0032 }
            com.google.android.libraries.web.profile.b.c r13 = r13.mo47024a(r15)     // Catch:{ ac -> 0x0032 }
            com.google.protobuf.c r5 = (com.google.protobuf.C62947c) r5     // Catch:{ ac -> 0x0032 }
            byte[] r15 = r5.toByteArray()     // Catch:{ ac -> 0x0032 }
            r5 = 10
            java.lang.String r15 = android.util.Base64.encodeToString(r15, r5)     // Catch:{ ac -> 0x0032 }
            r5 = r8
            com.google.android.apps.search.googleapp.notifications.a.a.c r5 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136718c) r5     // Catch:{ ac -> 0x0032 }
            java.lang.String r5 = r5.f372151d     // Catch:{ ac -> 0x0032 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ ac -> 0x0032 }
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ ac -> 0x0032 }
            java.lang.String r9 = "reqpld"
            android.net.Uri$Builder r15 = r5.appendQueryParameter(r9, r15)     // Catch:{ ac -> 0x0032 }
            java.lang.String r5 = "fmt"
            java.lang.String r9 = "bin"
            android.net.Uri$Builder r15 = r15.appendQueryParameter(r5, r9)     // Catch:{ ac -> 0x0032 }
            android.net.Uri r15 = r15.build()     // Catch:{ ac -> 0x0032 }
            java.lang.String r5 = "parse(notificationEventU…UE_BINARY)\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r5)     // Catch:{ ac -> 0x0032 }
            java.lang.String r15 = r15.toString()     // Catch:{ ac -> 0x0032 }
            com.google.frameworks.client.data.android.ae r5 = new com.google.frameworks.client.data.android.ae     // Catch:{ ac -> 0x0032 }
            r5.<init>()     // Catch:{ ac -> 0x0032 }
            java.lang.String r9 = "GET"
            r5.mo57933b(r9)     // Catch:{ ac -> 0x0032 }
            r5.f165933d = r7     // Catch:{ ac -> 0x0032 }
            java.lang.String r9 = "User-Agent"
            com.google.frameworks.client.data.android.ad r9 = com.google.frameworks.client.data.android.C61362ad.m93870b(r9)     // Catch:{ ac -> 0x0032 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ ac -> 0x0032 }
            r5.mo57932a(r9, r14)     // Catch:{ ac -> 0x0032 }
            java.lang.String r14 = "X-Client-Data"
            com.google.frameworks.client.data.android.ad r14 = com.google.frameworks.client.data.android.C61362ad.m93870b(r14)     // Catch:{ ac -> 0x0032 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ ac -> 0x0032 }
            r5.mo57932a(r14, r2)     // Catch:{ ac -> 0x0032 }
            com.google.common.util.concurrent.cx r13 = r13.mo47023a(r15, r5)     // Catch:{ ac -> 0x0032 }
            r0.f372140a = r8     // Catch:{ ac -> 0x0032 }
            r14 = 0
            r0.f372141b = r14     // Catch:{ ac -> 0x0032 }
            r0.f372142c = r14     // Catch:{ ac -> 0x0032 }
            r0.f372143d = r14     // Catch:{ ac -> 0x0032 }
            r0.f372144e = r14     // Catch:{ ac -> 0x0032 }
            r0.f372147h = r4     // Catch:{ ac -> 0x0032 }
            java.lang.Object r15 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)     // Catch:{ ac -> 0x0032 }
            if (r15 == r1) goto L_0x01f7
        L_0x0112:
            com.google.frameworks.client.data.android.ah r15 = (com.google.frameworks.client.data.android.C61366ah) r15     // Catch:{ ac -> 0x0032 }
            java.lang.String r13 = "response"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r13)
            int r13 = r15.f165947c
            r14 = 200(0xc8, float:2.8E-43)
            if (r13 == r14) goto L_0x0138
            com.google.common.f.e r13 = f372148a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.n r14 = new com.google.common.f.n
            r0 = 40819(0x9f73, float:5.72E-41)
            r14.<init>(r0)
            r13.mo56379ah(r14)
            r13.mo56386p(r3)
            com.google.android.apps.search.googleapp.notifications.a.a.d r13 = com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.FAILED_UPLOAD_REQUEST
            goto L_0x015f
        L_0x0138:
            java.nio.ByteBuffer r13 = r15.f165946b
            if (r13 == 0) goto L_0x0145
            boolean r13 = r13.hasArray()
            if (r13 != r7) goto L_0x0145
            com.google.android.apps.search.googleapp.notifications.a.a.d r13 = com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.OK
            goto L_0x015f
        L_0x0145:
            com.google.common.f.e r13 = f372148a
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.n r14 = new com.google.common.f.n
            r0 = 40818(0x9f72, float:5.7198E-41)
            r14.<init>(r0)
            r13.mo56379ah(r14)
            java.lang.String r14 = "Successful response has no body."
            r13.mo56386p(r14)
            com.google.android.apps.search.googleapp.notifications.a.a.d r13 = com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.MISSING_RESPONSE
        L_0x015f:
            com.google.android.apps.search.googleapp.notifications.a.a.d r14 = com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.OK
            if (r13 != r14) goto L_0x01e6
            java.nio.ByteBuffer r13 = r15.f165946b
            com.google.protobuf.ae r14 = com.google.protobuf.C62897ae.m95111N(r13)
            int r15 = r14.mo58679n()
            int r14 = r14.mo58669d()
            r0 = 0
            r13.position(r0)
            int r1 = r13.remaining()
            int r15 = r15 + r14
            if (r1 != r15) goto L_0x01de
            r13.position(r14)
            com.google.bv.d.j r14 = com.google.p4283bv.p4345d.C57031j.f152256d
            com.google.protobuf.eb r14 = r14.getParserForType()
            com.google.protobuf.ba r15 = com.google.protobuf.C62921ba.m95368a()
            java.lang.Object r14 = r14.mo59014m(r13, r15)
            com.google.bv.d.j r14 = (com.google.p4283bv.p4345d.C57031j) r14
            r13.position(r0)
            java.lang.String r13 = "parsed"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r13)
            int r13 = r14.f152258a
            r13 = r13 & r7
            if (r13 == 0) goto L_0x01c5
            int r13 = r14.f152259b
            com.google.net.a.a.b r13 = com.google.net.p4726a.p4727a.C62722b.m94931a(r13)
            if (r13 != 0) goto L_0x01a6
            com.google.net.a.a.b r13 = com.google.net.p4726a.p4727a.C62722b.OK
        L_0x01a6:
            com.google.net.a.a.b r15 = com.google.net.p4726a.p4727a.C62722b.OK
            if (r13 == r15) goto L_0x01c5
            com.google.common.f.e r13 = f372148a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.n r15 = new com.google.common.f.n
            r0 = 40820(0x9f74, float:5.7201E-41)
            r15.<init>(r0)
            r13.mo56379ah(r15)
            java.lang.String r15 = "Upload response proto bad status"
            r13.mo56386p(r15)
            com.google.android.apps.search.googleapp.notifications.a.a.d r13 = com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.BAD_SERVER_RESPONSE_STATUS
            goto L_0x01c7
        L_0x01c5:
            com.google.android.apps.search.googleapp.notifications.a.a.d r13 = com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.OK
        L_0x01c7:
            com.google.android.apps.search.googleapp.notifications.a.a.d r15 = com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.OK
            java.lang.String r0 = "200"
            if (r13 == r15) goto L_0x01d8
            com.google.android.apps.search.googleapp.notifications.a.a.a r14 = new com.google.android.apps.search.googleapp.notifications.a.a.a
            com.google.bv.d.j r15 = com.google.p4283bv.p4345d.C57031j.f152256d
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r6)
            r14.<init>(r13, r15, r0)
            return r14
        L_0x01d8:
            com.google.android.apps.search.googleapp.notifications.a.a.a r13 = new com.google.android.apps.search.googleapp.notifications.a.a.a
            r13.<init>(r15, r14, r0)
            return r13
        L_0x01de:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Byte buffer is improperly encoded. The encoded length does not match the buffer's length"
            r13.<init>(r14)
            throw r13
        L_0x01e6:
            com.google.android.apps.search.googleapp.notifications.a.a.a r14 = new com.google.android.apps.search.googleapp.notifications.a.a.a
            com.google.bv.d.j r0 = com.google.p4283bv.p4345d.C57031j.f152256d
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            int r15 = r15.f165947c
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r14.<init>(r13, r0, r15)
            return r14
        L_0x01f7:
            return r1
        L_0x01f8:
            com.google.common.f.e r14 = f372148a
            com.google.common.f.x r14 = r14.mo56226d()
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.common.f.x r13 = r14.mo56382g(r13)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.n r14 = new com.google.common.f.n
            r15 = 40821(0x9f75, float:5.7202E-41)
            r14.<init>(r15)
            r13.mo56379ah(r14)
            r13.mo56386p(r3)
            com.google.android.apps.search.googleapp.notifications.a.a.a r13 = new com.google.android.apps.search.googleapp.notifications.a.a.a
            com.google.android.apps.search.googleapp.notifications.a.a.d r14 = com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136719d.FAILED_UPLOAD_REQUEST
            com.google.bv.d.j r15 = com.google.p4283bv.p4345d.C57031j.f152256d
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r6)
            java.lang.String r0 = "CLIENT_ERROR"
            r13.<init>(r14, r15, r0)
            return r13
        L_0x0223:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.notifications.p10360a.p10361a.C136718c.mo113337a(com.google.bv.d.h, java.lang.String, h.c.g):java.lang.Object");
    }
}
