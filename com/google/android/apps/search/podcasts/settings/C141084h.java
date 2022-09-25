package com.google.android.apps.search.podcasts.settings;

import android.content.Context;
import android.view.View;
import android.widget.Switch;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.C140666ao;
import com.google.android.apps.search.podcasts.p10601r.C140997s;
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

/* renamed from: com.google.android.apps.search.podcasts.settings.h */
/* compiled from: PG */
public final class C141084h {

    /* renamed from: a */
    public static final C59071e f383025a = C59071e.m91331h();

    /* renamed from: b */
    public final Context f383026b;

    /* renamed from: c */
    public final AutoDownloadSettingsFragment f383027c;

    /* renamed from: d */
    public final C141057j f383028d;

    /* renamed from: e */
    public final C46801dp f383029e;

    /* renamed from: f */
    public final C140133ai f383030f;

    /* renamed from: g */
    public final C46778cv f383031g;

    /* renamed from: h */
    public final C47770dh f383032h;

    /* renamed from: i */
    public final C141213d f383033i;

    /* renamed from: j */
    public final C28306ab f383034j;

    /* renamed from: k */
    public C141050c f383035k;

    /* renamed from: l */
    public final C1410851 f383036l = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C69664n.m101061g(th, C42181t.f110467a);
            C59052c cVar = (C59052c) ((C59052c) C141084h.f383025a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41645));
            cVar.mo56386p("Failed to get settings data");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C141050c cVar = (C141050c) obj;
            C69664n.m101061g(cVar, "data");
            C141084h.this.mo116146a(cVar);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: m */
    public final C141072ao f383037m;

    /* renamed from: n */
    private final C47400m f383038n;

    /* renamed from: o */
    private final C47449e f383039o;

    /* renamed from: p */
    private final C140997s f383040p;

    public C141084h(Context context, AutoDownloadSettingsFragment autoDownloadSettingsFragment, C141057j jVar, C46801dp dpVar, C140133ai aiVar, C46778cv cvVar, C47770dh dhVar, C141213d dVar, C28306ab abVar, C47400m mVar, C47449e eVar, C140997s sVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(jVar, "preferencesDataService");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(aiVar, "favoriteManager");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(mVar, "events");
        C69664n.m101061g(eVar, "imageManager");
        C69664n.m101061g(sVar, "veLoggedEvents");
        this.f383026b = context;
        this.f383027c = autoDownloadSettingsFragment;
        this.f383028d = jVar;
        this.f383029e = dpVar;
        this.f383030f = aiVar;
        this.f383031g = cvVar;
        this.f383032h = dhVar;
        this.f383033i = dVar;
        this.f383034j = abVar;
        this.f383038n = mVar;
        this.f383039o = eVar;
        this.f383040p = sVar;
        this.f383037m = new C141072ao(context, eVar, mVar, C141081e.f383022a, C141082f.f383023a);
    }

    /* renamed from: a */
    public final void mo116146a(C141050c cVar) {
        this.f383035k = cVar;
        View view = this.f383027c.getView();
        if (view != null) {
            Switch switchR = (Switch) view.findViewById(R.id.podcasts_enable_auto_download);
            switchR.setEnabled(true);
            switchR.setChecked(cVar.f382935d);
            C140997s sVar = this.f383040p;
            C69664n.m101060f(switchR, "this");
            sVar.mo116062a(switchR, new C141076b(this, cVar), "Autodownload new episodes switch");
            view.findViewById(R.id.podcasts_detailed_settings_container).setVisibility(true != cVar.f382935d ? 8 : 0);
            Switch switchR2 = (Switch) view.findViewById(R.id.podcasts_enable_auto_download_only_on_unmetered_networks);
            switchR2.setEnabled(true);
            switchR2.setChecked(cVar.f382936e);
            C140997s sVar2 = this.f383040p;
            C69664n.m101060f(switchR2, "this");
            sVar2.mo116062a(switchR2, new C141079c(this, cVar), "Auto download only on wi-fi switch");
            view.findViewById(R.id.podcasts_more_actions_button).setOnClickListener(new C47591co(this.f383032h, "open auto download shows action menu", new C141080d(this)));
            C141072ao aoVar = this.f383037m;
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
