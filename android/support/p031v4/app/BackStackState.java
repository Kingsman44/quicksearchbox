package android.support.p031v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: android.support.v4.app.BackStackState */
/* compiled from: PG */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0208c();

    /* renamed from: a */
    final List f615a;

    /* renamed from: b */
    final List f616b;

    public BackStackState(Parcel parcel) {
        this.f615a = parcel.createStringArrayList();
        this.f616b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    public BackStackState(List list, List list2) {
        this.f615a = list;
        this.f616b = list2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f615a);
        parcel.writeTypedList(this.f616b);
    }
}
