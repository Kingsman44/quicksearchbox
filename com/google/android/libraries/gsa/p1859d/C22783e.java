package com.google.android.libraries.gsa.p1859d;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.libraries.p10922ab.C146705a;
import com.google.android.libraries.p10922ab.C146707c;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.libraries.gsa.d.e */
/* compiled from: PG */
public final class C22783e extends C22799u {

    /* renamed from: a */
    public static C22783e f62716a;

    /* renamed from: b */
    public C146707c f62717b;

    /* renamed from: c */
    public WeakReference f62718c;

    /* renamed from: d */
    public boolean f62719d;

    public C22783e(Context context, Handler handler) {
        super(context, 33, handler);
    }

    /* renamed from: f */
    private final void m42591f(C146707c cVar) {
        this.f62717b = cVar;
        C22791m a = mo28115a();
        if (a != null) {
            C146707c cVar2 = this.f62717b;
            a.f62744e.mo28122b("Connected", cVar2 != null);
            a.f62748i = cVar2;
            if (a.f62748i == null) {
                a.f62742c.mo28140b(false);
                a.f62751l = 0;
            } else if (a.f62753n != null) {
                a.mo28132a();
            }
        }
    }

    /* renamed from: a */
    public final C22791m mo28115a() {
        WeakReference weakReference = this.f62718c;
        if (weakReference != null) {
            return (C22791m) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo28116b() {
        if (this.f62719d && this.f62717b == null) {
            mo28148d();
        }
    }

    public final void onNullBinding(ComponentName componentName) {
        m42591f((C146707c) null);
        mo28148d();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C146707c cVar;
        if (iBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.launcherclient.ILauncherOverlay");
            cVar = queryLocalInterface instanceof C146707c ? (C146707c) queryLocalInterface : new C146705a(iBinder);
        }
        m42591f(cVar);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        m42591f((C146707c) null);
        mo28116b();
    }
}
