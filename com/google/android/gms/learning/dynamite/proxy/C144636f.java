package com.google.android.gms.learning.dynamite.proxy;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.internal.C144778j;
import com.google.android.gms.learning.internal.C144780l;
import com.google.common.base.C58889cz;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.f */
/* compiled from: PG */
final class C144636f extends C144780l {

    /* renamed from: a */
    private final String f391358a;

    /* renamed from: b */
    private final C144645o f391359b;

    /* renamed from: c */
    private final AtomicBoolean f391360c = new AtomicBoolean(false);

    /* renamed from: d */
    private final long f391361d;

    /* renamed from: e */
    private final C58889cz f391362e;

    /* renamed from: f */
    private final Object f391363f;

    /* renamed from: g */
    private final List f391364g;

    /* renamed from: h */
    private final C144652v f391365h;

    public C144636f(String str, C144645o oVar, long j, C58889cz czVar, Object obj, List list, C144652v vVar) {
        this.f391358a = str;
        this.f391359b = oVar;
        this.f391361d = j;
        this.f391362e = czVar;
        this.f391363f = obj;
        this.f391364g = list;
        this.f391365h = vVar;
    }

    /* renamed from: a */
    public final void mo120094a(Status status, long j) {
        if (this.f391360c.getAndSet(true)) {
            Log.w("ExmplStrQryCallback", "Ignoring onStartQueryFailure, result already returned!");
            return;
        }
        try {
            this.f391359b.mo120098e(status, j, this.f391362e.mo26884a() - this.f391361d);
        } catch (RemoteException e) {
            Log.w("ExmplStrQryCallback", "Failed to call onStartQueryFailure on AIDL callback", e);
        }
    }

    /* renamed from: b */
    public final void mo120095b(C144778j jVar, long j) {
        C144633c cVar;
        if (this.f391360c.getAndSet(true)) {
            Log.w("ExmplStrQryCallback", "Ignoring onStartQuerySuccess, result already returned!");
            return;
        }
        synchronized (this.f391363f) {
            cVar = new C144633c(this.f391358a, jVar, this.f391362e, this.f391363f, this.f391364g, this.f391365h);
        }
        try {
            this.f391359b.mo120099f(cVar, j, this.f391362e.mo26884a() - this.f391361d);
        } catch (RemoteException e) {
            Log.w("ExmplStrQryCallback", "Failed to call onStartQuerySuccess on AIDL callback", e);
            cVar.mo120089b(C144631a.f391339a);
        }
    }
}
