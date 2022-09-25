package com.google.apps.tiktok.account.p3616e.p3620d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3616e.p3620d.p3621a.C46339a;
import com.google.apps.tiktok.account.p3616e.p3620d.p3621a.C46341c;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import java.util.Collections;

/* renamed from: com.google.apps.tiktok.account.e.d.f */
/* compiled from: PG */
public final /* synthetic */ class C46346f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AccountId f121342a;

    public /* synthetic */ C46346f(AccountId accountId) {
        this.f121342a = accountId;
    }

    public final Object apply(Object obj) {
        AccountId accountId = this.f121342a;
        C46341c cVar = (C46341c) obj;
        C46339a aVar = (C46339a) cVar.toBuilder();
        for (String str : Collections.unmodifiableMap(cVar.f121334a).keySet()) {
            str.getClass();
            C62995dn dnVar = cVar.f121334a;
            if (!dnVar.containsKey(str)) {
                throw new IllegalArgumentException();
            } else if (((Integer) dnVar.get(str)).intValue() == accountId.mo50068a()) {
                aVar.mo50322b(str);
            }
        }
        return (C46341c) aVar.build();
    }
}
