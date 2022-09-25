package com.google.android.libraries.gcoreclient.p1759f.p1760a;

import android.accounts.Account;
import com.google.android.gms.awareness.C142929d;
import com.google.android.gms.common.api.C143721f;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21527a;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21533a;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.f.a.k */
/* compiled from: PG */
public final class C21509k implements C21533a, C21527a {

    /* renamed from: a */
    private final C142929d f59925a;

    public C21509k(C142929d dVar) {
        this.f59925a = dVar;
    }

    public C21509k(String str) {
        C143919bh.m233969l(str);
        this.f59925a = new C142929d(str, (Account) null);
    }

    /* renamed from: a */
    public final C143721f mo26938a() {
        return this.f59925a;
    }
}
