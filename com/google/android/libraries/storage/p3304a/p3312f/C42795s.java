package com.google.android.libraries.storage.p3304a.p3312f;

import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.p3306b.C42737a;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.storage.a.f.s */
/* compiled from: PG */
public final class C42795s implements C42797g {

    /* renamed from: a */
    public C42737a[] f112059a;

    /* renamed from: b */
    private final MessageLite f112060b;

    public C42795s(MessageLite messageLite) {
        this.f112060b = messageLite;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0066 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo34512a(com.google.android.libraries.storage.p3304a.C42776f r9) {
        /*
            r8 = this;
            android.net.Uri r0 = r9.f112043f
            android.net.Uri r0 = com.google.android.libraries.storage.p3304a.p3312f.C42794r.m75566a(r0)
            com.google.android.libraries.storage.a.g.b r1 = r9.f112039b
            java.io.OutputStream r1 = r1.mo45828g(r0)
            java.util.List r1 = r9.mo45871a(r1)
            com.google.android.libraries.storage.a.b.a[] r2 = r8.f112059a
            r3 = 0
            if (r2 == 0) goto L_0x0020
            r4 = 0
        L_0x0016:
            if (r4 > 0) goto L_0x0020
            r5 = r2[r4]
            r5.mo45838a(r1)
            int r4 = r4 + 1
            goto L_0x0016
        L_0x0020:
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0067 }
            java.io.OutputStream r1 = (java.io.OutputStream) r1     // Catch:{ Exception -> 0x0067 }
            com.google.protobuf.MessageLite r2 = r8.f112060b     // Catch:{ all -> 0x0048 }
            r2.writeTo((java.io.OutputStream) r1)     // Catch:{ all -> 0x0048 }
            com.google.android.libraries.storage.a.b.a[] r2 = r8.f112059a     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x003a
            r4 = 0
        L_0x0030:
            if (r4 > 0) goto L_0x003a
            r5 = r2[r4]     // Catch:{ all -> 0x0048 }
            r5.mo45839b()     // Catch:{ all -> 0x0048 }
            int r4 = r4 + 1
            goto L_0x0030
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ Exception -> 0x0067 }
        L_0x003f:
            com.google.android.libraries.storage.a.g.b r1 = r9.f112039b
            android.net.Uri r9 = r9.f112043f
            r1.mo45833m(r0, r9)
            r9 = 0
            return r9
        L_0x0048:
            r2 = move-exception
            if (r1 == 0) goto L_0x0066
            r1.close()     // Catch:{ all -> 0x004f }
            goto L_0x0066
        L_0x004f:
            r1 = move-exception
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0066 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r5[r3] = r6     // Catch:{ Exception -> 0x0066 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r7, r5)     // Catch:{ Exception -> 0x0066 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0066 }
            r4[r3] = r1     // Catch:{ Exception -> 0x0066 }
            r5.invoke(r2, r4)     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            throw r2     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            com.google.android.libraries.storage.a.g.b r9 = r9.f112039b     // Catch:{ FileNotFoundException -> 0x006e }
            r9.mo45832l(r0)     // Catch:{ FileNotFoundException -> 0x006e }
            goto L_0x006f
        L_0x006e:
        L_0x006f:
            boolean r9 = r1 instanceof java.io.IOException
            if (r9 == 0) goto L_0x0076
            java.io.IOException r1 = (java.io.IOException) r1
            throw r1
        L_0x0076:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r1)
            goto L_0x007d
        L_0x007c:
            throw r9
        L_0x007d:
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.p3304a.p3312f.C42795s.mo34512a(com.google.android.libraries.storage.a.f):java.lang.Object");
    }
}
