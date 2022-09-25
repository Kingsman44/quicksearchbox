package com.google.apps.tiktok.account.p3606d;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58800sl;
import java.io.File;

/* renamed from: com.google.apps.tiktok.account.d.x */
/* compiled from: PG */
public final /* synthetic */ class C46106x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46107y f120996a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f120997b;

    public /* synthetic */ C46106x(C46107y yVar, AccountId accountId) {
        this.f120996a = yVar;
        this.f120997b = accountId;
    }

    public final void run() {
        C46107y yVar = this.f120996a;
        String c = C46092j.m82308c(this.f120997b);
        C58800sl lA = yVar.f120999b.mo51049a().iterator();
        while (lA.hasNext()) {
            File file = new File((File) lA.next(), c);
            if (file.exists() && !file.setWritable(true, true)) {
                throw new RuntimeException("Could not make data dir writable.");
            }
        }
    }
}
