package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b;

import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.b.e */
/* compiled from: PG */
public final /* synthetic */ class C76262e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76263f f211280a;

    public /* synthetic */ C76262e(C76263f fVar) {
        this.f211280a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(this.f211280a.f211281a.mo72204e((Intent) obj, 1, BuildConfig.FLAVOR));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
