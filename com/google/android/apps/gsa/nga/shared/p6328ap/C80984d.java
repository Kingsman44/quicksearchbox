package com.google.android.apps.gsa.nga.shared.p6328ap;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.d */
/* compiled from: PG */
public final /* synthetic */ class C80984d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C80987g f221997a;

    public /* synthetic */ C80984d(C80987g gVar) {
        this.f221997a = gVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        return new C80988h(str, C80985e.IN_FOREGROUND.equals(this.f221997a.mo74765a(str)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
