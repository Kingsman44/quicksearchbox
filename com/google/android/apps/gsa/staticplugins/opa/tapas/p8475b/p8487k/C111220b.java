package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8487k;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.assistant.p3860as.C49740ac;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.k.b */
/* compiled from: PG */
public final /* synthetic */ class C111220b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111221c f309521a;

    public /* synthetic */ C111220b(C111221c cVar) {
        this.f309521a = cVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        long b = this.f309521a.f309525d.mo26870b();
        if (guVar.isEmpty()) {
            C59104x d = C111221c.f309522a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HabitSignalFetcher");
            ((C59052c) ((C59052c) d).mo56372aa(27136)).mo56386p("#getHabitProfileSignal: profileList is empty.");
            C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
            bvVar.copyOnWrite();
            ((C48635bx) bvVar.instance).f125708c = b;
            return (C48635bx) bvVar.build();
        }
        C58976aa aaVar = C58975e.f156826a;
        C48633bv bvVar2 = (C48633bv) C48635bx.f125704d.createBuilder();
        bvVar2.copyOnWrite();
        ((C48635bx) bvVar2.instance).f125708c = b;
        C49740ac acVar = (C49740ac) guVar.get(0);
        bvVar2.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar2.instance;
        acVar.getClass();
        bxVar.f125707b = acVar;
        bxVar.f125706a = 3;
        return (C48635bx) bvVar2.build();
    }
}
