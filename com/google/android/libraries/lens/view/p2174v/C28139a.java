package com.google.android.libraries.lens.view.p2174v;

import android.accounts.Account;
import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.android.libraries.lens.view.flags.C26242ac;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.lens.view.v.a */
/* compiled from: PG */
public final class C28139a implements C21758b {

    /* renamed from: a */
    private final C26243ad f76556a;

    public C28139a(C26243ad adVar) {
        this.f76556a = adVar;
    }

    /* renamed from: a */
    public final C60870cx mo27092a(Account account, C65753ak akVar) {
        return C60856cj.m92900i(true);
    }

    /* renamed from: c */
    public final boolean mo27093c(C65753ak akVar) {
        C65753ak akVar2 = C65753ak.UNKNOWN;
        int ordinal = akVar.ordinal();
        if (ordinal == 72) {
            return this.f76556a.mo31464k(C26242ac.ENABLE_GDD_LENS_TEXT_GELLER_SYNC);
        }
        if (ordinal != 78) {
            return false;
        }
        return this.f76556a.mo31464k(C26242ac.ENABLE_GDD_LENS_AVS_GELLER_SYNC);
    }
}
