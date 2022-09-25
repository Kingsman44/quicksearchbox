package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.os.Parcel;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.b */
/* compiled from: PG */
public final class C33513b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "parcel");
        return new AssistStateCompat(parcel.readBundle(AssistStateCompat.class.getClassLoader()), (AssistStructure) parcel.readParcelable(AssistStateCompat.class.getClassLoader()), (AssistContent) parcel.readParcelable(AssistStateCompat.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AssistStateCompat[i];
    }
}
