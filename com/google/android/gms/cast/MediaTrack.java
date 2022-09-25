package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.util.C144012l;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: PG */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C143371bb();

    /* renamed from: a */
    public long f388723a;

    /* renamed from: b */
    public int f388724b;

    /* renamed from: c */
    public String f388725c;

    /* renamed from: d */
    public String f388726d;

    /* renamed from: e */
    public String f388727e;

    /* renamed from: f */
    public final String f388728f;

    /* renamed from: g */
    public int f388729g;

    /* renamed from: h */
    public final List f388730h;

    /* renamed from: i */
    String f388731i;

    /* renamed from: j */
    public final JSONObject f388732j;

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, JSONObject jSONObject) {
        this.f388723a = j;
        this.f388724b = i;
        this.f388725c = str;
        this.f388726d = str2;
        this.f388727e = str3;
        this.f388728f = str4;
        this.f388729g = i2;
        this.f388730h = list;
        this.f388732j = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.f388732j;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.f388732j;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C144012l.m234191a(jSONObject, jSONObject2)) && this.f388723a == mediaTrack.f388723a && this.f388724b == mediaTrack.f388724b && C143596v.m233278k(this.f388725c, mediaTrack.f388725c) && C143596v.m233278k(this.f388726d, mediaTrack.f388726d) && C143596v.m233278k(this.f388727e, mediaTrack.f388727e) && C143596v.m233278k(this.f388728f, mediaTrack.f388728f) && this.f388729g == mediaTrack.f388729g && C143596v.m233278k(this.f388730h, mediaTrack.f388730h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f388723a), Integer.valueOf(this.f388724b), this.f388725c, this.f388726d, this.f388727e, this.f388728f, Integer.valueOf(this.f388729g), this.f388730h, String.valueOf(this.f388732j)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f388732j;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f388731i = str;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 2, this.f388723a);
        C143947c.m234089h(parcel, 3, this.f388724b);
        C143947c.m234106y(parcel, 4, this.f388725c);
        C143947c.m234106y(parcel, 5, this.f388726d);
        C143947c.m234106y(parcel, 6, this.f388727e);
        C143947c.m234106y(parcel, 7, this.f388728f);
        C143947c.m234089h(parcel, 8, this.f388729g);
        C143947c.m234078A(parcel, 9, this.f388730h);
        C143947c.m234106y(parcel, 10, this.f388731i);
        C143947c.m234083b(parcel, a);
    }
}
