package com.google.android.libraries.lens.view.filters.carousel;

import android.os.Bundle;
import android.support.p033v7.widget.C0675gj;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2061c;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.o */
/* compiled from: PG */
final class C25959o extends C0675gj {

    /* renamed from: c */
    final /* synthetic */ C25961q f70547c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25959o(C25961q qVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.f70547c = qVar;
    }

    /* renamed from: a */
    public final C2061c mo3098a() {
        return new C25958n(this);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            this.f70547c.mo31149k(true);
        }
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        this.f70547c.mo31149k(true);
        return super.performAccessibilityAction(view, i, bundle);
    }
}
