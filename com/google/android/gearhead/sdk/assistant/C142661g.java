package com.google.android.gearhead.sdk.assistant;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gearhead.sdk.assistant.g */
/* compiled from: PG */
public abstract class C142661g extends C8849b implements C142662h {
    public C142661g() {
        super("com.google.android.gearhead.sdk.assistant.ICarAssistantProvider");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        C142660f fVar = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gearhead.sdk.assistant.ICarAssistantClientCallbacks");
                fVar = queryLocalInterface instanceof C142660f ? (C142660f) queryLocalInterface : new C142659e(readStrongBinder);
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            C142658d b = mo77653b(fVar, readInt);
            parcel2.writeNoException();
            C8850c.m23499h(parcel2, b);
        } else if (i == 2) {
            SupportedVersionInfo c = mo77654c();
            parcel2.writeNoException();
            C8850c.m23498g(parcel2, c);
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gearhead.sdk.assistant.ICarAssistantClientCallbacks");
                fVar = queryLocalInterface2 instanceof C142660f ? (C142660f) queryLocalInterface2 : new C142659e(readStrongBinder2);
            }
            enforceNoDataAvail(parcel);
            C142658d a = mo77652a(fVar, (ClientRegistrationConfig) C8850c.m23492a(parcel, ClientRegistrationConfig.CREATOR));
            parcel2.writeNoException();
            C8850c.m23499h(parcel2, a);
        }
        return true;
    }
}
