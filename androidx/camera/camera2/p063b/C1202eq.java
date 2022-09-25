package androidx.camera.camera2.p063b;

import android.media.ImageWriter;
import androidx.camera.camera2.p063b.p064a.C1068k;
import androidx.camera.core.C1473bs;
import androidx.camera.core.C1477bw;
import androidx.camera.core.C1526dc;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1384k;
import androidx.camera.core.p073b.p077b.C1439e;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: androidx.camera.camera2.b.eq */
/* compiled from: PG */
final class C1202eq implements C1198em {

    /* renamed from: a */
    public final Map f3527a;

    /* renamed from: b */
    public final C1068k f3528b;

    /* renamed from: c */
    final C1439e f3529c;

    /* renamed from: d */
    public boolean f3530d = false;

    /* renamed from: e */
    public boolean f3531e = false;

    /* renamed from: f */
    public boolean f3532f = false;

    /* renamed from: g */
    C1526dc f3533g;

    /* renamed from: h */
    public C1384k f3534h;

    /* renamed from: i */
    public C1314ba f3535i;

    /* renamed from: j */
    ImageWriter f3536j;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1202eq(androidx.camera.camera2.p063b.p064a.C1068k r10) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.f3530d = r0
            r9.f3531e = r0
            r9.f3532f = r0
            r9.f3528b = r10
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r10 = r10.mo3785a(r1)
            int[] r10 = (int[]) r10
            r1 = 1
            if (r10 == 0) goto L_0x0025
            int r2 = r10.length
            r3 = 0
        L_0x0019:
            if (r3 >= r2) goto L_0x0025
            r4 = r10[r3]
            r5 = 4
            if (r4 != r5) goto L_0x0022
            r10 = 1
            goto L_0x0026
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0025:
            r10 = 0
        L_0x0026:
            r9.f3532f = r10
            androidx.camera.camera2.b.a.k r10 = r9.f3528b
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r10 = r10.mo3785a(r2)
            android.hardware.camera2.params.StreamConfigurationMap r10 = (android.hardware.camera2.params.StreamConfigurationMap) r10
            if (r10 == 0) goto L_0x0064
            int[] r2 = r10.getInputFormats()
            if (r2 != 0) goto L_0x003b
            goto L_0x0064
        L_0x003b:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int[] r3 = r10.getInputFormats()
            int r4 = r3.length
            r5 = 0
        L_0x0046:
            if (r5 >= r4) goto L_0x0069
            r6 = r3[r5]
            android.util.Size[] r7 = r10.getInputSizes(r6)
            if (r7 == 0) goto L_0x0061
            androidx.camera.core.a.a.c r8 = new androidx.camera.core.a.a.c
            r8.<init>(r1)
            java.util.Arrays.sort(r7, r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = r7[r0]
            r2.put(r6, r7)
        L_0x0061:
            int r5 = r5 + 1
            goto L_0x0046
        L_0x0064:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
        L_0x0069:
            r9.f3527a = r2
            androidx.camera.core.b.b.e r10 = new androidx.camera.core.b.b.e
            r10.<init>()
            r9.f3529c = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.C1202eq.<init>(androidx.camera.camera2.b.a.k):void");
    }

    /* renamed from: a */
    public final C1473bs mo4017a() {
        try {
            return (C1473bs) this.f3529c.mo4328a();
        } catch (NoSuchElementException unused) {
            C1477bw.m3980c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }
}
