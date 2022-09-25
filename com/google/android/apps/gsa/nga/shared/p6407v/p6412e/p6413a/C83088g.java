package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80392e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.g */
/* compiled from: PG */
public final class C83088g implements Function {
    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C80394g gVar = (C80394g) obj;
        C80392e eVar = (C80392e) C80394g.f220645c.createBuilder();
        boolean z = false;
        boolean z2 = gVar.f220647a == 1;
        Objects.requireNonNull(gVar);
        C83046a aVar = new C83046a(gVar);
        Objects.requireNonNull(eVar);
        C83080bg.m132479c(z2, aVar, new C83073b(eVar), C83084c.f226694a);
        if (gVar.f220647a == 2) {
            z = true;
        }
        Objects.requireNonNull(gVar);
        C83085d dVar = new C83085d(gVar);
        Objects.requireNonNull(eVar);
        C83080bg.m132479c(z, dVar, new C83086e(eVar), C83087f.f226697a);
        return (C80394g) eVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
