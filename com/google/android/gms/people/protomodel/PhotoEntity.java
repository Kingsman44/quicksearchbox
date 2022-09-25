package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class PhotoEntity extends AbstractSafeParcelable implements Photo {
    public static final Parcelable.Creator CREATOR = new C145697j();

    /* renamed from: a */
    public final PersonFieldMetadataEntity f393968a;

    /* renamed from: b */
    public final String f393969b;

    public PhotoEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str) {
        this.f393968a = personFieldMetadataEntity;
        this.f393969b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo121791b() {
        return this.f393968a;
    }

    /* renamed from: c */
    public final String mo121792c() {
        return this.f393969b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Photo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Photo photo = (Photo) obj;
        return C143912ba.m233950b(mo121791b(), photo.mo121791b()) && C143912ba.m233950b(mo121792c(), photo.mo121792c());
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo121791b(), mo121792c()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f393968a, i);
        C143947c.m234106y(parcel, 3, this.f393969b);
        C143947c.m234083b(parcel, a);
    }
}
