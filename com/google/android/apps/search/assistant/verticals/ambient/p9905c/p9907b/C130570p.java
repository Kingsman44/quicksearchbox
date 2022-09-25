package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9907b;

import android.content.Intent;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.b.p */
/* compiled from: PG */
public final /* synthetic */ class C130570p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C130570p f357629a = new C130570p();

    private /* synthetic */ C130570p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((Intent) obj).putExtra("com.google.android.apps.search.assistant.verticals.ambient.shared.constants.SMARTSPACE_EXTRA_BLUECHIP_INTENT", true);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
