package com.google.android.apps.gsa.sidekick.main.p7224p;

import com.google.android.apps.gsa.proactive.C84174j;
import com.google.android.apps.gsa.proactive.C84179o;
import com.google.android.apps.gsa.proactive.p6474a.C84156a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.p.j */
/* compiled from: PG */
public final /* synthetic */ class C91584j implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C84174j f255450a;

    /* renamed from: b */
    public final /* synthetic */ C84156a f255451b;

    public /* synthetic */ C91584j(C84174j jVar, C84156a aVar) {
        this.f255450a = jVar;
        this.f255451b = aVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C84174j jVar = this.f255450a;
        C84156a aVar = this.f255451b;
        List list = (List) obj;
        C58976aa aaVar = C58975e.f156826a;
        list.size();
        C84179o[] oVarArr = (C84179o[]) list.toArray(new C84179o[list.size()]);
        Arrays.sort(oVarArr, C91586l.f255456a);
        jVar.mo77636e(oVarArr);
        return aVar.mo77583b(oVarArr);
    }
}
