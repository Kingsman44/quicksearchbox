package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C29343e;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.gk */
/* compiled from: PG */
public final class C104073gk implements C28746bx {

    /* renamed from: d */
    private static final C58974d f289558d = C58974d.m91136j();

    /* renamed from: a */
    public final C22871g f289559a;

    /* renamed from: b */
    public final C104126w f289560b;

    /* renamed from: c */
    public final C86054o f289561c;

    /* renamed from: e */
    private final C103943bp f289562e;

    /* renamed from: f */
    private final C104079gq f289563f;

    public C104073gk(C103943bp bpVar, C104079gq gqVar, C22871g gVar, C104126w wVar, C86054o oVar) {
        this.f289562e = bpVar;
        this.f289563f = gqVar;
        this.f289559a = gVar;
        this.f289560b = wVar;
        this.f289561c = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo93935a(C29409fd fdVar, C28708an anVar, C58833ax axVar) {
        C29343e eVar = new C29343e();
        eVar.mo34326b(anVar);
        eVar.f79533b = axVar;
        return this.f289559a.mo28209i(fdVar.mo34712a(eVar.mo34325a()), "[NGA] NgaSotFileGroupPopulator.logResult", new C104067ge(this, anVar, axVar.mo56113h()));
    }

    /* renamed from: b */
    public final C60870cx mo19336b(C29409fd fdVar) {
        ((C58970a) ((C58970a) f289558d.mo56224b()).mo56372aa(21773)).mo56386p("refreshFileGroups called");
        return mo93936c(fdVar, C58733pz.f156496a);
    }

    /* renamed from: c */
    public final C60870cx mo93936c(C29409fd fdVar, C58528ij ijVar) {
        if (!this.f289563f.mo93938a()) {
            return C60866ct.f164955a;
        }
        ((C58970a) ((C58970a) f289558d.mo56224b()).mo56372aa(21774)).mo56386p("refreshFileGroupsSkipping called");
        return this.f289559a.mo28210j(this.f289562e.mo93890c(), "[NGA] NgaSotFileGroupPopulator.refreshFileGroupsSkipping", new C104069gg(this, ijVar, fdVar));
    }
}
