package com.android.p275j.p276a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.android.j.a.d */
/* compiled from: PG */
public final class C5174d {

    /* renamed from: a */
    protected static final Comparator f16437a = new C5173c();

    /* renamed from: b */
    private final List f16438b = new ArrayList();

    /* renamed from: c */
    private final List f16439c = new ArrayList(64);

    /* renamed from: d */
    private int f16440d = 0;

    /* renamed from: c */
    private final synchronized void m14115c() {
        while (this.f16440d > 4096) {
            byte[] bArr = (byte[]) this.f16438b.remove(0);
            this.f16439c.remove(bArr);
            this.f16440d -= bArr.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10256a(byte[] r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x002d
            int r0 = r4.length     // Catch:{ all -> 0x002a }
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r1) goto L_0x0009
            goto L_0x002d
        L_0x0009:
            java.util.List r1 = r3.f16438b     // Catch:{ all -> 0x002a }
            r1.add(r4)     // Catch:{ all -> 0x002a }
            java.util.List r1 = r3.f16439c     // Catch:{ all -> 0x002a }
            java.util.Comparator r2 = f16437a     // Catch:{ all -> 0x002a }
            int r1 = java.util.Collections.binarySearch(r1, r4, r2)     // Catch:{ all -> 0x002a }
            if (r1 >= 0) goto L_0x001b
            int r1 = -r1
            int r1 = r1 + -1
        L_0x001b:
            java.util.List r2 = r3.f16439c     // Catch:{ all -> 0x002a }
            r2.add(r1, r4)     // Catch:{ all -> 0x002a }
            int r4 = r3.f16440d     // Catch:{ all -> 0x002a }
            int r4 = r4 + r0
            r3.f16440d = r4     // Catch:{ all -> 0x002a }
            r3.m14115c()     // Catch:{ all -> 0x002a }
            monitor-exit(r3)
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x002d:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p275j.p276a.C5174d.mo10256a(byte[]):void");
    }

    /* renamed from: b */
    public final synchronized byte[] mo10257b(int i) {
        for (int i2 = 0; i2 < this.f16439c.size(); i2++) {
            byte[] bArr = (byte[]) this.f16439c.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.f16440d -= length;
                this.f16439c.remove(i2);
                this.f16438b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
