package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6085f;

import com.google.android.apps.gsa.nga.engine.am.h.bf;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.f.g */
/* compiled from: PG */
public final /* synthetic */ class C76884g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76889l f212316a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212317b;

    public /* synthetic */ C76884g(C76889l lVar, C74965n nVar) {
        this.f212316a = lVar;
        this.f212317b = nVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76889l lVar = this.f212316a;
        C74965n nVar = this.f212317b;
        df dfVar = (df) obj;
        C22871g gVar = lVar.f212330d;
        C58485gu a = dfVar.a();
        bf bfVar = lVar.f212328b;
        Objects.requireNonNull(bfVar);
        return gVar.mo28210j(C80905at.m128762f(a, new C76887j(bfVar)), "[NGA] post getting display names", new C76888k(lVar, nVar, dfVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
