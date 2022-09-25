package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2152a();

    /* renamed from: c */
    public static final AbsSavedState f6115c = new AbsSavedState() {
    };

    /* renamed from: d */
    public final Parcelable f6116d;

    public AbsSavedState() {
        this.f6116d = null;
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f6116d = readParcelable == null ? f6115c : readParcelable;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f6116d, i);
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f6116d = parcelable == f6115c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
}
