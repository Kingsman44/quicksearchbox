package com.google.android.apps.gsa.staticplugins.actions.modularanswer.results;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ResultGroup implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C93415e();

    /* renamed from: a */
    public final int f260546a;

    /* renamed from: b */
    public final List f260547b;

    public ResultGroup(int i, List list) {
        this.f260546a = i;
        this.f260547b = list;
    }

    public ResultGroup(Parcel parcel) {
        this.f260546a = parcel.readInt();
        this.f260547b = new ArrayList();
        for (Parcelable parcelable : parcel.readParcelableArray(Result.class.getClassLoader())) {
            this.f260547b.add((Result) parcelable);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f260546a);
        List list = this.f260547b;
        parcel.writeParcelableArray((Result[]) list.toArray(new Result[list.size()]), i);
    }
}
