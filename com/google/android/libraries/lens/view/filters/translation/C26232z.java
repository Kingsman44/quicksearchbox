package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.z */
/* compiled from: PG */
public final /* synthetic */ class C26232z implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C26232z f71278a = new C26232z();

    private /* synthetic */ C26232z() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C25327c cVar = (C25327c) obj;
        boolean z = true;
        if (!C25327c.DOWNLOADING.equals(cVar) && !C25327c.QUEUED.equals(cVar) && !C25327c.BACKGROUND_QUEUED.equals(cVar)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
