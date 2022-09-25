package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import p3186j$.util.function.Function;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.i */
/* compiled from: PG */
public final /* synthetic */ class C113566i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C113572o f314451a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f314452b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f314453c;

    public /* synthetic */ C113566i(C113572o oVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f314451a = oVar;
        this.f314452b = viewGroup;
        this.f314453c = viewGroup2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C113572o oVar = this.f314451a;
        View view = this.f314452b;
        ViewGroup viewGroup = this.f314453c;
        C69464a aVar = (C69464a) obj;
        C113342cm cmVar = (C113342cm) aVar.mo17428b();
        boolean z = oVar.f314466c;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(((C113342cm) aVar.mo17428b()).mo99713a(), viewGroup, false);
        if (z) {
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        } else {
            view = inflate;
        }
        return cmVar.mo99714c(view);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
