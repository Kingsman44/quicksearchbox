package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.c */
/* compiled from: PG */
public final /* synthetic */ class C82217c implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ boolean f224698a;

    public /* synthetic */ C82217c(boolean z) {
        this.f224698a = z;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        boolean z = this.f224698a;
        C82218d a = ((C82219e) obj).mo75562a();
        a.mo75561c(z);
        return a.mo75559a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
