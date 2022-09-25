package com.google.android.apps.gsa.staticplugins.opa.util;

import android.view.ViewGroup;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1649b.p1650a.C19605b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bn */
/* compiled from: PG */
public final class C113798bn extends C19605b {

    /* renamed from: a */
    public ViewGroup f315168a;

    public C113798bn(C22871g gVar) {
        mo24923e(new C113796bl());
        mo24922d(new C113795bk(gVar));
        mo24925g();
    }

    /* renamed from: a */
    public final void mo100647a(ViewGroup viewGroup) {
        if (viewGroup != null && viewGroup != this.f315168a) {
            this.f315168a = viewGroup;
            super.mo24924f(new C113797bm(viewGroup));
            super.mo24926h(viewGroup);
        }
    }
}
