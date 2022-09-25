package androidx.media3.common.p136b;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.common.b.aa */
/* compiled from: PG */
public final class C2602aa {

    /* renamed from: c */
    private static C2602aa f7225c;

    /* renamed from: a */
    public final Handler f7226a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList f7227b = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final Object f7228d = new Object();

    /* renamed from: e */
    private int f7229e = 0;

    private C2602aa(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        C2612ak.m6919B(context, new C2638z(this), intentFilter);
    }

    /* renamed from: b */
    public static synchronized C2602aa m6836b(Context context) {
        C2602aa aaVar;
        synchronized (C2602aa.class) {
            if (f7225c == null) {
                f7225c = new C2602aa(context);
            }
            aaVar = f7225c;
        }
        return aaVar;
    }

    /* renamed from: a */
    public final int mo6114a() {
        int i;
        synchronized (this.f7228d) {
            i = this.f7229e;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = (java.lang.ref.WeakReference) r0.next();
        r2 = (androidx.media3.exoplayer.p151k.C3242h) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.f9744a.mo7241g(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r3.f7227b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f7227b.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6115c(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f7228d
            monitor-enter(r0)
            int r1 = r3.f7229e     // Catch:{ all -> 0x0033 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0009:
            r3.f7229e = r4     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.f7227b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.media3.exoplayer.k.h r2 = (androidx.media3.exoplayer.p151k.C3242h) r2
            if (r2 == 0) goto L_0x002c
            androidx.media3.exoplayer.k.j r1 = r2.f9744a
            r1.mo7241g(r4)
            goto L_0x0012
        L_0x002c:
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.f7227b
            r2.remove(r1)
            goto L_0x0012
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0036:
            throw r4
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.p136b.C2602aa.mo6115c(int):void");
    }
}
