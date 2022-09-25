package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.l */
/* compiled from: PG */
final class C118658l extends View.AccessibilityDelegate {

    /* renamed from: a */
    private final int f331018a;

    public C118658l(int i) {
        this.f331018a = i;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(this.f331018a, 0, 0, 0, false));
    }
}
