package android.support.p033v7.widget;

import android.widget.TextView;

/* renamed from: android.support.v7.widget.bk */
/* compiled from: PG */
final class C0541bk {
    /* renamed from: a */
    static int m1982a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* renamed from: b */
    static void m1983b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* renamed from: c */
    static void m1984c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* renamed from: d */
    static boolean m1985d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
