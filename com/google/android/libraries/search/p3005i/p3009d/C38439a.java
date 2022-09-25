package com.google.android.libraries.search.p3005i.p3009d;

import android.accounts.Account;
import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.search.i.d.a */
/* compiled from: PG */
public final class C38439a implements C21758b {

    /* renamed from: a */
    private final C58528ij f101742a;

    public C38439a(C58528ij ijVar) {
        this.f101742a = ijVar;
    }

    /* renamed from: a */
    public final C60870cx mo27092a(Account account, C65753ak akVar) {
        return C60856cj.m92900i(true);
    }

    /* renamed from: c */
    public final boolean mo27093c(C65753ak akVar) {
        if (!this.f101742a.contains(akVar)) {
            return false;
        }
        C65753ak akVar2 = C65753ak.UNKNOWN;
        int ordinal = akVar.ordinal();
        if (ordinal == 45 || ordinal == 114) {
            return true;
        }
        return false;
    }
}
