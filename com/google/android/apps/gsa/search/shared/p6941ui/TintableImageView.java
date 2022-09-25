package com.google.android.apps.gsa.search.shared.p6941ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.TintableImageView */
/* compiled from: PG */
public class TintableImageView extends ImageView {

    /* renamed from: a */
    private ColorStateList f239220a;

    public TintableImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.f239220a;
        if (colorStateList != null && colorStateList.isStateful()) {
            int colorForState = this.f239220a.getColorForState(getDrawableState(), 0);
            if (colorForState != 0) {
                setColorFilter(colorForState);
            } else {
                clearColorFilter();
            }
        }
    }

    public TintableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TintableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C88524d.f239250a, i, 0);
        this.f239220a = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
    }
}
