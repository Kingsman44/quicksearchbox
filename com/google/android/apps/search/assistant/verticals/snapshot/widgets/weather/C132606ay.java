package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.apps.search.assistant.verticals.snapshot.p10080a.C132570a;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10082b.C132610b;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c.C132620e;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c.C132621f;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c.C132624i;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10084d.C132632g;
import com.google.android.apps.search.googleapp.compliance.p10146c.C133623a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.location.p3029a.C38586af;
import com.google.android.libraries.search.location.p3029a.C38631bw;
import com.google.android.libraries.search.location.p3029a.C38632bx;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.assistant.p3994s.p3995a.C53234gi;
import com.google.assistant.p3994s.p3995a.C53244gs;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.assistant.p3994s.p3995a.C53254hb;
import com.google.assistant.p3994s.p3995a.C53258hf;
import com.google.assistant.p3994s.p3995a.C53259hg;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ay */
/* compiled from: PG */
public final class C132606ay {

    /* renamed from: a */
    public static final C59071e f361884a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ay");

    /* renamed from: b */
    public final C38683aa f361885b;

    /* renamed from: c */
    public final C132570a f361886c;

    /* renamed from: d */
    public final C60887da f361887d;

    /* renamed from: e */
    public final C60887da f361888e;

    /* renamed from: f */
    public final C132624i f361889f;

    /* renamed from: g */
    public final AccountId f361890g;

    /* renamed from: h */
    public final C132610b f361891h;

    /* renamed from: i */
    public final C132613bc f361892i;

    /* renamed from: j */
    public final boolean f361893j;

    /* renamed from: k */
    public final boolean f361894k;

    /* renamed from: l */
    public final boolean f361895l;

    /* renamed from: m */
    public final C133623a f361896m;

    /* renamed from: n */
    public final C132632g f361897n;

    /* renamed from: o */
    private final C47449e f361898o;

    /* renamed from: p */
    private final C42876ab f361899p;

    /* renamed from: q */
    private final C21370a f361900q;

    /* renamed from: r */
    private final C46175b f361901r;

    /* renamed from: s */
    private final ConnectivityManager f361902s;

    /* renamed from: t */
    private final C38586af f361903t;

    public C132606ay(C47449e eVar, C38683aa aaVar, C132570a aVar, C60887da daVar, C60887da daVar2, C42876ab abVar, C21370a aVar2, C132624i iVar, AccountId accountId, C46175b bVar, C132610b bVar2, C132613bc bcVar, ConnectivityManager connectivityManager, boolean z, boolean z2, boolean z3, C133623a aVar3, C38586af afVar, C132632g gVar) {
        this.f361898o = eVar;
        this.f361885b = aaVar;
        this.f361886c = aVar;
        this.f361887d = daVar;
        this.f361888e = daVar2;
        this.f361899p = abVar;
        this.f361900q = aVar2;
        this.f361889f = iVar;
        this.f361890g = accountId;
        this.f361901r = bVar;
        this.f361891h = bVar2;
        this.f361892i = bcVar;
        this.f361902s = connectivityManager;
        this.f361893j = z;
        this.f361894k = z2;
        this.f361895l = z3;
        this.f361896m = aVar3;
        this.f361903t = afVar;
        this.f361897n = gVar;
    }

    /* renamed from: j */
    private final void m215575j(Context context, AppWidgetManager appWidgetManager, int i, int i2, int[] iArr, int[] iArr2) {
        this.f361891h.mo110838e(i, i2);
        int i3 = i2;
        Context context2 = context;
        AppWidgetManager appWidgetManager2 = appWidgetManager;
        C132590ai.m215564h(i3, context2, appWidgetManager2, iArr, 1, this.f361895l);
        C132590ai.m215564h(i3, context2, appWidgetManager2, iArr2, 2, this.f361895l);
    }

