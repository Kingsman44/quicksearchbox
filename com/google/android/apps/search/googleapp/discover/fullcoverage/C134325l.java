package com.google.android.apps.search.googleapp.discover.fullcoverage;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.streamui.C134714d;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.p10536x.p10538b.C139866a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.monitoring.feedback.HelpAndFeedbackStarter;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47722m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57062ad;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.fullcoverage.l */
/* compiled from: PG */
public final class C134325l {

    /* renamed from: l */
    private static final C59071e f365870l = C59071e.m91331h();

    /* renamed from: a */
    public final C134321h f365871a;

    /* renamed from: b */
    public final C134714d f365872b;

    /* renamed from: c */
    public final AccountId f365873c;

    /* renamed from: d */
    public final C57062ad f365874d;

    /* renamed from: e */
    public final Optional f365875e;

    /* renamed from: f */
    public final C47770dh f365876f;

    /* renamed from: g */
    public final C135200t f365877g;

    /* renamed from: h */
    public final C139866a f365878h;

    /* renamed from: i */
    public final HelpAndFeedbackStarter f365879i;

    /* renamed from: j */
    public final C47722m f365880j;

    /* renamed from: k */
    public final C71422aw f365881k;

    public C134325l(C134321h hVar, C134714d dVar, AccountId accountId, C57062ad adVar, Optional optional, C47770dh dhVar, C135200t tVar, C139866a aVar, HelpAndFeedbackStarter helpAndFeedbackStarter, C47722m mVar, C71422aw awVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(optional, "devBadgeViewCreatorOptional");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(helpAndFeedbackStarter, "helpAndFeedbackStarter");
        C69664n.m101061g(mVar, "v7traceCreation");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f365871a = hVar;
        this.f365872b = dVar;
        this.f365873c = accountId;
        this.f365874d = adVar;
        this.f365875e = optional;
        this.f365876f = dhVar;
        this.f365877g = tVar;
        this.f365878h = aVar;
        this.f365879i = helpAndFeedbackStarter;
        this.f365880j = mVar;
        this.f365881k = awVar;
    }

    /* renamed from: a */
    public final C134744f mo111733a() {
        Fragment c = this.f365871a.getChildFragmentManager().f634a.mo671c("discover");
        if (c == null) {
            C59052c cVar = (C59052c) f365870l.mo56226d();
            cVar.mo56379ah(new C59094n(40348));
            cVar.mo56386p("No Discover fragment attached.");
        }
        C69664n.m101059e(c, "null cannot be cast to non-null type com.google.apps.tiktok.inject.PeeredInterface<com.google.android.apps.search.googleapp.discover.streamui.DiscoverFragmentPeer>");
        return (C134744f) ((C47231d) c).mo17754z();
    }

    /* renamed from: b */
    public final void mo111734b() {
        C134744f a = mo111733a();
        if (a != null) {
            a.mo111956j(C134720e.NAVIGATED_BACK);
        }
    }
}
