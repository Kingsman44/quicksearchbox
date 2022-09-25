package com.google.android.gms.reminders.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.AccountState;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.reminders.internal.b */
/* compiled from: PG */
public abstract class C145805b extends C8849b implements C145806c {
    public C145805b() {
        super("com.google.android.gms.reminders.internal.IRemindersCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                enforceNoDataAvail(parcel);
                mo121955a((DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR), (Status) C8850c.m23492a(parcel, Status.CREATOR));
                break;
            case 2:
                enforceNoDataAvail(parcel);
                mo121956b((Status) C8850c.m23492a(parcel, Status.CREATOR));
                break;
            case 3:
                break;
            case 4:
                DataHolder dataHolder = (DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR);
                enforceNoDataAvail(parcel);
                break;
            case 5:
                C8850c.m23500i(parcel);
                Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                break;
            case 6:
                parcel.readString();
                parcel.readString();
                enforceNoDataAvail(parcel);
                break;
            case 7:
                AccountState accountState = (AccountState) C8850c.m23492a(parcel, AccountState.CREATOR);
                Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                break;
            case 8:
                DataHolder dataHolder2 = (DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR);
                enforceNoDataAvail(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
