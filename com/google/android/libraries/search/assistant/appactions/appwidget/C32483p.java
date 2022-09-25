package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.appwidget.AppWidgetHost;
import android.content.Context;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.p */
/* compiled from: PG */
public final /* synthetic */ class C32483p implements Function {

    /* renamed from: a */
    public final /* synthetic */ Context f87049a;

    public /* synthetic */ C32483p(Context context) {
        this.f87049a = context;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return new AppWidgetHost(this.f87049a, ((Integer) obj).intValue());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
