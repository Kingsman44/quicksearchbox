package android.support.p031v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* compiled from: PG */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0294ak();

    /* renamed from: a */
    public int f989a;

    /* renamed from: b */
    public int f990b;

    /* renamed from: c */
    public int f991c;

    /* renamed from: d */
    public int f992d;

    /* renamed from: e */
    public int f993e;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f989a = parcel.readInt();
        this.f991c = parcel.readInt();
        this.f992d = parcel.readInt();
        this.f993e = parcel.readInt();
        this.f990b = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f989a);
        parcel.writeInt(this.f991c);
        parcel.writeInt(this.f992d);
        parcel.writeInt(this.f993e);
        parcel.writeInt(this.f990b);
    }
}
