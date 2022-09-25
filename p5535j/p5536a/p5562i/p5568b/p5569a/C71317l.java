package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.i.b.a.l */
/* compiled from: PG */
public enum C71317l implements C62957cd {
    UNKNOWN(0),
    FOREGROUND_TO_BACKGROUND(1),
    BACKGROUND_TO_FOREGROUND(2),
    FOREGROUND_SERVICE_START(3),
    FOREGROUND_SERVICE_STOP(4),
    CUSTOM_MEASURE_START(5),
    CUSTOM_MEASURE_STOP(6);
    

    /* renamed from: h */
    public final int f190464h;

    private C71317l(int i) {
        this.f190464h = i;
    }

    /* renamed from: a */
    public static C71317l m103956a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return FOREGROUND_TO_BACKGROUND;
            case 2:
                return BACKGROUND_TO_FOREGROUND;
            case 3:
                return FOREGROUND_SERVICE_START;
            case 4:
                return FOREGROUND_SERVICE_STOP;
            case 5:
                return CUSTOM_MEASURE_START;
            case 6:
                return CUSTOM_MEASURE_STOP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m103957b() {
        return C71316k.f190455a;
    }

    public final int getNumber() {
        return this.f190464h;
    }

    public final String toString() {
        return Integer.toString(this.f190464h);
    }
}
