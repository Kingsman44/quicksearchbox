package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.widget.RemoteViews;
import com.google.android.googlequicksearchbox.R;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.e */
/* compiled from: PG */
public final /* synthetic */ class C133719e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C133731q f364221a;

    public /* synthetic */ C133719e(C133731q qVar) {
        this.f364221a = qVar;
    }

    public final Object call() {
        C133731q qVar = this.f364221a;
        if (qVar.f364233b.f57939b.mo3594b(new RemoteViews(qVar.f364239h.getPackageName(), R.layout.googleapp_empty_bottombar), new int[0], (PendingIntent) null)) {
            return null;
        }
        throw new RemoteException("Remove the bottom bar failed");
    }
}
