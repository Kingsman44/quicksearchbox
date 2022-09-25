package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.libraries.surveys.C43031h;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
public class ButtonWithMaxTextSize extends MaterialButton {
    public ButtonWithMaxTextSize(Context context) {
        super(context);
    }

    /* renamed from: b */
    private final void m76012b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C43031h.f112553a);
        setTextSize(0, Math.min(getTextSize(), (float) obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE)));
        obtainStyledAttributes.recycle();
    }

    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m76012b(context, attributeSet);
    }

    public ButtonWithMaxTextSize(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m76012b(context, attributeSet);
    }
}
