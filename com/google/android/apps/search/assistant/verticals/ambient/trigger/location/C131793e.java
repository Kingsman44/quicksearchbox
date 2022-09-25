package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.android.apps.search.assistant.p8938a.p8939a.p8940a.C119184a;
import com.google.android.apps.search.assistant.p8938a.p8939a.p8940a.C119185b;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.e */
/* compiled from: PG */
public final /* synthetic */ class C131793e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131763ad f359984a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f359985b;

    public /* synthetic */ C131793e(C131763ad adVar, AccountId accountId) {
        this.f359984a = adVar;
        this.f359985b = accountId;
    }

    public final Object apply(Object obj) {
        C131763ad adVar = this.f359984a;
        AccountId accountId = this.f359985b;
        C119185b bVar = (C119185b) obj;
        if ((bVar.f332384a & 1) == 0 || bVar.f332385b == accountId.mo50068a()) {
            C119184a aVar = (C119184a) bVar.toBuilder();
            aVar.copyOnWrite();
            C119185b bVar2 = (C119185b) aVar.instance;
            bVar2.f332384a &= -3;
            bVar2.f332386c = 0;
            aVar.copyOnWrite();
            C119185b bVar3 = (C119185b) aVar.instance;
            bVar3.f332384a &= -2;
            bVar3.f332385b = 0;
            return (C119185b) aVar.build();
        }
        ((C58970a) ((C58970a) adVar.f359943j.mo56226d()).mo56372aa(39348)).mo56386p("The account doesn't match with the registered account");
        return bVar;
    }
}
