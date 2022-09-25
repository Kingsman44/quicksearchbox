package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.bk */
/* compiled from: PG */
final class C108240bk extends View.AccessibilityDelegate {

    /* renamed from: a */
    private final boolean f301050a;

    public C108240bk(boolean z) {
        this.f301050a = z;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(-1, 0, 0, 0, this.f301050a));
    }
}
