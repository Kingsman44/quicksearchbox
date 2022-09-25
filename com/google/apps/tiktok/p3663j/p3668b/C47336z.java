package com.google.apps.tiktok.p3663j.p3668b;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58526ih;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.j.b.z */
/* compiled from: PG */
public final /* synthetic */ class C47336z implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C47298af f123037a;

    public /* synthetic */ C47336z(C47298af afVar) {
        this.f123037a = afVar;
    }

    public final Object call() {
        C47298af afVar = this.f123037a;
        C58526ih ihVar = new C58526ih();
        try {
            for (Integer intValue : afVar.mo51180a().f123054e) {
                ihVar.mo55373c(AccountId.m82057b(intValue.intValue()));
            }
            return ihVar.mo55486f();
        } catch (IOException e) {
            afVar.mo51185f(e);
            return ihVar.mo55486f();
        }
    }
}
