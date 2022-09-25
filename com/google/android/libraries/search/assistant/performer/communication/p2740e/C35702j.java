package com.google.android.libraries.search.assistant.performer.communication.p2740e;

import android.telephony.SubscriptionInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.e.j */
/* compiled from: PG */
public final /* synthetic */ class C35702j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C35702j f93604a = new C35702j();

    private /* synthetic */ C35702j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SubscriptionInfo) obj).getSubscriptionId());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
