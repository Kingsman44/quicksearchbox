package com.google.android.gms.car.p10759e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.car.e.b */
/* compiled from: PG */
public abstract class C143210b extends C8849b implements C143211c {
    public C143210b() {
        super("com.google.android.gms.car.input.IProxyInputConnection");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                CharSequence d = mo118235d(readInt, readInt2);
                parcel2.writeNoException();
                C8850c.m23496e(parcel2, d);
                return true;
            case 2:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                enforceNoDataAvail(parcel);
                CharSequence c = mo118234c(readInt3, readInt4);
                parcel2.writeNoException();
                C8850c.m23496e(parcel2, c);
                return true;
            case 3:
                int readInt5 = parcel.readInt();
                enforceNoDataAvail(parcel);
                CharSequence b = mo118233b(readInt5);
                parcel2.writeNoException();
                C8850c.m23496e(parcel2, b);
                return true;
            case 4:
                int readInt6 = parcel.readInt();
                enforceNoDataAvail(parcel);
                int a = mo118232a(readInt6);
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 5:
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                enforceNoDataAvail(parcel);
                boolean h = mo118239h(readInt7, readInt8);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, h);
                return true;
            case 6:
                CharSequence b2 = C8850c.m23493b(parcel);
                int readInt9 = parcel.readInt();
                enforceNoDataAvail(parcel);
                boolean q = mo118248q(b2, readInt9);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, q);
                return true;
            case 7:
                int readInt10 = parcel.readInt();
                int readInt11 = parcel.readInt();
                enforceNoDataAvail(parcel);
                boolean p = mo118247p(readInt10, readInt11);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, p);
                return true;
            case 8:
                boolean j = mo118241j();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, j);
                return true;
            case 9:
                CharSequence b3 = C8850c.m23493b(parcel);
                int readInt12 = parcel.readInt();
                enforceNoDataAvail(parcel);
                boolean g = mo118238g(b3, readInt12);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, g);
                return true;
            case 10:
                int readInt13 = parcel.readInt();
                int readInt14 = parcel.readInt();
                enforceNoDataAvail(parcel);
                boolean r = mo118249r(readInt13, readInt14);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, r);
                return true;
            case 11:
                int readInt15 = parcel.readInt();
                enforceNoDataAvail(parcel);
                boolean l = mo118243l(readInt15);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, l);
                return true;
            case 12:
                int readInt16 = parcel.readInt();
                enforceNoDataAvail(parcel);
                boolean k = mo118242k(readInt16);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, k);
                return true;
            case 13:
                boolean e = mo118236e();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, e);
                return true;
            case 14:
                boolean i3 = mo118240i();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, i3);
                return true;
            case 15:
                enforceNoDataAvail(parcel);
                boolean o = mo118246o((KeyEvent) C8850c.m23492a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, o);
                return true;
            case 16:
                int readInt17 = parcel.readInt();
                enforceNoDataAvail(parcel);
                boolean f = mo118237f(readInt17);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, f);
                return true;
            case 17:
                boolean i4 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                boolean n = mo118245n(i4);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, n);
                return true;
            case 18:
                enforceNoDataAvail(parcel);
                boolean m = mo118244m(parcel.readString(), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, m);
                return true;
            case 19:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.input.ICarEditableListener");
                    if (queryLocalInterface instanceof C143209a) {
                        C143209a aVar = (C143209a) queryLocalInterface;
                    }
                }
                enforceNoDataAvail(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo118250s();
                return true;
            default:
                return false;
        }
    }
}
