package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.sidekick.main.entry.C91307al;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import com.google.p375ai.p378b.C7744ii;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.bg */
/* compiled from: PG */
public final /* synthetic */ class C98079bg implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98102cc f273849a;

    public /* synthetic */ C98079bg(C98102cc ccVar) {
        this.f273849a = ccVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98102cc ccVar = this.f273849a;
        C118826c cVar = (C118826c) obj;
        synchronized (ccVar.f273894b) {
            C58976aa aaVar = C58975e.f156826a;
            ccVar.f273905m.mo85270f("invalidating", C90996e.f254198a);
            ccVar.f273910r.mo90950a((Object) null);
            ccVar.f273883D.mo90950a((Object) null);
            ccVar.f273916x.mo90950a((Object) null);
            ccVar.f273884E.mo90950a((Object) null);
            ccVar.mo90960I(1, (C7744ii) null, true);
            ccVar.mo90954C(Collections.emptyList(), true);
            ccVar.mo85635u((C7744ii) null);
            C98127i iVar = ccVar.f273908p;
            synchronized (iVar.f274021a) {
                iVar.f274022b.clear();
            }
        }
        C91307al alVar = (C91307al) ccVar.f273906n.mo17428b();
        alVar.mo85604e();
        return C60922j.m93045h(ccVar.f273896d.mo85607b(alVar), new C98094bv(ccVar), C60826bg.f164896a);
    }
}
