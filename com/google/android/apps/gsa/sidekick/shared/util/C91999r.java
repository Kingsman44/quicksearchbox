package com.google.android.apps.gsa.sidekick.shared.util;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.r */
/* compiled from: PG */
enum C91999r {
    Cluster("*clstr"),
    Group("*grp"),
    SingleEntry("*e"),
    Internal("*internal"),
    Unknown("UNKNOWN");
    

    /* renamed from: f */
    public final String f256494f;

    private C91999r(String str) {
        this.f256494f = str;
    }

    /* renamed from: a */
    static C91999r m151010a(C92007z zVar) {
        int i = zVar.f256517a;
        int i2 = i & 2;
        if (i2 != 0 && (i & 1) == 0) {
            return Cluster;
        }
        if (i2 == 0 && (i & 1) != 0) {
            return Group;
        }
        if (zVar.f256518b.size() != 1) {
            return zVar.f256521e.size() > 0 ? Internal : Unknown;
        }
        return SingleEntry;
    }
}
