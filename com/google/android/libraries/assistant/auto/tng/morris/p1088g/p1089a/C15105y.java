package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.y */
/* compiled from: PG */
final class C15105y extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C15106z f45322a;

    public C15105y(C15106z zVar) {
        this.f45322a = zVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), this.f45322a.f45326c.getString(R.string.voicemail_button_talkback_hint)));
    }
}
