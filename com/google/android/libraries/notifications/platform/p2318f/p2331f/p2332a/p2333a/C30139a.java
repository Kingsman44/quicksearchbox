package com.google.android.libraries.notifications.platform.p2318f.p2331f.p2332a.p2333a;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2318f.p2331f.p2332a.C30138a;
import com.google.android.libraries.notifications.platform.p2318f.p2331f.p2334b.C30140a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.notifications.platform.f.f.a.a.a */
/* compiled from: PG */
public final class C30139a {

    /* renamed from: a */
    public Context f81510a;

    /* renamed from: a */
    public final Set mo35527a() {
        C30140a.m55988a(this.f81510a, "android.permission.GET_ACCOUNTS");
        C30058b.m55794f("DeviceAccountsUtilImpl", "Try to retrieve accounts list from Accounts ContentProvider.", new Object[0]);
        ContentProviderClient acquireContentProviderClient = this.f81510a.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
        if (acquireContentProviderClient != null) {
            try {
                Parcelable[] parcelableArray = acquireContentProviderClient.call("get_accounts", "com.google", (Bundle) null).getParcelableArray("accounts");
                HashSet hashSet = new HashSet();
                for (Parcelable parcelable : parcelableArray) {
                    hashSet.add(((Account) parcelable).name);
                }
                acquireContentProviderClient.release();
                return hashSet;
            } catch (Exception e) {
                throw new C30138a(e);
            } catch (Throwable th) {
                acquireContentProviderClient.release();
                throw th;
            }
        } else {
            throw new C30138a();
        }
    }
}
