package androidx.camera.core.p073b;

import android.graphics.Matrix;
import androidx.camera.camera2.p063b.C1131c;
import androidx.camera.core.C1472br;
import androidx.camera.core.p069a.C1364cx;

/* renamed from: androidx.camera.core.b.c */
/* compiled from: PG */
public final class C1440c implements C1472br {

    /* renamed from: a */
    public final C1131c f3996a;

    public C1440c(C1131c cVar) {
        this.f3996a = cVar;
    }

    /* renamed from: a */
    public final int mo4330a() {
        return 0;
    }

    /* renamed from: b */
    public final long mo4331b() {
        return this.f3996a.mo3892a();
    }

    /* renamed from: c */
    public final Matrix mo4332c() {
        return new Matrix();
    }

    /* renamed from: d */
    public final C1364cx mo4333d() {
        return this.f3996a.f3346a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4334e(androidx.camera.core.p069a.p070a.C1279j r10) {
        /*
            r9 = this;
            androidx.camera.camera2.b.c r0 = r9.f3996a
            android.hardware.camera2.CaptureResult r1 = r0.f3347b
            android.hardware.camera2.CaptureResult$Key r2 = android.hardware.camera2.CaptureResult.FLASH_STATE
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 2
            r3 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0010:
            r5 = 1
            goto L_0x003d
        L_0x0012:
            int r4 = r1.intValue()
            if (r4 == 0) goto L_0x003c
            if (r4 == r3) goto L_0x003c
            r5 = 3
            if (r4 == r2) goto L_0x003d
            r6 = 4
            if (r4 == r5) goto L_0x003a
            if (r4 == r6) goto L_0x003a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Undefined flash state: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r5.concat(r1)
            java.lang.String r4 = "C2CameraCaptureResult"
            androidx.camera.core.C1477bw.m3980c(r4, r1)
            goto L_0x0010
        L_0x003a:
            r5 = 4
            goto L_0x003d
        L_0x003c:
            r5 = 2
        L_0x003d:
            if (r5 != r3) goto L_0x0040
            goto L_0x0064
        L_0x0040:
            int r5 = r5 + -1
            if (r5 == r3) goto L_0x004a
            if (r5 == r2) goto L_0x0048
            r1 = 1
            goto L_0x004c
        L_0x0048:
            r1 = 0
            goto L_0x004c
        L_0x004a:
            r1 = 32
        L_0x004c:
            r4 = r1 & 1
            if (r4 != r3) goto L_0x0059
            java.lang.String r4 = "4"
            java.util.List r5 = r10.f3695b
            java.lang.String r6 = "LightSource"
            r10.mo4140b(r6, r4, r5)
        L_0x0059:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.List r4 = r10.f3695b
            java.lang.String r5 = "Flash"
            r10.mo4140b(r5, r1, r4)
        L_0x0064:
            android.hardware.camera2.CaptureResult r1 = r0.f3347b
            android.hardware.camera2.CaptureResult$Key r4 = android.hardware.camera2.CaptureResult.SCALER_CROP_REGION
            java.lang.Object r1 = r1.get(r4)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            if (r1 == 0) goto L_0x007e
            int r4 = r1.width()
            r10.mo4143e(r4)
            int r1 = r1.height()
            r10.mo4142d(r1)
        L_0x007e:
            android.hardware.camera2.CaptureResult r1 = r0.f3347b
            android.hardware.camera2.CaptureResult$Key r4 = android.hardware.camera2.CaptureResult.JPEG_ORIENTATION
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0091
            int r1 = r1.intValue()
            r10.mo4141c(r1)
        L_0x0091:
            android.hardware.camera2.CaptureResult r1 = r0.f3347b
            android.hardware.camera2.CaptureResult$Key r4 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            java.lang.Object r1 = r1.get(r4)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x00bd
            long r4 = r1.longValue()
            double r4 = (double) r4
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r6 = 1
            long r6 = r1.toNanos(r6)
            double r6 = (double) r6
            java.lang.Double.isNaN(r4)
            java.lang.Double.isNaN(r6)
            double r4 = r4 / r6
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.util.List r4 = r10.f3695b
            java.lang.String r5 = "ExposureTime"
            r10.mo4140b(r5, r1, r4)
        L_0x00bd:
            android.hardware.camera2.CaptureResult r1 = r0.f3347b
            android.hardware.camera2.CaptureResult$Key r4 = android.hardware.camera2.CaptureResult.LENS_APERTURE
            java.lang.Object r1 = r1.get(r4)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x00d8
            float r1 = r1.floatValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.List r4 = r10.f3695b
            java.lang.String r5 = "FNumber"
            r10.mo4140b(r5, r1, r4)
        L_0x00d8:
            android.hardware.camera2.CaptureResult r1 = r0.f3347b
            android.hardware.camera2.CaptureResult$Key r4 = android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0122
            android.hardware.camera2.CaptureResult r4 = r0.f3347b
            android.hardware.camera2.CaptureResult$Key r5 = android.hardware.camera2.CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x0103
            int r1 = r1.intValue()
            int r4 = r4.intValue()
            float r4 = (float) r4
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r5
            int r4 = (int) r4
            int r1 = r1 * r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0103:
            int r1 = r1.intValue()
            java.lang.String r4 = "3"
            java.util.List r5 = r10.f3695b
            java.lang.String r6 = "SensitivityType"
            r10.mo4140b(r6, r4, r5)
            r4 = 65535(0xffff, float:9.1834E-41)
            int r1 = java.lang.Math.min(r4, r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.List r4 = r10.f3695b
            java.lang.String r5 = "PhotographicSensitivity"
            r10.mo4140b(r5, r1, r4)
        L_0x0122:
            android.hardware.camera2.CaptureResult r1 = r0.f3347b
            android.hardware.camera2.CaptureResult$Key r4 = android.hardware.camera2.CaptureResult.LENS_FOCAL_LENGTH
            java.lang.Object r1 = r1.get(r4)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0149
            float r1 = r1.floatValue()
            androidx.camera.core.a.a.n r4 = new androidx.camera.core.a.a.n
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r5
            long r5 = (long) r1
            r7 = 1000(0x3e8, double:4.94E-321)
            r4.<init>(r5, r7)
            java.lang.String r1 = r4.toString()
            java.util.List r4 = r10.f3695b
            java.lang.String r5 = "FocalLength"
            r10.mo4140b(r5, r1, r4)
        L_0x0149:
            android.hardware.camera2.CaptureResult r0 = r0.f3347b
            android.hardware.camera2.CaptureResult$Key r1 = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x016d
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x015c
            goto L_0x015d
        L_0x015c:
            r2 = 1
        L_0x015d:
            int r2 = r2 + -1
            if (r2 == 0) goto L_0x0164
            java.lang.String r0 = "1"
            goto L_0x0166
        L_0x0164:
            java.lang.String r0 = "0"
        L_0x0166:
            java.lang.String r1 = "WhiteBalance"
            java.util.List r2 = r10.f3695b
            r10.mo4140b(r1, r0, r2)
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p073b.C1440c.mo4334e(androidx.camera.core.a.a.j):void");
    }
}
