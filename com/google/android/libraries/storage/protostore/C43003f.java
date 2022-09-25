package com.google.android.libraries.storage.protostore;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.storage.protostore.f */
/* compiled from: PG */
public final /* synthetic */ class C43003f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C43006i f112458a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f112459b;

    /* renamed from: c */
    public final /* synthetic */ String f112460c;

    public /* synthetic */ C43003f(C43006i iVar, Runnable runnable, String str) {
        this.f112458a = iVar;
        this.f112459b = runnable;
        this.f112460c = str;
    }

    public final Object apply(Object obj) {
        C43006i iVar = this.f112458a;
        Runnable runnable = this.f112459b;
        String str = this.f112460c;
        Uri uri = (Uri) obj;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.libraries.storage.protostore.SIGNAL_ACTION");
        intentFilter.addDataScheme(uri.getScheme());
        intentFilter.addDataPath(uri.getPath(), 0);
        intentFilter.addDataAuthority("*", (String) null);
        C43004g gVar = new C43004g(runnable, str);
        if (Build.VERSION.SDK_INT >= 33) {
            iVar.f112465b.registerReceiver(gVar, intentFilter, iVar.f112467d, iVar.f112468e, 4);
        } else {
            iVar.f112465b.registerReceiver(gVar, intentFilter, iVar.f112467d, iVar.f112468e);
        }
        return null;
    }
}
