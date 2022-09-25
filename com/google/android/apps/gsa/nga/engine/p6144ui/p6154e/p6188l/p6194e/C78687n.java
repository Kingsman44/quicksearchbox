package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.n */
/* compiled from: PG */
public final /* synthetic */ class C78687n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C78688o f216612a;

    public /* synthetic */ C78687n(C78688o oVar) {
        this.f216612a = oVar;
    }

    public final Object apply(Object obj) {
        C78688o oVar = this.f216612a;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.size() >= 2) {
            return guVar;
        }
        if (oVar.f216616d.mo85405j(C90040cs.f248669h)) {
            int size = guVar.size();
            int i = 0;
            while (i < size) {
                C80590x a = C80590x.m128211a(((C80581o) guVar.get(i)).f221191a);
                if (a == null) {
                    a = C80590x.UNRECOGNIZED;
                }
                i++;
                if (a == C80590x.LENS) {
                    return guVar;
                }
            }
        }
        return C58485gu.m89845m();
    }
}
