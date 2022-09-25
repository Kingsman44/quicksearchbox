package com.google.p4184bj.p4193c.p4201f;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bj.c.f.b */
/* compiled from: PG */
public enum C56002b implements C62957cd {
    UNKNOWN_SETTING_SET_ID(0),
    DI(1),
    DIDL(2),
    DI_DIDL(3),
    VAA(4),
    WAA(5),
    SWAA(6),
    SWAADL(7),
    SWAA_SWAADL(8),
    WAA_SWAA(9),
    WAA_SWAA_SWAADL(10),
    DA(11),
    DC(12),
    LH(13),
    LR(14),
    LH_LR(15),
    SPYW(16),
    YT(17),
    YTW(18),
    YTS(19),
    YTVAA(20),
    LHG_ADS(21),
    LHG_PERSONALIZATION(22),
    WAAL_RESULTS(23),
    WAAL_RECOMMENDATIONS(24);
    

    /* renamed from: z */
    public final int f149164z;

    private C56002b(int i) {
        this.f149164z = i;
    }

    /* renamed from: a */
    public static C56002b m87880a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SETTING_SET_ID;
            case 1:
                return DI;
            case 2:
                return DIDL;
            case 3:
                return DI_DIDL;
            case 4:
                return VAA;
            case 5:
                return WAA;
            case 6:
                return SWAA;
            case 7:
                return SWAADL;
            case 8:
                return SWAA_SWAADL;
            case 9:
                return WAA_SWAA;
            case 10:
                return WAA_SWAA_SWAADL;
            case 11:
                return DA;
            case 12:
                return DC;
            case 13:
                return LH;
            case 14:
                return LR;
            case 15:
                return LH_LR;
            case 16:
                return SPYW;
            case 17:
                return YT;
            case 18:
                return YTW;
            case 19:
                return YTS;
            case 20:
                return YTVAA;
            case 21:
                return LHG_ADS;
            case 22:
                return LHG_PERSONALIZATION;
            case 23:
                return WAAL_RESULTS;
            case 24:
                return WAAL_RECOMMENDATIONS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87881b() {
        return C56001a.f149137a;
    }

    public final int getNumber() {
        return this.f149164z;
    }

    public final String toString() {
        return Integer.toString(this.f149164z);
    }
}
