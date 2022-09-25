package com.google.android.apps.search.podcasts.show;

import android.view.View;
import com.google.android.apps.search.podcasts.p10601r.C140993o;
import com.google.android.apps.search.podcasts.show.p10614a.C141108a;
import com.google.android.apps.search.podcasts.show.p10616c.C141141b;
import com.google.android.apps.search.podcasts.show.p10616c.C141150k;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141252c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.play.unison.binding.C31974aw;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47707g;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.w */
/* compiled from: PG */
public final class C141175w {

    /* renamed from: a */
    public static final C59071e f383264a = C59071e.m91331h();

    /* renamed from: b */
    public final C141122ag f383265b;

    /* renamed from: c */
    public final C46801dp f383266c;

    /* renamed from: d */
    public final C141150k f383267d;

    /* renamed from: e */
    public final C28310af f383268e;

    /* renamed from: f */
    public final C47707g f383269f;

    /* renamed from: g */
    public final C47770dh f383270g;

    /* renamed from: h */
    public final C46778cv f383271h;

    /* renamed from: i */
    public final ShowFragment f383272i;

    /* renamed from: j */
    public final C141108a f383273j;

    /* renamed from: k */
    public final C141213d f383274k;

    /* renamed from: l */
    public final AccountId f383275l;

    /* renamed from: m */
    public final C46485f f383276m;

    /* renamed from: n */
    public C141141b f383277n;

    /* renamed from: o */
    public C31974aw f383278o;

    public C141175w(C141122ag agVar, C46801dp dpVar, C141150k kVar, C28310af afVar, C47707g gVar, C47770dh dhVar, C46778cv cvVar, ShowFragment showFragment, C141108a aVar, C141213d dVar, AccountId accountId, C46485f fVar) {
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(aVar, "showBindableFactory");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(fVar, "accountNavigation");
        this.f383265b = agVar;
        this.f383266c = dpVar;
        this.f383267d = kVar;
        this.f383268e = afVar;
        this.f383269f = gVar;
        this.f383270g = dhVar;
        this.f383271h = cvVar;
        this.f383272i = showFragment;
        this.f383273j = aVar;
        this.f383274k = dVar;
        this.f383275l = accountId;
        this.f383276m = fVar;
    }

    /* renamed from: a */
    public final void mo116208a(C141141b bVar) {
        C141252c cVar;
        if (bVar != null) {
            C31974aw awVar = this.f383278o;
            if (awVar != null) {
                awVar.mo37740a(bVar.f383197b);
            }
            if (bVar.f383196a == C140993o.EXPLICIT) {
                cVar = C141252c.EXPLICIT_CONTENT;
            } else if (bVar.f383197b.f382708a.isEmpty()) {
                cVar = C141252c.ERROR;
            } else {
                cVar = C141252c.NONE;
            }
            mo116209b(cVar);
        }
        this.f383277n = bVar;
    }

    /* renamed from: b */
    public final void mo116209b(C141252c cVar) {
        FullScreenMessageView fullScreenMessageView;
        View view = this.f383272i.getView();
        if (view != null && (fullScreenMessageView = (FullScreenMessageView) view.findViewById(R.id.podcasts_message_layer)) != null) {
            fullScreenMessageView.mo17754z().mo116270a(cVar);
        }
    }
}
