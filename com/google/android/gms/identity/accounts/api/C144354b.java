package com.google.android.gms.identity.accounts.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.C143701ac;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.C143948d;

/* renamed from: com.google.android.gms.identity.accounts.api.b */
/* compiled from: PG */
public final class C144354b {
    /* renamed from: a */
    public static final boolean m234631a(Context context, Intent intent, AccountData accountData) {
        String str;
        C143919bh.m233971n(context, "Context must not be null.");
        C143919bh.m233971n(intent, "Intent must not be null.");
        ComponentName component = intent.getComponent();
        if (component != null) {
            str = component.getPackageName();
        } else {
            str = intent.getPackage();
        }
        if (str == null) {
            return false;
        }
        C143919bh.m233971n(context, "Context must not be null.");
        C143919bh.m233970m(str, "Package name must not be empty.");
        if (!C143701ac.m233450a(context).mo119084c(str)) {
            return false;
        }
        intent.putExtra("com.google.android.gms.accounts.ACCOUNT_DATA", C143948d.m234110c(accountData));
        return true;
    }
}
