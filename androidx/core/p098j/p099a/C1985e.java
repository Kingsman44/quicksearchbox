package androidx.core.p098j.p099a;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.core.j.a.e */
/* compiled from: PG */
public final class C1985e {
    /* renamed from: a */
    public static boolean m5326a(AccessibilityManager accessibilityManager, C1986f fVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new C1987g(fVar));
    }

    /* renamed from: b */
    public static boolean m5327b(AccessibilityManager accessibilityManager, C1986f fVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new C1987g(fVar));
    }
}
