package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.p2228a.C28694b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ao */
/* compiled from: PG */
public final /* synthetic */ class C103915ao implements Function {

    /* renamed from: a */
    public final /* synthetic */ C103923aw f289238a;

    public /* synthetic */ C103915ao(C103923aw awVar) {
        this.f289238a = awVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58833ax axVar;
        C103923aw awVar = this.f289238a;
        C29690f fVar = (C29690f) obj;
        if ((fVar.f80410a & 4) != 0) {
            axVar = C58833ax.m90833j(C28694b.m53576a(fVar.f80413d));
        } else {
            axVar = C58836b.f156633a;
        }
        C22871g gVar = awVar.f289255g;
        C58485gu q = C58485gu.m89849q(new C103917aq(awVar, fVar), new C103918ar(fVar), new C103919as(awVar, fVar), new C103920at(awVar, fVar));
        C22871g gVar2 = awVar.f289255g;
        Boolean bool = Boolean.TRUE;
        Objects.requireNonNull(bool);
        C60870cx i = awVar.f289255g.mo28209i(C80905at.m128761e(gVar2, "[NGA] check whether a group can be deleted", new C103921au(bool), q), "[NGA] empty to false", C103922av.f289248a);
        String str = fVar.f80411b;
        return gVar.mo28210j(i, "[NGA] deleting the group ".concat(String.valueOf(str)), new C103911ak(awVar, fVar, axVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
