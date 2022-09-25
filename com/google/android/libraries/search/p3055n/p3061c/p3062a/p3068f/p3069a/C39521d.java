package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.n.c.a.f.a.d */
/* compiled from: PG */
public final /* synthetic */ class C39521d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C39526i f104064a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f104065b;

    public /* synthetic */ C39521d(C39526i iVar, AccountId accountId) {
        this.f104064a = iVar;
        this.f104065b = accountId;
    }

    public final Object call() {
        C39526i iVar = this.f104064a;
        AccountId accountId = this.f104065b;
        ((C59052c) ((C59052c) C39526i.f104079a.mo56224b()).mo56372aa(53692)).mo56389s("Getting an AppFlow logger associated with accountId %s", accountId);
        iVar.f104083e = ((C39526i.C39527a) C47245e.m84045a(iVar.f104081c, C39526i.C39527a.class, accountId)).mo41874eR();
        return null;
    }
}
