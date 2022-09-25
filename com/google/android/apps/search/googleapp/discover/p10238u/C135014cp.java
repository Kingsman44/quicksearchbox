package com.google.android.apps.search.googleapp.discover.p10238u;

import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.GwsFeedRequestClient$triggerNextPageRequest$2", mo61344c = "GwsFeedRequestClient.kt", mo61345d = "invokeSuspend", mo61346e = {57, 64})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.cp */
/* compiled from: PG */
final class C135014cp extends C69572j implements C69630p {

    /* renamed from: a */
    Object f367661a;

    /* renamed from: b */
    Object f367662b;

    /* renamed from: c */
    Object f367663c;

    /* renamed from: d */
    Object f367664d;

    /* renamed from: e */
    int f367665e;

    /* renamed from: f */
    final /* synthetic */ C135015cq f367666f;

    /* renamed from: g */
    final /* synthetic */ C134991bw f367667g;

    /* renamed from: h */
    final /* synthetic */ C135016cr f367668h;

    /* renamed from: i */
    final /* synthetic */ UUID f367669i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135014cp(C135015cq cqVar, C134991bw bwVar, C135016cr crVar, UUID uuid, C69577g gVar) {
        super(2, gVar);
        this.f367666f = cqVar;
        this.f367667g = bwVar;
        this.f367668h = crVar;
        this.f367669i = uuid;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135014cp) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.bv.e.b.c.a.bn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.io.Closeable} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r1 != r0) goto L_0x007f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r17) {
        /*
            r16 = this;
            r10 = r16
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f367665e
            r2 = 1
            r11 = 0
            if (r1 == 0) goto L_0x0033
            if (r1 == r2) goto L_0x001d
            java.lang.Object r0 = r10.f367661a
            r1 = r0
            java.io.Closeable r1 = (java.io.Closeable) r1
            p5462h.C69714l.m101134b(r17)     // Catch:{ all -> 0x0019 }
            r14 = r1
            r1 = r17
            goto L_0x007f
        L_0x0019:
            r0 = move-exception
            r14 = r1
            goto L_0x0088
        L_0x001d:
            java.lang.Object r1 = r10.f367664d
            java.lang.Object r2 = r10.f367663c
            java.lang.Object r3 = r10.f367662b
            java.lang.Object r4 = r10.f367661a
            com.google.android.apps.search.googleapp.discover.u.cr r4 = (com.google.android.apps.search.googleapp.discover.p10238u.C135016cr) r4
            p5462h.C69714l.m101134b(r17)     // Catch:{ all -> 0x002f }
            r15 = r1
            r14 = r2
            r1 = r17
            goto L_0x006a
        L_0x002f:
            r0 = move-exception
            r1 = r0
            r14 = r2
            goto L_0x0089
        L_0x0033:
            p5462h.C69714l.m101134b(r17)
            com.google.android.apps.search.googleapp.discover.u.cq r1 = r10.f367666f
            com.google.android.apps.search.googleapp.discover.u.bw r4 = r10.f367667g
            com.google.android.apps.search.googleapp.discover.u.cr r12 = r10.f367668h
            java.util.UUID r13 = r10.f367669i
            java.lang.String r3 = "GwsFeedRequestClient#triggerNextPageRequest"
            com.google.apps.tiktok.tracing.bi r14 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r3)
            com.google.bv.e.b.c.a.bn r15 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn.NEXT_PAGE_SCROLL     // Catch:{ all -> 0x0085 }
            com.google.android.apps.search.googleapp.discover.u.dw r1 = r1.f367671b     // Catch:{ all -> 0x0085 }
            com.google.bv.e.b.c.a.w r3 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w.f153198a     // Catch:{ all -> 0x0085 }
            java.lang.String r5 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)     // Catch:{ all -> 0x0085 }
            r10.f367661a = r12     // Catch:{ all -> 0x0085 }
            r10.f367662b = r13     // Catch:{ all -> 0x0085 }
            r10.f367663c = r14     // Catch:{ all -> 0x0085 }
            r10.f367664d = r15     // Catch:{ all -> 0x0085 }
            r10.f367665e = r2     // Catch:{ all -> 0x0085 }
            r5 = 0
            java.lang.String r6 = ""
            r7 = 0
            r9 = 208(0xd0, float:2.91E-43)
            r2 = r15
            r8 = r16
            java.lang.Object r1 = com.google.android.apps.search.googleapp.discover.p10238u.C135049dw.m219004c(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0085 }
            if (r1 == r0) goto L_0x0087
            r4 = r12
            r3 = r13
        L_0x006a:
            com.google.bv.e.b.c.a.dd r1 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57303dd) r1     // Catch:{ all -> 0x0085 }
            h.f.a.r r2 = r4.f367672a     // Catch:{ all -> 0x0085 }
            r10.f367661a = r14     // Catch:{ all -> 0x0085 }
            r10.f367662b = r11     // Catch:{ all -> 0x0085 }
            r10.f367663c = r11     // Catch:{ all -> 0x0085 }
            r10.f367664d = r11     // Catch:{ all -> 0x0085 }
            r4 = 2
            r10.f367665e = r4     // Catch:{ all -> 0x0085 }
            java.lang.Object r1 = r2.mo8479a(r1, r3, r15, r10)     // Catch:{ all -> 0x0085 }
            if (r1 == r0) goto L_0x0087
        L_0x007f:
            com.google.bv.e.b.c.a.dj r1 = (com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57309dj) r1     // Catch:{ all -> 0x0085 }
            p5462h.p5472e.C69598b.m101013a(r14, r11)
            return r1
        L_0x0085:
            r0 = move-exception
            goto L_0x0088
        L_0x0087:
            return r0
        L_0x0088:
            r1 = r0
        L_0x0089:
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            r2 = r0
            p5462h.p5472e.C69598b.m101013a(r14, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10238u.C135014cp.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135014cp(this.f367666f, this.f367667g, this.f367668h, this.f367669i, gVar);
    }
}
