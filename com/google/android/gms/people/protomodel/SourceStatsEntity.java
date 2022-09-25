package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class SourceStatsEntity extends AbstractSafeParcelable implements SourceStats {
    public static final Parcelable.Creator CREATOR = new C145698k();

    /* renamed from: a */
    public final String f393970a;

    /* renamed from: b */
    public final Integer f393971b;

    /* renamed from: c */
    public final Integer f393972c;

    public SourceStatsEntity(String str, Integer num, Integer num2) {
        this.f393970a = str;
        this.f393971b = num;
        this.f393972c = num2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final Integer mo121796b() {
        return this.f393971b;
    }

    /* renamed from: c */
    public final Integer mo121797c() {
        return this.f393972c;
    }

    /* renamed from: d */
    public final String mo121798d() {
        return this.f393970a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SourceStats)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SourceStats sourceStats = (SourceStats) obj;
        return C143912ba.m233950b(mo121798d(), sourceStats.mo121798d()) && C143912ba.m233950b(mo121796b(), sourceStats.mo121796b()) && C143912ba.m233950b(mo121797c(), sourceStats.mo121797c());
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo121798d(), mo121796b(), mo121797c()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f393970a);
        C143947c.m234101t(parcel, 3, this.f393971b);
        C143947c.m234101t(parcel, 4, this.f393972c);
        C143947c.m234083b(parcel, a);
    }
}
