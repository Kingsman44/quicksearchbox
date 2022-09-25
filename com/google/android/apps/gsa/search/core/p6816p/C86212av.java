package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.search.core.p6820r.C86497j;
import com.google.android.apps.gsa.search.core.p6820r.C86567m;
import com.google.android.apps.gsa.search.core.p6820r.C86569o;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.search.core.p.av */
/* compiled from: PG */
public final class C86212av implements C86569o {

    /* renamed from: a */
    private final long f232972a;

    /* renamed from: b */
    private final C89356b f232973b;

    /* renamed from: c */
    private final C21370a f232974c;

    /* renamed from: d */
    private final C86237bt f232975d;

    public C86212av(long j, C89356b bVar, C21370a aVar, C86237bt btVar) {
        this.f232972a = j;
        this.f232974c = aVar;
        this.f232973b = bVar;
        this.f232975d = btVar;
    }

    /* renamed from: b */
    public final String mo79837b() {
        return "InMemoryCacheFetcher";
    }

    /* renamed from: g */
    public final C86497j mo79838g(C60870cx cxVar) {
        Long valueOf = Long.valueOf(this.f232972a);
        C21370a aVar = this.f232974c;
        C89356b bVar = this.f232973b;
        cxVar.getClass();
        C86237bt btVar = this.f232975d;
        C68225k.m98529a(valueOf, Long.class);
        C68225k.m98529a(aVar, C21370a.class);
        C68225k.m98529a(bVar, C89356b.class);
        C68225k.m98529a(cxVar, C60870cx.class);
        C68225k.m98529a(btVar, C86237bt.class);
        return new C86567m(new C86194ad(valueOf, aVar, bVar, cxVar, btVar).f232899a.mo60297gq());
    }
}
