package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import com.google.android.libraries.search.p2904c.C37410bo;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.audio.AudioInputBackend$openAsync$1", mo61344c = "AudioInputBackend.kt", mo61345d = "invokeSuspend", mo61346e = {61})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.ac */
/* compiled from: PG */
final class C126375ac extends C69572j implements C69630p {

    /* renamed from: a */
    Object f348075a;

    /* renamed from: b */
    Object f348076b;

    /* renamed from: c */
    int f348077c;

    /* renamed from: d */
    final /* synthetic */ C126376ad f348078d;

    /* renamed from: e */
    final /* synthetic */ C37410bo f348079e;

    /* renamed from: f */
    final /* synthetic */ C71422aw f348080f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126375ac(C126376ad adVar, C37410bo boVar, C71422aw awVar, C69577g gVar) {
        super(2, gVar);
        this.f348078d = adVar;
        this.f348079e = boVar;
        this.f348080f = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126375ac) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.b.cx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.android.libraries.search.c.bg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.libraries.search.c.bg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: kotlinx.coroutines.b.cx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.libraries.search.c.bg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: kotlinx.coroutines.b.cx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f348077c
            if (r1 == 0) goto L_0x000f
            java.lang.Object r0 = r6.f348076b
            java.lang.Object r1 = r6.f348075a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0092
        L_0x000f:
            p5462h.C69714l.m101134b(r7)
            r7 = 0
            r1 = 6
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            kotlinx.coroutines.b.cx r1 = kotlinx.coroutines.p5574b.C71557dg.m104447e(r2, r3, r7, r1)
            com.google.android.apps.search.assistant.surfaces.e.a.ad r7 = r6.f348078d
            com.google.android.libraries.search.c.bx r7 = r7.f348082b
            com.google.android.libraries.search.c.bl r2 = com.google.android.libraries.search.p2904c.C37407bl.f99325c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.c.bk r2 = (com.google.android.libraries.search.p2904c.C37406bk) r2
            java.lang.String r3 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.android.libraries.search.c.bd r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.android.libraries.search.c.j.c r4 = com.google.android.libraries.search.p2904c.p2933j.C37773c.f100243c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.search.c.j.a r4 = (com.google.android.libraries.search.p2904c.p2933j.C37705a) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r3)
            com.google.android.libraries.search.c.j.e r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            com.google.android.libraries.search.c.j.a.c.a.l r4 = com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.p2938a.C37752l.f100184a
            java.lang.String r5 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            r3.mo41085b(r4)
            com.google.android.libraries.search.c.j.c r3 = r3.mo41084a()
            r2.mo40928b(r3)
            com.google.android.libraries.search.c.bl r2 = r2.mo40927a()
            com.google.android.libraries.search.c.bi r7 = r7.mo40942a(r2)
            com.google.android.libraries.search.c.bo r2 = r6.f348079e
            com.google.android.apps.search.assistant.surfaces.e.a.y r3 = new com.google.android.apps.search.assistant.surfaces.e.a.y
            com.google.android.apps.search.assistant.surfaces.e.a.ad r4 = r6.f348078d
            java.util.concurrent.Executor r4 = r4.f348083c
            r3.<init>(r1, r4)
            com.google.android.libraries.search.c.bg r7 = r7.mo40936b(r2, r3)
            kotlinx.coroutines.aw r2 = r6.f348080f
            h.c.o r2 = r2.mo5702lZ()
            kotlinx.coroutines.cp r2 = kotlinx.coroutines.C71647ct.m104638b(r2)
            com.google.android.apps.search.assistant.surfaces.e.a.ab r3 = new com.google.android.apps.search.assistant.surfaces.e.a.ab
            r3.<init>(r7)
            r2.mo62873s(r3)
            com.google.common.util.concurrent.cx r2 = r7.mo20357d()
            java.lang.String r3 = "session.startListeningResult"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            r6.f348075a = r1
            r6.f348076b = r7
            r3 = 1
            r6.f348077c = r3
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r6)
            if (r2 == r0) goto L_0x00f6
            r0 = r7
            r7 = r2
        L_0x0092:
            com.google.android.libraries.search.c.be r7 = (com.google.android.libraries.search.p2904c.C37400be) r7
            if (r7 == 0) goto L_0x00ee
            com.google.android.libraries.search.c.bu r2 = r7.mo40929a()
            com.google.android.libraries.search.c.eb r2 = r2.f99350b
            if (r2 != 0) goto L_0x00a0
            com.google.android.libraries.search.c.eb r2 = com.google.android.libraries.search.p2904c.C37561eb.f99800c
        L_0x00a0:
            int r2 = r2.f99802a
            r3 = 2
            if (r2 != r3) goto L_0x00e3
            com.google.android.apps.search.assistant.surfaces.e.a.e r0 = new com.google.android.apps.search.assistant.surfaces.e.a.e
            com.google.android.libraries.search.c.bu r7 = r7.mo40929a()
            com.google.android.libraries.search.c.eb r7 = r7.f99350b
            if (r7 != 0) goto L_0x00b1
            com.google.android.libraries.search.c.eb r7 = com.google.android.libraries.search.p2904c.C37561eb.f99800c
        L_0x00b1:
            int r1 = r7.f99802a
            if (r1 != r3) goto L_0x00c6
            java.lang.Object r7 = r7.f99803b
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            com.google.android.libraries.search.c.dz r7 = com.google.android.libraries.search.p2904c.C37519dz.m66524a(r7)
            if (r7 != 0) goto L_0x00c8
            com.google.android.libraries.search.c.dz r7 = com.google.android.libraries.search.p2904c.C37519dz.UNKNOWN_OPENING_FAILURE
            goto L_0x00c8
        L_0x00c6:
            com.google.android.libraries.search.c.dz r7 = com.google.android.libraries.search.p2904c.C37519dz.UNKNOWN_OPENING_FAILURE
        L_0x00c8:
            java.lang.String r1 = "result.startListeningSta…urceOpeningStatus.failure"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Audio Input failed to open: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r7, r1)
            throw r0
        L_0x00e3:
            com.google.android.apps.search.assistant.surfaces.e.a.aa r2 = new com.google.android.apps.search.assistant.surfaces.e.a.aa
            java.lang.String r3 = "session"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)
            r2.<init>(r0, r7, r1)
            return r2
        L_0x00ee:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "StartListeningResult was null"
            r7.<init>(r0)
            throw r7
        L_0x00f6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126375ac.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126375ac(this.f348078d, this.f348079e, this.f348080f, gVar);
    }
}
