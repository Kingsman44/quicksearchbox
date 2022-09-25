package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9656b.C127883b;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127921c;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71029cb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.b.b.j */
/* compiled from: PG */
public final class C127898j {

    /* renamed from: a */
    private final C127892d f352044a;

    /* renamed from: b */
    private final C127921c f352045b;

    /* renamed from: c */
    private final C71029cb f352046c = C71029cb.ON_DEVICE_ASR;

    /* renamed from: d */
    private final C127883b f352047d;

    public C127898j(C71422aw awVar, C127883b bVar, C127892d dVar, C127921c cVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(cVar, "fcfLogger");
        this.f352047d = bVar;
        this.f352044a = dVar;
        this.f352045b = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108269a(java.lang.String r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b.C127896h
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.surfaces.voice.h.b.b.h r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b.C127896h) r0
            int r1 = r0.f352040d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f352040d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.h.b.b.h r0 = new com.google.android.apps.search.assistant.surfaces.voice.h.b.b.h
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f352038b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f352040d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r8 = r0.f352037a
            p5462h.C69714l.m101134b(r9)
            goto L_0x007a
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            java.lang.Object r8 = r0.f352037a
            p5462h.C69714l.m101134b(r9)
            goto L_0x005c
        L_0x003a:
            p5462h.C69714l.m101134b(r9)
            java.util.Set r9 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.C127901e.f352055a
            boolean r8 = r9.contains(r8)
            if (r8 != 0) goto L_0x004a
            com.google.android.apps.search.assistant.surfaces.voice.h.e.b r8 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127923b.ONLINE
            r9 = r8
            r8 = r7
            goto L_0x0080
        L_0x004a:
            com.google.android.apps.search.assistant.surfaces.voice.h.b.b.d r8 = r7.f352044a
            com.google.common.util.concurrent.cx r8 = r8.mo108264a()
            r0.f352037a = r7
            r0.f352040d = r4
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r9 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r8 = r7
        L_0x005c:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r9
            int r2 = r9.f352149a
            if (r2 != r4) goto L_0x007e
            java.lang.Object r9 = r9.f352150b
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x006d
            goto L_0x007e
        L_0x006d:
            r0.f352037a = r8
            r0.f352040d = r3
            r9 = r8
            com.google.android.apps.search.assistant.surfaces.voice.h.b.b.j r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b.C127898j) r9
            java.lang.Object r9 = r9.mo108270b(r0)
            if (r9 == r1) goto L_0x007d
        L_0x007a:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.b r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127923b) r9
            goto L_0x0080
        L_0x007d:
            return r1
        L_0x007e:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.b r9 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127923b.ONLINE
        L_0x0080:
            com.google.android.apps.search.assistant.surfaces.voice.h.b.b.j r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b.C127898j) r8
            com.google.android.apps.search.assistant.surfaces.voice.h.d.c r0 = r8.f352045b
            j.a.c.c.a.cb r8 = r8.f352046c
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r1 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i.f352147e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127927f) r1
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.apps.search.assistant.surfaces.voice.h.e.k r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.apps.search.assistant.surfaces.voice.h.e.d r4 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127925d.f352134b
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.h.e.c r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127924c) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r2)
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r2)
            java.lang.String r2 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r2)
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.search.assistant.surfaces.voice.h.e.d r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127925d) r5
            int r6 = r9.getNumber()
            r5.f352136a = r6
            com.google.protobuf.bv r4 = r4.build()
            java.lang.String r5 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.android.apps.search.assistant.surfaces.voice.h.e.d r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127925d) r4
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r2)
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r2 = r1.f352152a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r2
            r4.getClass()
            r2.f352150b = r4
            r2.f352149a = r3
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r1 = r1.mo108278a()
            r0.mo108274a(r8, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b.C127898j.mo108269a(java.lang.String, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108270b(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b.C127897i
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.voice.h.b.b.i r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b.C127897i) r0
            int r1 = r0.f352043c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f352043c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.h.b.b.i r0 = new com.google.android.apps.search.assistant.surfaces.voice.h.b.b.i
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f352041a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f352043c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x003e
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.assistant.surfaces.voice.h.a.b.b r5 = r4.f352047d
            r0.f352043c = r3
            java.lang.String r0 = "com.google.android.feature.PIXEL_2021_EXPERIENCE"
            java.lang.Object r5 = r5.mo108262a(r0)
            if (r5 == r1) goto L_0x0054
        L_0x003e:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r5
            int r0 = r5.f352149a
            if (r0 != r3) goto L_0x0051
            java.lang.Object r5 = r5.f352150b
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0051
            com.google.android.apps.search.assistant.surfaces.voice.h.e.b r5 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127923b.SODA
            goto L_0x0053
        L_0x0051:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.b r5 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127923b.ORCHESTRATION
        L_0x0053:
            return r5
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b.C127898j.mo108270b(h.c.g):java.lang.Object");
    }
}
