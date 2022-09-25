package p5535j.p5536a.p5543b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.b.n */
/* compiled from: PG */
public enum C70967n implements C62957cd {
    UNKNOWN(0),
    ONLINE_RESPONSE(1),
    STRUCTURED_TTS(2),
    ERROR_PUNT(3),
    MESSAGE_READ_ONLINE(4),
    LIM_CON(5),
    SUGGESTION(6),
    DEVICE_PERMISSION(7),
    PERMISSION_REQUEST(8),
    COLD_BOOT(9),
    DATA_SUBSCRIPTION(10),
    FEEDBACK_WHEN_PARKED(11),
    NOTIFICATION_PERMISSION(12),
    MESSAGE_READ_OFFLINE(13),
    NOTIFICATION_ANNOUNCE(14);
    

    /* renamed from: p */
    public final int f189241p;

    private C70967n(int i) {
        this.f189241p = i;
    }

    /* renamed from: a */
    public static C70967n m103850a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ONLINE_RESPONSE;
            case 2:
                return STRUCTURED_TTS;
            case 3:
                return ERROR_PUNT;
            case 4:
                return MESSAGE_READ_ONLINE;
            case 5:
                return LIM_CON;
            case 6:
                return SUGGESTION;
            case 7:
                return DEVICE_PERMISSION;
            case 8:
                return PERMISSION_REQUEST;
            case 9:
                return COLD_BOOT;
            case 10:
                return DATA_SUBSCRIPTION;
            case 11:
                return FEEDBACK_WHEN_PARKED;
            case 12:
                return NOTIFICATION_PERMISSION;
            case 13:
                return MESSAGE_READ_OFFLINE;
            case 14:
                return NOTIFICATION_ANNOUNCE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m103851b() {
        return C70966m.f189224a;
    }

    public final int getNumber() {
        return this.f189241p;
    }

    public final String toString() {
        return Integer.toString(this.f189241p);
    }
}
