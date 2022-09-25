package com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76435h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.a.p */
/* compiled from: PG */
public final /* synthetic */ class C76418p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76435h f211560a;

    public /* synthetic */ C76418p(C76435h hVar) {
        this.f211560a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76435h hVar = this.f211560a;
        boolean z = false;
        if (((Boolean) obj).booleanValue() == (hVar.f211587a == 2 ? ((Boolean) hVar.f211588b).booleanValue() : false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
