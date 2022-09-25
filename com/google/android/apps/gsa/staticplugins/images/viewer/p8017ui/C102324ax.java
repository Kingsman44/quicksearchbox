package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2061c;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ax */
/* compiled from: PG */
final class C102324ax extends C2061c {

    /* renamed from: a */
    final /* synthetic */ C102328ba f285573a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102324ax(C102328ba baVar) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f285573a = baVar;
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (this.f285573a.f285588l) {
            this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return this.f285573a.f285588l;
    }
}
