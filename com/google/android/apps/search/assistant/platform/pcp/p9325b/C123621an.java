package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.an */
/* compiled from: PG */
public final /* synthetic */ class C123621an implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C123621an f341547a = new C123621an();

    private /* synthetic */ C123621an() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        char upperCase = Character.toUpperCase(str.charAt(0));
        String substring = str.substring(1);
        return upperCase + substring;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
