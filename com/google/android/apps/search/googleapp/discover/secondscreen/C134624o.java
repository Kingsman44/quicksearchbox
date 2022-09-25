package com.google.android.apps.search.googleapp.discover.secondscreen;

import android.support.p031v4.app.Fragment;
import android.view.Menu;
import com.google.android.apps.search.googleapp.discover.streamui.C134714d;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.p10536x.p10538b.C139866a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.monitoring.feedback.HelpAndFeedbackStarter;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47722m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.secondscreen.o */
/* compiled from: PG */
public final class C134624o {

    /* renamed from: k */
    private static final C59071e f366599k = C59071e.m91331h();

    /* renamed from: a */
    public final C134619j f366600a;

    /* renamed from: b */
    public final C134714d f366601b;

    /* renamed from: c */
    public final AccountId f366602c;

    /* renamed from: d */
    public final C134621l f366603d;

    /* renamed from: e */
    public final Optional f366604e;

    /* renamed from: f */
    public final C47770dh f366605f;

    /* renamed from: g */
    public final C139866a f366606g;

    /* renamed from: h */
    public final HelpAndFeedbackStarter f366607h;

    /* renamed from: i */
    public final C47722m f366608i;

    /* renamed from: j */
    public final boolean f366609j;

    public C134624o(C134619j jVar, C134714d dVar, AccountId accountId, C134621l lVar, Optional optional, C47770dh dhVar, C139866a aVar, HelpAndFeedbackStarter helpAndFeedbackStarter, C47722m mVar, boolean z, C71422aw awVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(optional, "devBadgeViewCreatorOptional");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(helpAndFeedbackStarter, "helpAndFeedbackStarter");
        C69664n.m101061g(mVar, "v7TraceCreation");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f366600a = jVar;
        this.f366601b = dVar;
        this.f366602c = accountId;
        this.f366603d = lVar;
        this.f366604e = optional;
        this.f366605f = dhVar;
        this.f366606g = aVar;
        this.f366607h = helpAndFeedbackStarter;
        this.f366608i = mVar;
        this.f366609j = z;
    }

    /* renamed from: c */
    public static final void m218356c(Menu menu, int i, int i2) {
        menu.add(0, i, 0, i2);
    }

    /* renamed from: a */
    public final C134744f mo111850a() {
        Fragment b = this.f366600a.getChildFragmentManager().f634a.mo670b(R.id.googleapp_second_screen_feed);
        if (b == null) {
            C59052c cVar = (C59052c) f366599k.mo56226d();
            cVar.mo56379ah(new C59094n(40411));
            cVar.mo56386p("No Discover fragment attached.");
        }
        C69664n.m101059e(b, "null cannot be cast to non-null type com.google.apps.tiktok.inject.PeeredInterface<com.google.android.apps.search.googleapp.discover.streamui.DiscoverFragmentPeer>");
        return (C134744f) ((C47231d) b).mo17754z();
    }

    /* renamed from: b */
    public final void mo111851b() {
        C134744f a = mo111850a();
        if (a != null) {
            a.mo111956j(C134720e.NAVIGATED_BACK);
        }
    }
}
