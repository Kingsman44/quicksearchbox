package androidx.core.p098j;

import android.graphics.Rect;
import android.view.View;

/* renamed from: androidx.core.j.at */
/* compiled from: PG */
final class C2026at {
    /* renamed from: a */
    static Rect m5418a(View view) {
        return view.getClipBounds();
    }

    /* renamed from: b */
    static void m5419b(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* renamed from: c */
    static boolean m5420c(View view) {
        return view.isInLayout();
    }
}
