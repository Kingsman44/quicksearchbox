package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.assistant.p3825an.p3830c.p3831a.C49275au;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.ai */
/* compiled from: PG */
public final /* synthetic */ class C10322ai implements Function {

    /* renamed from: a */
    public final /* synthetic */ ConcurrentMap f34978a;

    public /* synthetic */ C10322ai(ConcurrentMap concurrentMap) {
        this.f34978a = concurrentMap;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C49275au) this.f34978a.get((Long) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
