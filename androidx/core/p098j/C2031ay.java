package androidx.core.p098j;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: androidx.core.j.ay */
/* compiled from: PG */
final class C2031ay {
    /* renamed from: a */
    static int m5457a(View view) {
        return view.getScrollIndicators();
    }

    /* renamed from: b */
    public static C2082cp m5458b(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C2082cp h = C2082cp.m5717h(rootWindowInsets, (View) null);
        h.f5994b.mo5225i(h);
        h.f5994b.mo5222f(view.getRootView());
        return h;
    }

    /* renamed from: c */
    static void m5459c(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* renamed from: d */
    static void m5460d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
