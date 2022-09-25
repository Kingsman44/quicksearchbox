package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7463d;

import com.google.android.apps.gsa.p6486s.C84265e;
import com.google.android.apps.gsa.p6486s.C84267g;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38354e;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38355f;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38358i;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.d.d */
/* compiled from: PG */
public final /* synthetic */ class C94780d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C94783g f265014a;

    /* renamed from: b */
    public final /* synthetic */ C52176ia f265015b;

    /* renamed from: c */
    public final /* synthetic */ boolean f265016c;

    public /* synthetic */ C94780d(C94783g gVar, C52176ia iaVar, boolean z) {
        this.f265014a = gVar;
        this.f265015b = iaVar;
        this.f265016c = z;
    }

    public final C60870cx apply(Object obj) {
        C94783g gVar = this.f265014a;
        C52176ia iaVar = this.f265015b;
        boolean z = this.f265016c;
        C84274n nVar = (C84274n) gVar.f265025f.mo27525b();
        if (!((C52176ia) obj).equals(iaVar)) {
            C84265e eVar = new C84265e();
            eVar.mo77768d(iaVar);
            C38354e eVar2 = (C38354e) C38355f.f101543s.createBuilder();
            eVar2.copyOnWrite();
            C38355f fVar = (C38355f) eVar2.instance;
            fVar.f101546b = 1;
            fVar.f101545a |= 1;
            eVar2.copyOnWrite();
            C38355f fVar2 = (C38355f) eVar2.instance;
            fVar2.f101555k = 3;
            fVar2.f101545a |= 512;
            C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
            baVar.mo58885m(C38358i.f101564a, (C38355f) eVar2.build());
            eVar.f229323a = C58833ax.m90834k(new C84267g((C88431bb) baVar.build()));
            eVar.mo77766b(z);
            eVar.mo77767c(true);
            eVar.f229325c = C58833ax.m90834k("opa");
            return nVar.mo77789e(eVar.mo77765a());
        } else if (z) {
            return nVar.mo77787c(C84269i.PLAY);
        } else {
            return C60856cj.m92900i(C84272l.SUCCESS);
        }
    }
}
