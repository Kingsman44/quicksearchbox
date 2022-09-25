package com.google.android.apps.gsa.nga.engine.p6056o.p6095g;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80425e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80426f;
import com.google.p4242bp.p4257f.p4262c.C56340b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g.n */
/* compiled from: PG */
public final /* synthetic */ class C77401n implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C77401n f213419a = new C77401n();

    private /* synthetic */ C77401n() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C77402o.f213420c;
        C80425e eVar = (C80425e) C80426f.f220738f.createBuilder();
        C62963cj<C56340b> cjVar = new C62963cj(((C80426f) obj).f220740a, C80426f.f220736b);
        eVar.copyOnWrite();
        C80426f fVar = (C80426f) eVar.instance;
        C62961ch chVar = fVar.f220740a;
        if (!chVar.mo58948c()) {
            fVar.f220740a = C62942bv.mutableCopy(chVar);
        }
        for (C56340b number : cjVar) {
            fVar.f220740a.mo58916g(number.getNumber());
        }
        return (C80426f) eVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
