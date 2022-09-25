package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50631ag;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50662y;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.f */
/* compiled from: PG */
public final /* synthetic */ class C109232f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C109232f f304168a = new C109232f();

    private /* synthetic */ C109232f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C50631ag agVar = ((C50662y) obj).f131785a;
        if (agVar == null) {
            agVar = C50631ag.f131717c;
        }
        return agVar.f131719a == 1 ? (String) agVar.f131720b : BuildConfig.FLAVOR;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
