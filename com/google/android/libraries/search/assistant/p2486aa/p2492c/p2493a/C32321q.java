package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.speechbiasingcontext.service.impl.ContextFetcher$fetchSpeechBiasingContext$2", mo61344c = "ContextFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {50, 52})
/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.q */
/* compiled from: PG */
public final class C32321q extends C69572j implements C69630p {

    /* renamed from: a */
    int f86608a;

    /* renamed from: b */
    final /* synthetic */ C32324t f86609b;

    /* renamed from: c */
    final /* synthetic */ C32603b f86610c;

    /* renamed from: d */
    final /* synthetic */ C32849cq f86611d;

    /* renamed from: e */
    final /* synthetic */ int f86612e;

    /* renamed from: f */
    final /* synthetic */ Duration f86613f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32321q(C32324t tVar, C32603b bVar, C32849cq cqVar, int i, Duration duration, C69577g gVar) {
        super(2, gVar);
        this.f86609b = tVar;
        this.f86610c = bVar;
        this.f86611d = cqVar;
        this.f86612e = i;
        this.f86613f = duration;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32321q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x008b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r11.f86608a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0012
            if (r1 == r2) goto L_0x000e
            p5462h.C69714l.m101134b(r12)
            goto L_0x007a
        L_0x000e:
            p5462h.C69714l.m101134b(r12)
            goto L_0x0033
        L_0x0012:
            p5462h.C69714l.m101134b(r12)
            com.google.android.libraries.search.assistant.aa.c.a.t r12 = r11.f86609b
            com.google.android.libraries.search.assistant.f.a.b r1 = r11.f86610c
            com.google.android.libraries.search.assistant.f.a.d.cq r4 = r11.f86611d
            int r5 = r11.f86612e
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r6)
            java.lang.String r6 = "of(requestId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r11.f86608a = r2
            java.lang.Object r12 = r12.mo38039b(r1, r4, r5, r11)
            if (r12 == r0) goto L_0x00ad
        L_0x0033:
            java.util.List r12 = (java.util.List) r12
            com.google.android.libraries.search.assistant.aa.c.a.t r1 = r11.f86609b
            com.google.android.libraries.search.assistant.aa.c.a.p r2 = new com.google.android.libraries.search.assistant.aa.c.a.p
            com.google.android.libraries.search.assistant.f.a.d.cq r6 = r11.f86611d
            com.google.android.libraries.search.assistant.f.a.b r7 = r11.f86610c
            int r8 = r11.f86612e
            j$.time.Duration r9 = r11.f86613f
            r10 = 0
            r4 = r2
            r5 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r4 = 2
            r11.f86608a = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r12, r5)
            r4.<init>(r5)
            java.util.Iterator r12 = r12.iterator()
        L_0x0059:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r12.next()
            kotlinx.coroutines.aw r6 = r1.f86624a
            com.google.android.libraries.search.assistant.aa.c.a.s r7 = new com.google.android.libraries.search.assistant.aa.c.a.s
            r7.<init>(r2, r5, r3)
            r5 = 3
            kotlinx.coroutines.be r5 = kotlinx.coroutines.C71803m.m105042c(r6, r3, r3, r7, r5)
            r4.add(r5)
            goto L_0x0059
        L_0x0073:
            java.lang.Object r12 = kotlinx.coroutines.C71760h.m104949a(r4, r11)
            if (r12 != r0) goto L_0x007a
            return r0
        L_0x007a:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0085:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r1 = r12.next()
            h.i r1 = (p5462h.C69685i) r1
            java.lang.Object r2 = r1.f186052a
            com.google.android.libraries.search.assistant.f.a.d.ar r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r2
            java.lang.Object r1 = r1.f186053b
            com.google.android.libraries.search.assistant.f.a.d.aw r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r1
            if (r1 == 0) goto L_0x00a1
            h.i r4 = new h.i
            r4.<init>(r2, r1)
            goto L_0x00a2
        L_0x00a1:
            r4 = r3
        L_0x00a2:
            if (r4 == 0) goto L_0x0085
            r0.add(r4)
            goto L_0x0085
        L_0x00a8:
            java.util.Map r12 = p5462h.p5463a.C69505av.m100874p(r0)
            return r12
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32321q.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32321q(this.f86609b, this.f86610c, this.f86611d, this.f86612e, this.f86613f, gVar);
    }
}
