package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8514l;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111053cn;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48678am;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48645f;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.l.f */
/* compiled from: PG */
public final /* synthetic */ class C111556f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C111565o f310263a;

    public /* synthetic */ C111556f(C111565o oVar) {
        this.f310263a = oVar;
    }

    public final Object apply(Object obj) {
        C111565o oVar = this.f310263a;
        C48678am amVar = (C48678am) obj;
        Optional c = oVar.f310280d.mo99532c(oVar.f310278b.mo79746e(C90063do.f249341bh));
        if (c.isPresent()) {
            return C60856cj.m92900i(C111565o.m185323b((C48645f) c.get()));
        }
        C58528ij ijVar = (C58528ij) Collection.EL.stream(amVar.f125939a).filter(C111563m.f310274a).map(C111564n.f310275a).collect(C58370cn.f155947b);
        String F = oVar.f310286j.f313527a.mo79659F();
        if (F == null) {
            return C60856cj.m92900i(C58733pz.f156496a);
        }
        C22871g gVar = oVar.f310277a;
        C111053cn cnVar = oVar.f310281e;
        C58976aa aaVar = C58975e.f156826a;
        return gVar.mo28209i(cnVar.mo99036a(F, Optional.m71637of(ijVar)), "get map from optional signal", new C111552b(oVar));
    }
}
