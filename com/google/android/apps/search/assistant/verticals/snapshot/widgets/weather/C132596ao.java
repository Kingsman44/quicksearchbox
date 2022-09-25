package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ao */
/* compiled from: PG */
public final /* synthetic */ class C132596ao implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132606ay f361857a;

    /* renamed from: b */
    public final /* synthetic */ Context f361858b;

    /* renamed from: c */
    public final /* synthetic */ int[] f361859c;

    /* renamed from: d */
    public final /* synthetic */ int[] f361860d;

    /* renamed from: e */
    public final /* synthetic */ AppWidgetManager f361861e;

    /* renamed from: f */
    public final /* synthetic */ Optional f361862f;

    public /* synthetic */ C132596ao(C132606ay ayVar, Context context, int[] iArr, int[] iArr2, AppWidgetManager appWidgetManager, Optional optional) {
        this.f361857a = ayVar;
        this.f361858b = context;
        this.f361859c = iArr;
        this.f361860d = iArr2;
        this.f361861e = appWidgetManager;
        this.f361862f = optional;
    }

    public final C60870cx apply(Object obj) {
        C132606ay ayVar = this.f361857a;
        Context context = this.f361858b;
        int[] iArr = this.f361859c;
        int[] iArr2 = this.f361860d;
        AppWidgetManager appWidgetManager = this.f361861e;
        Optional optional = this.f361862f;
        if (((Boolean) obj).booleanValue()) {
            ((C59052c) ((C59052c) C132606ay.f361884a.mo56226d()).mo56372aa(39740)).mo56386p("AADC is not granted");
            ayVar.mo110833i(context, iArr, iArr2, new C132574a(), 7, appWidgetManager);
            ayVar.f361891h.mo110838e(7, 3);
            return ayVar.mo110826b(ayVar.mo110828d());
        } else if (optional.isPresent()) {
            C60870cx a = ayVar.mo110825a((C53245gt) optional.get());
            C132597ap apVar = new C132597ap(ayVar, context, appWidgetManager, iArr, iArr2);
            C60922j.m93045h(a, C47810es.m84966f(apVar), ayVar.f361887d);
            return C60866ct.f164955a;
        } else {
            ((C59052c) ((C59052c) C132606ay.f361884a.mo56226d()).mo56372aa(39739)).mo56386p("Did not get valid weather data from PCP.");
            ayVar.mo110833i(context, iArr, iArr2, new Exception(), 7, appWidgetManager);
            ayVar.f361891h.mo110838e(7, 6);
            return ayVar.mo110826b(ayVar.mo110828d());
        }
    }
}
