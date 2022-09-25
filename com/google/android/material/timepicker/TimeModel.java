package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.googlequicksearchbox.R;
import java.util.Arrays;

/* compiled from: PG */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C44994r();

    /* renamed from: a */
    public final C44990n f117511a;

    /* renamed from: b */
    public final C44990n f117512b;

    /* renamed from: c */
    final int f117513c;

    /* renamed from: d */
    int f117514d;

    /* renamed from: e */
    public int f117515e;

    /* renamed from: f */
    int f117516f;

    /* renamed from: g */
    int f117517g;

    public TimeModel() {
        this(0);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f117514d = i;
        this.f117515e = i2;
        this.f117516f = i3;
        this.f117513c = i4;
        this.f117517g = m79950g(i);
        this.f117511a = new C44990n(59);
        this.f117512b = new C44990n(i4 == 1 ? 24 : 12);
    }

    /* renamed from: c */
    public static String m79949c(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    /* renamed from: g */
    private static int m79950g(int i) {
        return i >= 12 ? 1 : 0;
    }

    /* renamed from: a */
    public final int mo48628a() {
        return this.f117513c == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
    }

    /* renamed from: b */
    public final int mo48629b() {
        if (this.f117513c == 1) {
            return this.f117514d % 24;
        }
        int i = this.f117514d;
        if (i % 12 == 0) {
            return 12;
        }
        return this.f117517g == 1 ? i - 12 : i;
    }

    /* renamed from: d */
    public final void mo48630d(int i) {
        if (this.f117513c == 1) {
            this.f117514d = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (1 != this.f117517g) {
            i2 = 0;
        }
        this.f117514d = i3 + i2;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo48632e(int i) {
        this.f117517g = m79950g(i);
        this.f117514d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f117514d == timeModel.f117514d && this.f117515e == timeModel.f117515e && this.f117513c == timeModel.f117513c && this.f117516f == timeModel.f117516f;
    }

    /* renamed from: f */
    public final void mo48634f(int i) {
        int i2;
        if (i != this.f117517g) {
            this.f117517g = i;
            int i3 = this.f117514d;
            if (i3 < 12 && i == 1) {
                i2 = i3 + 12;
            } else if (i3 >= 12 && i == 0) {
                i2 = i3 - 12;
            } else {
                return;
            }
            this.f117514d = i2;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f117513c), Integer.valueOf(this.f117514d), Integer.valueOf(this.f117515e), Integer.valueOf(this.f117516f)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f117514d);
        parcel.writeInt(this.f117515e);
        parcel.writeInt(this.f117516f);
        parcel.writeInt(this.f117513c);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }
}
