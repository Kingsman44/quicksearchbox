package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p098j.C2043bi;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* renamed from: com.google.android.material.textfield.aa */
/* compiled from: PG */
public final class C44920aa {
    /* renamed from: a */
    static ImageView.ScaleType m79798a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: b */
    static void m79799b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                C1929b.m5226g(drawable, colorStateList);
            } else {
                C1929b.m5226g(drawable, ColorStateList.valueOf(colorStateList.getColorForState(m79802e(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                C1929b.m5227h(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: c */
    static void m79800c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(m79802e(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            C1929b.m5226g(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: d */
    public static void m79801d(CheckableImageButton checkableImageButton) {
        boolean at = C2043bi.m5566at(checkableImageButton);
        checkableImageButton.setFocusable(at);
        checkableImageButton.setClickable(at);
        checkableImageButton.f116512c = at;
        checkableImageButton.setLongClickable(false);
        int i = 1;
        if (true != at) {
            i = 2;
        }
        C2043bi.m5551ae(checkableImageButton, i);
    }

    /* renamed from: e */
    private static int[] m79802e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int length2 = drawableState2.length;
        int[] copyOf = Arrays.copyOf(drawableState, length + length2);
        System.arraycopy(drawableState2, 0, copyOf, length, length2);
        return copyOf;
    }
}
