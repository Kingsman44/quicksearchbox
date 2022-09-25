package com.google.android.libraries.assistant.hotword.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;

/* compiled from: PG */
public abstract class HotwordData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C18353a();

    /* renamed from: a */
    public abstract int mo23816a();

    /* renamed from: b */
    public abstract int mo23817b();

    /* renamed from: c */
    public abstract SpeakerIdModel mo23818c();

    /* renamed from: d */
    public abstract String mo23819d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract String mo23820e();

    /* renamed from: f */
    public abstract boolean mo23822f();

    /* renamed from: g */
    public abstract boolean mo23823g();

    /* renamed from: h */
    public abstract boolean mo23824h();

    /* renamed from: i */
    public abstract boolean mo23826i();

    /* renamed from: j */
    public abstract byte[] mo23827j();

    public final String toString() {
        String e = mo23820e();
        String str = "not available";
        String str2 = mo23818c() == null ? str : "available";
        if (mo23827j() != null) {
            str = "available";
        }
        boolean f = mo23822f();
        boolean i = mo23826i();
        boolean h = mo23824h();
        boolean g = mo23823g();
        int b = mo23817b();
        int a = mo23816a();
        String d = mo23819d();
        return "HotwordData[ locale: " + e + " speakerIdModel: " + str2 + " hotwordModel: " + str + " dumpHotwordAudioToFile: " + f + " enablePostProcessAdaptation: " + i + " enableEchoCanceller: " + h + " enableCleaner: " + g + " fixedGainMultiplier: " + b + " channelCount: " + a + " hotwordModelId: " + d + " ]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(0.0f);
        parcel.writeString(mo23820e());
        parcel.writeParcelable(mo23818c(), i);
        parcel.writeByteArray(mo23827j());
        parcel.writeByte(mo23822f() ? (byte) 1 : 0);
        parcel.writeByte(mo23826i() ? (byte) 1 : 0);
        parcel.writeByte(mo23824h() ? (byte) 1 : 0);
        parcel.writeByte(mo23823g() ? (byte) 1 : 0);
        parcel.writeInt(mo23817b());
        parcel.writeInt(mo23816a());
        parcel.writeString(mo23819d());
    }
}
