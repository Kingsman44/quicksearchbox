package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79485j;
import com.google.android.apps.gsa.nga.engine.warmactions.p6259k.C79720c;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.as */
/* compiled from: PG */
public final /* synthetic */ class C79663as implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79663as f218484a = new C79663as();

    private /* synthetic */ C79663as() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(C79720c.m127814b(((C79485j) obj).mo74081b().mo74017a())).findFirst();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
