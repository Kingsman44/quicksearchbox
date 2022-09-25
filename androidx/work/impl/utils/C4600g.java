package androidx.work.impl.utils;

import androidx.work.C4380ad;
import androidx.work.impl.C4558n;
import androidx.work.impl.C4626x;

/* renamed from: androidx.work.impl.utils.g */
/* compiled from: PG */
public final class C4600g implements Runnable {

    /* renamed from: b */
    private static final String f14495b = C4380ad.m12561i("EnqueueRunnable");

    /* renamed from: a */
    public final C4558n f14496a;

    /* renamed from: c */
    private final C4626x f14497c;

    public C4600g(C4626x xVar, C4558n nVar) {
        this.f14497c = xVar;
        this.f14496a = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0239 A[Catch:{ all -> 0x025a, all -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a0 A[Catch:{ all -> 0x025a, all -> 0x025f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            androidx.work.impl.x r0 = r1.f14497c     // Catch:{ all -> 0x025f }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x025f }
            r2.<init>()     // Catch:{ all -> 0x025f }
            java.util.List r3 = r0.f14536d     // Catch:{ all -> 0x025f }
            r2.addAll(r3)     // Catch:{ all -> 0x025f }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x025f }
            r3.<init>()     // Catch:{ all -> 0x025f }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x025f }
        L_0x0017:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x025f }
            if (r5 == 0) goto L_0x0048
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x025f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x025f }
            boolean r5 = r3.contains(r5)     // Catch:{ all -> 0x025f }
            if (r5 != 0) goto L_0x002a
            goto L_0x0017
        L_0x002a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x025f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x025f }
            r2.<init>()     // Catch:{ all -> 0x025f }
            java.lang.String r3 = "WorkContinuation has cycles ("
            r2.append(r3)     // Catch:{ all -> 0x025f }
            androidx.work.impl.x r3 = r1.f14497c     // Catch:{ all -> 0x025f }
            r2.append(r3)     // Catch:{ all -> 0x025f }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x025f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x025f }
            r0.<init>(r2)     // Catch:{ all -> 0x025f }
            throw r0     // Catch:{ all -> 0x025f }
        L_0x0048:
            java.util.List r0 = r0.f14536d     // Catch:{ all -> 0x025f }
            r2.removeAll(r0)     // Catch:{ all -> 0x025f }
            androidx.work.impl.x r0 = r1.f14497c     // Catch:{ all -> 0x025f }
            androidx.work.impl.ag r0 = r0.f14533a     // Catch:{ all -> 0x025f }
            androidx.work.impl.WorkDatabase r2 = r0.f14143e     // Catch:{ all -> 0x025f }
            r2.mo8181p()     // Catch:{ all -> 0x025f }
            androidx.work.impl.x r0 = r1.f14497c     // Catch:{ all -> 0x025a }
            java.util.Set r3 = androidx.work.impl.C4626x.m13021b()     // Catch:{ all -> 0x025a }
            androidx.work.impl.ag r4 = r0.f14533a     // Catch:{ all -> 0x025a }
            java.util.List r5 = r0.f14535c     // Catch:{ all -> 0x025a }
            r6 = 0
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x025a }
            java.lang.Object[] r3 = r3.toArray(r7)     // Catch:{ all -> 0x025a }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x025a }
            java.lang.String r7 = r0.f14534b     // Catch:{ all -> 0x025a }
            int r8 = r0.f14538f     // Catch:{ all -> 0x025a }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x025a }
            androidx.work.impl.WorkDatabase r11 = r4.f14143e     // Catch:{ all -> 0x025a }
            if (r3 == 0) goto L_0x007a
            int r13 = r3.length     // Catch:{ all -> 0x025a }
            if (r13 <= 0) goto L_0x007a
            r13 = 1
            goto L_0x007b
        L_0x007a:
            r13 = 0
        L_0x007b:
            if (r13 == 0) goto L_0x00d2
            int r14 = r3.length     // Catch:{ all -> 0x025a }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 1
        L_0x0085:
            if (r15 >= r14) goto L_0x00d8
            r6 = r3[r15]     // Catch:{ all -> 0x025a }
            androidx.work.impl.b.af r12 = r11.mo9364F()     // Catch:{ all -> 0x025a }
            androidx.work.impl.b.ae r12 = r12.mo9422b(r6)     // Catch:{ all -> 0x025a }
            if (r12 != 0) goto L_0x00b6
            androidx.work.ad r3 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x025a }
            java.lang.String r4 = f14495b     // Catch:{ all -> 0x025a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r5.<init>()     // Catch:{ all -> 0x025a }
            java.lang.String r7 = "Prerequisite "
            r5.append(r7)     // Catch:{ all -> 0x025a }
            r5.append(r6)     // Catch:{ all -> 0x025a }
            java.lang.String r6 = " doesn't exist; not enqueuing"
            r5.append(r6)     // Catch:{ all -> 0x025a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x025a }
            r3.mo9311c(r4, r5)     // Catch:{ all -> 0x025a }
        L_0x00b2:
            r3 = 1
            r6 = 0
            goto L_0x022f
        L_0x00b6:
            androidx.work.ar r6 = r12.f14218c     // Catch:{ all -> 0x025a }
            androidx.work.ar r12 = androidx.work.C4394ar.SUCCEEDED     // Catch:{ all -> 0x025a }
            if (r6 != r12) goto L_0x00be
            r12 = 1
            goto L_0x00bf
        L_0x00be:
            r12 = 0
        L_0x00bf:
            r18 = r18 & r12
            androidx.work.ar r12 = androidx.work.C4394ar.FAILED     // Catch:{ all -> 0x025a }
            if (r6 != r12) goto L_0x00c8
            r16 = 1
            goto L_0x00ce
        L_0x00c8:
            androidx.work.ar r12 = androidx.work.C4394ar.CANCELLED     // Catch:{ all -> 0x025a }
            if (r6 != r12) goto L_0x00ce
            r17 = 1
        L_0x00ce:
            int r15 = r15 + 1
            r6 = 0
            goto L_0x0085
        L_0x00d2:
            r16 = 0
            r17 = 0
            r18 = 1
        L_0x00d8:
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x025a }
            r12 = 1
            r6 = r6 ^ r12
            if (r6 == 0) goto L_0x0195
            if (r13 != 0) goto L_0x0195
            androidx.work.impl.b.af r12 = r11.mo9364F()     // Catch:{ all -> 0x025a }
            java.util.List r12 = r12.mo9430j(r7)     // Catch:{ all -> 0x025a }
            boolean r14 = r12.isEmpty()     // Catch:{ all -> 0x025a }
            if (r14 != 0) goto L_0x0195
            r14 = 3
            if (r8 == r14) goto L_0x013d
            r14 = 2
            if (r8 != r14) goto L_0x0118
            java.util.Iterator r8 = r12.iterator()     // Catch:{ all -> 0x025a }
        L_0x00fa:
            boolean r14 = r8.hasNext()     // Catch:{ all -> 0x025a }
            if (r14 == 0) goto L_0x0118
            java.lang.Object r14 = r8.next()     // Catch:{ all -> 0x025a }
            androidx.work.impl.b.ac r14 = (androidx.work.impl.p207b.C4468ac) r14     // Catch:{ all -> 0x025a }
            androidx.work.ar r15 = r14.f14208b     // Catch:{ all -> 0x025a }
            r20 = r8
            androidx.work.ar r8 = androidx.work.C4394ar.ENQUEUED     // Catch:{ all -> 0x025a }
            if (r15 == r8) goto L_0x00b2
            androidx.work.ar r8 = r14.f14208b     // Catch:{ all -> 0x025a }
            androidx.work.ar r14 = androidx.work.C4394ar.RUNNING     // Catch:{ all -> 0x025a }
            if (r8 != r14) goto L_0x0115
            goto L_0x00b2
        L_0x0115:
            r8 = r20
            goto L_0x00fa
        L_0x0118:
            androidx.work.impl.utils.d r8 = new androidx.work.impl.utils.d     // Catch:{ all -> 0x025a }
            r14 = 0
            r8.<init>(r4, r7, r14)     // Catch:{ all -> 0x025a }
            r8.run()     // Catch:{ all -> 0x025a }
            androidx.work.impl.b.af r8 = r11.mo9364F()     // Catch:{ all -> 0x025a }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x025a }
        L_0x0129:
            boolean r15 = r12.hasNext()     // Catch:{ all -> 0x025a }
            if (r15 == 0) goto L_0x013b
            java.lang.Object r15 = r12.next()     // Catch:{ all -> 0x025a }
            androidx.work.impl.b.ac r15 = (androidx.work.impl.p207b.C4468ac) r15     // Catch:{ all -> 0x025a }
            java.lang.String r15 = r15.f14207a     // Catch:{ all -> 0x025a }
            r8.mo9432l(r15)     // Catch:{ all -> 0x025a }
            goto L_0x0129
        L_0x013b:
            r8 = 1
            goto L_0x0196
        L_0x013d:
            r14 = 0
            androidx.work.impl.b.b r8 = r11.mo9366z()     // Catch:{ all -> 0x025a }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x025a }
            r13.<init>()     // Catch:{ all -> 0x025a }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x025a }
        L_0x014b:
            boolean r15 = r12.hasNext()     // Catch:{ all -> 0x025a }
            if (r15 == 0) goto L_0x0189
            java.lang.Object r15 = r12.next()     // Catch:{ all -> 0x025a }
            androidx.work.impl.b.ac r15 = (androidx.work.impl.p207b.C4468ac) r15     // Catch:{ all -> 0x025a }
            java.lang.String r14 = r15.f14207a     // Catch:{ all -> 0x025a }
            boolean r14 = r8.mo9452d(r14)     // Catch:{ all -> 0x025a }
            if (r14 != 0) goto L_0x0183
            androidx.work.ar r14 = r15.f14208b     // Catch:{ all -> 0x025a }
            r20 = r8
            androidx.work.ar r8 = androidx.work.C4394ar.SUCCEEDED     // Catch:{ all -> 0x025a }
            if (r14 != r8) goto L_0x0169
            r8 = 1
            goto L_0x016a
        L_0x0169:
            r8 = 0
        L_0x016a:
            r8 = r18 & r8
            androidx.work.ar r14 = r15.f14208b     // Catch:{ all -> 0x025a }
            r18 = r8
            androidx.work.ar r8 = androidx.work.C4394ar.FAILED     // Catch:{ all -> 0x025a }
            if (r14 != r8) goto L_0x0177
            r16 = 1
            goto L_0x017d
        L_0x0177:
            androidx.work.ar r8 = androidx.work.C4394ar.CANCELLED     // Catch:{ all -> 0x025a }
            if (r14 != r8) goto L_0x017d
            r17 = 1
        L_0x017d:
            java.lang.String r8 = r15.f14207a     // Catch:{ all -> 0x025a }
            r13.add(r8)     // Catch:{ all -> 0x025a }
            goto L_0x0185
        L_0x0183:
            r20 = r8
        L_0x0185:
            r8 = r20
            r14 = 0
            goto L_0x014b
        L_0x0189:
            java.lang.Object[] r3 = r13.toArray(r3)     // Catch:{ all -> 0x025a }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x025a }
            int r8 = r3.length     // Catch:{ all -> 0x025a }
            if (r8 <= 0) goto L_0x0194
            r13 = 1
            goto L_0x0195
        L_0x0194:
            r13 = 0
        L_0x0195:
            r8 = 0
        L_0x0196:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x025a }
        L_0x019a:
            boolean r12 = r5.hasNext()     // Catch:{ all -> 0x025a }
            if (r12 == 0) goto L_0x022d
            java.lang.Object r12 = r5.next()     // Catch:{ all -> 0x025a }
            androidx.work.ax r12 = (androidx.work.C4400ax) r12     // Catch:{ all -> 0x025a }
            androidx.work.impl.b.ae r14 = r12.f14046b     // Catch:{ all -> 0x025a }
            if (r13 == 0) goto L_0x01bf
            if (r18 != 0) goto L_0x01bf
            if (r16 == 0) goto L_0x01b3
            androidx.work.ar r15 = androidx.work.C4394ar.FAILED     // Catch:{ all -> 0x025a }
            r14.f14218c = r15     // Catch:{ all -> 0x025a }
            goto L_0x01c1
        L_0x01b3:
            if (r17 == 0) goto L_0x01ba
            androidx.work.ar r15 = androidx.work.C4394ar.CANCELLED     // Catch:{ all -> 0x025a }
            r14.f14218c = r15     // Catch:{ all -> 0x025a }
            goto L_0x01c1
        L_0x01ba:
            androidx.work.ar r15 = androidx.work.C4394ar.BLOCKED     // Catch:{ all -> 0x025a }
            r14.f14218c = r15     // Catch:{ all -> 0x025a }
            goto L_0x01c1
        L_0x01bf:
            r14.f14230o = r9     // Catch:{ all -> 0x025a }
        L_0x01c1:
            androidx.work.ar r15 = r14.f14218c     // Catch:{ all -> 0x025a }
            r20 = r5
            androidx.work.ar r5 = androidx.work.C4394ar.ENQUEUED     // Catch:{ all -> 0x025a }
            if (r15 != r5) goto L_0x01cd
            r5 = 1
            r19 = 0
            goto L_0x01d0
        L_0x01cd:
            r5 = 1
            r19 = 1
        L_0x01d0:
            r15 = r19 ^ 1
            r8 = r8 | r15
            androidx.work.impl.b.af r5 = r11.mo9364F()     // Catch:{ all -> 0x025a }
            java.util.List r15 = r4.f14144f     // Catch:{ all -> 0x025a }
            androidx.work.impl.utils.C4601h.m12996a(r15, r14)     // Catch:{ all -> 0x025a }
            r5.mo9434n(r14)     // Catch:{ all -> 0x025a }
            if (r13 == 0) goto L_0x0202
            int r5 = r3.length     // Catch:{ all -> 0x025a }
            r14 = 0
        L_0x01e3:
            if (r14 >= r5) goto L_0x0202
            r15 = r3[r14]     // Catch:{ all -> 0x025a }
            r21 = r3
            androidx.work.impl.b.a r3 = new androidx.work.impl.b.a     // Catch:{ all -> 0x025a }
            r22 = r4
            java.lang.String r4 = r12.mo9342a()     // Catch:{ all -> 0x025a }
            r3.<init>(r4, r15)     // Catch:{ all -> 0x025a }
            androidx.work.impl.b.b r4 = r11.mo9366z()     // Catch:{ all -> 0x025a }
            r4.mo9450b(r3)     // Catch:{ all -> 0x025a }
            int r14 = r14 + 1
            r3 = r21
            r4 = r22
            goto L_0x01e3
        L_0x0202:
            r21 = r3
            r22 = r4
            androidx.work.impl.b.aw r3 = r11.mo9365G()     // Catch:{ all -> 0x025a }
            java.lang.String r4 = r12.mo9342a()     // Catch:{ all -> 0x025a }
            java.util.Set r5 = r12.f14047c     // Catch:{ all -> 0x025a }
            r3.mo9448c(r4, r5)     // Catch:{ all -> 0x025a }
            if (r6 == 0) goto L_0x0225
            androidx.work.impl.b.t r3 = r11.mo9362D()     // Catch:{ all -> 0x025a }
            androidx.work.impl.b.s r4 = new androidx.work.impl.b.s     // Catch:{ all -> 0x025a }
            java.lang.String r5 = r12.mo9342a()     // Catch:{ all -> 0x025a }
            r4.<init>(r7, r5)     // Catch:{ all -> 0x025a }
            r3.mo9471b(r4)     // Catch:{ all -> 0x025a }
        L_0x0225:
            r5 = r20
            r3 = r21
            r4 = r22
            goto L_0x019a
        L_0x022d:
            r6 = r8
            r3 = 1
        L_0x022f:
            r0.f14537e = r3     // Catch:{ all -> 0x025a }
            r2.mo8188w()     // Catch:{ all -> 0x025a }
            r2.mo8183r()     // Catch:{ all -> 0x025f }
            if (r6 == 0) goto L_0x0252
            androidx.work.impl.x r0 = r1.f14497c     // Catch:{ all -> 0x025f }
            androidx.work.impl.ag r0 = r0.f14533a     // Catch:{ all -> 0x025f }
            android.content.Context r0 = r0.f14141c     // Catch:{ all -> 0x025f }
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r2 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            r3 = 1
            androidx.work.impl.utils.C4609p.m13004a(r0, r2, r3)     // Catch:{ all -> 0x025f }
            androidx.work.impl.x r0 = r1.f14497c     // Catch:{ all -> 0x025f }
            androidx.work.impl.ag r0 = r0.f14533a     // Catch:{ all -> 0x025f }
            androidx.work.e r2 = r0.f14142d     // Catch:{ all -> 0x025f }
            androidx.work.impl.WorkDatabase r3 = r0.f14143e     // Catch:{ all -> 0x025f }
            java.util.List r0 = r0.f14144f     // Catch:{ all -> 0x025f }
            androidx.work.impl.C4565u.m12952b(r2, r3, r0)     // Catch:{ all -> 0x025f }
        L_0x0252:
            androidx.work.impl.n r0 = r1.f14496a     // Catch:{ all -> 0x025f }
            androidx.work.aj r2 = androidx.work.C4388al.f14014a     // Catch:{ all -> 0x025f }
            r0.mo9510b(r2)     // Catch:{ all -> 0x025f }
            return
        L_0x025a:
            r0 = move-exception
            r2.mo8183r()     // Catch:{ all -> 0x025f }
            throw r0     // Catch:{ all -> 0x025f }
        L_0x025f:
            r0 = move-exception
            androidx.work.impl.n r2 = r1.f14496a
            androidx.work.ah r3 = new androidx.work.ah
            r3.<init>(r0)
            r2.mo9510b(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.C4600g.run():void");
    }
}
