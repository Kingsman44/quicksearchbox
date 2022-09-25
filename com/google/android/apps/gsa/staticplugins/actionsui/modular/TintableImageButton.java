package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: PG */
public class TintableImageButton extends ImageButton {

    /* renamed from: a */
    public int f261107a;

    public TintableImageButton(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo87918a(int i) {
        this.f261107a = i;
        super.getDrawable().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    public TintableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TintableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
