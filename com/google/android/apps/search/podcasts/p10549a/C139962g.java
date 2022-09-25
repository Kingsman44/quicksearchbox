package com.google.android.apps.search.podcasts.p10549a;

import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10590o.C140709b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.a.g */
/* compiled from: PG */
public final class C139962g {

    /* renamed from: a */
    private final C140133ai f380442a;

    /* renamed from: b */
    private final C140709b f380443b;

    /* renamed from: c */
    private final C140459au f380444c;

    public C139962g(C140133ai aiVar, C140709b bVar, C140459au auVar) {
        C69664n.m101061g(aiVar, "favoriteManager");
        C69664n.m101061g(bVar, "reactionManager");
        C69664n.m101061g(auVar, "preferencesManager");
        this.f380442a = aiVar;
        this.f380443b = bVar;
        this.f380444c = auVar;
    }

    /* renamed from: a */
    public final C60870cx mo115364a(List list) {
        C69664n.m101061g(list, "shows");
        C60870cx c = this.f380442a.mo115472c();
        C60870cx a = this.f380443b.mo115839a();
        C60870cx c2 = this.f380444c.mo115678c();
        return C47638k.m84751b(c, a, c2).mo51520a(new C139961f(list, c, a, c2), C60826bg.f164896a);
    }
}
