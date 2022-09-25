package com.google.frameworks.client.data.android.server.tiktok;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.y */
/* compiled from: PG */
public final /* synthetic */ class C61611y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C70334de f166480a;

    public /* synthetic */ C61611y(C70334de deVar) {
        this.f166480a = deVar;
    }

    public final Object apply(Object obj) {
        C70334de deVar = this.f166480a;
        AccountId accountId = (AccountId) obj;
        if (accountId != null) {
            return new C61587b(accountId, (String) C61601p.m94386b(deVar, C61608w.f166476a));
        }
        throw new C70761fa(Status.f186910h.withDescription("No account found for ".concat(deVar.toString())), (C70334de) null, true);
    }
}
