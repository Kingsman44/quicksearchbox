package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.gsa.nga.engine.p6038j.C76194i;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9373a.C124384d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.b */
/* compiled from: PG */
public final /* synthetic */ class C76187b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C76194i f211184a;

    /* renamed from: b */
    public final /* synthetic */ C76188c f211185b;

    public /* synthetic */ C76187b(C76194i iVar, C76188c cVar) {
        this.f211184a = iVar;
        this.f211185b = cVar;
    }

    public final Object apply(Object obj) {
        C76194i iVar = this.f211184a;
        C76188c cVar = this.f211185b;
        AccountId accountId = (AccountId) obj;
        C124384d aw = ((C76194i.C76195a) C47245e.m84045a(iVar.f211200c, C76194i.C76195a.class, accountId)).mo72122aw();
        aw.mo106411d(new C76193h(iVar, cVar, aw, accountId));
        return aw;
    }
}
