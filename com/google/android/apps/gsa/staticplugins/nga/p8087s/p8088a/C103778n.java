package com.google.android.apps.gsa.staticplugins.nga.p8087s.p8088a;

import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.customview.p103b.C2150h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.a.n */
/* compiled from: PG */
final class C103778n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C103779o f288969a;

    /* renamed from: b */
    private final View f288970b;

    /* renamed from: c */
    private final boolean f288971c;

    public C103778n(C103779o oVar, View view, boolean z) {
        this.f288969a = oVar;
        this.f288970b = view;
        this.f288971c = z;
    }

    public final void run() {
        C103773i iVar;
        C2150h hVar = this.f288969a.f288972a;
        if (hVar != null && hVar.mo5415l()) {
            C2043bi.m5520N(this.f288970b, this);
        } else if (this.f288971c && (iVar = this.f288969a.f288974c) != null) {
            iVar.mo93842a();
        }
    }
}
