package com.google.android.apps.search.podcasts.searchresults;

import android.support.p033v7.widget.C0660fv;
import android.view.View;
import com.google.android.apps.search.podcasts.p10566g.p10567a.C140333a;
import com.google.android.apps.search.podcasts.p10591p.C140735a;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.apps.search.podcasts.p10601r.p10602a.C140957c;
import com.google.android.apps.search.podcasts.searchresults.p10611a.C141027b;
import com.google.android.apps.search.podcasts.searchresults.p10611a.C141035j;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141252c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.searchresults.b */
/* compiled from: PG */
public final class C141037b {

    /* renamed from: a */
    public static final C59071e f382883a = C59071e.m91331h();

    /* renamed from: b */
    public final C141045i f382884b;

    /* renamed from: c */
    public final SearchResultsFragment f382885c;

    /* renamed from: d */
    public final C46801dp f382886d;

    /* renamed from: e */
    public final C141035j f382887e;

    /* renamed from: f */
    public final C140333a f382888f;

    /* renamed from: g */
    public final C0660fv f382889g;

    /* renamed from: h */
    public final C141213d f382890h;

    /* renamed from: i */
    public final C46485f f382891i;

    /* renamed from: j */
    public final C28310af f382892j;

    /* renamed from: k */
    public final C140749o f382893k;

    /* renamed from: l */
    public final C140957c f382894l;

    /* renamed from: m */
    public C141027b f382895m;

    /* renamed from: n */
    public C31974aw f382896n;

    /* renamed from: com.google.android.apps.search.podcasts.searchresults.b$a */
    /* compiled from: PG */
    final class C141038a implements C46792di {
        public C141038a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C141037b.f382883a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41644));
            cVar.mo56386p("Error loading search results");
            View a = C141037b.this.mo116091a();
            if (a != null) {
                a.setVisibility(8);
            }
            C141037b.this.f382893k.mo115855d(C140735a.ERROR);
            C141037b.this.mo116093c(C141252c.ERROR);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C140735a aVar;
            C141027b bVar = (C141027b) obj;
            C69664n.m101061g(bVar, "data");
            C141037b bVar2 = C141037b.this;
            if (bVar2.f382895m == null) {
                C140749o oVar = bVar2.f382893k;
                if (bVar.f382866a.f382708a.isEmpty()) {
                    aVar = C140735a.EMPTY;
                } else {
                    aVar = C140735a.COMPLETE;
                }
                oVar.mo115855d(aVar);
            }
            C141037b.this.mo116092b(bVar);
            if (bVar.f382867b) {
                C141037b bVar3 = C141037b.this;
                bVar3.f382894l.mo116042a(bVar3.f382885c);
            }
        }

        /* renamed from: c */
        public final void mo18079c() {
            View a = C141037b.this.mo116091a();
            if (a != null) {
                a.setVisibility(0);
            }
        }
    }

    public C141037b(C141045i iVar, SearchResultsFragment searchResultsFragment, C46801dp dpVar, C141035j jVar, C140333a aVar, C0660fv fvVar, C141213d dVar, C46485f fVar, C28310af afVar, C140749o oVar, C140957c cVar) {
        C69664n.m101061g(dpVar, "subscriptionsMixin");
        C69664n.m101061g(fvVar, "recycledViewPool");
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(oVar, "podcastsStreamz");
        C69664n.m101061g(cVar, "aadcDialogHelper");
        this.f382884b = iVar;
        this.f382885c = searchResultsFragment;
        this.f382886d = dpVar;
        this.f382887e = jVar;
        this.f382888f = aVar;
        this.f382889g = fvVar;
        this.f382890h = dVar;
        this.f382891i = fVar;
        this.f382892j = afVar;
        this.f382893k = oVar;
        this.f382894l = cVar;
    }

    /* renamed from: a */
    public final View mo116091a() {
        View view = this.f382885c.getView();
        if (view != null) {
            return view.findViewById(R.id.podcasts_search_results_progress);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo116092b(C141027b bVar) {
        C141252c cVar;
        if (bVar != null) {
            C31974aw awVar = this.f382896n;
            if (awVar != null) {
                awVar.mo37740a(bVar.f382866a);
            }
            if (bVar.f382866a.f382708a.isEmpty()) {
                cVar = C141252c.EMPTY;
            } else {
                cVar = C141252c.NONE;
            }
            mo116093c(cVar);
        }
        this.f382895m = bVar;
        View a = mo116091a();
        if (a != null) {
            a.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo116093c(C141252c cVar) {
        FullScreenMessageView fullScreenMessageView;
        View view = this.f382885c.getView();
        if (view != null && (fullScreenMessageView = (FullScreenMessageView) view.findViewById(R.id.podcasts_search_results_message_layer)) != null) {
            fullScreenMessageView.mo17754z().mo116270a(cVar);
        }
    }
}
