package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80414af;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80417ai;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83077bd;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83078be;
import com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a.C83080bg;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.an */
/* compiled from: PG */
public final /* synthetic */ class C83121an implements Function {

    /* renamed from: a */
    public final /* synthetic */ C83145bk f226732a;

    public /* synthetic */ C83121an(C83145bk bkVar) {
        this.f226732a = bkVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C83145bk bkVar = this.f226732a;
        C80417ai aiVar = (C80417ai) obj;
        C80414af afVar = (C80414af) C80417ai.f220707g.createBuilder();
        int i = aiVar.f220709a;
        Objects.requireNonNull(aiVar);
        C83141bg bgVar = new C83141bg(aiVar);
        Objects.requireNonNull(afVar);
        boolean z = true;
        C83080bg.m132479c(1 == (i & 1), bgVar, new C83142bh(afVar), C83077bd.f226687a);
        boolean z2 = (aiVar.f220709a & 4) != 0;
        Objects.requireNonNull(aiVar);
        C83143bi biVar = new C83143bi(aiVar);
        Objects.requireNonNull(afVar);
        C83080bg.m132479c(z2, biVar, new C83144bj(afVar), bkVar.f226756b);
        boolean z3 = (aiVar.f220709a & 8) != 0;
        Objects.requireNonNull(afVar);
        C83080bg.m132478b(z3, C83078be.f226688a, new C83109ab(afVar));
        boolean z4 = (aiVar.f220709a & 32) != 0;
        C83110ac acVar = C83110ac.f226721a;
        Objects.requireNonNull(afVar);
        C83080bg.m132478b(z4, acVar, new C83111ad(afVar));
        if ((aiVar.f220709a & 16) == 0) {
            z = false;
        }
        C83112ae aeVar = C83112ae.f226723a;
        Objects.requireNonNull(afVar);
        C83080bg.m132478b(z, aeVar, new C83113af(afVar));
        return (C80417ai) afVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
