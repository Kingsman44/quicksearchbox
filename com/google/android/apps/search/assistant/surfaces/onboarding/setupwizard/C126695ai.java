package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.ai */
/* compiled from: PG */
public final /* synthetic */ class C126695ai implements Function {

    /* renamed from: a */
    public final /* synthetic */ C126696aj f348917a;

    public /* synthetic */ C126695ai(C126696aj ajVar) {
        this.f348917a = ajVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(this.f348917a.f348923e.indexOf((String) obj) + 1);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
