package com.google.android.apps.gsa.speech.audio;

import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.speech.audio.c */
/* compiled from: PG */
public final /* synthetic */ class C92160c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C92195f f256936a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f256937b;

    /* renamed from: c */
    public final /* synthetic */ String f256938c;

    /* renamed from: d */
    public final /* synthetic */ C92173d f256939d;

    public /* synthetic */ C92160c(C92195f fVar, byte[] bArr, String str, C92173d dVar) {
        this.f256936a = fVar;
        this.f256937b = bArr;
        this.f256938c = str;
        this.f256939d = dVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r9 = this;
            com.google.android.apps.gsa.speech.audio.f r0 = r9.f256936a
            byte[] r1 = r9.f256937b
            java.lang.String r2 = r9.f256938c
            com.google.android.apps.gsa.speech.audio.d r3 = r9.f256939d
            java.io.File r0 = r0.mo86858e(r2, r3)
            java.lang.String r2 = r0.getAbsolutePath()
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0043 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0043 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0043 }
            int r5 = r1.length     // Catch:{ IOException -> 0x0043 }
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x0043 }
            r3.write(r1)     // Catch:{ all -> 0x0025 }
            r3.flush()     // Catch:{ all -> 0x0025 }
            r3.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0059
        L_0x0025:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x002a }
            goto L_0x0042
        L_0x002a:
            r3 = move-exception
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0042 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r7 = 0
            r5[r7] = r6     // Catch:{ Exception -> 0x0042 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r8 = "addSuppressed"
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r8, r5)     // Catch:{ Exception -> 0x0042 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0042 }
            r4[r7] = r3     // Catch:{ Exception -> 0x0042 }
            r5.invoke(r1, r4)     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            throw r1     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.speech.audio.C92195f.f257041a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.android.apps.gsa.shared.s.a.a r4 = com.google.android.apps.gsa.shared.util.p7158b.C90754k.f253829b
            com.google.android.apps.gsa.shared.s.a.a r4 = com.google.android.apps.gsa.shared.util.p7158b.C90754k.f253829b
            java.lang.Object r2 = com.google.android.apps.gsa.shared.util.p7158b.C90753j.m148241c(r2)
            r4 = 12029(0x2efd, float:1.6856E-41)
            java.lang.String r5 = "Error creating file %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r1)).mo56372aa(r4)).mo56389s(r5, r2)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.C92160c.mo17947a():java.lang.Object");
    }
}
