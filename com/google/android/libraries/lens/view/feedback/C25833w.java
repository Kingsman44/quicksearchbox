package com.google.android.libraries.lens.view.feedback;

import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.feedback.w */
/* compiled from: PG */
public final /* synthetic */ class C25833w implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C25833w f70188a = new C25833w();

    private /* synthetic */ C25833w() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream((List) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
