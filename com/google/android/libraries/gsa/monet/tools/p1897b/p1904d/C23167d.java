package com.google.android.libraries.gsa.monet.tools.p1897b.p1904d;

import android.view.View;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.d.d */
/* compiled from: PG */
public final class C23167d implements C23170g {

    /* renamed from: a */
    private final int f63540a;

    /* renamed from: b */
    private final View f63541b;

    /* renamed from: c */
    private ChildStub f63542c;

    public C23167d(int i, View view) {
        this.f63540a = i;
        this.f63541b = view;
    }

    /* renamed from: d */
    private final ChildStub m43362d() {
        if (this.f63542c == null) {
            View view = this.f63541b;
            view.getClass();
            ChildStub childStub = (ChildStub) view.findViewById(this.f63540a);
            C23067b.m43236i(childStub, "Could not find the ChildStub in the layout.");
            this.f63542c = childStub;
        }
        return this.f63542c;
    }

    /* renamed from: a */
    public final void mo28612a(C22939d dVar, C22939d dVar2, Runnable runnable) {
        if (dVar == null) {
            m43362d().mo28717b();
        } else {
            mo28614c(dVar);
        }
        runnable.run();
    }

    /* renamed from: b */
    public final void mo28613b(C22939d dVar, C22939d dVar2, Runnable runnable) {
        mo28614c(dVar2);
        runnable.run();
    }

    /* renamed from: c */
    public final void mo28614c(C22939d dVar) {
        View il = dVar.mo28297il();
        il.getClass();
        m43362d().mo28718c(il);
    }
}
