package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.util.C144012l;
import com.google.common.p4535g.C59203do;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public class MediaQueueItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143367ay();

    /* renamed from: a */
    public MediaInfo f388690a;

    /* renamed from: b */
    public int f388691b;

    /* renamed from: c */
    public boolean f388692c;

    /* renamed from: d */
    public double f388693d;

    /* renamed from: e */
    public double f388694e;

    /* renamed from: f */
    public double f388695f;

    /* renamed from: g */
    public long[] f388696g;

    /* renamed from: h */
    String f388697h;

    /* renamed from: i */
    public JSONObject f388698i;

    public MediaQueueItem(MediaInfo mediaInfo) {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, C59203do.f157270a, (long[]) null, (String) null);
    }

    /* renamed from: a */
    public final boolean mo118430a(JSONObject jSONObject) {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.f388690a = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.f388691b != (i = jSONObject.getInt("itemId"))) {
            this.f388691b = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.f388692c != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.f388692c = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.f388693d) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.f388693d) > 1.0E-7d)) {
            this.f388693d = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f388694e) > 1.0E-7d) {
                this.f388694e = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f388695f) > 1.0E-7d) {
                this.f388695f = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.f388696g;
            if (jArr2 != null && jArr2.length == length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (this.f388696g[i3] != jArr[i3]) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z3 = true;
        } else {
            jArr = null;
        }
        if (z3) {
            this.f388696g = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.f388698i = jSONObject.getJSONObject("customData");
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        JSONObject jSONObject = this.f388698i;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaQueueItem.f388698i;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C144012l.m234191a(jSONObject, jSONObject2)) && C143596v.m233278k(this.f388690a, mediaQueueItem.f388690a) && this.f388691b == mediaQueueItem.f388691b && this.f388692c == mediaQueueItem.f388692c && ((Double.isNaN(this.f388693d) && Double.isNaN(mediaQueueItem.f388693d)) || this.f388693d == mediaQueueItem.f388693d) && this.f388694e == mediaQueueItem.f388694e && this.f388695f == mediaQueueItem.f388695f && Arrays.equals(this.f388696g, mediaQueueItem.f388696g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f388690a, Integer.valueOf(this.f388691b), Boolean.valueOf(this.f388692c), Double.valueOf(this.f388693d), Double.valueOf(this.f388694e), Double.valueOf(this.f388695f), Integer.valueOf(Arrays.hashCode(this.f388696g)), String.valueOf(this.f388698i)});
    }

    public MediaQueueItem(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.f388690a = mediaInfo;
        this.f388691b = i;
        this.f388692c = z;
        this.f388693d = d;
        this.f388694e = d2;
        this.f388695f = d3;
        this.f388696g = jArr;
        this.f388697h = str;
        if (str != null) {
            try {
                this.f388698i = new JSONObject(this.f388697h);
            } catch (JSONException unused) {
                this.f388698i = null;
                this.f388697h = null;
            }
        } else {
            this.f388698i = null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f388698i;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f388697h = str;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f388690a, i);
        C143947c.m234089h(parcel, 3, this.f388691b);
        C143947c.m234084c(parcel, 4, this.f388692c);
        C143947c.m234086e(parcel, 5, this.f388693d);
        C143947c.m234086e(parcel, 6, this.f388694e);
        C143947c.m234086e(parcel, 7, this.f388695f);
        C143947c.m234102u(parcel, 8, this.f388696g);
        C143947c.m234106y(parcel, 9, this.f388697h);
        C143947c.m234083b(parcel, a);
    }

    public MediaQueueItem(JSONObject jSONObject) {
        this((MediaInfo) null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, C59203do.f157270a, (long[]) null, (String) null);
        mo118430a(jSONObject);
    }
}
