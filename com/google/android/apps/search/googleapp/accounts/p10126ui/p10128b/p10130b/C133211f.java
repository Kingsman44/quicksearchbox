package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10130b;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.b.f */
/* compiled from: PG */
public final /* synthetic */ class C133211f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Map f363079a;

    public /* synthetic */ C133211f(Map map) {
        this.f363079a = map;
    }

    public final Object call() {
        Map map = this.f363079a;
        HashMap hashMap = new HashMap();
        for (AccountId accountId : map.keySet()) {
            C60870cx cxVar = (C60870cx) map.get(accountId);
            if (cxVar != null) {
                try {
                    hashMap.put(accountId, (Boolean) C60856cj.m92909r(cxVar));
                } catch (Exception e) {
                    ((C59052c) ((C59052c) ((C59052c) C133215j.f363083a.mo56226d()).mo56382g(e)).mo56372aa(40025)).mo56386p("Failed to get SAA bit");
                }
            }
        }
        return C58495hd.m89898l(hashMap);
    }
}
