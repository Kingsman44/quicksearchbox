package com.google.android.libraries.search.p3005i;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.concurrent.Executor;
import p3186j$.util.function.BiFunction;

/* renamed from: com.google.android.libraries.search.i.m */
/* compiled from: PG */
public final class C38469m {

    /* renamed from: a */
    public final C60887da f101809a;

    /* renamed from: b */
    private final C38411ab f101810b;

    /* renamed from: c */
    private final AccountId f101811c;

    /* renamed from: d */
    private final C46128f f101812d;

    /* renamed from: e */
    private final C60887da f101813e;

    public C38469m(C38411ab abVar, AccountId accountId, C46128f fVar, C60887da daVar, C60887da daVar2) {
        this.f101810b = abVar;
        this.f101811c = accountId;
        this.f101812d = fVar;
        this.f101809a = daVar;
        this.f101813e = daVar2;
    }

    /* renamed from: a */
    public final C60870cx mo41430a(C65753ak akVar, BiFunction biFunction, Executor executor) {
        C60870cx b = this.f101810b.f101669a.mo50395b();
        C60870cx b2 = this.f101812d.mo50215b(this.f101811c);
        return C47638k.m84753d(b, b2).mo51521b(new C38464h(b2, akVar, b, biFunction), executor);
    }

    /* renamed from: b */
    public final C60870cx mo41431b(C65753ak akVar, String str, C63662ac acVar, MessageLite messageLite) {
        return mo41430a(akVar, new C38468l(akVar, str, acVar, messageLite), this.f101809a);
    }

    /* renamed from: c */
    public final C60870cx mo41432c(C65753ak akVar, String str, C63662ac acVar) {
        return mo41430a(akVar, new C38448e(akVar, str, acVar), this.f101809a);
    }

    /* renamed from: d */
    public final C60870cx mo41433d(C65753ak akVar, String str, C63662ac acVar, int i, MessageLite messageLite) {
        return mo41430a(akVar, new C38465i(akVar, str, i, acVar, messageLite), this.f101809a);
    }

    /* renamed from: e */
    public final C60870cx mo41434e(C65753ak akVar, C65768az azVar) {
        return mo41430a(akVar, new C38455f(akVar, azVar), this.f101809a);
    }

    /* renamed from: f */
    public final C60870cx mo41435f(C65753ak akVar) {
        return mo41430a(akVar, new C38467k(akVar), this.f101813e);
    }

    /* renamed from: g */
    public final C60870cx mo41436g(C65753ak akVar, int i, C63662ac acVar) {
        return mo41430a(akVar, new C38463g(akVar, i, acVar), this.f101809a);
    }
}
