package com.google.android.libraries.gsa.p1859d;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;

/* renamed from: com.google.android.libraries.gsa.d.u */
/* compiled from: PG */
public class C22799u implements ServiceConnection {

    /* renamed from: a */
    private final int f62759a;

    /* renamed from: b */
    private final Handler f62760b;

    /* renamed from: c */
    private final Runnable f62761c = new C22798t(this);

    /* renamed from: e */
    public final Context f62762e;

    /* renamed from: f */
    public final String f62763f = "com.google.android.googlequicksearchbox";

    /* renamed from: g */
    public boolean f62764g;

    public C22799u(Context context, int i, Handler handler) {
        this.f62762e = context;
        this.f62759a = i;
        this.f62760b = handler;
    }

    /* renamed from: c */
    public static void m42621c(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    /* renamed from: d */
    public final void mo28148d() {
        m42621c(this.f62760b, this.f62761c);
    }

    /* renamed from: e */
    public final boolean mo28149e() {
        if (this.f62760b.getLooper() == Looper.myLooper()) {
            if (!this.f62764g) {
                try {
                    Context context = this.f62762e;
                    this.f62764g = context.bindService(C22791m.m42603h(context), this, this.f62759a);
                } catch (SecurityException e) {
                    Log.e("LauncherClient", "Unable to connect to overlay service", e);
                }
            }
            return this.f62764g;
        }
        throw new IllegalThreadStateException();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
