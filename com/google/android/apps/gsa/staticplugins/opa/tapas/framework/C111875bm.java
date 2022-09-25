package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bm */
/* compiled from: PG */
public final /* synthetic */ class C111875bm implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111875bm f310871a = new C111875bm();

    private /* synthetic */ C111875bm() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C121537f fVar = C111877bo.f310873a;
        return ((C121438d) ((Map.Entry) obj).getValue()).mo105150c();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
