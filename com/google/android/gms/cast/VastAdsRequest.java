package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public class VastAdsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143374be();

    /* renamed from: a */
    public final String f388749a;

    /* renamed from: b */
    public final String f388750b;

    public VastAdsRequest(String str, String str2) {
        this.f388749a = str;
        this.f388750b = str2;
    }

    /* renamed from: a */
    public static VastAdsRequest m232583a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new VastAdsRequest(C143596v.m233273f(jSONObject, "adTagUrl"), C143596v.m233273f(jSONObject, "adsResponse"));
    }

    /* renamed from: b */
    public final JSONObject mo118451b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f388749a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f388750b;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VastAdsRequest)) {
            return false;
        }
        VastAdsRequest vastAdsRequest = (VastAdsRequest) obj;
        return C143596v.m233278k(this.f388749a, vastAdsRequest.f388749a) && C143596v.m233278k(this.f388750b, vastAdsRequest.f388750b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f388749a, this.f388750b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f388749a);
        C143947c.m234106y(parcel, 3, this.f388750b);
        C143947c.m234083b(parcel, a);
    }
}
