package com.google.android.apps.gsa.search.shared.inappwebpage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4522b.C58526ih;

/* renamed from: com.google.android.apps.gsa.search.shared.inappwebpage.b */
/* compiled from: PG */
final class C87575b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Uri uri = (Uri) parcel.readParcelable(getClass().getClassLoader());
        int readInt = parcel.readInt();
        C58526ih ihVar = new C58526ih();
        for (int i = 0; i < readInt; i++) {
            ihVar.mo55373c(parcel.readString());
        }
        return new Request(uri, ihVar.mo55486f(), (Query) parcel.readParcelable(getClass().getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Request[i];
    }
}
