package com.google.apps.tiktok.nav.gateway;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;

/* renamed from: com.google.apps.tiktok.nav.gateway.j */
/* compiled from: PG */
final class C47504j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new GatewayHandler.GatewayDestination(parcel.readInt(), parcel.createTypedArrayList(Intent.CREATOR), parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GatewayHandler.GatewayDestination[i];
    }
}
