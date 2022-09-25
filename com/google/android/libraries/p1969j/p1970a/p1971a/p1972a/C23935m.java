package com.google.android.libraries.p1969j.p1970a.p1971a.p1972a;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.j.a.a.a.m */
/* compiled from: PG */
final class C23935m extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C23939q f65435a;

    public C23935m(C23939q qVar) {
        this.f65435a = qVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), this.f65435a.getContext().getResources().getString(R.string.learn_more_link_talkback_action_name)));
        view.setOnClickListener(new C23934l(this));
    }
}
