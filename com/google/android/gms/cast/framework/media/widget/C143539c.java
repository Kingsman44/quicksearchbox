package com.google.android.gms.cast.framework.media.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;

/* renamed from: com.google.android.gms.cast.framework.media.widget.c */
/* compiled from: PG */
final class C143539c extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ CastSeekBar f389242a;

    public C143539c(CastSeekBar castSeekBar) {
        this.f389242a = castSeekBar;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        accessibilityEvent.setItemCount(this.f389242a.f389226a.f389237b);
        this.f389242a.mo118841a();
        accessibilityEvent.setCurrentItemIndex(0);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (i == 4096 || i == 8192) {
            CastSeekBar castSeekBar = this.f389242a;
            int i2 = castSeekBar.f389226a.f389237b;
            castSeekBar.mo118841a();
            boolean z = castSeekBar.f389226a.f389241f;
        }
        return false;
    }
}
