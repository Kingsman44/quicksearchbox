package androidx.core.p098j;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: androidx.core.j.ar */
/* compiled from: PG */
final class C2024ar {
    /* renamed from: a */
    static int m5388a(View view) {
        return view.getImportantForAccessibility();
    }

    /* renamed from: b */
    static int m5389b(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: c */
    static int m5390c(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: d */
    static int m5391d(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: e */
    static ViewParent m5392e(View view) {
        return view.getParentForAccessibility();
    }

    /* renamed from: f */
    static AccessibilityNodeProvider m5393f(View view) {
        return view.getAccessibilityNodeProvider();
    }

    /* renamed from: g */
    static void m5394g(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: h */
    static void m5395h(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    /* renamed from: i */
    static void m5396i(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: j */
    static void m5397j(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: k */
    static void m5398k(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: l */
    static void m5399l(View view) {
        view.requestFitSystemWindows();
    }

    /* renamed from: m */
    static void m5400m(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: n */
    static void m5401n(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* renamed from: o */
    static void m5402o(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* renamed from: p */
    static boolean m5403p(View view) {
        return view.getFitsSystemWindows();
    }

    /* renamed from: q */
    static boolean m5404q(View view) {
        return view.hasOverlappingRendering();
    }

    /* renamed from: r */
    static boolean m5405r(View view) {
        return view.hasTransientState();
    }

    /* renamed from: s */
    static boolean m5406s(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }
}
