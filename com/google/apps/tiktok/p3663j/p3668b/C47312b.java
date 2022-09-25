package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58817ah;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.apps.tiktok.j.b.b */
/* compiled from: PG */
public final /* synthetic */ class C47312b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C47312b f122978a = new C47312b();

    private /* synthetic */ C47312b() {
    }

    public final Object apply(Object obj) {
        HashSet hashSet = new HashSet();
        for (C46108a aVar : (List) obj) {
            if (!aVar.mo50210b().f121165j.equals("incognito")) {
                hashSet.add(aVar.mo50209a());
            }
        }
        return hashSet;
    }
}
