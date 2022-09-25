package com.google.android.libraries.performance.primes.metrics.p2416j;

import android.text.TextUtils;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31311n;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.android.libraries.performance.primes.p2402g.C31241d;
import com.google.android.libraries.performance.primes.p2402g.C31242e;
import com.google.android.libraries.performance.primes.p2402g.C31247j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicReference;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71251cg;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71255ck;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.ab */
/* compiled from: PG */
final class C31531ab extends C31554v implements C31313p, C31548p {

    /* renamed from: g */
    private static final C59071e f84909g = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.j.ab");

    /* renamed from: a */
    public final C31310m f84910a;

    /* renamed from: b */
    public final C68214a f84911b;

    /* renamed from: c */
    public final C68214a f84912c;

    /* renamed from: d */
    public final C31242e f84913d;

    /* renamed from: e */
    public final C31247j f84914e;

    /* renamed from: f */
    public final AtomicReference f84915f;

    /* renamed from: h */
    private final C60888db f84916h;

    public C31531ab(C31311n nVar, C60888db dbVar, C68214a aVar, C68214a aVar2, C69464a aVar3, C31242e eVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.f84915f = atomicReference;
        this.f84916h = dbVar;
        this.f84911b = aVar;
        this.f84912c = aVar2;
        this.f84913d = eVar;
        this.f84910a = nVar.mo37026a(dbVar, C31558z.f84972a, aVar3);
        this.f84914e = new C31247j(new C31530aa(aVar));
        atomicReference.set(eVar.mo36966a(1.0f));
    }

    /* renamed from: e */
    public static final String m58782e(C71251cg cgVar) {
        if (cgVar.f190220d.size() > 0) {
            return ((C71255ck) cgVar.f190220d.get(0)).f190232b;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo37219a(C71251cg cgVar, C71207aq aqVar) {
        if (cgVar == null || cgVar.f190220d.size() == 0) {
            ((C59052c) ((C59052c) f84909g.mo56226d()).mo56372aa(50453)).mo56386p("Invalid traces were logged.");
            C60870cx cxVar = C60866ct.f164955a;
            return;
        }
        C60856cj.m92905n(new C31557y(this, cgVar, aqVar), this.f84916h);
    }

    /* renamed from: b */
    public final void mo37220b(String str, long j, long j2) {
        C31553u uVar;
        if (!TextUtils.isEmpty(str) && j2 > 0 && (uVar = (C31553u) C31533ad.f84923a.get()) != null && uVar.f84962c.f84949c <= j) {
            C31543k kVar = new C31543k(str, j, j + j2, Thread.currentThread().getId(), 4);
            synchronized (uVar.f84964e) {
                uVar.f84964e.add(kVar);
            }
            uVar.f84961b.incrementAndGet();
        }
    }

    /* renamed from: c */
    public final boolean mo37221c(String str) {
        if (!((C31241d) this.f84915f.get()).mo36965a()) {
            return false;
        }
        return C31533ad.m58792c(str);
    }

    /* renamed from: d */
    public final C60870cx mo37222d(String str) {
        if (true != TextUtils.isEmpty((CharSequence) null)) {
            str = null;
        }
        C31553u d = C31533ad.m58793d(str);
        if (d == null) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92905n(new C31555w(this, d), this.f84916h);
    }

    /* renamed from: ln */
    public final void mo29159ln() {
        C60856cj.m92903l(new C31556x(this), this.f84916h);
    }
}
