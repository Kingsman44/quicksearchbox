package p001a.p007b.p008a.p009a.p010a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: a.b.a.a.a.p */
/* compiled from: PG */
public enum C0020p implements C62957cd {
    SEAT_UNKNOWN(0),
    SEAT_ROW_1_CENTER(1),
    SEAT_ROW_1_LEFT(2),
    SEAT_ROW_1_RIGHT(3),
    SEAT_ROW_2_CENTER(4),
    SEAT_ROW_2_LEFT(5),
    SEAT_ROW_2_RIGHT(6),
    SEAT_ROW_3_CENTER(7),
    SEAT_ROW_3_LEFT(8),
    SEAT_ROW_3_RIGHT(9);
    

    /* renamed from: k */
    public final int f52k;

    private C0020p(int i) {
        this.f52k = i;
    }

    /* renamed from: a */
    public static C0020p m2a(int i) {
        switch (i) {
            case 0:
                return SEAT_UNKNOWN;
            case 1:
                return SEAT_ROW_1_CENTER;
            case 2:
                return SEAT_ROW_1_LEFT;
            case 3:
                return SEAT_ROW_1_RIGHT;
            case 4:
                return SEAT_ROW_2_CENTER;
            case 5:
                return SEAT_ROW_2_LEFT;
            case 6:
                return SEAT_ROW_2_RIGHT;
            case 7:
                return SEAT_ROW_3_CENTER;
            case 8:
                return SEAT_ROW_3_LEFT;
            case 9:
                return SEAT_ROW_3_RIGHT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m3b() {
        return C0019o.f40a;
    }

    public final int getNumber() {
        return this.f52k;
    }

    public final String toString() {
        return Integer.toString(this.f52k);
    }
}
