package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import android.content.Intent;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131690b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.ah */
/* compiled from: PG */
public final /* synthetic */ class C131768ah implements Function {

    /* renamed from: a */
    public final /* synthetic */ Intent f359945a;

    public /* synthetic */ C131768ah(Intent intent) {
        this.f359945a = intent;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((C131690b) obj).mo110264a(this.f359945a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
