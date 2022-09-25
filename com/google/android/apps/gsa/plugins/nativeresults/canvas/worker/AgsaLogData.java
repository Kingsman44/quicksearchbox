package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.componentview.services.application.LogData;

/* compiled from: PG */
public abstract class AgsaLogData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C84120a();

    /* renamed from: a */
    public abstract LogData mo77540a();

    /* renamed from: b */
    public abstract boolean mo77541b();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mo77540a().writeToParcel(parcel, i);
        parcel.writeByte(mo77541b() ? (byte) 1 : 0);
    }
}
