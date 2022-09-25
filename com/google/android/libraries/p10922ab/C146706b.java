package com.google.android.libraries.p10922ab;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.WindowManager;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.ab.b */
/* compiled from: PG */
public abstract class C146706b extends C8849b implements C146707c {
    public C146706b() {
        super("com.google.android.libraries.launcherclient.ILauncherOverlay");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C146710f fVar = null;
        switch (i) {
            case 1:
                mo28093z();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                enforceNoDataAvail(parcel);
                mo28087o(readFloat);
                return true;
            case 3:
                mo28084i();
                return true;
            case 4:
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) C8850c.m23492a(parcel, WindowManager.LayoutParams.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.libraries.launcherclient.ILauncherOverlayCallback");
                    fVar = queryLocalInterface instanceof C146710f ? (C146710f) queryLocalInterface : new C146708d(readStrongBinder);
                }
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo28073C(layoutParams, fVar, readInt);
                return true;
            case 5:
                boolean i3 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo28075F(i3);
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo28082f(readInt2);
                return true;
            case 7:
                mo28085m();
                return true;
            case 8:
                mo28086n();
                return true;
            case 9:
                int readInt3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo28088p(readInt3);
                return true;
            case 10:
                boolean i4 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo28091t(i4);
                return true;
            case 11:
                String e = mo28081e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 12:
                boolean I = mo28077I();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, I);
                return true;
            case 13:
                boolean G = mo28076G();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, G);
                return true;
            case 14:
                Bundle bundle = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.libraries.launcherclient.ILauncherOverlayCallback");
                    fVar = queryLocalInterface2 instanceof C146710f ? (C146710f) queryLocalInterface2 : new C146708d(readStrongBinder2);
                }
                enforceNoDataAvail(parcel);
                mo28074D(bundle, fVar);
                return true;
            case 16:
                int readInt4 = parcel.readInt();
                enforceNoDataAvail(parcel);
                mo28092u(readInt4);
                return true;
            case 17:
                enforceNoDataAvail(parcel);
                boolean J = mo28078J(parcel.createByteArray(), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, J);
                return true;
            case 18:
                enforceNoDataAvail(parcel);
                mo28089q((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                return true;
            case 19:
                enforceNoDataAvail(parcel);
                mo28083g((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                return true;
            case 20:
                enforceNoDataAvail(parcel);
                mo28072A((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
