package com.google.android.libraries.gsa.monet.tools.p1897b.p1904d;

import android.view.View;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.d.a */
/* compiled from: PG */
public final /* synthetic */ class C23164a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C23166c f63528a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f63529b;

    /* renamed from: c */
    public final /* synthetic */ boolean f63530c;

    /* renamed from: d */
    public final /* synthetic */ View f63531d;

    /* renamed from: e */
    public final /* synthetic */ View f63532e;

    public /* synthetic */ C23164a(C23166c cVar, Runnable runnable, boolean z, View view, View view2) {
        this.f63528a = cVar;
        this.f63529b = runnable;
        this.f63530c = z;
        this.f63531d = view;
        this.f63532e = view2;
    }

    public final void run() {
        C23166c cVar = this.f63528a;
        Runnable runnable = this.f63529b;
        boolean z = this.f63530c;
        View view = this.f63531d;
        View view2 = this.f63532e;
        runnable.run();
        if (!z) {
            cVar.f63535a.removeView(view2);
        } else if (view != null) {
            cVar.f63535a.removeView(view);
        }
    }
}
