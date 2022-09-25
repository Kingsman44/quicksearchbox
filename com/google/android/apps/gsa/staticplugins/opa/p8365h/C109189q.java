package com.google.android.apps.gsa.staticplugins.opa.p8365h;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.q */
/* compiled from: PG */
final class C109189q implements ServiceConnection {

    /* renamed from: a */
    private final WeakReference f304016a;

    /* renamed from: b */
    private final C47770dh f304017b;

    /* renamed from: c */
    private final C58974d f304018c;

    public C109189q(C109191s sVar, C47770dh dhVar, C58974d dVar) {
        this.f304016a = new WeakReference(sVar);
        this.f304017b = dhVar;
        this.f304018c = dVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C47538ax c = this.f304017b.mo51613c("BroadcastReceiverServiceMessenger.onServiceConnected");
        try {
            C109191s sVar = (C109191s) this.f304016a.get();
            if (sVar != null) {
                C109182j jVar = new C109182j(sVar, iBinder);
                C60856cj.m92903l(C47810es.m84977q(jVar), sVar.f304024f);
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C109188p.m181705a(th, th);
        }
        throw th;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C47538ax c = this.f304017b.mo51613c("BroadcastReceiverServiceMessenger.onServiceDisconnected");
        try {
            ((C58970a) ((C58970a) this.f304018c.mo56224b()).mo56372aa(23868)).mo56386p("SvcConn: onServiceDisconnected()");
            C109191s sVar = (C109191s) this.f304016a.get();
            if (sVar != null) {
                ((C58970a) ((C58970a) sVar.f304019a.mo56224b()).mo56372aa(23877)).mo56386p("binder null");
                C109185m mVar = new C109185m(sVar);
                C60856cj.m92903l(C47810es.m84977q(mVar), sVar.f304024f);
            }
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C109188p.m181705a(th, th);
        }
        throw th;
    }
}
