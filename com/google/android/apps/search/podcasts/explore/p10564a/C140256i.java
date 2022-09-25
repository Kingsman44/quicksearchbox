package com.google.android.apps.search.podcasts.explore.p10564a;

import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10588n.C140679h;
import com.google.android.apps.search.podcasts.p10588n.C140680i;
import com.google.android.apps.search.podcasts.p10588n.C140681j;
import com.google.android.apps.search.podcasts.p10588n.C140687p;
import com.google.android.apps.search.podcasts.p10588n.C140690s;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.explore.a.i */
/* compiled from: PG */
public final class C140256i implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C140261n f381031a;

    /* renamed from: b */
    final /* synthetic */ String f381032b;

    public C140256i(C140261n nVar, String str) {
        this.f381031a = nVar;
        this.f381032b = str;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C140690s sVar = this.f381031a.f381042a;
        String str = this.f381032b;
        C69664n.m101061g(str, "tabId");
        C60870cx c = C140989k.m228945c(sVar.mo115828a(str), new C140687p(sVar));
        C60870cx b = this.f381031a.f381045d.mo116046b();
        C60870cx b2 = this.f381031a.f381046e.mo115677b();
        C47633f b3 = C47636i.m84746e(c, b, b2).mo51519b(new C140255h(c, b, b2, this.f381031a), C60826bg.f164896a);
        C69664n.m101060f(b3, "fun getExploreFeed(tabId…eys.PODCAST_KEY\n    }\n  }");
        return C140989k.m228943a(b3);
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C140690s sVar = this.f381031a.f381042a;
        String str = this.f381032b;
        C69664n.m101061g(str, "tabId");
        C60870cx a = sVar.mo115828a(str);
        C60870cx c = C140989k.m228945c(a, new C140681j(sVar));
        sVar.mo115833g(C140989k.m228944b(c, C140679h.f382081a));
        return C140989k.m228945c(c, new C140680i(sVar, a, c));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18088c() {
        C46690ah ahVar = C140192a.f380885a;
        C69664n.m101060f(ahVar, "PODCAST_KEY");
        return ahVar;
    }
}
