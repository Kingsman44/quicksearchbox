package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.protobuf.MessageLite;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.ClientRequestHandler$executeRequest$2", mo61344c = "ClientRequestHandler.kt", mo61345d = "invokeSuspend", mo61346e = {54, 55})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.y */
/* compiled from: PG */
final class C135126y extends C69572j implements C69630p {

    /* renamed from: a */
    int f368036a;

    /* renamed from: b */
    final /* synthetic */ C134941ab f368037b;

    /* renamed from: c */
    final /* synthetic */ C135109h f368038c;

    /* renamed from: d */
    final /* synthetic */ MessageLite f368039d;

    /* renamed from: e */
    final /* synthetic */ String f368040e;

    /* renamed from: f */
    final /* synthetic */ String f368041f;

    /* renamed from: g */
    final /* synthetic */ C134970bb f368042g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135126y(C134941ab abVar, C135109h hVar, MessageLite messageLite, String str, String str2, C134970bb bbVar, C69577g gVar) {
        super(2, gVar);
        this.f368037b = abVar;
        this.f368038c = hVar;
        this.f368039d = messageLite;
        this.f368040e = str;
        this.f368041f = str2;
        this.f368042g = bbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135126y) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01e6, code lost:
        p5462h.p5472e.C69598b.m101013a(r4, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0198 A[Catch:{ all -> 0x01e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x019a A[Catch:{ all -> 0x01e5 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r11.f368036a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0013
            if (r1 == r3) goto L_0x000f
            p5462h.C69714l.m101134b(r12)
            goto L_0x0138
        L_0x000f:
            p5462h.C69714l.m101134b(r12)
            goto L_0x0055
        L_0x0013:
            p5462h.C69714l.m101134b(r12)
            com.google.common.f.e r12 = com.google.android.apps.search.googleapp.discover.p10238u.C134941ab.f367394a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r1 = new com.google.common.f.n
            r4 = 40387(0x9dc3, float:5.6594E-41)
            r1.<init>(r4)
            r12.mo56379ah(r1)
            java.lang.String r1 = "executeRequest (new one)"
            r12.mo56386p(r1)
            com.google.android.apps.search.googleapp.discover.u.ab r12 = r11.f368037b
            com.google.android.apps.search.googleapp.discover.u.fu r12 = r12.f367399f
            com.google.android.apps.search.googleapp.discover.u.h r1 = r11.f368038c
            kotlinx.coroutines.aw r4 = r12.f367960a
            com.google.android.apps.search.googleapp.discover.u.fk r5 = new com.google.android.apps.search.googleapp.discover.u.fk
            r5.<init>(r12, r1, r2)
            r12 = 3
            kotlinx.coroutines.be r12 = kotlinx.coroutines.C71803m.m105042c(r4, r2, r2, r5, r12)
            com.google.common.util.concurrent.cx r12 = kotlinx.coroutines.p5578d.C71663i.m104688a(r12)
            com.google.apps.tiktok.tracing.contrib.b.f r12 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r12)
            java.lang.String r1 = "fun getRequestProperties…tenableFuture()\n    )\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r1)
            r11.f368036a = r3
            java.lang.Object r12 = kotlinx.coroutines.p5578d.C71663i.m104690c(r12, r11)
            if (r12 == r0) goto L_0x01ea
        L_0x0055:
            java.lang.String r1 = "requestPropertiesProvide…erties(authState).await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r1)
            com.google.android.apps.search.googleapp.discover.u.ao r12 = (com.google.android.apps.search.googleapp.discover.p10238u.C134954ao) r12
            com.google.android.apps.search.googleapp.discover.u.ab r1 = r11.f368037b
            com.google.protobuf.MessageLite r4 = r11.f368039d
            java.lang.String r5 = r11.f368040e
            java.lang.String r6 = r11.f368041f
            com.google.android.apps.search.googleapp.discover.u.bb r7 = r11.f368042g
            r8 = 2
            r11.f368036a = r8
            java.lang.String r8 = "request"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r8)
            java.lang.String r8 = "requestProperties"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r8)
            com.google.frameworks.client.data.android.ae r8 = new com.google.frameworks.client.data.android.ae
            r8.<init>()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r5 = r5.concat(r6)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            android.net.Uri$Builder r5 = r5.buildUpon()
            java.lang.String r6 = "fmt"
            java.lang.String r9 = "bin"
            android.net.Uri$Builder r5 = r5.appendQueryParameter(r6, r9)
            j$.util.Optional r6 = r12.f367433b
            java.lang.String r9 = r12.f367432a
            java.lang.Object r6 = r6.orElse(r9)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r9 = "locale"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r9)
            int r9 = r6.length()
            if (r9 <= 0) goto L_0x00aa
            java.lang.String r9 = "hl"
            r5.appendQueryParameter(r9, r6)
        L_0x00aa:
            j$.util.Optional r6 = r12.f367438g
            com.google.android.apps.search.googleapp.discover.u.fi r9 = new com.google.android.apps.search.googleapp.discover.u.fi
            r9.<init>(r5)
            r6.ifPresent(r9)
            android.net.Uri r5 = r5.build()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "uriBuilder.build().toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r5.getClass()
            r8.f165930a = r5
            java.lang.String r5 = "GET"
            r8.mo57933b(r5)
            java.lang.String r5 = "User-Agent"
            com.google.frameworks.client.data.android.ad r5 = com.google.frameworks.client.data.android.C61362ad.m93870b(r5)
            java.lang.String r6 = r12.f367435d
            r8.mo57932a(r5, r6)
            java.lang.String r5 = "X-Client-Data"
            com.google.frameworks.client.data.android.ad r5 = com.google.frameworks.client.data.android.C61362ad.m93870b(r5)
            java.lang.String r6 = r12.f367436e
            r8.mo57932a(r5, r6)
            java.lang.String r5 = "X-Protobuffer-Request-Payload"
            com.google.frameworks.client.data.android.ad r5 = com.google.frameworks.client.data.android.C61362ad.m93870b(r5)
            com.google.common.l.i r6 = com.google.common.p4541l.C59326i.f157517e
            com.google.common.l.i r6 = r6.mo56826f()
            byte[] r4 = r4.toByteArray()
            int r9 = r4.length
            java.lang.String r4 = r6.mo56837l(r4, r9)
            r8.mo57932a(r5, r4)
            java.lang.String r4 = "search.now.ClientInfo-bin"
            com.google.frameworks.client.data.android.ad r4 = com.google.frameworks.client.data.android.C61362ad.m93870b(r4)
            com.google.common.l.i r5 = com.google.common.p4541l.C59326i.f157516d
            com.google.common.l.i r5 = r5.mo56826f()
            com.google.bv.e.b.c.a.u r6 = r12.f367439h
            byte[] r6 = r6.toByteArray()
            int r9 = r6.length
            java.lang.String r5 = r5.mo56837l(r6, r9)
            r8.mo57932a(r4, r5)
            j$.util.Optional r4 = r12.f367437f
            com.google.android.apps.search.googleapp.discover.u.fg r5 = new com.google.android.apps.search.googleapp.discover.u.fg
            r5.<init>(r8)
            r4.ifPresent(r5)
            j$.util.Optional r12 = r12.f367434c
            com.google.android.apps.search.googleapp.discover.u.fh r4 = new com.google.android.apps.search.googleapp.discover.u.fh
            r4.<init>(r8)
            r12.ifPresent(r4)
            com.google.frameworks.client.data.android.ag r12 = new com.google.frameworks.client.data.android.ag
            r12.<init>(r8)
            com.google.android.apps.search.googleapp.discover.d.e r4 = r7.f367497a
            r4.mo111649c()
            java.lang.Object r12 = r1.mo112083b(r12, r7, r11)
            if (r12 != r0) goto L_0x0138
            return r0
        L_0x0138:
            com.google.frameworks.client.data.android.ah r12 = (com.google.frameworks.client.data.android.C61366ah) r12
            com.google.android.apps.search.googleapp.discover.u.ab r0 = r11.f368037b
            com.google.android.apps.search.googleapp.discover.u.bb r1 = r11.f368042g
            java.lang.String r4 = "response"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r4)
            com.google.android.apps.search.googleapp.discover.d.e r4 = r1.f367497a
            r4.mo111648b()
            com.google.android.apps.search.googleapp.discover.u.bl r4 = r1.f367500d
            com.google.android.apps.search.googleapp.discover.u.bo r4 = r4.f367551c
            java.lang.String r5 = r1.f367498b
            com.google.bv.e.b.c.a.bn r6 = r1.f367499c
            int r7 = r12.f165947c
            com.google.net.a.a.b r7 = com.google.frameworks.client.data.android.C61367ai.m93875a(r7)
            int r8 = r12.f165947c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.mo112104b(r5, r6, r7, r8)
            com.google.android.libraries.search.a.e.c r4 = r0.f367398e
            com.google.common.b.km r5 = r12.f165945a
            com.google.frameworks.client.data.android.ad r6 = com.google.android.apps.search.googleapp.discover.p10238u.C134941ab.f367395b
            java.util.List r5 = r5.mo55277g(r6)
            java.lang.String r6 = "httpResponse.headers[SET_COOKIE_HEADER_KEY]"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.common.b.gu r5 = com.google.common.p4522b.C58479go.m89810b(r5)
            r4.mo38008h(r5)
            java.lang.String r4 = "Parsing response"
            com.google.apps.tiktok.tracing.bi r4 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r4)
            java.nio.ByteBuffer r5 = r12.f165946b     // Catch:{ all -> 0x01e3 }
            com.google.protobuf.MessageLite r6 = r0.f367400g     // Catch:{ all -> 0x01e3 }
            com.google.protobuf.ba r0 = r0.f367397d     // Catch:{ all -> 0x01e3 }
            com.google.protobuf.ae r7 = com.google.protobuf.C62897ae.m95111N(r5)     // Catch:{ all -> 0x01e3 }
            int r8 = r7.mo58679n()     // Catch:{ all -> 0x01e3 }
            int r7 = r7.mo58669d()     // Catch:{ all -> 0x01e3 }
            r9 = 0
            r5.position(r9)     // Catch:{ all -> 0x01e3 }
            int r10 = r5.remaining()     // Catch:{ all -> 0x01e3 }
            int r8 = r8 + r7
            if (r10 != r8) goto L_0x019a
            r8 = 1
            goto L_0x019b
        L_0x019a:
            r8 = 0
        L_0x019b:
            java.lang.String r10 = "The byte buffer is improperly encoded. The encoded length does not match the buffer's length"
            com.google.common.base.C58838bb.m90884s(r8, r10)     // Catch:{ all -> 0x01e3 }
            r5.position(r7)     // Catch:{ all -> 0x01e3 }
            com.google.protobuf.eb r6 = r6.getParserForType()     // Catch:{ all -> 0x01e3 }
            java.lang.Object r0 = r6.mo59014m(r5, r0)     // Catch:{ all -> 0x01e3 }
            com.google.protobuf.MessageLite r0 = (com.google.protobuf.MessageLite) r0     // Catch:{ all -> 0x01e3 }
            r5.position(r9)     // Catch:{ all -> 0x01e3 }
            java.lang.String r5 = "parseDelimitedFrom(\n    …nsionRegistryLite\n      )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r5)     // Catch:{ all -> 0x01e3 }
            p5462h.p5472e.C69598b.m101013a(r4, r2)
            com.google.android.apps.search.googleapp.discover.d.e r1 = r1.f367497a
            r1.mo111647a()
            com.google.android.apps.search.googleapp.discover.u.fv r1 = new com.google.android.apps.search.googleapp.discover.u.fv
            com.google.common.b.km r12 = r12.f165945a
            java.util.Map r12 = r12.mo54950C()
            java.lang.String r2 = "Refresh-Google-Creds"
            com.google.frameworks.client.data.android.ad r2 = com.google.frameworks.client.data.android.C61362ad.m93870b(r2)
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
            java.lang.Object r12 = p3186j$.util.Map.EL.getOrDefault(r12, r2, r4)
            java.lang.String r2 = "httpResponse.headers\n   …utableList.of()\n        )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r2)
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r3
            r1.<init>(r0, r12)
            return r1
        L_0x01e3:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x01e5 }
        L_0x01e5:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r4, r12)
            throw r0
        L_0x01ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C135126y.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135126y(this.f368037b, this.f368038c, this.f368039d, this.f368040e, this.f368041f, this.f368042g, gVar);
    }
}
