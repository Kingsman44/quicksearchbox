package org.p5623b.p5624a;

import java.io.InputStream;

/* renamed from: org.b.a.ab */
/* compiled from: PG */
public final class C72016ab {

    /* renamed from: a */
    private final InputStream f191769a;

    /* renamed from: b */
    private final int f191770b;

    /* renamed from: c */
    private final byte[][] f191771c = new byte[11][];

    public C72016ab(InputStream inputStream, int i) {
        this.f191769a = inputStream;
        this.f191770b = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.p5623b.p5624a.C72092e mo63223a() {
        /*
            r11 = this;
            java.io.InputStream r0 = r11.f191769a
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L_0x0144
            java.io.InputStream r1 = r11.f191769a
            boolean r2 = r1 instanceof org.p5623b.p5624a.C72085cc
            r3 = 0
            if (r2 == 0) goto L_0x0017
            org.b.a.cc r1 = (org.p5623b.p5624a.C72085cc) r1
            r1.f191900a = r3
            r1.mo63267a()
        L_0x0017:
            java.io.InputStream r1 = r11.f191769a
            int r1 = org.p5623b.p5624a.C72098k.m105575b(r1, r0)
            r2 = r0 & 32
            r4 = 1
            if (r2 == 0) goto L_0x0024
            r2 = 1
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            java.io.InputStream r5 = r11.f191769a
            int r6 = r11.f191770b
            r7 = 17
            r8 = 16
            r9 = 8
            r10 = 4
            if (r1 == r10) goto L_0x003a
            if (r1 == r8) goto L_0x003a
            if (r1 == r7) goto L_0x003a
            if (r1 != r9) goto L_0x003b
            r1 = 8
        L_0x003a:
            r3 = 1
        L_0x003b:
            int r3 = org.p5623b.p5624a.C72098k.m105574a(r5, r6, r3)
            if (r3 >= 0) goto L_0x00a3
            if (r2 == 0) goto L_0x009b
            org.b.a.cc r2 = new org.b.a.cc
            java.io.InputStream r3 = r11.f191769a
            int r5 = r11.f191770b
            r2.<init>(r3, r5)
            org.b.a.ab r3 = new org.b.a.ab
            int r5 = r11.f191770b
            r3.<init>(r2, r5)
            r2 = r0 & 64
            if (r2 == 0) goto L_0x005d
            org.b.a.ag r0 = new org.b.a.ag
            r0.<init>(r1, r3)
            return r0
        L_0x005d:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0095
            if (r1 == r10) goto L_0x008f
            if (r1 == r9) goto L_0x0089
            if (r1 == r8) goto L_0x0083
            if (r1 != r7) goto L_0x006f
            org.b.a.ao r0 = new org.b.a.ao
            r0.<init>(r3)
            goto L_0x0094
        L_0x006f:
            org.b.a.h r0 = new org.b.a.h
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "unknown BER object encountered: 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0083:
            org.b.a.am r0 = new org.b.a.am
            r0.<init>(r3)
            goto L_0x0094
        L_0x0089:
            org.b.a.av r0 = new org.b.a.av
            r0.<init>(r3)
            goto L_0x0094
        L_0x008f:
            org.b.a.ak r0 = new org.b.a.ak
            r0.<init>(r3)
        L_0x0094:
            return r0
        L_0x0095:
            org.b.a.aq r0 = new org.b.a.aq
            r0.<init>(r4, r1, r3)
            return r0
        L_0x009b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "indefinite-length primitive encoding encountered"
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            org.b.a.ca r4 = new org.b.a.ca
            java.io.InputStream r5 = r11.f191769a
            int r6 = r11.f191770b
            r4.<init>(r5, r3, r6)
            r3 = r0 & 64
            if (r3 == 0) goto L_0x00ba
            org.b.a.bq r0 = new org.b.a.bq
            byte[] r3 = r4.mo63264a()
            r0.<init>(r2, r1, r3)
            return r0
        L_0x00ba:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00cd
            org.b.a.aq r0 = new org.b.a.aq
            org.b.a.ab r3 = new org.b.a.ab
            int r5 = org.p5623b.p5624a.C72090ch.m105546c(r4)
            r3.<init>(r4, r5)
            r0.<init>(r2, r1, r3)
            return r0
        L_0x00cd:
            if (r2 == 0) goto L_0x012c
            if (r1 == r10) goto L_0x011d
            if (r1 == r9) goto L_0x010e
            if (r1 == r8) goto L_0x00ff
            if (r1 != r7) goto L_0x00e6
            org.b.a.by r0 = new org.b.a.by
            org.b.a.ab r1 = new org.b.a.ab
            int r2 = org.p5623b.p5624a.C72090ch.m105546c(r4)
            r1.<init>(r4, r2)
            r0.<init>(r1)
            return r0
        L_0x00e6:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "unknown tag "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " encountered"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ff:
            org.b.a.bw r0 = new org.b.a.bw
            org.b.a.ab r1 = new org.b.a.ab
            int r2 = org.p5623b.p5624a.C72090ch.m105546c(r4)
            r1.<init>(r4, r2)
            r0.<init>(r1)
            return r0
        L_0x010e:
            org.b.a.av r0 = new org.b.a.av
            org.b.a.ab r1 = new org.b.a.ab
            int r2 = org.p5623b.p5624a.C72090ch.m105546c(r4)
            r1.<init>(r4, r2)
            r0.<init>(r1)
            return r0
        L_0x011d:
            org.b.a.ak r0 = new org.b.a.ak
            org.b.a.ab r1 = new org.b.a.ab
            int r2 = org.p5623b.p5624a.C72090ch.m105546c(r4)
            r1.<init>(r4, r2)
            r0.<init>(r1)
            return r0
        L_0x012c:
            if (r1 == r10) goto L_0x013e
            byte[][] r0 = r11.f191771c     // Catch:{ IllegalArgumentException -> 0x0135 }
            org.b.a.u r0 = org.p5623b.p5624a.C72098k.m105576c(r1, r4, r0)     // Catch:{ IllegalArgumentException -> 0x0135 }
            return r0
        L_0x0135:
            r0 = move-exception
            org.b.a.h r1 = new org.b.a.h
            java.lang.String r2 = "corrupted stream detected"
            r1.<init>(r2, r0)
            throw r1
        L_0x013e:
            org.b.a.bd r0 = new org.b.a.bd
            r0.<init>(r4)
            return r0
        L_0x0144:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5623b.p5624a.C72016ab.mo63223a():org.b.a.e");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C72093f mo63224b() {
        C72092e a = mo63223a();
        if (a == null) {
            return new C72093f(0);
        }
        C72093f fVar = new C72093f(10);
        do {
            if (a instanceof C72084cb) {
                fVar.mo63279b(((C72084cb) a).mo63230j());
            } else {
                fVar.mo63279b(a.mo63233g());
            }
            a = mo63223a();
        } while (a != null);
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C72108u mo63225c(boolean z, int i) {
        C72026al alVar;
        if (!z) {
            return new C72073bz(false, i, new C72050bc(((C72083ca) this.f191769a).mo63264a()));
        }
        C72093f b = mo63224b();
        if (this.f191769a instanceof C72085cc) {
            int i2 = b.f191912b;
            if (i2 == 1) {
                return new C72030ap(true, i, b.mo63278a(0));
            }
            if (i2 <= 0) {
                alVar = C72022ah.f191778a;
            } else {
                alVar = new C72026al(b);
            }
            return new C72030ap(false, i, alVar);
        } else if (b.f191912b == 1) {
            return new C72073bz(true, i, b.mo63278a(0));
        } else {
            return new C72073bz(false, i, C72067bt.m105495a(b));
        }
    }
}
