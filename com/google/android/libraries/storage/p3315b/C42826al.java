package com.google.android.libraries.storage.p3315b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60873d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.b.al */
/* compiled from: PG */
public abstract class C42826al extends C60873d implements Runnable {

    /* renamed from: a */
    public static final /* synthetic */ int f112106a = 0;

    /* renamed from: b */
    private final C42825ak f112107b;

    public C42826al(C42825ak akVar) {
        this.f112107b = akVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo45906e(C42825ak akVar);

    /* renamed from: f */
    public final void mo45911f(Executor executor) {
        executor.execute(C47810es.m84977q(this));
    }

    /* renamed from: hT */
    public final String mo45912hT() {
        String b = this.f112107b.mo45909b();
        return "query=[" + b + "]";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            java.lang.String r0 = "ASQLDB"
            java.lang.String r1 = "Query: "
            boolean r2 = r7.isCancelled()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0033
            com.google.android.libraries.storage.b.ak r2 = r7.f112107b     // Catch:{ all -> 0x0070 }
            r2.mo45910c()     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "The query's result is currently:"
            android.util.Log.v(r0, r2)     // Catch:{ all -> 0x0070 }
            com.google.android.libraries.storage.b.ak r2 = r7.f112107b     // Catch:{ all -> 0x0070 }
            android.os.CancellationSignal r3 = new android.os.CancellationSignal     // Catch:{ all -> 0x0070 }
            r3.<init>()     // Catch:{ all -> 0x0070 }
            android.database.Cursor r2 = r2.mo45908a(r3)     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = com.google.android.libraries.storage.p3315b.C42847bf.m75693f(r2)     // Catch:{ all -> 0x0070 }
            android.util.Log.v(r0, r2)     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "NOTE(b/171271240): If another thread commits in parallel with this query, the printed debug result above might be from an earlier snapshot than this query's Future<Cursor> iterates."
            android.util.Log.v(r0, r2)     // Catch:{ all -> 0x0070 }
        L_0x0033:
            com.google.android.libraries.storage.b.ak r0 = r7.f112107b     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r0.mo45909b()     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r2.<init>(r1)     // Catch:{ all -> 0x0070 }
            r2.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0070 }
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r0)     // Catch:{ all -> 0x0070 }
            com.google.android.libraries.storage.b.ak r1 = r7.f112107b     // Catch:{ all -> 0x0052 }
            r7.mo45906e(r1)     // Catch:{ all -> 0x0052 }
            r0.close()     // Catch:{ all -> 0x0070 }
            return
        L_0x0052:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0057 }
            goto L_0x006f
        L_0x0057:
            r0 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x006f }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x006f }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x006f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x006f }
            r2[r5] = r0     // Catch:{ Exception -> 0x006f }
            r3.invoke(r1, r2)     // Catch:{ Exception -> 0x006f }
        L_0x006f:
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            r7.mo57357o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.p3315b.C42826al.run():void");
    }
}
