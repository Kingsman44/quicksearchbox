package com.google.android.apps.gsa.sidekick.main.p7199b;

import android.accounts.Account;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.lockbox.C144981c;
import com.google.android.gms.lockbox.internal.C144988d;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21544l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.sidekick.main.b.i */
/* compiled from: PG */
public final /* synthetic */ class C91269i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C91272l f254726a;

    /* renamed from: b */
    public final /* synthetic */ Account f254727b;

    public /* synthetic */ C91269i(C91272l lVar, Account account) {
        this.f254726a = lVar;
        this.f254727b = account;
    }

    public final Object call() {
        C91272l lVar = this.f254726a;
        Account account = this.f254727b;
        C21529b bVar = lVar.f253307n;
        String b = lVar.f254734b.mo79727b();
        C143841m mVar = C144981c.f391951a;
        C143851w c = C21544l.m40656c(bVar);
        C21551h hVar = (C21551h) C21544l.m40655b(c.mo119160e(new C144988d(c, account, b))).mo26994a();
        if (!hVar.mo27003f()) {
            C59104x d = C91272l.f254733a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "LockboxApiWrapper");
            ((C59052c) ((C59052c) d).mo56372aa(11518)).mo56387q("Failed to update active lockbox account: %d", hVar.mo26998a());
        }
        return hVar;
    }
}
