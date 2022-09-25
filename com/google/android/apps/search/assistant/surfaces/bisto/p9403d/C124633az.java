package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.az */
/* compiled from: PG */
public enum C124633az implements C62957cd {
    OOBE_STATE_UNKNOWN(0),
    OOBE_FINISHED(1),
    OOBE_NOT_FINISHED(2),
    OOBE_IN_PROGRESS(3),
    OOBE_PAIRING(4),
    OOBE_EXTERNAL(5),
    OOBE_FAST_PAIR_V2_PAIRING(6);
    

    /* renamed from: h */
    public final int f343841h;

    private C124633az(int i) {
        this.f343841h = i;
    }

    /* renamed from: a */
    public static C124633az m204299a(int i) {
        switch (i) {
            case 0:
                return OOBE_STATE_UNKNOWN;
            case 1:
                return OOBE_FINISHED;
            case 2:
                return OOBE_NOT_FINISHED;
            case 3:
                return OOBE_IN_PROGRESS;
            case 4:
                return OOBE_PAIRING;
            case 5:
                return OOBE_EXTERNAL;
            case 6:
                return OOBE_FAST_PAIR_V2_PAIRING;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m204300b() {
        return C124632ay.f343832a;
    }

    public final int getNumber() {
        return this.f343841h;
    }

    public final String toString() {
        return Integer.toString(this.f343841h);
    }
}
