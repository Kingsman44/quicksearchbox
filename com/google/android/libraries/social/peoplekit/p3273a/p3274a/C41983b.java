package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import java.util.List;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.b */
/* compiled from: PG */
final class C41983b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f109617a;

    /* renamed from: b */
    final /* synthetic */ Stopwatch f109618b;

    /* renamed from: c */
    final /* synthetic */ C41986e f109619c;

    public C41983b(C41986e eVar, List list, Stopwatch stopwatch) {
        this.f109619c = eVar;
        this.f109617a = list;
        this.f109618b = stopwatch;
    }

    public final void run() {
        C42000s sVar = this.f109619c.f109627c;
        sVar.f109673h = this.f109617a;
        sVar.mObservable.mo2879a();
        this.f109619c.mo44454e();
        C41986e eVar = this.f109619c;
        eVar.f109626b.post(new C41985d(eVar, this.f109618b));
    }
}
