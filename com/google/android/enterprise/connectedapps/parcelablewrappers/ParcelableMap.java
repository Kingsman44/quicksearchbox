package com.google.android.enterprise.connectedapps.parcelablewrappers;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class ParcelableMap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142598d();

    /* renamed from: a */
    public final Map f386919a;

    /* renamed from: b */
    private final Bundler f386920b;

    /* renamed from: c */
    private final BundlerType f386921c;

    public ParcelableMap(Parcel parcel) {
        this.f386920b = (Bundler) parcel.readParcelable(Bundler.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386921c = null;
            this.f386919a = null;
            return;
        }
        this.f386919a = new HashMap();
        BundlerType bundlerType = (BundlerType) parcel.readParcelable(Bundler.class.getClassLoader());
        this.f386921c = bundlerType;
        if (readInt > 0) {
            BundlerType bundlerType2 = (BundlerType) bundlerType.f386876b.get(0);
            BundlerType bundlerType3 = (BundlerType) bundlerType.f386876b.get(1);
            for (int i = 0; i < readInt; i++) {
                this.f386919a.put(this.f386920b.mo86970b(parcel, bundlerType2), this.f386920b.mo86970b(parcel, bundlerType3));
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f386920b, i);
        Map map = this.f386919a;
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        parcel.writeParcelable(this.f386921c, i);
        if (!this.f386919a.isEmpty()) {
            BundlerType bundlerType = (BundlerType) this.f386921c.f386876b.get(0);
            BundlerType bundlerType2 = (BundlerType) this.f386921c.f386876b.get(1);
            for (Map.Entry entry : this.f386919a.entrySet()) {
                this.f386920b.mo86972d(parcel, entry.getKey(), bundlerType, i);
                this.f386920b.mo86972d(parcel, entry.getValue(), bundlerType2, i);
            }
        }
    }

    public ParcelableMap(Bundler bundler, BundlerType bundlerType, Map map) {
        bundlerType.getClass();
        this.f386920b = bundler;
        this.f386921c = bundlerType;
        this.f386919a = map;
    }
}
