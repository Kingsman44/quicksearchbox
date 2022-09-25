package com.google.android.apps.education.bloom.mathview.render.comm;

import android.os.Parcel;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.comm.d */
/* compiled from: PG */
public final class C9060d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "parcel");
        return new InsertCodePointAsSuperscriptCommand(parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InsertCodePointAsSuperscriptCommand[i];
    }
}
