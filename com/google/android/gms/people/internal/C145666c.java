package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.consentprimitive.ContactsConsentsStatus;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.people.internal.c */
/* compiled from: PG */
public abstract class C145666c extends C8849b implements C145667d {
    public C145666c() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 12) {
            parcel.readInt();
            SyncStatus syncStatus = (SyncStatus) C8850c.m23492a(parcel, SyncStatus.CREATOR);
            enforceNoDataAvail(parcel);
            return true;
        } else if (i == 15) {
            parcel.readInt();
            parcel.readString();
            enforceNoDataAvail(parcel);
            return true;
        } else if (i == 16) {
            parcel.readInt();
            MatrixCursorParcelable matrixCursorParcelable = (MatrixCursorParcelable) C8850c.m23492a(parcel, MatrixCursorParcelable.CREATOR);
            enforceNoDataAvail(parcel);
            return true;
        } else if (i == 18) {
            parcel.readInt();
            SyncStatus syncStatus2 = (SyncStatus) C8850c.m23492a(parcel, SyncStatus.CREATOR);
            enforceNoDataAvail(parcel);
            return true;
        } else if (i != 19) {
            switch (i) {
                case 1:
                    int readInt = parcel.readInt();
                    Bundle bundle = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    mo121713c(readInt, (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    enforceNoDataAvail(parcel);
                    mo121711a(parcel.readInt(), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR), (DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR));
                    return true;
                case 3:
                    parcel.readInt();
                    Bundle bundle2 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C8850c.m23492a(parcel, ParcelFileDescriptor.CREATOR);
                    enforceNoDataAvail(parcel);
                    mo121714d();
                    return true;
                case 4:
                    parcel.readInt();
                    Bundle bundle3 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                    DataHolder[] dataHolderArr = (DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR);
                    enforceNoDataAvail(parcel);
                    return true;
                case 5:
                    enforceNoDataAvail(parcel);
                    mo121712b(parcel.readInt(), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) C8850c.m23492a(parcel, ParcelFileDescriptor.CREATOR), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                    return true;
                case 6:
                    parcel.readInt();
                    BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity = (BackedUpContactsPerDeviceEntity) C8850c.m23492a(parcel, BackedUpContactsPerDeviceEntity.CREATOR);
                    enforceNoDataAvail(parcel);
                    return true;
                case 7:
                    parcel.readInt();
                    PersonEntity personEntity = (PersonEntity) C8850c.m23492a(parcel, PersonEntity.CREATOR);
                    enforceNoDataAvail(parcel);
                    return true;
                case 8:
                    parcel.readInt();
                    enforceNoDataAvail(parcel);
                    return true;
                default:
                    return false;
            }
        } else {
            Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
            ContactsConsentsStatus contactsConsentsStatus = (ContactsConsentsStatus) C8850c.m23492a(parcel, ContactsConsentsStatus.CREATOR);
            enforceNoDataAvail(parcel);
            return true;
        }
    }
}
