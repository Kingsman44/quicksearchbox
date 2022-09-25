package com.google.android.apps.search.podcasts.library.showsubscriptions.p10584a;

import android.text.TextUtils;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.a.b */
/* compiled from: PG */
final class C140618b implements Callable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f381907a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f381908b;

    public C140618b(C60870cx cxVar, C60870cx cxVar2) {
        this.f381907a = cxVar;
        this.f381908b = cxVar2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Object r = C60856cj.m92909r(this.f381907a);
        C69664n.m101060f(r, "getDone(subscriptionItemsFuture)");
        return C46688af.m83205b(new C140617a((List) r, !TextUtils.isEmpty((CharSequence) C60856cj.m92909r(this.f381908b))), 0);
    }
}
