package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.u */
/* compiled from: PG */
public final /* synthetic */ class C123644u implements Callable {

    /* renamed from: a */
    public final /* synthetic */ AccountId f341575a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f341576b;

    public /* synthetic */ C123644u(AccountId accountId, C60870cx cxVar) {
        this.f341575a = accountId;
        this.f341576b = cxVar;
    }

    public final Object call() {
        AccountId accountId = this.f341575a;
        C60870cx cxVar = this.f341576b;
        StringBuilder sb = new StringBuilder();
        sb.append(accountId);
        sb.append("\n");
        if (accountId != null) {
            sb.append("SharedProactiveData\n");
            sb.append((String) ((List) C60856cj.m92909r(cxVar)).get(0));
            sb.append("ClientProactiveData\n");
            sb.append((String) ((List) C60856cj.m92909r(cxVar)).get(1));
            sb.append("LastClientDataQuery\n");
            sb.append((String) ((List) C60856cj.m92909r(cxVar)).get(2));
        } else {
            sb.append("GlobalData\n");
            sb.append((String) ((List) C60856cj.m92909r(cxVar)).get(0));
            sb.append("\nSharedProactiveData\n");
            sb.append((String) ((List) C60856cj.m92909r(cxVar)).get(1));
            sb.append("ClientProactiveData\n");
            sb.append((String) ((List) C60856cj.m92909r(cxVar)).get(2));
        }
        return sb.toString();
    }
}
