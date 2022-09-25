package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.p5473f.p5475b.C69646ac;
import p5462h.p5473f.p5475b.C69647ad;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.ai */
/* compiled from: PG */
final class C126381ai implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C69647ad f348093a;

    /* renamed from: b */
    final /* synthetic */ C69647ad f348094b;

    /* renamed from: c */
    final /* synthetic */ C69646ac f348095c;

    /* renamed from: d */
    final /* synthetic */ int f348096d = 320;

    /* renamed from: e */
    final /* synthetic */ C71588o f348097e;

    /* renamed from: f */
    final /* synthetic */ C126379ag f348098f;

    public C126381ai(C126379ag agVar, C69647ad adVar, C69647ad adVar2, C69646ac acVar, C71588o oVar) {
        this.f348098f = agVar;
        this.f348093a = adVar;
        this.f348094b = adVar2;
        this.f348095c = acVar;
        this.f348097e = oVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2 A[SYNTHETIC] */
    /* renamed from: b */
    public final java.lang.Object mo20883a(com.google.protobuf.C63088z r13, p5462h.p5466c.C69577g r14) {
        /*
            r12 = this;
            java.lang.String r0 = "buffer"
            boolean r1 = r14 instanceof com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126380ah
            if (r1 == 0) goto L_0x0015
            r1 = r14
            com.google.android.apps.search.assistant.surfaces.e.a.ah r1 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126380ah) r1
            int r2 = r1.f348092e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f348092e = r2
            goto L_0x001a
        L_0x0015:
            com.google.android.apps.search.assistant.surfaces.e.a.ah r1 = new com.google.android.apps.search.assistant.surfaces.e.a.ah
            r1.<init>(r12, r14)
        L_0x001a:
            java.lang.Object r14 = r1.f348090c
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r1.f348092e
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r13 = r1.f348089b
            java.lang.Object r3 = r1.f348088a
            p5462h.C69714l.m101134b(r14)     // Catch:{ BufferUnderflowException -> 0x002e }
            goto L_0x00bf
        L_0x002e:
            r13 = move-exception
            goto L_0x00da
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0039:
            p5462h.C69714l.m101134b(r14)
            java.nio.ByteBuffer r13 = r13.mo59043o()
            java.nio.ByteOrder r14 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r13 = r13.order(r14)
            r3 = r12
        L_0x0049:
            r14 = r13
            java.nio.ByteBuffer r14 = (java.nio.ByteBuffer) r14
            boolean r14 = r14.hasRemaining()
            if (r14 == 0) goto L_0x00e2
            r14 = r3
            com.google.android.apps.search.assistant.surfaces.e.a.ai r14 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126381ai) r14     // Catch:{ BufferUnderflowException -> 0x002e }
            com.google.android.apps.search.assistant.surfaces.e.a.ag r14 = r14.f348098f     // Catch:{ BufferUnderflowException -> 0x002e }
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r0)     // Catch:{ BufferUnderflowException -> 0x002e }
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r0)     // Catch:{ BufferUnderflowException -> 0x002e }
            r14 = r13
            java.nio.ByteBuffer r14 = (java.nio.ByteBuffer) r14     // Catch:{ BufferUnderflowException -> 0x002e }
            short r14 = r14.getShort()     // Catch:{ BufferUnderflowException -> 0x002e }
            r5 = r3
            com.google.android.apps.search.assistant.surfaces.e.a.ai r5 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126381ai) r5     // Catch:{ BufferUnderflowException -> 0x002e }
            h.f.b.ad r5 = r5.f348093a     // Catch:{ BufferUnderflowException -> 0x002e }
            long r6 = r5.f186026a     // Catch:{ BufferUnderflowException -> 0x002e }
            long r8 = (long) r14     // Catch:{ BufferUnderflowException -> 0x002e }
            long r6 = r6 + r8
            r5.f186026a = r6     // Catch:{ BufferUnderflowException -> 0x002e }
            r14 = r3
            com.google.android.apps.search.assistant.surfaces.e.a.ai r14 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126381ai) r14     // Catch:{ BufferUnderflowException -> 0x002e }
            h.f.b.ad r14 = r14.f348094b     // Catch:{ BufferUnderflowException -> 0x002e }
            long r6 = r14.f186026a     // Catch:{ BufferUnderflowException -> 0x002e }
            java.lang.Long.signum(r8)
            long r8 = r8 * r8
            long r6 = r6 + r8
            r14.f186026a = r6     // Catch:{ BufferUnderflowException -> 0x002e }
            r14 = r3
            com.google.android.apps.search.assistant.surfaces.e.a.ai r14 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126381ai) r14     // Catch:{ BufferUnderflowException -> 0x002e }
            h.f.b.ac r14 = r14.f348095c     // Catch:{ BufferUnderflowException -> 0x002e }
            int r8 = r14.f186025a     // Catch:{ BufferUnderflowException -> 0x002e }
            int r8 = r8 + r4
            r14.f186025a = r8     // Catch:{ BufferUnderflowException -> 0x002e }
            r14 = r3
            com.google.android.apps.search.assistant.surfaces.e.a.ai r14 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126381ai) r14     // Catch:{ BufferUnderflowException -> 0x002e }
            int r14 = r14.f348096d     // Catch:{ BufferUnderflowException -> 0x002e }
            r14 = 320(0x140, float:4.48E-43)
            if (r8 != r14) goto L_0x0049
            r14 = r3
            com.google.android.apps.search.assistant.surfaces.e.a.ai r14 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126381ai) r14     // Catch:{ BufferUnderflowException -> 0x002e }
            kotlinx.coroutines.b.o r14 = r14.f348097e     // Catch:{ BufferUnderflowException -> 0x002e }
            long r8 = r5.f186026a     // Catch:{ BufferUnderflowException -> 0x002e }
            double r5 = (double) r6
            r10 = 4644337115725824000(0x4074000000000000, double:320.0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r10
            long r8 = r8 * r8
            double r7 = (double) r8
            java.lang.Double.isNaN(r7)
            double r5 = r5 - r7
            r7 = 4681773287628341248(0x40f9000000000000, double:102400.0)
            double r5 = r5 / r7
            double r5 = java.lang.Math.sqrt(r5)     // Catch:{ BufferUnderflowException -> 0x002e }
            com.google.android.apps.search.assistant.surfaces.e.a.af r7 = new com.google.android.apps.search.assistant.surfaces.e.a.af     // Catch:{ BufferUnderflowException -> 0x002e }
            r7.<init>(r5)     // Catch:{ BufferUnderflowException -> 0x002e }
            r1.f348088a = r3     // Catch:{ BufferUnderflowException -> 0x002e }
            r1.f348089b = r13     // Catch:{ BufferUnderflowException -> 0x002e }
            r1.f348092e = r4     // Catch:{ BufferUnderflowException -> 0x002e }
            java.lang.Object r14 = r14.mo20883a(r7, r1)     // Catch:{ BufferUnderflowException -> 0x002e }
            if (r14 == r2) goto L_0x00d9
        L_0x00bf:
            r14 = r3
            com.google.android.apps.search.assistant.surfaces.e.a.ai r14 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126381ai) r14     // Catch:{ BufferUnderflowException -> 0x002e }
            h.f.b.ad r14 = r14.f348093a     // Catch:{ BufferUnderflowException -> 0x002e }
            r5 = 0
            r14.f186026a = r5     // Catch:{ BufferUnderflowException -> 0x002e }
            r14 = r3
            com.google.android.apps.search.assistant.surfaces.e.a.ai r14 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126381ai) r14     // Catch:{ BufferUnderflowException -> 0x002e }
            h.f.b.ad r14 = r14.f348094b     // Catch:{ BufferUnderflowException -> 0x002e }
            r14.f186026a = r5     // Catch:{ BufferUnderflowException -> 0x002e }
            r14 = r3
            com.google.android.apps.search.assistant.surfaces.e.a.ai r14 = (com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126381ai) r14     // Catch:{ BufferUnderflowException -> 0x002e }
            h.f.b.ac r14 = r14.f348095c     // Catch:{ BufferUnderflowException -> 0x002e }
            r5 = 0
            r14.f186025a = r5     // Catch:{ BufferUnderflowException -> 0x002e }
            goto L_0x0049
        L_0x00d9:
            return r2
        L_0x00da:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid Audio Data."
            r14.<init>(r0, r13)
            throw r14
        L_0x00e2:
            h.q r13 = p5462h.C69788q.f186170a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.p9486a.C126381ai.mo20883a(com.google.protobuf.z, h.c.g):java.lang.Object");
    }
}
