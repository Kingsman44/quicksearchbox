package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p10793f.C144163h;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.training.h */
/* compiled from: PG */
public abstract class C144804h extends C8849b implements C144805i {
    public C144804h() {
        super("com.google.android.gms.learning.internal.training.IInAppJobService");
    }

    public static C144805i asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppJobService");
        return queryLocalInterface instanceof C144805i ? (C144805i) queryLocalInterface : new C144803g(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C144165j jVar;
        switch (i) {
            case 2:
                onDestroy();
                parcel2.writeNoException();
                return true;
            case 3:
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTrimMemory(readInt);
                parcel2.writeNoException();
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                int onStartCommand = onStartCommand((Intent) C8850c.m23492a(parcel, Intent.CREATOR), readInt2, readInt3);
                parcel2.writeNoException();
                parcel2.writeInt(onStartCommand);
                return true;
            case 5:
                enforceNoDataAvail(parcel);
                boolean onUnbind = onUnbind((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, onUnbind);
                return true;
            case 6:
                enforceNoDataAvail(parcel);
                onRebind((Intent) C8850c.m23492a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                enforceNoDataAvail(parcel);
                boolean onStartJob = onStartJob((JobParameters) C8850c.m23492a(parcel, JobParameters.CREATOR));
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, onStartJob);
                return true;
            case 8:
                enforceNoDataAvail(parcel);
                boolean onStopJob = onStopJob((JobParameters) C8850c.m23492a(parcel, JobParameters.CREATOR));
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, onStopJob);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                C144165j jVar2 = null;
                if (readStrongBinder == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar = queryLocalInterface instanceof C144165j ? (C144165j) queryLocalInterface : new C144163h(readStrongBinder);
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar2 = queryLocalInterface2 instanceof C144165j ? (C144165j) queryLocalInterface2 : new C144163h(readStrongBinder2);
                }
                enforceNoDataAvail(parcel);
                boolean init = init(jVar, jVar2);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, init);
                return true;
            default:
                return false;
        }
    }
}
