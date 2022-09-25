package com.google.android.libraries.search.p2904c.p2908b.p2910b;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37502di;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.audioadapter.restricted.SodaAudioAdapterReader$read$2", mo61344c = "SodaAudioAdapterReader.kt", mo61345d = "invokeSuspend", mo61346e = {52, 91})
/* renamed from: com.google.android.libraries.search.c.b.b.d */
/* compiled from: PG */
public final class C37377d extends C69572j implements C69630p {

    /* renamed from: a */
    Object f99276a;

    /* renamed from: b */
    int f99277b;

    /* renamed from: c */
    final /* synthetic */ C37360ay f99278c;

    /* renamed from: d */
    final /* synthetic */ C37378e f99279d;

    /* renamed from: e */
    final /* synthetic */ C69626l f99280e;

    /* renamed from: f */
    final /* synthetic */ C37502di f99281f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37377d(C37360ay ayVar, C37378e eVar, C69626l lVar, C37502di diVar, C69577g gVar) {
        super(2, gVar);
        this.f99278c = ayVar;
        this.f99279d = eVar;
        this.f99280e = lVar;
        this.f99281f = diVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37377d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.libraries.search.c.b.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.libraries.search.c.b.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.libraries.search.c.b.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.google.android.libraries.search.c.b.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r5.f99277b
            r2 = 1
            if (r1 == 0) goto L_0x0014
            if (r1 == r2) goto L_0x000e
            p5462h.C69714l.m101134b(r6)
            goto L_0x00b8
        L_0x000e:
            java.lang.Object r1 = r5.f99276a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0044
        L_0x0014:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.c.ay r6 = r5.f99278c
            boolean r6 = r6.f99236k
            if (r6 == 0) goto L_0x00d3
            com.google.android.libraries.search.c.b.b.e r6 = r5.f99279d
            com.google.android.libraries.search.c.b.a.f r6 = r6.f99285d
            com.google.android.libraries.search.c.b.h r1 = com.google.android.libraries.search.p2904c.p2908b.C37384h.SODA
            com.google.common.base.ax r6 = r6.mo40909c(r1)
            java.lang.Object r6 = r6.mo56111f()
            r1 = r6
            com.google.android.libraries.search.c.b.a r1 = (com.google.android.libraries.search.p2904c.p2908b.C37363a) r1
            if (r1 == 0) goto L_0x00cb
            com.google.common.util.concurrent.cx r6 = r1.mo24474d()
            java.lang.String r3 = "adapter.connect()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r3)
            r5.f99276a = r1
            r5.f99277b = r2
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r5)
            if (r6 != r0) goto L_0x0044
            return r0
        L_0x0044:
            com.google.android.libraries.search.c.b.e r2 = com.google.android.libraries.search.p2904c.p2908b.C37381e.AUDIO_ADAPTER_CONNECT_STATUS_SUCCESS
            if (r6 != r2) goto L_0x00c3
            com.google.android.libraries.search.c.ay r6 = r5.f99278c
            com.google.android.libraries.search.c.di r2 = r5.f99281f
            com.google.android.libraries.search.c.b.l r3 = com.google.android.libraries.search.p2904c.p2908b.C37388l.f99307e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.search.c.b.k r3 = (com.google.android.libraries.search.p2904c.p2908b.C37387k) r3
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            com.google.android.libraries.search.c.b.p r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            r3.mo40923b(r6)
            com.google.android.libraries.search.c.dg r6 = r2.f99564b
            if (r6 != 0) goto L_0x0066
            com.google.android.libraries.search.c.dg r6 = com.google.android.libraries.search.p2904c.C37500dg.f99557c
        L_0x0066:
            java.lang.String r2 = "route.precachedBufferId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            r3.mo40924c(r6)
            com.google.android.libraries.search.c.b.l r6 = r3.mo40922a()
            com.google.common.base.ax r6 = r1.mo24473c(r6)
            java.lang.Object r6 = r6.mo56111f()
            com.google.android.libraries.search.c.ab.c r6 = (com.google.android.libraries.search.p2904c.p2907ab.C37336c) r6
            if (r6 == 0) goto L_0x00bb
            com.google.android.libraries.search.c.b.b.e r2 = r5.f99279d
            com.google.android.libraries.search.c.t.a.d r2 = r2.f99283b
            com.google.android.libraries.search.m.b.b r3 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_ASSISTANT_URI_VIS
            java.lang.String r3 = com.google.android.libraries.search.p3047m.p3050b.C39227c.m68658b(r3)
            r2.mo41185b(r3)
            com.google.android.libraries.search.c.b.b.c r2 = new com.google.android.libraries.search.c.b.b.c
            com.google.android.libraries.search.c.b.b.e r3 = r5.f99279d
            com.google.android.libraries.search.c.di r4 = r5.f99281f
            r2.<init>(r3, r1, r4)
            com.google.android.libraries.search.c.ab.b r6 = r6.mo40885b()
            java.lang.String r1 = "null cannot be cast to non-null type com.google.android.libraries.search.audio.audiobuffer.AudioBytesReceiverAudioBuffer"
            p5462h.p5473f.p5475b.C69664n.m101059e(r6, r1)
            com.google.android.libraries.search.c.c.p r6 = (com.google.android.libraries.search.p2904c.p2911c.C37446p) r6
            h.f.a.l r1 = r5.f99280e
            java.lang.Object r1 = r1.mo5761a(r2)
            com.google.android.libraries.search.c.b r1 = (com.google.android.libraries.search.p2904c.C37362b) r1
            com.google.common.util.concurrent.cx r6 = r6.mo40946j(r1)
            r1 = 0
            r5.f99276a = r1
            r1 = 2
            r5.f99277b = r1
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r5)
            if (r6 != r0) goto L_0x00b8
            return r0
        L_0x00b8:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x00bb:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Soda audio adapter didn't provide audio buffer."
            r6.<init>(r0)
            throw r6
        L_0x00c3:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Soda audio adapter connection failed."
            r6.<init>(r0)
            throw r6
        L_0x00cb:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Soda audio adapter is not available."
            r6.<init>(r0)
            throw r6
        L_0x00d3:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Soda adapter supports push mechanism only."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2908b.p2910b.C37377d.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C37377d(this.f99278c, this.f99279d, this.f99280e, this.f99281f, gVar);
    }
}
