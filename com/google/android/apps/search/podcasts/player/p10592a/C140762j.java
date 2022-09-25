package com.google.android.apps.search.podcasts.player.p10592a;

import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.player.a.j */
/* compiled from: PG */
final class C140762j extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C60870cx f382228a;

    /* renamed from: b */
    final /* synthetic */ C140770r f382229b;

    /* renamed from: c */
    final /* synthetic */ C140790h f382230c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140762j(C60870cx cxVar, C140770r rVar, C140790h hVar) {
        super(1);
        this.f382228a = cxVar;
        this.f382229b = rVar;
        this.f382230c = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Object r = C60856cj.m92909r(this.f382228a);
        if (r != null) {
            C60870cx c = this.f382229b.f382248c.mo115678c();
            C69664n.m101060f(c, "preferenceManager.preference");
            return C140989k.m228945c(c, new C140761i(this.f382229b, this.f382230c, (C140787e) r));
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
