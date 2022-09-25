package com.google.android.libraries.storage.p3304a.p3305a;

import android.accounts.Account;
import com.google.android.libraries.storage.p3304a.p3307c.C42757j;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62995dn;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4781a.p4782a.C63129b;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4780b.p4781a.p4782a.C63132e;

/* renamed from: com.google.android.libraries.storage.a.a.o */
/* compiled from: PG */
public final /* synthetic */ class C42728o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ int f111989a;

    public /* synthetic */ C42728o(int i) {
        this.f111989a = i;
    }

    public final C60870cx apply(Object obj) {
        int i = this.f111989a;
        C63132e eVar = (C63132e) obj;
        C62995dn dnVar = eVar.f170482c;
        Integer valueOf = Integer.valueOf(i);
        Account account = null;
        C63129b bVar = dnVar.containsKey(valueOf) ? (C63129b) dnVar.get(valueOf) : null;
        if (bVar != null) {
            account = new Account(bVar.f170475b, bVar.f170476c);
        }
        if (account != null) {
            return C60856cj.m92900i(account);
        }
        if (!eVar.equals(C63132e.f170478d)) {
            int i2 = eVar.f170481b;
            if (i == i2) {
                throw new C42757j();
            } else if (i < 0) {
                throw new C42757j();
            } else if (i > 100) {
                throw new C42757j();
            } else if (i > i2) {
                throw new C42757j();
            } else {
                throw new C42757j();
            }
        } else {
            throw new C42757j();
        }
    }
}
