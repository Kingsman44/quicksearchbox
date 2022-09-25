package com.google.android.libraries.performance.primes.metrics.p2410e;

import android.app.Application;
import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31207bz;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31311n;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.ac */
/* compiled from: PG */
final class C31409ac extends C31435u implements C31313p, C31424j {

    /* renamed from: a */
    public static final C59071e f84569a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.e.ac");

    /* renamed from: b */
    public final Application f84570b;

    /* renamed from: c */
    public volatile C60870cx f84571c;

    /* renamed from: d */
    public final C21370a f84572d;

    /* renamed from: e */
    public final C68214a f84573e;

    /* renamed from: f */
    public final C31310m f84574f;

    /* renamed from: g */
    public final C31414ah f84575g;

    /* renamed from: h */
    final AtomicReference f84576h = new AtomicReference(C31425k.f84623a);

    /* renamed from: i */
    final ConcurrentHashMap f84577i = new ConcurrentHashMap();

    /* renamed from: j */
    private final C60888db f84578j;

    /* renamed from: k */
    private final C31207bz f84579k;

    /* renamed from: l */
    private final boolean f84580l;

    /* renamed from: m */
    private final C31433s f84581m;

    public C31409ac(C31311n nVar, C21370a aVar, Context context, C31433s sVar, C60888db dbVar, C68214a aVar2, C31414ah ahVar, C31207bz bzVar, C69464a aVar3, Executor executor, C58833ax axVar) {
        this.f84581m = sVar;
        this.f84579k = bzVar;
        this.f84574f = nVar.mo37026a(executor, aVar2, aVar3);
        this.f84570b = (Application) context;
        this.f84578j = dbVar;
        this.f84572d = aVar;
        this.f84573e = aVar2;
        this.f84575g = ahVar;
        this.f84580l = ((Boolean) axVar.mo56109e(Boolean.FALSE)).booleanValue();
    }

    /* renamed from: h */
    public static final boolean m58554h(int i) {
        return i != 1;
    }

    /* renamed from: b */
    public final void mo37106b(C31164au auVar) {
        C60870cx cxVar = (C60870cx) this.f84577i.remove(auVar.f84029a);
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }

    /* renamed from: c */
    public final void mo37107c(C31164au auVar) {
        C60856cj.m92905n(new C31407aa(this, auVar.f84029a), this.f84578j);
    }

    /* renamed from: d */
    public final void mo37108d(C31164au auVar) {
        String str = auVar.f84029a;
        C60870cx cxVar = (C60870cx) this.f84577i.remove(str);
        if (cxVar == null) {
            C60856cj.m92899h(new IllegalStateException("Could not find the start memory diff measurement for custom event: ".concat(String.valueOf(str))));
            return;
        }
        C60870cx g = mo37111g();
        C60856cj.m92895d(cxVar, g).mo57335b(new C31439y(this, auVar, cxVar, g), this.f84578j).mo4106b(new C31440z(this, auVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final void mo37109e() {
        this.f84581m.f84637a = new C31436v(this);
    }

    /* renamed from: f */
    public final void mo37110f(C31164au auVar) {
        mo37112i(auVar.f84029a, 1, (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C60870cx mo37111g() {
        C60870cx cxVar;
        synchronized (this.f84576h) {
            if (this.f84571c != null) {
                C60870cx cxVar2 = this.f84571c;
                return cxVar2;
            }
            C31425k kVar = (C31425k) this.f84576h.get();
            if (kVar != C31425k.f84623a && this.f84572d.mo26871c() - kVar.f84625b <= 1000) {
                C60870cx i = C60856cj.m92900i(kVar);
                return i;
            } else if (this.f84576h.get() != kVar) {
                C60870cx i2 = C60856cj.m92900i((C31425k) this.f84576h.get());
                return i2;
            } else {
                if (this.f84579k.f84112b) {
                    cxVar = C60856cj.m92898g();
                } else {
                    cxVar = C60856cj.m92905n(new C31437w(this), this.f84578j);
                }
                this.f84571c = cxVar;
                C60856cj.m92911t(this.f84571c, new C31408ab(this), C60826bg.f164896a);
                return cxVar;
            }
        }
    }

    /* renamed from: i */
    public final void mo37112i(String str, int i, String str2) {
        if (this.f84579k.f84112b) {
            C60856cj.m92898g();
        } else {
            C60856cj.m92905n(new C31438x(this, i, str, str2), this.f84578j);
        }
    }

    /* renamed from: ln */
    public final void mo29159ln() {
        if (this.f84580l) {
            mo37109e();
        }
    }
}
