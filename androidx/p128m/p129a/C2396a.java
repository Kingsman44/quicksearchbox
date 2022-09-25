package androidx.p128m.p129a;

import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.m.a.a */
/* compiled from: PG */
final class C2396a extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2399d f6619a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2396a(C2399d dVar, Looper looper) {
        super(looper);
        this.f6619a = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r3 >= r1) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r4 = r2[r3];
        r5 = r4.f6621b.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r6 >= r5) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r7 = (androidx.p128m.p129a.C2398c) r4.f6621b.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r7.f6625d != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        r7.f6623b.onReceive(r11.f6628a, r4.f6620a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 1
            if (r0 == r1) goto L_0x0009
            super.handleMessage(r11)
            return
        L_0x0009:
            androidx.m.a.d r11 = r10.f6619a
        L_0x000b:
            java.util.HashMap r0 = r11.f6629b
            monitor-enter(r0)
            java.util.ArrayList r1 = r11.f6630c     // Catch:{ all -> 0x004f }
            int r1 = r1.size()     // Catch:{ all -> 0x004f }
            if (r1 > 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            return
        L_0x0018:
            androidx.m.a.b[] r2 = new androidx.p128m.p129a.C2397b[r1]     // Catch:{ all -> 0x004f }
            java.util.ArrayList r3 = r11.f6630c     // Catch:{ all -> 0x004f }
            r3.toArray(r2)     // Catch:{ all -> 0x004f }
            java.util.ArrayList r3 = r11.f6630c     // Catch:{ all -> 0x004f }
            r3.clear()     // Catch:{ all -> 0x004f }
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            r0 = 0
            r3 = 0
        L_0x0027:
            if (r3 >= r1) goto L_0x000b
            r4 = r2[r3]
            java.util.ArrayList r5 = r4.f6621b
            int r5 = r5.size()
            r6 = 0
        L_0x0032:
            if (r6 >= r5) goto L_0x004c
            java.util.ArrayList r7 = r4.f6621b
            java.lang.Object r7 = r7.get(r6)
            androidx.m.a.c r7 = (androidx.p128m.p129a.C2398c) r7
            boolean r8 = r7.f6625d
            if (r8 != 0) goto L_0x0049
            android.content.BroadcastReceiver r7 = r7.f6623b
            android.content.Context r8 = r11.f6628a
            android.content.Intent r9 = r4.f6620a
            r7.onReceive(r8, r9)
        L_0x0049:
            int r6 = r6 + 1
            goto L_0x0032
        L_0x004c:
            int r3 = r3 + 1
            goto L_0x0027
        L_0x004f:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x0052:
            throw r11
        L_0x0053:
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p128m.p129a.C2396a.handleMessage(android.os.Message):void");
    }
}
