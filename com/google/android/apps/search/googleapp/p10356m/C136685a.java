package com.google.android.apps.search.googleapp.p10356m;

import android.accounts.Account;
import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.m.a */
/* compiled from: PG */
public final class C136685a implements C21758b {

    /* renamed from: a */
    private final boolean f372060a;

    /* renamed from: b */
    private final boolean f372061b;

    public C136685a(boolean z, boolean z2) {
        this.f372060a = z;
        this.f372061b = z2;
    }

    /* renamed from: a */
    public final C60870cx mo27092a(Account account, C65753ak akVar) {
        C69664n.m101061g(account, "account");
        C69664n.m101061g(akVar, "gellerCorpus");
        return C60856cj.m92900i(false);
    }

    /* renamed from: c */
    public final boolean mo27093c(C65753ak akVar) {
        C69664n.m101061g(akVar, "corpus");
        C65753ak akVar2 = C65753ak.UNKNOWN;
        int ordinal = akVar.ordinal();
        if (ordinal == 76) {
            return this.f372061b;
        }
        if (ordinal != 116) {
            return false;
        }
        return this.f372060a;
    }
}
