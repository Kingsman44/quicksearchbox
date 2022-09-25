package androidx.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.n */
/* compiled from: PG */
public final class C3893n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "inParcel");
        return new NavBackStackEntryState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NavBackStackEntryState[i];
    }
}
