package com.google.android.apps.search.weather.p10685d;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: com.google.android.apps.search.weather.d.b */
/* compiled from: PG */
public final class C142073b {
    /* renamed from: a */
    public static Boolean m230647a(Intent intent) {
        ComponentName componentName = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.weather.WeatherActivity");
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        return Boolean.valueOf(component.equals(componentName));
    }

    /* renamed from: b */
    public static void m230648b(Intent intent) {
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.weather.WeatherActivity");
        intent.addFlags(268435456);
    }
}
