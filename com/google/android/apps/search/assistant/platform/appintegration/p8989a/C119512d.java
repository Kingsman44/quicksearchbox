package com.google.android.apps.search.assistant.platform.appintegration.p8989a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58817ah;
import java.util.List;
import p5488io.grpc.C70297cz;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.a.d */
/* compiled from: PG */
public final /* synthetic */ class C119512d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f333128a;

    public /* synthetic */ C119512d(String str) {
        this.f333128a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f333128a;
        C70297cz czVar = C119514f.f333130b;
        AccountId accountId = null;
        for (C46108a aVar : (List) obj) {
            if (str != null && aVar.mo50210b().f121161f.equals(str)) {
                return aVar.mo50209a();
            }
            if (accountId == null && aVar.mo50210b().f121165j.equals("google")) {
                accountId = aVar.mo50209a();
            }
        }
        return accountId;
    }
}
