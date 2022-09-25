package com.google.android.libraries.search.assistant.appactions.p2501a;

import com.google.common.p4526f.C59071e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71571du;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.appactions.a.q */
/* compiled from: PG */
public final class C32458q implements C32433a {

    /* renamed from: a */
    public static final C59071e f86972a = C59071e.m91331h();

    /* renamed from: b */
    public final C69585o f86973b;

    /* renamed from: c */
    public final C71548cy f86974c = C71574dx.m104480b((Object) null);

    /* renamed from: d */
    public final C71548cy f86975d = C71574dx.m104480b((Object) null);

    /* renamed from: e */
    public final C71548cy f86976e = C71574dx.m104480b((Object) null);

    /* renamed from: f */
    public final C71548cy f86977f = C71574dx.m104480b((Object) null);

    /* renamed from: g */
    public final C71548cy f86978g = C71574dx.m104480b((Object) null);

    /* renamed from: h */
    public final C71548cy f86979h = C71574dx.m104480b((Object) null);

    /* renamed from: i */
    public final C71548cy f86980i = C71574dx.m104480b((Object) null);

    /* renamed from: j */
    public final C71548cy f86981j = C71574dx.m104480b((Object) null);

    /* renamed from: k */
    public final C71548cy f86982k = C71574dx.m104480b((Object) null);

    /* renamed from: l */
    public final AtomicReference f86983l = new AtomicReference((Object) null);

    /* renamed from: m */
    public final C32466y f86984m;

    /* renamed from: n */
    public final C71816z f86985n = new C71816z();

    /* renamed from: o */
    public final C71816z f86986o = new C71816z();

    /* renamed from: p */
    private final C71548cy f86987p = C71574dx.m104480b((Object) null);

    /* renamed from: q */
    private final C71548cy f86988q = C71574dx.m104480b((Object) null);

    /* renamed from: r */
    private final C71643cp f86989r;

    public C32458q(String str, C71422aw awVar, C69585o oVar, C32466y yVar) {
        C69664n.m101061g(str, "key");
        C69664n.m101061g(awVar, "scope");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f86973b = oVar;
        this.f86984m = yVar;
        this.f86989r = C71803m.m105043d(awVar, oVar, (C71424ay) null, new C32445d(this, (C69577g) null), 2);
    }

    /* renamed from: a */
    public final /* synthetic */ C71571du mo38059a() {
        return this.f86978g;
    }

    /* renamed from: b */
    public final /* synthetic */ C71571du mo38060b() {
        return this.f86980i;
    }

    /* renamed from: c */
    public final /* synthetic */ C71571du mo38061c() {
        return this.f86979h;
    }

    /* renamed from: d */
    public final /* synthetic */ C71571du mo38062d() {
        return this.f86975d;
    }

    /* renamed from: e */
    public final void mo38063e() {
        this.f86989r.mo62723u((CancellationException) null);
        this.f86986o.mo62909P(C32460s.CANCELED);
    }

