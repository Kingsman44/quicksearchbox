package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p10793f.C144163h;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.ae */
/* compiled from: PG */
public abstract class C143397ae extends C8849b implements C143398af {
    public C143397ae() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C144165j jVar = null;
        switch (i) {
            case 1:
                C144165j b = mo118583b();
                parcel2.writeNoException();
                C8850c.m23499h(parcel2, b);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar = queryLocalInterface instanceof C144165j ? (C144165j) queryLocalInterface : new C144163h(readStrongBinder);
                }
                enforceNoDataAvail(parcel);
                mo118591j(jVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar = queryLocalInterface2 instanceof C144165j ? (C144165j) queryLocalInterface2 : new C144163h(readStrongBinder2);
                }
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                mo118590i(jVar, readString);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar = queryLocalInterface3 instanceof C144165j ? (C144165j) queryLocalInterface3 : new C144163h(readStrongBinder3);
                }
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118589h(jVar, readInt);
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar = queryLocalInterface4 instanceof C144165j ? (C144165j) queryLocalInterface4 : new C144163h(readStrongBinder4);
                }
                enforceNoDataAvail(parcel);
                mo118585d(jVar);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar = queryLocalInterface5 instanceof C144165j ? (C144165j) queryLocalInterface5 : new C144163h(readStrongBinder5);
                }
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118584c(jVar, readInt2);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar = queryLocalInterface6 instanceof C144165j ? (C144165j) queryLocalInterface6 : new C144163h(readStrongBinder6);
                }
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                mo118588g(jVar, readString2);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar = queryLocalInterface7 instanceof C144165j ? (C144165j) queryLocalInterface7 : new C144163h(readStrongBinder7);
                }
                boolean i3 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo118587f(jVar, i3);
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar = queryLocalInterface8 instanceof C144165j ? (C144165j) queryLocalInterface8 : new C144163h(readStrongBinder8);
                }
                int readInt3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118586e(jVar, readInt3);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    jVar = queryLocalInterface9 instanceof C144165j ? (C144165j) queryLocalInterface9 : new C144163h(readStrongBinder9);
                }
                int readInt4 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo118592k(jVar, readInt4);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(mo118582a());
                return true;
            default:
                return false;
        }
    }
}
