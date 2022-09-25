package com.google.android.apps.search.assistant.verticals.automation.routines.p10025c;

import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.c.d */
/* compiled from: PG */
public final /* synthetic */ class C131855d implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ String f360086a;

    /* renamed from: b */
    public final /* synthetic */ String f360087b;

    public /* synthetic */ C131855d(String str, String str2) {
        this.f360086a = str;
        this.f360087b = str2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f360086a;
        String str2 = this.f360087b;
        return ((String) obj) + "#routines_standalone#" + str + "@" + str2;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
