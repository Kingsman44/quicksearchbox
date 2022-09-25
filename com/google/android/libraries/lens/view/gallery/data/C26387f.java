package com.google.android.libraries.lens.view.gallery.data;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.f */
/* compiled from: PG */
public final /* synthetic */ class C26387f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26393l f71797a;

    /* renamed from: b */
    public final /* synthetic */ boolean f71798b;

    public /* synthetic */ C26387f(C26393l lVar, boolean z) {
        this.f71797a = lVar;
        this.f71798b = z;
    }

    public final void run() {
        C26393l lVar = this.f71797a;
        boolean z = this.f71798b;
        C60870cx cxVar = lVar.f71810g;
        if (cxVar != null) {
            cxVar.cancel(false);
            lVar.f71810g = null;
            if (z) {
                lVar.mo31597d();
            }
        }
        C60870cx cxVar2 = lVar.f71809f;
        if (cxVar2 != null) {
            cxVar2.cancel(false);
            lVar.f71809f = null;
            if (z) {
                lVar.mo31598e();
            }
        }
    }
}
