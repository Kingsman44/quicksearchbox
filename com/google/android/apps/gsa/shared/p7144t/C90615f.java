package com.google.android.apps.gsa.shared.p7144t;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21547d;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21548e;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21549f;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.shared.t.f */
/* compiled from: PG */
public abstract class C90615f implements Handler.Callback, C21548e, C21549f {

    /* renamed from: a */
    private static final HandlerThread f253293a = new HandlerThread("GcoreGoogleApiClient");

    /* renamed from: b */
    private static final C59071e f253294b = C59071e.m91332i("com.google.android.apps.gsa.shared.t.f");

    /* renamed from: o */
    public static final /* synthetic */ int f253295o = 0;

    /* renamed from: c */
    private final String f253296c;

    /* renamed from: d */
    private final long f253297d;

    /* renamed from: e */
    private final C69464a f253298e;

    /* renamed from: f */
    private final Object f253299f = new Object();

    /* renamed from: g */
    private volatile Looper f253300g;

    /* renamed from: h */
    private final List f253301h = new ArrayList();

    /* renamed from: i */
    public final Context f253302i;

    /* renamed from: j */
    protected final C22871g f253303j;

    /* renamed from: k */
    public volatile Handler f253304k;

    /* renamed from: l */
    public final Object f253305l = new Object();

    /* renamed from: m */
    public final Set f253306m = new HashSet();

    /* renamed from: n */
    public volatile C21529b f253307n;

    public C90615f(String str, Context context, C22871g gVar, long j, C69464a aVar) {
        this.f253296c = str;
        this.f253302i = context;
        this.f253303j = gVar;
        this.f253297d = j;
        this.f253298e = aVar;
    }

    /* renamed from: a */
    private final void mo85543a() {
        this.f253304k.removeMessages(102);
    }

    /* renamed from: b */
    private final void mo88162b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f253304k.removeMessages(103);
    }

    /* renamed from: d */
    private final void m147855d() {
        C58838bb.m90883r(this.f253304k.getLooper().getThread() == Thread.currentThread());
        this.f253307n.f59932a.mo119132g();
        mo88162b();
        mo85543a();
        m147856e();
    }

    /* renamed from: e */
    private final void m147856e() {
        synchronized (this.f253305l) {
            if (this.f253307n.f59932a.mo119133h()) {
                for (C90613d dVar : this.f253301h) {
                    C58976aa aaVar = C58975e.f156826a;
                    this.f253303j.mo28212l(dVar.f253288a, dVar);
                }
            } else {
                RemoteException remoteException = new RemoteException("Connection failed");
                for (C90613d exception : this.f253301h) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    exception.setException(remoteException);
                }
            }
            this.f253301h.clear();
        }
    }

    /* renamed from: g */
    private final void m147858g() {
        C58976aa aaVar = C58975e.f156826a;
        mo88162b();
        if (this.f253297d != Long.MAX_VALUE) {
            this.f253304k.sendEmptyMessageDelayed(103, this.f253297d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo84763c(C21547d dVar);

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 100:
                C58838bb.m90883r(this.f253304k.getLooper().getThread() == Thread.currentThread());
                if (!this.f253307n.f59932a.mo119133h() && !this.f253307n.f59932a.mo119134i()) {
                    this.f253304k.sendEmptyMessageDelayed(102, 10000);
                    SystemClock.elapsedRealtime();
                    this.f253307n.f59932a.mo119131f();
                    C58976aa aaVar = C58975e.f156826a;
                    break;
                }
            case 101:
                m147855d();
                break;
            case 102:
                C59052c cVar = (C59052c) f253294b.mo56226d();
                cVar.mo56378ag(C58975e.f156826a, this.f253296c);
                ((C59052c) cVar.mo56372aa(10598)).mo56386p("Connection timeout - disconnecting");
                m147855d();
                break;
            case 103:
                C58976aa aaVar2 = C58975e.f156826a;
                m147855d();
                break;
            case 104:
                synchronized (this.f253305l) {
                    if (this.f253306m.isEmpty()) {
                        C58976aa aaVar3 = C58975e.f156826a;
                        mo88162b();
                        m147855d();
                    } else {
                        C58976aa aaVar4 = C58975e.f156826a;
                    }
                }
                break;
        }
        return true;
    }

    /* renamed from: i */
    public final C60870cx mo84765i(Callable callable, String str) {
        C90613d dVar = new C90613d(this, callable, this.f253296c, str);
        C58976aa aaVar = C58975e.f156826a;
        m147857f();
        synchronized (this.f253305l) {
            this.f253306m.add(dVar);
            if (this.f253307n.f59932a.mo119133h()) {
                m147858g();
                this.f253303j.mo28212l(dVar.f253288a, dVar);
            } else {
                this.f253301h.add(dVar);
                if (!this.f253307n.f59932a.mo119133h() && !this.f253307n.f59932a.mo119134i() && !this.f253304k.hasMessages(100)) {
                    this.f253304k.sendEmptyMessage(100);
                }
            }
        }
        C90476a aVar = C91018d.f254254a;
        return dVar;
    }

    /* renamed from: j */
    public final Object mo84766j(Callable callable) {
        C90748e.m148224b();
        m147857f();
        Object obj = new Object();
        try {
            synchronized (this.f253305l) {
                this.f253306m.add(obj);
            }
            if (!this.f253307n.f59932a.mo119133h()) {
                ConnectionResult connectionResult = this.f253307n.mo26988b(10000, TimeUnit.MILLISECONDS).f59933a;
                if (!connectionResult.mo119068b()) {
                    int i = connectionResult.f389574c;
                    throw new C90614e("Failed to connect: " + i);
                }
            }
            m147858g();
            Object call = callable.call();
            synchronized (this.f253305l) {
                this.f253306m.remove(obj);
            }
            return call;
        } catch (Exception e) {
            throw new C90614e((Throwable) e);
        } catch (Throwable th) {
            synchronized (this.f253305l) {
                this.f253306m.remove(obj);
                throw th;
            }
        }
    }

    /* renamed from: k */
    public final void mo27006k() {
        C58976aa aaVar = C58975e.f156826a;
        mo85543a();
        m147858g();
        m147856e();
    }

    /* renamed from: l */
    public final void mo27007l() {
        C58976aa aaVar = C58975e.f156826a;
        this.f253304k.sendEmptyMessage(101);
    }

    /* renamed from: m */
    public final void mo27008m() {
        C58976aa aaVar = C58975e.f156826a;
        m147855d();
    }

    /* renamed from: f */
    private final void m147857f() {
        Looper looper;
        synchronized (this.f253299f) {
            if (this.f253307n == null) {
                if (this.f253300g != null) {
                    looper = this.f253300g;
                } else {
                    HandlerThread handlerThread = f253293a;
                    synchronized (handlerThread) {
                        if (!handlerThread.isAlive()) {
                            handlerThread.start();
                        }
                        this.f253300g = handlerThread.getLooper();
                    }
                    looper = this.f253300g;
                }
                this.f253304k = new Handler(looper, this);
                C21547d dVar = (C21547d) this.f253298e.mo17428b();
                mo84763c(dVar);
                dVar.mo26982c(this);
                dVar.mo26983d(this);
                dVar.mo26986g(new Handler(looper));
                this.f253307n = dVar.mo26989h();
            }
        }
    }
}
