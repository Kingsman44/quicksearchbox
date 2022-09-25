package androidx.camera.camera2.p063b;

import androidx.camera.camera2.p063b.p064a.p067c.C1054l;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1357cq;

/* renamed from: androidx.camera.camera2.b.df */
/* compiled from: PG */
final class C1164df {

    /* renamed from: a */
    public C1314ba f3411a;

    /* renamed from: b */
    public final C1357cq f3412b;

    /* renamed from: c */
    public final C1163de f3413c = new C1163de();

    /* renamed from: d */
    private final C1054l f3414d;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b5, code lost:
        r14 = (android.util.Size) r0.get(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1164df(androidx.camera.camera2.p063b.p064a.C1068k r14, androidx.camera.camera2.p063b.C1153cv r15) {
        /*
            r13 = this;
            r13.<init>()
            androidx.camera.camera2.b.a.c.l r0 = new androidx.camera.camera2.b.a.c.l
            r0.<init>()
            r13.f3414d = r0
            androidx.camera.camera2.b.de r1 = new androidx.camera.camera2.b.de
            r1.<init>()
            r13.f3413c = r1
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture
            r2 = 0
            r1.<init>(r2)
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r14 = r14.mo3785a(r3)
            android.hardware.camera2.params.StreamConfigurationMap r14 = (android.hardware.camera2.params.StreamConfigurationMap) r14
            java.lang.String r3 = "MeteringRepeating"
            if (r14 != 0) goto L_0x002f
            java.lang.String r14 = "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP."
            androidx.camera.core.C1477bw.m3980c(r3, r14)
            android.util.Size r14 = new android.util.Size
            r14.<init>(r2, r2)
            goto L_0x00bb
        L_0x002f:
            r4 = 34
            android.util.Size[] r14 = r14.getOutputSizes(r4)
            if (r14 != 0) goto L_0x0043
            java.lang.String r14 = "Can not get output size list."
            androidx.camera.core.C1477bw.m3980c(r3, r14)
            android.util.Size r14 = new android.util.Size
            r14.<init>(r2, r2)
            goto L_0x00bb
        L_0x0043:
            androidx.camera.camera2.b.a.b.aa r0 = r0.f3187c
            if (r0 == 0) goto L_0x0070
            boolean r0 = androidx.camera.camera2.p063b.p064a.p066b.C1011aa.m3021a()
            if (r0 == 0) goto L_0x0070
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r4 = r14.length
            r5 = 0
        L_0x0054:
            if (r5 >= r4) goto L_0x0068
            r6 = r14[r5]
            java.util.Comparator r7 = androidx.camera.camera2.p063b.p064a.p067c.C1054l.f3186b
            android.util.Size r8 = androidx.camera.camera2.p063b.p064a.p067c.C1054l.f3185a
            int r7 = r7.compare(r6, r8)
            if (r7 < 0) goto L_0x0065
            r0.add(r6)
        L_0x0065:
            int r5 = r5 + 1
            goto L_0x0054
        L_0x0068:
            android.util.Size[] r14 = new android.util.Size[r2]
            java.lang.Object[] r14 = r0.toArray(r14)
            android.util.Size[] r14 = (android.util.Size[]) r14
        L_0x0070:
            java.util.List r0 = java.util.Arrays.asList(r14)
            androidx.camera.camera2.b.dc r4 = androidx.camera.camera2.p063b.C1161dc.f3407a
            java.util.Collections.sort(r0, r4)
            android.util.Size r15 = r15.mo3946b()
            int r4 = r15.getWidth()
            long r4 = (long) r4
            int r15 = r15.getHeight()
            long r6 = (long) r15
            long r4 = r4 * r6
            r6 = 307200(0x4b000, double:1.51777E-318)
            long r4 = java.lang.Math.min(r4, r6)
            int r15 = r14.length
            r6 = 0
            r7 = 0
        L_0x0093:
            if (r7 >= r15) goto L_0x00b5
            r8 = r14[r7]
            int r9 = r8.getWidth()
            long r9 = (long) r9
            int r11 = r8.getHeight()
            long r11 = (long) r11
            long r9 = r9 * r11
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 != 0) goto L_0x00a9
            r14 = r8
            goto L_0x00bb
        L_0x00a9:
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 <= 0) goto L_0x00b1
            if (r6 == 0) goto L_0x00b5
            r14 = r6
            goto L_0x00bb
        L_0x00b1:
            int r7 = r7 + 1
            r6 = r8
            goto L_0x0093
        L_0x00b5:
            java.lang.Object r14 = r0.get(r2)
            android.util.Size r14 = (android.util.Size) r14
        L_0x00bb:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "MeteringSession SurfaceTexture size: "
            r15.<init>(r0)
            r15.append(r14)
            java.lang.String r15 = java.lang.String.valueOf(r14)
            java.lang.String r15 = r0.concat(r15)
            androidx.camera.core.C1477bw.m3978a(r3, r15)
            int r15 = r14.getWidth()
            int r14 = r14.getHeight()
            r1.setDefaultBufferSize(r15, r14)
            android.view.Surface r14 = new android.view.Surface
            r14.<init>(r1)
            androidx.camera.camera2.b.de r15 = r13.f3413c
            androidx.camera.core.a.ck r15 = androidx.camera.core.p069a.C1351ck.m3687a(r15)
            androidx.camera.core.a.an r0 = r15.f3832b
            r2 = 1
            r0.f3742c = r2
            androidx.camera.core.a.bs r0 = new androidx.camera.core.a.bs
            r0.<init>(r14)
            r13.f3411a = r0
            com.google.common.util.concurrent.cx r0 = r0.f3777p
            com.google.common.util.concurrent.cx r0 = androidx.camera.core.p069a.p070a.p072b.C1263l.m3431c(r0)
            androidx.camera.camera2.b.dd r2 = new androidx.camera.camera2.b.dd
            r2.<init>(r14, r1)
            java.util.concurrent.Executor r14 = androidx.camera.core.p069a.p070a.p071a.C1238a.m3410a()
            androidx.camera.core.p069a.p070a.p072b.C1263l.m3436h(r0, r2, r14)
            androidx.camera.core.a.ba r14 = r13.f3411a
            r15.mo4232g(r14)
            androidx.camera.core.a.cq r14 = r15.mo4227b()
            r13.f3412b = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1164df.<init>(androidx.camera.camera2.b.a.k, androidx.camera.camera2.b.cv):void");
    }
}
