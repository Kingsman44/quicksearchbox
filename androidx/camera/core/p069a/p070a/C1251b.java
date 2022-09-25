package androidx.camera.core.p069a.p070a;

import androidx.camera.core.C1477bw;

/* renamed from: androidx.camera.core.a.a.b */
/* compiled from: PG */
public final class C1251b {
    /* renamed from: a */
    public static int m3415a(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = ((i2 - i) + 360) % 360;
        } else {
            i3 = (i2 + i) % 360;
        }
        if (C1477bw.m3985h("CameraOrientationUtil", 3)) {
            C1477bw.m3978a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)}));
        }
        return i3;
    }

    /* renamed from: b */
    public static int m3416b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i);
    }
}
