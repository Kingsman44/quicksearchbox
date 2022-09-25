package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.view.View;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.bc */
/* compiled from: PG */
public final /* synthetic */ class C81751bc implements Function {

    /* renamed from: a */
    public final /* synthetic */ C81772bx f223603a;

    public /* synthetic */ C81751bc(C81772bx bxVar) {
        this.f223603a = bxVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C81772bx bxVar = this.f223603a;
        View view = (View) obj;
        if (view instanceof DoubleFreSuggestionView) {
            return bxVar.f223652d.mo75320c(view);
        }
        if (view instanceof DoubleTopGreetingView) {
            return bxVar.f223652d.mo75320c(view);
        }
        return bxVar.f223652d.mo75319b(view);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
