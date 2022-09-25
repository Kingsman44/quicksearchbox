package com.google.android.gms.wallet.p10883a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wallet.a.b */
/* compiled from: PG */
public abstract class C146338b extends C8849b implements C146339c {
    public C146338b() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.readInt();
                MaskedWallet maskedWallet = (MaskedWallet) C8850c.m23492a(parcel, MaskedWallet.CREATOR);
                Bundle bundle = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 2:
                parcel.readInt();
                FullWallet fullWallet = (FullWallet) C8850c.m23492a(parcel, FullWallet.CREATOR);
                Bundle bundle2 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 3:
                int readInt = parcel.readInt();
                boolean i3 = C8850c.m23500i(parcel);
                Bundle bundle3 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                mo122927c(readInt, i3);
                return true;
            case 4:
                parcel.readInt();
                Bundle bundle4 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 6:
                parcel.readInt();
                C8850c.m23500i(parcel);
                Bundle bundle5 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 7:
                Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse = (GetBuyFlowInitializationTokenResponse) C8850c.m23492a(parcel, GetBuyFlowInitializationTokenResponse.CREATOR);
                Bundle bundle6 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 8:
                Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                Bundle bundle7 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 9:
                boolean i4 = C8850c.m23500i(parcel);
                Bundle bundle8 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                mo122926b((Status) C8850c.m23492a(parcel, Status.CREATOR), i4);
                return true;
            case 10:
                Bundle bundle9 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                mo122925a((Status) C8850c.m23492a(parcel, Status.CREATOR), (GetClientTokenResponse) C8850c.m23492a(parcel, GetClientTokenResponse.CREATOR));
                return true;
            case 11:
                Status status3 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                Bundle bundle10 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 12:
                Status status4 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                WebPaymentData webPaymentData = (WebPaymentData) C8850c.m23492a(parcel, WebPaymentData.CREATOR);
                Bundle bundle11 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 13:
                Status status5 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                Bundle bundle12 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 14:
                Status status6 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                PaymentData paymentData = (PaymentData) C8850c.m23492a(parcel, PaymentData.CREATOR);
                Bundle bundle13 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 15:
                Status status7 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GetSaveInstrumentDetailsResponse getSaveInstrumentDetailsResponse = (GetSaveInstrumentDetailsResponse) C8850c.m23492a(parcel, GetSaveInstrumentDetailsResponse.CREATOR);
                Bundle bundle14 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 16:
                Status status8 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                SetUpBiometricAuthenticationKeysResponse setUpBiometricAuthenticationKeysResponse = (SetUpBiometricAuthenticationKeysResponse) C8850c.m23492a(parcel, SetUpBiometricAuthenticationKeysResponse.CREATOR);
                Bundle bundle15 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 17:
                Status status9 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                WarmUpUiProcessResponse warmUpUiProcessResponse = (WarmUpUiProcessResponse) C8850c.m23492a(parcel, WarmUpUiProcessResponse.CREATOR);
                Bundle bundle16 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 18:
                parcel.readInt();
                Bundle bundle17 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            case 19:
                Status status10 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse = (PaymentCardRecognitionIntentResponse) C8850c.m23492a(parcel, PaymentCardRecognitionIntentResponse.CREATOR);
                Bundle bundle18 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                return true;
            default:
                return false;
        }
    }
}
