package androidx.core.widget;

import android.widget.TextView;

/* renamed from: androidx.core.widget.w */
/* compiled from: PG */
public final class C2136w {
    /* renamed from: a */
    static int m5925a(TextView textView) {
        return textView.getAutoSizeMaxTextSize();
    }

    /* renamed from: b */
    static int m5926b(TextView textView) {
        return textView.getAutoSizeMinTextSize();
    }

    /* renamed from: c */
    static int m5927c(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* renamed from: d */
    static int m5928d(TextView textView) {
        return textView.getAutoSizeTextType();
    }

    /* renamed from: e */
    static void m5929e(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* renamed from: f */
    static void m5930f(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* renamed from: g */
    public static void m5931g(TextView textView, int i) {
        textView.setAutoSizeTextTypeWithDefaults(i);
    }

    /* renamed from: h */
    static int[] m5932h(TextView textView) {
        return textView.getAutoSizeTextAvailableSizes();
    }
}
