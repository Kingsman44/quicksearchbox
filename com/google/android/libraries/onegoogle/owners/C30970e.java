package com.google.android.libraries.onegoogle.owners;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.C142912l;
import com.google.android.gms.auth.C142914n;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.firstparty.p10745a.C142905a;
import com.google.android.gms.auth.p10737a.p10738a.C142846ae;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10780c.C143858a;
import com.google.android.libraries.phenotype.client.C31654aj;
import java.util.concurrent.Callable;
import p5304e.p5305a.p5306a.p5390n.p5391a.p5392a.C68827e;

/* renamed from: com.google.android.libraries.onegoogle.owners.e */
/* compiled from: PG */
public final /* synthetic */ class C30970e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C30973h f83452a;

    public /* synthetic */ C30970e(C30973h hVar) {
        this.f83452a = hVar;
    }

    public final Object call() {
        Context context = this.f83452a.f83456b;
        C143919bh.m233958a(context);
        C142914n.m231862j(context, 11400000);
        String str = context.getApplicationInfo().packageName;
        C31654aj.m58985d(context);
        if (C68827e.m99408c() && C142914n.m231866n(context)) {
            try {
                Bundle bundle = (Bundle) C142914n.m231857e(new C142846ae(context).mo117782e(str), "google accounts access request");
                String string = bundle.getString("Error");
                Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
                C142905a a = C142905a.m231844a(string);
                if (C142905a.SUCCESS.equals(a)) {
                    return true;
                }
                if (C142905a.m231845b(a)) {
                    C143858a aVar = C142914n.f387821e;
                    String valueOf = String.valueOf(a);
                    aVar.mo119307d("isUserRecoverableError status: " + valueOf, new Object[0]);
                    throw new UserRecoverableAuthException(string, intent);
                }
                throw new C142903e(string);
            } catch (C143842n e) {
                C142914n.m231863k(e, "google accounts access request");
            }
        }
        return (Boolean) C142914n.m231868p(context, C142914n.f387820d, new C142912l(str));
    }
}
