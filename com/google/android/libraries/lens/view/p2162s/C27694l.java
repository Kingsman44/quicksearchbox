package com.google.android.libraries.lens.view.p2162s;

import android.os.UserManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.s.l */
/* compiled from: PG */
public final /* synthetic */ class C27694l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C27696n f75621a;

    public /* synthetic */ C27694l(C27696n nVar) {
        this.f75621a = nVar;
    }

    public final Object call() {
        C27696n nVar = this.f75621a;
        UserManager userManager = (UserManager) nVar.f75624b.getSystemService("user");
        boolean z = true;
        if (userManager != null) {
            z = userManager.getApplicationRestrictions(nVar.f75624b.getPackageName()).getBoolean("enable_google_search", true);
        }
        return Boolean.valueOf(z);
    }
}
