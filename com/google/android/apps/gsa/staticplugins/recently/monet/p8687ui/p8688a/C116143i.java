package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.content.Context;
import android.graphics.Movie;
import android.util.LruCache;
import android.view.View;
import com.google.android.apps.gsa.shared.p7195y.C91227s;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.C116163af;
import com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.RecentlyGifView;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116019b;
import com.google.android.apps.gsa.staticplugins.recently.p8679b.C116025a;
import com.google.android.apps.gsa.staticplugins.recently.p8679b.C116030f;
import com.google.android.apps.gsa.staticplugins.recently.p8679b.C116032h;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1875j.C22838i;
import com.google.android.libraries.gsa.p1875j.C22845p;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.i */
/* compiled from: PG */
public final class C116143i extends C116136b {

    /* renamed from: c */
    public static final C59071e f322063c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.i");

    /* renamed from: d */
    private final C116032h f322064d;

    /* renamed from: e */
    private final C22871g f322065e;

    /* renamed from: f */
    private final C91227s f322066f;

    public C116143i(Context context, C116163af afVar, C116032h hVar, C22871g gVar, C91227s sVar) {
        super(context, afVar);
        this.f322064d = hVar;
        this.f322065e = gVar;
        this.f322066f = sVar;
    }

    /* renamed from: c */
    public final int mo102410c() {
        return R.layout.recently_doodle_entry;
    }

    /* renamed from: e */
    public final void mo102412e(int i, int i2) {
    }

    /* renamed from: f */
    public final void mo102413f(View view, C116019b bVar, C116226r rVar, C116214f fVar) {
        super.mo102413f(view, bVar, rVar, fVar);
        Timeline timeline = bVar.f321699a.f321706d;
        int i = rVar.f322281b;
        C22845p pVar = timeline.f322178a[i].f322177h[fVar.f322256e];
        C22838i iVar = pVar.f62901j;
        if (iVar == null) {
            iVar = C22838i.f62869h;
        }
        RecentlyGifView recentlyGifView = (RecentlyGifView) view.findViewById(R.id.doodle_container);
        recentlyGifView.setBackgroundColor(iVar.f62873c);
        recentlyGifView.mo102520a((Movie) null);
        if ((pVar.f62892a & 128) != 0) {
            C116032h hVar = this.f322064d;
            long j = pVar.f62899h;
            LruCache lruCache = C116025a.m192378a().f321719b;
            Long valueOf = Long.valueOf(j);
            C60870cx cxVar = (C60870cx) lruCache.get(valueOf);
            if (cxVar == null) {
                cxVar = hVar.f321730c.mo28201a("loadGif", new C116030f(hVar, j));
                C116025a.m192378a().f321719b.put(valueOf, cxVar);
            }
            C22871g gVar = this.f322065e;
            Objects.requireNonNull(recentlyGifView);
            new C90873ag(cxVar, gVar, "setup gif", new C116139e(recentlyGifView)).mo85223a(new C116140f(this, recentlyGifView, pVar));
            return;
        }
        mo102525h(recentlyGifView, iVar);
    }

    /* renamed from: h */
    public final void mo102525h(RecentlyGifView recentlyGifView, C22838i iVar) {
        if (!iVar.f62872b.isEmpty()) {
            new C90873ag(this.f322066f.mo85510a(iVar.f62872b, 7), this.f322065e, "Doodle image loaded", new C116141g(recentlyGifView)).mo85223a(new C116142h(this, recentlyGifView));
        }
    }
}
