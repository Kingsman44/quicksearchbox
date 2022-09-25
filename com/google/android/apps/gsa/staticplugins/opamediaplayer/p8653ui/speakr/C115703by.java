package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.by */
/* compiled from: PG */
final class C115703by extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C115711cf f320902a;

    public C115703by(C115711cf cfVar) {
        this.f320902a = cfVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 4096) {
            this.f320902a.f320936g.mo101876f();
            return true;
        } else if (i != 8192) {
            return super.performAccessibilityAction(view, i, bundle);
        } else {
            this.f320902a.f320936g.mo101879j();
            return true;
        }
    }
}