    /* renamed from: f */
    public final void mo38064f(C32463v vVar) {
        this.f86974c.mo62807f(vVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38077g(com.google.assistant.p3931f.p3940d.p3941a.C52896c r6, int r7, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.assistant.appactions.p2501a.C32456o
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.assistant.appactions.a.o r0 = (com.google.android.libraries.search.assistant.appactions.p2501a.C32456o) r0
            int r1 = r0.f86970d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f86970d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.appactions.a.o r0 = new com.google.android.libraries.search.assistant.appactions.a.o
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f86968b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f86970d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r6 = r0.f86967a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0065
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.appactions.a.p r8 = com.google.android.libraries.search.assistant.appactions.p2501a.C32457p.f86971a
            com.google.assistant.f.d.a.ba r2 = com.google.assistant.p3931f.p3940d.p3941a.C52878ba.f138720b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.f.d.a.az r2 = (com.google.assistant.p3931f.p3940d.p3941a.C52876az) r2
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.assistant.f.d.a.br r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.assistant.f.d.a.az r4 = r2.f138734a
            r4.copyOnWrite()
            com.google.protobuf.bv r4 = r4.instance
            com.google.assistant.f.d.a.ba r4 = (com.google.assistant.p3931f.p3940d.p3941a.C52878ba) r4
            r4.f138722a = r7
            com.google.assistant.f.d.a.ba r7 = r2.mo53942a()
            com.google.common.util.concurrent.cx r6 = com.google.p4238bo.p4239a.p4240a.p4241a.C56125i.m87910b(r6, r8, r7)
            r0.f86967a = r5
            r0.f86970d = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r8 == r1) goto L_0x00f8
            r6 = r5
        L_0x0065:
            com.google.bo.a.a.a.i r8 = (com.google.p4238bo.p4239a.p4240a.p4241a.C56125i) r8
            io.grpc.Status r7 = r8.f149527a
            boolean r7 = r7.mo61679g()
            if (r7 == 0) goto L_0x00f5
            java.lang.Object r7 = r8.f149528b
            com.google.assistant.f.d.a.bd r7 = (com.google.assistant.p3931f.p3940d.p3941a.C52881bd) r7
            if (r7 != 0) goto L_0x0078
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0078:
            int r0 = r7.f138725a
            int r1 = com.google.assistant.p3931f.p3940d.p3941a.C52880bc.m86724a(r0)
            r2 = 3
            if (r1 != r2) goto L_0x0095
            com.google.android.libraries.search.assistant.appactions.a.q r6 = (com.google.android.libraries.search.assistant.appactions.p2501a.C32458q) r6
            kotlinx.coroutines.b.cy r6 = r6.f86988q
            r8 = 2
            if (r0 != r8) goto L_0x008d
            java.lang.Object r7 = r7.f138726b
            com.google.assistant.f.d.a.ay r7 = (com.google.assistant.p3931f.p3940d.p3941a.C52875ay) r7
            goto L_0x008f
        L_0x008d:
            com.google.assistant.f.d.a.ay r7 = com.google.assistant.p3931f.p3940d.p3941a.C52875ay.f138718a
        L_0x008f:
            r6.mo62807f(r7)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0095:
            java.lang.String r0 = "uiResponse"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)
            io.grpc.cz r0 = com.google.android.libraries.search.assistant.appactions.p2501a.C32467z.f87006a
            com.google.common.b.gu r8 = r8.mo54327a(r0)
            java.lang.String r0 = "response.trailers(Remote…Interceptor.METADATA_KEY)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00ad
            r8 = 0
            goto L_0x00b4
        L_0x00ad:
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            android.widget.RemoteViews r8 = (android.widget.RemoteViews) r8
        L_0x00b4:
            if (r8 != 0) goto L_0x00d1
            com.google.common.f.e r6 = f86972a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r7 = new com.google.common.f.n
            r8 = 50546(0xc572, float:7.083E-41)
            r7.<init>(r8)
            r6.mo56379ah(r7)
            java.lang.String r7 = "Unable to extract RemoteViews in trailer"
            r6.mo56386p(r7)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x00d1:
            com.google.android.libraries.search.assistant.appactions.a.q r6 = (com.google.android.libraries.search.assistant.appactions.p2501a.C32458q) r6
            kotlinx.coroutines.b.cy r0 = r6.f86987p
            r0.mo62807f(r8)
            kotlinx.coroutines.b.cy r6 = r6.f86975d
            com.google.android.libraries.search.assistant.appactions.a.aa r0 = new com.google.android.libraries.search.assistant.appactions.a.aa
            int r1 = r7.f138725a
            if (r1 != r2) goto L_0x00e5
            java.lang.Object r7 = r7.f138726b
            com.google.assistant.f.d.a.aj r7 = (com.google.assistant.p3931f.p3940d.p3941a.C52860aj) r7
            goto L_0x00e7
        L_0x00e5:
            com.google.assistant.f.d.a.aj r7 = com.google.assistant.p3931f.p3940d.p3941a.C52860aj.f138686e
        L_0x00e7:
            java.lang.String r1 = "payload.remoteViewsInfo"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)
            r0.<init>(r8, r7)
            r6.mo62807f(r0)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x00f5:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x00f8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.appactions.p2501a.C32458q.mo38077g(com.google.assistant.f.d.a.c, int, h.c.g):java.lang.Object");
    }
}
