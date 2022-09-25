package com.google.android.libraries.gsa.p1859d.p1860a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* renamed from: com.google.android.libraries.gsa.d.a.o */
/* compiled from: PG */
public final class C22744o implements ServiceConnection {

    /* renamed from: a */
    public final Object f62573a = new Object();

    /* renamed from: b */
    public boolean f62574b;

    /* renamed from: c */
    public C22739j f62575c;

    /* renamed from: d */
    private final Context f62576d;

    /* renamed from: e */
    private final C22871g f62577e;

    /* renamed from: f */
    private String f62578f;

    /* renamed from: g */
    private boolean f62579g;

    /* renamed from: h */
    private Queue f62580h = new ArrayDeque();

    /* renamed from: i */
    private Queue f62581i = new ArrayDeque();

    /* renamed from: j */
    private C60870cx f62582j;

    /* renamed from: k */
    private boolean f62583k = false;

    /* renamed from: l */
    private C22730a f62584l;

    public C22744o(Context context, C22871g gVar) {
        this.f62576d = context;
        this.f62577e = gVar;
    }

    /* renamed from: g */
    private final void m42384g() {
        C60870cx cxVar = this.f62582j;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f62582j = null;
        }
    }

    /* renamed from: h */
    private final void m42385h() {
        m42384g();
        this.f62584l = null;
        this.f62580h = new ArrayDeque();
        this.f62581i = new ArrayDeque();
        this.f62575c = null;
        this.f62583k = false;
    }

    /* renamed from: i */
    private static void m42386i(Exception exc, C22739j jVar, Queue queue, Queue queue2) {
        if (jVar != null) {
            jVar.f62564d.mo57357o(exc);
        }
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            ((C22739j) it.next()).f62564d.mo57357o(exc);
        }
        Iterator it2 = queue2.iterator();
        while (it2.hasNext()) {
            ((C22741l) it2.next()).f62568d.mo57357o(exc);
        }
    }

    /* renamed from: j */
    private final void m42387j() {
        this.f62576d.unbindService(this);
        m42385h();
        Log.d("PomoConnector", "Service is disconnected.");
    }

    /* renamed from: k */
    private final boolean m42388k() {
        String str = this.f62578f;
        if (str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Intent intent = new Intent();
        intent.setPackage(this.f62578f);
        intent.setAction("com.google.android.googlequicksearchbox.REQUEST_MINUS_ONE_CONTENT");
        intent.putExtra("extra_support_video", this.f62574b);
        intent.putExtra("extra_support_metrics_tracking", this.f62579g);
        return this.f62576d.bindService(intent, this, 1);
    }

    /* renamed from: a */
    public final void mo27889a(C22739j jVar) {
        Exception exc;
        C22739j jVar2;
        Queue queue;
        Queue queue2;
        synchronized (this.f62573a) {
            this.f62580h.add(jVar);
            exc = null;
            if (!this.f62583k) {
                this.f62583k = true;
                if (!m42388k()) {
                    Log.w("PomoConnector", "Failed to bind service!");
                    exc = new Exception("Failed to bind service!");
                    jVar2 = this.f62575c;
                    queue2 = this.f62580h;
                    queue = this.f62581i;
                    m42387j();
                }
            }
            jVar2 = null;
            queue2 = null;
            queue = null;
        }
        if (exc != null) {
            m42386i(exc, jVar2, queue2, queue);
        }
    }

    /* renamed from: b */
    public final void mo27890b(C22741l lVar) {
        C22739j jVar;
        Queue queue;
        Queue queue2;
        boolean z;
        Exception exc;
        synchronized (this.f62573a) {
            jVar = this.f62575c;
            queue = this.f62580h;
            queue2 = this.f62581i;
            z = true;
            exc = null;
            if (!this.f62583k) {
                this.f62583k = true;
                if (m42388k()) {
                    this.f62581i.add(lVar);
                } else {
                    Log.w("PomoConnector", "Failed to bind service!");
                    exc = new Exception("Failed to bind service!");
                    m42387j();
                }
            } else if (this.f62584l == null) {
                queue2.add(lVar);
            } else if (!queue2.isEmpty()) {
                this.f62581i.add(lVar);
            } else {
                try {
                    lVar.mo27887a(this.f62584l);
                } catch (RemoteException e) {
                    exc = e;
                    Log.e("PomoConnector", "Failed to communicate with provider.", exc);
                    m42387j();
                }
            }
            z = false;
        }
        if (exc != null) {
            m42386i(exc, jVar, queue, queue2);
            lVar.f62568d.mo57357o(exc);
        } else if (z) {
            lVar.f62568d.mo57356n(C118826c.f331422a);
        }
    }

    /* renamed from: c */
    public final void mo27891c() {
        m42384g();
        C22739j jVar = (C22739j) this.f62580h.poll();
        this.f62575c = jVar;
        if (jVar == null) {
            m42387j();
        }
    }

    /* renamed from: e */
    public final void mo27893e(boolean z) {
        synchronized (this.f62573a) {
            this.f62579g = z;
        }
    }

    /* renamed from: f */
    public final void mo27894f(String str) {
        synchronized (this.f62573a) {
            this.f62578f = str;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        RemoteException remoteException;
        C22730a aVar;
        Exception exc;
        Queue queue;
        Queue queue2;
        C22739j jVar;
        C22739j jVar2;
        Queue queue3;
        Queue queue4;
        Log.d("PomoConnector", "Service is connected.");
        synchronized (this.f62573a) {
            remoteException = null;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.gsa.launcherclient.partnertab.IPartnerTabContentManager");
                aVar = queryLocalInterface instanceof C22730a ? (C22730a) queryLocalInterface : new C22730a(iBinder);
            }
            this.f62584l = aVar;
            if (aVar == null) {
                Log.w("PomoConnector", "Service returns null interface.");
                exc = new Exception("Service returns null interface.");
                jVar = this.f62575c;
                queue2 = this.f62580h;
                queue = this.f62581i;
                m42387j();
            } else {
                exc = null;
                jVar = null;
                queue2 = null;
                queue = null;
            }
        }
        if (exc == null) {
            ArrayDeque<C22741l> arrayDeque = new ArrayDeque<>();
            synchronized (this.f62573a) {
                if (this.f62584l != null) {
                    while (!this.f62581i.isEmpty()) {
                        try {
                            ((C22741l) this.f62581i.peek()).mo27887a(this.f62584l);
                            arrayDeque.add(this.f62581i.remove());
                        } catch (RemoteException e) {
                            remoteException = e;
                            Log.e("PomoConnector", "Failed to communicate with provider.", remoteException);
                            jVar2 = this.f62575c;
                            queue4 = this.f62580h;
                            queue3 = this.f62581i;
                            m42387j();
                        }
                    }
                    jVar2 = null;
                    queue4 = null;
                    queue3 = null;
                } else {
                    Log.w("PomoConnector", "partnerTabContentManager is null!");
                    Exception exc2 = new Exception("partnerTabContentManager is null!");
                    m42387j();
                    queue4 = null;
                    queue3 = null;
                    remoteException = exc2;
                    jVar2 = null;
                }
            }
            for (C22741l lVar : arrayDeque) {
                lVar.f62568d.mo57356n(C118826c.f331422a);
            }
            if (remoteException != null) {
                m42386i(remoteException, jVar2, queue4, queue3);
            }
            synchronized (this.f62573a) {
                mo27891c();
            }
            mo27892d();
            return;
        }
        m42386i(exc, jVar, queue2, queue);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C22739j jVar;
        Queue queue;
        Queue queue2;
        Log.w("PomoConnector", "Service is disconnected unexpectedly.");
        Exception exc = new Exception("Service is disconnected unexpectedly.");
        synchronized (this.f62573a) {
            jVar = this.f62575c;
            queue = this.f62580h;
            queue2 = this.f62581i;
            m42385h();
        }
        m42386i(exc, jVar, queue, queue2);
    }

    /* renamed from: d */
    public final void mo27892d() {
        C22739j jVar;
        Queue queue;
        Queue queue2;
        synchronized (this.f62573a) {
            jVar = this.f62575c;
            if (jVar != null) {
                queue = this.f62580h;
                queue2 = this.f62581i;
                C22730a aVar = this.f62584l;
                if (aVar == null) {
                    Log.w("PomoConnector", "partnerTabContentManager is null!");
                    e = new Exception("partnerTabContentManager is null!");
                    m42387j();
                } else {
                    try {
                        jVar.mo27887a(aVar);
                        this.f62582j = this.f62577e.mo28208h("PomoConnector.onTimeOut()", 10000, new C22738i(this, this.f62575c));
                        e = null;
                    } catch (RemoteException e) {
                        e = e;
                        Log.e("PomoConnector", "Failed to communicate with provider.", e);
                        m42387j();
                    }
                }
            } else {
                return;
            }
        }
        if (e != null) {
            m42386i(e, jVar, queue, queue2);
        }
    }
}
