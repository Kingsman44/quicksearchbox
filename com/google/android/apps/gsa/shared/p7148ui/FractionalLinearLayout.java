package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;

/* renamed from: com.google.android.apps.gsa.shared.ui.FractionalLinearLayout */
/* compiled from: PG */
public class FractionalLinearLayout extends LinearLayout {
    public FractionalLinearLayout(Context context) {
        super(context);
    }

    @ProguardMustNotDelete
    public float getXFraction() {
        return getWidth() != 0 ? getX() / ((float) getWidth()) : getX();
    }

    @ProguardMustNotDelete
    public void setXFraction(float f) {
        int width = getWidth();
        setX(width > 0 ? f * ((float) width) : 0.0f);
    }

    public FractionalLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
