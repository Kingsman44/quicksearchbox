package com.google.android.gms.common.p10781d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.gms.common.internal.C143895ak;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10782e.C143873c;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.common.d.a */
/* compiled from: PG */
public final class C143860a {

    /* renamed from: b */
    private static final Object f389955b = new Object();

    /* renamed from: c */
    private static volatile C143860a f389956c;

    /* renamed from: a */
    public final ConcurrentHashMap f389957a = new ConcurrentHashMap();

    private C143860a() {
    }

    /* renamed from: a */
    public static C143860a m233845a() {
        if (f389956c == null) {
            synchronized (f389955b) {
                if (f389956c == null) {
                    f389956c = new C143860a();
                }
            }
        }
        C143860a aVar = f389956c;
        C143919bh.m233958a(aVar);
        return aVar;
    }

    /* renamed from: f */
    private static void m233846f(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: g */
    private static boolean m233847g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof C143895ak);
    }

    /* renamed from: b */
    public final void mo119311b(Context context, ServiceConnection serviceConnection) {
        if (!m233847g(serviceConnection) || !this.f389957a.containsKey(serviceConnection)) {
            m233846f(context, serviceConnection);
            return;
        }
        try {
            m233846f(context, (ServiceConnection) this.f389957a.get(serviceConnection));
        } finally {
            this.f389957a.remove(serviceConnection);
        }
    }

    /* renamed from: c */
    public final void mo119312c(Context context, ServiceConnection serviceConnection) {
        try {
            mo119311b(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: d */
    public final boolean mo119313d(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo119314e(context, context.getClass().getName(), intent, serviceConnection, i, (Executor) null);
    }

    /* renamed from: e */
    public final boolean mo119314e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C143873c.f389983a.mo119351a(context).mo119347a(packageName, 0).flags & C89885b.NOW_VALUE) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m233847g(serviceConnection)) {
            return m233848h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f389957a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean h = m233848h(context, intent, serviceConnection, i, executor);
            if (h) {
                return h;
            }
            return false;
        } finally {
            this.f389957a.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: h */
    private static final boolean m233848h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (executor != null) {
            return context.bindService(intent, i, executor, serviceConnection);
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
