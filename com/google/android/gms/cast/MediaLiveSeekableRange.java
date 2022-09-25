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
public class MediaLiveSeekableRange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143359aq();

    /* renamed from: e */
    private static final C143566ae f388652e = new C143566ae("MediaLiveSeekableRange");

    /* renamed from: a */
    public final long f388653a;

    /* renamed from: b */
    public final long f388654b;

    /* renamed from: c */
    public final boolean f388655c;

    /* renamed from: d */
    public final boolean f388656d;

    public MediaLiveSeekableRange(long j, long j2, boolean z, boolean z2) {
        this.f388653a = Math.max(j, 0);
        this.f388654b = Math.max(j2, 0);
        this.f388655c = z;
        this.f388656d = z2;
    }

    /* renamed from: a */
    static MediaLiveSeekableRange m232561a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("start") && jSONObject.has("end")) {
            try {
                long b = C143596v.m233269b(jSONObject.getDouble("start"));
                double d = jSONObject.getDouble("end");
                return new MediaLiveSeekableRange(b, C143596v.m233269b(d), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
            } catch (JSONException unused) {
                f388652e.mo118886d("Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObject.toString()), new Object[0]);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLiveSeekableRange)) {
            return false;
        }
        MediaLiveSeekableRange mediaLiveSeekableRange = (MediaLiveSeekableRange) obj;
        return this.f388653a == mediaLiveSeekableRange.f388653a && this.f388654b == mediaLiveSeekableRange.f388654b && this.f388655c == mediaLiveSeekableRange.f388655c && this.f388656d == mediaLiveSeekableRange.f388656d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f388653a), Long.valueOf(this.f388654b), Boolean.valueOf(this.f388655c), Boolean.valueOf(this.f388656d)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 2, this.f388653a);
        C143947c.m234090i(parcel, 3, this.f388654b);
        C143947c.m234084c(parcel, 4, this.f388655c);
        C143947c.m234084c(parcel, 5, this.f388656d);
        C143947c.m234083b(parcel, a);
    }
}
