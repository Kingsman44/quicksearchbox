package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.VoicePlateClassicConnectionImpl$createOnboardingExperienceFlow$2", mo61344c = "VoicePlateClassicConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {283, 292, 297, 300})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.ay */
/* compiled from: PG */
final class C128716ay extends C69572j implements C69631q {

    /* renamed from: a */
    Object f353831a;

    /* renamed from: b */
    int f353832b;

    /* renamed from: c */
    /* synthetic */ boolean f353833c;

    /* renamed from: d */
    final /* synthetic */ C128735bq f353834d;

    /* renamed from: e */
    private /* synthetic */ Object f353835e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128716ay(C128735bq bqVar, C69577g gVar) {
        super(3, gVar);
        this.f353834d = bqVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C128716ay ayVar = new C128716ay(this.f353834d, (C69577g) obj3);
        ayVar.f353835e = (C71588o) obj;
        ayVar.f353833c = booleanValue;
        return ayVar.mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: kotlinx.coroutines.b.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: kotlinx.coroutines.b.o} */
    /* JADX WARNING: type inference failed for: r11v13, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r1 != r0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        if (r3.mo20883a(r11, r10) != r0) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        return r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f353832b
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0024
            if (r1 == r4) goto L_0x001d
            if (r1 == r3) goto L_0x0013
            p5462h.C69714l.m101134b(r11)
            goto L_0x00b0
        L_0x0013:
            java.lang.Object r1 = r10.f353831a
            java.lang.Object r3 = r10.f353835e
            p5462h.C69714l.m101134b(r11)     // Catch:{ Exception -> 0x001b }
            goto L_0x0063
        L_0x001b:
            r11 = move-exception
            goto L_0x0078
        L_0x001d:
            java.lang.Object r1 = r10.f353835e
            p5462h.C69714l.m101134b(r11)
            r11 = r1
            goto L_0x0035
        L_0x0024:
            p5462h.C69714l.m101134b(r11)
            java.lang.Object r11 = r10.f353835e
            boolean r1 = r10.f353833c
            if (r1 == 0) goto L_0x00a4
            r10.f353832b = r4
            java.lang.Object r1 = r11.mo20883a(r5, r10)
            if (r1 == r0) goto L_0x00a3
        L_0x0035:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.j r1 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128109j.f352484c
            java.lang.String r4 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bq r4 = r10.f353834d     // Catch:{ Exception -> 0x0074 }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.u r4 = r4.f353889i     // Catch:{ Exception -> 0x0074 }
            if (r4 == 0) goto L_0x006c
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.h r6 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128107h.f352482a     // Catch:{ Exception -> 0x0074 }
            io.grpc.j r7 = r4.f189039a     // Catch:{ Exception -> 0x0074 }
            io.grpc.di r8 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128123x.m209238d()     // Catch:{ Exception -> 0x0074 }
            io.grpc.i r4 = r4.f189040b     // Catch:{ Exception -> 0x0074 }
            io.grpc.m r4 = r7.mo39510a(r8, r4)     // Catch:{ Exception -> 0x0074 }
            com.google.common.util.concurrent.cx r4 = p5488io.grpc.p5533i.C70876o.m103760a(r4, r6)     // Catch:{ Exception -> 0x0074 }
            r10.f353835e = r11     // Catch:{ Exception -> 0x0074 }
            r10.f353831a = r1     // Catch:{ Exception -> 0x0074 }
            r10.f353832b = r3     // Catch:{ Exception -> 0x0074 }
            java.lang.Object r3 = kotlinx.coroutines.p5578d.C71663i.m104690c(r4, r10)     // Catch:{ Exception -> 0x0074 }
            if (r3 == r0) goto L_0x006b
            r9 = r3
            r3 = r11
            r11 = r9
        L_0x0063:
            java.lang.String r4 = "requireNotNull(voicePlat…\n                .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.j r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128109j) r11     // Catch:{ Exception -> 0x001b }
            goto L_0x0097
        L_0x006b:
            return r0
        L_0x006c:
            java.lang.String r3 = "Missing voicePlateClassicServiceFutureStub"
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0074 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0074 }
            throw r4     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            r3 = move-exception
            r9 = r3
            r3 = r11
            r11 = r9
        L_0x0078:
            com.google.common.f.e r4 = com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128735bq.f353881a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.x r11 = r4.mo56382g(r11)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.n r4 = new com.google.common.f.n
            r6 = 38001(0x9471, float:5.3251E-41)
            r4.<init>(r6)
            r11.mo56379ah(r4)
            java.lang.String r4 = "onboardingExperienceFlow fetching throw"
            r11.mo56386p(r4)
            r11 = r1
        L_0x0097:
            r10.f353835e = r5
            r10.f353831a = r5
            r10.f353832b = r2
            java.lang.Object r11 = r3.mo20883a(r11, r10)
            if (r11 != r0) goto L_0x00b0
        L_0x00a3:
            return r0
        L_0x00a4:
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.j r1 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128109j.f352484c
            r2 = 4
            r10.f353832b = r2
            java.lang.Object r11 = r11.mo20883a(r1, r10)
            if (r11 != r0) goto L_0x00b0
            return r0
        L_0x00b0:
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128716ay.mo5193b(java.lang.Object):java.lang.Object");
    }
}
