package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b;

import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.b.w */
/* compiled from: PG */
public final /* synthetic */ class C76280w implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76281x f211306a;

    public /* synthetic */ C76280w(C76281x xVar) {
        this.f211306a = xVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f211306a.f211307a.mo72204e((Intent) obj, 1, BuildConfig.FLAVOR));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
