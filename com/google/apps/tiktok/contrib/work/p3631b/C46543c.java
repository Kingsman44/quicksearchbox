package com.google.apps.tiktok.contrib.work.p3631b;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.UUID;

/* renamed from: com.google.apps.tiktok.contrib.work.b.c */
/* compiled from: PG */
public final /* synthetic */ class C46543c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46544d f121702a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f121703b;

    /* renamed from: c */
    public final /* synthetic */ C46586t f121704c;

    /* renamed from: d */
    public final /* synthetic */ C46586t f121705d;

    public /* synthetic */ C46543c(C46544d dVar, AccountId accountId, C46586t tVar, C46586t tVar2) {
        this.f121702a = dVar;
        this.f121703b = accountId;
        this.f121704c = tVar;
        this.f121705d = tVar2;
    }

    public final C60870cx apply(Object obj) {
        C46544d dVar = this.f121702a;
        AccountId accountId = this.f121703b;
        UUID uuid = (UUID) obj;
        return dVar.mo50539d(accountId).mo50535a(this.f121704c, dVar.f121706a.mo50551g(this.f121705d));
    }
}
