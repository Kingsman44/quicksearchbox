package com.google.android.apps.search.podcasts.explore;

import android.support.p033v7.widget.C0660fv;
import android.view.View;
import com.google.android.apps.search.podcasts.explore.p10564a.C140249b;
import com.google.android.apps.search.podcasts.explore.p10564a.C140261n;
import com.google.android.apps.search.podcasts.p10566g.p10567a.C140333a;
import com.google.android.apps.search.podcasts.p10591p.C140735a;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.android.apps.search.podcasts.p10601r.p10602a.C140957c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141252c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.explore.l */
/* compiled from: PG */
public final class C140273l {

    /* renamed from: a */
    public static final C59071e f381078a = C59071e.m91331h();

    /* renamed from: b */
    public final C140262b f381079b;

    /* renamed from: c */
    public final C46801dp f381080c;

    /* renamed from: d */
    public final C140261n f381081d;

    /* renamed from: e */
    public final C140333a f381082e;

    /* renamed from: f */
    public final C0660fv f381083f;

    /* renamed from: g */
    public final C140272k f381084g;

    /* renamed from: h */
    public final C28310af f381085h;

    /* renamed from: i */
    public final C140749o f381086i;

    /* renamed from: j */
    public final C140957c f381087j;

    /* renamed from: k */
    public C140249b f381088k;

    /* renamed from: l */
    public C31974aw f381089l;

    /* renamed from: com.google.android.apps.search.podcasts.explore.l$a */
    /* compiled from: PG */
    final class C140274a implements C46792di {
        public C140274a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) C140273l.f381078a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41588));
            cVar.mo56386p("Error loading explore tab");
            C140273l lVar = C140273l.this;
            C140749o oVar = lVar.f381086i;
            String str = lVar.f381079b.f381052b;
            C69664n.m101060f(str, "exploreArgs.tabId");
            oVar.mo115853b(str, C140735a.ERROR);
            C140273l.this.mo115541b(C141252c.ERROR);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C140735a aVar;
            C140249b bVar = (C140249b) obj;
            C69664n.m101061g(bVar, "data");
            C140273l lVar = C140273l.this;
            if (lVar.f381088k == null) {
                C140952k kVar = bVar.f381018a;
                C140749o oVar = lVar.f381086i;
                String str = lVar.f381079b.f381052b;
                C69664n.m101060f(str, "exploreArgs.tabId");
                if (kVar.f382708a.isEmpty()) {
                    aVar = C140735a.EMPTY;
                } else {
                    aVar = C140735a.COMPLETE;
                }
                oVar.mo115853b(str, aVar);
            }
            C140273l.this.mo115540a(bVar);
            if (bVar.f381019b) {
                C140273l lVar2 = C140273l.this;
                lVar2.f381087j.mo116042a(lVar2.f381084g);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C140273l(C140262b bVar, C46801dp dpVar, C140261n nVar, C140333a aVar, C0660fv fvVar, C140272k kVar, C28310af afVar, C140749o oVar, C140957c cVar) {
        C69664n.m101061g(dpVar, "subscriptionsMixin");
        C69664n.m101061g(nVar, "exploreFeedService");
        C69664n.m101061g(fvVar, "recycledViewPool");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(oVar, "podcastsStreamz");
        C69664n.m101061g(cVar, "aadcDialogHelper");
        this.f381079b = bVar;
        this.f381080c = dpVar;
        this.f381081d = nVar;
        this.f381082e = aVar;
        this.f381083f = fvVar;
        this.f381084g = kVar;
        this.f381085h = afVar;
        this.f381086i = oVar;
        this.f381087j = cVar;
    }

    /* renamed from: a */
    public final void mo115540a(C140249b bVar) {
        C141252c cVar;
        if (bVar != null) {
            C31974aw awVar = this.f381089l;
            if (awVar != null) {
                awVar.mo37740a(bVar.f381018a);
            }
            if (bVar.f381018a.f382708a.isEmpty()) {
                cVar = C141252c.ERROR;
            } else {
                cVar = C141252c.NONE;
            }
            mo115541b(cVar);
        }
        this.f381088k = bVar;
    }

    /* renamed from: b */
    public final void mo115541b(C141252c cVar) {
        FullScreenMessageView fullScreenMessageView;
        C69664n.m101061g(cVar, "state");
        View view = this.f381084g.getView();
        if (view != null && (fullScreenMessageView = (FullScreenMessageView) view.findViewById(R.id.podcasts_explore_tab_message_layer)) != null) {
            fullScreenMessageView.mo17754z().mo116270a(cVar);
        }
    }
}
