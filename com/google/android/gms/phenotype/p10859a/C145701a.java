package com.google.android.gms.phenotype.p10859a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.phenotype.a.a */
/* compiled from: PG */
public abstract class C145701a extends C8849b implements C145702b {
    public C145701a() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                enforceNoDataAvail(parcel);
                mo121870j((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            case 2:
                enforceNoDataAvail(parcel);
                mo121876p((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            case 3:
                enforceNoDataAvail(parcel);
                mo121875o((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            case 4:
                enforceNoDataAvail(parcel);
                mo121866f((Status) C8850c.m23492a(parcel, Status.CREATOR), (Configurations) C8850c.m23492a(parcel, Configurations.CREATOR));
                return true;
            case 5:
                enforceNoDataAvail(parcel);
                mo121861a((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            case 6:
                enforceNoDataAvail(parcel);
                mo121864d((Status) C8850c.m23492a(parcel, Status.CREATOR), (ExperimentTokens) C8850c.m23492a(parcel, ExperimentTokens.CREATOR));
                return true;
            case 7:
                enforceNoDataAvail(parcel);
                mo121862b((Status) C8850c.m23492a(parcel, Status.CREATOR), (DogfoodsToken) C8850c.m23492a(parcel, DogfoodsToken.CREATOR));
                return true;
            case 8:
                enforceNoDataAvail(parcel);
                mo121863c((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            case 9:
                enforceNoDataAvail(parcel);
                mo121867g((Status) C8850c.m23492a(parcel, Status.CREATOR), (Flag) C8850c.m23492a(parcel, Flag.CREATOR));
                return true;
            case 10:
                enforceNoDataAvail(parcel);
                mo121865e((Status) C8850c.m23492a(parcel, Status.CREATOR), (Configurations) C8850c.m23492a(parcel, Configurations.CREATOR));
                return true;
            case 11:
                long readLong = parcel.readLong();
                enforceNoDataAvail(parcel);
                mo121874n((Status) C8850c.m23492a(parcel, Status.CREATOR), readLong);
                return true;
            case 12:
                enforceNoDataAvail(parcel);
                mo121873m((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            case 13:
                enforceNoDataAvail(parcel);
                mo121869i((Status) C8850c.m23492a(parcel, Status.CREATOR), (FlagOverrides) C8850c.m23492a(parcel, FlagOverrides.CREATOR));
                return true;
            case 14:
                enforceNoDataAvail(parcel);
                mo121871k((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            case 15:
                enforceNoDataAvail(parcel);
                mo121872l((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            case 16:
                long readLong2 = parcel.readLong();
                enforceNoDataAvail(parcel);
                mo121868h((Status) C8850c.m23492a(parcel, Status.CREATOR), readLong2);
                return true;
            default:
                return false;
        }
    }
}
