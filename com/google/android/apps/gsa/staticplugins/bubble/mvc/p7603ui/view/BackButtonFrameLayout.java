package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.C97132ad;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.view.BackButtonFrameLayout */
/* compiled from: PG */
public class BackButtonFrameLayout extends FrameLayout {

    /* renamed from: a */
    public C97132ad f271644a;

    public BackButtonFrameLayout(Context context) {
        super(context);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C97132ad adVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || keyEvent.isCanceled() || (adVar = this.f271644a) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        adVar.f271393a.mo90526n();
        return true;
    }

    public BackButtonFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BackButtonFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BackButtonFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
