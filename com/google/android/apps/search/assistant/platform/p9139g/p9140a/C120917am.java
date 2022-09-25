package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import com.google.android.libraries.search.assistant.appactions.p2501a.C32466y;
import com.google.assistant.p3897e.p3902c.p3907c.C51054er;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51063f;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51231aa;
import com.google.assistant.p3897e.p3917i.p3918a.C51635y;
import com.google.assistant.p3897e.p3917i.p3918a.C51636z;
import com.google.assistant.p3897e.p3921j.ady;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.assistant.p3931f.p3940d.p3941a.C52858ah;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.am */
/* compiled from: PG */
public final class C120917am implements C120947c {

    /* renamed from: a */
    public static final C59071e f336180a = C59071e.m91331h();

    /* renamed from: b */
    public final C69585o f336181b;

    /* renamed from: c */
    public final ady f336182c;

    /* renamed from: d */
    public final C120904a f336183d;

    /* renamed from: e */
    public final C52858ah f336184e;

    /* renamed from: f */
    public final C71548cy f336185f = C71574dx.m104480b((Object) null);

    /* renamed from: g */
    public final C71548cy f336186g = C71574dx.m104480b((Object) null);

    /* renamed from: h */
    public final C71548cy f336187h = C71574dx.m104480b((Object) null);

    /* renamed from: i */
    public final C71548cy f336188i = C71574dx.m104480b((Object) null);

    /* renamed from: j */
    public final C71548cy f336189j = C71574dx.m104480b((Object) null);

    /* renamed from: k */
    public final AtomicReference f336190k = new AtomicReference((Object) null);

    /* renamed from: l */
    public final C71548cy f336191l = C71574dx.m104480b((Object) null);

    /* renamed from: m */
    public final C71548cy f336192m = C71574dx.m104480b((Object) null);

    /* renamed from: n */
    public final C71548cy f336193n = C71574dx.m104480b((Object) null);

    /* renamed from: o */
    public final C71548cy f336194o = C71574dx.m104480b((Object) null);

    /* renamed from: p */
    public final C32466y f336195p;

    /* renamed from: q */
    public final C71816z f336196q = new C71816z();

    /* renamed from: r */
    private final C71643cp f336197r;

