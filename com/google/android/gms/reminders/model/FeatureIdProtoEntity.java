package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class FeatureIdProtoEntity extends AbstractSafeParcelable implements FeatureIdProto {
    public static final Parcelable.Creator CREATOR = new C145837i();

    /* renamed from: a */
    public final Long f394272a;

    /* renamed from: b */
    public final Long f394273b;

    public FeatureIdProtoEntity(FeatureIdProto featureIdProto) {
        this(featureIdProto.mo122007h(), featureIdProto.mo122008i());
    }

    public FeatureIdProtoEntity(Long l, Long l2) {
        this.f394272a = l;
        this.f394273b = l2;
    }

    /* renamed from: b */
    public static int m237371b(FeatureIdProto featureIdProto) {
        return Arrays.hashCode(new Object[]{featureIdProto.mo122007h(), featureIdProto.mo122008i()});
    }

    /* renamed from: c */
    public static boolean m237372c(FeatureIdProto featureIdProto, FeatureIdProto featureIdProto2) {
        return C143912ba.m233950b(featureIdProto.mo122007h(), featureIdProto2.mo122007h()) && C143912ba.m233950b(featureIdProto.mo122008i(), featureIdProto2.mo122008i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FeatureIdProto)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237372c(this, (FeatureIdProto) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final Long mo122007h() {
        return this.f394272a;
    }

    public final int hashCode() {
        return m237371b(this);
    }

    /* renamed from: i */
    public final Long mo122008i() {
        return this.f394273b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145837i.m237583a(this, parcel);
    }
}
