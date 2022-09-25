package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.appdatasearch.C142796al;
import com.google.android.gms.appdatasearch.C142797am;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import java.util.concurrent.ConcurrentLinkedQueue;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.m */
/* compiled from: PG */
public final /* synthetic */ class C131509m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131444ad f359366a;

    public /* synthetic */ C131509m(C131444ad adVar) {
        this.f359366a = adVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C131444ad adVar = this.f359366a;
        C142797am amVar = new C142797am((SearchResults) obj);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        C58480gp e = C58485gu.m89837e();
        while (amVar.hasNext()) {
            C142796al a = amVar.next();
            String h = a.mo117712h("name");
            C58148f d = a.mo117708d();
            if (d == null) {
                ((C58970a) ((C58970a) adVar.f359264a.mo56226d()).mo56372aa(39263)).mo56386p("Dropping null Thing proto.");
            } else if (h == null) {
                ((C58970a) ((C58970a) adVar.f359264a.mo56226d()).mo56372aa(39262)).mo56386p("Dropping list without name.");
            } else {
                Optional findAny = Collection.EL.stream(d.f155457d).filter(C131500d.f359355a).filter(C131511o.f359368a).map(C131516t.f359377a).map(C131517u.f359378a).findAny();
                if (!findAny.isEmpty()) {
                    String str = (String) Collection.EL.stream(d.f155457d).filter(C131518v.f359379a).filter(C131519w.f359380a).map(C131520x.f359381a).findAny().orElse(BuildConfig.FLAVOR);
                    Instant instant = (Instant) findAny.get();
                    if (adVar.f359268e || !Collection.EL.stream(d.f155457d).filter(C131501e.f359356a).anyMatch(C131502f.f359357a)) {
                        cxVar = adVar.f359265b.mo110174a(h, d.f155456c, instant);
                    } else {
                        cxVar = C60856cj.m92900i(true);
                    }
                    C60870cx cxVar2 = cxVar;
                    C131521y yVar = new C131521y(concurrentLinkedQueue, h, d, str, findAny);
                    e.mo55395g(C60922j.m93044g(cxVar2, C47810es.m84963c(yVar), adVar.f359269f));
                }
            }
        }
        if (!concurrentLinkedQueue.isEmpty()) {
            Collection.EL.stream(concurrentLinkedQueue).map(C131522z.f359387a).collect(Collectors.joining(", "));
        }
        C60870cx o = C60856cj.m92906o(e.mo55394f());
        C131441aa aaVar = new C131441aa(adVar);
        return C60922j.m93045h(o, C47810es.m84966f(aaVar), adVar.f359269f);
    }
}
