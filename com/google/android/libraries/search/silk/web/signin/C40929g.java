package com.google.android.libraries.search.silk.web.signin;

import com.google.android.libraries.silk.p3205a.p3236y.C41740a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.signin.g */
/* compiled from: PG */
public final /* synthetic */ class C40929g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkSignInMessageHandler f107189a;

    public /* synthetic */ C40929g(SilkSignInMessageHandler silkSignInMessageHandler) {
        this.f107189a = silkSignInMessageHandler;
    }

    public final void accept(Object obj) {
        this.f107189a.mo42933h((C41740a) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
