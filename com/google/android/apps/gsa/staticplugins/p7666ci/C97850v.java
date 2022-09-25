package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.v */
/* compiled from: PG */
public final /* synthetic */ class C97850v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f273242a;

    /* renamed from: b */
    public final /* synthetic */ C91006f f273243b;

    public /* synthetic */ C97850v(C60870cx cxVar, C91006f fVar) {
        this.f273242a = cxVar;
        this.f273243b = fVar;
    }

    public final Object call() {
        Collection.EL.stream((List) C60856cj.m92909r(this.f273242a)).forEach(new C97761ab(this.f273243b));
        return null;
    }
}
