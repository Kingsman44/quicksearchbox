package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.android.apps.gsa.nga.engine.geniefm.C76105k;
import com.google.android.apps.gsa.nga.engine.geniefm.C76106l;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.n */
/* compiled from: PG */
public final /* synthetic */ class C79061n implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76106l f217407a;

    public /* synthetic */ C79061n(C76106l lVar) {
        this.f217407a = lVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C76105k kVar = (C76105k) this.f217407a.toBuilder();
        kVar.copyOnWrite();
        ((C76106l) kVar.instance).f210999b = C76106l.emptyProtobufList();
        return kVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
