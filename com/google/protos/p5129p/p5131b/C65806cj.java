package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.p.b.cj */
/* compiled from: PG */
public enum C65806cj implements C62957cd {
    UNKNOWN_SETTING_TYPE(0),
    PERSONAL_RESULTS(1),
    SEARCH_PERSONAL_RESULTS(13),
    WEB_AND_APP_ACTIVITY(4),
    SAFE_SEARCH(12),
    SUPPLEMENTAL_WEB_AND_APP_ACTIVITY(11),
    VOICE_AND_AUDIO_ACTIVITY(2),
    DEVICE_CONTACTS(6),
    DEVICE_APPS(7),
    SEARCH_AND_ASSISTANT(3),
    SEARCH_AND_ASSISTANT_WORKSPACE(14),
    SEARCH_AND_ASSISTANT_WORKSPACE_PRIVATE_DEVICE(17),
    SEARCH_AND_ASSISTANT_WORKSPACE_ANY_DEVICE(15),
    DASHER_POLICY(5),
    MASQUERADE_MODE(8),
    EECC_IN_PRODUCT_DATA_USE(9),
    EECC_CROSS_PRODUCT_DATA_USE(10),
    VOICE_MATCH(16),
    DEVICE_ACTIVATION_AUDIO_CACHE_ENABLED(18),
    DEVICE_ACTIVATION_VISUAL_FRAMES_CACHE_ENABLED(19),
    DEVICE_ACTIVATION_CACHE_ENABLED(20);
    

    /* renamed from: v */
    public final int f178896v;

    private C65806cj(int i) {
        this.f178896v = i;
    }

    /* renamed from: a */
    public static C65806cj m96809a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SETTING_TYPE;
            case 1:
                return PERSONAL_RESULTS;
            case 2:
                return VOICE_AND_AUDIO_ACTIVITY;
            case 3:
                return SEARCH_AND_ASSISTANT;
            case 4:
                return WEB_AND_APP_ACTIVITY;
            case 5:
                return DASHER_POLICY;
            case 6:
                return DEVICE_CONTACTS;
            case 7:
                return DEVICE_APPS;
            case 8:
                return MASQUERADE_MODE;
            case 9:
                return EECC_IN_PRODUCT_DATA_USE;
            case 10:
                return EECC_CROSS_PRODUCT_DATA_USE;
            case 11:
                return SUPPLEMENTAL_WEB_AND_APP_ACTIVITY;
            case 12:
                return SAFE_SEARCH;
            case 13:
                return SEARCH_PERSONAL_RESULTS;
            case 14:
                return SEARCH_AND_ASSISTANT_WORKSPACE;
            case 15:
                return SEARCH_AND_ASSISTANT_WORKSPACE_ANY_DEVICE;
            case 16:
                return VOICE_MATCH;
            case 17:
                return SEARCH_AND_ASSISTANT_WORKSPACE_PRIVATE_DEVICE;
            case 18:
                return DEVICE_ACTIVATION_AUDIO_CACHE_ENABLED;
            case 19:
                return DEVICE_ACTIVATION_VISUAL_FRAMES_CACHE_ENABLED;
            case 20:
                return DEVICE_ACTIVATION_CACHE_ENABLED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96810b() {
        return C65805ci.f178873a;
    }

    public final int getNumber() {
        return this.f178896v;
    }

    public final String toString() {
        return Integer.toString(this.f178896v);
    }
}
