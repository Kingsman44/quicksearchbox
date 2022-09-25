package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.c.c.a.cb */
/* compiled from: PG */
public enum C71029cb implements C62957cd {
    UNKNOWN(0),
    QUICK_PHRASES(1),
    SMART_DICTATION(2),
    BRIEF_TTS(3),
    ON_DEVICE_NLU(4),
    ON_DEVICE_ASR(5),
    ZERO_MIC_LATENCY(6),
    PIXEL_UI_MODE(7),
    BASIC_PIXEL4PLUS(8),
    TNG_MA_STATUS(9),
    LOCALE_INDEPENDENT_ON_DEVICE_ASR(11),
    LOCALE_INDEPENDENT_ON_DEVICE_NLU(12),
    MDA_MOTION_SIGNALS(13);
    

    /* renamed from: n */
    public final int f189440n;

    private C71029cb(int i) {
        this.f189440n = i;
    }

    /* renamed from: a */
    public static C71029cb m103857a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return QUICK_PHRASES;
            case 2:
                return SMART_DICTATION;
            case 3:
                return BRIEF_TTS;
            case 4:
                return ON_DEVICE_NLU;
            case 5:
                return ON_DEVICE_ASR;
            case 6:
                return ZERO_MIC_LATENCY;
            case 7:
                return PIXEL_UI_MODE;
            case 8:
                return BASIC_PIXEL4PLUS;
            case 9:
                return TNG_MA_STATUS;
            case 11:
                return LOCALE_INDEPENDENT_ON_DEVICE_ASR;
            case 12:
                return LOCALE_INDEPENDENT_ON_DEVICE_NLU;
            case 13:
                return MDA_MOTION_SIGNALS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m103858b() {
        return C71028ca.f189425a;
    }

    public final int getNumber() {
        return this.f189440n;
    }

    public final String toString() {
        return Integer.toString(this.f189440n);
    }
}
