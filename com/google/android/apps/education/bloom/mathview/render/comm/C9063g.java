package com.google.android.apps.education.bloom.mathview.render.comm;

import android.os.Parcel;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.comm.g */
/* compiled from: PG */
public final class C9063g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "parcel");
        parcel.readInt();
        return InsertRowBelowCommand.f31286a;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InsertRowBelowCommand[i];
    }
}
