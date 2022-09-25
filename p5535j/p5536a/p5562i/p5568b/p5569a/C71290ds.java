package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: j.a.i.b.a.ds */
/* compiled from: PG */
public enum C71290ds implements C62957cd {
    UNKNOWN(0),
    CREDENTIAL_ENCRYPTED(1),
    DEVICE_ENCRYPTED(2);
    

    /* renamed from: d */
    public final int f190356d;

    private C71290ds(int i) {
        this.f190356d = i;
    }

    /* renamed from: a */
    public static C71290ds m103950a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CREDENTIAL_ENCRYPTED;
        }
        if (i != 2) {
            return null;
        }
        return DEVICE_ENCRYPTED;
    }

    /* renamed from: b */
    public static C62959cf m103951b() {
        return C71289dr.f190351a;
    }

    public final int getNumber() {
        return this.f190356d;
    }

    public final String toString() {
        return Integer.toString(this.f190356d);
    }
}
