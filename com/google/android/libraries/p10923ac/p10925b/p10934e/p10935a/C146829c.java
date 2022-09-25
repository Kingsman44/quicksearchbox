package com.google.android.libraries.p10923ac.p10925b.p10934e.p10935a;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146815l;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146855ay;
import com.google.android.libraries.p10923ac.p10925b.p10940g.C147052a;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.ac.b.e.a.c */
/* compiled from: PG */
public final class C146829c implements C147052a {

    /* renamed from: a */
    private final C146855ay f396388a;

    /* renamed from: b */
    private final Account f396389b;

    /* renamed from: c */
    private final int f396390c;

    /* renamed from: d */
    private final int f396391d;

    /* renamed from: e */
    private final C68214a f396392e;

    /* renamed from: f */
    private final C146815l f396393f;

    /* renamed from: g */
    private final C147116m f396394g;

    /* renamed from: h */
    private final String f396395h;

    public C146829c(C68214a aVar, C146855ay ayVar, C147116m mVar, String str, Account account, int i, int i2, C146815l lVar) {
        this.f396388a = ayVar;
        this.f396389b = account;
        this.f396390c = i;
        this.f396391d = i2;
        this.f396392e = aVar;
        this.f396394g = mVar;
        this.f396395h = str;
        this.f396393f = lVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0131 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r10 = this;
            dagger.a r0 = r10.f396392e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.ac.d.b.b.d.m r0 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r0
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r10.f396390c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            int r3 = r10.f396391d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "Reading latest footprint from %s/%s."
            r0.mo124065h(r3, r2)
            r0 = 0
            com.google.android.libraries.ac.b.e.ay r2 = r10.f396388a     // Catch:{ IOException -> 0x0134 }
            android.accounts.Account r3 = r10.f396389b     // Catch:{ IOException -> 0x0134 }
            int r6 = r10.f396390c     // Catch:{ IOException -> 0x0134 }
            int r7 = r10.f396391d     // Catch:{ IOException -> 0x0134 }
            com.google.android.libraries.ac.b.e.az r0 = r2.mo123776a(r3, r6, r7)     // Catch:{ IOException -> 0x0134 }
            com.google.android.libraries.ac.b.j.m r2 = r10.f396394g     // Catch:{ IOException -> 0x0134 }
            java.lang.String r3 = r10.f396395h     // Catch:{ IOException -> 0x0134 }
            android.accounts.Account r6 = r10.f396389b     // Catch:{ IOException -> 0x0134 }
            int r7 = r10.f396390c     // Catch:{ IOException -> 0x0134 }
            int r8 = r10.f396391d     // Catch:{ IOException -> 0x0134 }
            com.google.protos.aw.b.ao r9 = com.google.protos.p4895aw.p4902b.C63978ao.SYNC_LATEST_PER_SECONDARY_ID     // Catch:{ IOException -> 0x0134 }
            com.google.protos.aw.b.p r7 = com.google.android.libraries.p10923ac.p10925b.p10934e.C146854ax.m239334d(r7, r8, r9)     // Catch:{ IOException -> 0x0134 }
            com.google.android.libraries.ac.b.j.i r2 = r2.mo123933a(r3, r6, r7)     // Catch:{ IOException -> 0x0134 }
            r3 = 3
            if (r2 != 0) goto L_0x0073
            dagger.a r2 = r10.f396392e     // Catch:{ IOException -> 0x0134 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ IOException -> 0x0134 }
            com.google.android.libraries.ac.d.b.b.d.m r2 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r2     // Catch:{ IOException -> 0x0134 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0134 }
            java.lang.String r6 = r10.f396395h     // Catch:{ IOException -> 0x0134 }
            r3[r4] = r6     // Catch:{ IOException -> 0x0134 }
            int r6 = r10.f396390c     // Catch:{ IOException -> 0x0134 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x0134 }
            r3[r5] = r6     // Catch:{ IOException -> 0x0134 }
            int r6 = r10.f396391d     // Catch:{ IOException -> 0x0134 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x0134 }
            r3[r1] = r6     // Catch:{ IOException -> 0x0134 }
            java.lang.String r6 = "%s is not subscribed to corpus=%d, datatype=%d, returning empty result."
            r2.mo124067j(r6, r3)     // Catch:{ IOException -> 0x0134 }
            com.google.android.libraries.ac.b.c.b.n r1 = com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146817n.f396378a     // Catch:{ IOException -> 0x0134 }
            if (r0 != 0) goto L_0x006f
            goto L_0x010f
        L_0x006f:
            r0.close()
            return r1
        L_0x0073:
            com.google.android.libraries.ac.b.j.m r6 = r10.f396394g     // Catch:{ IOException -> 0x0134 }
            java.lang.String r7 = r2.mo123930h()     // Catch:{ IOException -> 0x0134 }
            android.accounts.Account r8 = r2.mo123925d()     // Catch:{ IOException -> 0x0134 }
            com.google.protos.aw.b.p r9 = r2.mo123928f()     // Catch:{ IOException -> 0x0134 }
            r6.mo123939g(r7, r8, r9)     // Catch:{ IOException -> 0x0134 }
            com.google.protos.aw.b.m r2 = r2.mo123926e()     // Catch:{ IOException -> 0x0134 }
            com.google.android.libraries.ac.b.c.b.l r2 = com.google.android.libraries.p10923ac.p10925b.p10934e.C146854ax.m239332b(r2)     // Catch:{ IOException -> 0x0134 }
            com.google.android.libraries.ac.b.c.b.l r6 = com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146815l.f396375a     // Catch:{ IOException -> 0x0134 }
            boolean r6 = r6.equals(r2)     // Catch:{ IOException -> 0x0134 }
            if (r6 == 0) goto L_0x00c0
            dagger.a r2 = r10.f396392e     // Catch:{ IOException -> 0x0134 }
            java.lang.Object r2 = r2.mo27525b()     // Catch:{ IOException -> 0x0134 }
            com.google.android.libraries.ac.d.b.b.d.m r2 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r2     // Catch:{ IOException -> 0x0134 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x0134 }
            java.lang.String r6 = r10.f396395h     // Catch:{ IOException -> 0x0134 }
            r3[r4] = r6     // Catch:{ IOException -> 0x0134 }
            int r6 = r10.f396390c     // Catch:{ IOException -> 0x0134 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x0134 }
            r3[r5] = r6     // Catch:{ IOException -> 0x0134 }
            int r6 = r10.f396391d     // Catch:{ IOException -> 0x0134 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x0134 }
            r3[r1] = r6     // Catch:{ IOException -> 0x0134 }
            java.lang.String r6 = "%s subscription filter for corpus=%d, datatype=%d is NONE, returning empty result."
            r2.mo124064g(r6, r3)     // Catch:{ IOException -> 0x0134 }
            com.google.android.libraries.ac.b.c.b.n r1 = com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146817n.f396378a     // Catch:{ IOException -> 0x0134 }
            if (r0 != 0) goto L_0x00bc
            goto L_0x010f
        L_0x00bc:
            r0.close()
            return r1
        L_0x00c0:
            com.google.android.libraries.ac.b.i.ar r3 = r0.mo123790m()     // Catch:{ IOException -> 0x0134 }
            com.google.android.libraries.ac.b.i.aw r3 = r3.mo123904b()     // Catch:{ IOException -> 0x0134 }
            com.google.common.b.gp r6 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x0114 }
            com.google.android.libraries.ac.b.c.b.l r7 = r10.f396393f     // Catch:{ all -> 0x0114 }
            java.lang.String r8 = r10.f396395h     // Catch:{ all -> 0x0114 }
            java.util.List r7 = r0.mo123784g(r3, r7, r8)     // Catch:{ all -> 0x0114 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0114 }
        L_0x00d8:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0114 }
            if (r8 == 0) goto L_0x00f8
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0114 }
            com.google.android.libraries.ac.b.c.b.m r8 = (com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146816m) r8     // Catch:{ all -> 0x0114 }
            byte[] r9 = r8.mo123685c()     // Catch:{ all -> 0x0114 }
            if (r9 == 0) goto L_0x00f4
            byte[] r9 = r8.mo123685c()     // Catch:{ all -> 0x0114 }
            boolean r9 = r2.mo123710c(r9)     // Catch:{ all -> 0x0114 }
            if (r9 == 0) goto L_0x00d8
        L_0x00f4:
            r6.mo55395g(r8)     // Catch:{ all -> 0x0114 }
            goto L_0x00d8
        L_0x00f8:
            r3.mo123901j()     // Catch:{ all -> 0x0114 }
            com.google.common.b.gu r2 = r6.mo55394f()     // Catch:{ all -> 0x0114 }
            com.google.android.libraries.ac.b.c.a.h r6 = r0.mo123777a(r3)     // Catch:{ all -> 0x0114 }
            com.google.android.libraries.ac.b.c.b.n r2 = com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146817n.m239253c(r2, r6)     // Catch:{ all -> 0x0114 }
            if (r3 == 0) goto L_0x010c
            r3.close()     // Catch:{ IOException -> 0x0134 }
        L_0x010c:
            if (r0 != 0) goto L_0x0110
            r1 = r2
        L_0x010f:
            return r1
        L_0x0110:
            r0.close()
            return r2
        L_0x0114:
            r2 = move-exception
            if (r3 == 0) goto L_0x0131
            r3.close()     // Catch:{ all -> 0x011b }
            goto L_0x0131
        L_0x011b:
            r3 = move-exception
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0131 }
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            r6[r4] = r7     // Catch:{ Exception -> 0x0131 }
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            java.lang.String r8 = "addSuppressed"
            java.lang.reflect.Method r6 = r7.getDeclaredMethod(r8, r6)     // Catch:{ Exception -> 0x0131 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0131 }
            r7[r4] = r3     // Catch:{ Exception -> 0x0131 }
            r6.invoke(r2, r7)     // Catch:{ Exception -> 0x0131 }
        L_0x0131:
            throw r2     // Catch:{ IOException -> 0x0134 }
        L_0x0132:
            r1 = move-exception
            goto L_0x0155
        L_0x0134:
            r2 = move-exception
            com.google.android.libraries.ac.a.e r3 = new com.google.android.libraries.ac.a.e     // Catch:{ all -> 0x0132 }
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0132 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0132 }
            int r7 = r10.f396390c     // Catch:{ all -> 0x0132 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0132 }
            r1[r4] = r7     // Catch:{ all -> 0x0132 }
            int r4 = r10.f396391d     // Catch:{ all -> 0x0132 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0132 }
            r1[r5] = r4     // Catch:{ all -> 0x0132 }
            java.lang.String r4 = "Failed to read footprint from %s/%s."
            java.lang.String r1 = java.lang.String.format(r6, r4, r1)     // Catch:{ all -> 0x0132 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0132 }
            throw r3     // Catch:{ all -> 0x0132 }
        L_0x0155:
            if (r0 == 0) goto L_0x015a
            r0.close()
        L_0x015a:
            goto L_0x015c
        L_0x015b:
            throw r1
        L_0x015c:
            goto L_0x015b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10934e.p10935a.C146829c.call():java.lang.Object");
    }
}
