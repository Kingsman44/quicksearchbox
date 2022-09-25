package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import p001a.p014d.p015a.p016a.C0069n;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.g */
/* compiled from: PG */
public final /* synthetic */ class C77330g implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77330g f213264a = new C77330g();

    private /* synthetic */ C77330g() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = ((C0069n) obj).f196g;
        boolean z = true;
        char c = i != 0 ? i != 1 ? (char) 0 : 3 : 2;
        if (c == 0 || c != 3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
