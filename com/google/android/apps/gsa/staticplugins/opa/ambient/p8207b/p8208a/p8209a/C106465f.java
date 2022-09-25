package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import android.app.usage.UsageStats;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C106465f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C106465f f296953a = new C106465f();

    private /* synthetic */ C106465f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (UsageStats) Collection.EL.stream((C58485gu) obj).reduce(C106471l.f296959a).get();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
