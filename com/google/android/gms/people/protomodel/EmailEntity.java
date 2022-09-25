package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class EmailEntity extends AbstractSafeParcelable implements Email {
    public static final Parcelable.Creator CREATOR = new C145691d();

    /* renamed from: a */
    public final PersonFieldMetadataEntity f393941a;

    /* renamed from: b */
    public final String f393942b;

    public EmailEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str) {
        this.f393941a = personFieldMetadataEntity;
        this.f393942b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo121752b() {
        return this.f393941a;
    }

    /* renamed from: c */
    public final String mo121753c() {
        return this.f393942b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Email)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Email email = (Email) obj;
        return C143912ba.m233950b(mo121752b(), email.mo121752b()) && C143912ba.m233950b(mo121753c(), email.mo121753c());
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo121752b(), mo121753c()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f393941a, i);
        C143947c.m234106y(parcel, 3, this.f393942b);
        C143947c.m234083b(parcel, a);
    }
}
