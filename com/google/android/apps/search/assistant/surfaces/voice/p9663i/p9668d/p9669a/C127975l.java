package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a;

import p3186j$.util.function.ToDoubleFunction;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.l */
/* compiled from: PG */
public final /* synthetic */ class C127975l implements ToDoubleFunction {

    /* renamed from: a */
    public static final /* synthetic */ C127975l f352230a = new C127975l();

    private /* synthetic */ C127975l() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (((double) java.lang.Math.abs(r3)) >= 2.5d) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double applyAsDouble(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r27
            com.google.android.apps.search.assistant.surfaces.voice.i.f.o r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128046o) r0
            r1 = 2
            com.google.android.apps.search.assistant.surfaces.voice.i.f.n[] r2 = new com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n[r1]
            com.google.android.apps.search.assistant.surfaces.voice.i.f.n r3 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n.GRAVITY
            r4 = 0
            r2[r4] = r3
            com.google.android.apps.search.assistant.surfaces.voice.i.f.n r3 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n.ACCELEROMETER
            r5 = 1
            r2[r5] = r3
            com.google.common.b.gu r2 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127960aj.m209086g(r0, r2)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0125
            java.lang.Object r2 = r2.get(r4)
            com.google.android.apps.search.assistant.surfaces.voice.i.f.m r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128044m) r2
            float[] r2 = r2.mo108321b()
            r3 = r2[r4]
            r5 = r2[r5]
            r1 = r2[r1]
            double r6 = (double) r3
            double r12 = (double) r5
            double r8 = java.lang.Math.hypot(r6, r12)
            double r1 = (double) r1
            double r20 = java.lang.Math.hypot(r12, r1)
            r10 = 4612811918334230528(0x4004000000000000, double:2.5)
            r22 = 4621256167635550208(0x4022000000000000, double:9.0)
            r24 = 0
            int r14 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r14 >= 0) goto L_0x004d
            float r14 = java.lang.Math.abs(r3)
            double r14 = (double) r14
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 >= 0) goto L_0x004d
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 > 0) goto L_0x0122
        L_0x004d:
            r14 = 4620693217682128896(0x4020000000000000, double:8.0)
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x0062
            float r14 = java.lang.Math.abs(r3)
            double r14 = (double) r14
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0062
            int r14 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r14 > 0) goto L_0x0122
        L_0x0062:
            r14 = -4602115869219225600(0xc022000000000000, double:-9.0)
            int r16 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x0074
            float r3 = java.lang.Math.abs(r3)
            r16 = r5
            double r4 = (double) r3
            int r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x0122
            goto L_0x0076
        L_0x0074:
            r16 = r5
        L_0x0076:
            int r3 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r3 <= 0) goto L_0x0091
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0084
            int r5 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r5 > 0) goto L_0x0122
        L_0x0084:
            int r5 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r5 >= 0) goto L_0x0091
            float r5 = java.lang.Math.abs(r16)
            double r10 = (double) r5
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0122
        L_0x0091:
            com.google.android.apps.search.assistant.surfaces.voice.i.f.n r3 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n.PROXIMITY
            j$.util.OptionalDouble r3 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127960aj.m209087h(r0, r3)
            com.google.android.apps.search.assistant.surfaces.voice.i.d.a.m r4 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127976m.f352231a
            r5 = 0
            boolean r4 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127960aj.m209088i(r3, r4, r5)
            if (r4 != 0) goto L_0x0122
            com.google.android.apps.search.assistant.surfaces.voice.i.f.n r4 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n.LIGHT
            j$.util.OptionalDouble r0 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127960aj.m209087h(r0, r4)
            com.google.android.apps.search.assistant.surfaces.voice.i.d.a.n r4 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127977n.f352232a
            boolean r4 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127960aj.m209088i(r0, r4, r5)
            if (r4 == 0) goto L_0x00b0
            goto L_0x0122
        L_0x00b0:
            r16 = 0
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = r8
            double r4 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127960aj.m209083d(r14, r16, r18)
            int r10 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r10 <= 0) goto L_0x00cd
            int r8 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r8 >= 0) goto L_0x00cd
            r8 = 0
            r10 = 4612811918334230528(0x4004000000000000, double:2.5)
            double r6 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127960aj.m209083d(r6, r8, r10)
            double r4 = java.lang.Math.max(r4, r6)
        L_0x00cd:
            r16 = 4621706527598287258(0x402399999999999a, double:9.8)
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r14 = r1
            double r6 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127960aj.m209083d(r14, r16, r18)
            int r8 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r8 <= 0) goto L_0x00fc
            r10 = 0
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r8 = r12
            r12 = r14
            double r8 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127960aj.m209083d(r8, r10, r12)
            r16 = 0
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = r1
            double r1 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127960aj.m209083d(r14, r16, r18)
            r10 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r1 = r1 * r10
            double r1 = java.lang.Math.max(r8, r1)
            goto L_0x00fe
        L_0x00fc:
            r1 = r24
        L_0x00fe:
            double r4 = r4 + r6
            double r4 = r4 + r1
            r1 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r4 = r4 / r1
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0110
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0110
            goto L_0x011d
        L_0x0110:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x011b
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r24 = r4 * r0
            goto L_0x011d
        L_0x011b:
            r24 = r4
        L_0x011d:
            double r24 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127960aj.m209084e(r24)
            goto L_0x0124
        L_0x0122:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0124:
            return r24
        L_0x0125:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127978o.f352233a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "InHandDanglingSG"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Insufficient data for detecting in-bag"
            r2 = 37750(0x9376, float:5.2899E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not enough data"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127975l.applyAsDouble(java.lang.Object):double");
    }
}
