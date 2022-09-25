package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.android.apps.gsa.nga.api.a.dn;
import com.google.android.apps.gsa.nga.api.p5883a.C74679dm;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81065f;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C81386ac implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81390ag f222725a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f222726b;

    /* renamed from: c */
    public final /* synthetic */ cf f222727c;

    public /* synthetic */ C81386ac(C81390ag agVar, C37672hs hsVar, cf cfVar) {
        this.f222725a = agVar;
        this.f222726b = hsVar;
        this.f222727c = cfVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81390ag agVar = this.f222725a;
        C37672hs hsVar = this.f222726b;
        cf cfVar = this.f222727c;
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
            ((C58970a) ((C58970a) C81390ag.f222734a.mo56224b()).mo56372aa(5901)).mo56359L("Rohan invocation (%s, %s) got rejected with status %s.", C81062c.m129010a(Optional.m71637of(hsVar)), C81065f.m129012a(cfVar), C74679dm.m120751a(i2));
            agVar.mo75055b(hsVar, i2);
            return;
        }
        C81062c.m129010a(Optional.m71637of(hsVar));
        C81065f.m129012a(cfVar);
        agVar.f222738e.mo74836f();
    }
}
