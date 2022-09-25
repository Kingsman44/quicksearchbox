package com.google.android.gms.learning.dynamite.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.dynamite.training.k */
/* compiled from: PG */
public abstract class C144715k extends C8849b implements C144716l {
    public C144715k() {
        super("com.google.android.gms.learning.dynamite.training.IInAppTrainingController");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = i;
        Parcel parcel3 = parcel;
        C144719o oVar = null;
        if (i3 == 2) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            boolean i4 = C8850c.m23500i(parcel);
            boolean i5 = C8850c.m23500i(parcel);
            boolean i6 = C8850c.m23500i(parcel);
            byte[] createByteArray = parcel.createByteArray();
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.training.IInAppTrainingResultCallback");
                oVar = queryLocalInterface instanceof C144719o ? (C144719o) queryLocalInterface : new C144717m(readStrongBinder);
            }
            C144719o oVar2 = oVar;
            enforceNoDataAvail(parcel3);
            mo120158f(readString, readString2, readString3, readInt, i4, i5, i6, createByteArray, oVar2);
            return true;
        } else if (i3 == 3) {
            mo120157e();
            return true;
        } else if (i3 != 5) {
            return false;
        } else {
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean i7 = C8850c.m23500i(parcel);
            boolean i8 = C8850c.m23500i(parcel);
            byte[] createByteArray2 = parcel.createByteArray();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.learning.dynamite.training.IInAppTrainingResultCallback");
                oVar = queryLocalInterface2 instanceof C144719o ? (C144719o) queryLocalInterface2 : new C144717m(readStrongBinder2);
            }
            C144719o oVar3 = oVar;
            enforceNoDataAvail(parcel3);
            mo120159g(readString4, readString5, readString6, readString7, i7, i8, createByteArray2, oVar3);
            return true;
        }
    }
}
