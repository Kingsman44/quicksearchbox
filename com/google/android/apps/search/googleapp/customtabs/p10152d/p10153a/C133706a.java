package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a;

import android.graphics.Bitmap;
import android.os.RemoteException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C133706a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C133731q f364181a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f364182b;

    /* renamed from: c */
    public final /* synthetic */ String f364183c;

    public /* synthetic */ C133706a(C133731q qVar, Bitmap bitmap, String str) {
        this.f364181a = qVar;
        this.f364182b = bitmap;
        this.f364183c = str;
    }

    public final Object call() {
        C133731q qVar = this.f364181a;
        if (qVar.f364233b.f57939b.mo3595c(this.f364182b, this.f364183c)) {
            return null;
        }
        throw new RemoteException("Updating the action button failed");
    }
}
