package com.google.android.apps.gsa.sidekick.main.p7224p;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.proactive.C84174j;
import com.google.android.apps.gsa.proactive.C84175k;
import com.google.android.apps.gsa.proactive.C84179o;
import com.google.android.apps.gsa.proactive.p6474a.C84156a;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.sidekick.main.p.k */
/* compiled from: PG */
public final /* synthetic */ class C91585k implements C118549h {

    /* renamed from: a */
    public final /* synthetic */ C84175k f255452a;

    /* renamed from: b */
    public final /* synthetic */ C22871g f255453b;

    /* renamed from: c */
    public final /* synthetic */ C84156a f255454c;

    /* renamed from: d */
    public final /* synthetic */ C84174j f255455d;

    public /* synthetic */ C91585k(C84175k kVar, C22871g gVar, C84156a aVar, C84174j jVar) {
        this.f255452a = kVar;
        this.f255453b = gVar;
        this.f255454c = aVar;
        this.f255455d = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C84175k kVar = this.f255452a;
        C22871g gVar = this.f255453b;
        C84156a aVar = this.f255454c;
        C84174j jVar = this.f255455d;
        C58976aa aaVar = C58975e.f156826a;
        C118522by byVar = C118522by.UNKNOWN;
        C84179o a = kVar.mo77638a(akVar);
        if (a == null) {
            return gVar.mo28210j(aVar.mo77584c(), "contextFenceTransitions", new C91584j(jVar, aVar));
        }
        jVar.mo77636e(a);
        return C118826c.f331423b;
    }
}
