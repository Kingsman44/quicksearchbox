package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9658a;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9656b.C127883b;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127921c;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71029cb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.b.a.c */
/* compiled from: PG */
public final class C127887c {

    /* renamed from: a */
    public final C71422aw f352002a;

    /* renamed from: b */
    public final C127921c f352003b;

    /* renamed from: c */
    public final C71029cb f352004c = C71029cb.MDA_MOTION_SIGNALS;

    /* renamed from: d */
    private final boolean f352005d;

    /* renamed from: e */
    private final C127883b f352006e;

    public C127887c(C71422aw awVar, C127883b bVar, C127921c cVar, boolean z) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(cVar, "fcfLogger");
        this.f352002a = awVar;
        this.f352006e = bVar;
        this.f352003b = cVar;
        this.f352005d = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108263a(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9658a.C127886b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.voice.h.b.a.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9658a.C127886b) r0
            int r1 = r0.f352001f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f352001f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.h.b.a.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.h.b.a.b
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f351999d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f352001f
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r5) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.f351997b
            java.lang.Object r0 = r0.f351996a
            com.google.android.apps.search.assistant.surfaces.voice.h.e.k r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127932k) r0
            p5462h.C69714l.m101134b(r10)
            goto L_0x009c
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003a:
            java.lang.Object r2 = r0.f351998c
            java.lang.Object r6 = r0.f351997b
            java.lang.Object r7 = r0.f351996a
            com.google.android.apps.search.assistant.surfaces.voice.h.b.a.c r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9658a.C127887c) r7
            p5462h.C69714l.m101134b(r10)
            goto L_0x0076
        L_0x0046:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r10 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i.f352147e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127927f) r10
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            com.google.android.apps.search.assistant.surfaces.voice.h.e.k r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            boolean r2 = r9.f352005d
            if (r2 != 0) goto L_0x0060
            r0 = r10
            goto L_0x00b4
        L_0x0060:
            com.google.android.apps.search.assistant.surfaces.voice.h.a.b.b r2 = r9.f352006e
            r0.f351996a = r9
            r0.f351997b = r10
            r0.f351998c = r10
            r0.f352001f = r5
            java.lang.String r6 = "com.google.android.feature.NEXT_GENERATION_ASSISTANT"
            java.lang.Object r2 = r2.mo108262a(r6)
            if (r2 == r1) goto L_0x00ce
            r7 = r9
            r6 = r10
            r10 = r2
            r2 = r6
        L_0x0076:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r10
            int r8 = r10.f352149a
            if (r8 != r5) goto L_0x00b2
            java.lang.Object r10 = r10.f352150b
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0087
            goto L_0x00b2
        L_0x0087:
            com.google.android.apps.search.assistant.surfaces.voice.h.a.b.b r10 = r7.f352006e
            r0.f351996a = r6
            r0.f351997b = r2
            r7 = 0
            r0.f351998c = r7
            r0.f352001f = r3
            java.lang.String r0 = "com.google.android.feature.PIXEL_TABLET_2023_EXPERIENCE"
            java.lang.Object r10 = r10.mo108262a(r0)
            if (r10 == r1) goto L_0x00b1
            r1 = r2
            r0 = r6
        L_0x009c:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r10
            int r2 = r10.f352149a
            if (r2 != r5) goto L_0x00ae
            java.lang.Object r10 = r10.f352150b
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00ae
            r10 = r1
            goto L_0x00b4
        L_0x00ae:
            r10 = r1
            r4 = 1
            goto L_0x00b4
        L_0x00b1:
            return r1
        L_0x00b2:
            r10 = r2
            r0 = r6
        L_0x00b4:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.k r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127932k) r10
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r10 = r10.f352152a
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r10
            r10.f352149a = r5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r10.f352150b = r1
            com.google.android.apps.search.assistant.surfaces.voice.h.e.k r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127932k) r0
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r10 = r0.mo108278a()
            return r10
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9658a.C127887c.mo108263a(h.c.g):java.lang.Object");
    }
}
