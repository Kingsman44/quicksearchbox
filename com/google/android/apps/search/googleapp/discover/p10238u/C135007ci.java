package com.google.android.apps.search.googleapp.discover.p10238u;

import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.GrpcFeedRequestClient$triggerNextPageRequest$2", mo61344c = "GrpcFeedRequestClient.kt", mo61345d = "invokeSuspend", mo61346e = {92, 100})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.ci */
/* compiled from: PG */
final class C135007ci extends C69572j implements C69630p {

    /* renamed from: a */
    Object f367620a;

    /* renamed from: b */
    Object f367621b;

    /* renamed from: c */
    Object f367622c;

    /* renamed from: d */
    Object f367623d;

    /* renamed from: e */
    int f367624e;

    /* renamed from: f */
    final /* synthetic */ C135008cj f367625f;

    /* renamed from: g */
    final /* synthetic */ UUID f367626g;

    /* renamed from: h */
    final /* synthetic */ C134991bw f367627h;

    /* renamed from: i */
    final /* synthetic */ C135012cn f367628i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135007ci(C135008cj cjVar, UUID uuid, C134991bw bwVar, C135012cn cnVar, C69577g gVar) {
        super(2, gVar);
        this.f367625f = cjVar;
        this.f367626g = uuid;
        this.f367627h = bwVar;
        this.f367628i = cnVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135007ci) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: com.google.bv.e.b.c.a.bn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.google.bv.e.b.c.a.bn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: com.google.bv.e.b.c.a.bn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.io.Closeable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r16) {
        /*
            r15 = this;
            r9 = r15
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f367624e
            r10 = 0
            r2 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 == r2) goto L_0x0020
            java.lang.Object r0 = r9.f367621b
            r1 = r0
            com.google.android.apps.search.googleapp.discover.d.o r1 = (com.google.android.apps.search.googleapp.discover.p10181d.C134226o) r1
            java.lang.Object r0 = r9.f367620a
            r2 = r0
            java.io.Closeable r2 = (java.io.Closeable) r2
            p5462h.C69714l.m101134b(r16)     // Catch:{ all -> 0x001d }
            r14 = r1
            r1 = r16
            goto L_0x008d
        L_0x001d:
            r0 = move-exception
            goto L_0x00a4
        L_0x0020:
            java.lang.Object r1 = r9.f367623d
            java.lang.Object r2 = r9.f367622c
            java.lang.Object r3 = r9.f367621b
            java.io.Closeable r3 = (java.io.Closeable) r3
            java.lang.Object r4 = r9.f367620a
            com.google.android.apps.search.googleapp.discover.u.cn r4 = (com.google.android.apps.search.googleapp.discover.p10238u.C135012cn) r4
            p5462h.C69714l.m101134b(r16)     // Catch:{ all -> 0x0035 }
            r14 = r1
            r13 = r2
            r2 = r3
            r1 = r16
            goto L_0x0073
        L_0x0035:
            r0 = move-exception
            r2 = r3
            goto L_0x00a4
        L_0x0039:
            p5462h.C69714l.m101134b(r16)
            com.google.android.apps.search.googleapp.discover.u.cj r1 = r9.f367625f
            java.util.UUID r3 = r9.f367626g
            com.google.android.apps.search.googleapp.discover.u.bw r4 = r9.f367627h
            com.google.android.apps.search.googleapp.discover.u.cn r11 = r9.f367628i
            java.lang.String r5 = "DiscoverFeedRenderer#triggerNextPageRequest"
            com.google.apps.tiktok.tracing.bi r12 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r5)
            com.google.bv.e.b.c.a.bn r13 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn.NEXT_PAGE_SCROLL     // Catch:{ all -> 0x00ae }
            com.google.android.apps.search.googleapp.discover.d.p r5 = r1.f367633e     // Catch:{ all -> 0x00ae }
            com.google.android.apps.search.googleapp.discover.d.o r14 = r5.mo111657a(r3, r2, r13)     // Catch:{ all -> 0x00ae }
            com.google.android.apps.search.googleapp.discover.u.dw r1 = r1.f367629a     // Catch:{ all -> 0x00a1 }
            com.google.bv.e.b.c.a.w r3 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w.f153198a     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)     // Catch:{ all -> 0x00a1 }
            r9.f367620a = r11     // Catch:{ all -> 0x00a1 }
            r9.f367621b = r12     // Catch:{ all -> 0x00a1 }
            r9.f367622c = r13     // Catch:{ all -> 0x00a1 }
            r9.f367623d = r14     // Catch:{ all -> 0x00a1 }
            r9.f367624e = r2     // Catch:{ all -> 0x00a1 }
            r5 = 0
            java.lang.String r6 = ""
            r7 = 0
            r2 = r13
            r8 = r15
            java.lang.Object r1 = r1.mo112111d(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a1 }
            if (r1 == r0) goto L_0x00a0
            r4 = r11
            r2 = r12
        L_0x0073:
            com.google.bv.e.b.c.a.dd r1 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd) r1     // Catch:{ all -> 0x009b }
            h.f.a.r r3 = r4.f367646a     // Catch:{ all -> 0x009b }
            java.lang.String r4 = "grpcFeedRequestLogger"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r4)     // Catch:{ all -> 0x009b }
            r9.f367620a = r2     // Catch:{ all -> 0x009b }
            r9.f367621b = r14     // Catch:{ all -> 0x009b }
            r9.f367622c = r10     // Catch:{ all -> 0x009b }
            r9.f367623d = r10     // Catch:{ all -> 0x009b }
            r4 = 2
            r9.f367624e = r4     // Catch:{ all -> 0x009b }
            java.lang.Object r1 = r3.mo8479a(r1, r14, r13, r15)     // Catch:{ all -> 0x009b }
            if (r1 == r0) goto L_0x009d
        L_0x008d:
            com.google.bv.e.b.c.a.dj r1 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57309dj) r1     // Catch:{ all -> 0x009b }
            r0 = r14
            com.google.android.apps.search.googleapp.discover.d.o r0 = (com.google.android.apps.search.googleapp.discover.p10181d.C134226o) r0     // Catch:{ all -> 0x009b }
            com.google.android.apps.search.googleapp.discover.d.e r0 = r0.f365686a     // Catch:{ all -> 0x009b }
            r0.mo111647a()     // Catch:{ all -> 0x009b }
            p5462h.p5472e.C69598b.m101013a(r2, r10)
            return r1
        L_0x009b:
            r0 = move-exception
            goto L_0x009e
        L_0x009d:
            return r0
        L_0x009e:
            r1 = r14
            goto L_0x00a4
        L_0x00a0:
            return r0
        L_0x00a1:
            r0 = move-exception
            r2 = r12
            goto L_0x009e
        L_0x00a4:
            com.google.android.apps.search.googleapp.discover.d.o r1 = (com.google.android.apps.search.googleapp.discover.p10181d.C134226o) r1     // Catch:{ all -> 0x00aa }
            r1.mo111656a(r0)     // Catch:{ all -> 0x00aa }
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            r1 = r0
            r12 = r2
            goto L_0x00b0
        L_0x00ae:
            r0 = move-exception
            r1 = r0
        L_0x00b0:
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            r2 = r0
            p5462h.p5472e.C69598b.m101013a(r12, r1)
            goto L_0x00b8
        L_0x00b7:
            throw r2
        L_0x00b8:
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C135007ci.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135007ci(this.f367625f, this.f367626g, this.f367627h, this.f367628i, gVar);
    }
}
