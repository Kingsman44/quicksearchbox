package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.gq */
/* compiled from: PG */
final class C0682gq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f2500a;

    /* renamed from: b */
    final /* synthetic */ C0687gv f2501b;

    public C0682gq(C0687gv gvVar, View view) {
        this.f2501b = gvVar;
        this.f2500a = view;
    }

    public final void run() {
        this.f2501b.smoothScrollTo(this.f2500a.getLeft() - ((this.f2501b.getWidth() - this.f2500a.getWidth()) / 2), 0);
        this.f2501b.f2512a = null;
    }
}
