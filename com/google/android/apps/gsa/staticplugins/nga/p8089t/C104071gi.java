package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80617l;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.gi */
/* compiled from: PG */
public final /* synthetic */ class C104071gi implements Function {

    /* renamed from: a */
    public final /* synthetic */ C104073gk f289555a;

    /* renamed from: b */
    public final /* synthetic */ C29409fd f289556b;

    public /* synthetic */ C104071gi(C104073gk gkVar, C29409fd fdVar) {
        this.f289555a = gkVar;
        this.f289556b = fdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C104073gk gkVar = this.f289555a;
        C29409fd fdVar = this.f289556b;
        C28708an anVar = (C28708an) obj;
        String str = anVar.f77997b;
        int i = anVar.f77999d;
        C58480gp e = C58485gu.m89837e();
        C58833ax j = C58833ax.m90833j(gkVar.f289561c.mo79668a());
        e.mo55395g(gkVar.mo93935a(fdVar, anVar, C58836b.f156633a));
        if (C80617l.m128238g(anVar.f77997b) && j.mo56113h()) {
            e.mo55395g(gkVar.mo93935a(fdVar, anVar, j));
        }
        return gkVar.f289559a.mo28209i(C60856cj.m92896e(e.mo55394f()), "[NGA] NgaSotFileGroupPopulator.refreshFileGroups.logResult", C104068gf.f289550a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
