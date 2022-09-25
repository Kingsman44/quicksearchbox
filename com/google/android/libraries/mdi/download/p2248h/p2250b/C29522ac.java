package com.google.android.libraries.mdi.download.p2248h.p2250b;

import android.accounts.Account;
import com.google.android.libraries.geller.p1818f.p1819a.C21790e;
import com.google.android.libraries.geller.portable.C21942ah;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.mdi.download.h.b.ac */
/* compiled from: PG */
public final /* synthetic */ class C29522ac implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29538as f80003a;

    /* renamed from: b */
    public final /* synthetic */ C58872ci f80004b;

    /* renamed from: c */
    public final /* synthetic */ Account f80005c;

    /* renamed from: d */
    public final /* synthetic */ C65753ak f80006d;

    public /* synthetic */ C29522ac(C29538as asVar, C58872ci ciVar, Account account, C65753ak akVar) {
        this.f80003a = asVar;
        this.f80004b = ciVar;
        this.f80005c = account;
        this.f80006d = akVar;
    }

    public final C60870cx apply(Object obj) {
        C29538as asVar = this.f80003a;
        C58872ci ciVar = this.f80004b;
        Account account = this.f80005c;
        C65753ak akVar = this.f80006d;
        C58495hd hdVar = (C58495hd) obj;
        C21942ah ahVar = asVar.f80063j;
        long a = ciVar.mo56158a(TimeUnit.MILLISECONDS);
        C65813cq cqVar = C65813cq.PERIODIC;
        String str = account.name;
        C21790e.m40906a(ahVar, hdVar, a, cqVar);
        return C29538as.m54520c(hdVar, akVar);
    }
}
