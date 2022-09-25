package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.aw */
/* compiled from: PG */
public final class C104321aw extends View.AccessibilityDelegate {

    /* renamed from: a */
    private final int f290224a;

    public C104321aw(int i) {
        this.f290224a = i;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(this.f290224a, 1, false));
    }
}
