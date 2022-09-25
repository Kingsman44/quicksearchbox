package com.google.android.libraries.search.p2904c.p2906aa;

import com.google.android.libraries.search.p2904c.C37422c;
import java.util.concurrent.Executor;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.utils.AudioBufferUtils$asFlow$1", mo61344c = "AudioBufferUtils.kt", mo61345d = "invokeSuspend", mo61346e = {36, 38})
/* renamed from: com.google.android.libraries.search.c.aa.c */
/* compiled from: PG */
public final class C37328c extends C69572j implements C69630p {

    /* renamed from: a */
    int f99169a;

    /* renamed from: b */
    final /* synthetic */ C37422c f99170b;

    /* renamed from: c */
    final /* synthetic */ Executor f99171c;

    /* renamed from: d */
    private /* synthetic */ Object f99172d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37328c(C37422c cVar, Executor executor, C69577g gVar) {
        super(2, gVar);
        this.f99170b = cVar;
        this.f99171c = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37328c) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.a.ao} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r5.f99169a
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 == r2) goto L_0x000d
            p5462h.C69714l.m101134b(r6)
            goto L_0x0048
        L_0x000d:
            java.lang.Object r1 = r5.f99172d
            kotlinx.coroutines.a.ao r1 = (kotlinx.coroutines.p5573a.C71361ao) r1
            p5462h.C69714l.m101134b(r6)
            goto L_0x0039
        L_0x0015:
            p5462h.C69714l.m101134b(r6)
            java.lang.Object r6 = r5.f99172d
            r1 = r6
            kotlinx.coroutines.a.ao r1 = (kotlinx.coroutines.p5573a.C71361ao) r1
            com.google.android.libraries.search.c.c r6 = r5.f99170b
            com.google.android.libraries.search.c.aa.a r3 = new com.google.android.libraries.search.c.aa.a
            java.util.concurrent.Executor r4 = r5.f99171c
            r3.<init>(r1, r4)
            com.google.common.util.concurrent.cx r6 = r6.mo40946j(r3)
            java.lang.String r3 = "executor: Executor) =\n  …            }\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r3)
            r5.f99172d = r1
            r5.f99169a = r2
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r5)
            if (r6 == r0) goto L_0x004b
        L_0x0039:
            com.google.android.libraries.search.c.aa.b r6 = com.google.android.libraries.search.p2904c.p2906aa.C37327b.f99168a
            r2 = 0
            r5.f99172d = r2
            r2 = 2
            r5.f99169a = r2
            java.lang.Object r6 = kotlinx.coroutines.p5573a.C71360an.m104022a(r1, r6, r5)
            if (r6 != r0) goto L_0x0048
            return r0
        L_0x0048:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2906aa.C37328c.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C37328c cVar = new C37328c(this.f99170b, this.f99171c, gVar);
        cVar.f99172d = obj;
        return cVar;
    }
}
