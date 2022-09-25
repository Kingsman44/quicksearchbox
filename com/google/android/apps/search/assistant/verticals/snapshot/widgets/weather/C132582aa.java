package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import com.google.assistant.p3994s.p3995a.C53258hf;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import p5488io.grpc.C70761fa;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.aa */
/* compiled from: PG */
public final class C132582aa {

    /* renamed from: a */
    public static final C59071e f361812a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.aa");

    /* renamed from: a */
    public static C53258hf m215547a(Context context, int i) {
        if (i == 0) {
            return C53258hf.WIDGET_TYPE_UNKNOWN;
        }
        if (C60757n.m92750k(m215550d(context), i)) {
            return C53258hf.WIDGET_TYPE_SQUARE;
        }
        if (C60757n.m92750k(m215549c(context), i)) {
            return C53258hf.WIDGET_TYPE_FREEFORM;
        }
        return C53258hf.WIDGET_TYPE_UNKNOWN;
    }

    /* renamed from: b */
    public static boolean m215548b(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* renamed from: c */
    public static int[] m215549c(Context context) {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.FreeformWeatherWidget_Receiver"));
    }

    /* renamed from: d */
    public static int[] m215550d(Context context) {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.WeatherWidget_Receiver"));
    }

    /* renamed from: e */
    public static int m215551e(Throwable th) {
        if (th instanceof C132574a) {
            return 3;
        }
        if (th instanceof C132654q) {
            return 4;
        }
        if (th instanceof C70761fa) {
            return 5;
        }
        return th instanceof SecurityException ? 2 : 6;
    }

    /* renamed from: f */
    public static int m215552f(Intent intent) {
        String string;
        String action = intent.getAction();
        if (action == null) {
            return 1;
        }
        if (action.equals("android.appwidget.action.APPWIDGET_UPDATE")) {
            return 2;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString("update_source")) == null) {
            return 1;
        }
        if (string.equals("tap_weather_app")) {
            return 4;
        }
        if (string.equals("tap_widget")) {
            return 3;
        }
        if (string.equals("config_activity")) {
            return 5;
        }
        return 1;
    }
}
