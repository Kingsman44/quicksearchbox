package com.google.android.enterprise.connectedapps.parcelablewrappers;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ParcelableList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142597c();

    /* renamed from: a */
    public final List f386916a;

    /* renamed from: b */
    private final Bundler f386917b;

    /* renamed from: c */
    private final BundlerType f386918c;

    public ParcelableList(Parcel parcel) {
        this.f386917b = (Bundler) parcel.readParcelable(Bundler.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386918c = null;
            this.f386916a = null;
            return;
        }
        this.f386916a = new ArrayList();
        BundlerType bundlerType = (BundlerType) parcel.readParcelable(Bundler.class.getClassLoader());
        this.f386918c = bundlerType;
        if (readInt > 0) {
            BundlerType bundlerType2 = (BundlerType) bundlerType.f386876b.get(0);
            for (int i = 0; i < readInt; i++) {
                this.f386916a.add(this.f386917b.mo86970b(parcel, bundlerType2));
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f386917b, i);
        List list = this.f386916a;
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(list.size());
        parcel.writeParcelable(this.f386918c, i);
        if (!this.f386916a.isEmpty()) {
            BundlerType bundlerType = (BundlerType) this.f386918c.f386876b.get(0);
            for (Object d : this.f386916a) {
                this.f386917b.mo86972d(parcel, d, bundlerType, i);
            }
        }
    }

    public ParcelableList(Bundler bundler, BundlerType bundlerType, List list) {
        if (bundler == null || bundlerType == null) {
            throw null;
        }
        this.f386917b = bundler;
        this.f386918c = bundlerType;
        this.f386916a = list;
    }
}
