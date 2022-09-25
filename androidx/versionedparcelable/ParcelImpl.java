package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4262a();

    /* renamed from: a */
    public final C4267f f13772a;

    protected ParcelImpl(Parcel parcel) {
        this.f13772a = new C4266e(parcel).mo9104i();
    }

    public ParcelImpl(C4267f fVar) {
        this.f13772a = fVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new C4266e(parcel).mo9090A(this.f13772a);
    }
}
