package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Address;
import com.google.android.gms.reminders.model.AddressEntity;
import com.google.android.gms.reminders.model.C145820a;

/* compiled from: PG */
public class AddressRef extends C145815a implements Address {
    public AddressRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: p */
    public static boolean m237149p(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo119320d(m237273v(str, "country"), i, i2) && dataHolder.mo119320d(m237273v(str, "locality"), i, i2) && dataHolder.mo119320d(m237273v(str, "region"), i, i2) && dataHolder.mo119320d(m237273v(str, "street_address"), i, i2) && dataHolder.mo119320d(m237273v(str, "street_number"), i, i2) && dataHolder.mo119320d(m237273v(str, "street_name"), i, i2) && dataHolder.mo119320d(m237273v(str, "postal_code"), i, i2) && dataHolder.mo119320d(m237273v(str, "name"), i, i2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AddressEntity.m237300c(this, (Address) obj);
    }

    /* renamed from: h */
    public final String mo121968h() {
        return mo119337kv(mo122100u("country"));
    }

    public final int hashCode() {
        return AddressEntity.m237299b(this);
    }

    /* renamed from: i */
    public final String mo121969i() {
        return mo119337kv(mo122100u("locality"));
    }

    /* renamed from: j */
    public final String mo121970j() {
        return mo119337kv(mo122100u("name"));
    }

    /* renamed from: k */
    public final String mo121971k() {
        return mo119337kv(mo122100u("postal_code"));
    }

    /* renamed from: l */
    public final String mo121972l() {
        return mo119337kv(mo122100u("region"));
    }

    /* renamed from: m */
    public final String mo121973m() {
        return mo119337kv(mo122100u("street_address"));
    }

    /* renamed from: n */
    public final String mo121974n() {
        return mo119337kv(mo122100u("street_name"));
    }

    /* renamed from: o */
    public final String mo121975o() {
        return mo119337kv(mo122100u("street_number"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145820a.m237556a(new AddressEntity(this), parcel);
    }
}
