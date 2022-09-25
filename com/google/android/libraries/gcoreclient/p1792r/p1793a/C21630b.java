package com.google.android.libraries.gcoreclient.p1792r.p1793a;

import android.accounts.Account;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.lockbox.C144981c;
import com.google.android.gms.lockbox.internal.C144986b;
import com.google.android.gms.lockbox.internal.C144987c;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21539g;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21544l;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.r.a.b */
/* compiled from: PG */
public final class C21630b {
    public C21630b() {
        new C21544l();
    }

    /* renamed from: a */
    public static final C21539g m40751a(C21529b bVar, Account account) {
        C143841m mVar = C144981c.f391951a;
        C143851w c = C21544l.m40656c(bVar);
        return new C21539g(c.mo119159d(new C144986b(c, account)), C21635g.f59988a);
    }

    /* renamed from: b */
    public static final C21539g m40752b(C21529b bVar, Account account, C21632d dVar) {
        C143841m mVar = C144981c.f391951a;
        C143851w c = C21544l.m40656c(bVar);
        return C21544l.m40655b(c.mo119160e(new C144987c(c, account, dVar.f59987a)));
    }
}
