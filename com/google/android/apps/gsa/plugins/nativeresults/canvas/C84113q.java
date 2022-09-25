package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.libraries.gsa.util.ParcelableBinder;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.q */
/* compiled from: PG */
public final class C84113q {
    /* renamed from: a */
    static /* synthetic */ void m134043a(C84112p pVar, ServiceEventData serviceEventData) {
        Parcelable b = serviceEventData.mo81912b(Parcelable.class);
        Parcel obtain = Parcel.obtain();
        b.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        pVar.f229040a.mo57356n(((ParcelableBinder) ParcelableBinder.CREATOR.createFromParcel(obtain)).f63870a);
        obtain.recycle();
    }
}
