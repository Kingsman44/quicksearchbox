package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.audio.AudioFocus$openAsync$1", mo61344c = "AudioFocus.kt", mo61345d = "invokeSuspend", mo61346e = {57})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.i */
/* compiled from: PG */
public final class C126393i extends C69572j implements C69630p {

    /* renamed from: a */
    Object f348126a;

    /* renamed from: b */
    int f348127b;

    /* renamed from: c */
    final /* synthetic */ C126394j f348128c;

    /* renamed from: d */
    final /* synthetic */ C71422aw f348129d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126393i(C126394j jVar, C71422aw awVar, C69577g gVar) {
        super(2, gVar);
        this.f348128c = jVar;
        this.f348129d = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126393i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.android.libraries.search.c.aa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.libraries.search.c.aa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.libraries.search.c.aa} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r5.f348127b
            if (r1 == 0) goto L_0x000c
            java.lang.Object r0 = r5.f348126a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0063
        L_0x000c:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.search.assistant.surfaces.e.a.j r6 = r5.f348128c
            com.google.android.libraries.search.c.d.a.d r6 = r6.f348132c
            com.google.android.libraries.search.c.ak r1 = com.google.android.libraries.search.p2904c.C37346ak.f99197g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.search.c.aj r1 = (com.google.android.libraries.search.p2904c.C37345aj) r1
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.libraries.search.c.ao r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.libraries.search.c.j.c r3 = com.google.android.libraries.search.p2904c.p2933j.C37773c.f100243c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.search.c.j.a r3 = (com.google.android.libraries.search.p2904c.p2933j.C37705a) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r2)
            com.google.android.libraries.search.c.j.e r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            com.google.android.libraries.search.c.j.a.c.a.l r3 = com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.p2938a.C37752l.f100184a
            java.lang.String r4 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            r2.mo41085b(r3)
            com.google.android.libraries.search.c.j.c r2 = r2.mo41084a()
            r1.mo40896b(r2)
            com.google.android.libraries.search.c.ak r1 = r1.mo40895a()
            com.google.android.libraries.search.c.aa r6 = r6.mo40984a(r1)
            r1 = r6
            com.google.android.libraries.search.c.d.a.j r1 = (com.google.android.libraries.search.p2904c.p2913d.p2914a.C37488j) r1
            com.google.common.util.concurrent.cx r1 = r1.f99524d
            java.lang.String r2 = "audioFocusSession.acquireAudioFocusStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r5.f348126a = r6
            r2 = 1
            r5.f348127b = r2
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r5)
            if (r1 == r0) goto L_0x00ba
            r0 = r6
            r6 = r1
        L_0x0063:
            com.google.android.libraries.search.c.ac r6 = (com.google.android.libraries.search.p2904c.C37338ac) r6
            if (r6 == 0) goto L_0x00b2
            int r1 = r6.f99179b
            com.google.android.libraries.search.c.af r1 = com.google.android.libraries.search.p2904c.C37341af.m66350a(r1)
            if (r1 != 0) goto L_0x0071
            com.google.android.libraries.search.c.af r1 = com.google.android.libraries.search.p2904c.C37341af.UNKNOWN_ACQUIRING_STATUS
        L_0x0071:
            com.google.android.libraries.search.c.af r2 = com.google.android.libraries.search.p2904c.C37341af.ACQUIRED
            if (r1 == r2) goto L_0x0095
            com.google.android.apps.search.assistant.surfaces.e.a.j r0 = r5.f348128c
            boolean r0 = r0.f348131b
            if (r0 != 0) goto L_0x007d
            r6 = 0
            return r6
        L_0x007d:
            com.google.android.apps.search.assistant.surfaces.e.a.b r0 = new com.google.android.apps.search.assistant.surfaces.e.a.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Focus Acquisition Failed: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r6.toString()
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r6, r1)
            throw r0
        L_0x0095:
            com.google.android.apps.search.assistant.surfaces.e.a.g r6 = new com.google.android.apps.search.assistant.surfaces.e.a.g
            java.lang.String r1 = "audioFocusSession"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            r6.<init>(r0)
            kotlinx.coroutines.aw r0 = r5.f348129d
            h.c.o r0 = r0.mo5702lZ()
            kotlinx.coroutines.cp r0 = kotlinx.coroutines.C71647ct.m104638b(r0)
            com.google.android.apps.search.assistant.surfaces.e.a.h r1 = new com.google.android.apps.search.assistant.surfaces.e.a.h
            r1.<init>(r6)
            r0.mo62873s(r1)
            return r6
        L_0x00b2:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "AcquireAudioFocusStatus was null"
            r6.<init>(r0)
            throw r6
        L_0x00ba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126393i.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126393i(this.f348128c, this.f348129d, gVar);
    }
}
