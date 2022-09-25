package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.ax */
/* compiled from: PG */
public final class C104322ax extends View.AccessibilityDelegate {

    /* renamed from: a */
    private final boolean f290225a = true;

    /* renamed from: b */
    private final int f290226b;

    public C104322ax(int i) {
        this.f290226b = i;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(this.f290226b, 0, 0, 0, this.f290225a));
    }
}
