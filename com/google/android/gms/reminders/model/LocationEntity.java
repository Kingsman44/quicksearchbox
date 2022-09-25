package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class LocationEntity extends AbstractSafeParcelable implements Location {
    public static final Parcelable.Creator CREATOR = new C145839k();

    /* renamed from: a */
    public final Double f394274a;

    /* renamed from: b */
    public final Double f394275b;

    /* renamed from: c */
    public final String f394276c;

    /* renamed from: d */
    public final Integer f394277d;

    /* renamed from: e */
    public final Integer f394278e;

    /* renamed from: f */
    public final FeatureIdProtoEntity f394279f;

    /* renamed from: g */
    public final String f394280g;

    /* renamed from: h */
    public final AddressEntity f394281h;

    /* renamed from: i */
    public final String f394282i;

    public LocationEntity(Location location) {
        this(location.mo122019j(), location.mo122020k(), location.mo122025p(), location.mo122022m(), location.mo122021l(), location.mo122018i(), location.mo122023n(), location.mo122017h(), location.mo122024o(), false);
    }

    public LocationEntity(Double d, Double d2, String str, Integer num, Integer num2, FeatureIdProtoEntity featureIdProtoEntity, String str2, AddressEntity addressEntity, String str3) {
        this.f394274a = d;
        this.f394275b = d2;
        this.f394276c = str;
        this.f394277d = num;
        this.f394278e = num2;
        this.f394279f = featureIdProtoEntity;
        this.f394280g = str2;
        this.f394281h = addressEntity;
        this.f394282i = str3;
    }

    /* renamed from: b */
    public static int m237386b(Location location) {
        return Arrays.hashCode(new Object[]{location.mo122019j(), location.mo122020k(), location.mo122025p(), location.mo122022m(), location.mo122021l(), location.mo122018i(), location.mo122023n(), location.mo122017h(), location.mo122024o()});
    }

    /* renamed from: c */
    public static boolean m237387c(Location location, Location location2) {
        return C143912ba.m233950b(location.mo122019j(), location2.mo122019j()) && C143912ba.m233950b(location.mo122020k(), location2.mo122020k()) && C143912ba.m233950b(location.mo122025p(), location2.mo122025p()) && C143912ba.m233950b(location.mo122022m(), location2.mo122022m()) && C143912ba.m233950b(location.mo122021l(), location2.mo122021l()) && C143912ba.m233950b(location.mo122018i(), location2.mo122018i()) && C143912ba.m233950b(location.mo122023n(), location2.mo122023n()) && C143912ba.m233950b(location.mo122017h(), location2.mo122017h()) && C143912ba.m233950b(location.mo122024o(), location2.mo122024o());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Location)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237387c(this, (Location) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final Address mo122017h() {
        return this.f394281h;
    }

    public final int hashCode() {
        return m237386b(this);
    }

    /* renamed from: i */
    public final FeatureIdProto mo122018i() {
        return this.f394279f;
    }

    /* renamed from: j */
    public final Double mo122019j() {
        return this.f394274a;
    }

    /* renamed from: k */
    public final Double mo122020k() {
        return this.f394275b;
    }

    /* renamed from: l */
    public final Integer mo122021l() {
        return this.f394278e;
    }

    /* renamed from: m */
    public final Integer mo122022m() {
        return this.f394277d;
    }

    /* renamed from: n */
    public final String mo122023n() {
        return this.f394280g;
    }

    /* renamed from: o */
    public final String mo122024o() {
        return this.f394282i;
    }

    /* renamed from: p */
    public final String mo122025p() {
        return this.f394276c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145839k.m237586a(this, parcel, i);
    }

    public LocationEntity(Double d, Double d2, String str, Integer num, Integer num2, FeatureIdProto featureIdProto, String str2, Address address, String str3, boolean z) {
        FeatureIdProtoEntity featureIdProtoEntity;
        this.f394274a = d;
        this.f394275b = d2;
        this.f394276c = str;
        this.f394277d = num;
        this.f394278e = num2;
        this.f394280g = str2;
        this.f394282i = str3;
        if (z) {
            this.f394279f = (FeatureIdProtoEntity) featureIdProto;
            this.f394281h = (AddressEntity) address;
            return;
        }
        AddressEntity addressEntity = null;
        if (featureIdProto == null) {
            featureIdProtoEntity = null;
        } else {
            featureIdProtoEntity = new FeatureIdProtoEntity(featureIdProto);
        }
        this.f394279f = featureIdProtoEntity;
        this.f394281h = address != null ? new AddressEntity(address) : addressEntity;
    }
}
