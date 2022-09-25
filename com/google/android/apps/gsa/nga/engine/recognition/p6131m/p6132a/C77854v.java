package com.google.android.apps.gsa.nga.engine.recognition.p6131m.p6132a;

import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.recognition.C77564aq;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m.a.v */
/* compiled from: PG */
public final /* synthetic */ class C77854v implements Function {

    /* renamed from: a */
    public final /* synthetic */ C77566as f214448a;

    /* renamed from: b */
    public final /* synthetic */ C79856d f214449b;

    public /* synthetic */ C77854v(C77566as asVar, C79856d dVar) {
        this.f214448a = asVar;
        this.f214449b = dVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((C77564aq) obj).mo72676d(this.f214448a, this.f214449b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
