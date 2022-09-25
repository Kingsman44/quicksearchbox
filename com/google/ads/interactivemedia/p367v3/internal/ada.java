package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Looper;
import android.os.SystemClock;
import android.support.p033v7.widget.LinearLayoutManager;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ada */
/* compiled from: PG */
public final class ada implements adb {

    /* renamed from: a */
    public static final acu f20338a = new acu(2, -9223372036854775807L);

    /* renamed from: b */
    public static final acu f20339b = new acu(3, -9223372036854775807L);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ExecutorService f20340c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public acv f20341d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public IOException f20342e;

    public ada(String str) {
        this.f20340c = aeu.m18546p(str);
    }

    /* renamed from: b */
    public static acu m18269b(boolean z, long j) {
        return new acu(z ? 1 : 0, j);
    }

    /* renamed from: a */
    public final void mo14468a() {
        mo14476j(LinearLayoutManager.INVALID_OFFSET);
    }

    /* renamed from: c */
    public final boolean mo14469c() {
        return this.f20342e != null;
    }

    /* renamed from: d */
    public final void mo14470d() {
        this.f20342e = null;
    }

    /* renamed from: e */
    public final long mo14471e(acw acw, act act, int i) {
        Looper myLooper = Looper.myLooper();
        ary.m19466s(myLooper);
        this.f20342e = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new acv(this, myLooper, acw, act, i, elapsedRealtime).mo14460b(0);
        return elapsedRealtime;
    }

    /* renamed from: f */
    public final boolean mo14472f() {
        return this.f20341d != null;
    }

    /* renamed from: g */
    public final void mo14473g() {
        acv acv = this.f20341d;
        ary.m19466s(acv);
        acv.mo14461c(false);
    }

    /* renamed from: h */
    public final void mo14474h() {
        mo14475i((acx) null);
    }

    /* renamed from: i */
    public final void mo14475i(acx acx) {
        acv acv = this.f20341d;
        if (acv != null) {
            acv.mo14461c(true);
        }
        if (acx != null) {
            this.f20340c.execute(new acy(acx));
        }
        this.f20340c.shutdown();
    }

    /* renamed from: j */
    public final void mo14476j(int i) {
        IOException iOException = this.f20342e;
        if (iOException == null) {
            acv acv = this.f20341d;
            if (acv != null) {
                if (i == Integer.MIN_VALUE) {
                    i = acv.f20327a;
                }
                acv.mo14459a(i);
                return;
            }
            return;
        }
        throw iOException;
    }
}
