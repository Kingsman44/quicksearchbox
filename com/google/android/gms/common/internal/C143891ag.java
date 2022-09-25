package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.ag */
/* compiled from: PG */
public abstract class C143891ag {

    /* renamed from: a */
    public static final Object f390079a = new Object();

    /* renamed from: b */
    public static HandlerThread f390080b;

    /* renamed from: c */
    private static C143894aj f390081c;

    /* renamed from: a */
    public static C143891ag m233922a(Context context) {
        synchronized (f390079a) {
            if (f390081c == null) {
                f390081c = new C143894aj(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return f390081c;
    }

    /* renamed from: b */
    public abstract boolean mo119403b(C143890af afVar, ServiceConnection serviceConnection, String str, Executor executor);

    /* renamed from: c */
    public final void mo119404c(ComponentName componentName, ServiceConnection serviceConnection) {
        mo119405d(new C143890af(componentName), serviceConnection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo119405d(C143890af afVar, ServiceConnection serviceConnection);

    /* renamed from: e */
    public final void mo119406e(String str, String str2, int i, ServiceConnection serviceConnection, boolean z) {
        mo119405d(new C143890af(str, str2, i, z), serviceConnection);
    }
}
