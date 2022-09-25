package android.support.p033v7.widget;

import android.view.textclassifier.TextClassifier;

/* renamed from: android.support.v7.widget.bo */
/* compiled from: PG */
class C0545bo implements C0544bn {

    /* renamed from: a */
    final /* synthetic */ AppCompatTextView f2126a;

    public C0545bo(AppCompatTextView appCompatTextView) {
        this.f2126a = appCompatTextView;
    }

    /* renamed from: a */
    public final int mo2573a() {
        return C0545bo.super.getAutoSizeMaxTextSize();
    }

    /* renamed from: b */
    public final int mo2574b() {
        return C0545bo.super.getAutoSizeMinTextSize();
    }

    /* renamed from: c */
    public final int mo2575c() {
        return C0545bo.super.getAutoSizeStepGranularity();
    }

    /* renamed from: d */
    public final int mo2576d() {
        return C0545bo.super.getAutoSizeTextType();
    }

    /* renamed from: e */
    public final TextClassifier mo2577e() {
        return C0545bo.super.getTextClassifier();
    }

    /* renamed from: f */
    public final void mo2578f(int i, int i2, int i3, int i4) {
        C0545bo.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* renamed from: g */
    public final void mo2579g(int[] iArr, int i) {
        C0545bo.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* renamed from: h */
    public final void mo2580h(int i) {
        C0545bo.super.setAutoSizeTextTypeWithDefaults(i);
    }

    /* renamed from: i */
    public void mo2581i(int i) {
    }

    /* renamed from: j */
    public void mo2582j(int i) {
    }

    /* renamed from: k */
    public final void mo2583k(TextClassifier textClassifier) {
        C0545bo.super.setTextClassifier(textClassifier);
    }

    /* renamed from: l */
    public final int[] mo2584l() {
        return C0545bo.super.getAutoSizeTextAvailableSizes();
    }
}
