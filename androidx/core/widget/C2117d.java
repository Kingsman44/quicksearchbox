package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* renamed from: androidx.core.widget.d */
/* compiled from: PG */
public final class C2117d {
    /* renamed from: a */
    public static ColorStateList m5877a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* renamed from: b */
    public static PorterDuff.Mode m5878b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    /* renamed from: c */
    public static void m5879c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* renamed from: d */
    public static void m5880d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
