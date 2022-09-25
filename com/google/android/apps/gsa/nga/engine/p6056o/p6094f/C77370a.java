package com.google.android.apps.gsa.nga.engine.p6056o.p6094f;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.p6060a.C76550i;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.p6060a.C76551j;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.f.a */
/* compiled from: PG */
public final /* synthetic */ class C77370a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76551j f213379a;

    public /* synthetic */ C77370a(C76551j jVar) {
        this.f213379a = jVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76551j jVar = this.f213379a;
        C76591c cVar = (C76591c) obj;
        C22871g gVar = (C22871g) jVar.f211787a.mo17428b();
        gVar.getClass();
        C83251g gVar2 = (C83251g) jVar.f211788b.mo17428b();
        gVar2.getClass();
        cVar.getClass();
        return new C76550i(gVar, gVar2, cVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
