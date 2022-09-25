package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124109ch;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59326i;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.c.i */
/* compiled from: PG */
public final class C132624i {

    /* renamed from: a */
    public static final C59071e f361939a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.c.i");

    /* renamed from: b */
    public final Executor f361940b;

    /* renamed from: c */
    public final C123623b f361941c;

    /* renamed from: d */
    public final boolean f361942d;

    /* renamed from: e */
    public final boolean f361943e;

    /* renamed from: f */
    public final boolean f361944f;

    /* renamed from: g */
    public final C60950i f361945g;

    /* renamed from: h */
    private final Context f361946h;

    /* renamed from: i */
    private final AccountId f361947i;

    /* renamed from: j */
    private final Optional f361948j;

    /* renamed from: k */
    private final C124109ch f361949k;

    public C132624i(Context context, Executor executor, AccountId accountId, Optional optional, C124109ch chVar, C123623b bVar, C60950i iVar, boolean z, boolean z2, boolean z3) {
        this.f361946h = context;
        this.f361940b = executor;
        this.f361947i = accountId;
        this.f361948j = optional;
        this.f361949k = chVar;
        this.f361941c = bVar;
        this.f361942d = z;
        this.f361943e = z2;
        this.f361944f = z3;
        this.f361945g = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo110842a(C58480gp gpVar) {
        C58485gu f = gpVar.mo55394f();
        if (f.isEmpty() || !this.f361948j.isPresent()) {
            return C60866ct.f164955a;
        }
        return ((C124167p) this.f361948j.get()).mo106310d(f);
    }

    /* renamed from: b */
    public final C60870cx mo110843b(C53245gt gtVar) {
        C58480gp e = C58485gu.m89837e();
        C60870cx b = this.f361941c.f341550b.mo45938b(new C132622g(this, gtVar, e));
        C132623h hVar = new C132623h(this, e);
        return C60922j.m93045h(b, C47810es.m84966f(hVar), this.f361940b);
    }

    /* renamed from: c */
    public final void mo110844c(C53245gt gtVar, C42847bf bfVar, C58480gp gpVar) {
        C123623b bVar = this.f361941c;
        C59326i iVar = C59326i.f157517e;
        byte[] byteArray = gtVar.toByteArray();
        bVar.f341552d.mo106070n(bfVar, 1, "weather_current", gtVar, iVar.mo56837l(byteArray, byteArray.length).getBytes(Charset.defaultCharset()));
        this.f361949k.mo106289b(1, this.f361946h, this.f361947i, "weather_current", gpVar, bfVar);
    }
}
