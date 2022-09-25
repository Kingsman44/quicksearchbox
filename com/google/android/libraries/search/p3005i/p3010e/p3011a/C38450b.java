package com.google.android.libraries.search.p3005i.p3010e.p3011a;

import com.google.android.libraries.search.p3005i.C38469m;
import com.google.protos.p5129p.p5130a.C65707af;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.i.e.a.b */
/* compiled from: PG */
public final /* synthetic */ class C38450b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C38453e f101768a;

    public /* synthetic */ C38450b(C38453e eVar) {
        this.f101768a = eVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C65707af afVar = (C65707af) obj;
        C38469m mVar = this.f101768a.f101775b;
        C65753ak b = C65753ak.m96797b(afVar.f178517b);
        if (b == null) {
            b = C65753ak.UNKNOWN;
        }
        C65768az azVar = afVar.f178518c;
        if (azVar == null) {
            azVar = C65768az.f178793f;
        }
        return mVar.mo41434e(b, azVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
