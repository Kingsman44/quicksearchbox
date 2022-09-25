package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ad.d.b.bv */
/* compiled from: PG */
public enum C48714bv implements C62957cd {
    UNKNOWN_SIGNAL(0),
    APP_ACTIONS_SIGNAL(1),
    APP_USAGE_STATS_SIGNAL(2),
    APP_STATIC_SHORTCUT_SIGNAL(3),
    APP_INFO_SIGNAL(4),
    STOPWORDS_SIGNAL(5),
    APP_NICKNAME_SIGNAL(6),
    BUILT_IN_INTENT_SIGNAL(7),
    APP_DYNAMIC_SHORTCUT_SIGNAL(8);
    

    /* renamed from: j */
    public final int f126042j;

    private C48714bv(int i) {
        this.f126042j = i;
    }

    /* renamed from: a */
    public static C48714bv m85265a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SIGNAL;
            case 1:
                return APP_ACTIONS_SIGNAL;
            case 2:
                return APP_USAGE_STATS_SIGNAL;
            case 3:
                return APP_STATIC_SHORTCUT_SIGNAL;
            case 4:
                return APP_INFO_SIGNAL;
            case 5:
                return STOPWORDS_SIGNAL;
            case 6:
                return APP_NICKNAME_SIGNAL;
            case 7:
                return BUILT_IN_INTENT_SIGNAL;
            case 8:
                return APP_DYNAMIC_SHORTCUT_SIGNAL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m85266b() {
        return C48713bu.f126031a;
    }

    public final int getNumber() {
        return this.f126042j;
    }

    public final String toString() {
        return Integer.toString(this.f126042j);
    }
}
