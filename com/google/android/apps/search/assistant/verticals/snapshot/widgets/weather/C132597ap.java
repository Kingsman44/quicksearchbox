package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.google.assistant.p3994s.p3995a.C53234gi;
import com.google.assistant.p3994s.p3995a.C53242gq;
import com.google.assistant.p3994s.p3995a.C53244gs;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ap */
/* compiled from: PG */
public final /* synthetic */ class C132597ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132606ay f361863a;

    /* renamed from: b */
    public final /* synthetic */ Context f361864b;

    /* renamed from: c */
    public final /* synthetic */ AppWidgetManager f361865c;

    /* renamed from: d */
    public final /* synthetic */ int[] f361866d;

    /* renamed from: e */
    public final /* synthetic */ int[] f361867e;

    public /* synthetic */ C132597ap(C132606ay ayVar, Context context, AppWidgetManager appWidgetManager, int[] iArr, int[] iArr2) {
        this.f361863a = ayVar;
        this.f361864b = context;
        this.f361865c = appWidgetManager;
        this.f361866d = iArr;
        this.f361867e = iArr2;
    }

    public final C60870cx apply(Object obj) {
        C132606ay ayVar = this.f361863a;
        Context context = this.f361864b;
        AppWidgetManager appWidgetManager = this.f361865c;
        int[] iArr = this.f361866d;
        int[] iArr2 = this.f361867e;
        C132655r rVar = (C132655r) obj;
        C53245gt gtVar = rVar.f362004a;
        C59052c cVar = (C59052c) ((C59052c) C132606ay.f361884a.mo56224b()).mo56372aa(39742);
        C53244gs gsVar = gtVar.f139571e;
        if (gsVar == null) {
            gsVar = C53244gs.f139553j;
        }
        String str = gsVar.f139557c;
        Boolean valueOf = Boolean.valueOf(gtVar.f139574h);
        C53242gq gqVar = gtVar.f139577k;
        if (gqVar == null) {
            gqVar = C53242gq.f139546f;
        }
        C53242gq gqVar2 = gqVar;
        Integer valueOf2 = Integer.valueOf(gtVar.f139569c.size());
        C53234gi giVar = gtVar.f139573g;
        if (giVar == null) {
            giVar = C53234gi.f139523e;
        }
        cVar.mo56361N("Weather current: %s isCelsius %s location %s daily forecast count %s hourly count %s", str, valueOf, gqVar2, valueOf2, Integer.valueOf(giVar.f139528d.size()));
        Context context2 = context;
        AppWidgetManager appWidgetManager2 = appWidgetManager;
        C132655r rVar2 = rVar;
        C132590ai.m215559c(context2, appWidgetManager2, iArr, rVar2, (C132586ae) null, ayVar.f361894k, ayVar.f361892i, ayVar.f361891h);
        C132590ai.m215560d(context2, appWidgetManager2, iArr2, rVar2, ayVar.f361893j, ayVar.f361895l, ayVar.f361892i, ayVar.f361891h);
        ayVar.f361891h.mo110838e(7, 1);
        return ayVar.mo110826b(ayVar.mo110828d());
    }
}
