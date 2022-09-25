package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81277bh;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.el */
/* compiled from: PG */
public final /* synthetic */ class C81190el implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81190el f222327a = new C81190el();

    private /* synthetic */ C81190el() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = true;
        if (1 != (((C81277bh) obj).f222483a & 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
