package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.o */
/* compiled from: PG */
public final /* synthetic */ class C122533o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122108a f339651a;

    public /* synthetic */ C122533o(C122108a aVar) {
        this.f339651a = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C122108a aVar = this.f339651a;
        if (((Integer) obj).intValue() != 0) {
            return C60856cj.m92899h(new Exception("Invalid request_id"));
        }
        return C60856cj.m92900i(aVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
