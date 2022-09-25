package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public class AdBreakStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143376c();

    /* renamed from: f */
    private static final C143566ae f388586f = new C143566ae("AdBreakStatus");

    /* renamed from: a */
    public final long f388587a;

    /* renamed from: b */
    public final long f388588b;

    /* renamed from: c */
    public final String f388589c;

    /* renamed from: d */
    public final String f388590d;

    /* renamed from: e */
    public final long f388591e;

    public AdBreakStatus(long j, long j2, String str, String str2, long j3) {
        this.f388587a = j;
        this.f388588b = j2;
        this.f388589c = str;
        this.f388590d = str2;
        this.f388591e = j3;
    }

    /* renamed from: a */
    static AdBreakStatus m232552a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("currentBreakTime") && jSONObject.has("currentBreakClipTime")) {
            try {
                long c = C143596v.m233270c(jSONObject.getLong("currentBreakTime"));
                long c2 = C143596v.m233270c(jSONObject.getLong("currentBreakClipTime"));
                String f = C143596v.m233273f(jSONObject, "breakId");
                String f2 = C143596v.m233273f(jSONObject, "breakClipId");
                long optLong = jSONObject.optLong("whenSkippable", -1);
                return new AdBreakStatus(c, c2, f, f2, optLong != -1 ? C143596v.m233270c(optLong) : optLong);
            } catch (JSONException e) {
                f388586f.mo118887e(e, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakStatus)) {
            return false;
        }
        AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
        return this.f388587a == adBreakStatus.f388587a && this.f388588b == adBreakStatus.f388588b && C143596v.m233278k(this.f388589c, adBreakStatus.f388589c) && C143596v.m233278k(this.f388590d, adBreakStatus.f388590d) && this.f388591e == adBreakStatus.f388591e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f388587a), Long.valueOf(this.f388588b), this.f388589c, this.f388590d, Long.valueOf(this.f388591e)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 2, this.f388587a);
        C143947c.m234090i(parcel, 3, this.f388588b);
        C143947c.m234106y(parcel, 4, this.f388589c);
        C143947c.m234106y(parcel, 5, this.f388590d);
        C143947c.m234090i(parcel, 6, this.f388591e);
        C143947c.m234083b(parcel, a);
    }
}
