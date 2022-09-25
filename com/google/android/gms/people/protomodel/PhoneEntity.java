package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class PhoneEntity extends AbstractSafeParcelable implements Phone {
    public static final Parcelable.Creator CREATOR = new C145696i();

    /* renamed from: a */
    public final PersonFieldMetadataEntity f393965a;

    /* renamed from: b */
    public final String f393966b;

    /* renamed from: c */
    public final String f393967c;

    public PhoneEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2) {
        this.f393965a = personFieldMetadataEntity;
        this.f393966b = str;
        this.f393967c = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo121785b() {
        return this.f393965a;
    }

    /* renamed from: c */
    public final String mo121786c() {
        return this.f393967c;
    }

    /* renamed from: d */
    public final String mo121787d() {
        return this.f393966b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Phone)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Phone phone = (Phone) obj;
        return C143912ba.m233950b(mo121785b(), phone.mo121785b()) && C143912ba.m233950b(mo121787d(), phone.mo121787d()) && C143912ba.m233950b(mo121786c(), phone.mo121786c());
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo121785b(), mo121787d(), mo121786c()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f393965a, i);
        C143947c.m234106y(parcel, 3, this.f393966b);
        C143947c.m234106y(parcel, 4, this.f393967c);
        C143947c.m234083b(parcel, a);
    }
}
