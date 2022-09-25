package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import org.json.JSONObject;

/* compiled from: PG */
public class MediaError extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C143356an();

    /* renamed from: a */
    public String f388628a;

    /* renamed from: b */
    public long f388629b;

    /* renamed from: c */
    public final Integer f388630c;

    /* renamed from: d */
    public final String f388631d;

    /* renamed from: e */
    String f388632e;

    /* renamed from: f */
    private final JSONObject f388633f;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.f388628a = str;
        this.f388629b = j;
        this.f388630c = num;
        this.f388631d = str2;
        this.f388633f = jSONObject;
    }

    /* renamed from: a */
    public static void m232558a(JSONObject jSONObject) {
        jSONObject.optString("type", "ERROR");
        jSONObject.optLong("requestId");
        if (jSONObject.has("detailedErrorCode")) {
            jSONObject.optInt("detailedErrorCode");
        }
        C143596v.m233273f(jSONObject, "reason");
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f388633f;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f388632e = str;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f388628a);
        C143947c.m234090i(parcel, 3, this.f388629b);
        C143947c.m234101t(parcel, 4, this.f388630c);
        C143947c.m234106y(parcel, 5, this.f388631d);
        C143947c.m234106y(parcel, 6, this.f388632e);
        C143947c.m234083b(parcel, a);
    }
}
