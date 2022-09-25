package androidx.core.p098j;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: androidx.core.j.b */
/* compiled from: PG */
final class C2033b {
    /* renamed from: a */
    static AccessibilityNodeProvider m5467a(View.AccessibilityDelegate accessibilityDelegate, View view) {
        return accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    /* renamed from: b */
    static boolean m5468b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
