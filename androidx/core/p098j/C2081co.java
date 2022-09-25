package androidx.core.p098j;

import android.view.WindowInsets;

/* renamed from: androidx.core.j.co */
/* compiled from: PG */
final class C2081co {
    /* renamed from: a */
    static int m5715a(int i) {
        int i2;
        int i3 = 0;
        for (int i4 = 1; i4 <= 256; i4 += i4) {
            if ((i & i4) != 0) {
                if (i4 == 1) {
                    i2 = WindowInsets.Type.statusBars();
                } else if (i4 == 2) {
                    i2 = WindowInsets.Type.navigationBars();
                } else if (i4 == 4) {
                    i2 = WindowInsets.Type.captionBar();
                } else if (i4 == 8) {
                    i2 = WindowInsets.Type.ime();
                } else if (i4 == 16) {
                    i2 = WindowInsets.Type.systemGestures();
                } else if (i4 == 32) {
                    i2 = WindowInsets.Type.mandatorySystemGestures();
                } else if (i4 == 64) {
                    i2 = WindowInsets.Type.tappableElement();
                } else if (i4 == 128) {
                    i2 = WindowInsets.Type.displayCutout();
                }
                i3 |= i2;
            }
        }
        return i3;
    }
}
