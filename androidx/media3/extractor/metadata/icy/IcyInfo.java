package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2592as;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import java.util.Arrays;

/* compiled from: PG */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new C3596c();

    /* renamed from: a */
    public final byte[] f11452a;

    /* renamed from: b */
    public final String f11453b;

    /* renamed from: c */
    public final String f11454c;

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f11452a = createByteArray;
        this.f11453b = parcel.readString();
        this.f11454c = parcel.readString();
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f11452a = bArr;
        this.f11453b = str;
        this.f11454c = str2;
    }

    /* renamed from: a */
    public final /* synthetic */ C2680x mo6066a() {
        return null;
    }

    /* renamed from: b */
    public final void mo6067b(C2592as asVar) {
        String str = this.f11453b;
        if (str != null) {
            asVar.f7162a = str;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ byte[] mo6068c() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11452a, ((IcyInfo) obj).f11452a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11452a);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.f11453b, this.f11454c, Integer.valueOf(this.f11452a.length)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f11452a);
        parcel.writeString(this.f11453b);
        parcel.writeString(this.f11454c);
    }
}