    public C120917am(C71422aw awVar, C69585o oVar, C32466y yVar, ady ady, C120904a aVar, C52858ah ahVar) {
        C69664n.m101061g(awVar, "activityScope");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(ady, "bindArgs");
        C69664n.m101061g(ahVar, "hostProps");
        this.f336181b = oVar;
        this.f336195p = yVar;
        this.f336182c = ady;
        this.f336183d = aVar;
        this.f336184e = ahVar;
        this.f336197r = C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C120953i(this, (C69577g) null), 3);
    }

    /* renamed from: a */
    public final C51231aa mo104960a() {
        C52829f fVar = (C52829f) this.f336189j.mo62784e();
        if (fVar == null) {
            return null;
        }
        C51636z zVar = (C51636z) C51231aa.f133382f.createBuilder();
        C69664n.m101060f(zVar, "newBuilder()");
        C51635y a = C69664n.m101061g(zVar, "builder");
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C69664n.m101060f(ggVar, "newBuilder()");
        C51054er a2 = C69664n.m101061g(ggVar, "builder");
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        C69664n.m101060f(esVar, "newBuilder()");
        C51063f a3 = C69664n.m101061g(esVar, "builder");
        String str = this.f336182c.f134916c;
        C69664n.m101060f(str, "bindArgs.appPackage");
        a3.mo53516c(str);
        long j = this.f336182c.f134917d;
        C51055es esVar2 = a3.f132964a;
        esVar2.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar2.instance;
        evVar.f132943a |= 4;
        evVar.f132946d = j;
        a2.mo53512b(a3.mo53514a());
        a.mo53668b(a2.mo53511a());
        C51636z zVar2 = a.f134562a;
        zVar2.copyOnWrite();
        C51231aa aaVar = (C51231aa) zVar2.instance;
        aaVar.f133388e = fVar;
        aaVar.f133384a |= 16;
        return a.mo53667a();
    }

    /* renamed from: b */
    public final void mo104961b() {
        this.f336197r.mo62723u((CancellationException) null);
    }

    /* renamed from: c */
    public final void mo104962c(C120933bb bbVar) {
        C69664n.m101061g(bbVar, "hostEvent");
        this.f336185f.mo62807f(bbVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.assistant.f.d.a.aj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104963d(com.google.assistant.p3931f.p3940d.p3941a.C52896c r6, int r7, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120915ak
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.g.a.ak r0 = (com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120915ak) r0
            int r1 = r0.f336178d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f336178d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.g.a.ak r0 = new com.google.android.apps.search.assistant.platform.g.a.ak
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f336176b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f336178d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r6 = r0.f336175a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0065
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.assistant.platform.g.a.al r8 = com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120916al.f336179a
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
            r0.f336175a = r5
            r0.f336178d = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r8 == r1) goto L_0x00df
            r6 = r5
        L_0x0065:
            com.google.bo.a.a.a.i r8 = (com.google.p4238bo.p4239a.p4240a.p4241a.C56125i) r8
            io.grpc.Status r7 = r8.f149527a
            boolean r7 = r7.mo61679g()
            if (r7 == 0) goto L_0x00dc
            java.lang.Object r7 = r8.f149528b
            com.google.assistant.f.d.a.bd r7 = (com.google.assistant.p3931f.p3940d.p3941a.C52881bd) r7
            r0 = 3
            if (r7 == 0) goto L_0x0090
            int r1 = r7.f138725a
            int r2 = com.google.assistant.p3931f.p3940d.p3941a.C52880bc.m86724a(r1)
            if (r2 != r0) goto L_0x0090
            com.google.android.apps.search.assistant.platform.g.a.am r6 = (com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120917am) r6
            kotlinx.coroutines.b.cy r6 = r6.f336194o
            r8 = 2
            if (r1 != r8) goto L_0x008a
            java.lang.Object r7 = r7.f138726b
            com.google.assistant.f.d.a.ay r7 = (com.google.assistant.p3931f.p3940d.p3941a.C52875ay) r7
            goto L_0x008c
        L_0x008a:
            com.google.assistant.f.d.a.ay r7 = com.google.assistant.p3931f.p3940d.p3941a.C52875ay.f138718a
        L_0x008c:
            r6.mo62807f(r7)
            goto L_0x00d9
        L_0x0090:
            java.lang.String r7 = "uiResponse"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r7)
            io.grpc.cz r7 = com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120935bd.f336248a
            com.google.common.b.gu r7 = r8.mo54327a(r7)
            java.lang.String r1 = "response.trailers(Remote…Interceptor.METADATA_KEY)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)
            boolean r1 = r7.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x00a9
            r7 = r2
            goto L_0x00b0
        L_0x00a9:
            r1 = 0
            java.lang.Object r7 = r7.get(r1)
            android.widget.RemoteViews r7 = (android.widget.RemoteViews) r7
        L_0x00b0:
            java.lang.Object r8 = r8.f149528b
            com.google.assistant.f.d.a.bd r8 = (com.google.assistant.p3931f.p3940d.p3941a.C52881bd) r8
            if (r8 == 0) goto L_0x00c2
            int r1 = r8.f138725a
            if (r1 != r0) goto L_0x00c0
            java.lang.Object r8 = r8.f138726b
            r2 = r8
            com.google.assistant.f.d.a.aj r2 = (com.google.assistant.p3931f.p3940d.p3941a.C52860aj) r2
            goto L_0x00c2
        L_0x00c0:
            com.google.assistant.f.d.a.aj r2 = com.google.assistant.p3931f.p3940d.p3941a.C52860aj.f138686e
        L_0x00c2:
            if (r7 == 0) goto L_0x00d9
            com.google.android.apps.search.assistant.platform.g.a.am r6 = (com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120917am) r6
            kotlinx.coroutines.b.cy r6 = r6.f336186g
            com.google.android.apps.search.assistant.platform.g.a.be r8 = new com.google.android.apps.search.assistant.platform.g.a.be
            if (r2 != 0) goto L_0x00d3
            com.google.assistant.f.d.a.aj r2 = com.google.assistant.p3931f.p3940d.p3941a.C52860aj.f138686e
            java.lang.String r0 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r0)
        L_0x00d3:
            r8.<init>(r7, r2)
            r6.mo62807f(r8)
        L_0x00d9:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x00dc:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x00df:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120917am.mo104963d(com.google.assistant.f.d.a.c, int, h.c.g):java.lang.Object");
    }
}
