package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81249an;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.ew */
/* compiled from: PG */
public final /* synthetic */ class C81201ew implements Function {

    /* renamed from: a */
    public final /* synthetic */ C81203ey f222338a;

    public /* synthetic */ C81201ew(C81203ey eyVar) {
        this.f222338a = eyVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C81249an) this.f222338a.mo74941b((String) obj).map(C81186eh.f222323a).orElse(C81249an.NOT_SET);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
