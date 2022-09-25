package com.google.android.gms.udc.p10875a;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.SettingState;
import com.google.android.gms.udc.UdcCacheResponse;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.udc.a.a */
/* compiled from: PG */
public abstract class C146048a extends C8849b implements C146049b {
    public C146048a() {
        super("com.google.android.gms.udc.internal.IUdcCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo122561k();
                return true;
            case 2:
                Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo122558h();
                return true;
            case 3:
                Status status3 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo122552b();
                return true;
            case 4:
                Status status4 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo122554d();
                return true;
            case 5:
                Status status5 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                parcel.createTypedArrayList(SettingState.CREATOR);
                enforceNoDataAvail(parcel);
                mo122553c();
                return true;
            case 6:
                Status status6 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) C8850c.m23492a(parcel, PendingIntent.CREATOR);
                enforceNoDataAvail(parcel);
                mo122559i();
                return true;
            case 7:
                Status status7 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                SettingDisplayInfo settingDisplayInfo = (SettingDisplayInfo) C8850c.m23492a(parcel, SettingDisplayInfo.CREATOR);
                PendingIntent pendingIntent2 = (PendingIntent) C8850c.m23492a(parcel, PendingIntent.CREATOR);
                enforceNoDataAvail(parcel);
                mo122560j();
                return true;
            case 8:
                enforceNoDataAvail(parcel);
                mo122551a((Status) C8850c.m23492a(parcel, Status.CREATOR), (UdcCacheResponse) C8850c.m23492a(parcel, UdcCacheResponse.CREATOR));
                return true;
            case 9:
                Status status8 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                mo122557g();
                return true;
            case 10:
                Status status9 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                DeviceDataUploadOptInFlags deviceDataUploadOptInFlags = (DeviceDataUploadOptInFlags) C8850c.m23492a(parcel, DeviceDataUploadOptInFlags.CREATOR);
                enforceNoDataAvail(parcel);
                mo122555e();
                return true;
            case 11:
                Status status10 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable = (DeviceDataUploadOptedInAccountsParcelable) C8850c.m23492a(parcel, DeviceDataUploadOptedInAccountsParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                mo122556f();
                return true;
            default:
                return false;
        }
    }
}
