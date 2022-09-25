package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C103827ag implements Function {

    /* renamed from: a */
    public final /* synthetic */ C103868bu f289077a;

    /* renamed from: b */
    public final /* synthetic */ Function f289078b;

    public /* synthetic */ C103827ag(C103868bu buVar, Function function) {
        this.f289077a = buVar;
        this.f289078b = function;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C103868bu buVar = this.f289077a;
        String str = (String) this.f289078b.apply(obj);
        C80627v a = buVar.f289139k.mo74366a(str);
        if (a.equals(C80627v.UNRECOGNIZED)) {
            return str;
        }
        return buVar.f289139k.mo74369d(a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
