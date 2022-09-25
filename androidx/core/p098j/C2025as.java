package androidx.core.p098j;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* renamed from: androidx.core.j.as */
/* compiled from: PG */
final class C2025as {
    /* renamed from: a */
    static int m5407a() {
        return View.generateViewId();
    }

    /* renamed from: b */
    static int m5408b(View view) {
        return view.getLabelFor();
    }

    /* renamed from: c */
    static int m5409c(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: d */
    static int m5410d(View view) {
        return view.getPaddingEnd();
    }

    /* renamed from: e */
    static int m5411e(View view) {
        return view.getPaddingStart();
    }

    /* renamed from: f */
    static Display m5412f(View view) {
        return view.getDisplay();
    }

    /* renamed from: g */
    static void m5413g(View view, int i) {
        view.setLabelFor(i);
    }

    /* renamed from: h */
    static void m5414h(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    /* renamed from: i */
    static void m5415i(View view, int i) {
        view.setLayoutDirection(i);
    }

    /* renamed from: j */
    static void m5416j(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: k */
    static boolean m5417k(View view) {
        return view.isPaddingRelative();
    }
}
