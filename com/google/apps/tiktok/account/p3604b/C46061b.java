package com.google.apps.tiktok.account.p3604b;

import android.content.Intent;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import java.util.List;

/* renamed from: com.google.apps.tiktok.account.b.b */
/* compiled from: PG */
public final /* synthetic */ class C46061b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f120917a;

    public /* synthetic */ C46061b(Intent intent) {
        this.f120917a = intent;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f120917a;
        List list = (List) obj;
        boolean z = false;
        C46108a aVar = (C46108a) list.get(0);
        Long l = (Long) list.get(1);
        if (aVar.mo50211c() == 2) {
            z = true;
        }
        C58838bb.m90869d(z, "Account is not enabled");
        intent.putExtra("account_external_version", 1);
        C45963aa.m82131a(intent, aVar.mo50209a());
        intent.putExtra("account_user_id", aVar.mo50210b().f121157b);
        intent.putExtra("account_instance", l.longValue());
        return intent;
    }
}
