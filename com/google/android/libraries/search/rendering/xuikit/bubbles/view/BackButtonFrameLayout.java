package com.google.android.libraries.search.rendering.xuikit.bubbles.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40244y;

/* compiled from: PG */
public final class BackButtonFrameLayout extends FrameLayout {

    /* renamed from: a */
    public C40244y f105745a;

    public BackButtonFrameLayout(Context context) {
        super(context);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C40244y yVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || keyEvent.isCanceled() || (yVar = this.f105745a) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        yVar.f105712a.mo42278i();
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
