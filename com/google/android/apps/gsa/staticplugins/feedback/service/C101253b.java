package com.google.android.apps.gsa.staticplugins.feedback.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.apps.gsa.shared.util.p7184t.C91099i;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.service.b */
/* compiled from: PG */
final class C101253b implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C22871g f282586a;

    /* renamed from: b */
    final /* synthetic */ C101254c f282587b;

    /* renamed from: c */
    final /* synthetic */ Context f282588c;

    /* renamed from: d */
    final /* synthetic */ C91099i f282589d;

    public C101253b(C22871g gVar, C101254c cVar, Context context, C91099i iVar) {
        this.f282586a = gVar;
        this.f282587b = cVar;
        this.f282588c = context;
        this.f282589d = iVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f282586a.mo28212l("FeedbackRemoteClient connected", new C101252a(this.f282587b, this.f282588c, iBinder, this, this.f282589d));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
