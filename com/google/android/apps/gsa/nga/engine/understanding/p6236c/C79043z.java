package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.engine.annotators.C74983ae;
import com.google.android.apps.gsa.nga.engine.annotators.C74989bu;
import com.google.android.apps.gsa.nga.engine.annotators.ak;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.z */
/* compiled from: PG */
public final /* synthetic */ class C79043z implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79012ac f217371a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f217372b;

    public /* synthetic */ C79043z(C79012ac acVar, C74965n nVar) {
        this.f217371a = acVar;
        this.f217372b = nVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79012ac acVar = this.f217371a;
        C74965n nVar = this.f217372b;
        String str = (String) obj;
        ak akVar = acVar.f217300b;
        C74989bu a = C74983ae.m121217a(nVar.mo71326a());
        Optional.empty();
        return C60922j.m93044g(akVar.c(str, a), new C79011ab(str), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
