package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ey */
/* compiled from: PG */
public final /* synthetic */ class C79296ey implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f217785a;

    /* renamed from: b */
    public final /* synthetic */ C80053ag f217786b;

    public /* synthetic */ C79296ey(String str, C80053ag agVar) {
        this.f217785a = str;
        this.f217786b = agVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C79308fj.m127239b(this.f217785a, Optional.m71637of((String) obj), Optional.m71637of(this.f217786b.f219677a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
