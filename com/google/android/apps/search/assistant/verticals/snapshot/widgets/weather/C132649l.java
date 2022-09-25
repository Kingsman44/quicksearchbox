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

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.l */
/* compiled from: PG */
public final class C132649l extends C146637m {

    /* renamed from: a */
    private static final C59071e f361990a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.l");

    /* renamed from: b */
    private final C132606ay f361991b;

    /* renamed from: c */
    private final C132610b f361992c;

    /* renamed from: d */
    private final C60887da f361993d;

    /* renamed from: e */
    private final C132613bc f361994e;

    /* renamed from: f */
    private final C123587c f361995f;

    /* renamed from: g */
    private final C132618c f361996g;

    /* renamed from: h */
    private final boolean f361997h;

    /* renamed from: i */
    private int f361998i = 1;

    public C132649l(C132606ay ayVar, C132610b bVar, C60887da daVar, C132613bc bcVar, boolean z, C123587c cVar, C132618c cVar2) {
        this.f361991b = ayVar;
        this.f361992c = bVar;
        this.f361993d = daVar;
        this.f361994e = bcVar;
        this.f361997h = z;
        this.f361995f = cVar;
        this.f361996g = cVar2;
    }

    /* renamed from: a */
    public final C146642r mo110860a() {
        return C146642r.WEATHER_FREEFORM;
    }

    /* renamed from: b */
    public final ExecutorService mo110861b() {
        return this.f361993d;
    }

    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        this.f361991b.mo110832h(context, 6);
    }

    public final void onDeleted(Context context, int[] iArr) {
        C59104x b = f361990a.mo56224b();
        int length = iArr.length;
        ((C59052c) ((C59052c) b).mo56372aa(39695)).mo56387q("#onDeleted() %s widgets", length);
        this.f361992c.mo110835b(length, C53258hf.WIDGET_TYPE_FREEFORM);
        this.f361991b.mo110830f(context);
        this.f361994e.mo110839a(context);
        super.onDeleted(context, iArr);
    }

    public final void onReceive(Context context, Intent intent) {
        C59071e eVar = f361990a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39696)).mo56386p("#onReceive().");
        if (intent == null) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(39700)).mo56386p("#onReceive() null intent.");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(39699)).mo56386p("#onReceive() null intentAction.");
            return;
        }
        this.f361998i = C132582aa.m215552f(intent);
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39697)).mo56354G("#onReceive intent %s, extras %s", intent, intent.getExtras());
        if (action.equals("android.appwidget.action.APPWIDGET_UPDATE")) {
            this.f361994e.mo110840b(C53258hf.WIDGET_TYPE_FREEFORM);
        }
        if (this.f361997h && action.equals("android.appwidget.action.APPWIDGET_ENABLED")) {
            this.f361995f.mo106044d(this.f361996g);
        }
        if (this.f361997h && action.equals("android.appwidget.action.APPWIDGET_DISABLED")) {
            this.f361995f.mo106045e(this.f361996g);
        }
        if (action.equals("android.appwidget.action.OPEN_WEATHER_APP_AND_UPDATE_ALL_WEATHER_WIDGETS")) {
            C47810es.m84979s(context, C132614bd.m215599c(0));
        }
        if (action.equals("android.appwidget.action.UPDATE_ALL_WEATHER_WIDGETS") || action.equals("android.appwidget.action.OPEN_WEATHER_APP_AND_UPDATE_ALL_WEATHER_WIDGETS")) {
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            int[] appWidgetIds = instance.getAppWidgetIds(new ComponentName(context, "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.FreeformWeatherWidget_Receiver"));
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39698)).mo56387q("#onReceive. Updating %d weather widgets.", appWidgetIds.length);
            onUpdate(context, instance, appWidgetIds);
            return;
        }
        super.onReceive(context, intent);
    }

    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        ((C59052c) ((C59052c) f361990a.mo56224b()).mo56372aa(39701)).mo56386p("#onUpdate()");
        this.f361991b.mo110832h(context, this.f361998i);
    }
}
