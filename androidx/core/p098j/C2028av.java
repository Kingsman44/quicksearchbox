package androidx.core.p098j;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: androidx.core.j.av */
/* compiled from: PG */
final class C2028av {
    /* renamed from: a */
    static WindowInsets m5428a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: b */
    static WindowInsets m5429b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: c */
    static void m5430c(View view) {
        view.requestApplyInsets();
    }
}
