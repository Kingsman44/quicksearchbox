package com.google.android.apps.gsa.plugins.nativeresults.canvas.p6473b;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84122ab;
import com.google.android.libraries.componentview.services.application.C20609ci;
import com.google.android.libraries.componentview.services.application.NavigationParams;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.b.v */
/* compiled from: PG */
public final class C84094v implements C20609ci {

    /* renamed from: a */
    private static final C59071e f229001a = C59071e.m91332i("com.google.android.apps.gsa.plugins.nativeresults.canvas.b.v");

    /* renamed from: b */
    private final Context f229002b;

    /* renamed from: c */
    private final C84122ab f229003c;

    /* renamed from: d */
    private final int f229004d;

    public C84094v(C84122ab abVar, int i, Context context) {
        this.f229002b = context;
        this.f229003c = abVar;
        this.f229004d = i;
    }

    /* renamed from: a */
    public final void mo21039a(String str, NavigationParams navigationParams) {
        try {
            this.f229003c.mo77552d(this.f229004d, str, navigationParams.mo25468b(), ActivityOptions.makeCustomAnimation(this.f229002b, 0, 0).toBundle());
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) f229001a.mo56225c()).mo56382g(e)).mo56372aa(7042)).mo56389s("RemoteException while handling url navigation: %s", str);
        }
    }

    /* renamed from: b */
    public final boolean mo21040b(Intent intent) {
        try {
            this.f229003c.mo77551a(this.f229004d, intent);
            return true;
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) f229001a.mo56225c()).mo56382g(e)).mo56372aa(7043)).mo56389s("RemoteException while firing intent: %s", intent);
            return false;
        }
    }
}
