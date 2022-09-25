package com.google.android.apps.search.podcasts.language.p10578b;

import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.apps.tiktok.cache.C46407v;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4082j.p4083a.C54313aq;
import com.google.p4017at.p4082j.p4083a.C54315as;
import com.google.p4017at.p4082j.p4083a.C54372by;
import com.google.p4017at.p4082j.p4083a.C54373bz;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.podcasts.language.b.m */
/* compiled from: PG */
final class C140533m implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C140536p f381688a;

    public C140533m(C140536p pVar) {
        this.f381688a = pVar;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        if (((String) obj) == null) {
            return C60866ct.f164955a;
        }
        C140536p pVar = this.f381688a;
        C46407v vVar = pVar.f381691a;
        C54313aq aqVar = pVar.f381695e;
        C140385d dVar = pVar.f381692b;
        C140747m mVar = dVar.f381341b;
        C54372by byVar = dVar.f381340a;
        C54313aq aqVar2 = C54313aq.f142682a;
        C70888j jVar = byVar.f189039a;
        C70338di diVar = C54373bz.f142830l;
        if (diVar == null) {
            synchronized (C54373bz.class) {
                diVar = C54373bz.f142830l;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.podcasts.v1.PodcastsService", "GetLanguageOptions");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54313aq.f142682a);
                    d.f187486b = C70850d.m103697c(C54315as.f142684c);
                    diVar = d.mo62040a();
                    C54373bz.f142830l = diVar;
                }
            }
        }
        C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, byVar.f189040b), aqVar2);
        mVar.mo115851a("PodcastsService", "GetLanguageOptions", a);
        C60870cx f = vVar.mo50346f(aqVar, a);
        C69664n.m101059e(f, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<kotlin.Any?>");
        return f;
    }
}
