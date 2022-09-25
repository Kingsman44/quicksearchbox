package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.componentview.services.application.LogData;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.a */
/* compiled from: PG */
final class C84120a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C84128c cVar = new C84128c();
        cVar.mo77557b((LogData) LogData.CREATOR.createFromParcel(parcel));
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        cVar.mo77558c(z);
        return cVar.mo77556a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AgsaLogData[i];
    }
}
