package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.r */
/* compiled from: PG */
public final /* synthetic */ class C109604r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C109604r f305236a = new C109604r();

    private /* synthetic */ C109604r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        C59071e eVar = C109578ae.f305157a;
        if (optional.isPresent()) {
            return Stream.CC.m71935of((C14292dv) optional.get());
        }
        return Stream.CC.m71936of((T[]) new C14292dv[0]);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
