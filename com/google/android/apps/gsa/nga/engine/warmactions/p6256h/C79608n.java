package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4543n.p4545b.C59364ae;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.n */
/* compiled from: PG */
public final /* synthetic */ class C79608n implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ Optional f218408a;

    public /* synthetic */ C79608n(Optional optional) {
        this.f218408a = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional = this.f218408a;
        int i = C79615u.f218413b;
        return C59364ae.m92266l((C58495hd) obj).mo56892c(new C79611q((C29690f) optional.get())).mo56899h();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
