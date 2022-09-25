package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4283bv.p4354e.C57051b;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.bp */
/* compiled from: PG */
public final /* synthetic */ class C98088bp implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C98102cc f273861a;

    public /* synthetic */ C98088bp(C98102cc ccVar) {
        this.f273861a = ccVar;
    }

    public final Object apply(Object obj) {
        C98102cc ccVar = this.f273861a;
        Boolean bool = (Boolean) obj;
        if (!ccVar.f273903k.mo79746e(C90010bp.f247009u) || bool == null || !bool.booleanValue()) {
            return C58836b.f156633a;
        }
        synchronized (ccVar.f273894b) {
            if (ccVar.f273903k.mo79746e(C90010bp.f246923S)) {
                C57051b bVar = (C57051b) ccVar.f273882C.f273875a;
                C57051b bVar2 = (C57051b) ccVar.f273881B.f273875a;
                if (bVar2 != null && !bVar2.equals(bVar)) {
                    ccVar.f273884E.mo90950a(bVar2);
                    C90875ai.m148465b(new C98082bj(), ccVar.mo85626l(), ccVar.f273902j, "persistDiscard").mo85223a(C98083bk.f273855a);
                }
                C58833ax j = C58833ax.m90833j(bVar);
                return j;
            }
            C58833ax j2 = C58833ax.m90833j((C57051b) ccVar.f273881B.f273875a);
            return j2;
        }
    }
}
