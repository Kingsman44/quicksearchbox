package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public class AdBreakClipInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143342a();

    /* renamed from: a */
    public final String f388566a;

    /* renamed from: b */
    public final String f388567b;

    /* renamed from: c */
    public final long f388568c;

    /* renamed from: d */
    public final String f388569d;

    /* renamed from: e */
    public final String f388570e;

    /* renamed from: f */
    public final String f388571f;

    /* renamed from: g */
    public String f388572g;

    /* renamed from: h */
    public final String f388573h;

    /* renamed from: i */
    public final String f388574i;

    /* renamed from: j */
    public final long f388575j;

    /* renamed from: k */
    public final String f388576k;

    /* renamed from: l */
    public final VastAdsRequest f388577l;

    /* renamed from: m */
    public JSONObject f388578m;

    public AdBreakClipInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, VastAdsRequest vastAdsRequest) {
        this.f388566a = str;
        this.f388567b = str2;
        this.f388568c = j;
        this.f388569d = str3;
        this.f388570e = str4;
        this.f388571f = str5;
        this.f388572g = str6;
        this.f388573h = str7;
        this.f388574i = str8;
        this.f388575j = j2;
        this.f388576k = str9;
        this.f388577l = vastAdsRequest;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f388578m = new JSONObject(this.f388572g);
            } catch (JSONException e) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", new Object[]{e.getMessage()}));
                this.f388572g = null;
                this.f388578m = new JSONObject();
            }
        } else {
            this.f388578m = new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakClipInfo)) {
            return false;
        }
        AdBreakClipInfo adBreakClipInfo = (AdBreakClipInfo) obj;
        return C143596v.m233278k(this.f388566a, adBreakClipInfo.f388566a) && C143596v.m233278k(this.f388567b, adBreakClipInfo.f388567b) && this.f388568c == adBreakClipInfo.f388568c && C143596v.m233278k(this.f388569d, adBreakClipInfo.f388569d) && C143596v.m233278k(this.f388570e, adBreakClipInfo.f388570e) && C143596v.m233278k(this.f388571f, adBreakClipInfo.f388571f) && C143596v.m233278k(this.f388572g, adBreakClipInfo.f388572g) && C143596v.m233278k(this.f388573h, adBreakClipInfo.f388573h) && C143596v.m233278k(this.f388574i, adBreakClipInfo.f388574i) && this.f388575j == adBreakClipInfo.f388575j && C143596v.m233278k(this.f388576k, adBreakClipInfo.f388576k) && C143596v.m233278k(this.f388577l, adBreakClipInfo.f388577l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f388566a, this.f388567b, Long.valueOf(this.f388568c), this.f388569d, this.f388570e, this.f388571f, this.f388572g, this.f388573h, this.f388574i, Long.valueOf(this.f388575j), this.f388576k, this.f388577l});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f388566a);
        C143947c.m234106y(parcel, 3, this.f388567b);
        C143947c.m234090i(parcel, 4, this.f388568c);
        C143947c.m234106y(parcel, 5, this.f388569d);
        C143947c.m234106y(parcel, 6, this.f388570e);
        C143947c.m234106y(parcel, 7, this.f388571f);
        C143947c.m234106y(parcel, 8, this.f388572g);
        C143947c.m234106y(parcel, 9, this.f388573h);
        C143947c.m234106y(parcel, 10, this.f388574i);
        C143947c.m234090i(parcel, 11, this.f388575j);
        C143947c.m234106y(parcel, 12, this.f388576k);
        C143947c.m234105x(parcel, 13, this.f388577l, i);
        C143947c.m234083b(parcel, a);
    }
}
