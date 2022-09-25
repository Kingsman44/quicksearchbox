package p5535j.p5536a.p5556d.p5557a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.d.a.c */
/* compiled from: PG */
public enum C71170c implements C62957cd {
    UNKNOWN(0),
    UNSERIALIZABLE_INTENT(1),
    UNKNOWN_ACTIVITY(2),
    SHORTCUT_MANAGER_ABSENT(3),
    REQUEST_PIN_SHORTCUT_UNSUPPORTED(4),
    PERMISSION_DENIED(5),
    ILLEGAL_ARGUMENT(6),
    ILLEGAL_STATE(7);
    

    /* renamed from: i */
    public final int f189877i;

    private C71170c(int i) {
        this.f189877i = i;
    }

    /* renamed from: a */
    public static C71170c m103902a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return UNSERIALIZABLE_INTENT;
            case 2:
                return UNKNOWN_ACTIVITY;
            case 3:
                return SHORTCUT_MANAGER_ABSENT;
            case 4:
                return REQUEST_PIN_SHORTCUT_UNSUPPORTED;
            case 5:
                return PERMISSION_DENIED;
            case 6:
                return ILLEGAL_ARGUMENT;
            case 7:
                return ILLEGAL_STATE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m103903b() {
        return C71169b.f189867a;
    }

    public final int getNumber() {
        return this.f189877i;
    }

    public final String toString() {
        return Integer.toString(this.f189877i);
    }
}
