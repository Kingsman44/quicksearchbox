package com.google.android.apps.search.assistant.libraries.p8946b.p8948b.p8949a;

import android.accounts.Account;
import com.google.android.apps.search.assistant.libraries.p8946b.p8948b.C119223f;
import com.google.android.libraries.geller.p1816d.C21770b;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.android.libraries.search.assistant.p2485a.C32242c;
import com.google.android.libraries.search.assistant.p2485a.C32245f;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.b.a.e */
/* compiled from: PG */
public final class C119216e implements C21851cg, C32242c {

    /* renamed from: a */
    public static final C58528ij f332476a = C58528ij.m90014N(C65753ak.PRIVACY_SETTINGS, C65753ak.HANDBAG_PERSONALIZED_SLICE_INFO, C65753ak.LAUNCHER_DEEPLINKS, C65753ak.HABITS_AA_PROFILES, C65753ak.CROSS_DEVICE_TIMER);

    /* renamed from: c */
    private static final C58528ij f332477c = new C58759qy(C65753ak.GELLER_CONFIG);

    /* renamed from: b */
    public final Executor f332478b;

    /* renamed from: d */
    private final C46128f f332479d;

    /* renamed from: e */
    private final C32240a f332480e;

    /* renamed from: com.google.android.apps.search.assistant.libraries.b.b.a.e$a */
    /* compiled from: PG */
    public interface C119217a {
        /* renamed from: A */
        C119223f mo104247A();
    }

    public C119216e(C32240a aVar, C46128f fVar, C32245f fVar2, Executor executor) {
        this.f332480e = aVar;
        this.f332479d = fVar;
        this.f332478b = executor;
        fVar2.mo38014a(this);
    }

    /* renamed from: a */
    public final void mo38013a() {
        C46459k.m82829b(C47633f.m84733g(this.f332480e.f86461a.mo104411a(C119217a.class)).mo51515h(C119213b.f332470a, this.f332478b).mo51516i(new C119214c(this), this.f332478b), "Failed to share Geller data for the new default Assistant account to AiAi.", new Object[0]);
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (account == null) {
            return;
        }
        if (((C58759qy) f332477c).f156534a.equals(akVar) || f332476a.contains(akVar)) {
            String str = account.name;
            if (!C21770b.f60080c.contains(akVar) || !cfVar.mo27153c().isEmpty() || !cfVar.mo27154d().isEmpty()) {
                C60870cx c = this.f332479d.mo50216c(account.name);
                C47633f h = C47633f.m84733g(this.f332480e.f86461a.mo104411a(C119217a.class)).mo51515h(C119213b.f332470a, this.f332478b);
                C46459k.m82829b(C47638k.m84753d(c, h).mo51521b(new C119215d(c, h, akVar, account), this.f332478b), "Failed to share %s data to AiAi.", akVar.name());
                return;
            }
            String str2 = account.name;
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
