package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.fc */
/* compiled from: PG */
public final /* synthetic */ class C79301fc implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f217795a;

    public /* synthetic */ C79301fc(String str) {
        this.f217795a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C79308fj.m127239b(this.f217795a, Optional.empty(), Optional.m71637of(((C80053ag) obj).f219677a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
