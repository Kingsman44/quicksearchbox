package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class PersonFieldMetadataEntity extends AbstractSafeParcelable implements PersonFieldMetadata {
    public static final Parcelable.Creator CREATOR = new C145695h();

    /* renamed from: a */
    public final Integer f393963a;

    /* renamed from: b */
    public final Boolean f393964b;

    public PersonFieldMetadataEntity(Integer num, Boolean bool) {
        this.f393963a = num;
        this.f393964b = bool;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final Boolean mo121780b() {
        return this.f393964b;
    }

    /* renamed from: c */
    public final Integer mo121781c() {
        return this.f393963a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PersonFieldMetadata)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonFieldMetadata personFieldMetadata = (PersonFieldMetadata) obj;
        return C143912ba.m233950b(mo121781c(), personFieldMetadata.mo121781c()) && C143912ba.m233950b(mo121780b(), personFieldMetadata.mo121780b());
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo121781c(), mo121780b()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234101t(parcel, 3, this.f393963a);
        C143947c.m234092k(parcel, 4, this.f393964b);
        C143947c.m234083b(parcel, a);
    }
}
