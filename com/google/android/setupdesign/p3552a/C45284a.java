package com.google.android.setupdesign.p3552a;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;
import androidx.core.p098j.p099a.C1995o;

/* renamed from: com.google.android.setupdesign.a.a */
/* compiled from: PG */
public final class C45284a extends C2061c {

    /* renamed from: a */
    private final C2061c f118320a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45284a() {
        super(C2061c.DEFAULT_DELEGATE);
        C2061c cVar = new C2061c(C2061c.DEFAULT_DELEGATE);
        this.f118320a = cVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f118320a.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final C1995o getAccessibilityNodeProvider(View view) {
        return this.f118320a.getAccessibilityNodeProvider(view);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f118320a.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        this.f118320a.onInitializeAccessibilityNodeInfo(view, kVar);
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f118320a.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f118320a.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f118320a.performAccessibilityAction(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.f118320a.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f118320a.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
