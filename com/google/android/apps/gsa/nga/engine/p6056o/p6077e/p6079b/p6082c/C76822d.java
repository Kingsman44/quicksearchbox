package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6082c;

import android.os.Bundle;
import com.google.common.base.C58827ar;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.c.d */
/* compiled from: PG */
public final /* synthetic */ class C76822d implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f212222a;

    public /* synthetic */ C76822d(String str) {
        this.f212222a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f212222a;
        C58827ar arVar = C76826h.f212226a;
        return ((Bundle) obj).getBundle(str);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
