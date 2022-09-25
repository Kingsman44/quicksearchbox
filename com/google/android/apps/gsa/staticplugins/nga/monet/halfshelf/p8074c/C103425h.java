package com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8074c;

import android.view.ViewGroup;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23214k;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.c.h */
/* compiled from: PG */
final class C103425h implements C23214k {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f288273a;

    /* renamed from: b */
    private boolean f288274b = true;

    public C103425h(ViewGroup viewGroup) {
        this.f288273a = viewGroup;
    }

    /* renamed from: a */
    public final void mo28675a(C22939d dVar) {
        this.f288273a.addView(dVar.mo28297il());
        if (this.f288274b) {
            this.f288274b = false;
            ViewGroup viewGroup = this.f288273a;
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new C103426i(viewGroup, new C103422e(viewGroup)));
        }
    }

    /* renamed from: b */
    public final void mo28676b(C22939d dVar) {
        this.f288273a.removeView(dVar.mo28297il());
    }
}
