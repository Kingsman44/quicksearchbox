package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import android.util.Pair;
import com.google.android.apps.gsa.nga.shared.p6345h.C81317m;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.bm */
/* compiled from: PG */
public final /* synthetic */ class C81110bm implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81110bm f222231a = new C81110bm();

    private /* synthetic */ C81110bm() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C81317m mVar = (C81317m) obj;
        return new Pair(Integer.valueOf(mVar.f222589b), Instant.ofEpochMilli(mVar.f222590c));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
