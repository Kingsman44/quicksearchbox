package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.p11029ao.p11030a.C147798a;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.bd */
/* compiled from: PG */
final class C132614bd {
    /* renamed from: a */
    public static PendingIntent m215597a(Context context, int i, String str) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ConfigurationActivity");
        intent.putExtra("appWidgetId", i);
        intent.putExtra("config_activity_trigger_type", str);
        return PendingIntent.getActivity(context, i, C147798a.m240896b(intent, 201326592, 0), 201326592);
    }

    /* renamed from: c */
    public static Intent m215599c(int i) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.putExtra("source", "and.gsa.weather.launcher.icon");
        intent.putExtra("weather_widget_id_source_key", i);
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.weather.WeatherExportedActivity");
        intent.addFlags(268435456);
        return intent;
    }

    /* renamed from: b */
    public static PendingIntent m215598b(Context context, boolean z, String str, int i) {
        if (z) {
            return PendingIntent.getActivity(context, i, C147798a.m240896b(m215599c(i), 201326592, 0), 201326592);
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.googlequicksearchbox", str);
        intent.setAction("android.appwidget.action.OPEN_WEATHER_APP_AND_UPDATE_ALL_WEATHER_WIDGETS");
        intent.putExtra("update_source", "tap_widget");
        intent.putExtra("weather_widget_id_source_key", i);
        return PendingIntent.getBroadcast(context, i, C147798a.m240896b(intent, 201326592, 0), 201326592);
    }
}
