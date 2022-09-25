package com.google.android.apps.gsa.search.core.carassistant;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;

/* compiled from: PG */
final class AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest extends C$AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest {
    public static final Parcelable.Creator CREATOR = new C85699c();

    /* renamed from: p */
    public static final C85731i f231689p = new C85731i();

    /* renamed from: q */
    public static final C85732j f231690q = new C85732j();

    public AutoValue_CarAssistantSessionManager_CarAssistantSessionRequest(int i, Query query, HotwordDetectedEventData hotwordDetectedEventData, String str, String str2, String str3, String str4, long j, boolean z, boolean z2, boolean z3, boolean z4, C58485gu guVar, C58485gu guVar2, C63088z zVar) {
        super(i, query, hotwordDetectedEventData, str, str2, str3, str4, j, z, z2, z3, z4, guVar, guVar2, zVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(C85733k.m137750a(this.f231668o));
        parcel.writeParcelable(this.f231654a, i);
        parcel.writeParcelable(this.f231655b, i);
        if (this.f231656c == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f231656c);
        }
        if (this.f231657d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f231657d);
        }
        if (this.f231658e == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f231658e);
        }
        parcel.writeString(this.f231659f);
        parcel.writeLong(this.f231660g);
        parcel.writeInt(this.f231661h ? 1 : 0);
        parcel.writeInt(this.f231662i ? 1 : 0);
        parcel.writeInt(this.f231663j ? 1 : 0);
        parcel.writeInt(this.f231664k ? 1 : 0);
        parcel.writeList(this.f231665l);
        parcel.writeList(this.f231666m);
        parcel.writeSerializable(this.f231667n);
    }
}
