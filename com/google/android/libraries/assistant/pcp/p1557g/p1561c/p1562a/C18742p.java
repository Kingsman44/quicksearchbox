package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import android.content.ComponentName;
import com.google.android.apps.gsa.binaries.satin.app.ana;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.C18769h;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18711c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18713e;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18714f;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18717i;
import com.google.android.libraries.assistant.pcp.p1573k.C18912aa;
import com.google.android.libraries.assistant.pcp.p1573k.C18930j;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18948a;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18951d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.p */
/* compiled from: PG */
public final class C18742p implements C18769h {

    /* renamed from: a */
    public static final C59071e f52842a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.g.c.a.p");

    /* renamed from: b */
    public static final ComponentName f52843b = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.podcasts.browser.PodcastBrowserService");

    /* renamed from: c */
    public final C18930j f52844c;

    /* renamed from: d */
    public final C18912aa f52845d;

    /* renamed from: e */
    private final Executor f52846e;

    /* renamed from: f */
    private final ana f52847f;

    public C18742p(C18930j jVar, C18912aa aaVar, Executor executor, ana ana) {
        this.f52844c = jVar;
        this.f52845d = aaVar;
        this.f52846e = executor;
        this.f52847f = ana;
    }

    /* renamed from: a */
    public final C18713e mo21204a() {
        return C18711c.f52783c;
    }

    /* renamed from: b */
    public final C60870cx mo21205b(C18718c cVar) {
        C18951d a = this.f52847f.mo65974a(C18948a.PCP_FETCH_PODCAST_RECS);
        C60870cx a2 = cVar.mo24114a(C18717i.f52795a);
        C60870cx a3 = cVar.mo24114a(C18714f.f52792b);
        return C47636i.m84744c(a2, a3).mo51519b(new C18738l(this, a2, a3), this.f52846e).mo51516i(new C18739m(this), this.f52846e).mo51515h(new C18740n(a2, a), this.f52846e).mo51514f(Throwable.class, new C18741o(a), this.f52846e);
    }
}
