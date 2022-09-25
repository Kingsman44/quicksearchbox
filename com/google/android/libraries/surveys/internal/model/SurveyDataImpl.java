package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.SurveyData;
import com.google.android.libraries.surveys.SurveyMetadata;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.common.p4522b.C58485gu;
import com.google.p4281bu.p4282a.C56532bp;
import com.google.p4281bu.p4282a.C56565cv;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public class SurveyDataImpl implements SurveyData {
    public static final Parcelable.Creator CREATOR = new C43070c();

    /* renamed from: a */
    public final String f112638a;

    /* renamed from: b */
    public final String f112639b;

    /* renamed from: c */
    public final C56532bp f112640c;

    /* renamed from: d */
    public final C56565cv f112641d;

    /* renamed from: e */
    public final String f112642e;

    /* renamed from: f */
    public final long f112643f;

    /* renamed from: g */
    public final C58485gu f112644g;

    public SurveyDataImpl(Parcel parcel) {
        this.f112638a = parcel.readString();
        this.f112639b = parcel.readString();
        this.f112642e = parcel.readString();
        this.f112643f = parcel.readLong();
        C58485gu m = C58485gu.m89845m();
        this.f112644g = m;
        parcel.readStringList(m);
        this.f112640c = (C56532bp) ProtoParsers.m95518a(parcel, C56532bp.f150963g, C62921ba.f169869a);
        this.f112641d = (C56565cv) ProtoParsers.m95518a(parcel, C56565cv.f151038c, C62921ba.f169869a);
    }

    public SurveyDataImpl(String str, String str2, long j, C56565cv cvVar, C56532bp bpVar, String str3, C58485gu guVar) {
        this.f112638a = str;
        this.f112639b = str2;
        this.f112643f = j;
        this.f112642e = str3;
        this.f112644g = guVar;
        this.f112640c = bpVar;
        this.f112641d = cvVar;
    }

    /* renamed from: a */
    public final SurveyMetadata mo46048a() {
        return new SurveyMetadata(this.f112638a, this.f112639b, mo46094b(), true != C43066o.m75995p(this.f112640c) ? 2 : 3);
    }

    /* renamed from: b */
    public final String mo46094b() {
        C56565cv cvVar = this.f112641d;
        if (cvVar != null) {
            return cvVar.f151040a;
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f112638a);
        parcel.writeString(this.f112639b);
        parcel.writeString(this.f112642e);
        parcel.writeLong(this.f112643f);
        parcel.writeStringList(this.f112644g);
        ProtoParsers.m95530m(parcel, this.f112640c);
        ProtoParsers.m95530m(parcel, this.f112641d);
    }
}
