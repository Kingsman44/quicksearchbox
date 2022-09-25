package com.google.apps.tiktok.account.data.manager;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46161am;
import com.google.apps.tiktok.account.data.C46164ap;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.apps.tiktok.account.data.manager.i */
/* compiled from: PG */
public final class C46301i {

    /* renamed from: a */
    public final C42876ab f121286a;

    /* renamed from: b */
    public final C60887da f121287b;

    public C46301i(C42876ab abVar, C60887da daVar) {
        this.f121286a = abVar;
        this.f121287b = daVar;
    }

    /* renamed from: a */
    public static C46108a m82575a(C46227h hVar) {
        AccountId b = AccountId.m82057b(hVar.f121186b);
        C46215j jVar = hVar.f121187c;
        if (jVar == null) {
            jVar = C46215j.f121154k;
        }
        int a = C46161am.m82384a(hVar.f121188d);
        if (a == 0) {
            a = 1;
        }
        return new C46164ap(b, jVar, a);
    }

    /* renamed from: b */
    static C46227h m82576b(C46222c cVar, AccountId accountId) {
        try {
            int a = accountId.mo50068a();
            C62995dn dnVar = cVar.f121177c;
            Integer valueOf = Integer.valueOf(a);
            if (dnVar.containsKey(valueOf)) {
                return (C46227h) dnVar.get(valueOf);
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new C46167as((Throwable) e);
        }
    }
}
