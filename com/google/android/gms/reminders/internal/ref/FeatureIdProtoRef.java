package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145837i;
import com.google.android.gms.reminders.model.FeatureIdProto;
import com.google.android.gms.reminders.model.FeatureIdProtoEntity;

/* compiled from: PG */
public class FeatureIdProtoRef extends C145815a implements FeatureIdProto {
    public FeatureIdProtoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: j */
    public static boolean m237187j(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo119320d(m237273v(str, "cell_id"), i, i2) && dataHolder.mo119320d(m237273v(str, "fprint"), i, i2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FeatureIdProto)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return FeatureIdProtoEntity.m237372c(this, (FeatureIdProto) obj);
    }

    /* renamed from: h */
    public final Long mo122007h() {
        return mo122099t(mo122100u("cell_id"));
    }

    public final int hashCode() {
        return FeatureIdProtoEntity.m237371b(this);
    }

    /* renamed from: i */
    public final Long mo122008i() {
        return mo122099t(mo122100u("fprint"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145837i.m237583a(new FeatureIdProtoEntity(this), parcel);
    }
}
