package com.google.android.apps.search.googleapp.search.p10406c;

import android.content.Context;
import com.google.android.apps.search.googleapp.search.p10415i.C137493b;
import com.google.android.apps.search.googleapp.search.p10415i.C137521w;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.googleapp.search.c.c */
/* compiled from: PG */
public final class C137402c implements C70862aj {

    /* renamed from: c */
    private static final C58974d f373729c = C58974d.m91135i("AshRequestObserver");

    /* renamed from: a */
    public final C137521w f373730a = new C137521w();

    /* renamed from: b */
    public volatile String f373731b;

    /* renamed from: d */
    private final C70862aj f373732d;

    /* renamed from: e */
    private final Context f373733e;

    /* renamed from: f */
    private final C137493b f373734f;

    /* renamed from: g */
    private final boolean f373735g;

    /* renamed from: h */
    private final C37215b f373736h;

    /* renamed from: i */
    private boolean f373737i;

    /* renamed from: j */
    private volatile boolean f373738j;

    public C137402c(C70862aj ajVar, Context context, C137493b bVar, boolean z, C37215b bVar2) {
        this.f373732d = ajVar;
        this.f373733e = context;
        this.f373734f = bVar;
        this.f373735g = z;
        this.f373736h = bVar2;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f373730a.mo113793b();
        this.f373738j = true;
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        ((C58970a) ((C58970a) f373729c.mo56226d()).mo56382g(th)).mo56386p("onError()");
        C137521w wVar = this.f373730a;
        wVar.f374041c = th;
        wVar.mo113793b();
        this.f373738j = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r0.length() != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (r0.f52452a != null) goto L_0x0071;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo20123c(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.libraries.assistant.o.aq r10 = (com.google.android.libraries.assistant.p1533o.C18454aq) r10
            java.lang.String r0 = "handoverRequest"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)
            boolean r0 = r9.f373735g
            if (r0 != 0) goto L_0x0018
            io.grpc.i.aj r10 = r9.f373732d
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "ASH is not enabled on the GoogleApp side"
            r0.<init>(r1)
            r10.mo20122b(r0)
            return
        L_0x0018:
            boolean r0 = r9.f373737i
            r1 = 2
            if (r0 != 0) goto L_0x0049
            int r0 = r10.f52371a
            int r2 = com.google.android.libraries.assistant.p1533o.C18453ap.m35928a(r0)
            if (r2 != r1) goto L_0x003c
            if (r0 != r1) goto L_0x002c
            java.lang.Object r0 = r10.f52372b
            com.google.android.libraries.assistant.o.r r0 = (com.google.android.libraries.assistant.p1533o.C18500r) r0
            goto L_0x002e
        L_0x002c:
            com.google.android.libraries.assistant.o.r r0 = com.google.android.libraries.assistant.p1533o.C18500r.f52444e
        L_0x002e:
            java.lang.String r0 = r0.f52446a
            java.lang.String r2 = "handoverRequest.googleAppIntentParams.query"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            int r0 = r0.length()
            if (r0 == 0) goto L_0x003c
            goto L_0x0049
        L_0x003c:
            io.grpc.i.aj r10 = r9.f373732d
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Expected intent params in the first handover request."
            r0.<init>(r1)
            r10.mo20122b(r0)
            return
        L_0x0049:
            boolean r0 = r9.f373737i
            r2 = 1
            if (r0 == 0) goto L_0x0071
            int r0 = r10.f52371a
            int r3 = com.google.android.libraries.assistant.p1533o.C18453ap.m35928a(r0)
            if (r3 != r2) goto L_0x0064
            if (r0 != r2) goto L_0x005d
            java.lang.Object r0 = r10.f52372b
            com.google.android.libraries.assistant.o.u r0 = (com.google.android.libraries.assistant.p1533o.C18503u) r0
            goto L_0x005f
        L_0x005d:
            com.google.android.libraries.assistant.o.u r0 = com.google.android.libraries.assistant.p1533o.C18503u.f52450f
        L_0x005f:
            com.google.android.libraries.assistant.o.an r0 = r0.f52452a
            if (r0 == 0) goto L_0x0064
            goto L_0x0071
        L_0x0064:
            io.grpc.i.aj r10 = r9.f373732d
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Expected update to have SRP data."
            r0.<init>(r1)
            r10.mo20122b(r0)
            return
        L_0x0071:
            int r0 = r10.f52371a
            int r3 = com.google.android.libraries.assistant.p1533o.C18453ap.m35928a(r0)
            int r4 = r3 + -1
            r5 = 0
            if (r3 == 0) goto L_0x016f
            if (r4 == 0) goto L_0x0145
            if (r4 == r2) goto L_0x009c
            if (r4 == r1) goto L_0x008f
            io.grpc.i.aj r10 = r9.f373732d
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Unknown Assistant Search Handover message."
            r0.<init>(r1)
            r10.mo20122b(r0)
            return
        L_0x008f:
            io.grpc.i.aj r10 = r9.f373732d
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Received empty update."
            r0.<init>(r1)
            r10.mo20122b(r0)
            return
        L_0x009c:
            if (r0 != r1) goto L_0x00a3
            java.lang.Object r10 = r10.f52372b
            com.google.android.libraries.assistant.o.r r10 = (com.google.android.libraries.assistant.p1533o.C18500r) r10
            goto L_0x00a5
        L_0x00a3:
            com.google.android.libraries.assistant.o.r r10 = com.google.android.libraries.assistant.p1533o.C18500r.f52444e
        L_0x00a5:
            java.lang.String r0 = "handoverRequest.googleAppIntentParams"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            com.google.android.libraries.search.b.b r0 = r9.f373736h
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98091gE
            java.lang.String r3 = "requestId"
            java.lang.String r4 = r10.f52448c
            com.google.android.libraries.search.b.i.a r1 = r1.mo40816j(r3, r4)
            java.lang.String r3 = r10.f52448c
            r4 = r1
            com.google.android.libraries.search.b.i.b r4 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r4
            r4.mo40794r(r3)
            r0.mo19974a(r1)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.MAIN"
            r0.<init>(r1)
            com.google.android.apps.search.googleapp.h.i r1 = com.google.android.apps.search.googleapp.p10310h.C136129j.m221208l()
            boolean r3 = r10.f52449d
            r3 = r3 ^ r2
            r1.mo112767b(r3)
            com.google.android.apps.search.googleapp.u.t r3 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH
            r1.mo112776k(r3)
            com.google.android.apps.search.googleapp.search.e.g r3 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.googleapp.search.e.e r3 = (com.google.android.apps.search.googleapp.search.p10409e.C137416e) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.search.googleapp.search.e.g r4 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r4
            r6 = 6
            r4.f373779k = r6
            int r6 = r4.f373769a
            r6 = r6 | 512(0x200, float:7.175E-43)
            r4.f373769a = r6
            java.lang.String r4 = r10.f52446a
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.search.googleapp.search.e.g r6 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r6
            r4.getClass()
            int r7 = r6.f373769a
            r7 = r7 | r2
            r6.f373769a = r7
            r6.f373770b = r4
            long r6 = r10.f52447b
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.search.googleapp.search.e.g r4 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r4
            int r8 = r4.f373769a
            r8 = r8 | 4
            r4.f373769a = r8
            r4.f373772d = r6
            java.lang.String r4 = r10.f52448c
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.search.googleapp.search.e.g r6 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r6
            r4.getClass()
            int r7 = r6.f373769a
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
            r6.f373769a = r7
            r6.f373783o = r4
            com.google.protobuf.bv r3 = r3.build()
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            r1.mo112775j(r3)
            com.google.android.apps.search.googleapp.h.j r1 = r1.mo112766a()
            com.google.android.apps.search.googleapp.p10310h.C136127h.m221196a(r0, r1)
            java.lang.String r10 = r10.f52448c
            r9.f373731b = r10
            android.content.Context r10 = r9.f373733e
            com.google.apps.tiktok.tracing.C47810es.m84980t(r10, r0, r5)
            r9.f373737i = r2
            return
        L_0x0145:
            com.google.android.apps.search.googleapp.search.i.b r0 = r9.f373734f
            j$.time.Instant r0 = r0.f373960c
            j$.time.Instant r1 = p3186j$.time.Instant.EPOCH
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r1)
            if (r0 == 0) goto L_0x0156
            com.google.android.apps.search.googleapp.search.i.b r0 = r9.f373734f
            r0.mo113785a()
        L_0x0156:
            com.google.android.apps.search.googleapp.search.i.w r0 = r9.f373730a
            int r1 = r10.f52371a
            if (r1 != r2) goto L_0x0161
            java.lang.Object r10 = r10.f52372b
            com.google.android.libraries.assistant.o.u r10 = (com.google.android.libraries.assistant.p1533o.C18503u) r10
            goto L_0x0163
        L_0x0161:
            com.google.android.libraries.assistant.o.u r10 = com.google.android.libraries.assistant.p1533o.C18503u.f52450f
        L_0x0163:
            com.google.android.libraries.assistant.o.an r10 = r10.f52452a
            if (r10 != 0) goto L_0x0169
            com.google.android.libraries.assistant.o.an r10 = com.google.android.libraries.assistant.p1533o.C18451an.f52363e
        L_0x0169:
            com.google.protobuf.cq r10 = r10.f52366b
            r0.mo113791a(r10)
            return
        L_0x016f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.p10406c.C137402c.mo20123c(java.lang.Object):void");
    }
}
