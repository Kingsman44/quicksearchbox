package com.google.android.libraries.appactions.p11035a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C63063ga;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.a.u */
/* compiled from: PG */
public final /* synthetic */ class C147853u implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C147853u f398878a = new C147853u();

    private /* synthetic */ C147853u() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63063ga gaVar = (C63063ga) obj;
        return gaVar.f170181a == 3 ? (String) gaVar.f170182b : BuildConfig.FLAVOR;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
