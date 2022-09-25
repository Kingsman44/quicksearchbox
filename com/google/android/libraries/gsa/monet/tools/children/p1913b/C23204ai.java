package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.ai */
/* compiled from: PG */
public class C23204ai implements C23227x {

    /* renamed from: a */
    private final ViewGroup f63628a;

    public C23204ai(ViewGroup viewGroup) {
        this.f63628a = viewGroup;
    }

    /* renamed from: a */
    public void mo28670a(int i, C22939d dVar) {
        this.f63628a.addView(dVar.mo28297il(), i);
    }

    /* renamed from: b */
    public final void mo28671b(int i, int i2, C22939d dVar) {
        View childAt = this.f63628a.getChildAt(i);
        this.f63628a.removeViewAt(i);
        this.f63628a.addView(childAt, i2);
    }

    /* renamed from: c */
    public final void mo28672c(int i, C22939d dVar) {
        this.f63628a.removeViewAt(i);
    }
}
