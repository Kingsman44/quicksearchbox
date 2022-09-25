package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.a.dn;
import com.google.android.apps.gsa.nga.api.p5883a.C74679dm;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.al */
/* compiled from: PG */
public final /* synthetic */ class C81395al implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81400aq f222751a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f222752b;

    public /* synthetic */ C81395al(C81400aq aqVar, C37672hs hsVar) {
        this.f222751a = aqVar;
        this.f222752b = hsVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81400aq aqVar = this.f222751a;
        C37672hs hsVar = this.f222752b;
        dn dnVar = (dn) obj;
        int i = dnVar.a;
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                int c = C74679dm.m120753c(((Integer) dnVar.b).intValue());
                if (c != 0) {
                    i2 = c;
                }
            } else {
                i2 = 2;
            }
            ((C58970a) ((C58970a) C81400aq.f222762a.mo56224b()).mo56372aa(5906)).mo56354G("Watch invocation(token:%s) got rejected with status %s.", C81062c.m129010a(Optional.m71637of(hsVar)), C74679dm.m120751a(i2));
            aqVar.mo75057c(hsVar, i2);
            aqVar.f222766e.mo75059g(hsVar);
            return;
        }
        C81062c.m129010a(Optional.m71637of(hsVar));
        aqVar.f222767f.mo74836f();
    }
}
