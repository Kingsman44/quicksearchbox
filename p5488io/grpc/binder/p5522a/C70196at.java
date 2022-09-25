package p5488io.grpc.binder.p5522a;

import android.os.Parcel;
import org.chromium.net.PrivateKeyType;
import p5488io.grpc.Status;

/* renamed from: io.grpc.binder.a.at */
/* compiled from: PG */
final class C70196at {
    /* renamed from: a */
    static int m102280a(Parcel parcel, Status status) {
        int value = status.getCode().value() << 16;
        String description = status.getDescription();
        if (description != null && description.length() > 1000) {
            description = description.substring(0, 1000);
        }
        if (description == null) {
            return value;
        }
        parcel.writeString(description);
        return value | 32;
    }

    /* renamed from: b */
    static Status m102281b(int i, Parcel parcel) {
        Status fromCodeValue = Status.fromCodeValue((i >> 16) & PrivateKeyType.INVALID);
        return (i & 32) != 0 ? fromCodeValue.withDescription(parcel.readString()) : fromCodeValue;
    }

    /* renamed from: c */
    static void m102282c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: d */
    static boolean m102283d(int i, int i2) {
        return (i & i2) != 0;
    }
}
