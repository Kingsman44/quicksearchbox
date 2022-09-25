package com.google.apps.tiktok.account.p3616e.p3617a;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58817ah;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.apps.tiktok.account.e.a.b */
/* compiled from: PG */
public final /* synthetic */ class C46333b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C46333b f121325a = new C46333b();

    private /* synthetic */ C46333b() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (C46108a aVar : (List) obj) {
            if (aVar.mo50211c() != 3 && !"pseudonymous".equals(aVar.mo50210b().f121165j) && !"incognito".equals(aVar.mo50210b().f121165j)) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.size() == 1) {
            return ((C46108a) arrayList.get(0)).mo50209a();
        }
        return null;
    }
}
