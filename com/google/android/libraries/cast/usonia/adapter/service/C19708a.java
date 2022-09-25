package com.google.android.libraries.cast.usonia.adapter.service;

import androidx.core.p097i.C1967b;
import kotlinx.coroutines.p5573a.C71361ao;

/* renamed from: com.google.android.libraries.cast.usonia.adapter.service.a */
/* compiled from: PG */
final class C19708a implements C1967b {

    /* renamed from: a */
    final /* synthetic */ C71361ao f54734a;

    public C19708a(C71361ao aoVar) {
        this.f54734a = aoVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e7, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00eb, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ee, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ef, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f3, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo3353a(java.lang.Object r11) {
        /*
            r10 = this;
            java.security.cert.Certificate[] r11 = (java.security.cert.Certificate[]) r11
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            org.b.b.b.a.c r1 = new org.b.b.b.a.c     // Catch:{ all -> 0x00ec }
            r1.<init>(r0)     // Catch:{ all -> 0x00ec }
            java.util.List r2 = org.p5623b.p5629b.p5631b.p5632a.C72126b.f191957a     // Catch:{ all -> 0x00e5 }
            r2 = 0
            r11 = r11[r2]     // Catch:{ all -> 0x00e5 }
            byte[] r11 = r11.getEncoded()     // Catch:{ all -> 0x00e5 }
            java.util.List r3 = org.p5623b.p5629b.p5631b.p5632a.C72126b.f191957a     // Catch:{ all -> 0x00e5 }
            java.lang.String r4 = "CERTIFICATE"
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r5 = "-----BEGIN CERTIFICATE-----"
            r1.write(r5)     // Catch:{ all -> 0x00e5 }
            r1.newLine()     // Catch:{ all -> 0x00e5 }
            boolean r5 = r3.isEmpty()     // Catch:{ all -> 0x00e5 }
            r6 = 0
            if (r5 != 0) goto L_0x0041
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00e5 }
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00e5 }
            if (r5 != 0) goto L_0x003a
            r1.newLine()     // Catch:{ all -> 0x00e5 }
            goto L_0x0041
        L_0x003a:
            java.lang.Object r11 = r3.next()     // Catch:{ all -> 0x00e5 }
            org.b.b.b.a.a r11 = (org.p5623b.p5629b.p5631b.p5632a.C72125a) r11     // Catch:{ all -> 0x00e5 }
            throw r6     // Catch:{ all -> 0x00e5 }
        L_0x0041:
            byte[] r11 = org.p5623b.p5629b.p5630a.C72115a.m105652a(r11)     // Catch:{ all -> 0x00e5 }
            r3 = 0
        L_0x0046:
            int r5 = r11.length     // Catch:{ all -> 0x00e5 }
            if (r3 >= r5) goto L_0x006b
            r5 = 0
        L_0x004a:
            char[] r7 = r1.f191958a     // Catch:{ all -> 0x00e5 }
            int r8 = r7.length     // Catch:{ all -> 0x00e5 }
            r8 = 64
            if (r5 == r8) goto L_0x005f
            int r8 = r3 + r5
            int r9 = r11.length     // Catch:{ all -> 0x00e5 }
            if (r8 < r9) goto L_0x0057
            goto L_0x005f
        L_0x0057:
            byte r8 = r11[r8]     // Catch:{ all -> 0x00e5 }
            char r8 = (char) r8     // Catch:{ all -> 0x00e5 }
            r7[r5] = r8     // Catch:{ all -> 0x00e5 }
            int r5 = r5 + 1
            goto L_0x004a
        L_0x005f:
            r1.write(r7, r2, r5)     // Catch:{ all -> 0x00e5 }
            r1.newLine()     // Catch:{ all -> 0x00e5 }
            char[] r5 = r1.f191958a     // Catch:{ all -> 0x00e5 }
            int r5 = r5.length     // Catch:{ all -> 0x00e5 }
            int r3 = r3 + 64
            goto L_0x0046
        L_0x006b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r11.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = "-----END "
            r11.append(r2)     // Catch:{ all -> 0x00e5 }
            r11.append(r4)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = "-----"
            r11.append(r2)     // Catch:{ all -> 0x00e5 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00e5 }
            r1.write(r11)     // Catch:{ all -> 0x00e5 }
            r1.newLine()     // Catch:{ all -> 0x00e5 }
            p5462h.p5472e.C69598b.m101013a(r1, r6)     // Catch:{ all -> 0x00ec }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x00ec }
            p5462h.p5472e.C69598b.m101013a(r0, r6)
            java.lang.String r0 = "StringWriter().use { str….toString()\n            }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            kotlinx.coroutines.a.ao r0 = r10.f54734a
            com.google.common.f.e r1 = com.google.android.libraries.cast.usonia.adapter.service.C19716d.f54751a
            com.google.am.d.a.n r2 = com.google.p427am.p438d.p439a.C8820n.f30201d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.am.d.a.m r2 = (com.google.p427am.p438d.p439a.C8819m) r2
            java.lang.String r3 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            java.lang.String r3 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r3)
            java.lang.String r3 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r3)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.am.d.a.n r4 = (com.google.p427am.p438d.p439a.C8820n) r4
            r11.getClass()
            r4.f30203a = r11
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r3)
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.am.d.a.n r3 = (com.google.p427am.p438d.p439a.C8820n) r3
            r11.getClass()
            r3.f30204b = r11
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.am.d.a.n r11 = (com.google.p427am.p438d.p439a.C8820n) r11
            r3 = 1
            r11.f30205c = r3
            com.google.protobuf.bv r11 = r2.build()
            java.lang.String r2 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            com.google.am.d.a.n r11 = (com.google.p427am.p438d.p439a.C8820n) r11
            com.google.android.libraries.cast.usonia.adapter.p1674a.C19702a.m37517a(r0, r1, r11)
            return
        L_0x00e5:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r2 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r11)     // Catch:{ all -> 0x00ec }
            throw r2     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r11)
            goto L_0x00f4
        L_0x00f3:
            throw r1
        L_0x00f4:
            goto L_0x00f3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.cast.usonia.adapter.service.C19708a.mo3353a(java.lang.Object):void");
    }
}
