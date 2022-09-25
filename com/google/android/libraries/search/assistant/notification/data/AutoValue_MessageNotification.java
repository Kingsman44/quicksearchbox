package com.google.android.libraries.search.assistant.notification.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* compiled from: PG */
final class AutoValue_MessageNotification extends C$AutoValue_MessageNotification {
    public static final Parcelable.Creator CREATOR = new C34886g();

    public AutoValue_MessageNotification(String str, String str2, Optional optional, Optional optional2, Optional optional3, boolean z, String str3, Optional optional4, Optional optional5, Optional optional6, C58485gu guVar, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, Optional optional13, Optional optional14, CharSequence charSequence, Optional optional15, Optional optional16) {
        super(str, str2, optional, optional2, optional3, z, str3, optional4, optional5, optional6, guVar, optional7, optional8, optional9, optional10, optional11, optional12, optional13, optional14, charSequence, optional15, optional16);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f92470a);
        parcel.writeString(this.f92471b);
        C34897r.m63755b(this.f92472c, parcel);
        C34896q.m63753a(this.f92473d, parcel);
        C34897r.m63755b(this.f92474e, parcel);
        parcel.writeInt(this.f92475f ? 1 : 0);
        parcel.writeString(this.f92476g);
        C34894o.m63750b(this.f92477h, parcel);
        C34894o.m63750b(this.f92478i, parcel);
        C34893n.m63748b(this.f92479j, parcel);
        parcel.writeStringList(this.f92480k);
        C34893n.m63748b(this.f92481l, parcel);
        C34896q.m63753a(this.f92482m, parcel);
        C34896q.m63753a(this.f92483n, parcel);
        Optional optional = this.f92484o;
        if (optional.isPresent()) {
            parcel.writeInt(((byte[]) optional.get()).length);
            parcel.writeByteArray((byte[]) optional.get());
        } else {
            parcel.writeInt(0);
        }
        C34896q.m63753a(this.f92485p, parcel);
        C34897r.m63755b(this.f92486q, parcel);
        C34896q.m63753a(this.f92487r, parcel);
        parcel.writeParcelable((Parcelable) this.f92488s.orElse(null), 0);
        TextUtils.writeToParcel(this.f92489t, parcel, 0);
        parcel.writeParcelable((Parcelable) this.f92490u.orElse(null), 0);
        parcel.writeParcelable((Parcelable) this.f92491v.orElse(null), 0);
    }
}
