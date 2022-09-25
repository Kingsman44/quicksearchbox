package androidx.core.widget;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: androidx.core.widget.u */
/* compiled from: PG */
public final class C2134u {
    /* renamed from: a */
    static int m5909a(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: b */
    static int m5910b(View view) {
        return view.getTextDirection();
    }

    /* renamed from: c */
    static Locale m5911c(TextView textView) {
        return textView.getTextLocale();
    }

    /* renamed from: d */
    public static void m5912d(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: e */
    public static void m5913e(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* renamed from: f */
    public static void m5914f(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: g */
    public static void m5915g(View view, int i) {
        view.setTextDirection(i);
    }

    /* renamed from: h */
    public static Drawable[] m5916h(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
}
