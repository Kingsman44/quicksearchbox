package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.cu */
/* compiled from: PG */
public final class C15238cu extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C15241cx f45728a;

    public C15238cu(C15241cx cxVar) {
        this.f45728a = cxVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), this.f45728a.f45734d.getString(R.string.expand_talkback_hint)));
    }
}
