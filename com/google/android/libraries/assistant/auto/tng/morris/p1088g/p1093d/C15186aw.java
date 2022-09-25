package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.aw */
/* compiled from: PG */
final class C15186aw extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C15188ay f45579a;

    public C15186aw(C15188ay ayVar) {
        this.f45579a = ayVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), this.f45579a.f45582a.getString(R.string.expand_talkback_hint)));
    }
}
