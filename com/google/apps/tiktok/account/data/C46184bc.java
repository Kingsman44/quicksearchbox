package com.google.apps.tiktok.account.data;

import android.content.IntentFilter;
import com.google.common.base.C58881cr;

/* renamed from: com.google.apps.tiktok.account.data.bc */
/* compiled from: PG */
public final /* synthetic */ class C46184bc implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C46186be f121114a;

    public /* synthetic */ C46184bc(C46186be beVar) {
        this.f121114a = beVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C46186be beVar = this.f121114a;
        beVar.f121117b.registerReceiver(new C46185bd(beVar), new IntentFilter("com.google.apps.tiktok.account.data.tiktok_account_data_source_changed"), beVar.f121120e, beVar.f121119d);
        return true;
    }
}
