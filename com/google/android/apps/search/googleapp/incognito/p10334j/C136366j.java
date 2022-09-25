package com.google.android.apps.search.googleapp.incognito.p10334j;

import android.view.View;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.incognito.j.j */
/* compiled from: PG */
final class C136366j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C136365i f371268a;

    public C136366j(C136365i iVar) {
        this.f371268a = iVar;
    }

    public final void onClick(View view) {
        C136365i iVar = this.f371268a;
        AccountId accountId = iVar.f371267b;
        C136358b bVar = new C136358b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        bVar.showNow(iVar.f371266a.getChildFragmentManager(), "topbarDialog");
    }
}
