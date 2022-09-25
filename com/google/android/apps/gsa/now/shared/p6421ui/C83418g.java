package com.google.android.apps.gsa.now.shared.p6421ui;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.g */
/* compiled from: PG */
public final class C83418g {
    /* renamed from: a */
    static float[] m132812a(float f, int i) {
        float[] fArr = new float[8];
        if (f > 0.0f && i > 0) {
            if ((i & 1) != 0) {
                fArr[0] = f;
                fArr[1] = f;
            }
            if ((i & 2) != 0) {
                fArr[2] = f;
                fArr[3] = f;
            }
            if ((i & 4) != 0) {
                fArr[4] = f;
                fArr[5] = f;
            }
            if ((i & 8) != 0) {
                fArr[6] = f;
                fArr[7] = f;
            }
        }
        return fArr;
    }
}
