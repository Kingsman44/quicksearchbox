package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10082b.C132610b;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c.C132618c;
import com.google.android.libraries.p10908a.p10911c.p10913b.C146637m;
import com.google.android.libraries.p10908a.p10911c.p10913b.C146642r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53258hf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.z */
/* compiled from: PG */
public final class C132665z extends C146637m {

    /* renamed from: a */
    private static final C59071e f362020a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.z");

    /* renamed from: b */
    private final C132606ay f362021b;

    /* renamed from: c */
    private final C60887da f362022c;

    /* renamed from: d */
    private final C132610b f362023d;

    /* renamed from: e */
    private final C132613bc f362024e;

    /* renamed from: f */
    private final C123587c f362025f;

    /* renamed from: g */
    private final C132618c f362026g;

    /* renamed from: h */
    private final boolean f362027h;

    /* renamed from: i */
    private int f362028i = 1;

    public C132665z(C60887da daVar, C132606ay ayVar, C132610b bVar, C132613bc bcVar, boolean z, C123587c cVar, C132618c cVar2) {
        this.f362022c = daVar;
        this.f362021b = ayVar;
        this.f362023d = bVar;
        this.f362024e = bcVar;
        this.f362027h = z;
        this.f362025f = cVar;
        this.f362026g = cVar2;
    }

    /* renamed from: a */
    public final C146642r mo110860a() {
        return C146642r.WEATHER;
    }

    /* renamed from: b */
    public final ExecutorService mo110861b() {
        return this.f362022c;
    }

    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        this.f362021b.mo110832h(context, 6);
    }

    public final void onDeleted(Context context, int[] iArr) {
        C59104x b = f362020a.mo56224b();
        int length = iArr.length;
        ((C59052c) ((C59052c) b).mo56372aa(39707)).mo56387q("#onDeleted() %s widgets", length);
        this.f362023d.mo110835b(length, C53258hf.WIDGET_TYPE_SQUARE);
        this.f362021b.mo110830f(context);
        this.f362024e.mo110839a(context);
        super.onDeleted(context, iArr);
    }

    public final void onReceive(Context context, Intent intent) {
        int intExtra;
        C59071e eVar = f362020a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39708)).mo56386p("#onReceive().");
        if (intent == null) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(39712)).mo56386p("#onReceive() null intent.");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(39711)).mo56386p("#onReceive() null intentAction.");
            return;
        }
        this.f362028i = C132582aa.m215552f(intent);
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39709)).mo56354G("#onReceive intent %s, extras %s", intent, intent.getExtras());
        if (action.equals("android.appwidget.action.APPWIDGET_UPDATE")) {
            this.f362024e.mo110840b(C53258hf.WIDGET_TYPE_SQUARE);
        }
        if (this.f362028i == 4 && (intExtra = intent.getIntExtra("weather_widget_id_source_key", 0)) != 0) {
            this.f362023d.mo110836c(context, C132582aa.m215547a(context, intExtra), 1);
        }
        if (this.f362027h && action.equals("android.appwidget.action.APPWIDGET_ENABLED")) {
            this.f362025f.mo106044d(this.f362026g);
        }
        if (this.f362027h && action.equals("android.appwidget.action.APPWIDGET_DISABLED")) {
            this.f362025f.mo106045e(this.f362026g);
        }
        if (action.equals("android.appwidget.action.OPEN_WEATHER_APP_AND_UPDATE_ALL_WEATHER_WIDGETS")) {
            C47810es.m84979s(context, C132614bd.m215599c(0));
        }
        if (action.equals("android.appwidget.action.UPDATE_ALL_WEATHER_WIDGETS") || action.equals("android.appwidget.action.OPEN_WEATHER_APP_AND_UPDATE_ALL_WEATHER_WIDGETS")) {
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(context, "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.WeatherWidget_Receiver"));
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39710)).mo56387q("#onReceive. Updating %d weather widgets.", appWidgetIds.length);
            onUpdate(context, instance, appWidgetIds);
            return;
        }
        super.onReceive(context, intent);
    }

    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        ((C59052c) ((C59052c) f362020a.mo56224b()).mo56372aa(39713)).mo56386p("#onUpdate()");
        this.f362021b.mo110832h(context, this.f362028i);
    }
}
