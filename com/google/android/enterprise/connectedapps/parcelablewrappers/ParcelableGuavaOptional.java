package com.google.android.enterprise.connectedapps.parcelablewrappers;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* compiled from: PG */
public class ParcelableGuavaOptional implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142596b();

    /* renamed from: a */
    public final C58833ax f386913a;

    /* renamed from: b */
    private final Bundler f386914b;

    /* renamed from: c */
    private final BundlerType f386915c;

    public ParcelableGuavaOptional(Parcel parcel) {
        Bundler bundler = (Bundler) parcel.readParcelable(Bundler.class.getClassLoader());
        this.f386914b = bundler;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f386915c = null;
            this.f386913a = null;
            return;
        }
        BundlerType bundlerType = (BundlerType) parcel.readParcelable(Bundler.class.getClassLoader());
        this.f386915c = bundlerType;
        if (readInt == 1) {
            this.f386913a = C58833ax.m90834k(bundler.mo86970b(parcel, (BundlerType) bundlerType.f386876b.get(0)));
        } else {
            this.f386913a = C58836b.f156633a;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f386914b, i);
        C58833ax axVar = this.f386913a;
        if (axVar == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(axVar.mo56113h() ? 1 : 0);
        parcel.writeParcelable(this.f386915c, i);
        if (this.f386913a.mo56113h()) {
            this.f386914b.mo86972d(parcel, this.f386913a.mo56107c(), (BundlerType) this.f386915c.f386876b.get(0), i);
        }
    }

    public ParcelableGuavaOptional(Bundler bundler, BundlerType bundlerType, C58833ax axVar) {
        bundlerType.getClass();
        this.f386914b = bundler;
        this.f386915c = bundlerType;
        this.f386913a = axVar;
    }
}
