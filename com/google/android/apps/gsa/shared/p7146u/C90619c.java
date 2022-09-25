package com.google.android.apps.gsa.shared.p7146u;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143848t;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.api.C143851w;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.u.c */
/* compiled from: PG */
public abstract class C90619c implements Handler.Callback, C143849u, C143850v {

    /* renamed from: i */
    public static final /* synthetic */ int f253313i = 0;

    /* renamed from: j */
    private static final HandlerThread f253314j = new HandlerThread("GoogleApiClient");

    /* renamed from: k */
    private static final C59071e f253315k = C59071e.m91332i("com.google.android.apps.gsa.shared.u.c");

    /* renamed from: a */
    public final String f253316a;

    /* renamed from: b */
    protected final Context f253317b;

    /* renamed from: c */
    protected final C90929bz f253318c;

    /* renamed from: d */
    public volatile C143851w f253319d;

    /* renamed from: e */
    public volatile Handler f253320e;

    /* renamed from: f */
    public final Object f253321f = new Object();

    /* renamed from: g */
    public final List f253322g = new ArrayList();

    /* renamed from: h */
    public final Set f253323h = new HashSet();

    /* renamed from: l */
    private final long f253324l;

    /* renamed from: m */
    private final Object f253325m = new Object();

    /* renamed from: n */
    private volatile Looper f253326n;

    public C90619c(String str, Context context, C90929bz bzVar, long j) {
        this.f253316a = str;
        this.f253317b = context;
        this.f253318c = bzVar;
        this.f253324l = j;
    }

    /* renamed from: a */
    private final void m147870a() {
        this.f253320e.removeMessages(102);
    }

    /* renamed from: h */
    private final void m147871h() {
        C58976aa aaVar = C58975e.f156826a;
        this.f253320e.removeMessages(103);
    }

    /* renamed from: i */
    private final void m147872i() {
        C58838bb.m90883r(this.f253320e.getLooper().getThread() == Thread.currentThread());
        this.f253319d.mo119132g();
        m147871h();
        m147870a();
        m147873j();
    }

    /* renamed from: j */
    private final void m147873j() {
        synchronized (this.f253321f) {
            if (this.f253319d.mo119133h()) {
                for (C90616a d : this.f253322g) {
                    C58976aa aaVar = C58975e.f156826a;
                    this.f253318c.mo85139d(d);
                }
            } else {
                RemoteException remoteException = new RemoteException("Connection failed");
                for (C90616a exception : this.f253322g) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    exception.setException(remoteException);
                }
            }
            this.f253322g.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo79809b(C143848t tVar);

    /* renamed from: d */
    public final void mo26993d(ConnectionResult connectionResult) {
        C58976aa aaVar = C58975e.f156826a;
        m147872i();
    }

    /* renamed from: g */
    public final void mo84773g() {
        C58976aa aaVar = C58975e.f156826a;
        m147871h();
        if (this.f253324l != Long.MAX_VALUE) {
            this.f253320e.sendEmptyMessageDelayed(103, this.f253324l);
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 100:
                C58838bb.m90883r(this.f253320e.getLooper().getThread() == Thread.currentThread());
                if (!this.f253319d.mo119133h() && !this.f253319d.mo119134i()) {
                    this.f253320e.sendEmptyMessageDelayed(102, 10000);
                    SystemClock.elapsedRealtime();
                    this.f253319d.mo119131f();
                    C58976aa aaVar = C58975e.f156826a;
                    break;
                }
            case 101:
                m147872i();
                break;
            case 102:
                C59052c cVar = (C59052c) f253315k.mo56226d();
                cVar.mo56378ag(C58975e.f156826a, this.f253316a);
                ((C59052c) cVar.mo56372aa(10615)).mo56386p("Connection timeout - disconnecting");
                m147872i();
                break;
            case 103:
                C58976aa aaVar2 = C58975e.f156826a;
                m147872i();
                break;
            case 104:
                synchronized (this.f253321f) {
                    if (this.f253323h.isEmpty()) {
                        C58976aa aaVar3 = C58975e.f156826a;
                        m147871h();
                        m147872i();
                    } else {
                        C58976aa aaVar4 = C58975e.f156826a;
                    }
                }
                break;
        }
        return true;
    }

    /* renamed from: kq */
    public final void mo26991kq(Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        m147870a();
        mo84773g();
        m147873j();
    }

    /* renamed from: kr */
    public final void mo26992kr(int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f253320e.sendEmptyMessage(101);
    }

    /* renamed from: f */
    public final void mo84772f() {
        Looper looper;
        synchronized (this.f253325m) {
            if (this.f253319d == null) {
                if (this.f253326n != null) {
                    looper = this.f253326n;
                } else {
                    HandlerThread handlerThread = f253314j;
                    synchronized (handlerThread) {
                        if (!handlerThread.isAlive()) {
                            handlerThread.start();
                        }
                        this.f253326n = handlerThread.getLooper();
                    }
                    looper = this.f253326n;
                }
                this.f253320e = new Handler(looper, this);
                C143848t tVar = new C143848t(this.f253317b);
                mo79809b(tVar);
                tVar.mo119297d(this);
                tVar.mo119298e(this);
                tVar.f389939e = new Handler(looper).getLooper();
                this.f253319d = tVar.mo119294a();
            }
        }
    }
}
