package com.google.apps.tiktok.account.p3606d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.p3648i.p3649a.C47151b;
import com.google.apps.tiktok.p3648i.p3649a.C47152c;
import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.io.File;

/* renamed from: com.google.apps.tiktok.account.d.j */
/* compiled from: PG */
public final class C46092j {

    /* renamed from: a */
    public static final C47153d f120967a = C47153d.m83864c(1);

    /* renamed from: b */
    public final C47151b f120968b;

    /* renamed from: c */
    public final AccountId f120969c;

    /* renamed from: d */
    private final C60887da f120970d;

    static {
        C47153d.m83864c(2);
    }

    public C46092j(C47151b bVar, AccountId accountId, C60887da daVar) {
        this.f120968b = bVar;
        this.f120969c = accountId;
        this.f120970d = daVar;
        C58838bb.m90884s(accountId.mo50068a() != -1, "Account Id is invalid");
    }

    /* renamed from: c */
    static String m82308c(AccountId accountId) {
        String str = File.separator;
        int a = accountId.mo50068a();
        return "accounts" + str + a;
    }

    /* renamed from: d */
    public static String m82309d() {
        return "accounts";
    }

    /* renamed from: a */
    public final C46076b mo50201a(C47153d dVar, String str) {
        C47151b bVar = this.f120968b;
        String c = m82308c(this.f120969c);
        String str2 = File.separator;
        return new C46076b(new C47152c(dVar, bVar, c + str2 + str), this.f120970d);
    }

    /* renamed from: b */
    public final C60870cx mo50202b(C47153d dVar) {
        return this.f120970d.mo19399b(C47810es.m84978r(new C46091i(this, dVar)));
    }
}
