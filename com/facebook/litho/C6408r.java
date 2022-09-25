package com.facebook.litho;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;

/* renamed from: com.facebook.litho.r */
/* compiled from: PG */
public final class C6408r extends C2061c {

    /* renamed from: a */
    public final /* synthetic */ C6409s f19002a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6408r(C6409s sVar) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f19002a = sVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f19002a.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f19002a.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        C6408r.super.onInitializeAccessibilityNodeInfo(view, kVar);
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f19002a.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f19002a.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return C6408r.super.performAccessibilityAction(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.f19002a.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f19002a.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
