package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9208i;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C63063ga;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.i.d */
/* compiled from: PG */
public final /* synthetic */ class C121378d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C121378d f337008a = new C121378d();

    private /* synthetic */ C121378d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63063ga gaVar = (C63063ga) ((Map.Entry) obj).getValue();
        return gaVar.f170181a == 3 ? (String) gaVar.f170182b : BuildConfig.FLAVOR;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
