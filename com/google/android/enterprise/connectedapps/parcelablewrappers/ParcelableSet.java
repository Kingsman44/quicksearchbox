package com.google.android.enterprise.connectedapps.parcelablewrappers;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public class ParcelableSet implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142600f();

    /* renamed from: a */
    public final Set f386925a;

    /* renamed from: b */
    private final Bundler f386926b;

    /* renamed from: c */
    private final BundlerType f386927c;

    public ParcelableSet(Parcel parcel) {
        this.f386926b = (Bundler) parcel.readParcelable(Bundler.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386927c = null;
            this.f386925a = null;
            return;
        }
        this.f386925a = new HashSet();
        BundlerType bundlerType = (BundlerType) parcel.readParcelable(Bundler.class.getClassLoader());
        this.f386927c = bundlerType;
        if (readInt > 0) {
            BundlerType bundlerType2 = (BundlerType) bundlerType.f386876b.get(0);
            for (int i = 0; i < readInt; i++) {
                this.f386925a.add(this.f386926b.mo86970b(parcel, bundlerType2));
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f386926b, i);
        Set set = this.f386925a;
        if (set == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(set.size());
        parcel.writeParcelable(this.f386927c, i);
        if (!this.f386925a.isEmpty()) {
            BundlerType bundlerType = (BundlerType) this.f386927c.f386876b.get(0);
            for (Object d : this.f386925a) {
                this.f386926b.mo86972d(parcel, d, bundlerType, i);
            }
        }
    }

    public ParcelableSet(Bundler bundler, BundlerType bundlerType, Set set) {
        if (bundler == null || bundlerType == null) {
            throw null;
        }
        this.f386926b = bundler;
        this.f386927c = bundlerType;
        this.f386925a = set;
    }
}
