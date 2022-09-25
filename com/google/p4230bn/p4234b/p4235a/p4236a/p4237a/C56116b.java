package com.google.p4230bn.p4234b.p4235a.p4236a.p4237a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bn.b.a.a.a.b */
/* compiled from: PG */
public enum C56116b implements C62957cd {
    UNKNOWN_ID(0),
    DEVICE_INFO(7),
    DEVICE_INFO_DEVICE_LEVEL(9),
    LOCATION_HISTORY(2),
    LOCATION_REPORTING(15),
    VOICE_AND_AUDIO(5),
    WEB_AND_APP(1),
    SUPPL_WEB_AND_APP(8),
    SUPPL_WEB_AND_APP_DEVICE_LEVEL(10),
    YT_SEARCH_HISTORY(3),
    YT_WATCH_HISTORY(4);
    

    /* renamed from: l */
    public final int f149511l;

    private C56116b(int i) {
        this.f149511l = i;
    }

    /* renamed from: a */
    public static C56116b m87897a(int i) {
        if (i == 0) {
            return UNKNOWN_ID;
        }
        if (i == 1) {
            return WEB_AND_APP;
        }
        if (i == 2) {
            return LOCATION_HISTORY;
        }
        if (i == 3) {
            return YT_SEARCH_HISTORY;
        }
        if (i == 4) {
            return YT_WATCH_HISTORY;
        }
        if (i == 5) {
            return VOICE_AND_AUDIO;
        }
        if (i == 15) {
            return LOCATION_REPORTING;
        }
        switch (i) {
            case 7:
                return DEVICE_INFO;
            case 8:
                return SUPPL_WEB_AND_APP;
            case 9:
                return DEVICE_INFO_DEVICE_LEVEL;
            case 10:
                return SUPPL_WEB_AND_APP_DEVICE_LEVEL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87898b() {
        return C56115a.f149498a;
    }

    public final int getNumber() {
        return this.f149511l;
    }

    public final String toString() {
        return Integer.toString(this.f149511l);
    }
}
