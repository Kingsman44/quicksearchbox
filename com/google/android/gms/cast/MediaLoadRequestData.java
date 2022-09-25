package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.util.C144012l;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public class MediaLoadRequestData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143361as();

    /* renamed from: a */
    public final MediaInfo f388657a;

    /* renamed from: b */
    public final MediaQueueData f388658b;

    /* renamed from: c */
    public final Boolean f388659c;

    /* renamed from: d */
    public final long f388660d;

    /* renamed from: e */
    public final double f388661e;

    /* renamed from: f */
    public final long[] f388662f;

    /* renamed from: g */
    String f388663g;

    /* renamed from: h */
    public final String f388664h;

    /* renamed from: i */
    public final String f388665i;

    /* renamed from: j */
    public final String f388666j;

    /* renamed from: k */
    public final String f388667k;

    /* renamed from: l */
    public long f388668l;

    /* renamed from: m */
    private final JSONObject f388669m;

    static {
        new C143566ae("MediaLoadRequestData");
    }

    public MediaLoadRequestData(MediaInfo mediaInfo, MediaQueueData mediaQueueData, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.f388657a = mediaInfo;
        this.f388658b = mediaQueueData;
        this.f388659c = bool;
        this.f388660d = j;
        this.f388661e = d;
        this.f388662f = jArr;
        this.f388669m = jSONObject;
        this.f388664h = str;
        this.f388665i = str2;
        this.f388666j = str3;
        this.f388667k = str4;
        this.f388668l = j2;
    }

    /* renamed from: a */
    public static MediaLoadRequestData m232562a(JSONObject jSONObject) {
        C143360ar arVar = new C143360ar();
        try {
            if (jSONObject.has("media")) {
                arVar.f388807a = new MediaInfo(jSONObject.getJSONObject("media"));
            }
            if (jSONObject.has("queueData")) {
                MediaQueueData mediaQueueData = new MediaQueueData();
                mediaQueueData.mo118426a(jSONObject.getJSONObject("queueData"));
                arVar.f388808b = new MediaQueueData(mediaQueueData);
            }
            if (jSONObject.has("autoplay")) {
                arVar.f388809c = Boolean.valueOf(jSONObject.getBoolean("autoplay"));
            } else {
                arVar.f388809c = null;
            }
            if (jSONObject.has("currentTime")) {
                arVar.f388810d = C143596v.m233269b(jSONObject.getDouble("currentTime"));
            } else {
                arVar.f388810d = -1;
            }
            arVar.mo118511b(jSONObject.optDouble("playbackRate", 1.0d));
            arVar.f388813g = C143596v.m233273f(jSONObject, "credentials");
            arVar.f388814h = C143596v.m233273f(jSONObject, "credentialsType");
            arVar.f388815i = C143596v.m233273f(jSONObject, "atvCredentials");
            arVar.f388816j = C143596v.m233273f(jSONObject, "atvCredentialsType");
            arVar.f388817k = jSONObject.optLong("requestId");
            JSONArray optJSONArray = jSONObject.optJSONArray("activeTrackIds");
            if (optJSONArray != null) {
                long[] jArr = new long[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    jArr[i] = optJSONArray.getLong(i);
                }
                arVar.f388811e = jArr;
            }
            arVar.f388812f = jSONObject.optJSONObject("customData");
            return arVar.mo118510a();
        } catch (JSONException unused) {
            return arVar.mo118510a();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLoadRequestData)) {
            return false;
        }
        MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
        return C144012l.m234191a(this.f388669m, mediaLoadRequestData.f388669m) && C143912ba.m233950b(this.f388657a, mediaLoadRequestData.f388657a) && C143912ba.m233950b(this.f388658b, mediaLoadRequestData.f388658b) && C143912ba.m233950b(this.f388659c, mediaLoadRequestData.f388659c) && this.f388660d == mediaLoadRequestData.f388660d && this.f388661e == mediaLoadRequestData.f388661e && Arrays.equals(this.f388662f, mediaLoadRequestData.f388662f) && C143912ba.m233950b(this.f388664h, mediaLoadRequestData.f388664h) && C143912ba.m233950b(this.f388665i, mediaLoadRequestData.f388665i) && C143912ba.m233950b(this.f388666j, mediaLoadRequestData.f388666j) && C143912ba.m233950b(this.f388667k, mediaLoadRequestData.f388667k) && this.f388668l == mediaLoadRequestData.f388668l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f388657a, this.f388658b, this.f388659c, Long.valueOf(this.f388660d), Double.valueOf(this.f388661e), this.f388662f, String.valueOf(this.f388669m), this.f388664h, this.f388665i, this.f388666j, this.f388667k, Long.valueOf(this.f388668l)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f388669m;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f388663g = str;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f388657a, i);
        C143947c.m234105x(parcel, 3, this.f388658b, i);
        C143947c.m234092k(parcel, 4, this.f388659c);
        C143947c.m234090i(parcel, 5, this.f388660d);
        C143947c.m234086e(parcel, 6, this.f388661e);
        C143947c.m234102u(parcel, 7, this.f388662f);
        C143947c.m234106y(parcel, 8, this.f388663g);
        C143947c.m234106y(parcel, 9, this.f388664h);
        C143947c.m234106y(parcel, 10, this.f388665i);
        C143947c.m234106y(parcel, 11, this.f388666j);
        C143947c.m234106y(parcel, 12, this.f388667k);
        C143947c.m234090i(parcel, 13, this.f388668l);
        C143947c.m234083b(parcel, a);
    }
}
