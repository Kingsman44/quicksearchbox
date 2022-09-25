package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.at */
/* compiled from: PG */
public final /* synthetic */ class C81983at implements Function {

    /* renamed from: a */
    public final /* synthetic */ C81984au f224131a;

    /* renamed from: b */
    public final /* synthetic */ int f224132b;

    public /* synthetic */ C81983at(C81984au auVar, int i) {
        this.f224131a = auVar;
        this.f224132b = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C81984au auVar = this.f224131a;
        return auVar.f224134b.mo28201a("[NGA] getString", new C81982as(auVar, (Locale) obj, this.f224132b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
