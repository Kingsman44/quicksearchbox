package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.TapasOverlayFrameLayout */
/* compiled from: PG */
public class TapasOverlayFrameLayout extends FrameLayout {

    /* renamed from: a */
    public C113533ao f314285a;

    public TapasOverlayFrameLayout(Context context) {
        super(context);
    }

    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (this.f314285a != null && keyEvent.getKeyCode() == 4) {
            this.f314285a.f314325a.mo99375jB();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public TapasOverlayFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TapasOverlayFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TapasOverlayFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
