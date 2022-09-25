package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.common.p4522b.C58485gu;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ca */
/* compiled from: PG */
public final /* synthetic */ class C113330ca implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C113330ca f313855a = new C113330ca();

    private /* synthetic */ C113330ca() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C113339cj.f313864a;
        C113295bt btVar = (C113295bt) ((Map.Entry) obj).getValue();
        return new C113291bp(btVar.f313761b, C58485gu.m89842j(btVar.f313760a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
