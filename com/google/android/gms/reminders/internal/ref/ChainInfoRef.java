package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145831c;
import com.google.android.gms.reminders.model.ChainInfo;
import com.google.android.gms.reminders.model.ChainInfoEntity;
import com.google.android.gms.reminders.model.FeatureIdProto;

/* compiled from: PG */
public class ChainInfoRef extends C145815a implements ChainInfo {

    /* renamed from: f */
    private boolean f394183f = false;

    /* renamed from: g */
    private FeatureIdProtoRef f394184g;

    public ChainInfoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: j */
    public static boolean m237164j(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo119320d(m237273v(str, "chain_name"), i, i2) && FeatureIdProtoRef.m237187j(dataHolder, i, i2, str.concat("chain_id_"));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ChainInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return ChainInfoEntity.m237324c(this, (ChainInfo) obj);
    }

    /* renamed from: h */
    public final FeatureIdProto mo121983h() {
        if (!this.f394183f) {
            this.f394183f = true;
            if (FeatureIdProtoRef.m237187j(this.f389974a, this.f389975b, this.f394234e, this.f394233d.concat("chain_id_"))) {
                this.f394184g = null;
            } else {
                this.f394184g = new FeatureIdProtoRef(this.f389974a, this.f389975b, this.f394233d.concat("chain_id_"));
            }
        }
        return this.f394184g;
    }

    public final int hashCode() {
        return ChainInfoEntity.m237323b(this);
    }

    /* renamed from: i */
    public final String mo121984i() {
        return mo119337kv(mo122100u("chain_name"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145831c.m237576a(new ChainInfoEntity(this), parcel, i);
    }
}
