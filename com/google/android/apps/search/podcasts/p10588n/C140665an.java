package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139988a;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139990c;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.n.an */
/* compiled from: PG */
public final class C140665an {

    /* renamed from: a */
    public final C139958c f382042a;

    /* renamed from: b */
    private final C139997j f382043b;

    public C140665an(C139997j jVar, C139958c cVar) {
        C69664n.m101061g(jVar, "entityCache");
        this.f382043b = jVar;
        this.f382042a = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo115818a(String str, C140651c cVar) {
        C69664n.m101061g(str, "feedUrl");
        C69664n.m101061g(cVar, "sortPreferences");
        C139997j jVar = this.f382043b;
        C139988a aVar = C139988a.DONT_CARE;
        C69664n.m101061g(str, "feedUrl");
        C69664n.m101061g(aVar, "staleness");
        C60870cx a = jVar.f380513c.mo45937a(new C139990c(str, jVar, aVar));
        C69664n.m101060f(a, "fun getShowResult(\n    f…builder.build()\n    }\n  }");
        return C140989k.m228944b(C140989k.m228945c(a, new C140661aj(this)), new C140664am(cVar));
    }
}
