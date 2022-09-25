package com.google.android.apps.gsa.shared.bisto;

import com.evernote.android.state.BuildConfig;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.shared.bisto.ag */
/* compiled from: PG */
public final /* synthetic */ class C89609ag implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C89609ag f242672a = new C89609ag();

    private /* synthetic */ C89609ag() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((String) obj).replace("'", BuildConfig.FLAVOR);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
