package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.c.c.a.dt */
/* compiled from: PG */
public enum C71074dt implements C62957cd {
    UNKNOWN_REASON_FOR_DISCONNECT(0),
    EXPERIMENT_FLAG_DISABLED(1),
    CONTINUED_CONVERSATION_ENABLED(2),
    LOCALE_INVALID(3),
    A11Y_SERVICES_ENABLED(4),
    APA_PINNING_DESTROY(5),
    SUBSCRIPTION_FAILED(6),
    SUBSCRIPTION_COMPLETE(7),
    SUBSCRIPTION_RECONNECT_REQUEST(8);
    

    /* renamed from: j */
    public final int f189547j;

    private C71074dt(int i) {
        this.f189547j = i;
    }

    /* renamed from: a */
    public static C71074dt m103876a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REASON_FOR_DISCONNECT;
            case 1:
                return EXPERIMENT_FLAG_DISABLED;
            case 2:
                return CONTINUED_CONVERSATION_ENABLED;
            case 3:
                return LOCALE_INVALID;
            case 4:
                return A11Y_SERVICES_ENABLED;
            case 5:
                return APA_PINNING_DESTROY;
            case 6:
                return SUBSCRIPTION_FAILED;
            case 7:
                return SUBSCRIPTION_COMPLETE;
            case 8:
                return SUBSCRIPTION_RECONNECT_REQUEST;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m103877b() {
        return C71073ds.f189536a;
    }

    public final int getNumber() {
        return this.f189547j;
    }

    public final String toString() {
        return Integer.toString(this.f189547j);
    }
}
