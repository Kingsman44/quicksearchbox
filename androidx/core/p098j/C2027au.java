package androidx.core.p098j;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.j.au */
/* compiled from: PG */
final class C2027au {
    /* renamed from: a */
    static int m5421a(View view) {
        return view.getAccessibilityLiveRegion();
    }

    /* renamed from: b */
    static void m5422b(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    /* renamed from: c */
    static void m5423c(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    /* renamed from: d */
    static void m5424d(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    /* renamed from: e */
    static boolean m5425e(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: f */
    static boolean m5426f(View view) {
        return view.isLaidOut();
    }

    /* renamed from: g */
    static boolean m5427g(View view) {
        return view.isLayoutDirectionResolved();
    }
}
