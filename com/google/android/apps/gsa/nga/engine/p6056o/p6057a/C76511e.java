package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.e */
/* compiled from: PG */
public final /* synthetic */ class C76511e implements Function {

    /* renamed from: a */
    public final /* synthetic */ e f211726a;

    public /* synthetic */ C76511e(e eVar) {
        this.f211726a = eVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f211726a.equals((e) obj));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
