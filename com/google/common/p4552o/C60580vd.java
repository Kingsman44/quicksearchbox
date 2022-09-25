package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.vd */
/* compiled from: PG */
public enum C60580vd implements C62957cd {
    DISPLAYED(0),
    SETTINGS_SATISFIED(1),
    SETTINGS_NOT_AVAILABLE(2),
    BACKOFF_AFTER_REJECT(3),
    BACKOFF_AFTER_ACCEPT(4),
    ALREADY_PROMPTING(5),
    DEDUPED(6),
    APP_LEVEL_MISSING(7),
    TRIGGER(8),
    APP_JUST_GRANTED_DEVICE_ALREADY_GRANTED(9),
    APP_JUST_GRANTED_LSD_DISPLAYED(10),
    UNKNOWN_STATE(11);
    

    /* renamed from: m */
    public final int f164340m;

    private C60580vd(int i) {
        this.f164340m = i;
    }

    /* renamed from: a */
    public static C60580vd m92623a(int i) {
        switch (i) {
            case 0:
                return DISPLAYED;
            case 1:
                return SETTINGS_SATISFIED;
            case 2:
                return SETTINGS_NOT_AVAILABLE;
            case 3:
                return BACKOFF_AFTER_REJECT;
            case 4:
                return BACKOFF_AFTER_ACCEPT;
            case 5:
                return ALREADY_PROMPTING;
            case 6:
                return DEDUPED;
            case 7:
                return APP_LEVEL_MISSING;
            case 8:
                return TRIGGER;
            case 9:
                return APP_JUST_GRANTED_DEVICE_ALREADY_GRANTED;
            case 10:
                return APP_JUST_GRANTED_LSD_DISPLAYED;
            case 11:
                return UNKNOWN_STATE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92624b() {
        return C60579vc.f164326a;
    }

    public final int getNumber() {
        return this.f164340m;
    }

    public final String toString() {
        return Integer.toString(this.f164340m);
    }
}
