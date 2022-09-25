package com.google.android.apps.gsa.shared.util.p7187ui;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.s */
/* compiled from: PG */
public final class C91120s extends InsetDrawable {

    /* renamed from: a */
    private final ColorStateList f254434a;

    public C91120s(Drawable drawable, ColorStateList colorStateList) {
        super(drawable, 0);
        this.f254434a = colorStateList;
        onStateChange(getState());
    }

    public final boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f254434a;
        if (colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor())) == 0) {
            return onStateChange;
        }
        mutate().setColorFilter(colorForState, PorterDuff.Mode.SRC_ATOP);
        return true;
    }
}
