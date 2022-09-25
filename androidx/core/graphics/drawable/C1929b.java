package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.graphics.drawable.b */
/* compiled from: PG */
public final class C1929b {
    /* renamed from: a */
    public static ColorFilter m5220a(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* renamed from: b */
    public static void m5221b(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* renamed from: c */
    public static void m5222c(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: d */
    public static void m5223d(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    /* renamed from: e */
    public static void m5224e(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: f */
    public static void m5225f(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* renamed from: g */
    public static void m5226g(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* renamed from: h */
    public static void m5227h(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* renamed from: i */
    public static boolean m5228i(Drawable drawable) {
        return drawable.canApplyTheme();
    }
}
