package com.google.android.libraries.lens.view.p2159q.p2160a;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29553bf;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.p3644h.C47117b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.q.a.q */
/* compiled from: PG */
public final class C27570q implements C29553bf {

    /* renamed from: a */
    private final C47117b f75357a;

    /* renamed from: b */
    private final C46128f f75358b;

    /* renamed from: c */
    private final Executor f75359c;

    public C27570q(C47117b bVar, C46128f fVar, Executor executor) {
        this.f75357a = bVar;
        this.f75358b = fVar;
        this.f75359c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo33118a(Account account) {
        C47633f g = C47633f.m84733g(this.f75358b.mo50216c(account.name));
        C47117b bVar = this.f75357a;
        Objects.requireNonNull(bVar);
        return g.mo51516i(new C27568o(bVar), this.f75359c).mo51516i(C27569p.f75356a, this.f75359c);
    }
}
