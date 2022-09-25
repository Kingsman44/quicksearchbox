package com.google.android.apps.education.bloom.mathview.render;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.l */
/* compiled from: PG */
final class C9106l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LatexEditText f31372a;

    public C9106l(LatexEditText latexEditText) {
        this.f31372a = latexEditText;
    }

    public final void run() {
        LatexEditText latexEditText = this.f31372a;
        latexEditText.f31269a = !latexEditText.mo17333e();
        this.f31372a.invalidate();
    }
}
