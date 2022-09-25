package com.google.android.gms.pay.p10853b;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.DataChangeListenerResponse;
import com.google.android.gms.pay.GetClosedLoopBundleResponse;
import com.google.android.gms.pay.GetOutstandingPurchaseOrderIdResponse;
import com.google.android.gms.pay.GetPassesResponse;
import com.google.android.gms.pay.GetPayCardArtResponse;
import com.google.android.gms.pay.GetPayGlobalActionCardsResponse;
import com.google.android.gms.pay.GetSeFeatureReadinessStatusResponse;
import com.google.android.gms.pay.GetSortOrderResponse;
import com.google.android.gms.pay.GetTransactionsResponse;
import com.google.android.gms.pay.GetTransitCardsResponse;
import com.google.android.gms.pay.GetWalletStatusResponse;
import com.google.android.gms.pay.Gp3SupportInfo;
import com.google.android.gms.pay.PayApiError;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SyncTransactionsResponse;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.pay.b.b */
/* compiled from: PG */
public abstract class C145596b extends C8849b implements C145597c {
    public C145596b() {
        super("com.google.android.gms.pay.internal.IPayServiceCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                mo121622r();
                return true;
            case 3:
                Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GetPayGlobalActionCardsResponse getPayGlobalActionCardsResponse = (GetPayGlobalActionCardsResponse) C8850c.m23492a(parcel, GetPayGlobalActionCardsResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121617m();
                return true;
            case 4:
                Status status3 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) C8850c.m23492a(parcel, PendingIntent.CREATOR);
                enforceNoDataAvail(parcel);
                mo121618n();
                return true;
            case 5:
                Status status4 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                ProtoSafeParcelable protoSafeParcelable = (ProtoSafeParcelable) C8850c.m23492a(parcel, ProtoSafeParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                mo121619o();
                return true;
            case 6:
                DataChangeListenerResponse dataChangeListenerResponse = (DataChangeListenerResponse) C8850c.m23492a(parcel, DataChangeListenerResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121609e();
                return true;
            case 7:
                Status status5 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GetSortOrderResponse getSortOrderResponse = (GetSortOrderResponse) C8850c.m23492a(parcel, GetSortOrderResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121621q();
                return true;
            case 8:
                Status status6 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo121606b();
                return true;
            case 9:
                Status status7 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GetTransactionsResponse getTransactionsResponse = (GetTransactionsResponse) C8850c.m23492a(parcel, GetTransactionsResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121623s();
                return true;
            case 10:
                PayApiError payApiError = (PayApiError) C8850c.m23492a(parcel, PayApiError.CREATOR);
                enforceNoDataAvail(parcel);
                mo121615k();
                return true;
            case 11:
                Status status8 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GetOutstandingPurchaseOrderIdResponse getOutstandingPurchaseOrderIdResponse = (GetOutstandingPurchaseOrderIdResponse) C8850c.m23492a(parcel, GetOutstandingPurchaseOrderIdResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121614j();
                return true;
            case 12:
                Status status9 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GetClosedLoopBundleResponse getClosedLoopBundleResponse = (GetClosedLoopBundleResponse) C8850c.m23492a(parcel, GetClosedLoopBundleResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121608d();
                return true;
            case 13:
                Status status10 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GetPayCardArtResponse getPayCardArtResponse = (GetPayCardArtResponse) C8850c.m23492a(parcel, GetPayCardArtResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121616l();
                return true;
            case 14:
                Status status11 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                SyncTransactionsResponse syncTransactionsResponse = (SyncTransactionsResponse) C8850c.m23492a(parcel, SyncTransactionsResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121624t();
                return true;
            case 15:
                Status status12 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                parcel.createByteArray();
                enforceNoDataAvail(parcel);
                mo121607c();
                return true;
            case 16:
                enforceNoDataAvail(parcel);
                mo121605a((Status) C8850c.m23492a(parcel, Status.CREATOR), (GetPassesResponse) C8850c.m23492a(parcel, GetPassesResponse.CREATOR));
                return true;
            case 17:
                Status status13 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                parcel.readLong();
                enforceNoDataAvail(parcel);
                mo121613i();
                return true;
            case 18:
                Status status14 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                mo121611g();
                return true;
            case 19:
                Status status15 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                Gp3SupportInfo gp3SupportInfo = (Gp3SupportInfo) C8850c.m23492a(parcel, Gp3SupportInfo.CREATOR);
                enforceNoDataAvail(parcel);
                mo121610f();
                return true;
            case 20:
                Status status16 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                parcel.readInt();
                enforceNoDataAvail(parcel);
                mo121612h();
                return true;
            case 21:
                Status status17 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GetTransitCardsResponse getTransitCardsResponse = (GetTransitCardsResponse) C8850c.m23492a(parcel, GetTransitCardsResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121625u();
                return true;
            case 22:
                Status status18 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GetWalletStatusResponse getWalletStatusResponse = (GetWalletStatusResponse) C8850c.m23492a(parcel, GetWalletStatusResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121626v();
                return true;
            case 23:
                Status status19 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
                GetSeFeatureReadinessStatusResponse getSeFeatureReadinessStatusResponse = (GetSeFeatureReadinessStatusResponse) C8850c.m23492a(parcel, GetSeFeatureReadinessStatusResponse.CREATOR);
                enforceNoDataAvail(parcel);
                mo121620p();
                return true;
            default:
                return false;
        }
    }
}
