package com.google.android.libraries.home.p1957e;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.google.android.libraries.home.e.b */
/* compiled from: PG */
public final class C23767b implements X509TrustManager {

    /* renamed from: a */
    final /* synthetic */ C23769d f65137a;

    public C23767b(C23769d dVar) {
        this.f65137a = dVar;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkServerTrusted(java.security.cert.X509Certificate[] r11, java.lang.String r12) {
        /*
            r10 = this;
            int r12 = r11.length
            if (r12 == 0) goto L_0x00fe
            com.google.android.libraries.home.e.d r0 = com.google.android.libraries.home.p1957e.C23769d.f65139b
            if (r0 == 0) goto L_0x00f6
            r1 = 0
            r2 = r11[r1]
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r12 + -1
            r3.<init>(r4)
            java.util.List r11 = java.util.Arrays.asList(r11)
            r4 = 1
            java.util.List r11 = r11.subList(r4, r12)
            r3.addAll(r11)
            com.google.android.libraries.home.e.d r11 = r10.f65137a
            com.google.android.libraries.home.e.e r12 = r11.f65144f
            com.google.j.a.d r12 = r12.mo29125a()
            com.google.android.libraries.home.e.d r4 = r10.f65137a
            java.security.cert.CertPath r4 = r4.mo29124c(r2, r3)
            com.google.android.libraries.home.e.d r5 = r10.f65137a
            java.util.Set r5 = r5.f65142d
            j$.util.function.Supplier r6 = r11.f65143e
            java.lang.Object r6 = r6.get()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r7 = 0
            if (r6 != 0) goto L_0x003f
            goto L_0x007b
        L_0x003f:
            if (r12 == 0) goto L_0x00ee
            j$.time.Instant r6 = p3186j$.time.Instant.now()
            long r8 = r6.getEpochSecond()
            com.google.android.libraries.home.e.g r11 = r11.f65145g
            byte[] r12 = r12.toByteArray()
            com.google.m.a.a.a.i r11 = r11.f65153a
            com.google.m.a.a.a.f r11 = r11.mo58573a(r12, r8)
            if (r11 != 0) goto L_0x0059
            r12 = r7
            goto L_0x005e
        L_0x0059:
            com.google.android.libraries.home.e.f r12 = new com.google.android.libraries.home.e.f
            r12.<init>(r11)
        L_0x005e:
            if (r12 == 0) goto L_0x00e6
            androidx.c.h r11 = new androidx.c.h
            androidx.c.i r5 = (androidx.p060c.C0979i) r5
            r11.<init>(r5)
        L_0x0067:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x00de
            java.lang.Object r5 = r11.next()
            java.security.cert.TrustAnchor r5 = (java.security.cert.TrustAnchor) r5
            com.google.m.a.a.a.f r6 = r12.f65152a
            boolean r5 = r6.mo58572a(r4, r5, r8)
            if (r5 == 0) goto L_0x0067
        L_0x007b:
            if (r2 != 0) goto L_0x008d
            com.google.common.f.e r11 = com.google.android.libraries.home.p1957e.C23769d.f65138a
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r12 = "No device certificate while validating."
            r0 = 48682(0xbe2a, float:6.8218E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
        L_0x008b:
            r2 = r7
            goto L_0x00d3
        L_0x008d:
            java.security.cert.CertPathValidator r11 = r0.f65141c
            if (r11 != 0) goto L_0x00a0
            com.google.common.f.e r11 = com.google.android.libraries.home.p1957e.C23769d.f65138a
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r12 = "No CertPathValidator while validating."
            r0 = 48681(0xbe29, float:6.8217E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r0)).mo56386p(r12)
            goto L_0x008b
        L_0x00a0:
            java.security.cert.PKIXParameters r11 = new java.security.cert.PKIXParameters     // Catch:{ Exception -> 0x00c3 }
            java.util.Set r12 = r0.f65142d     // Catch:{ Exception -> 0x00c3 }
            r11.<init>(r12)     // Catch:{ Exception -> 0x00c3 }
            java.util.Date r12 = new java.util.Date     // Catch:{ Exception -> 0x00c3 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00c3 }
            r12.<init>(r4)     // Catch:{ Exception -> 0x00c3 }
            r11.setDate(r12)     // Catch:{ Exception -> 0x00c3 }
            r11.setRevocationEnabled(r1)     // Catch:{ Exception -> 0x00c3 }
            r11.setPolicyQualifiersRejected(r1)     // Catch:{ Exception -> 0x00c3 }
            java.security.cert.CertPathValidator r12 = r0.f65141c     // Catch:{ Exception -> 0x00c3 }
            java.security.cert.CertPath r0 = r0.mo29124c(r2, r3)     // Catch:{ Exception -> 0x00c3 }
            r12.validate(r0, r11)     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00d3
        L_0x00c3:
            r11 = move-exception
            com.google.common.f.e r12 = com.google.android.libraries.home.p1957e.C23769d.f65138a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r0 = "exception while validating"
            r1 = 48680(0xbe28, float:6.8215E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56382g(r11)).mo56372aa(r1)).mo56386p(r0)
            goto L_0x008b
        L_0x00d3:
            if (r2 == 0) goto L_0x00d6
            return
        L_0x00d6:
            java.security.cert.CertificateException r11 = new java.security.cert.CertificateException
            java.lang.String r12 = "Validation failed."
            r11.<init>(r12)
            throw r11
        L_0x00de:
            java.security.cert.CertificateException r11 = new java.security.cert.CertificateException
            java.lang.String r12 = "Crl check failed: checked all trustAnchor."
            r11.<init>(r12)
            throw r11
        L_0x00e6:
            java.security.cert.CertificateException r11 = new java.security.cert.CertificateException
            java.lang.String r12 = "Crl check failed: cannot create crlRevocationChecker."
            r11.<init>(r12)
            throw r11
        L_0x00ee:
            java.security.cert.CertificateException r11 = new java.security.cert.CertificateException
            java.lang.String r12 = "Crl check failed: cannot retrieve crl bundle."
            r11.<init>(r12)
            throw r11
        L_0x00f6:
            java.security.cert.CertificateException r11 = new java.security.cert.CertificateException
            java.lang.String r12 = "CertificateValidator is null"
            r11.<init>(r12)
            throw r11
        L_0x00fe:
            java.security.cert.CertificateException r11 = new java.security.cert.CertificateException
            java.lang.String r12 = "Chain is empty"
            r11.<init>(r12)
            goto L_0x0107
        L_0x0106:
            throw r11
        L_0x0107:
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.p1957e.C23767b.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String):void");
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
