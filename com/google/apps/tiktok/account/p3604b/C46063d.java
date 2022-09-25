package com.google.apps.tiktok.account.p3604b;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.apps.tiktok.account.b.d */
/* compiled from: PG */
public final /* synthetic */ class C46063d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Bundle f120919a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f120920b;

    public /* synthetic */ C46063d(Bundle bundle, AccountId accountId) {
        this.f120919a = bundle;
        this.f120920b = accountId;
    }

    public final Object apply(Object obj) {
        Bundle bundle = this.f120919a;
        AccountId accountId = this.f120920b;
        List list = (List) obj;
        C46108a aVar = (C46108a) list.get(0);
        long longValue = ((Long) list.get(1)).longValue();
        int i = bundle.getInt("account_external_version", -1);
        String string = bundle.getString("account_user_id");
        string.getClass();
        long j = bundle.getLong("account_instance", 0);
        if (i != 1) {
            throw new IllegalArgumentException("Unknown external account version");
        } else if (!aVar.mo50210b().f121157b.equals(string)) {
            throw new C46167as("The user id sent with the intent does not match the current user id!");
        } else if (longValue == j) {
            return accountId;
        } else {
            throw new C46167as("The account sent with the intent is from a previous installation of the app.");
        }
    }
}
