package com.google.android.gms.reminders.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.reminders.internal.d */
/* compiled from: PG */
public abstract class C145807d extends C8849b implements C145808e {
    public C145807d() {
        super("com.google.android.gms.reminders.internal.IRemindersListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            TaskEntity taskEntity = (TaskEntity) C8850c.m23492a(parcel, TaskEntity.CREATOR);
            enforceNoDataAvail(parcel);
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo121957a((DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR));
        } else if (i == 3) {
            enforceNoDataAvail(parcel);
            mo121958b((DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo121959c((DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
