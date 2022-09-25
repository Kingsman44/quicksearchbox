package org.chromium.p5643b.p5644a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: org.chromium.b.a.ax */
/* compiled from: PG */
public abstract class C72328ax extends C8849b implements C72329ay {
    public C72328ax() {
        super("org.chromium.weblayer_private.interfaces.ITabClient");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C72317am amVar;
        C72317am amVar2;
        C72317am amVar3;
        C72317am amVar4;
        C72317am amVar5;
        C72317am amVar6;
        C72317am amVar7;
        C72317am amVar8;
        C72317am amVar9 = null;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                mo63763i(readString);
                break;
            case 2:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo63756b(readInt, readInt2);
                break;
            case 3:
                mo63757c();
                break;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    amVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar = queryLocalInterface instanceof C72317am ? (C72317am) queryLocalInterface : new C72315ak(readStrongBinder);
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    amVar2 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar2 = queryLocalInterface2 instanceof C72317am ? (C72317am) queryLocalInterface2 : new C72315ak(readStrongBinder2);
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    amVar3 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar3 = queryLocalInterface3 instanceof C72317am ? (C72317am) queryLocalInterface3 : new C72315ak(readStrongBinder3);
                }
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    amVar4 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar4 = queryLocalInterface4 instanceof C72317am ? (C72317am) queryLocalInterface4 : new C72315ak(readStrongBinder4);
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar9 = queryLocalInterface5 instanceof C72317am ? (C72317am) queryLocalInterface5 : new C72315ak(readStrongBinder5);
                }
                C72317am amVar10 = amVar9;
                enforceNoDataAvail(parcel);
                mo63762h(amVar, amVar2, amVar3, amVar4, amVar10);
                break;
            case 6:
                C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo63766l();
                break;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar9 = queryLocalInterface6 instanceof C72317am ? (C72317am) queryLocalInterface6 : new C72315ak(readStrongBinder6);
                }
                enforceNoDataAvail(parcel);
                mo63760f(amVar9);
                break;
            case 8:
                mo63755a();
                break;
            case 9:
                mo63759e();
                break;
            case 10:
                parcel.readInt();
                enforceNoDataAvail(parcel);
                mo63765k();
                break;
            case 11:
                int readInt3 = parcel.readInt();
                float readFloat = parcel.readFloat();
                enforceNoDataAvail(parcel);
                mo63758d(readInt3, readFloat);
                break;
            case 12:
                int readInt4 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo63761g(readInt4);
                break;
            case 13:
                parcel.readInt();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar9 = queryLocalInterface7 instanceof C72317am ? (C72317am) queryLocalInterface7 : new C72315ak(readStrongBinder7);
                }
                enforceNoDataAvail(parcel);
                mo63764j(amVar9);
                break;
            case 14:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    amVar5 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar5 = queryLocalInterface8 instanceof C72317am ? (C72317am) queryLocalInterface8 : new C72315ak(readStrongBinder8);
                }
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 == null) {
                    amVar6 = null;
                } else {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar6 = queryLocalInterface9 instanceof C72317am ? (C72317am) queryLocalInterface9 : new C72315ak(readStrongBinder9);
                }
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 == null) {
                    amVar7 = null;
                } else {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar7 = queryLocalInterface10 instanceof C72317am ? (C72317am) queryLocalInterface10 : new C72315ak(readStrongBinder10);
                }
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 == null) {
                    amVar8 = null;
                } else {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar8 = queryLocalInterface11 instanceof C72317am ? (C72317am) queryLocalInterface11 : new C72315ak(readStrongBinder11);
                }
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("org.chromium.weblayer_private.interfaces.IObjectWrapper");
                    amVar9 = queryLocalInterface12 instanceof C72317am ? (C72317am) queryLocalInterface12 : new C72315ak(readStrongBinder12);
                }
                C72317am amVar11 = amVar9;
                C8850c.m23500i(parcel);
                C8850c.m23500i(parcel);
                C8850c.m23500i(parcel);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("org.chromium.weblayer_private.interfaces.IContextMenuParams");
                    if (queryLocalInterface13 instanceof C72354m) {
                        C72354m mVar = (C72354m) queryLocalInterface13;
                    }
                }
                enforceNoDataAvail(parcel);
                mo63768n(amVar5, amVar6, amVar7, amVar8, amVar11);
                break;
            case 15:
                parcel.readFloat();
                enforceNoDataAvail(parcel);
                mo63767m();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
