package com.google.android.apps.gsa.staticplugins.p7825dm.p7833h;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.h.t */
/* compiled from: PG */
public final /* synthetic */ class C99808t implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C99812x f279220a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f279221b;

    public /* synthetic */ C99808t(C99812x xVar, AccountId accountId) {
        this.f279220a = xVar;
        this.f279221b = accountId;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C99812x xVar = this.f279220a;
        C60870cx a = xVar.f279227c.mo28201a("start location consent", new C99800l(xVar, this.f279221b, cVar));
        C90873ag agVar = new C90873ag(a, xVar.f279227c, "catching start location consent", C99801m.f279210a);
        Objects.requireNonNull(cVar);
        agVar.mo85224b(Exception.class, new C99811w(cVar));
        Objects.requireNonNull(cVar);
        agVar.mo85223a(new C99811w(cVar));
        return a;
    }
}
