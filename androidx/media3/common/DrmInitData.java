package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
public final class DrmInitData implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new C2673q();

    /* renamed from: a */
    public final SchemeData[] f7047a;

    /* renamed from: b */
    public final String f7048b;

    /* renamed from: c */
    public final int f7049c;

    /* renamed from: d */
    private int f7050d;

    public DrmInitData(Parcel parcel) {
        this.f7048b = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) C2612ak.m6927J((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f7047a = schemeDataArr;
        this.f7049c = schemeDataArr.length;
    }

    /* renamed from: a */
    public final DrmInitData mo6048a(String str) {
        if (C2612ak.m6951aa(this.f7048b, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.f7047a);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        SchemeData schemeData = (SchemeData) obj;
        SchemeData schemeData2 = (SchemeData) obj2;
        if (C2669m.f7428a.equals(schemeData.f7051a)) {
            return !C2669m.f7428a.equals(schemeData2.f7051a) ? 1 : 0;
        }
        return schemeData.f7051a.compareTo(schemeData2.f7051a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            return C2612ak.m6951aa(this.f7048b, drmInitData.f7048b) && Arrays.equals(this.f7047a, drmInitData.f7047a);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7048b);
        parcel.writeTypedArray(this.f7047a, 0);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f7050d;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f7048b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.f7047a);
        this.f7050d = hashCode;
        return hashCode;
    }

    /* compiled from: PG */
    public final class SchemeData implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C2674r();

        /* renamed from: a */
        public final UUID f7051a;

        /* renamed from: b */
        public final String f7052b;

        /* renamed from: c */
        public final String f7053c;

        /* renamed from: d */
        public final byte[] f7054d;

        /* renamed from: e */
        private int f7055e;

        public SchemeData(Parcel parcel) {
            this.f7051a = new UUID(parcel.readLong(), parcel.readLong());
            this.f7052b = parcel.readString();
            String readString = parcel.readString();
            int i = C2612ak.f7249a;
            this.f7053c = readString;
            this.f7054d = parcel.createByteArray();
        }

        /* renamed from: a */
        public final boolean mo6054a() {
            return this.f7054d != null;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return C2612ak.m6951aa(this.f7052b, schemeData.f7052b) && C2612ak.m6951aa(this.f7053c, schemeData.f7053c) && C2612ak.m6951aa(this.f7051a, schemeData.f7051a) && Arrays.equals(this.f7054d, schemeData.f7054d);
        }

        public final int hashCode() {
            int i;
            int i2 = this.f7055e;
            if (i2 != 0) {
                return i2;
            }
            int hashCode = this.f7051a.hashCode() * 31;
            String str = this.f7052b;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int hashCode2 = ((((hashCode + i) * 31) + this.f7053c.hashCode()) * 31) + Arrays.hashCode(this.f7054d);
            this.f7055e = hashCode2;
            return hashCode2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7051a.getMostSignificantBits());
            parcel.writeLong(this.f7051a.getLeastSignificantBits());
            parcel.writeString(this.f7052b);
            parcel.writeString(this.f7053c);
            parcel.writeByteArray(this.f7054d);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f7051a = uuid;
            this.f7052b = str;
            str2.getClass();
            this.f7053c = str2;
            this.f7054d = bArr;
        }
    }

    public DrmInitData(String str, List list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.media3.common.DrmInitData$SchemeData[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DrmInitData(java.lang.String r1, boolean r2, androidx.media3.common.DrmInitData.SchemeData... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f7048b = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            androidx.media3.common.DrmInitData$SchemeData[] r3 = (androidx.media3.common.DrmInitData.SchemeData[]) r3
        L_0x000e:
            r0.f7047a = r3
            int r1 = r3.length
            r0.f7049c = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.DrmInitData.<init>(java.lang.String, boolean, androidx.media3.common.DrmInitData$SchemeData[]):void");
    }
}
