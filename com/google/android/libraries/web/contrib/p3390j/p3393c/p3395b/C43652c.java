package com.google.android.libraries.web.contrib.p3390j.p3393c.p3395b;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p098j.p099a.C1988h;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.web.contrib.j.c.b.c */
/* compiled from: PG */
final class C43652c extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C43650b f113914a;

    public C43652c(C43650b bVar) {
        this.f113914a = bVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(C1988h.f5906d.mo5148a(), this.f113914a.f113906c.getString(R.string.webx_url_bar_long_press_to_copy)));
    }
}
