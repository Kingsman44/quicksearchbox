package com.google.android.apps.gsa.staticplugins.actions.modularanswer.results;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55330oj;

/* compiled from: PG */
public abstract class Result implements Parcelable {

    /* renamed from: e */
    public final int f260545e;

    public Result(int i) {
        this.f260545e = i;
    }

    protected Result(Parcel parcel) {
        this.f260545e = parcel.readInt();
    }

    /* renamed from: a */
    public abstract C55240la mo87671a();

    /* renamed from: b */
    public abstract C55330oj mo87672b(boolean z);

    /* renamed from: c */
    public abstract Object mo87673c(C93416f fVar);

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f260545e);
    }
}
