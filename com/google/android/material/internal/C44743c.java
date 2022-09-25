package com.google.android.material.internal;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.google.android.material.internal.c */
/* compiled from: PG */
final class C44743c extends C2061c {

    /* renamed from: a */
    final /* synthetic */ CheckableImageButton f116607a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44743c(CheckableImageButton checkableImageButton) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f116607a = checkableImageButton;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f116607a.f116510a);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        super.onInitializeAccessibilityNodeInfo(view, kVar);
        kVar.f5921a.setCheckable(this.f116607a.f116511b);
        kVar.f5921a.setChecked(this.f116607a.f116510a);
    }
}
