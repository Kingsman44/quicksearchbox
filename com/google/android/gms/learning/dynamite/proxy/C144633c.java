package com.google.android.gms.learning.dynamite.proxy;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.gms.learning.internal.C144778j;
import com.google.common.base.C58887cx;
import com.google.common.base.C58889cz;
import java.util.List;

/* renamed from: com.google.android.gms.learning.dynamite.proxy.c */
/* compiled from: PG */
final class C144633c extends C144638h {

    /* renamed from: a */
    public final String f391341a;

    /* renamed from: b */
    private final C144778j f391342b;

    /* renamed from: c */
    private final C58889cz f391343c;

    /* renamed from: d */
    private final Object f391344d;

    /* renamed from: e */
    private final C144652v f391345e;

    /* renamed from: f */
    private boolean f391346f = false;

    /* renamed from: g */
    private final List f391347g;

    public C144633c(String str, C144778j jVar, C58889cz czVar, Object obj, List list, C144652v vVar) {
        this.f391341a = str;
        this.f391342b = jVar;
        this.f391343c = czVar;
        this.f391344d = obj;
        this.f391347g = list;
        this.f391345e = vVar;
        synchronized (obj) {
            list.add(this);
        }
    }

    /* renamed from: a */
    public final void mo120088a(C143773bu buVar) {
        mo120089b(new C144632b(buVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo120089b(Runnable runnable) {
        synchronized (this.f391344d) {
            if (this.f391346f) {
                runnable.run();
                return;
            }
            try {
                this.f391342b.mo120197a();
            } catch (RemoteException | RuntimeException e) {
                try {
                    Log.w("ExmplStrChkngIterator", "Failed to call close() on app's iterator", e);
                    if (e instanceof RuntimeException) {
                        this.f391345e.mo120101a(983, this.f391341a);
                    }
                } catch (Throwable th) {
                    this.f391347g.remove(this);
                    this.f391346f = true;
                    runnable.run();
                    throw th;
                }
            }
            this.f391347g.remove(this);
            this.f391346f = true;
            runnable.run();
        }
    }

    /* renamed from: c */
    public final void mo120090c(C144642l lVar, int i) {
        long a = this.f391343c.mo26884a();
        synchronized (this.f391344d) {
            if (this.f391346f) {
                try {
                    Log.w("ExmplStrChkngIterator", "next() called after close()");
                    lVar.mo120097f(new Status(1, 8, "next() called after close()", (PendingIntent) null, (ConnectionResult) null), 0, this.f391343c.mo26884a() - a);
                } catch (RemoteException e) {
                    Log.w("ExmplStrChkngIterator", "Failed to call onIteratorNextFailure on AIDL callback", e);
                }
            } else {
                try {
                    this.f391342b.mo120198b(new C144635e(lVar, i, this, this.f391343c, a));
                } catch (RemoteException | RuntimeException e2) {
                    Log.w("ExmplStrChkngIterator", "Failed to call next() on app's iterator", e2);
                    if (e2 instanceof RuntimeException) {
                        this.f391345e.mo120101a(989, this.f391341a);
                    }
                    try {
                        lVar.mo120097f(new Status(1, true != (e2 instanceof RemoteException) ? 10 : 8, C58887cx.m90975b(e2), (PendingIntent) null, (ConnectionResult) null), 0, this.f391343c.mo26884a() - a);
                    } catch (RemoteException e3) {
                        Log.w("ExmplStrChkngIterator", "Failed to call onIteratorNextFailure on AIDL callback", e3);
                    }
                    mo120089b(C144631a.f391339a);
                }
            }
        }
    }
}
