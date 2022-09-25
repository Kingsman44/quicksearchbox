package com.google.apps.tiktok.account.p3606d;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.data.C46155ag;
import com.google.apps.tiktok.account.data.C46321p;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.p3648i.p3653d.C47181e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.account.d.s */
/* compiled from: PG */
public final class C46101s implements C47181e {

    /* renamed from: a */
    public static final C59071e f120981a = C59071e.m91332i("com.google.apps.tiktok.account.d.s");

    /* renamed from: b */
    static final long f120982b = TimeUnit.DAYS.toMillis(30);

    /* renamed from: c */
    public final C21370a f120983c;

    /* renamed from: d */
    public final C46325t f120984d;

    /* renamed from: e */
    public final C46321p f120985e;

    /* renamed from: f */
    public final C60887da f120986f;

    /* renamed from: g */
    public final C46090h f120987g;

    /* renamed from: h */
    private final C46155ag f120988h;

    /* renamed from: i */
    private final C60887da f120989i;

    /* renamed from: j */
    private final C60836bq f120990j;

    public C46101s(C21370a aVar, C46325t tVar, C46155ag agVar, C46321p pVar, C60887da daVar, C60887da daVar2, C46090h hVar, C60836bq bqVar) {
        this.f120983c = aVar;
        this.f120984d = tVar;
        this.f120988h = agVar;
        this.f120985e = pVar;
        this.f120989i = daVar;
        this.f120986f = daVar2;
        this.f120987g = hVar;
        this.f120990j = bqVar;
    }

    /* renamed from: a */
    public final C60870cx mo47105a() {
        C60870cx b = mo50205b();
        C60870cx h = C60922j.m93045h(C60922j.m93045h(C60838bs.m92859i(this.f120988h.f121069c.mo46042d()), C47810es.m84966f(new C46098p(this)), this.f120986f), C47810es.m84966f(new C46099q(this)), this.f120989i);
        return C60856cj.m92893b(b, h).mo57334a(C47810es.m84978r(new C46100r(b, h)), this.f120989i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo50205b() {
        return this.f120990j.mo57305b(C47810es.m84965e(new C46097o(this)), this.f120986f);
    }
}
