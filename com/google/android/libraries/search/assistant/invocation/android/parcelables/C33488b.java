package com.google.android.libraries.search.assistant.invocation.android.parcelables;

import android.os.Parcel;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.parcelables.b */
/* compiled from: PG */
public final class C33488b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "parcel");
        return new IBinderContainer(parcel.readStrongBinder());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new IBinderContainer[i];
    }
}
