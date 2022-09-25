package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;

/* compiled from: PG */
public class NavigationBarButton extends Button {
    public NavigationBarButton(Context context) {
        super(context);
        m80796a();
    }

    /* renamed from: a */
    private final void m80796a() {
        if (!isInEditMode()) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            for (int i = 0; i < compoundDrawablesRelative.length; i++) {
                Drawable drawable = compoundDrawablesRelative[i];
                if (drawable != null) {
                    compoundDrawablesRelative[i] = C45325e.m80807a(drawable);
                }
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
        }
    }

    /* renamed from: b */
    private final void m80797b() {
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable[] drawableArr = {compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3], compoundDrawablesRelative[0], compoundDrawablesRelative[2]};
            for (int i = 0; i < 6; i++) {
                Drawable drawable = drawableArr[i];
                if (drawable instanceof C45325e) {
                    C45325e eVar = (C45325e) drawable;
                    eVar.f118448a = textColors;
                    if (eVar.mo49300b()) {
                        eVar.invalidateSelf();
                    }
                }
            }
            invalidate();
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = C45325e.m80807a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = C45325e.m80807a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = C45325e.m80807a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = C45325e.m80807a(drawable4);
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        m80797b();
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = C45325e.m80807a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = C45325e.m80807a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = C45325e.m80807a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = C45325e.m80807a(drawable4);
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        m80797b();
    }

    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m80797b();
    }

    public NavigationBarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m80796a();
    }
}