    /* renamed from: a */
    public final C60870cx mo110825a(C53245gt gtVar) {
        if (!gtVar.f139569c.isEmpty()) {
            C53234gi giVar = gtVar.f139573g;
            if (giVar == null) {
                giVar = C53234gi.f139523e;
            }
            if (giVar.f139528d.size() < 5) {
                C59052c cVar = (C59052c) ((C59052c) f361884a.mo56226d()).mo56372aa(39734);
                C53234gi giVar2 = gtVar.f139573g;
                if (giVar2 == null) {
                    giVar2 = C53234gi.f139523e;
                }
                cVar.mo56387q("WeatherWidgetResponse has not enough hourly_forecast items %s", giVar2.f139528d.size());
                return C60856cj.m92899h(new Exception("WeatherWidgetResponse has not enough hourly_forecast"));
            }
            if (this.f361895l && gtVar.f139569c.size() < 3) {
                ((C59052c) ((C59052c) f361884a.mo56226d()).mo56372aa(39733)).mo56386p("WeatherWidgetResponse has not enough daily_forecast items");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(C5528f.m14300b(C5528f.m14299a(this.f361898o.mo51286a().mo11864b().mo12448j(((C53230ge) gtVar.f139569c.get(0)).f139512h))));
            C53234gi giVar3 = gtVar.f139573g;
            if (giVar3 == null) {
                giVar3 = C53234gi.f139523e;
            }
            for (int i = 0; i < 5; i++) {
                arrayList.add(C5528f.m14300b(C5528f.m14299a(this.f361898o.mo51286a().mo11864b().mo12448j(((C53244gs) giVar3.f139528d.get(i)).f139562h))));
            }
            if (this.f361895l) {
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList.add(C5528f.m14300b(C5528f.m14299a(this.f361898o.mo51286a().mo11864b().mo12448j(((C53230ge) gtVar.f139569c.get(i2)).f139512h))));
                }
            }
            return C47638k.m84752c(arrayList).mo51520a(new C132599ar(arrayList, gtVar), this.f361888e);
        }
        ((C59052c) ((C59052c) f361884a.mo56226d()).mo56372aa(39735)).mo56386p("WeatherWidgetResponse has no daily_forecast");
        return C60856cj.m92899h(new Exception("WeatherWidgetResponse has no daily_forecast"));
    }

    /* renamed from: b */
    public final C60870cx mo110826b(C63042fg fgVar) {
        return this.f361899p.mo46039a(new C132601at(this, fgVar), this.f361888e);
    }

    /* renamed from: c */
    public final C60870cx mo110827c() {
        C38586af afVar = this.f361903t;
        C38631bw bwVar = (C38631bw) C38632bx.f102079c.createBuilder();
        bwVar.copyOnWrite();
        C38632bx bxVar = (C38632bx) bwVar.instance;
        bxVar.f102082b = 3;
        bxVar.f102081a |= 1;
        return afVar.mo41513i((C38632bx) bwVar.build());
    }

    /* renamed from: d */
    public final C63042fg mo110828d() {
        return C62953e.m95484i(this.f361900q.mo26870b());
    }

    /* renamed from: e */
    public final void mo110829e() {
        C60870cx c = this.f361901r.mo50246c(this.f361890g);
        C132605ax axVar = new C132605ax();
        C60856cj.m92911t(c, C47810es.m84974n(axVar), this.f361888e);
    }

