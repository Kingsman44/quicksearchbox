package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.p1730f.p1731a.C21375e;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.common.o */
/* compiled from: PG */
final class C90434o implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        C90435p pVar = new C90435p(new C21375e());
        C90421b.m147093d(parcel, pVar);
        pVar.f252646r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        pVar.f252645q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        return new StandardNotification(pVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StandardNotification[i];
    }
}
