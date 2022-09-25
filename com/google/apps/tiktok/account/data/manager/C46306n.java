package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.manager.p3615a.C46221b;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46226g;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.apps.tiktok.account.data.manager.n */
/* compiled from: PG */
public final /* synthetic */ class C46306n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AccountId f121290a;

    public /* synthetic */ C46306n(AccountId accountId) {
        this.f121290a = accountId;
    }

    public final Object apply(Object obj) {
        AccountId accountId = this.f121290a;
        C46222c cVar = (C46222c) obj;
        int a = accountId.mo50068a();
        C62995dn dnVar = cVar.f121177c;
        Integer valueOf = Integer.valueOf(a);
        if (dnVar.containsKey(valueOf)) {
            C46221b bVar = (C46221b) cVar.toBuilder();
            bVar.mo50270b(accountId.mo50068a());
            C46226g gVar = (C46226g) ((C46227h) dnVar.get(valueOf)).toBuilder();
            gVar.copyOnWrite();
            C46227h hVar = (C46227h) gVar.instance;
            hVar.f121188d = 2;
            hVar.f121185a |= 4;
            C46232ae.m82471g(bVar, gVar);
            return (C46222c) bVar.build();
        }
        throw new IllegalArgumentException();
    }
}
