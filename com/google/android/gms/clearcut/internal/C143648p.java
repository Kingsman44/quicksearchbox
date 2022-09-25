package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.clearcut.internal.p */
/* compiled from: PG */
public abstract class C143648p extends C8849b implements C143649q {
    public C143648p() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                enforceNoDataAvail(parcel);
                mo118973b((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            case 2:
                Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                mo118978c();
                return true;
            case 3:
                Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                parcel.readLong();
                enforceNoDataAvail(parcel);
                mo118982g();
                return true;
            case 4:
                Status status3 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                mo118983h();
                return true;
            case 5:
                Status status4 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                parcel.readLong();
                enforceNoDataAvail(parcel);
                mo118979d();
                return true;
            case 6:
                Status status5 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                LogEventParcelable[] logEventParcelableArr = (LogEventParcelable[]) parcel.createTypedArray(LogEventParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                mo118980e();
                return true;
            case 7:
                DataHolder dataHolder = (DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR);
                enforceNoDataAvail(parcel);
                mo118981f();
                return true;
            case 8:
                enforceNoDataAvail(parcel);
                mo118972a((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
