package com.google.android.libraries.gcoreclient.p1757e.p1758a;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.C142904f;
import com.google.android.gms.auth.C142914n;
import com.google.android.gms.auth.C142916p;
import com.google.android.gms.auth.C142919s;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.C143699aa;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143875g;
import com.google.android.libraries.gcoreclient.p1757e.C21489a;
import com.google.android.libraries.gcoreclient.p1757e.C21496e;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.e.a.c */
/* compiled from: PG */
public final class C21492c extends C21490a {
    public C21492c(Context context) {
        super(context);
    }

    /* renamed from: d */
    public final String mo26968d(Account account, String str, Bundle bundle) {
        Context context;
        try {
            context = this.f59919a;
            int i = C142904f.f387743a;
            bundle.putBoolean("handle_notification", true);
            TokenData q = C142914n.m231869q(context, account, str, bundle);
            C143699aa.m233442d(context);
            return q.f387646b;
        } catch (C142916p e) {
            int i2 = e.f387823a;
            int i3 = C143699aa.f389596a;
            C143875g gVar = C143875g.f389987a;
            if (!C143700ab.m233445g(context, i2)) {
                if (i2 == 9) {
                    if (!C143700ab.m233446h(context, "com.android.vending")) {
                        i2 = 9;
                    }
                }
                gVar.mo119359g(context, i2);
                Log.w("GoogleAuthUtil", "Error when getting token", e);
                throw new C142919s(e);
            }
            gVar.mo119358f(context);
            Log.w("GoogleAuthUtil", "Error when getting token", e);
            throw new C142919s(e);
        } catch (UserRecoverableAuthException e2) {
            C143699aa.m233442d(context);
            Log.w("GoogleAuthUtil", "Error when getting token", e2);
            throw new C142919s(e2);
        } catch (C142919s e3) {
            throw new C21496e(e3.getMessage(), e3);
        } catch (C142903e e4) {
            throw new C21489a((Throwable) e4);
        }
    }
}
