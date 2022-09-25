package com.google.android.apps.search.googleapp.searchwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.search.googleapp.promomanager.p10371a.C136897a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46459k;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.m */
/* compiled from: PG */
public final class C139035m extends AppWidgetProvider implements C139033k {

    /* renamed from: a */
    public final C139130u f378120a;

    /* renamed from: b */
    private final C136897a f378121b;

    /* renamed from: c */
    private final C21370a f378122c;

    /* renamed from: d */
    private final C71422aw f378123d;

    /* renamed from: e */
    private final C139135z f378124e;

    public C139035m(C139130u uVar, C136897a aVar, C21370a aVar2, C71422aw awVar, C139135z zVar) {
        C69664n.m101061g(aVar, "agsaClassicPromoManagerData");
        C69664n.m101061g(aVar2, "clock");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f378120a = uVar;
        this.f378121b = aVar;
        this.f378122c = aVar2;
        this.f378123d = awVar;
        this.f378124e = zVar;
    }

    /* renamed from: b */
    private final void m225819b(long j) {
        C46459k.m82829b(this.f378121b.mo103978c(j), "Failed to update widget deletion time.", new Object[0]);
    }

    /* renamed from: a */
    public final C71643cp mo114662a(Bundle bundle, AppWidgetManager appWidgetManager, int i) {
        return C71803m.m105043d(this.f378123d, (C69585o) null, (C71424ay) null, new C139034l(this, bundle, i, appWidgetManager, (C69577g) null), 3);
    }

    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(appWidgetManager, "appWidgetManager");
        C69664n.m101061g(bundle, "options");
        if (Build.VERSION.SDK_INT < 31 || C139135z.m226021o(bundle)) {
            mo114662a(bundle, appWidgetManager, i);
        }
    }

    public final void onDisabled(Context context) {
        C69664n.m101061g(context, "context");
        super.onDisabled(context);
        this.f378124e.mo114761j(false);
        m225819b(this.f378122c.mo26870b());
    }

    public final void onEnabled(Context context) {
        C69664n.m101061g(context, "context");
        super.onEnabled(context);
        m225819b(-1);
    }

    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(appWidgetManager, "appWidgetManager");
        C69664n.m101061g(iArr, "appWidgetIds");
        for (int i : iArr) {
            Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i);
            C69664n.m101060f(appWidgetOptions, "options");
            mo114662a(appWidgetOptions, appWidgetManager, i);
        }
    }
}
