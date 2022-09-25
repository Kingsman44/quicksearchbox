package com.google.android.apps.search.podcasts.home;

import android.support.p033v7.widget.C0660fv;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.search.podcasts.home.p10570a.C140396g;
import com.google.android.apps.search.podcasts.home.p10570a.C140397h;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10565f.C140300au;
import com.google.android.apps.search.podcasts.p10566g.p10567a.C140333a;
import com.google.android.apps.search.podcasts.p10591p.C140735a;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.apps.search.podcasts.p10601r.p10602a.C140957c;
import com.google.android.apps.search.podcasts.p10601r.p10606d.C140971c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141252c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141218i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47707g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60866ct;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.home.b */
/* compiled from: PG */
public final class C140398b {

    /* renamed from: a */
    public static final C59071e f381365a = C59071e.m91331h();

    /* renamed from: b */
    public final C46801dp f381366b;

    /* renamed from: c */
    public final C140396g f381367c;

    /* renamed from: d */
    public final C140333a f381368d;

    /* renamed from: e */
    public final C0660fv f381369e;

    /* renamed from: f */
    public final HomeFragment f381370f;

    /* renamed from: g */
    public final C28310af f381371g;

    /* renamed from: h */
    public final C47707g f381372h;

    /* renamed from: i */
    public final C141218i f381373i;

    /* renamed from: j */
    public final C140971c f381374j;

    /* renamed from: k */
    public final C140749o f381375k;

    /* renamed from: l */
    public final C140957c f381376l;

    /* renamed from: m */
    public C140397h f381377m;

    /* renamed from: n */
    public C31974aw f381378n;

    /* renamed from: o */
    private final C46778cv f381379o;

    /* renamed from: com.google.android.apps.search.podcasts.home.b$a */
    /* compiled from: PG */
    final class C140399a implements C46792di.C46793a {
        public C140399a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C140398b.f381365a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41594));
            cVar.mo56386p("Error loading home feed");
            C140398b.this.f381375k.mo115854c(C140735a.ERROR);
            C140398b.this.mo115650d(C141252c.ERROR);
            SwipeRefreshLayout a = C140398b.this.mo115647a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C140735a aVar;
            C140397h hVar = (C140397h) obj;
            C69664n.m101061g(hVar, "data");
            C140398b bVar = C140398b.this;
            if (bVar.f381377m == null) {
                C140749o oVar = bVar.f381375k;
                if (hVar.f381363a.f382708a.isEmpty()) {
                    aVar = C140735a.EMPTY;
                } else {
                    aVar = C140735a.COMPLETE;
                }
                oVar.mo115854c(aVar);
            }
            C140398b.this.mo115648b(hVar);
            SwipeRefreshLayout a = C140398b.this.mo115647a();
            if (a != null) {
                a.mo8794l(false, false);
            }
            if (hVar.f381364b) {
                C140398b bVar2 = C140398b.this;
                bVar2.f381376l.mo116042a(bVar2.f381370f);
            }
        }

        /* renamed from: c */
        public final void mo18079c() {
            SwipeRefreshLayout a = C140398b.this.mo115647a();
            if (a != null) {
                a.mo8794l(true, false);
            }
        }

        /* renamed from: d */
        public final void mo50733d() {
        }

        /* renamed from: e */
        public final void mo50734e(Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) C140398b.f381365a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41593));
            cVar.mo56386p("Error background fetching home feed");
            SwipeRefreshLayout a = C140398b.this.mo115647a();
            if (a != null) {
                if (a.f13509b) {
                    C47393f.m84237h(new C140300au(), a);
                }
                a.mo8794l(false, false);
            }
        }

        /* renamed from: f */
        public final void mo50735f() {
            SwipeRefreshLayout a = C140398b.this.mo115647a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }
    }

    public C140398b(C46801dp dpVar, C140396g gVar, C46778cv cvVar, C140333a aVar, C0660fv fvVar, HomeFragment homeFragment, C28310af afVar, C47707g gVar2, C141218i iVar, C140971c cVar, C140749o oVar, C140957c cVar2) {
        C69664n.m101061g(dpVar, "subscriptionsMixin");
        C69664n.m101061g(gVar, "homeFeedService");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(fvVar, "recycledViewPool");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(oVar, "podcastsStreamz");
        C69664n.m101061g(cVar2, "aadcDialogHelper");
        this.f381366b = dpVar;
        this.f381367c = gVar;
        this.f381379o = cvVar;
        this.f381368d = aVar;
        this.f381369e = fvVar;
        this.f381370f = homeFragment;
        this.f381371g = afVar;
        this.f381372h = gVar2;
        this.f381373i = iVar;
        this.f381374j = cVar;
        this.f381375k = oVar;
        this.f381376l = cVar2;
    }

    /* renamed from: a */
    public final SwipeRefreshLayout mo115647a() {
        View view = this.f381370f.getView();
        if (view != null) {
            return (SwipeRefreshLayout) view.findViewById(R.id.podcasts_home_refresh_layout);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo115648b(C140397h hVar) {
        C141252c cVar;
        if (hVar != null) {
            C31974aw awVar = this.f381378n;
            if (awVar != null) {
                awVar.mo37740a(hVar.f381363a);
            }
            if (hVar.f381363a.f382708a.isEmpty()) {
                cVar = C141252c.EMPTY;
            } else {
                cVar = C141252c.NONE;
            }
            mo115650d(cVar);
        }
        this.f381377m = hVar;
    }

    /* renamed from: c */
    public final void mo115649c() {
        this.f381379o.mo50788b(C60866ct.f164955a, C140192a.f380885a);
    }

    /* renamed from: d */
    public final void mo115650d(C141252c cVar) {
        FullScreenMessageView fullScreenMessageView;
        C69664n.m101061g(cVar, "state");
        View view = this.f381370f.getView();
        if (view != null && (fullScreenMessageView = (FullScreenMessageView) view.findViewById(R.id.podcasts_message_layer)) != null) {
            fullScreenMessageView.mo17754z().mo116270a(cVar);
        }
    }
}
