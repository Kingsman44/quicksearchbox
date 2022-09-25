package com.google.android.gms.learning.internal.training;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.chromium.net.CronetEngine;

/* renamed from: com.google.android.gms.learning.internal.training.b */
/* compiled from: PG */
final class C144798b extends C144801e {

    /* renamed from: a */
    private static CronetEngine f391641a = null;

    /* renamed from: b */
    private static boolean f391642b = false;

    /* renamed from: c */
    private static boolean f391643c = false;

    /* renamed from: d */
    private final Context f391644d;

    public C144798b(Context context) {
        this.f391644d = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003b A[Catch:{ UnsatisfiedLinkError -> 0x0031, IllegalStateException -> 0x002f }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final org.chromium.net.CronetEngine m235330g(android.content.Context r4) {
        /*
            java.lang.Class<com.google.android.gms.learning.internal.training.b> r0 = com.google.android.gms.learning.internal.training.C144798b.class
            monitor-enter(r0)
            boolean r1 = f391642b     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x000b
            org.chromium.net.CronetEngine r4 = f391641a     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return r4
        L_0x000b:
            r1 = 1
            f391642b = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
            java.util.List r2 = org.chromium.net.CronetProvider.getAllProviders(r4)     // Catch:{ UnsatisfiedLinkError -> 0x0031, IllegalStateException -> 0x002f }
            com.google.android.gms.learning.internal.training.a r3 = com.google.android.gms.learning.internal.training.C144789a.f391628a     // Catch:{ UnsatisfiedLinkError -> 0x0031, IllegalStateException -> 0x002f }
            boolean r2 = com.google.common.p4522b.C58557jl.m90138s(r2, r3)     // Catch:{ UnsatisfiedLinkError -> 0x0031, IllegalStateException -> 0x002f }
            if (r2 != 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return r1
        L_0x001d:
            org.chromium.net.CronetEngine$Builder r2 = new org.chromium.net.CronetEngine$Builder     // Catch:{ UnsatisfiedLinkError -> 0x0031, IllegalStateException -> 0x002f }
            r2.<init>((android.content.Context) r4)     // Catch:{ UnsatisfiedLinkError -> 0x0031, IllegalStateException -> 0x002f }
            boolean r4 = f391643c     // Catch:{ UnsatisfiedLinkError -> 0x0031, IllegalStateException -> 0x002f }
            r2.enableQuic(r4)     // Catch:{ UnsatisfiedLinkError -> 0x0031, IllegalStateException -> 0x002f }
            org.chromium.net.CronetEngine r4 = r2.build()     // Catch:{ UnsatisfiedLinkError -> 0x0031, IllegalStateException -> 0x002f }
            f391641a = r4     // Catch:{ UnsatisfiedLinkError -> 0x0031, IllegalStateException -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return r4
        L_0x002f:
            r4 = move-exception
            goto L_0x0032
        L_0x0031:
            r4 = move-exception
        L_0x0032:
            java.lang.String r2 = "brella.CrntHttpUrlFctry"
            r3 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0042
            java.lang.String r2 = "brella.CrntHttpUrlFctry"
            java.lang.String r3 = "failed to load Cronet engine"
            android.util.Log.w(r2, r3, r4)     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return r1
        L_0x0044:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.internal.training.C144798b.m235330g(android.content.Context):org.chromium.net.CronetEngine");
    }

    /* renamed from: a */
    public final C144165j mo120224a(String str) {
        try {
            CronetEngine g = m235330g(this.f391644d);
            if (g != null) {
                return new C144166k((HttpURLConnection) g.openConnection(new URL(str)));
            }
            throw new RemoteException("failed to initialize CronetEngine");
        } catch (IOException e) {
            throw new RemoteException("unexpected IOException: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* renamed from: b */
    public final void mo120225b(boolean z) {
        synchronized (C144798b.class) {
            f391643c = z;
        }
    }

    /* renamed from: c */
    public final boolean mo120226c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo120227d() {
        return m235330g(this.f391644d) != null;
    }

    /* renamed from: e */
    public final boolean mo120228e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo120229f() {
        return false;
    }
}
