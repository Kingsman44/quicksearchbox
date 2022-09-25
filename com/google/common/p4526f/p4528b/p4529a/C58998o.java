package com.google.common.p4526f.p4528b.p4529a;

import android.os.Build;
import android.util.Log;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.C59033h;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: com.google.common.f.b.a.o */
/* compiled from: PG */
final class C58998o extends C58982a {

    /* renamed from: a */
    public static final AtomicReference f156861a = new AtomicReference();

    /* renamed from: b */
    private static final AtomicLong f156862b = new AtomicLong();

    /* renamed from: c */
    private static final ConcurrentLinkedQueue f156863c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    private volatile C59033h f156864d;

    public C58998o(String str) {
        super(str);
        boolean z = true;
        boolean z2 = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        boolean z3 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        if (!"eng".equals(Build.TYPE) && !"userdebug".equals(Build.TYPE)) {
            z = false;
        }
        if (z2 || z3) {
            this.f156864d = new C58983b().mo36920a(mo56247d());
        } else if (z) {
            this.f156864d = new C59003t().mo56270b(false).mo36920a(mo56247d());
        } else {
            this.f156864d = null;
        }
    }

    /* renamed from: e */
    public static void m91184e() {
        while (true) {
            C58998o oVar = (C58998o) C58996m.f156858a.poll();
            if (oVar != null) {
                oVar.f156864d = ((C58984c) f156861a.get()).mo36920a(oVar.mo56247d());
            } else {
                m91185f();
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m91185f() {
        while (true) {
            C58997n nVar = (C58997n) f156863c.poll();
            if (nVar != null) {
                f156862b.getAndDecrement();
                C59033h hVar = nVar.f156859a;
                C59031f fVar = nVar.f156860b;
                if (fVar.mo56301W() || hVar.mo36922b(fVar.mo56309l())) {
                    hVar.mo36921a(fVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo36921a(C59031f fVar) {
        if (this.f156864d != null) {
            this.f156864d.mo36921a(fVar);
            return;
        }
        if (f156862b.incrementAndGet() > 20) {
            f156863c.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f156863c.offer(new C58997n(this, fVar));
        if (this.f156864d != null) {
            m91185f();
        }
    }

    /* renamed from: b */
    public final boolean mo36922b(Level level) {
        if (this.f156864d != null) {
            return this.f156864d.mo36922b(level);
        }
        return true;
    }

    /* renamed from: c */
    public final void mo36923c(RuntimeException runtimeException, C59031f fVar) {
        if (this.f156864d != null) {
            this.f156864d.mo36923c(runtimeException, fVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
