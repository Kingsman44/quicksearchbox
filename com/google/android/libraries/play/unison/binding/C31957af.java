package com.google.android.libraries.play.unison.binding;

import android.view.ViewGroup;
import androidx.p060c.C0985o;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.play.unison.binding.af */
/* compiled from: PG */
abstract class C31957af extends C31976b {

    /* renamed from: b */
    public final C31958ag f85941b;

    /* renamed from: c */
    public final C0985o f85942c = new C0985o(10);

    /* renamed from: d */
    public final C31995u f85943d;

    public C31957af(ViewGroup viewGroup, C31958ag agVar, C31995u uVar) {
        super(viewGroup);
        this.f85941b = agVar;
        this.f85943d = uVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C31955ad mo37728c(C31958ag agVar, Object obj) {
        C31955ad a = agVar.mo37729a(obj);
        if (a.mo37726b()) {
            C31975ax c = a.mo37727c();
            int i = c.f85972a;
            C0985o oVar = this.f85942c;
            Object e = oVar.mo3726e(i);
            if (e == null) {
                oVar.mo3730i(i, c);
            }
            C31975ax axVar = (C31975ax) e;
            boolean z = true;
            if (!(axVar == null || axVar == c)) {
                z = false;
            }
            C58838bb.m90881p(z, "Projection for %s contains a %s with itemViewType %s, which clashes with a previous instance %s", obj, c, Integer.valueOf(i), axVar);
        }
        return a;
    }
}
