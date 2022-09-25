package com.google.android.libraries.p10985af.p10986a.p10987a.p10988a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.p4184bj.p4193c.p4197c.C55958be;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;

/* renamed from: com.google.android.libraries.af.a.a.a.a */
/* compiled from: PG */
public final class C147478a {

    /* renamed from: a */
    private final C143658k f398096a;

    public C147478a(Context context) {
        this.f398096a = new C143658k(context, "FPOP_CLIENT", (String) null);
    }

    /* renamed from: a */
    public final void mo124229a(int i, C55958be beVar) {
        C143657j d = this.f398096a.mo118999d(beVar);
        C58149a aVar = d.f389461c;
        aVar.copyOnWrite();
        C58150b bVar = (C58150b) aVar.instance;
        C58150b bVar2 = C58150b.f155459k;
        bVar.f155461a |= 16;
        bVar.f155464d = i - 1;
        d.mo118992a();
    }

    public C147478a(Context context, Account account) {
        this.f398096a = new C143658k(context, "FPOP_CLIENT", account.name);
    }
}
