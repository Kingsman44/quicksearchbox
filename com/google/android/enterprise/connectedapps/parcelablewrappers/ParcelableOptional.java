package com.google.android.enterprise.connectedapps.parcelablewrappers;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import p3186j$.util.Optional;

/* compiled from: PG */
public class ParcelableOptional implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142599e();

    /* renamed from: a */
    public final Optional f386922a;

    /* renamed from: b */
    private final Bundler f386923b;

    /* renamed from: c */
    private final BundlerType f386924c;

    public ParcelableOptional(Parcel parcel) {
        Bundler bundler = (Bundler) parcel.readParcelable(Bundler.class.getClassLoader());
        this.f386923b = bundler;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386924c = null;
            this.f386922a = null;
            return;
        }
        BundlerType bundlerType = (BundlerType) parcel.readParcelable(Bundler.class.getClassLoader());
        this.f386924c = bundlerType;
        if (readInt == 1) {
            this.f386922a = Optional.m71637of(bundler.mo86970b(parcel, (BundlerType) bundlerType.f386876b.get(0)));
        } else {
            this.f386922a = Optional.empty();
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f386923b, i);
        Optional optional = this.f386922a;
        if (optional == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(optional.isPresent() ? 1 : 0);
        parcel.writeParcelable(this.f386924c, i);
        if (this.f386922a.isPresent()) {
            this.f386923b.mo86972d(parcel, this.f386922a.get(), (BundlerType) this.f386924c.f386876b.get(0), i);
        }
    }

    public ParcelableOptional(Bundler bundler, BundlerType bundlerType, Optional optional) {
        bundlerType.getClass();
        this.f386923b = bundler;
        this.f386924c = bundlerType;
        this.f386922a = optional;
    }
}
