package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a;

import kotlinx.coroutines.p5574b.C71588o;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.timeout.impl.ActiveTimeoutImpl$flows$1", mo61344c = "ActiveTimeoutImpl.kt", mo61345d = "invokeSuspend", mo61346e = {29, 30})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.g.a.c */
/* compiled from: PG */
final class C127069c extends C69572j implements C69630p {

    /* renamed from: a */
    int f349891a;

    /* renamed from: b */
    final /* synthetic */ Duration f349892b;

    /* renamed from: c */
    private /* synthetic */ Object f349893c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127069c(Duration duration, C69577g gVar) {
        super(2, gVar);
        this.f349892b = duration;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127069c) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.b.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r5.f349891a
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 == r2) goto L_0x000d
            p5462h.C69714l.m101134b(r6)
            goto L_0x0041
        L_0x000d:
            java.lang.Object r1 = r5.f349893c
            kotlinx.coroutines.b.o r1 = (kotlinx.coroutines.p5574b.C71588o) r1
            p5462h.C69714l.m101134b(r6)
            goto L_0x0032
        L_0x0015:
            p5462h.C69714l.m101134b(r6)
            java.lang.Object r6 = r5.f349893c
            r1 = r6
            kotlinx.coroutines.b.o r1 = (kotlinx.coroutines.p5574b.C71588o) r1
            j$.time.Duration r6 = r5.f349892b
            r6.toSeconds()
            j$.time.Duration r6 = r5.f349892b
            long r3 = r6.toMillis()
            r5.f349893c = r1
            r5.f349891a = r2
            java.lang.Object r6 = kotlinx.coroutines.C71608bi.m104551c(r3, r5)
            if (r6 == r0) goto L_0x0044
        L_0x0032:
            h.q r6 = p5462h.C69788q.f186170a
            r2 = 0
            r5.f349893c = r2
            r2 = 2
            r5.f349891a = r2
            java.lang.Object r6 = r1.mo20883a(r6, r5)
            if (r6 != r0) goto L_0x0041
            return r0
        L_0x0041:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a.C127069c.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C127069c cVar = new C127069c(this.f349892b, gVar);
        cVar.f349893c = obj;
        return cVar;
    }
}
