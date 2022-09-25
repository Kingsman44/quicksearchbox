package com.google.android.apps.gsa.shared.proto.p7126io;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.libraries.gsa.util.C23338c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.shared.proto.io.a */
/* compiled from: PG */
final class C90448a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new LargeProtoParcelable(C23338c.m43773e(parcel));
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) LargeProtoParcelable.f252677a.mo56225c()).mo56382g(e)).mo56372aa(11013)).mo56386p("RemoteException while trying to read from parcel.");
            return new LargeProtoParcelable(new byte[0]);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LargeProtoParcelable[i];
    }
}
