package com.google.android.libraries.logging;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.logging.d */
/* compiled from: PG */
final class C28286d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C28291i f76965a;

    public C28286d(C28291i iVar) {
        this.f76965a = iVar;
    }

    public final void onGlobalLayout() {
        this.f76965a.mo33785a();
        C28288f fVar = this.f76965a.f76971e;
        if (fVar != null) {
            fVar.mo33781a();
        }
        this.f76965a.f76968b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
