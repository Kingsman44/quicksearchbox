package com.google.apps.tiktok.account.p3603a;

import com.google.android.libraries.logging.p2181a.C28259b;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58847bk;

/* renamed from: com.google.apps.tiktok.account.a.h */
/* compiled from: PG */
public final /* synthetic */ class C45958h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C45959i f120748a;

    public /* synthetic */ C45958h(C45959i iVar) {
        this.f120748a = iVar;
    }

    public final Object apply(Object obj) {
        C45959i iVar = this.f120748a;
        C46108a aVar = (C46108a) obj;
        if (aVar == null) {
            return C28259b.m52822b();
        }
        String str = aVar.mo50210b().f121165j;
        if (((String) ((C58847bk) iVar.f120749a).f156646a).equals(str)) {
            return C28259b.m52823c(aVar.mo50210b().f121161f);
        }
        if ("pseudonymous".equals(str)) {
            return C28259b.m52824d();
        }
        if (!"incognito".equals(str)) {
            return null;
        }
        return C28259b.m52821a();
    }
}
