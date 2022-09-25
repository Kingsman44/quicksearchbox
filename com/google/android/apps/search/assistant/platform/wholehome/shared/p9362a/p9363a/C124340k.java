package com.google.android.apps.search.assistant.platform.wholehome.shared.p9362a.p9363a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.shared.a.a.k */
/* compiled from: PG */
public final class C124340k implements C21851cg {

    /* renamed from: a */
    public final Context f343223a;

    /* renamed from: b */
    public final C124348r f343224b;

    /* renamed from: c */
    private final C46128f f343225c;

    /* renamed from: d */
    private final Executor f343226d;

    /* renamed from: com.google.android.apps.search.assistant.platform.wholehome.shared.a.a.k$a */
    /* compiled from: PG */
    public interface C124341a {
        /* renamed from: fM */
        C38469m mo106378fM();
    }

    public C124340k(Context context, C46128f fVar, C124348r rVar, Executor executor) {
        this.f343223a = context;
        this.f343225c = fVar;
        this.f343224b = rVar;
        this.f343226d = executor;
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (akVar.equals(C65753ak.ASSISTANT_ARBITRATION_HOST_IP) && account != null) {
            String str = account.name;
            C46459k.m82829b(C47633f.m84733g(this.f343225c.mo50216c(account.name)).mo51516i(new C124338i(this), this.f343226d).mo51516i(new C124339j(this), this.f343226d), "Failed to handle usonia module download.", new Object[0]);
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
