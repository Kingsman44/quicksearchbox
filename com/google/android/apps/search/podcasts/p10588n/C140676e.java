package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139988a;
import com.google.android.apps.search.podcasts.p10550b.p10551a.C139997j;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.common.util.concurrent.C60870cx;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.n.e */
/* compiled from: PG */
public final class C140676e {

    /* renamed from: a */
    public final C139958c f382074a;

    /* renamed from: b */
    private final C139997j f382075b;

    public C140676e(C139997j jVar, C139958c cVar) {
        C69664n.m101061g(jVar, "entityCache");
        this.f382075b = jVar;
        this.f382074a = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo115825a(String str, String str2) {
        C69664n.m101061g(str, "feedUrl");
        C69664n.m101061g(str2, "guid");
        return C140989k.m228945c(this.f382075b.mo115377b(C69505av.m100862d(new C69685i(str, C69540x.m100944b(str2))), C139988a.DONT_CARE), new C140675d(str, str2, this));
    }
}
