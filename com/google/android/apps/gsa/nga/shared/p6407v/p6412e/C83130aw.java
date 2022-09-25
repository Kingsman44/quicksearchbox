package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80433m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80434n;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83080bg;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.aw */
/* compiled from: PG */
public final /* synthetic */ class C83130aw implements Function {

    /* renamed from: a */
    public final /* synthetic */ C83145bk f226741a;

    public /* synthetic */ C83130aw(C83145bk bkVar) {
        this.f226741a = bkVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C83145bk bkVar = this.f226741a;
        C80434n nVar = (C80434n) obj;
        C80433m mVar = (C80433m) C80434n.f220756h.createBuilder();
        int i = nVar.f220758a;
        Objects.requireNonNull(nVar);
        C83127at atVar = new C83127at(nVar);
        Objects.requireNonNull(mVar);
        boolean z = true;
        C83080bg.m132479c(1 == (i & 1), atVar, new C83128au(mVar), bkVar.f226755a);
        boolean z2 = (nVar.f220758a & 4) != 0;
        Objects.requireNonNull(nVar);
        C83129av avVar = new C83129av(nVar);
        Objects.requireNonNull(mVar);
        C83080bg.m132479c(z2, avVar, new C83131ax(mVar), new C83132ay(bkVar));
        boolean z3 = (nVar.f220758a & 2) != 0;
        Objects.requireNonNull(nVar);
        C83133az azVar = new C83133az(nVar);
        Objects.requireNonNull(mVar);
        C83080bg.m132478b(z3, azVar, new C83135ba(mVar));
        if ((nVar.f220758a & 32) == 0) {
            z = false;
        }
        Objects.requireNonNull(nVar);
        C83136bb bbVar = new C83136bb(nVar);
        Objects.requireNonNull(mVar);
        C83080bg.m132478b(z, bbVar, new C83137bc(mVar));
        return (C80434n) mVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
