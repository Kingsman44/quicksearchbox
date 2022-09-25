package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.search.shared.service.ak */
/* compiled from: PG */
final class C87683ak implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        try {
            C62921ba a = C62921ba.m95368a();
            return new ServiceEventData((C88246uo) C62942bv.parseFrom((C62942bv) C88246uo.f238696c, createByteArray, a), parcel.readParcelable(EventData.class.getClassLoader()));
        } catch (C62974ct e) {
            throw new RuntimeException("Failed to parse event data.", e);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ServiceEventData[i];
    }
}
