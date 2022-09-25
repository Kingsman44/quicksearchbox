package com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a;

import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33719m;
import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33720n;
import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33721o;
import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.assistant.platform.c.b.a.a.w */
/* compiled from: PG */
final class C120107w implements C33720n {

    /* renamed from: a */
    final /* synthetic */ C120109y f334330a;

    /* renamed from: b */
    final /* synthetic */ C33721o f334331b;

    /* renamed from: c */
    final /* synthetic */ C33719m f334332c;

    public C120107w(C120109y yVar, C33721o oVar, C33719m mVar) {
        this.f334330a = yVar;
        this.f334331b = oVar;
        this.f334332c = mVar;
    }

    /* renamed from: a */
    public final void mo39038a() {
        C120109y yVar = this.f334330a;
        C33721o oVar = this.f334331b;
        C33719m mVar = this.f334332c;
        C59052c cVar = (C59052c) C120109y.f334334a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.SettingsChangeListener");
        String c = C33914a.m62568c(mVar);
        String name = oVar.name();
        cVar.mo56379ah(new C59094n(34655));
        cVar.mo56354G("Removing a %s for type %s.", c, name);
        Map.EL.compute(yVar.f334335b, oVar, new C120108x(mVar));
    }
}
