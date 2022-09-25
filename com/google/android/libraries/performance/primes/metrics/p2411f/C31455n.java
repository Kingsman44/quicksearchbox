package com.google.android.libraries.performance.primes.metrics.p2411f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31311n;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.android.libraries.performance.primes.p2398c.C31220b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.f.n */
/* compiled from: PG */
final class C31455n extends C31451j implements C31209a.C31217h, C31313p {

    /* renamed from: h */
    private static final C59071e f84701h = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.f.n");

    /* renamed from: a */
    public final C31310m f84702a;

    /* renamed from: b */
    public final Application f84703b;

    /* renamed from: c */
    public final C68214a f84704c;

    /* renamed from: d */
    public final Object f84705d = new Object();

    /* renamed from: e */
    public final C68214a f84706e;

    /* renamed from: f */
    public final ArrayList f84707f = new ArrayList(0);

    /* renamed from: g */
    public final AtomicInteger f84708g = new AtomicInteger();

    /* renamed from: i */
    private final C60888db f84709i;

    public C31455n(C31311n nVar, Context context, C31220b bVar, C60888db dbVar, C68214a aVar, C68214a aVar2, C69464a aVar3, Executor executor) {
        this.f84702a = nVar.mo37026a(executor, aVar, aVar3);
        this.f84703b = (Application) context;
        this.f84709i = dbVar;
        this.f84704c = aVar;
        this.f84706e = aVar2;
        bVar.f84117a.mo36957a(this);
    }

    /* renamed from: b */
    public final void mo37145b(C31447f fVar) {
        int i;
        if (fVar.f84666b <= 0 && fVar.f84667c <= 0 && fVar.f84668d <= 0 && fVar.f84669e <= 0 && fVar.f84681q <= 0 && (i = fVar.f84686v) != 3 && i != 4 && fVar.f84683s <= 0) {
            ((C59052c) ((C59052c) f84701h.mo56226d()).mo56372aa(50407)).mo56386p("skip logging NetworkEvent due to empty bandwidth/latency data");
            C60870cx cxVar = C60866ct.f164955a;
        } else if (!this.f84702a.mo37024d((String) null)) {
            C60870cx cxVar2 = C60866ct.f164955a;
        } else {
            this.f84708g.incrementAndGet();
            C60856cj.m92905n(new C31454m(this, fVar), this.f84709i);
        }
    }

    /* renamed from: c */
    public final C60870cx mo37146c() {
        C31447f[] fVarArr;
        if (this.f84708g.get() > 0) {
            return C60856cj.m92902k(new C31452k(this), 1, TimeUnit.SECONDS, this.f84709i);
        }
        synchronized (this.f84705d) {
            if (!this.f84707f.isEmpty()) {
                ArrayList arrayList = this.f84707f;
                fVarArr = (C31447f[]) arrayList.toArray(new C31447f[arrayList.size()]);
                this.f84707f.clear();
            } else {
                fVarArr = null;
            }
        }
        if (fVarArr == null) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92905n(new C31453l(this, fVarArr), this.f84709i);
    }

    /* renamed from: d */
    public final void mo36944d(Activity activity) {
        mo37146c();
    }

    /* renamed from: ln */
    public final /* synthetic */ void mo29159ln() {
    }
}
