package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.bh */
/* compiled from: PG */
public final /* synthetic */ class C86027bh implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f232587a;

    public /* synthetic */ C86027bh(C58495hd hdVar) {
        this.f232587a = hdVar;
    }

    public final Object call() {
        C58495hd hdVar = this.f232587a;
        C58490gz gzVar = new C58490gz(4);
        C58800sl lA = hdVar.keySet().iterator();
        while (lA.hasNext()) {
            Account account = (Account) lA.next();
            try {
                C60870cx cxVar = (C60870cx) hdVar.get(account);
                if (cxVar != null && cxVar.isDone()) {
                    gzVar.mo55429h(account, (Boolean) C60856cj.m92909r(cxVar));
                }
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) C86029bj.f232589a.mo56226d()).mo56382g(e)).mo56372aa(8066)).mo56386p("Failed to get SAA Status.");
            }
        }
        return gzVar.mo55427f(false);
    }
}
