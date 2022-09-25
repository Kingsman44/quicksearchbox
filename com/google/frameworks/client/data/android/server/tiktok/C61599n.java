package com.google.frameworks.client.data.android.server.tiktok;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.n */
/* compiled from: PG */
public final /* synthetic */ class C61599n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C61601p f166462a;

    /* renamed from: b */
    public final /* synthetic */ C61589d f166463b;

    /* renamed from: c */
    public final /* synthetic */ String f166464c;

    public /* synthetic */ C61599n(C61601p pVar, C61589d dVar, String str) {
        this.f166462a = pVar;
        this.f166463b = dVar;
        this.f166464c = str;
    }

    public final C60870cx apply(Object obj) {
        C61601p pVar = this.f166462a;
        C61589d dVar = this.f166463b;
        String str = this.f166464c;
        AccountId accountId = null;
        for (C46108a aVar : (List) obj) {
            C46215j b = aVar.mo50210b();
            if (b.f121165j.equals("google") && ((dVar != null && !dVar.f166447a.isEmpty() && b.f121157b.equals(dVar.f166447a)) || (str != null && b.f121158c.equals(str)))) {
                if (accountId == null) {
                    accountId = aVar.mo50209a();
                } else {
                    throw new C70761fa(Status.f186910h.withDescription("Multiple accounts matched provided account identifier"), (C70334de) null, true);
                }
            }
        }
        if (accountId != null || dVar == null || dVar.f166448b.isEmpty()) {
            return C60856cj.m92900i(accountId);
        }
        return C60922j.m93045h(pVar.f166470f.mo50216c(dVar.f166448b), C47810es.m84966f(new C61598m(pVar)), C60826bg.f164896a);
    }
}
