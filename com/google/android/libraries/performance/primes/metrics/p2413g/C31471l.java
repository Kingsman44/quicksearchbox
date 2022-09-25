package com.google.android.libraries.performance.primes.metrics.p2413g;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31311n;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.android.libraries.performance.primes.p2398c.C31220b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71303ee;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71304ef;

/* renamed from: com.google.android.libraries.performance.primes.metrics.g.l */
/* compiled from: PG */
public final class C31471l extends C31464e implements C31209a.C31218i, C31209a.C31217h {

    /* renamed from: k */
    private static final C59071e f84742k = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.g.l");

    /* renamed from: a */
    public final Context f84743a;

    /* renamed from: b */
    public final C60888db f84744b;

    /* renamed from: c */
    public final C68214a f84745c;

    /* renamed from: d */
    public final Handler f84746d;

    /* renamed from: e */
    public final C31310m f84747e;

    /* renamed from: f */
    public final C31220b f84748f;

    /* renamed from: g */
    public volatile boolean f84749g = false;

    /* renamed from: h */
    public final C31476q f84750h;

    /* renamed from: i */
    public final Object f84751i = new Object();

    /* renamed from: j */
    public volatile C31475p f84752j = null;

    /* renamed from: l */
    private final Executor f84753l;

    /* renamed from: m */
    private final C69464a f84754m;

    /* renamed from: n */
    private final C58833ax f84755n;

    public C31471l(Context context, Executor executor, C60888db dbVar, C68214a aVar, C31311n nVar, C31476q qVar, C31220b bVar, C69464a aVar2, C58833ax axVar, Handler handler) {
        this.f84743a = context;
        this.f84744b = dbVar;
        this.f84753l = executor;
        this.f84745c = aVar;
        this.f84754m = aVar2;
        this.f84755n = axVar;
        this.f84746d = handler;
        this.f84748f = bVar;
        this.f84750h = qVar;
        this.f84747e = nVar.mo37026a(dbVar, aVar, aVar2);
    }

    /* renamed from: b */
    public final void mo37168b() {
        if (!this.f84747e.mo37024d((String) null)) {
            synchronized (this.f84751i) {
                this.f84748f.f84117a.mo36958b(this);
            }
        } else if (((C31463d) this.f84745c.mo27525b()).mo37158g().isEmpty()) {
            ((C59052c) ((C59052c) f84742k.mo56226d()).mo56372aa(50414)).mo56387q("Stall thresholds list expected to have size > 0, was %s", ((C31463d) this.f84745c.mo27525b()).mo37158g().size());
        } else {
            this.f84744b.mo29164d(new C31469j(this), (long) ((C31463d) this.f84745c.mo27525b()).mo37154d(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public final void mo36945c(Activity activity) {
        this.f84749g = true;
        if (this.f84752j != null) {
            C60856cj.m92903l(new C31470k(this), this.f84744b);
        }
    }

    /* renamed from: d */
    public final void mo36944d(Activity activity) {
        this.f84749g = false;
        if (this.f84752j != null) {
            C60856cj.m92903l(new C31468i(this), this.f84744b);
        }
    }

    /* renamed from: ln */
    public final void mo29159ln() {
        if (((Boolean) this.f84755n.mo56109e(Boolean.FALSE)).booleanValue()) {
            C71304ef efVar = (C71304ef) this.f84754m.mo17428b();
            int a = C71303ee.m103955a(efVar.f190409c);
            if (a != 0 && a == 4 && efVar.f190408b == 0) {
                return;
            }
        }
        this.f84748f.f84117a.mo36957a(this);
        C60856cj.m92903l(new C31465f(this), this.f84753l);
    }
}
