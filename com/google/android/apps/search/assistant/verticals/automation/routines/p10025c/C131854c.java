package com.google.android.apps.search.assistant.verticals.automation.routines.p10025c;

import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.c.c */
/* compiled from: PG */
public final /* synthetic */ class C131854c implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ String f360085a;

    public /* synthetic */ C131854c(String str) {
        this.f360085a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f360085a;
        return ((String) obj) + "#routines#" + str;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
