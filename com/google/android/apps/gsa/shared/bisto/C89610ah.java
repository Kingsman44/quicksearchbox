package com.google.android.apps.gsa.shared.bisto;

import com.evernote.android.state.BuildConfig;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.shared.bisto.ah */
/* compiled from: PG */
public final /* synthetic */ class C89610ah implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C89610ah f242673a = new C89610ah();

    private /* synthetic */ C89610ah() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((String) obj).replace(",", BuildConfig.FLAVOR);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
