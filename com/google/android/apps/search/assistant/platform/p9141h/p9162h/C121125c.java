package com.google.android.apps.search.assistant.platform.p9141h.p9162h;

import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.h.h.c */
/* compiled from: PG */
public final class C121125c {

    /* renamed from: a */
    private final AccountId f336567a;

    /* renamed from: b */
    private final C46128f f336568b;

    /* renamed from: c */
    private final C9684l f336569c;

    /* renamed from: d */
    private final C60887da f336570d;

    public C121125c(AccountId accountId, C46128f fVar, C9684l lVar, C60887da daVar) {
        this.f336567a = accountId;
        this.f336569c = lVar;
        this.f336568b = fVar;
        this.f336570d = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo105058a() {
        C47633f g = C47633f.m84733g(this.f336568b.mo50214a(this.f336567a));
        C9684l lVar = this.f336569c;
        Objects.requireNonNull(lVar);
        return g.mo51516i(new C121122b(lVar), this.f336570d);
    }
}
