package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.ae */
/* compiled from: PG */
enum C132586ae {
    NO_INTERNET(R.drawable.quantum_gm_ic_wifi_off_vd_theme_24, R.string.assistant_weather_widget_offline_text),
    NO_PERMISSION(R.drawable.quantum_gm_ic_location_off_vd_theme_24, R.string.assistant_weather_widget_no_location_permission_text),
    NO_AADC(R.drawable.quantum_gm_ic_location_off_vd_theme_24, R.string.assistant_weather_widget_no_location_permission_text),
    NO_LOCATION(R.drawable.quantum_gm_ic_location_off_vd_theme_24, R.string.assistant_weather_widget_no_location_access_text),
    SOMETHING_WENT_WRONG(-1, R.string.assistant_weather_widget_oops_text);
    

    /* renamed from: f */
    final int f361837f;

    /* renamed from: g */
    final int f361838g;

    private C132586ae(int i, int i2) {
        this.f361837f = i;
        this.f361838g = i2;
    }

    /* renamed from: a */
    public static C132586ae m215556a(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? SOMETHING_WENT_WRONG : NO_INTERNET : NO_LOCATION : NO_AADC : NO_PERMISSION;
    }
}
