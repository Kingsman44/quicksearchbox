package com.google.android.p445a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.a.b */
/* compiled from: PG */
public class C8849b extends Binder implements IInterface {
    private static C8851d globalInterceptor;

    protected C8849b(String str) {
        attachInterface(this, str);
    }

    static synchronized void installTransactionInterceptorPackagePrivate(C8851d dVar) {
        synchronized (C8849b.class) {
            if (dVar != null) {
                try {
                    if (globalInterceptor == null) {
                        globalInterceptor = dVar;
                    } else {
                        throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("null interceptor");
            }
        }
    }

    private boolean routeToSuperOrEnforceInterface(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    public IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void enforceNoDataAvail(Parcel parcel) {
        C8851d dVar = globalInterceptor;
        if (dVar != null) {
            dVar.mo17268a();
        } else {
            C8850c.m23494c(parcel);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        C8851d dVar = globalInterceptor;
        if (dVar == null) {
            return dispatchTransaction(i, parcel, parcel2, i2);
        }
        return dVar.mo17269b();
    }
}
