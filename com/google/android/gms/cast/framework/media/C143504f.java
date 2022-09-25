package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.media.f */
/* compiled from: PG */
public final class C143504f extends C8848a implements C143505g {
    public C143504f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    /* renamed from: e */
    public final List mo118803e() {
        Parcel gT = mo17261gT(3, mo17260gA());
        ArrayList createTypedArrayList = gT.createTypedArrayList(NotificationAction.CREATOR);
        gT.recycle();
        return createTypedArrayList;
    }

    /* renamed from: f */
    public final int[] mo118804f() {
        Parcel gT = mo17261gT(4, mo17260gA());
        int[] createIntArray = gT.createIntArray();
        gT.recycle();
        return createIntArray;
    }
}
