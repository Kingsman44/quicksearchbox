package com.google.android.apps.gsa.nga.engine.education;

import com.google.assistant.p4008y.p4009a.C53581bn;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.ba */
/* compiled from: PG */
public final /* synthetic */ class C75741ba implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75743bc f210218a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f210219b;

    public /* synthetic */ C75741ba(C75743bc bcVar, C58495hd hdVar) {
        this.f210218a = bcVar;
        this.f210219b = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return new C75701az(this.f210218a, (C53581bn) obj, this.f210219b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
