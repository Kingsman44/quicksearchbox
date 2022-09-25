package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.assistant.p3861at.C49826ak;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.s */
/* compiled from: PG */
public final /* synthetic */ class C10361s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C10325al f35047a;

    public /* synthetic */ C10361s(C10325al alVar) {
        this.f35047a = alVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return new C10337ax(this.f35047a.f34998m.incrementAndGet(), (C49826ak) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
