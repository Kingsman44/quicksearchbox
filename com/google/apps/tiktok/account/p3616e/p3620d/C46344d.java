package com.google.apps.tiktok.account.p3616e.p3620d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3616e.p3620d.p3621a.C46341c;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.apps.tiktok.account.e.d.d */
/* compiled from: PG */
public final /* synthetic */ class C46344d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46348h f121338a;

    public /* synthetic */ C46344d(C46348h hVar) {
        this.f121338a = hVar;
    }

    public final Object apply(Object obj) {
        C46348h hVar = this.f121338a;
        C46341c cVar = (C46341c) obj;
        String str = hVar.f121345b;
        str.getClass();
        if (!cVar.f121334a.containsKey(str)) {
            return null;
        }
        String str2 = hVar.f121345b;
        str2.getClass();
        C62995dn dnVar = cVar.f121334a;
        if (dnVar.containsKey(str2)) {
            return AccountId.m82057b(((Integer) dnVar.get(str2)).intValue());
        }
        throw new IllegalArgumentException();
    }
}
