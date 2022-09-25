package com.google.android.apps.gsa.assist;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;

/* renamed from: com.google.android.apps.gsa.assist.bo */
/* compiled from: PG */
final class C9374bo extends C86052m {

    /* renamed from: a */
    final /* synthetic */ C9397cb f32534a;

    public C9374bo(C9397cb cbVar) {
        this.f32534a = cbVar;
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        C9397cb cbVar = this.f32534a;
        cbVar.setDisabledShowContext(cbVar.mo17594a(account));
    }
}
