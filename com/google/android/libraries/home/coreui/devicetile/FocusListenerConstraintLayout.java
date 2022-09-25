package com.google.android.libraries.home.coreui.devicetile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class FocusListenerConstraintLayout extends ConstraintLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusListenerConstraintLayout(Context context) {
        super(context);
        C69664n.m101061g(context, "context");
    }

    public final View focusSearch(int i) {
        if (i != 33 && i != 130) {
            return this;
        }
        View focusSearch = super.focusSearch(i);
        return focusSearch != null ? focusSearch : this;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 23) {
            if (keyEvent != null && keyEvent.getAction() == 0) {
                return true;
            }
            i = 23;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusListenerConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusListenerConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C69664n.m101061g(context, "context");
    }
}
