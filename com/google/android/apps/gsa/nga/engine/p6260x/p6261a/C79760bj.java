package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.common.p4552o.afi;
import com.google.common.p4552o.agh;
import com.google.p4140ba.p4147b.p4148a.p4149a.C54937b;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bj */
/* compiled from: PG */
public final /* synthetic */ class C79760bj implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79760bj f218689a = new C79760bj();

    private /* synthetic */ C79760bj() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        afi afi = ((agh) obj).f158640j;
        if (afi == null) {
            afi = afi.f158536i;
        }
        C54937b bVar = afi.f158540c;
        if (bVar == null) {
            bVar = C54937b.f144428b;
        }
        return Collection.EL.stream(bVar.f144430a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
