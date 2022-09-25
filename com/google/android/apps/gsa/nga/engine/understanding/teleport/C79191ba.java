package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ba */
/* compiled from: PG */
public final /* synthetic */ class C79191ba implements Function {

    /* renamed from: a */
    public final /* synthetic */ Set f217655a;

    public /* synthetic */ C79191ba(Set set) {
        this.f217655a = set;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Collection.EL.stream(C79204bn.m127149b((C80047aa) obj, this.f217655a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
