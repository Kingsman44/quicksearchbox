package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.util.Pair;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.q */
/* compiled from: PG */
public final /* synthetic */ class C75961q implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75964t f210753a;

    public /* synthetic */ C75961q(C75964t tVar) {
        this.f210753a = tVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C75964t tVar = this.f210753a;
        Pair pair = (Pair) obj;
        return Pair.create(tVar.f210755a.getString(((Integer) pair.first).intValue()), tVar.f210755a.getString(((Integer) pair.second).intValue()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
