package org.chromium.p5643b.p5644a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: org.chromium.b.a.as */
/* compiled from: PG */
public abstract class C72323as extends C8849b implements C72324at {
    public C72323as() {
        super("org.chromium.weblayer_private.interfaces.IRemoteFragmentClient");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C72317am amVar;
        C72317am amVar2;
        C72317am amVar3;
        C72317am amVar4 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar4 = queryLocalInterface instanceof C72317am ? (C72317am) queryLocalInterface : new C72315ak(readStrongBinder);
                }
                enforceNoDataAvail(parcel);
                mo63722g(amVar4);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar4 = queryLocalInterface2 instanceof C72317am ? (C72317am) queryLocalInterface2 : new C72315ak(readStrongBinder2);
                }
                enforceNoDataAvail(parcel);
                mo63721f(amVar4);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar4 = queryLocalInterface3 instanceof C72317am ? (C72317am) queryLocalInterface3 : new C72315ak(readStrongBinder3);
                }
                enforceNoDataAvail(parcel);
                mo63720e(amVar4);
                parcel2.writeNoException();
                return true;
            case 4:
                mo63729n();
                parcel2.writeNoException();
                return true;
            case 5:
                mo63727l();
                parcel2.writeNoException();
                return true;
            case 6:
                mo63726k();
                parcel2.writeNoException();
                return true;
            case 7:
                mo63730o();
                parcel2.writeNoException();
                return true;
            case 8:
                mo63724i();
                parcel2.writeNoException();
                return true;
            case 9:
                mo63725j();
                parcel2.writeNoException();
                return true;
            case 10:
                mo63723h();
                parcel2.writeNoException();
                return true;
            case 11:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar4 = queryLocalInterface4 instanceof C72317am ? (C72317am) queryLocalInterface4 : new C72315ak(readStrongBinder4);
                }
                enforceNoDataAvail(parcel);
                mo63728m(amVar4);
                parcel2.writeNoException();
                return true;
            case 12:
                C72317am a = mo63716a();
                parcel2.writeNoException();
                C8850c.m23499h(parcel2, a);
                return true;
            case 13:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    amVar = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar = queryLocalInterface5 instanceof C72317am ? (C72317am) queryLocalInterface5 : new C72315ak(readStrongBinder5);
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar4 = queryLocalInterface6 instanceof C72317am ? (C72317am) queryLocalInterface6 : new C72315ak(readStrongBinder6);
                }
                enforceNoDataAvail(parcel);
                boolean q = mo63732q(amVar, readInt, amVar4);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, q);
                return true;
            case 14:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    amVar2 = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar2 = queryLocalInterface7 instanceof C72317am ? (C72317am) queryLocalInterface7 : new C72315ak(readStrongBinder7);
                }
                int readInt2 = parcel.readInt();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    amVar3 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar3 = queryLocalInterface8 instanceof C72317am ? (C72317am) queryLocalInterface8 : new C72315ak(readStrongBinder8);
                }
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar4 = queryLocalInterface9 instanceof C72317am ? (C72317am) queryLocalInterface9 : new C72315ak(readStrongBinder9);
                }
                C72317am amVar5 = amVar4;
                enforceNoDataAvail(parcel);
                boolean r = mo63733r(amVar2, readInt2, amVar3, readInt3, readInt4, readInt5, amVar5);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, r);
                return true;
            case 15:
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                boolean p = mo63731p(readString);
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, p);
                return true;
            case 16:
                String[] createStringArray = parcel.createStringArray();
                int readInt6 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo63719d(createStringArray, readInt6);
                parcel2.writeNoException();
                return true;
            case 17:
                C72317am b = mo63717b();
                parcel2.writeNoException();
                C8850c.m23499h(parcel2, b);
                return true;
            case 18:
                mo63718c();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
