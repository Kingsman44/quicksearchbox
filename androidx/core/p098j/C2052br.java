package androidx.core.p098j;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.j.br */
/* compiled from: PG */
final class C2052br {
    /* renamed from: a */
    static void m5614a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    /* renamed from: b */
    static void m5615b(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    /* renamed from: c */
    static void m5616c(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    /* renamed from: d */
    static void m5617d(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }

    /* renamed from: e */
    static boolean m5618e(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    /* renamed from: f */
    static boolean m5619f(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    /* renamed from: g */
    static boolean m5620g(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }
}
