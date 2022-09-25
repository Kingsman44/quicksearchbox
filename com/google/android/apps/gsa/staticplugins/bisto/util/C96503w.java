package com.google.android.apps.gsa.staticplugins.bisto.util;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.w */
/* compiled from: PG */
public final class C96503w {

    /* renamed from: a */
    private static final C59071e f269988a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.w");

    /* renamed from: b */
    private final C68214a f269989b;

    /* renamed from: c */
    private final ByteBuffer f269990c = ByteBuffer.allocate(960000);

    /* renamed from: d */
    private final String f269991d;

    /* renamed from: e */
    private boolean f269992e;

    /* renamed from: f */
    private int f269993f;

    /* renamed from: g */
    private final WeakReference f269994g;

    public C96503w(C68214a aVar, String str, C96502v vVar) {
        this.f269989b = aVar;
        this.f269991d = str;
        this.f269994g = new WeakReference(vVar);
    }

    /* renamed from: e */
    private static boolean m159882e(int i, int i2, int i3) {
        return i2 <= i && i < i3;
    }

    /* renamed from: a */
    public final synchronized int mo90186a() {
        return this.f269990c.position();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo90187b() {
        if (this.f269992e) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        this.f269992e = true;
        if (this.f269994g.get() != null) {
            ((C96502v) this.f269994g.get()).mo88859a(this.f269990c, this.f269993f, mo90186a() - this.f269993f, true);
        }
        this.f269993f = 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo90188c(byte[] r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "Cant read "
            monitor-enter(r6)
            r1 = 3200(0xc80, float:4.484E-42)
            if (r8 > r1) goto L_0x0095
            boolean r0 = r6.f269992e     // Catch:{ all -> 0x0093 }
            r1 = 0
            if (r0 == 0) goto L_0x0010
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0093 }
            monitor-exit(r6)
            return r1
        L_0x0010:
            r0 = 1
            if (r8 > 0) goto L_0x0015
            monitor-exit(r6)
            return r0
        L_0x0015:
            int r2 = r6.mo90186a()     // Catch:{ all -> 0x0093 }
            int r3 = r2 + r8
            java.nio.ByteBuffer r4 = r6.f269990c     // Catch:{ all -> 0x0093 }
            int r4 = r4.capacity()     // Catch:{ all -> 0x0093 }
            r5 = 5
            if (r3 <= r4) goto L_0x0052
            com.google.common.f.e r8 = f269988a     // Catch:{ all -> 0x0093 }
            com.google.common.f.x r8 = r8.mo56226d()     // Catch:{ all -> 0x0093 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0093 }
            java.lang.String r4 = "CaptureBuffer"
            r8.mo56378ag(r3, r4)     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "Closing buffer because it's now full."
            r4 = 17127(0x42e7, float:2.4E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x0093 }
            dagger.a r8 = r6.f269989b     // Catch:{ all -> 0x0093 }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ all -> 0x0093 }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.c r8 = (com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c) r8     // Catch:{ all -> 0x0093 }
            r8.mo89096a(r5)     // Catch:{ all -> 0x0093 }
            java.nio.ByteBuffer r8 = r6.f269990c     // Catch:{ all -> 0x0093 }
            int r3 = r8.capacity()     // Catch:{ all -> 0x0093 }
            int r3 = r3 - r2
            r8.put(r7, r1, r3)     // Catch:{ all -> 0x0093 }
            r6.mo90187b()     // Catch:{ all -> 0x0093 }
            monitor-exit(r6)
            return r0
        L_0x0052:
            java.nio.ByteBuffer r3 = r6.f269990c     // Catch:{ all -> 0x0093 }
            r3.put(r7, r1, r8)     // Catch:{ all -> 0x0093 }
            java.lang.ref.WeakReference r7 = r6.f269994g     // Catch:{ all -> 0x0093 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x0093 }
            if (r7 == 0) goto L_0x0072
            java.lang.ref.WeakReference r7 = r6.f269994g     // Catch:{ all -> 0x0093 }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x0093 }
            com.google.android.apps.gsa.staticplugins.bisto.util.v r7 = (com.google.android.apps.gsa.staticplugins.bisto.util.C96502v) r7     // Catch:{ all -> 0x0093 }
            java.nio.ByteBuffer r3 = r6.f269990c     // Catch:{ all -> 0x0093 }
            r7.mo88859a(r3, r2, r8, r1)     // Catch:{ all -> 0x0093 }
            int r7 = r6.mo90186a()     // Catch:{ all -> 0x0093 }
            r6.f269993f = r7     // Catch:{ all -> 0x0093 }
        L_0x0072:
            int r7 = r6.f269993f     // Catch:{ all -> 0x0093 }
            r8 = 800000(0xc3500, float:1.121039E-39)
            boolean r8 = m159882e(r8, r2, r7)     // Catch:{ all -> 0x0093 }
            if (r8 != 0) goto L_0x0086
            r8 = 928000(0xe2900, float:1.300405E-39)
            boolean r7 = m159882e(r8, r2, r7)     // Catch:{ all -> 0x0093 }
            if (r7 == 0) goto L_0x0091
        L_0x0086:
            dagger.a r7 = r6.f269989b     // Catch:{ all -> 0x0093 }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ all -> 0x0093 }
            com.google.android.apps.gsa.staticplugins.bisto.b.b.c r7 = (com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c) r7     // Catch:{ all -> 0x0093 }
            r7.mo89096a(r5)     // Catch:{ all -> 0x0093 }
        L_0x0091:
            monitor-exit(r6)
            return r0
        L_0x0093:
            r7 = move-exception
            goto L_0x00ac
        L_0x0095:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r1.<init>(r0)     // Catch:{ all -> 0x0093 }
            r1.append(r8)     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = " from a buffer of length 3200"
            r1.append(r8)     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x0093 }
            r7.<init>(r8)     // Catch:{ all -> 0x0093 }
            throw r7     // Catch:{ all -> 0x0093 }
        L_0x00ac:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.util.C96503w.mo90188c(byte[], int):boolean");
    }

    /* renamed from: d */
    public final synchronized boolean mo90189d() {
        return this.f269992e;
    }

    public final String toString() {
        String str = this.f269991d;
        return "[CaptureBuffer: tag=" + str + "]";
    }
}
