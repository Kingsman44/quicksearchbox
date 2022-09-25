package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import android.util.Base64;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137940a;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137949i;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137957q;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10448e.C137984d;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.p10450a.C138037a;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.p10450a.C138042f;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.C138541m;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138468cp;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138471cs;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4552o.aod;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.p4184bj.C56036l;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.ao */
/* compiled from: PG */
public final class C137929ao implements C137916ab {

    /* renamed from: a */
    public final C46723bg f375259a;

    /* renamed from: b */
    public final C138001s f375260b;

    /* renamed from: c */
    public final Set f375261c;

    /* renamed from: d */
    public final Executor f375262d;

    /* renamed from: e */
    public final C46778cv f375263e;

    /* renamed from: f */
    public final C138541m f375264f;

    /* renamed from: g */
    public final AtomicInteger f375265g = new AtomicInteger(0);

    /* renamed from: h */
    private final C137940a f375266h;

    /* renamed from: i */
    private final C138471cs f375267i;

    /* renamed from: j */
    private final C138042f f375268j;

    /* renamed from: k */
    private final boolean f375269k;

    /* renamed from: l */
    private final C137984d f375270l;

    public C137929ao(C46723bg bgVar, C138001s sVar, Set set, Executor executor, C46778cv cvVar, C137940a aVar, C138471cs csVar, C138541m mVar, C138042f fVar, C137984d dVar, boolean z) {
        this.f375259a = bgVar;
        this.f375260b = sVar;
        this.f375261c = set;
        this.f375262d = executor;
        this.f375263e = cvVar;
        this.f375266h = aVar;
        this.f375267i = csVar;
        this.f375264f = mVar;
        this.f375268j = fVar;
        this.f375270l = dVar;
        this.f375269k = z;
    }

    /* renamed from: a */
    public final void mo114045a(Duration duration) {
        C138471cs csVar = this.f375267i;
        C60870cx a = csVar.f376648d.mo50251a();
        C138468cp cpVar = new C138468cp(csVar, duration);
        C46459k.m82829b(C60922j.m93045h(a, C47810es.m84966f(cpVar), csVar.f376649e), "Failed to enqueue the one-off zero-prefix cache refresh background task.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo114046b() {
        C137960t tVar = (C137960t) this.f375266h;
        C71803m.m105043d(tVar.f375337a, (C69585o) null, (C71424ay) null, new C137949i(tVar, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final void mo114047c(C56036l lVar, aod aod) {
        if (aod == aod.CLICKED_SUGGESTION && this.f375269k) {
            this.f375270l.mo114070b(true);
        }
        if (!lVar.f149231b.isEmpty()) {
            C138042f fVar = this.f375268j;
            String uri = fVar.f375603b.mo113405k().appendPath("fp_204").appendQueryParameter("pzps", Base64.encodeToString(lVar.toByteArray(), 11)).appendQueryParameter("client", "searchbox").build().toString();
            C61363ae aeVar = new C61363ae();
            uri.getClass();
            aeVar.f165930a = uri;
            C46459k.m82829b(C47633f.m84733g(C47633f.m84733g(C60856cj.m92900i(aeVar)).mo51516i(fVar.f375608g, fVar.f375607f).mo51516i(new C138037a(fVar), fVar.f375607f)).mo51516i(C137924aj.f375255a, this.f375262d), "Failed to send proactive 0-prefix suggestion stats to footprints.", new Object[0]);
        }
    }

    /* renamed from: d */
    public final void mo114048d(String str, long j) {
        C137940a aVar = this.f375266h;
        C69664n.m101061g(str, "previousQuery");
        C137960t tVar = (C137960t) aVar;
        C71803m.m105043d(tVar.f375337a, (C69585o) null, (C71424ay) null, new C137957q(tVar, str, j, (C69577g) null), 3);
    }
}
