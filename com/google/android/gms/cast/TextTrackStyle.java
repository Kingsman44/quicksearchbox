package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.util.C144012l;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
public final class TextTrackStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143373bd();

    /* renamed from: a */
    public float f388736a;

    /* renamed from: b */
    public int f388737b;

    /* renamed from: c */
    public int f388738c;

    /* renamed from: d */
    public int f388739d;

    /* renamed from: e */
    public int f388740e;

    /* renamed from: f */
    public int f388741f;

    /* renamed from: g */
    public int f388742g;

    /* renamed from: h */
    public int f388743h;

    /* renamed from: i */
    public String f388744i;

    /* renamed from: j */
    public int f388745j;

    /* renamed from: k */
    public int f388746k;

    /* renamed from: l */
    String f388747l;

    /* renamed from: m */
    public JSONObject f388748m;

    public TextTrackStyle() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, (String) null, -1, -1, (String) null);
    }

    /* renamed from: a */
    public static final int m232581a(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static final String m232582b(int i) {
        return String.format("#%02X%02X%02X%02X", new Object[]{Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTrackStyle)) {
            return false;
        }
        TextTrackStyle textTrackStyle = (TextTrackStyle) obj;
        JSONObject jSONObject = this.f388748m;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = textTrackStyle.f388748m;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || C144012l.m234191a(jSONObject, jSONObject2)) && this.f388736a == textTrackStyle.f388736a && this.f388737b == textTrackStyle.f388737b && this.f388738c == textTrackStyle.f388738c && this.f388739d == textTrackStyle.f388739d && this.f388740e == textTrackStyle.f388740e && this.f388741f == textTrackStyle.f388741f && this.f388742g == textTrackStyle.f388742g && this.f388743h == textTrackStyle.f388743h && C143596v.m233278k(this.f388744i, textTrackStyle.f388744i) && this.f388745j == textTrackStyle.f388745j && this.f388746k == textTrackStyle.f388746k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f388736a), Integer.valueOf(this.f388737b), Integer.valueOf(this.f388738c), Integer.valueOf(this.f388739d), Integer.valueOf(this.f388740e), Integer.valueOf(this.f388741f), Integer.valueOf(this.f388742g), Integer.valueOf(this.f388743h), this.f388744i, Integer.valueOf(this.f388745j), Integer.valueOf(this.f388746k), String.valueOf(this.f388748m)});
    }

    public TextTrackStyle(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.f388736a = f;
        this.f388737b = i;
        this.f388738c = i2;
        this.f388739d = i3;
        this.f388740e = i4;
        this.f388741f = i5;
        this.f388742g = i6;
        this.f388743h = i7;
        this.f388744i = str;
        this.f388745j = i8;
        this.f388746k = i9;
        this.f388747l = str2;
        if (str2 != null) {
            try {
                this.f388748m = new JSONObject(this.f388747l);
            } catch (JSONException unused) {
                this.f388748m = null;
                this.f388747l = null;
            }
        } else {
            this.f388748m = null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f388748m;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f388747l = str;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234087f(parcel, 2, this.f388736a);
        C143947c.m234089h(parcel, 3, this.f388737b);
        C143947c.m234089h(parcel, 4, this.f388738c);
        C143947c.m234089h(parcel, 5, this.f388739d);
        C143947c.m234089h(parcel, 6, this.f388740e);
        C143947c.m234089h(parcel, 7, this.f388741f);
        C143947c.m234089h(parcel, 8, this.f388742g);
        C143947c.m234089h(parcel, 9, this.f388743h);
        C143947c.m234106y(parcel, 10, this.f388744i);
        C143947c.m234089h(parcel, 11, this.f388745j);
        C143947c.m234089h(parcel, 12, this.f388746k);
        C143947c.m234106y(parcel, 13, this.f388747l);
        C143947c.m234083b(parcel, a);
    }
}
