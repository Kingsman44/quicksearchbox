package android.support.p033v7.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: android.support.v7.widget.bi */
/* compiled from: PG */
final class C0539bi {
    /* renamed from: a */
    static void m1977a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: b */
    static void m1978b(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }

    /* renamed from: c */
    static Drawable[] m1979c(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
}
