package androidx.core.p098j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: androidx.core.j.u */
/* compiled from: PG */
public final class C2106u {
    /* renamed from: a */
    static int m5798a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* renamed from: b */
    static int m5799b(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* renamed from: c */
    static ColorStateList m5800c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* renamed from: d */
    static PorterDuff.Mode m5801d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* renamed from: e */
    public static MenuItem m5802e(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    /* renamed from: f */
    static MenuItem m5803f(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* renamed from: g */
    public static MenuItem m5804g(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* renamed from: h */
    public static MenuItem m5805h(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* renamed from: i */
    public static MenuItem m5806i(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    /* renamed from: j */
    static MenuItem m5807j(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    /* renamed from: k */
    public static MenuItem m5808k(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }

    /* renamed from: l */
    static CharSequence m5809l(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* renamed from: m */
    static CharSequence m5810m(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }
}
