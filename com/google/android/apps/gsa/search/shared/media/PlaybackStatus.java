package com.google.android.apps.gsa.search.shared.media;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.p7613bw.C97304a;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* compiled from: PG */
public class PlaybackStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87595s();

    /* renamed from: a */
    public C87596t f236604a = C87596t.NONE;

    /* renamed from: b */
    public String f236605b;

    /* renamed from: c */
    public String f236606c;

    /* renamed from: d */
    public String f236607d;

    /* renamed from: e */
    public Bitmap f236608e;

    /* renamed from: f */
    public String f236609f;

    /* renamed from: g */
    public String f236610g;

    /* renamed from: h */
    public long f236611h;

    /* renamed from: i */
    public int f236612i;

    /* renamed from: j */
    public long f236613j;

    /* renamed from: k */
    public long f236614k;

    /* renamed from: l */
    public long f236615l;

    /* renamed from: m */
    public C97304a f236616m;

    public PlaybackStatus() {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaybackStatus)) {
            return false;
        }
        PlaybackStatus playbackStatus = (PlaybackStatus) obj;
        return this.f236604a == playbackStatus.f236604a && C58832aw.m90831a(this.f236605b, playbackStatus.f236605b) && C58832aw.m90831a(this.f236606c, playbackStatus.f236606c) && C58832aw.m90831a(this.f236607d, playbackStatus.f236607d) && C58832aw.m90831a(this.f236609f, playbackStatus.f236609f) && C58832aw.m90831a(this.f236610g, playbackStatus.f236610g) && C58832aw.m90831a(this.f236608e, playbackStatus.f236608e) && this.f236611h == playbackStatus.f236611h && this.f236615l == playbackStatus.f236615l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f236604a, this.f236605b, this.f236606c, this.f236607d, this.f236609f, this.f236610g, this.f236608e, Long.valueOf(this.f236611h), Long.valueOf(this.f236615l)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f236604a.name());
        parcel.writeStringArray(new String[]{this.f236605b, this.f236606c, this.f236607d, this.f236609f, this.f236610g});
        parcel.writeParcelable(this.f236608e, i);
        parcel.writeLong(this.f236611h);
        parcel.writeInt(this.f236612i);
        parcel.writeLong(this.f236613j);
        parcel.writeLong(this.f236614k);
        parcel.writeLong(this.f236615l);
    }

    public PlaybackStatus(Parcel parcel) {
        this.f236604a = C87596t.m142396a(parcel.readString());
        String[] strArr = new String[5];
        parcel.readStringArray(strArr);
        this.f236605b = strArr[0];
        this.f236606c = strArr[1];
        this.f236607d = strArr[2];
        this.f236609f = strArr[3];
        this.f236610g = strArr[4];
        this.f236608e = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f236611h = parcel.readLong();
        this.f236612i = parcel.readInt();
        this.f236613j = parcel.readLong();
        this.f236614k = parcel.readLong();
        this.f236615l = parcel.readLong();
    }
}
