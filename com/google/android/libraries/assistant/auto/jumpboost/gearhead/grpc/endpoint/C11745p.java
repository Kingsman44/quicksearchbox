package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11520b;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p675b.C11521a;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p675b.C11522b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;
import com.google.frameworks.client.data.android.server.tiktok.C61573a;
import com.google.frameworks.client.data.android.server.tiktok.C61591f;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint.p */
/* compiled from: PG */
public final /* synthetic */ class C11745p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f37813a;

    /* renamed from: b */
    public final /* synthetic */ C21370a f37814b;

    /* renamed from: c */
    public final /* synthetic */ C61591f f37815c;

    public /* synthetic */ C11745p(long j, C21370a aVar, C61591f fVar) {
        this.f37813a = j;
        this.f37814b = aVar;
        this.f37815c = fVar;
    }

    public final Object apply(Object obj) {
        long j = this.f37813a;
        C21370a aVar = this.f37814b;
        C61591f fVar = this.f37815c;
        AccountId accountId = (AccountId) obj;
        C11521a aVar2 = (C11521a) C11522b.f37405d.createBuilder();
        aVar2.copyOnWrite();
        C11522b bVar = (C11522b) aVar2.instance;
        bVar.f37407a |= 1;
        bVar.f37408b = j;
        long d = aVar.mo26872d();
        aVar2.copyOnWrite();
        C11522b bVar2 = (C11522b) aVar2.instance;
        bVar2.f37407a |= 2;
        bVar2.f37409c = d;
        ((C61573a) fVar).f166417a.mo62033h(C11520b.f37402a, (C11522b) aVar2.build());
        return accountId;
    }
}
