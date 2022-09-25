package com.google.android.apps.search.podcasts.settings;

import android.content.Context;
import android.view.View;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10573k.p10575b.C140436c;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.C140666ao;
import com.google.android.apps.search.podcasts.settings.p10612a.C141050c;
import com.google.android.apps.search.podcasts.settings.p10612a.C141057j;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.p */
/* compiled from: PG */
public final class C141093p {

    /* renamed from: a */
    public static final C59071e f383048a = C59071e.m91331h();

    /* renamed from: b */
    public final Context f383049b;

    /* renamed from: c */
    public final NewEpisodeNotificationsSettingsFragment f383050c;

    /* renamed from: d */
    public final C141057j f383051d;

    /* renamed from: e */
    public final C46801dp f383052e;

    /* renamed from: f */
    public final C140133ai f383053f;

    /* renamed from: g */
    public final C46778cv f383054g;

    /* renamed from: h */
    public final C47770dh f383055h;

    /* renamed from: i */
    public final C141213d f383056i;

    /* renamed from: j */
    public final C28306ab f383057j;

    /* renamed from: k */
    public final C140436c f383058k;

    /* renamed from: l */
    public C141050c f383059l;

    /* renamed from: m */
    public final C1410941 f383060m = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C141093p.f383048a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41647));
            cVar.mo56386p("Failed to get settings data");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C141050c cVar = (C141050c) obj;
            C69664n.m101061g(cVar, "data");
            C141093p.this.mo116149a(cVar);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: n */
    public final C141072ao f383061n;

    /* renamed from: o */
    private final C47400m f383062o;

    /* renamed from: p */
    private final C47449e f383063p;

    public C141093p(Context context, NewEpisodeNotificationsSettingsFragment newEpisodeNotificationsSettingsFragment, C141057j jVar, C46801dp dpVar, C140133ai aiVar, C46778cv cvVar, C47770dh dhVar, C141213d dVar, C28306ab abVar, C47400m mVar, C47449e eVar, C140436c cVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(jVar, "preferencesDataService");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(aiVar, "favoriteManager");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(mVar, "events");
        C69664n.m101061g(eVar, "imageManager");
        C69664n.m101061g(cVar, "notificationPermissionRequester");
        this.f383049b = context;
        this.f383050c = newEpisodeNotificationsSettingsFragment;
        this.f383051d = jVar;
        this.f383052e = dpVar;
        this.f383053f = aiVar;
        this.f383054g = cvVar;
        this.f383055h = dhVar;
        this.f383056i = dVar;
        this.f383057j = abVar;
        this.f383062o = mVar;
        this.f383063p = eVar;
        this.f383058k = cVar;
        this.f383061n = new C141072ao(context, eVar, mVar, C141090m.f383045a, C141091n.f383046a);
    }

    /* renamed from: a */
    public final void mo116149a(C141050c cVar) {
        this.f383059l = cVar;
        View view = this.f383050c.getView();
        if (view != null) {
            view.findViewById(R.id.podcasts_more_actions_button).setOnClickListener(new C47591co(this.f383055h, "open new episode notifications shows action menu", new C141088k(this)));
            C141072ao aoVar = this.f383061n;
            List<C140666ao> list = cVar.f382939h;
            ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
            for (C140666ao aoVar2 : list) {
                arrayList.add(aoVar2.f382044a);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                if (((C140646b) next).f382004j) {
                    arrayList2.add(next);
                }
            }
            aoVar.mo116129a(arrayList2);
        }
    }
}
