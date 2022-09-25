package com.google.android.gms.contextmanager.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.contextmanager.C144030d;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.android.p10717f.p10721d.C142628a;

/* renamed from: com.google.android.gms.contextmanager.internal.e */
/* compiled from: PG */
public final class C144063e extends C144078t {

    /* renamed from: a */
    public static final C142628a f390337a = new C144061c();

    /* renamed from: b */
    public C144030d f390338b;

    /* renamed from: c */
    public Handler f390339c;

    /* renamed from: d */
    public final Object f390340d = new Object();

    public C144063e(C144030d dVar, Looper looper) {
        this.f390338b = dVar;
        C143919bh.m233958a(looper);
        this.f390339c = new C144861c(looper);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo119619a(com.google.android.gms.contextmanager.ContextData r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f390340d
            monitor-enter(r0)
            android.os.Handler r1 = r3.f390339c     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0016
            com.google.android.gms.contextmanager.d r2 = r3.f390338b     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x000c
            goto L_0x0016
        L_0x000c:
            com.google.android.gms.contextmanager.internal.d r2 = new com.google.android.gms.contextmanager.internal.d     // Catch:{ all -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0018 }
            r1.post(r2)     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.contextmanager.internal.C144063e.mo119619a(com.google.android.gms.contextmanager.ContextData):void");
    }
}
