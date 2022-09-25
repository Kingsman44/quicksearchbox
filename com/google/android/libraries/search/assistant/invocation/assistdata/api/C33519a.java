package com.google.android.libraries.search.assistant.invocation.assistdata.api;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.os.Parcel;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.assistdata.api.a */
/* compiled from: PG */
public final class C33519a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C69664n.m101061g(parcel, "parcel");
        return new AssistStateResult(parcel.readBundle(AssistStateResult.class.getClassLoader()), (AssistStructure) parcel.readParcelable(AssistStateResult.class.getClassLoader()), (AssistContent) parcel.readParcelable(AssistStateResult.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AssistStateResult[i];
    }
}
