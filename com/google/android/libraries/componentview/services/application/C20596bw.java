package com.google.android.libraries.componentview.services.application;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.componentview.services.application.bw */
/* compiled from: PG */
final class C20596bw implements Parcelable.Creator {
    /* renamed from: a */
    private static final String m38636a(String str) {
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C20613d dVar = new C20613d();
        dVar.f57814a = m38636a(parcel.readString());
        dVar.f57815b = m38636a(parcel.readString());
        dVar.f57816c = parcel.readString();
        dVar.f57817d = parcel.readString();
        dVar.f57818e = parcel.readString();
        dVar.f57819f = parcel.readString();
        dVar.f57820g = (Long) parcel.readValue((ClassLoader) null);
        return dVar.mo25528a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LogData[i];
    }
}
