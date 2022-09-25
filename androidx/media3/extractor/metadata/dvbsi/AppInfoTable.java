package androidx.media3.extractor.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2592as;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;

/* compiled from: PG */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new C3587a();

    /* renamed from: a */
    public final int f11424a;

    /* renamed from: b */
    public final String f11425b;

    public AppInfoTable(int i, String str) {
        this.f11424a = i;
        this.f11425b = str;
    }

    /* renamed from: a */
    public final /* synthetic */ C2680x mo6066a() {
        return null;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6067b(C2592as asVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ byte[] mo6068c() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        int i = this.f11424a;
        String str = this.f11425b;
        return "Ait(controlCode=" + i + ",url=" + str + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11425b);
        parcel.writeInt(this.f11424a);
    }
}
