package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.android.apps.gsa.nga.engine.p6044n.C76285b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.aj */
/* compiled from: PG */
public final /* synthetic */ class C76353aj implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76363at f211450a;

    public /* synthetic */ C76353aj(C76363at atVar) {
        this.f211450a = atVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return new C76285b((C80401n) ((Map.Entry) obj).getValue(), this.f211450a.f211464c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
