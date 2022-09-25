package com.google.android.apps.gsa.shared.speech;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.shared.speech.f */
/* compiled from: PG */
final class C90575f implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        C90576g q = HotwordResultMetadata.m147623q();
        q.mo84632c(parcel.readFloat());
        q.mo84634e(parcel.readFloat());
        q.mo84635f(parcel.readFloat());
        q.mo84643n(parcel.readFloat());
        q.mo84644o(parcel.readLong());
        q.mo84673p(parcel.readInt());
        boolean z = true;
        q.mo84642m(parcel.readByte() != 0);
        q.mo84633d(parcel.readByte() != 0);
        C90508a aVar = (C90508a) q;
        aVar.f253063a = C58833ax.m90834k(parcel.readString());
        aVar.f253064b = C58833ax.m90834k(parcel.readString());
        q.mo84641l(parcel.readInt());
        q.mo84639j(parcel.readByte() != 0);
        q.mo84636g(parcel.readByte() != 0);
        q.mo84638i(parcel.readByte() != 0);
        if (parcel.readByte() == 0) {
            z = false;
        }
        q.mo84637h(z);
        q.mo84640k(parcel.readLong());
        return q.mo84630a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HotwordResultMetadata[i];
    }
}
