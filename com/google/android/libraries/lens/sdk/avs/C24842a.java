package com.google.android.libraries.lens.sdk.avs;

import com.google.android.libraries.lens.sdk.avs.data.AppFlowEvent;
import com.google.android.libraries.lens.sdk.avs.data.C24886u;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.sdk.avs.a */
/* compiled from: PG */
public final /* synthetic */ class C24842a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C24842a f67884a = new C24842a();

    private /* synthetic */ C24842a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return new AppFlowEvent((C24886u) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
