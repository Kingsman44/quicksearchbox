package com.google.android.material.textfield;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: com.google.android.material.textfield.ac */
/* compiled from: PG */
final class C44922ac extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C44923ad f117339a;

    public C44922ac(C44923ad adVar) {
        this.f117339a = adVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f117339a.f117340a.f117309c;
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
