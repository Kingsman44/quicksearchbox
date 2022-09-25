package com.google.android.apps.gsa.search.core.carassistant;

import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.common.p4552o.amo;

/* compiled from: PG */
public final class AutoValue_CarAssistantSessionManager_Config extends C$AutoValue_CarAssistantSessionManager_Config {
    public static final Parcelable.Creator CREATOR = new C85701d();

    public AutoValue_CarAssistantSessionManager_Config(amo amo, long j, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, StatusBarNotification statusBarNotification, String str5, String str6, boolean z4, String str7, String str8, String str9, int i, long j2, HotwordDetectedEventData hotwordDetectedEventData, long j3) {
        super(amo, j, str, str2, str3, str4, z, z2, z3, statusBarNotification, str5, str6, z4, str7, str8, str9, i, j2, hotwordDetectedEventData, j3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f231669a.name());
        parcel.writeLong(this.f231670b);
        parcel.writeString(this.f231671c);
        if (this.f231672d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f231672d);
        }
        if (this.f231673e == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f231673e);
        }
        if (this.f231674f == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f231674f);
        }
        parcel.writeInt(this.f231675g ? 1 : 0);
        parcel.writeInt(this.f231676h ? 1 : 0);
        parcel.writeInt(this.f231677i ? 1 : 0);
        parcel.writeParcelable(this.f231678j, i);
        if (this.f231679k == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f231679k);
        }
        if (this.f231680l == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f231680l);
        }
        parcel.writeInt(this.f231681m ? 1 : 0);
        if (this.f231682n == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f231682n);
        }
        if (this.f231683o == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f231683o);
        }
        if (this.f231684p == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f231684p);
        }
        parcel.writeInt(this.f231685q);
        parcel.writeLong(this.f231686r);
        parcel.writeParcelable(this.f231687s, i);
        parcel.writeLong(this.f231688t);
    }
}
