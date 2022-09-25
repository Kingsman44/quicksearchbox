package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class NameEntity extends AbstractSafeParcelable implements Name {
    public static final Parcelable.Creator CREATOR = new C145693f();

    /* renamed from: a */
    public final PersonFieldMetadataEntity f393945a;

    /* renamed from: b */
    public final String f393946b;

    /* renamed from: c */
    public final String f393947c;

    /* renamed from: d */
    public final String f393948d;

    /* renamed from: e */
    public final String f393949e;

    /* renamed from: f */
    public final String f393950f;

    /* renamed from: g */
    public final String f393951g;

    public NameEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f393945a = personFieldMetadataEntity;
        this.f393946b = str;
        this.f393947c = str2;
        this.f393948d = str3;
        this.f393949e = str4;
        this.f393950f = str5;
        this.f393951g = str6;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final PersonFieldMetadata mo121761b() {
        return this.f393945a;
    }

    /* renamed from: c */
    public final String mo121762c() {
        return this.f393946b;
    }

    /* renamed from: d */
    public final String mo121763d() {
        return this.f393949e;
    }

    /* renamed from: e */
    public final String mo121764e() {
        return this.f393951g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Name)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Name name = (Name) obj;
        return C143912ba.m233950b(mo121761b(), name.mo121761b()) && C143912ba.m233950b(mo121762c(), name.mo121762c()) && C143912ba.m233950b(mo121767i(), name.mo121767i()) && C143912ba.m233950b(mo121765g(), name.mo121765g()) && C143912ba.m233950b(mo121763d(), name.mo121763d()) && C143912ba.m233950b(mo121766h(), name.mo121766h()) && C143912ba.m233950b(mo121764e(), name.mo121764e());
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: g */
    public final String mo121765g() {
        return this.f393948d;
    }

    /* renamed from: h */
    public final String mo121766h() {
        return this.f393950f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo121761b(), mo121762c(), mo121767i(), mo121765g(), mo121763d(), mo121766h(), mo121764e()});
    }

    /* renamed from: i */
    public final String mo121767i() {
        return this.f393947c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f393945a, i);
        C143947c.m234106y(parcel, 3, this.f393946b);
        C143947c.m234106y(parcel, 4, this.f393951g);
        C143947c.m234106y(parcel, 5, this.f393948d);
        C143947c.m234106y(parcel, 6, this.f393949e);
        C143947c.m234106y(parcel, 7, this.f393950f);
        C143947c.m234106y(parcel, 17, this.f393947c);
        C143947c.m234083b(parcel, a);
    }
}
