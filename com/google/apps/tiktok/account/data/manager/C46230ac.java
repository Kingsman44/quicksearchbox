package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.manager.p3615a.C46221b;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46226g;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.common.base.C58817ah;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.account.data.manager.ac */
/* compiled from: PG */
public final /* synthetic */ class C46230ac implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AccountId f121195a;

    /* renamed from: b */
    public final /* synthetic */ int f121196b;

    public /* synthetic */ C46230ac(AccountId accountId, int i) {
        this.f121195a = accountId;
        this.f121196b = i;
    }

    public final Object apply(Object obj) {
        AccountId accountId = this.f121195a;
        int i = this.f121196b;
        C46221b bVar = (C46221b) ((C46222c) obj).toBuilder();
        int a = accountId.mo50068a();
        Map unmodifiableMap = Collections.unmodifiableMap(((C46222c) bVar.instance).f121177c);
        Integer valueOf = Integer.valueOf(a);
        if (unmodifiableMap.containsKey(valueOf)) {
            C46226g gVar = (C46226g) ((C46227h) unmodifiableMap.get(valueOf)).toBuilder();
            gVar.copyOnWrite();
            C46227h hVar = (C46227h) gVar.instance;
            hVar.f121188d = i - 1;
            hVar.f121185a |= 4;
            bVar.mo50269a(accountId.mo50068a(), (C46227h) gVar.build());
            return (C46222c) bVar.build();
        }
        throw new IllegalArgumentException();
    }
}
