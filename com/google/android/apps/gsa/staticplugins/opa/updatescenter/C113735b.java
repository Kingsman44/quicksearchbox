package com.google.android.apps.gsa.staticplugins.opa.updatescenter;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.updatescenter.b */
/* compiled from: PG */
public final /* synthetic */ class C113735b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C113742i f314980a;

    public /* synthetic */ C113735b(C113742i iVar) {
        this.f314980a = iVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C113742i iVar = this.f314980a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            return iVar.f314990c.mo28209i(iVar.f314989b.mo96351B(), "Read UpdatesCenterUpdatesCenterQueue information from local storage.", new C113734a(iVar, (C50638an) axVar.mo56107c()));
        }
        C58976aa aaVar = C58975e.f156826a;
        return iVar.f314990c.mo28209i(iVar.f314989b.mo96350A(), "Read UpdatesCenterFirstAccess information from local storage.", C113738e.f314983a);
    }
}
