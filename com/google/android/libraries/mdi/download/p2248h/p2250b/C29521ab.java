package com.google.android.libraries.mdi.download.p2248h.p2250b;

import android.accounts.Account;
import com.google.android.libraries.geller.p1818f.C21836bs;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65813cq;

/* renamed from: com.google.android.libraries.mdi.download.h.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C29521ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29538as f79999a;

    /* renamed from: b */
    public final /* synthetic */ Account f80000b;

    /* renamed from: c */
    public final /* synthetic */ String f80001c;

    /* renamed from: d */
    public final /* synthetic */ C65753ak f80002d;

    public /* synthetic */ C29521ab(C29538as asVar, Account account, String str, C65753ak akVar) {
        this.f79999a = asVar;
        this.f80000b = account;
        this.f80001c = str;
        this.f80002d = akVar;
    }

    public final C60870cx apply(Object obj) {
        C29538as asVar = this.f79999a;
        Account account = this.f80000b;
        String str = this.f80001c;
        C65753ak akVar = this.f80002d;
        C21836bs bsVar = (C21836bs) obj;
        if (asVar.f80065l.mo56113h()) {
            return bsVar.mo27141b(account, str, (String) asVar.f80065l.mo56107c(), new C58759qy(akVar), C65813cq.PERIODIC, 4, true);
        }
        return bsVar.mo27141b(account, str, (String) null, new C58759qy(akVar), C65813cq.PERIODIC, 4, true);
    }
}