    /* renamed from: f */
    public final void mo110830f(Context context) {
        C59071e eVar = f361884a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39743)).mo56386p("#onDeleted()");
        int[] d = C132582aa.m215550d(context);
        int[] c = C132582aa.m215549c(context);
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39744)).mo56389s("squareAppWidgetIds: %s", d);
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39745)).mo56389s("freeformAppWidgetIds: %s", c);
        if (d.length + c.length == 0) {
            C132624i iVar = this.f361889f;
            if (!iVar.f361943e) {
                C59104x b = C132624i.f361939a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "WeatherWidgetToPcpWriter");
                ((C59052c) ((C59052c) b).mo56372aa(39773)).mo56386p("#updateDataOrigin is disabled by mendel flag.");
                return;
            }
            C58480gp e = C58485gu.m89837e();
            C60870cx a = iVar.f361941c.f341550b.mo45937a(new C132620e(iVar, C123611ad.m202953l(C58485gu.m89846n(1), C53306j.OPA_SMARTSPACE), e));
            C132621f fVar = new C132621f(iVar, e);
            C46459k.m82829b(C60922j.m93045h(a, C47810es.m84966f(fVar), iVar.f361940b), "%s: PCP update failed", iVar.getClass().getSimpleName());
        }
    }

    /* renamed from: g */
    public final boolean mo110831g(Context context, int[] iArr, int[] iArr2) {
        if (iArr.length + iArr2.length != 0) {
            return false;
        }
        ((C59052c) ((C59052c) f361884a.mo56224b()).mo56372aa(39746)).mo56386p("No weather widgets to update.");
        this.f361892i.mo110839a(context);
        return true;
    }

    /* renamed from: h */
    public final void mo110832h(Context context, int i) {
        String str;
        int[] d = C132582aa.m215550d(context);
        int[] c = C132582aa.m215549c(context);
        if (!mo110831g(context, d, c)) {
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            if (((C59052c) f361884a.mo56224b()).mo56369V()) {
                mo110829e();
            }
            if (!C132582aa.m215548b(this.f361902s)) {
                m215575j(context, instance, i, 5, d, c);
                return;
            }
            C53254hb hbVar = (C53254hb) C53259hg.f139612h.createBuilder();
            int length = d.length;
            hbVar.copyOnWrite();
            C53259hg hgVar = (C53259hg) hbVar.instance;
            hgVar.f139614a |= 16;
            hgVar.f139619f = length;
            int length2 = c.length;
            hbVar.copyOnWrite();
            C53259hg hgVar2 = (C53259hg) hbVar.instance;
            hgVar2.f139614a |= 32;
            hgVar2.f139620g = length2;
            hbVar.copyOnWrite();
            C53259hg hgVar3 = (C53259hg) hbVar.instance;
            int i2 = i - 1;
            if (i != 0) {
                hgVar3.f139615b = i2;
                hgVar3.f139614a |= 1;
                C53258hf hfVar = C53258hf.WIDGET_TYPE_ALL;
                hbVar.copyOnWrite();
                C53259hg hgVar4 = (C53259hg) hbVar.instance;
                hgVar4.f139616c = hfVar.f139611e;
                hgVar4.f139614a |= 2;
                try {
                    str = context.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    ((C59052c) ((C59052c) C132582aa.f361812a.mo56226d()).mo56372aa(39714)).mo56389s("#getAgsaVersionOrEmpty %s", e.getMessage());
                    str = BuildConfig.FLAVOR;
                }
                hbVar.copyOnWrite();
                C53259hg hgVar5 = (C53259hg) hbVar.instance;
                str.getClass();
                hgVar5.f139614a |= 8;
                hgVar5.f139618e = str;
                Context context2 = context;
                AppWidgetManager appWidgetManager = instance;
                C132590ai.m215559c(context2, appWidgetManager, c, (C132655r) null, (C132586ae) null, this.f361894k, this.f361892i, this.f361891h);
                C132590ai.m215560d(context2, appWidgetManager, d, (C132655r) null, this.f361893j, this.f361895l, this.f361892i, this.f361891h);
                C60856cj.m92911t(C60922j.m93045h(C60922j.m93045h(C60922j.m93044g(this.f361899p.mo46042d(), C47810es.m84963c(C132593al.f361854a), this.f361888e), C47810es.m84966f(new C132600as((C53259hg) hbVar.build())), this.f361888e), C47810es.m84966f(new C132595an(this)), this.f361888e), C47810es.m84974n(new C132603av(this, context, instance, d, c, i)), this.f361887d);
                return;
            }
            throw null;
        }
    }

    /* renamed from: i */
    public final void mo110833i(Context context, int[] iArr, int[] iArr2, Throwable th, int i, AppWidgetManager appWidgetManager) {
        C132590ai.m215559c(context, appWidgetManager, iArr, (C132655r) null, C132586ae.m215556a(C132582aa.m215551e(th)), this.f361894k, this.f361892i, this.f361891h);
        m215575j(context, appWidgetManager, i, C132582aa.m215551e(th), iArr2, new int[0]);
    }
}
