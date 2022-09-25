package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.f */
/* compiled from: PG */
public final /* synthetic */ class C82172f implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C82192z f224603a;

    public /* synthetic */ C82172f(C82192z zVar) {
        this.f224603a = zVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C82192z zVar = this.f224603a;
        Boolean bool = (Boolean) obj2;
        C58480gp e = C58485gu.m89837e();
        if (((Boolean) obj).booleanValue()) {
            e.mo55395g(zVar.f224640m);
        }
        if (bool.booleanValue()) {
            e.mo55395g(zVar.f224641n);
        }
        return e.mo55394f();
    }
}
