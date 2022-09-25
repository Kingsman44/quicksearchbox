package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143944s;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.bc */
/* compiled from: PG */
public final class C143755bc implements C143775bw, C143834w {

    /* renamed from: a */
    public final Lock f389724a;

    /* renamed from: b */
    public final Condition f389725b;

    /* renamed from: c */
    public final Context f389726c;

    /* renamed from: d */
    public final C143876h f389727d;

    /* renamed from: e */
    public final C143754bb f389728e;

    /* renamed from: f */
    final Map f389729f;

    /* renamed from: g */
    final Map f389730g = new HashMap();

    /* renamed from: h */
    final C143944s f389731h;

    /* renamed from: i */
    final Map f389732i;

    /* renamed from: j */
    final C143707a f389733j;

    /* renamed from: k */
    public volatile C143751az f389734k;

    /* renamed from: l */
    int f389735l;

    /* renamed from: m */
    final C143750ay f389736m;

    /* renamed from: n */
    final C143774bv f389737n;

    /* renamed from: o */
    private ConnectionResult f389738o = null;

    public C143755bc(Context context, C143750ay ayVar, Lock lock, Looper looper, C143876h hVar, Map map, C143944s sVar, Map map2, C143707a aVar, ArrayList arrayList, C143774bv bvVar) {
        this.f389726c = context;
        this.f389724a = lock;
        this.f389727d = hVar;
        this.f389729f = map;
        this.f389731h = sVar;
        this.f389732i = map2;
        this.f389733j = aVar;
        this.f389736m = ayVar;
        this.f389737n = bvVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C143833v) arrayList.get(i)).f389899b = this;
        }
        this.f389728e = new C143754bb(this, looper);
        this.f389725b = lock.newCondition();
        this.f389734k = new C143746au(this);
    }

    /* renamed from: a */
    public final ConnectionResult mo119174a() {
        mo119178e();
        while (this.f389734k instanceof C143745at) {
            try {
                this.f389725b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(1, 15, (PendingIntent) null, (String) null);
            }
        }
        if (this.f389734k instanceof C143734ai) {
            return ConnectionResult.f389572a;
        }
        ConnectionResult connectionResult = this.f389738o;
        return connectionResult != null ? connectionResult : new ConnectionResult(1, 13, (PendingIntent) null, (String) null);
    }

    /* renamed from: b */
    public final ConnectionResult mo119175b(long j, TimeUnit timeUnit) {
        mo119178e();
        long nanos = timeUnit.toNanos(j);
        while (this.f389734k instanceof C143745at) {
            if (nanos <= 0) {
                try {
                    mo119179f();
                    return new ConnectionResult(1, 14, (PendingIntent) null, (String) null);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(1, 15, (PendingIntent) null, (String) null);
                }
            } else {
                nanos = this.f389725b.awaitNanos(nanos);
            }
        }
        if (this.f389734k instanceof C143734ai) {
            return ConnectionResult.f389572a;
        }
        ConnectionResult connectionResult = this.f389738o;
        return connectionResult != null ? connectionResult : new ConnectionResult(1, 13, (PendingIntent) null, (String) null);
    }

    /* renamed from: c */
    public final C143824m mo119176c(C143824m mVar) {
        mVar.mo119111n();
        this.f389734k.mo119143h(mVar);
        return mVar;
    }

    /* renamed from: d */
    public final C143824m mo119177d(C143824m mVar) {
        mVar.mo119111n();
        return this.f389734k.mo119136a(mVar);
    }

    /* renamed from: e */
    public final void mo119178e() {
        this.f389734k.mo119138c();
    }

    /* renamed from: f */
    public final void mo119179f() {
        if (this.f389734k.mo119142g()) {
            this.f389730g.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo119180g(ConnectionResult connectionResult) {
        this.f389724a.lock();
        try {
            this.f389738o = connectionResult;
            this.f389734k = new C143746au(this);
            this.f389734k.mo119137b();
            this.f389725b.signalAll();
        } finally {
            this.f389724a.unlock();
        }
    }

    /* renamed from: h */
    public final boolean mo119181h() {
        return this.f389734k instanceof C143734ai;
    }

    /* renamed from: i */
    public final boolean mo119182i() {
        return this.f389734k instanceof C143745at;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo119183j(C143753ba baVar) {
        this.f389728e.sendMessage(this.f389728e.obtainMessage(1, baVar));
    }

    /* renamed from: k */
    public final void mo119184k(String str, PrintWriter printWriter) {
        String concat = str.concat("  ");
        printWriter.append(str).append("mState=").println(this.f389734k);
        for (C143841m mVar : this.f389732i.keySet()) {
            printWriter.append(str).append(mVar.f389918c).println(":");
            C143839k kVar = (C143839k) this.f389729f.get(mVar.f389917b);
            C143919bh.m233958a(kVar);
            kVar.mo119239C(concat, printWriter);
        }
    }

    /* renamed from: kq */
    public final void mo26991kq(Bundle bundle) {
        this.f389724a.lock();
        try {
            this.f389734k.mo119139d(bundle);
        } finally {
            this.f389724a.unlock();
        }
    }

    /* renamed from: kr */
    public final void mo26992kr(int i) {
        this.f389724a.lock();
        try {
            this.f389734k.mo119141f(i);
        } finally {
            this.f389724a.unlock();
        }
    }
}
