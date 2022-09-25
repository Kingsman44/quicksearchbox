package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import android.util.Base64;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.research.p5181a.p5183b.p5184a.C66302c;
import java.util.Map;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.cg */
/* compiled from: PG */
public final /* synthetic */ class C112366cg implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112367ch f311786a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311787b;

    /* renamed from: c */
    public final /* synthetic */ Map f311788c;

    public /* synthetic */ C112366cg(C112367ch chVar, C113405ep epVar, Map map) {
        this.f311786a = chVar;
        this.f311787b = epVar;
        this.f311788c = map;
    }

    public final Object get() {
        C112367ch chVar = this.f311786a;
        C113405ep epVar = this.f311787b;
        Map map = this.f311788c;
        C66302c cVar = new C66302c();
        C112365cf.m186224a(epVar, map, chVar.f311790b, cVar, chVar.f311791c.mo99464a());
        C58976aa aaVar = C58975e.f156826a;
        Base64.encodeToString(cVar.mo59462e(), 2);
        return cVar;
    }
}
