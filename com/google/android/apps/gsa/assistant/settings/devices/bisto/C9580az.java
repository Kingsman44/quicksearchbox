package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C49886cq;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.az */
/* compiled from: PG */
public final /* synthetic */ class C9580az implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33184a;

    /* renamed from: b */
    public final /* synthetic */ C124620am f33185b;

    /* renamed from: c */
    public final /* synthetic */ Account f33186c;

    public /* synthetic */ C9580az(C9619ck ckVar, C124620am amVar, Account account) {
        this.f33184a = ckVar;
        this.f33185b = amVar;
        this.f33186c = account;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        boolean z;
        C9619ck ckVar = this.f33184a;
        C124620am amVar = this.f33185b;
        Account account = this.f33186c;
        C49893cx cxVar = ((act) obj).f128900g;
        if (cxVar == null) {
            cxVar = C49893cx.f129688b;
        }
        for (C49879cj cjVar : cxVar.f129690a) {
            if (cjVar.f129631b.equals(amVar.f343764b)) {
                C49891cv cvVar = cjVar.f129639j;
                if (cvVar == null) {
                    cvVar = C49891cv.f129647N;
                }
                int a = C49886cq.m85760a(cvVar.f129666d);
                boolean z2 = false;
                boolean z3 = a == 0 || a != 3;
                C49891cv cvVar2 = cjVar.f129639j;
                boolean z4 = (((cvVar2 == null ? C49891cv.f129647N : cvVar2).f129663a & 2) == 0 || amVar.f343766d == z3) ? false : true;
                boolean z5 = (cvVar2 == null ? C49891cv.f129647N : cvVar2).f129670h;
                if (cvVar2 == null) {
                    cvVar2 = C49891cv.f129647N;
                }
                if (!((cvVar2.f129663a & 1024) == 0 || amVar.f343767e == z5)) {
                    z2 = true;
                }
                if (z4) {
                    z = z2;
                } else if (!z2) {
                    return cjVar;
                } else {
                    z = true;
                }
                C59104x b = C9619ck.f33236i.mo56224b();
                b.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
                ((C59052c) ((C59052c) b).mo56372aa(417)).mo56358K("Updating PR=%s VM=%s from cloud", z3, z5);
                C89492cd cdVar = ckVar.f33277k;
                String str = ckVar.f33286t;
                str.getClass();
                cdVar.mo83380V(str, account.name, new C9613ce(ckVar, z4, z3, z, z5));
                C89492cd cdVar2 = ckVar.f33277k;
                String str2 = ckVar.f33286t;
                str2.getClass();
                new C90873ag(cdVar2.mo83408n(str2), ckVar.f33278l, "update-ui", new C9614cf(ckVar)).mo85223a(C9615cg.f33231a);
                return cjVar;
            }
        }
        return C49879cj.f129628l;
    }
}
