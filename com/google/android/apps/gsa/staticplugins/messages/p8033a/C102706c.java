package com.google.android.apps.gsa.staticplugins.messages.p8033a;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.a.c */
/* compiled from: PG */
public enum C102706c {
    BELL("puffy_bell"),
    BOAT_DATA("puffy_boat_data"),
    BOAT_SIM("puffy_boat_sim"),
    BOAT_WIFI("puffy_boat_wifi"),
    CLOCK("puffy_clock"),
    DIZZY("puffy_dizzy"),
    DRIZZLE("puffy_rain"),
    SPIN("puffy_umbrella"),
    PLANE("puffy_airplane"),
    TOSS("puffy_toss");
    

    /* renamed from: k */
    public final String f286733k;

    private C102706c(String str) {
        this.f286733k = str.concat(".json");
    }

    /* renamed from: a */
    public final boolean mo93397a() {
        return ordinal() != 9;
    }

    /* renamed from: b */
    public final int[] mo93398b() {
        if (ordinal() != 8) {
            return null;
        }
        return new int[]{128, 377};
    }
}
