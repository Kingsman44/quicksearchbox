package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.corpora.e */
/* compiled from: PG */
public final class C145881e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Status status = null;
        RegisterCorpusInfo registerCorpusInfo = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) C143946b.m234063l(parcel, readInt, Status.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                registerCorpusInfo = (RegisterCorpusInfo) C143946b.m234063l(parcel, readInt, RegisterCorpusInfo.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetCorpusInfoCall$Response(status, registerCorpusInfo);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCorpusInfoCall$Response[i];
    }
}
