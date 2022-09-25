package com.google.android.apps.search.googleapp.p10318i;

/* renamed from: com.google.android.apps.search.googleapp.i.m */
/* compiled from: PG */
public enum C136224m {
    DIZZY("puffy_dizzy.json"),
    DIZZY_NO_PLAY_BUTTON("puffy_dizzy_no_play_button.json"),
    BOAT_DATA("puffy_boat_data.json"),
    BOAT_SIM("puffy_boat_sim.json"),
    BOAT_WIFI("puffy_boat_wifi.json"),
    RAIN("puffy_rain.json"),
    AIRPLANE("puffy_airplane.json");
    

    /* renamed from: h */
    public final String f371000h;

    private C136224m(String str) {
        this.f371000h = str;
    }

    /* renamed from: b */
    public static C136224m m221358b(String str) {
        return (C136224m) Enum.valueOf(C136224m.class, str);
    }

    /* renamed from: a */
    public final C136223l mo112850a() {
        if (ordinal() != 6) {
            return null;
        }
        return new C136212a();
    }
}
