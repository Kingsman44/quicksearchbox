package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145840l;
import com.google.android.gms.reminders.model.CategoryInfo;
import com.google.android.gms.reminders.model.ChainInfo;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.LocationGroupEntity;

/* compiled from: PG */
public class LocationGroupRef extends C145815a implements LocationGroup {

    /* renamed from: f */
    private boolean f394189f = false;

    /* renamed from: g */
    private ChainInfoRef f394190g;

    /* renamed from: h */
    private boolean f394191h = false;

    /* renamed from: i */
    private CategoryInfoRef f394192i;

    public LocationGroupRef(DataHolder dataHolder, int i, String str) {
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
        if (!(obj instanceof LocationGroup)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return LocationGroupEntity.m237404c(this, (LocationGroup) obj);
    }

    /* renamed from: h */
    public final CategoryInfo mo122011h() {
        if (!this.f394191h) {
            this.f394191h = true;
            if (CategoryInfoRef.m237159k(this.f389974a, this.f389975b, this.f394234e, this.f394233d)) {
                this.f394192i = null;
            } else {
                this.f394192i = new CategoryInfoRef(this.f389974a, this.f389975b, this.f394233d);
            }
        }
        return this.f394192i;
    }

    public final int hashCode() {
        return LocationGroupEntity.m237403b(this);
    }

    /* renamed from: i */
    public final ChainInfo mo122012i() {
        if (!this.f394189f) {
            this.f394189f = true;
            if (ChainInfoRef.m237164j(this.f389974a, this.f389975b, this.f394234e, this.f394233d)) {
                this.f394190g = null;
            } else {
                this.f394190g = new ChainInfoRef(this.f389974a, this.f389975b, this.f394233d);
            }
        }
        return this.f394190g;
    }

    /* renamed from: j */
    public final Integer mo122013j() {
        return mo122098s(mo122100u("location_query_type"));
    }

    /* renamed from: k */
    public final String mo122014k() {
        return mo119337kv(mo122100u("location_query"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145840l.m237587a(new LocationGroupEntity(this), parcel, i);
    }
}
