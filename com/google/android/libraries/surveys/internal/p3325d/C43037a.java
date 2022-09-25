package com.google.android.libraries.surveys.internal.p3325d;

import android.content.Context;
import com.google.p4281bu.p4282a.C56565cv;

/* renamed from: com.google.android.libraries.surveys.internal.d.a */
/* compiled from: PG */
public final class C43037a {

    /* renamed from: a */
    private final Context f112570a;

    /* renamed from: b */
    private final String f112571b;

    /* renamed from: c */
    private final C56565cv f112572c;

    public C43037a(Context context, String str, C56565cv cvVar) {
        this.f112570a = context;
        this.f112571b = str;
        this.f112572c = cvVar;
    }

    /* JADX WARNING: type inference failed for: r12v18, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46060a(com.google.android.libraries.surveys.internal.model.Answer r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = r11.f112634f
            java.lang.String r0 = com.google.common.base.C58837ba.m90858g(r0)
            com.google.android.libraries.surveys.internal.a.a r1 = com.google.android.libraries.surveys.internal.p3321a.C43033a.f112554a
            com.google.android.libraries.surveys.internal.d.a.g r1 = r1.f112556c
            android.content.Context r2 = r10.f112570a
            java.lang.String r3 = r10.f112571b
            java.lang.String r4 = r11.f112630b
            com.google.android.libraries.surveys.internal.d.b.e r0 = r1.mo46066a(r2, r3, r4, r0)
            com.google.bu.a.bh r1 = com.google.p4281bu.p4282a.C56524bh.f150947d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bu.a.ak r1 = (com.google.p4281bu.p4282a.C56500ak) r1
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r11.f112632d
            long r2 = r2 - r4
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r4.toSeconds(r2)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r8 = 1
            long r7 = r7.toMillis(r8)
            long r7 = r7 * r4
            long r2 = r2 - r7
            long r2 = r6.toNanos(r2)
            com.google.protobuf.ar r6 = com.google.protobuf.C62910ar.f169858c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.protobuf.aq r6 = (com.google.protobuf.C62909aq) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.protobuf.ar r7 = (com.google.protobuf.C62910ar) r7
            r7.f169860a = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.protobuf.ar r4 = (com.google.protobuf.C62910ar) r4
            int r3 = (int) r2
            r4.f169861b = r3
            com.google.protobuf.bv r2 = r6.build()
            com.google.protobuf.ar r2 = (com.google.protobuf.C62910ar) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.bu.a.bh r3 = (com.google.p4281bu.p4282a.C56524bh) r3
            r2.getClass()
            r3.f150951c = r2
            int r2 = r11.f112635g
            int r3 = r2 + -1
            r4 = 0
            if (r2 == 0) goto L_0x0189
            java.lang.String r2 = "SurveyAnswerTransmitter"
            r5 = 2
            r6 = 1
            if (r3 == r6) goto L_0x0119
            r7 = 3
            if (r3 == r5) goto L_0x00d3
            r12 = 4
            if (r3 == r7) goto L_0x00ab
            r4 = 5
            if (r3 == r12) goto L_0x0099
            if (r3 == r4) goto L_0x0086
            java.lang.String r12 = "Invalid survey answer type specified."
            android.util.Log.e(r2, r12)
            goto L_0x0129
        L_0x0086:
            com.google.bu.a.be r12 = com.google.p4281bu.p4282a.C56521be.f150943a
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.bu.a.bh r3 = (com.google.p4281bu.p4282a.C56524bh) r3
            r12.getClass()
            r3.f150950b = r12
            r12 = 6
            r3.f150949a = r12
            goto L_0x0129
        L_0x0099:
            com.google.bu.a.ba r12 = r11.f112629a
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.bu.a.bh r3 = (com.google.p4281bu.p4282a.C56524bh) r3
            r12.getClass()
            r3.f150950b = r12
            r3.f150949a = r4
            goto L_0x0129
        L_0x00ab:
            com.google.bu.a.am r3 = com.google.p4281bu.p4282a.C56502am.f150910b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.bu.a.al r3 = (com.google.p4281bu.p4282a.C56501al) r3
            boolean r4 = r11.f112633e
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.bu.a.am r5 = (com.google.p4281bu.p4282a.C56502am) r5
            r5.f150912a = r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.bu.a.am r3 = (com.google.p4281bu.p4282a.C56502am) r3
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.bu.a.bh r4 = (com.google.p4281bu.p4282a.C56524bh) r4
            r3.getClass()
            r4.f150950b = r3
            r4.f150949a = r12
            goto L_0x0129
        L_0x00d3:
            com.google.bu.a.bc r3 = com.google.p4281bu.p4282a.C56519bc.f150939c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.bu.a.bb r3 = (com.google.p4281bu.p4282a.C56518bb) r3
            com.google.bu.a.bx r5 = r11.f112631c
            if (r5 == 0) goto L_0x0104
            if (r12 == 0) goto L_0x00e2
            goto L_0x00f8
        L_0x00e2:
            com.google.protobuf.bn r12 = r5.toBuilder()
            com.google.bu.a.bs r12 = (com.google.p4281bu.p4282a.C56535bs) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.bu.a.bx r5 = (com.google.p4281bu.p4282a.C56540bx) r5
            r5.f150985a = r4
            com.google.protobuf.bv r12 = r12.build()
            r5 = r12
            com.google.bu.a.bx r5 = (com.google.p4281bu.p4282a.C56540bx) r5
        L_0x00f8:
            r3.copyOnWrite()
            com.google.protobuf.bv r12 = r3.instance
            com.google.bu.a.bc r12 = (com.google.p4281bu.p4282a.C56519bc) r12
            r5.getClass()
            r12.f150941a = r5
        L_0x0104:
            com.google.protobuf.bv r12 = r3.build()
            com.google.bu.a.bc r12 = (com.google.p4281bu.p4282a.C56519bc) r12
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.bu.a.bh r3 = (com.google.p4281bu.p4282a.C56524bh) r3
            r12.getClass()
            r3.f150950b = r12
            r3.f150949a = r7
            goto L_0x0129
        L_0x0119:
            com.google.bu.a.bg r12 = com.google.p4281bu.p4282a.C56523bg.f150945a
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.bu.a.bh r3 = (com.google.p4281bu.p4282a.C56524bh) r3
            r12.getClass()
            r3.f150950b = r12
            r3.f150949a = r5
        L_0x0129:
            com.google.bu.a.cv r12 = r10.f112572c
            boolean r12 = com.google.android.libraries.surveys.internal.p3328e.C43066o.m75996q(r12)
            if (r12 == 0) goto L_0x017d
            com.google.bu.a.b r12 = com.google.p4281bu.p4282a.C56516b.f150930c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.bu.a.a r12 = (com.google.p4281bu.p4282a.C56489a) r12
            com.google.bu.a.cv r2 = r10.f112572c
            r12.copyOnWrite()
            com.google.protobuf.bv r3 = r12.instance
            com.google.bu.a.b r3 = (com.google.p4281bu.p4282a.C56516b) r3
            r2.getClass()
            r3.f150933b = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.bu.a.bh r1 = (com.google.p4281bu.p4282a.C56524bh) r1
            r12.copyOnWrite()
            com.google.protobuf.bv r2 = r12.instance
            com.google.bu.a.b r2 = (com.google.p4281bu.p4282a.C56516b) r2
            r1.getClass()
            r2.f150932a = r1
            com.google.protobuf.bv r12 = r12.build()
            com.google.bu.a.b r12 = (com.google.p4281bu.p4282a.C56516b) r12
            com.google.android.libraries.surveys.internal.e.i r1 = new com.google.android.libraries.surveys.internal.e.i
            r1.<init>()
            if (r12 != 0) goto L_0x016e
            java.lang.String r12 = "NetworkCallerGrpc"
            java.lang.String r0 = "Survey record event request was null"
            android.util.Log.e(r12, r0)
            goto L_0x0182
        L_0x016e:
            java.util.concurrent.Executor r2 = com.google.android.libraries.surveys.internal.p3325d.C43051c.m75956a()
            com.google.android.libraries.surveys.internal.d.a.a r3 = new com.google.android.libraries.surveys.internal.d.a.a
            com.google.android.libraries.surveys.internal.d.a.f r0 = (com.google.android.libraries.surveys.internal.p3325d.p3326a.C43043f) r0
            r3.<init>(r0, r12, r1)
            r2.execute(r3)
            goto L_0x0182
        L_0x017d:
            java.lang.String r12 = "Session is invalid, dropping event."
            android.util.Log.e(r2, r12)
        L_0x0182:
            com.google.bu.a.ba r12 = com.google.p4281bu.p4282a.C56517ba.f150934d
            r11.f112629a = r12
            r11.f112635g = r6
            return
        L_0x0189:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.surveys.internal.p3325d.C43037a.mo46060a(com.google.android.libraries.surveys.internal.model.Answer, boolean):void");
    }
}
