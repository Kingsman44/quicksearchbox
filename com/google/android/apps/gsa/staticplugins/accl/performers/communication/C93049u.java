package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.net.Uri;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.u */
/* compiled from: PG */
public final /* synthetic */ class C93049u implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C93049u f259561a = new C93049u();

    private /* synthetic */ C93049u() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Uri.parse((String) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
