package com.google.android.apps.search.googleapp.incognito.p10329g;

import com.google.android.apps.search.googleapp.incognito.p10320b.p10321a.C136231b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58817ah;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.y */
/* compiled from: PG */
public final /* synthetic */ class C136336y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136337z f371205a;

    public /* synthetic */ C136336y(C136337z zVar) {
        this.f371205a = zVar;
    }

    public final Object apply(Object obj) {
        C136337z zVar = this.f371205a;
        C136231b bVar = (C136231b) obj;
        long b = zVar.f371209d.mo26870b() - bVar.f371013b;
        if (b > zVar.f371215j && b < zVar.f371216k && zVar.mo112925a() == null) {
            AccountId accountId = zVar.f371207b;
            C136318h hVar = new C136318h();
            C68324h.m98669f(hVar);
            C47247a.m84047b(hVar, accountId);
            C47243l.m84039a(hVar, bVar);
            hVar.showNow(zVar.f371208c.getChildFragmentManager(), "incognito_resume_background");
        }
        return bVar;
    }
}
