package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionRootService$run$2$1$1$1", mo61344c = "AccessSessionRootService.kt", mo61345d = "invokeSuspend", mo61346e = {121, 121, 125, 125})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.at */
/* compiled from: PG */
final class C32624at extends C69572j implements C69630p {

    /* renamed from: a */
    Object f87420a;

    /* renamed from: b */
    int f87421b;

    /* renamed from: c */
    final /* synthetic */ C32636be f87422c;

    /* renamed from: d */
    final /* synthetic */ List f87423d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32624at(C32636be beVar, List list, C69577g gVar) {
        super(2, gVar);
        this.f87422c = beVar;
        this.f87423d = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32624at) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f87421b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x002a
            if (r1 == r4) goto L_0x0022
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            p5462h.C69714l.m101134b(r7)
            goto L_0x0067
        L_0x0014:
            java.lang.Object r0 = r6.f87420a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            p5462h.C69714l.m101134b(r7)
            goto L_0x0083
        L_0x001c:
            p5462h.C69714l.m101134b(r7)     // Catch:{ all -> 0x0020 }
            goto L_0x0053
        L_0x0020:
            r7 = move-exception
            goto L_0x006b
        L_0x0022:
            java.lang.Object r1 = r6.f87420a
            com.google.android.libraries.search.assistant.f.a.d.p r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p) r1
            p5462h.C69714l.m101134b(r7)     // Catch:{ all -> 0x0020 }
            goto L_0x003c
        L_0x002a:
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.search.assistant.f.a.b.be r7 = r6.f87422c     // Catch:{ all -> 0x0020 }
            com.google.android.libraries.search.assistant.f.a.d.p r1 = r7.f87464e     // Catch:{ all -> 0x0020 }
            r6.f87420a = r1     // Catch:{ all -> 0x0020 }
            r6.f87421b = r4     // Catch:{ all -> 0x0020 }
            java.lang.Object r7 = r7.mo38194h(r6)     // Catch:{ all -> 0x0020 }
            if (r7 != r0) goto L_0x003c
            return r0
        L_0x003c:
            com.google.android.libraries.search.assistant.f.a.d.ch r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch) r7     // Catch:{ all -> 0x0020 }
            kotlinx.coroutines.b.n r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p.m60832f(r1, r7)     // Catch:{ all -> 0x0020 }
            com.google.android.libraries.search.assistant.f.a.b.ar r1 = new com.google.android.libraries.search.assistant.f.a.b.ar     // Catch:{ all -> 0x0020 }
            com.google.android.libraries.search.assistant.f.a.b.be r4 = r6.f87422c     // Catch:{ all -> 0x0020 }
            r1.<init>(r4)     // Catch:{ all -> 0x0020 }
            r6.f87420a = r5     // Catch:{ all -> 0x0020 }
            r6.f87421b = r3     // Catch:{ all -> 0x0020 }
            java.lang.Object r7 = r7.mo38165mp(r1, r6)     // Catch:{ all -> 0x0020 }
            if (r7 == r0) goto L_0x006a
        L_0x0053:
            kotlinx.coroutines.dg r7 = kotlinx.coroutines.C71671dg.f191128a
            com.google.android.libraries.search.assistant.f.a.b.as r1 = new com.google.android.libraries.search.assistant.f.a.b.as
            com.google.android.libraries.search.assistant.f.a.b.be r3 = r6.f87422c
            java.util.List r4 = r6.f87423d
            r1.<init>(r3, r4, r5)
            r6.f87421b = r2
            java.lang.Object r7 = kotlinx.coroutines.C71803m.m105040a(r7, r1, r6)
            if (r7 != r0) goto L_0x0067
            return r0
        L_0x0067:
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x006a:
            return r0
        L_0x006b:
            kotlinx.coroutines.dg r1 = kotlinx.coroutines.C71671dg.f191128a
            com.google.android.libraries.search.assistant.f.a.b.as r2 = new com.google.android.libraries.search.assistant.f.a.b.as
            com.google.android.libraries.search.assistant.f.a.b.be r3 = r6.f87422c
            java.util.List r4 = r6.f87423d
            r2.<init>(r3, r4, r5)
            r6.f87420a = r7
            r3 = 4
            r6.f87421b = r3
            java.lang.Object r1 = kotlinx.coroutines.C71803m.m105040a(r1, r2, r6)
            if (r1 != r0) goto L_0x0082
            return r0
        L_0x0082:
            r0 = r7
        L_0x0083:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32624at.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32624at(this.f87422c, this.f87423d, gVar);
    }
}
