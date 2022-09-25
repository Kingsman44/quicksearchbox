package com.google.apps.tiktok.inject.p3654a;

import com.google.android.apps.gsa.binaries.satin.app.amo;
import com.google.android.apps.gsa.binaries.satin.app.anh;
import com.google.apps.tiktok.account.AccountId;
import java.util.HashMap;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.inject.a.g */
/* compiled from: PG */
public final class C47199g {

    /* renamed from: a */
    private final Map f122863a = new HashMap();

    /* renamed from: b */
    private final C69464a f122864b;

    public C47199g(C69464a aVar) {
        this.f122864b = aVar;
    }

    /* renamed from: a */
    public final Object mo51105a(AccountId accountId) {
        Object obj;
        synchronized (this.f122863a) {
            if (!this.f122863a.containsKey(accountId)) {
                Map map = this.f122863a;
                amo amo = (amo) this.f122864b.mo17428b();
                amo.f197987b = accountId;
                map.put(accountId, new anh(amo.f197986a, amo.f197987b));
            }
            obj = this.f122863a.get(accountId);
        }
        return obj;
    }
}
