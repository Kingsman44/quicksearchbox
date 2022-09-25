package com.google.android.apps.gsa.searchplate;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.google.android.apps.gsa.searchplate.ak */
/* compiled from: PG */
final class C88909ak extends View.AccessibilityDelegate {
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK);
        if (!accessibilityNodeInfo.isFocused()) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        }
    }
}
