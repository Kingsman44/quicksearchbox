package com.google.android.apps.gsa.staticplugins.opa.chatui;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.bj */
/* compiled from: PG */
final class C108239bj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ float f301048a;

    /* renamed from: b */
    final /* synthetic */ C108241bl f301049b;

    public C108239bj(C108241bl blVar, float f) {
        this.f301049b = blVar;
        this.f301048a = f;
    }

    public final void run() {
        int i;
        C108241bl blVar = this.f301049b;
        float f = this.f301048a;
        blVar.f301076c.setAlpha(f);
        if (blVar.f301076c.getBackground() != null) {
            double d = (double) f;
            if (d > 0.00392156862745098d) {
                Double.isNaN(d);
                i = (int) (1.0d / d);
            } else {
                i = 1;
            }
            blVar.f301076c.getBackground().setAlpha((i * 3) / 2);
        }
    }
}
