package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.p3269d.p3270a.C41937l;
import com.google.android.libraries.social.populous.android.p3287a.C42162a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.social.populous.core.de */
/* compiled from: PG */
final class C42333de implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Class<ContactMethodField[]> cls = ContactMethodField[].class;
        Class<ContactMethodField[]> cls2 = ContactMethodField[].class;
        Class<ContactMethodField[]> cls3 = ContactMethodField[].class;
        Class<ContactMethodField[]> cls4 = ContactMethodField[].class;
        return new SessionContext(C42162a.m74085i(parcel), C42162a.m74085i(parcel), C42162a.m74085i(parcel), C42162a.m74085i(parcel), C42162a.m74077a(parcel, C41937l.f109440ao), C58833ax.m90833j((Parcelable) parcel.readTypedObject(TypeLimits.CREATOR)), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() == 1 ? Long.valueOf(parcel.readLong()) : null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SessionContext[i];
    }
}
