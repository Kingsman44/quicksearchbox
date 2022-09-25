package com.google.android.libraries.onegoogle.accountmanagement;

import android.util.Log;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.f */
/* compiled from: PG */
final class C30277f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ AccountsModelUpdater f81874a;

    public C30277f(AccountsModelUpdater accountsModelUpdater) {
        this.f81874a = accountsModelUpdater;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Log.e(AccountsModelUpdater.f81783a, "Failed to load owners", th);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        ((C30306o) this.f81874a.f81784b).f81934a.mo35795d((C58485gu) obj);
    }
}
