package com.google.android.apps.gsa.staticplugins.opa.p8365h;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.apps.gsa.publicsearch.C84203c;
import com.google.android.apps.gsa.publicsearch.C84205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.j */
/* compiled from: PG */
public final /* synthetic */ class C109182j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109191s f304004a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f304005b;

    public /* synthetic */ C109182j(C109191s sVar, IBinder iBinder) {
        this.f304004a = sVar;
        this.f304005b = iBinder;
    }

    public final void run() {
        C84205e eVar;
        C109191s sVar = this.f304004a;
        IBinder iBinder = this.f304005b;
        if (iBinder == null) {
            eVar = null;
        } else {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
                eVar = queryLocalInterface instanceof C84205e ? (C84205e) queryLocalInterface : new C84203c(iBinder);
            } catch (RemoteException e) {
                ((C58970a) ((C58970a) ((C58970a) sVar.f304019a.mo56225c()).mo56382g(e)).mo56372aa(23879)).mo56386p("onServiceDisconnected(): remote exception");
                C60856cj.m92903l(C47810es.m84977q(new C109181i(sVar)), sVar.f304024f);
                return;
            }
        }
        IBinder e2 = eVar.mo77677e(sVar.f304020b, (IBinder) null, (Bundle) null);
        if (e2 == null) {
            sVar.mo97658c();
            ((C58970a) ((C58970a) sVar.f304019a.mo56225c()).mo56372aa(23876)).mo56386p("SvcConn: binder null, could not send broadcast of action");
            return;
        }
        ((C58970a) ((C58970a) sVar.f304019a.mo56224b()).mo56372aa(23875)).mo56386p("SvcConn: messenger connected");
        sVar.f304029k = new Messenger(e2);
        sVar.mo97659d();
    }
}
