package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11553a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.libraries.search.p3005i.p3007b.C38424a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.bm */
/* compiled from: PG */
public final class C11594bm implements C11553a {

    /* renamed from: a */
    public static final C59071e f37520a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.bm");

    /* renamed from: b */
    public final AccountId f37521b;

    /* renamed from: c */
    public final C15488n f37522c;

    /* renamed from: d */
    public final C38424a f37523d;

    /* renamed from: e */
    public final C38469m f37524e;

    /* renamed from: f */
    public final C69464a f37525f;

    /* renamed from: g */
    private final Executor f37526g;

    /* renamed from: h */
    private C60870cx f37527h = C60856cj.m92899h(new IllegalStateException("Prewarm hasn't been started"));

    public C11594bm(AccountId accountId, Executor executor, C15488n nVar, C38424a aVar, C38469m mVar, C69464a aVar2) {
        this.f37521b = accountId;
        this.f37526g = executor;
        this.f37522c = nVar;
        this.f37523d = aVar;
        this.f37524e = mVar;
        this.f37525f = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo20052a() {
        return this.f37527h;
    }

    /* renamed from: b */
    public final void mo20053b() {
        C11588bg bgVar = new C11588bg(this);
        Class<Throwable> cls = Throwable.class;
        this.f37527h = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(bgVar), this.f37526g)).mo51516i(new C11589bh(this), this.f37526g).mo51515h(C11590bi.f37516a, this.f37526g).mo51515h(new C11591bj(this), this.f37526g).mo51513e(cls, new C11592bk(this), this.f37526g);
    }

    /* renamed from: c */
    public final int mo20054c() {
        return 2;
    }
}
