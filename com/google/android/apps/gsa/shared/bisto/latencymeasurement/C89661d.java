package com.google.android.apps.gsa.shared.bisto.latencymeasurement;

import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.shared.bisto.latencymeasurement.d */
/* compiled from: PG */
public final /* synthetic */ class C89661d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C89665h f242770a;

    public /* synthetic */ C89661d(C89665h hVar) {
        this.f242770a = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r8 = r8.f143283b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.apps.gsa.shared.bisto.latencymeasurement.h r0 = r7.f242770a
            com.google.audio.a.a r8 = (com.google.audio.p4106a.C54571a) r8
            if (r8 == 0) goto L_0x003b
            byte[] r8 = r8.f143283b
            int r1 = r8.length
            if (r1 != 0) goto L_0x000c
            goto L_0x003b
        L_0x000c:
            int r1 = r1 >> 1
            float[] r1 = new float[r1]
            r2 = 0
            r3 = 0
        L_0x0012:
            int r4 = r8.length
            if (r3 >= r4) goto L_0x0034
            int r4 = r3 + 2
            byte[] r5 = java.util.Arrays.copyOfRange(r8, r3, r4)
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r3 = r3 / 2
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            java.nio.ByteBuffer r5 = r5.order(r6)
            short r5 = r5.getShort(r2)
            float r5 = (float) r5
            r6 = 1191181824(0x46fffe00, float:32767.0)
            float r5 = r5 / r6
            r1[r3] = r5
            r3 = r4
            goto L_0x0012
        L_0x0034:
            r0.f242780g = r1
            com.google.common.util.concurrent.cx r8 = r0.mo83563a()
            goto L_0x0046
        L_0x003b:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r0 = "Invalid wavFile"
            r8.<init>(r0)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92899h(r8)
        L_0x0046:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89661d.mo17879a(java.lang.Object):java.lang.Object");
    }
}
