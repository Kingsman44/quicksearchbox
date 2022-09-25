package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.h */
/* compiled from: PG */
public enum C119889h implements C62957cd {
    UNKNOWN_ENGINE(0),
    DEFAULT_ENGINE(1),
    FAKE(2),
    ONLINE(3),
    ON_DEVICE(4),
    ON_DEVICE_SERVER_FALLBACK(5),
    NATCON(6),
    UTTERANCE_TIME_SELECTION(7),
    ONLINE_WITH_ONDEVICE_PARTIALS(8);
    

    /* renamed from: j */
    public final int f333885j;

    private C119889h(int i) {
        this.f333885j = i;
    }

    /* renamed from: a */
    public static C119889h m198762a(String str) {
        return (C119889h) Enum.valueOf(C119889h.class, str);
    }

    /* renamed from: b */
    public static C119889h m198763b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ENGINE;
            case 1:
                return DEFAULT_ENGINE;
            case 2:
                return FAKE;
            case 3:
                return ONLINE;
            case 4:
                return ON_DEVICE;
            case 5:
                return ON_DEVICE_SERVER_FALLBACK;
            case 6:
                return NATCON;
            case 7:
                return UTTERANCE_TIME_SELECTION;
            case 8:
                return ONLINE_WITH_ONDEVICE_PARTIALS;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static C62959cf m198764c() {
        return C119888g.f333874a;
    }

    public final int getNumber() {
        return this.f333885j;
    }

    public final String toString() {
        return Integer.toString(this.f333885j);
    }
}
