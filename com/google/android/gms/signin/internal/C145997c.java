package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.signin.internal.c */
/* compiled from: PG */
public abstract class C145997c extends C8849b implements C145998d {
    public C145997c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) C8850c.m23492a(parcel, ConnectionResult.CREATOR);
                AuthAccountResult authAccountResult = (AuthAccountResult) C8850c.m23492a(parcel, AuthAccountResult.CREATOR);
                enforceNoDataAvail(parcel);
                break;
            case 4:
                Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                break;
            case 6:
                Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                break;
            case 7:
                Status status3 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C8850c.m23492a(parcel, GoogleSignInAccount.CREATOR);
                enforceNoDataAvail(parcel);
                break;
            case 8:
                enforceNoDataAvail(parcel);
                mo119147a((SignInResponse) C8850c.m23492a(parcel, SignInResponse.CREATOR));
                break;
            case 9:
                RecordConsentByConsentResultResponse recordConsentByConsentResultResponse = (RecordConsentByConsentResultResponse) C8850c.m23492a(parcel, RecordConsentByConsentResultResponse.CREATOR);
                enforceNoDataAvail(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
