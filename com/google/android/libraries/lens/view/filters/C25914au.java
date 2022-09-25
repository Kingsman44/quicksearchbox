package com.google.android.libraries.lens.view.filters;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.filters.au */
/* compiled from: PG */
final class C25914au extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ View f70408a;

    public C25914au(View view) {
        this.f70408a = view;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), this.f70408a.getResources().getText(R.string.lens_shutter_button_action_description)));
    }
}
