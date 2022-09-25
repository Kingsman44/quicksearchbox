package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c.C132624i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53228gc;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.av */
/* compiled from: PG */
final class C132603av implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Context f361877a;

    /* renamed from: b */
    final /* synthetic */ AppWidgetManager f361878b;

    /* renamed from: c */
    final /* synthetic */ int[] f361879c;

    /* renamed from: d */
    final /* synthetic */ int[] f361880d;

    /* renamed from: e */
    final /* synthetic */ C132606ay f361881e;

    /* renamed from: f */
    final /* synthetic */ int f361882f;

    public C132603av(C132606ay ayVar, Context context, AppWidgetManager appWidgetManager, int[] iArr, int[] iArr2, int i) {
        this.f361881e = ayVar;
        this.f361877a = context;
        this.f361878b = appWidgetManager;
        this.f361879c = iArr;
        this.f361880d = iArr2;
        this.f361882f = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C132606ay.f361884a.mo56226d()).mo56382g(th)).mo56372aa(39723)).mo56386p("#onFailure().");
        this.f361881e.mo110833i(this.f361877a, this.f361880d, this.f361879c, th, this.f361882f, this.f361878b);
        this.f361881e.f361891h.mo110838e(this.f361882f, C132582aa.m215551e(th));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C60870cx cxVar;
        C132655r rVar = (C132655r) obj;
        ((C59052c) ((C59052c) C132606ay.f361884a.mo56224b()).mo56372aa(39724)).mo56386p("#onSuccess()");
        Context context = this.f361877a;
        AppWidgetManager appWidgetManager = this.f361878b;
        int[] iArr = this.f361879c;
        C132606ay ayVar = this.f361881e;
        C132590ai.m215560d(context, appWidgetManager, iArr, rVar, ayVar.f361893j, ayVar.f361895l, ayVar.f361892i, ayVar.f361891h);
        Context context2 = this.f361877a;
        AppWidgetManager appWidgetManager2 = this.f361878b;
        int[] iArr2 = this.f361880d;
        C132606ay ayVar2 = this.f361881e;
        C132590ai.m215559c(context2, appWidgetManager2, iArr2, rVar, (C132586ae) null, ayVar2.f361894k, ayVar2.f361892i, ayVar2.f361891h);
        this.f361881e.f361891h.mo110838e(this.f361882f, 1);
        C132606ay ayVar3 = this.f361881e;
        ayVar3.mo110826b(ayVar3.mo110828d());
        C132606ay ayVar4 = this.f361881e;
        C53245gt gtVar = rVar.f362004a;
        C132624i iVar = ayVar4.f361889f;
        if (!iVar.f361942d) {
            C59104x b = C132624i.f361939a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WeatherWidgetToPcpWriter");
            ((C59052c) ((C59052c) b).mo56372aa(39769)).mo56386p("WeatherToPcpWriter is disabled by mendel flag.");
            cxVar = C60866ct.f164955a;
        } else if (iVar.f361944f) {
            cxVar = iVar.mo110843b(gtVar);
        } else {
            C59104x b2 = C132624i.f361939a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "WeatherWidgetToPcpWriter");
            ((C59052c) ((C59052c) b2).mo56372aa(39768)).mo56386p("Clearing hourly forecast.");
            C53228gc gcVar = (C53228gc) gtVar.toBuilder();
            gcVar.copyOnWrite();
            C53245gt gtVar2 = (C53245gt) gcVar.instance;
            gtVar2.f139573g = null;
            gtVar2.f139567a &= -17;
            cxVar = iVar.mo110843b((C53245gt) gcVar.build());
        }
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C132604aw(gtVar)), ayVar4.f361888e);
    }
}
