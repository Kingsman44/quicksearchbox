package com.google.android.libraries.storage.protostore;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.storage.protostore.p */
/* compiled from: PG */
public final /* synthetic */ class C43013p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C43018u f112476a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f112477b;

    public /* synthetic */ C43013p(C43018u uVar, Runnable runnable) {
        this.f112476a = uVar;
        this.f112477b = runnable;
    }

    public final Object apply(Object obj) {
        C43018u uVar = this.f112476a;
        Runnable runnable = this.f112477b;
        Uri uri = (Uri) obj;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
        intentFilter.addDataScheme(uri.getScheme());
        intentFilter.addDataPath(uri.getPath(), 0);
        intentFilter.addDataAuthority("*", (String) null);
        C43016s sVar = new C43016s(runnable);
        if (Build.VERSION.SDK_INT >= 33) {
            uVar.f112496b.registerReceiver(sVar, intentFilter, uVar.f112497c, uVar.f112498d, 2);
        } else {
            uVar.f112496b.registerReceiver(sVar, intentFilter, uVar.f112497c, uVar.f112498d);
        }
        synchronized (uVar.f112501g) {
            uVar.f112500f.mo54920x(uri, runnable);
        }
        return null;
    }
}
