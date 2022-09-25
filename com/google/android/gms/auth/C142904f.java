package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.p10737a.p10738a.C142846ae;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.C144022y;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.libraries.phenotype.client.C31654aj;
import java.util.List;
import p5304e.p5305a.p5306a.p5390n.p5391a.p5392a.C68827e;

/* renamed from: com.google.android.gms.auth.f */
/* compiled from: PG */
public final class C142904f extends C142914n {

    /* renamed from: a */
    public static final /* synthetic */ int f387743a = 0;

    /* renamed from: a */
    public static Account[] m231842a(Context context) {
        C143919bh.m233969l("com.google");
        try {
            int i = C143876h.f389990c;
            C143700ab.m233443e(context, 8400000);
            C143919bh.m233958a(context);
            ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
            if (acquireContentProviderClient != null) {
                try {
                    Bundle call = acquireContentProviderClient.call("get_accounts", "com.google", new Bundle());
                    if (call != null) {
                        Parcelable[] parcelableArray = call.getParcelableArray("accounts");
                        if (parcelableArray != null) {
                            Account[] accountArr = new Account[parcelableArray.length];
                            for (int i2 = 0; i2 < parcelableArray.length; i2++) {
                                accountArr[i2] = (Account) parcelableArray[i2];
                            }
                            acquireContentProviderClient.release();
                            return accountArr;
                        }
                        throw new RemoteException("Key_Accounts is Null");
                    }
                    throw new RemoteException("Null result from AccountChimeraContentProvider");
                } catch (RemoteException e) {
                    C142914n.f387821e.mo119306c("RemoteException when fetching accounts", e, new Object[0]);
                    throw e;
                } catch (Exception e2) {
                    C142914n.f387821e.mo119306c("Exception when getting accounts", e2, new Object[0]);
                    String message = e2.getMessage();
                    throw new RemoteException("Accounts ContentProvider failed: " + message);
                } catch (Throwable th) {
                    acquireContentProviderClient.release();
                    throw th;
                }
            } else {
                throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
            }
        } catch (GooglePlayServicesIncorrectManifestValueException unused) {
            throw new C144022y();
        }
    }

    /* renamed from: b */
    public static Account[] m231843b(Context context, String[] strArr) {
        C143919bh.m233958a(context);
        C143919bh.m233969l("com.google");
        C142914n.m231862j(context, 8400000);
        C31654aj.m58985d(context);
        if (C68827e.f184914a.mo6453a().mo60518b() && C142914n.m231866n(context)) {
            try {
                List list = (List) C142914n.m231857e(new C142846ae(context).mo117779b(new GetAccountsRequest("com.google", strArr)), "Accounts retrieval");
                C142914n.m231870r(list);
                return (Account[]) list.toArray(new Account[0]);
            } catch (C143842n e) {
                C142914n.m231863k(e, "Accounts retrieval");
            }
        }
        return (Account[]) C142914n.m231868p(context, C142914n.f387820d, new C142908h(strArr));
    }
}
