package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.C145836h;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.ExternalApplicationLinkEntity;

/* compiled from: PG */
public class ExternalApplicationLinkRef extends C145815a implements ExternalApplicationLink {
    public ExternalApplicationLinkRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExternalApplicationLink)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return ExternalApplicationLinkEntity.m237364c(this, (ExternalApplicationLink) obj);
    }

    /* renamed from: h */
    public final Integer mo122003h() {
        return mo122098s(mo122100u("link_application"));
    }

    public final int hashCode() {
        return ExternalApplicationLinkEntity.m237363b(this);
    }

    /* renamed from: i */
    public final String mo122004i() {
        return mo119337kv(mo122100u("link_id"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145836h.m237582a(new ExternalApplicationLinkEntity(this), parcel);
    }
}
