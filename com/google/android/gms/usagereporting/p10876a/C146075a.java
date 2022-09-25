package com.google.android.gms.usagereporting.p10876a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.usagereporting.a.a */
/* compiled from: PG */
public abstract class C146075a extends C8849b implements C146076b {
    public C146075a() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                enforceNoDataAvail(parcel);
                mo122592a((Status) C8850c.m23492a(parcel, Status.CREATOR), (UsageReportingOptInOptions) C8850c.m23492a(parcel, UsageReportingOptInOptions.CREATOR));
                return true;
            case 3:
                Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                mo122599h();
                return true;
            case 4:
                enforceNoDataAvail(parcel);
                mo122593b((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            case 5:
                enforceNoDataAvail(parcel);
                mo122594c((Status) C8850c.m23492a(parcel, Status.CREATOR));
                return true;
            case 6:
                Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                parcel.createStringArrayList();
                enforceNoDataAvail(parcel);
                mo122596e();
                return true;
            case 7:
                Status status3 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                mo122598g();
                return true;
            case 8:
                Status status4 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                C8850c.m23500i(parcel);
                ConsentInformation consentInformation = (ConsentInformation) C8850c.m23492a(parcel, ConsentInformation.CREATOR);
                enforceNoDataAvail(parcel);
                mo122595d();
                return true;
            case 9:
                Status status5 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                ConsentInformation consentInformation2 = (ConsentInformation) C8850c.m23492a(parcel, ConsentInformation.CREATOR);
                enforceNoDataAvail(parcel);
                mo122597f();
                return true;
            default:
                return false;
        }
    }
}
