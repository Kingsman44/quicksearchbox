package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.widget.RemoteViews;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.d */
/* compiled from: PG */
public final /* synthetic */ class C133718d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C133731q f364217a;

    /* renamed from: b */
    public final /* synthetic */ RemoteViews f364218b;

    /* renamed from: c */
    public final /* synthetic */ int[] f364219c;

    /* renamed from: d */
    public final /* synthetic */ PendingIntent f364220d;

    public /* synthetic */ C133718d(C133731q qVar, RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        this.f364217a = qVar;
        this.f364218b = remoteViews;
        this.f364219c = iArr;
        this.f364220d = pendingIntent;
    }

    public final Object call() {
        C133731q qVar = this.f364217a;
        if (qVar.f364233b.f57939b.mo3594b(this.f364218b, this.f364219c, this.f364220d)) {
            return null;
        }
        throw new RemoteException("Setting the bottom bar failed");
    }
}
