package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2592as;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;

/* compiled from: PG */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new C3613c();

    /* renamed from: a */
    public final float f11511a;

    /* renamed from: b */
    public final int f11512b;

    public SmtaMetadataEntry(float f, int i) {
        this.f11511a = f;
        this.f11512b = i;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f11511a = parcel.readFloat();
        this.f11512b = parcel.readInt();
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
            return this.f11511a == smtaMetadataEntry.f11511a && this.f11512b == smtaMetadataEntry.f11512b;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f11511a).hashCode() + 527) * 31) + this.f11512b;
    }

    public final String toString() {
        float f = this.f11511a;
        int i = this.f11512b;
        return "smta: captureFrameRate=" + f + ", svcTemporalLayerCount=" + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f11511a);
        parcel.writeInt(this.f11512b);
    }
}
