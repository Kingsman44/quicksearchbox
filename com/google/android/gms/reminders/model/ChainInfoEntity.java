package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: PG */
public class ChainInfoEntity extends AbstractSafeParcelable implements ChainInfo {
    public static final Parcelable.Creator CREATOR = new C145831c();

    /* renamed from: a */
    public final String f394256a;

    /* renamed from: b */
    public final FeatureIdProtoEntity f394257b;

    public ChainInfoEntity(ChainInfo chainInfo) {
        this(chainInfo.mo121984i(), chainInfo.mo121983h(), false);
    }

    public ChainInfoEntity(String str, FeatureIdProtoEntity featureIdProtoEntity) {
        this.f394256a = str;
        this.f394257b = featureIdProtoEntity;
    }

    /* renamed from: b */
    public static int m237323b(ChainInfo chainInfo) {
        return Arrays.hashCode(new Object[]{chainInfo.mo121984i(), chainInfo.mo121983h()});
    }

    /* renamed from: c */
    public static boolean m237324c(ChainInfo chainInfo, ChainInfo chainInfo2) {
        return C143912ba.m233950b(chainInfo.mo121984i(), chainInfo2.mo121984i()) && C143912ba.m233950b(chainInfo.mo121983h(), chainInfo2.mo121983h());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ChainInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return m237324c(this, (ChainInfo) obj);
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: h */
    public final FeatureIdProto mo121983h() {
        return this.f394257b;
    }

    public final int hashCode() {
        return m237323b(this);
    }

    /* renamed from: i */
    public final String mo121984i() {
        return this.f394256a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145831c.m237576a(this, parcel, i);
    }

    public ChainInfoEntity(String str, FeatureIdProto featureIdProto, boolean z) {
        FeatureIdProtoEntity featureIdProtoEntity;
        this.f394256a = str;
        if (z) {
            this.f394257b = (FeatureIdProtoEntity) featureIdProto;
            return;
        }
        if (featureIdProto == null) {
            featureIdProtoEntity = null;
        } else {
            featureIdProtoEntity = new FeatureIdProtoEntity(featureIdProto);
        }
        this.f394257b = featureIdProtoEntity;
    }
}
