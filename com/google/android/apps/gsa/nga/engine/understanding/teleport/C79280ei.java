package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ei */
/* compiled from: PG */
public final /* synthetic */ class C79280ei implements Function {

    /* renamed from: a */
    public final /* synthetic */ Optional f217750a;

    /* renamed from: b */
    public final /* synthetic */ String f217751b;

    public /* synthetic */ C79280ei(Optional optional, String str) {
        this.f217750a = optional;
        this.f217751b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional = this.f217750a;
        String str = this.f217751b;
        return ((C79289er) optional.get()).mo73845a((String) obj, str);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
