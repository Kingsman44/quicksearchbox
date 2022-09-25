package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* renamed from: androidx.core.widget.v */
/* compiled from: PG */
public final class C2135v {
    /* renamed from: a */
    static int m5917a(TextView textView) {
        return textView.getBreakStrategy();
    }

    /* renamed from: b */
    static int m5918b(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* renamed from: c */
    static ColorStateList m5919c(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* renamed from: d */
    static PorterDuff.Mode m5920d(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* renamed from: e */
    public static void m5921e(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    /* renamed from: f */
    public static void m5922f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* renamed from: g */
    public static void m5923g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* renamed from: h */
    public static void m5924h(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
