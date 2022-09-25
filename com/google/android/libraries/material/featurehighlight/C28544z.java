package com.google.android.libraries.material.featurehighlight;

import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.material.featurehighlight.z */
/* compiled from: PG */
final class C28544z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C28510aa f77583a;

    public C28544z(C28510aa aaVar) {
        this.f77583a = aaVar;
    }

    public final void run() {
        if (this.f77583a.f77388a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f77583a.f77388a.getParent()).removeView(this.f77583a.f77388a);
        }
    }
}
