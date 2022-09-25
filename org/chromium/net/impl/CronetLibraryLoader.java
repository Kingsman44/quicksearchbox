package org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import org.chromium.base.C72382h;
import org.chromium.base.C72387m;
import org.chromium.net.NetworkChangeNotifier;
import p000J.C0000N;

/* compiled from: PG */
public class CronetLibraryLoader {

    /* renamed from: a */
    private static final Object f192691a = new Object();

    /* renamed from: b */
    private static final String f192692b = "cronet.107.0.5284.2";

    /* renamed from: c */
    private static final String f192693c = "CronetLibraryLoader";

    /* renamed from: d */
    private static final HandlerThread f192694d = new HandlerThread("CronetInit");

    /* renamed from: e */
    private static volatile boolean f192695e = false;

    /* renamed from: f */
    private static volatile boolean f192696f;

    /* renamed from: g */
    private static final ConditionVariable f192697g = new ConditionVariable();

    /* renamed from: a */
    public static void m107130a(Context context, C72533o oVar) {
        synchronized (f192691a) {
            if (!f192696f) {
                C72382h.f192527a = context;
                HandlerThread handlerThread = f192694d;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                m107132c(new C72535q());
            }
            if (!f192695e) {
                if (oVar.mo64255b() != null) {
                    C72516cv b = oVar.mo64255b();
                    b.f192962a.loadLibrary(f192692b);
                } else {
                    System.loadLibrary(f192692b);
                }
                if ("107.0.5284.2".equals(C0000N.M6xubM8G())) {
                    C72387m.m107042c(f192693c, "Cronet version: %s, arch: %s", "107.0.5284.2", System.getProperty("os.arch"));
                    f192695e = true;
                    f192697g.open();
                } else {
                    throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", new Object[]{"107.0.5284.2", C0000N.M6xubM8G()}));
                }
            }
        }
    }

    /* renamed from: b */
    static void m107131b() {
        if (!f192696f) {
            NetworkChangeNotifier.init();
            NetworkChangeNotifier.registerToReceiveNotificationsAlways();
            f192697g.block();
            C0000N.MROCxiBo();
            f192696f = true;
        }
    }

    /* renamed from: c */
    public static void m107132c(Runnable runnable) {
        HandlerThread handlerThread = f192694d;
        if (handlerThread.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(handlerThread.getLooper()).post(runnable);
        }
    }

    private static void ensureInitializedFromNative() {
        synchronized (f192691a) {
            f192695e = true;
            f192697g.open();
        }
        m107130a(C72382h.f192527a, (C72533o) null);
    }

    private static String getDefaultUserAgent() {
        return C72514ct.m107222a(C72382h.f192527a);
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
    }
}
