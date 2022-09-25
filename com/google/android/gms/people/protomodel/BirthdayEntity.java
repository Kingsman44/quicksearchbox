package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class BirthdayEntity extends AbstractSafeParcelable implements Birthday {
    public static final Parcelable.Creator CREATOR = new C145689b();

    /* renamed from: a */
    public final PersonFieldMetadataEntity f393938a;

    /* renamed from: b */
    public final Long f393939b;

    public BirthdayEntity(PersonFieldMetadataEntity personFieldMetadataEntity, Long l) {
        this.f393938a = personFieldMetadataEntity;
        this.f393939b = l;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo121743b() {
        return this.f393938a;
    }

    /* renamed from: c */
    public final Long mo121744c() {
        return this.f393939b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Birthday)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Birthday birthday = (Birthday) obj;
        return C143912ba.m233950b(mo121743b(), birthday.mo121743b()) && C143912ba.m233950b(mo121744c(), birthday.mo121744c());
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo121743b(), mo121744c()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f393938a, i);
        C143947c.m234104w(parcel, 3, this.f393939b);
        C143947c.m234083b(parcel, a);
    }
}
