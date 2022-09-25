package com.google.android.libraries.search.assistant.p2566g;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.assistant.g.t */
/* compiled from: PG */
public enum C33425t implements C62957cd {
    ENTRY_UNDEFINED(0),
    STANDALONE_EXAMPLE(1),
    HABITS_PROFILES_CACHED(2),
    OPA_STORE_ZEROSTATE_PROACTIVE_DATA_INTERNAL(3),
    OPA_STORE_ZEROSTATE_CLIENT_RESPONSE(4),
    HABITS_PROFILE_MEDIA_APP_SUGGESTIONS(5),
    ON_DEVICE_MEDIA_APP_SUGGESTIONS(6),
    GELLER_CORPUS_STATS(7),
    HABITUAL_SIGNALS(8),
    SUGGESTIONS_DEBUG(9),
    GELLER_ON_DEVICE_STORAGE(10),
    PCP(11),
    ON_DEVICE_MEDIA_APP_SUGGESTIONS_FRESH_BUILD(12),
    SERVER_SIDE_LOCATION(13),
    ON_DEVICE_MEDIA_APP_RECOMMENDATIONS(14);
    

    /* renamed from: p */
    public final int f89522p;

    private C33425t(int i) {
        this.f89522p = i;
    }

    /* renamed from: a */
    public static C33425t m62009a(int i) {
        switch (i) {
            case 0:
                return ENTRY_UNDEFINED;
            case 1:
                return STANDALONE_EXAMPLE;
            case 2:
                return HABITS_PROFILES_CACHED;
            case 3:
                return OPA_STORE_ZEROSTATE_PROACTIVE_DATA_INTERNAL;
            case 4:
                return OPA_STORE_ZEROSTATE_CLIENT_RESPONSE;
            case 5:
                return HABITS_PROFILE_MEDIA_APP_SUGGESTIONS;
            case 6:
                return ON_DEVICE_MEDIA_APP_SUGGESTIONS;
            case 7:
                return GELLER_CORPUS_STATS;
            case 8:
                return HABITUAL_SIGNALS;
            case 9:
                return SUGGESTIONS_DEBUG;
            case 10:
                return GELLER_ON_DEVICE_STORAGE;
            case 11:
                return PCP;
            case 12:
                return ON_DEVICE_MEDIA_APP_SUGGESTIONS_FRESH_BUILD;
            case 13:
                return SERVER_SIDE_LOCATION;
            case 14:
                return ON_DEVICE_MEDIA_APP_RECOMMENDATIONS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m62010b() {
        return C33424s.f89505a;
    }

    public final int getNumber() {
        return this.f89522p;
    }

    public final String toString() {
        return Integer.toString(this.f89522p);
    }
}
