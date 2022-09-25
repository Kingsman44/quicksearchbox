package com.google.android.libraries.geller.p1818f;

import android.accounts.Account;
import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.geller.f.aj */
/* compiled from: PG */
public final /* synthetic */ class C21800aj implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60137a;

    /* renamed from: b */
    public final /* synthetic */ C21758b f60138b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f60139c;

    public /* synthetic */ C21800aj(C21826bi biVar, C21758b bVar, C65753ak akVar) {
        this.f60137a = biVar;
        this.f60138b = bVar;
        this.f60139c = akVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C21826bi biVar = this.f60137a;
        C21758b bVar = this.f60138b;
        C65753ak akVar = this.f60139c;
        if (biVar.f60218b.mo56113h()) {
            return bVar.mo27092a((Account) biVar.f60218b.mo56107c(), akVar);
        }
        return C60856cj.m92900i(true);
    }
}
