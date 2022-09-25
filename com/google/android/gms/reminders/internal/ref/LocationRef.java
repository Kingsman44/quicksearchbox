package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Address;
import com.google.android.gms.reminders.model.C145839k;
import com.google.android.gms.reminders.model.FeatureIdProto;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationEntity;

/* compiled from: PG */
public class LocationRef extends C145815a implements Location {

    /* renamed from: f */
    private boolean f394193f = false;

    /* renamed from: g */
    private FeatureIdProtoRef f394194g;

    /* renamed from: h */
    private boolean f394195h = false;

    /* renamed from: i */
    private AddressRef f394196i;

    public LocationRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Location)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return LocationEntity.m237387c(this, (Location) obj);
    }

    /* renamed from: h */
    public final Address mo122017h() {
        if (!this.f394195h) {
            this.f394195h = true;
            if (AddressRef.m237149p(this.f389974a, this.f389975b, this.f394234e, this.f394233d.concat("address_"))) {
                this.f394196i = null;
            } else {
                this.f394196i = new AddressRef(this.f389974a, this.f389975b, this.f394233d.concat("address_"));
            }
        }
        return this.f394196i;
    }

    public final int hashCode() {
        return LocationEntity.m237386b(this);
    }

    /* renamed from: i */
    public final FeatureIdProto mo122018i() {
        if (!this.f394193f) {
            this.f394193f = true;
            if (FeatureIdProtoRef.m237187j(this.f389974a, this.f389975b, this.f394234e, this.f394233d.concat("location_"))) {
                this.f394194g = null;
            } else {
                this.f394194g = new FeatureIdProtoRef(this.f389974a, this.f389975b, this.f394233d.concat("location_"));
            }
        }
        return this.f394194g;
    }

    /* renamed from: j */
    public final Double mo122019j() {
        return mo122097r(mo122100u("lat"));
    }

    /* renamed from: k */
    public final Double mo122020k() {
        return mo122097r(mo122100u("lng"));
    }

    /* renamed from: l */
    public final Integer mo122021l() {
        return mo122098s(mo122100u("location_type"));
    }

    /* renamed from: m */
    public final Integer mo122022m() {
        return mo122098s(mo122100u("radius_meters"));
    }

    /* renamed from: n */
    public final String mo122023n() {
        return mo119337kv(mo122100u("display_address"));
    }

    /* renamed from: o */
    public final String mo122024o() {
        return mo119337kv(mo122100u("location_alias_id"));
    }

    /* renamed from: p */
    public final String mo122025p() {
        return mo119337kv(mo122100u("name"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145839k.m237586a(new LocationEntity(this), parcel, i);
    }
}
