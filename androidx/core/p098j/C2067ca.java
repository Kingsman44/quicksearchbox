package androidx.core.p098j;

import android.view.View;
import android.view.Window;

/* renamed from: androidx.core.j.ca */
/* compiled from: PG */
final class C2067ca {
    /* renamed from: a */
    static void m5648a(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & -1793 : systemUiVisibility | 1792);
    }
}
