package p5488io.grpc.binder.p5522a;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import java.io.InputStream;
import p5488io.grpc.C70251bv;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70294cw;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.binder.C70229i;

/* renamed from: io.grpc.binder.a.ab */
/* compiled from: PG */
public final class C70178ab {

    /* renamed from: a */
    private static final C70294cw f187031a = new C70177aa((Parcelable.Creator) null, true);

    private C70178ab() {
    }

    /* renamed from: a */
    public static C70334de m102193a(Parcel parcel, C70256c cVar) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new C70334de();
        }
        Object[] objArr = new Object[(readInt + readInt)];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < readInt; i3++) {
            int readInt2 = parcel.readInt();
            int i4 = i + 4;
            int i5 = i3 + i3;
            objArr[i5] = m102195c(parcel, readInt2, i4);
            int readInt3 = parcel.readInt();
            i = i4 + readInt2 + 4;
            if (readInt3 == -1) {
                C70229i iVar = (C70229i) cVar.f187256b.get(C70206k.f187119h);
                if (iVar.f187212b) {
                    int dataPosition = parcel.dataPosition();
                    try {
                        Parcelable readParcelable = parcel.readParcelable(C70178ab.class.getClassLoader());
                        if (readParcelable != null) {
                            objArr[i5 + 1] = C70251bv.m102402e(f187031a, readParcelable);
                            i2 += parcel.dataPosition() - dataPosition;
                            int i6 = iVar.f187214d;
                            if (i2 > 32768) {
                                throw Status.f186911i.withDescription("Inbound Parcelables too large according to policy (see InboundParcelablePolicy)").asException();
                            }
                        } else {
                            throw Status.f186915m.withDescription("Read null parcelable in metadata").asException();
                        }
                    } catch (AndroidRuntimeException e) {
                        throw Status.f186915m.mo61678e(e).withDescription("Failure reading parcelable in metadata").asException();
                    }
                } else {
                    throw Status.f186909g.withDescription("Parcelable metadata values not allowed").asException();
                }
            } else if (readInt3 >= 0) {
                objArr[i5 + 1] = m102195c(parcel, readInt3, i);
                i += readInt3;
            } else {
                throw Status.f186915m.withDescription("Unrecognized metadata sentinel").asException();
            }
        }
        return C70251bv.m102401d(readInt, objArr);
    }

    /* renamed from: b */
    public static void m102194b(Parcel parcel, C70334de deVar) {
        int length;
        int a = deVar != null ? C70251bv.m102398a(deVar) : 0;
        if (a == 0) {
            parcel.writeInt(0);
            return;
        }
        Object[] f = C70251bv.m102403f(deVar);
        parcel.writeInt(a);
        for (int i = 0; i < a; i++) {
            int i2 = i + i;
            byte[] bArr = (byte[]) f[i2];
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            Object obj = f[i2 + 1];
            if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                parcel.writeInt(bArr2.length);
                parcel.writeByteArray(bArr2);
            } else if (obj instanceof C70189am) {
                parcel.writeInt(-1);
                ((C70189am) obj).mo61793a(parcel);
            } else {
                byte[] b = C70212q.m102336b(C70212q.f187143a);
                try {
                    InputStream inputStream = (InputStream) obj;
                    int i3 = 0;
                    while (true) {
                        length = b.length;
                        if (i3 >= length) {
                            break;
                        }
                        int read = inputStream.read(b, i3, length - i3);
                        if (read == -1) {
                            break;
                        }
                        i3 += read;
                    }
                    if (i3 != length) {
                        parcel.writeInt(i3);
                        if (i3 > 0) {
                            parcel.writeByteArray(b, 0, i3);
                        }
                    } else {
                        throw Status.f186911i.withDescription("Metadata value too large").asException();
                    }
                } finally {
                    C70212q.m102335a(b);
                }
            }
        }
    }

    /* renamed from: c */
    private static byte[] m102195c(Parcel parcel, int i, int i2) {
        if (i2 + i <= 8192) {
            byte[] bArr = new byte[i];
            if (i > 0) {
                parcel.readByteArray(bArr);
            }
            return bArr;
        }
        throw Status.f186911i.withDescription("Metadata too large").asException();
    }
}
