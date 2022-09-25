package com.google.android.material.bottomsheet;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2061c;

/* renamed from: com.google.android.material.bottomsheet.t */
/* compiled from: PG */
final class C44569t extends C2061c {

    /* renamed from: a */
    final /* synthetic */ BottomSheetDragHandleView f115965a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44569t(BottomSheetDragHandleView bottomSheetDragHandleView) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f115965a = bottomSheetDragHandleView;
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            this.f115965a.mo47525b();
        }
    }
}
