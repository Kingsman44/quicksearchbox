package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.PolicyActor$acquireNewSession$2$1", mo61344c = "PolicyActor.kt", mo61345d = "invokeSuspend", mo61346e = {93, 94, 94})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.ac */
/* compiled from: PG */
final class C120425ac extends C69572j implements C69626l {

    /* renamed from: a */
    Object f334949a;

    /* renamed from: b */
    int f334950b;

    /* renamed from: c */
    final /* synthetic */ C120432aj f334951c;

    /* renamed from: d */
    final /* synthetic */ C71422aw f334952d;

    /* renamed from: e */
    final /* synthetic */ C71816z f334953e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120425ac(C120432aj ajVar, C71422aw awVar, C71816z zVar, C69577g gVar) {
        super(1, gVar);
        this.f334951c = ajVar;
        this.f334952d = awVar;
        this.f334953e = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C120425ac(this.f334951c, this.f334952d, this.f334953e, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.coroutines.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: kotlinx.coroutines.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlinx.coroutines.be} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        if (r7 != r0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a.C120434al.m199474a(r7, r5, r6) != r0) goto L_0x0044;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f334950b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 == r4) goto L_0x0015
            if (r1 == r3) goto L_0x0011
            p5462h.C69714l.m101134b(r7)
            goto L_0x0065
        L_0x0011:
            p5462h.C69714l.m101134b(r7)
            goto L_0x004e
        L_0x0015:
            java.lang.Object r1 = r6.f334949a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0044
        L_0x001b:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.platform.f.b.b.a.aj r7 = r6.f334951c
            com.google.android.apps.search.assistant.platform.f.b.a.a.j r7 = r7.f334976a
            com.google.android.apps.search.assistant.platform.f.b.a.a.g r1 = new com.google.android.apps.search.assistant.platform.f.b.a.a.g
            r1.<init>(r7)
            java.util.concurrent.Executor r7 = r7.f334908a
            com.google.apps.tiktok.tracing.contrib.b.c r7 = com.google.apps.tiktok.tracing.contrib.p3700b.C47630c.m84725b(r1, r7)
            kotlinx.coroutines.aw r1 = r6.f334952d
            kotlinx.coroutines.be r1 = com.google.android.libraries.search.assistant.p2511d.C32550m.m60364a(r7, r1)
            kotlinx.coroutines.z r7 = r6.f334953e
            com.google.android.apps.search.assistant.platform.f.b.b.a.ab r5 = new com.google.android.apps.search.assistant.platform.f.b.b.a.ab
            r5.<init>(r1, r2)
            r6.f334949a = r1
            r6.f334950b = r4
            java.lang.Object r7 = com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a.C120434al.m199474a(r7, r5, r6)
            if (r7 == r0) goto L_0x0068
        L_0x0044:
            r6.f334949a = r2
            r6.f334950b = r3
            java.lang.Object r7 = r1.mo62825a(r6)
            if (r7 == r0) goto L_0x0068
        L_0x004e:
            com.google.android.apps.search.assistant.platform.f.b.a.a.n r7 = (com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a.C120406n) r7
            com.google.common.util.concurrent.cx r7 = r7.f334912a
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92901j(r7)
            java.lang.String r1 = "sessionAsync.await().onFocusLost()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)
            r1 = 3
            r6.f334950b = r1
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r6)
            if (r7 != r0) goto L_0x0065
            return r0
        L_0x0065:
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x0068:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a.C120425ac.mo5193b(java.lang.Object):java.lang.Object");
    }
}
