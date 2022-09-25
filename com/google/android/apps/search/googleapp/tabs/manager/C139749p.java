package com.google.android.apps.search.googleapp.tabs.manager;

import com.google.android.apps.search.googleapp.p10117aa.C133125j;
import com.google.android.apps.search.googleapp.p10117aa.C133127l;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.p */
/* compiled from: PG */
public final /* synthetic */ class C139749p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C133127l f379854a;

    public /* synthetic */ C139749p(C133127l lVar) {
        this.f379854a = lVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C133125j jVar = (C133125j) obj;
        return new C139713a(jVar, this.f379854a.f362936c.equals(jVar.f362925e));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
