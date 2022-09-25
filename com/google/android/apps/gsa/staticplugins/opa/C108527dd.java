package com.google.android.apps.gsa.staticplugins.opa;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.staticplugins.opa.util.C113798bn;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19628b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.dd */
/* compiled from: PG */
final class C108527dd implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f301945a;

    /* renamed from: b */
    final /* synthetic */ C109040fj f301946b;

    public C108527dd(C109040fj fjVar, ViewGroup viewGroup) {
        this.f301946b = fjVar;
        this.f301945a = viewGroup;
    }

    public final void onGlobalLayout() {
        this.f301945a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ((C113798bn) this.f301946b.f303258aR.mo27525b()).mo24921c(new C19623a(2), (C19628b) null);
    }
}
