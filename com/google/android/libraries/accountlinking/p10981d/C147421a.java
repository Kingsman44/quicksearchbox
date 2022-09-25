package com.google.android.libraries.accountlinking.p10981d;

import android.content.pm.PackageManager;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Formatter;

/* renamed from: com.google.android.libraries.accountlinking.d.a */
/* compiled from: PG */
public final class C147421a {

    /* renamed from: a */
    private static final C58974d f397947a = C58974d.m91134h("GAL");

    /* JADX WARNING: Removed duplicated region for block: B:81:0x00b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0004 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.base.C58833ax m240339a(android.content.pm.PackageManager r9, java.util.List r10, java.util.List r11, java.lang.String r12) {
        /*
            java.util.Iterator r10 = r10.iterator()
        L_0x0004:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r0 = r10.next()
            com.google.ao.a.c.d r0 = (com.google.p3562ao.p3563a.p3567c.C45526d) r0
            int r1 = r0.f118997a
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            r6 = 6
            if (r1 == 0) goto L_0x0023
            if (r1 == r5) goto L_0x0021
            if (r1 == r6) goto L_0x001f
            r7 = 0
            goto L_0x0024
        L_0x001f:
            r7 = 2
            goto L_0x0024
        L_0x0021:
            r7 = 1
            goto L_0x0024
        L_0x0023:
            r7 = 3
        L_0x0024:
            int r8 = r7 + -1
            if (r7 == 0) goto L_0x010b
            if (r8 == 0) goto L_0x00b9
            if (r8 == r3) goto L_0x002d
            goto L_0x0004
        L_0x002d:
            android.content.Intent r3 = new android.content.Intent
            if (r1 != r6) goto L_0x0036
            java.lang.Object r1 = r0.f118998b
            com.google.ao.a.c.b r1 = (com.google.p3562ao.p3563a.p3567c.C45524b) r1
            goto L_0x0038
        L_0x0036:
            com.google.ao.a.c.b r1 = com.google.p3562ao.p3563a.p3567c.C45524b.f118989e
        L_0x0038:
            java.lang.String r1 = r1.f118992b
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r5 = "android.intent.action.VIEW"
            r3.<init>(r5, r1)
            java.lang.String r1 = r0.f118999c     // Catch:{ NameNotFoundException -> 0x00b0 }
            android.content.pm.PackageInfo r1 = r9.getPackageInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x00b0 }
            int r4 = r0.f118997a     // Catch:{ NameNotFoundException -> 0x00b0 }
            if (r4 != r6) goto L_0x0052
            java.lang.Object r4 = r0.f118998b     // Catch:{ NameNotFoundException -> 0x00b0 }
            com.google.ao.a.c.b r4 = (com.google.p3562ao.p3563a.p3567c.C45524b) r4     // Catch:{ NameNotFoundException -> 0x00b0 }
            goto L_0x0054
        L_0x0052:
            com.google.ao.a.c.b r4 = com.google.p3562ao.p3563a.p3567c.C45524b.f118989e     // Catch:{ NameNotFoundException -> 0x00b0 }
        L_0x0054:
            int r4 = r4.f118991a     // Catch:{ NameNotFoundException -> 0x00b0 }
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0070
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x00b0 }
            long r1 = (long) r1     // Catch:{ NameNotFoundException -> 0x00b0 }
            int r4 = r0.f118997a     // Catch:{ NameNotFoundException -> 0x00b0 }
            if (r4 != r6) goto L_0x0065
            java.lang.Object r4 = r0.f118998b     // Catch:{ NameNotFoundException -> 0x00b0 }
            com.google.ao.a.c.b r4 = (com.google.p3562ao.p3563a.p3567c.C45524b) r4     // Catch:{ NameNotFoundException -> 0x00b0 }
            goto L_0x0067
        L_0x0065:
            com.google.ao.a.c.b r4 = com.google.p3562ao.p3563a.p3567c.C45524b.f118989e     // Catch:{ NameNotFoundException -> 0x00b0 }
        L_0x0067:
            long r4 = r4.f118993c     // Catch:{ NameNotFoundException -> 0x00b0 }
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0070
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a     // Catch:{ NameNotFoundException -> 0x00b0 }
            goto L_0x00b2
        L_0x0070:
            int r1 = r0.f118997a
            if (r1 != r6) goto L_0x0079
            java.lang.Object r1 = r0.f118998b
            com.google.ao.a.c.b r1 = (com.google.p3562ao.p3563a.p3567c.C45524b) r1
            goto L_0x007b
        L_0x0079:
            com.google.ao.a.c.b r1 = com.google.p3562ao.p3563a.p3567c.C45524b.f118989e
        L_0x007b:
            int r1 = r1.f118991a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0098
            int r1 = android.os.Build.VERSION.SDK_INT
            long r1 = (long) r1
            int r4 = r0.f118997a
            if (r4 != r6) goto L_0x008d
            java.lang.Object r4 = r0.f118998b
            com.google.ao.a.c.b r4 = (com.google.p3562ao.p3563a.p3567c.C45524b) r4
            goto L_0x008f
        L_0x008d:
            com.google.ao.a.c.b r4 = com.google.p3562ao.p3563a.p3567c.C45524b.f118989e
        L_0x008f:
            long r4 = r4.f118994d
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0098
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x00b2
        L_0x0098:
            java.lang.String r1 = r0.f118999c
            java.lang.String r1 = m240340b(r9, r1)
            if (r1 == 0) goto L_0x00ad
            java.lang.String r0 = r0.f119000d
            boolean r0 = com.google.common.base.C58890d.m90990e(r1, r0)
            if (r0 == 0) goto L_0x00ad
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r3)
            goto L_0x00b2
        L_0x00ad:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x00b2
        L_0x00b0:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x00b2:
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x0004
            return r0
        L_0x00b9:
            android.content.Intent r2 = new android.content.Intent
            if (r1 != r5) goto L_0x00c2
            java.lang.Object r1 = r0.f118998b
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00c4
        L_0x00c2:
            java.lang.String r1 = ""
        L_0x00c4:
            r2.<init>(r1)
            java.lang.String r1 = r0.f118999c
            r2.setPackage(r1)
            r1 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r1 = r9.resolveActivity(r2, r1)
            if (r1 == 0) goto L_0x0102
            java.lang.String r1 = r0.f118999c
            java.lang.String r1 = m240340b(r9, r1)
            if (r1 == 0) goto L_0x0102
            java.lang.String r3 = r0.f119000d
            boolean r1 = com.google.common.base.C58890d.m90990e(r1, r3)
            if (r1 == 0) goto L_0x0102
            java.lang.String r1 = "CLIENT_ID"
            r2.putExtra(r1, r12)
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.Object[] r1 = r11.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r3 = "SCOPE"
            r2.putExtra(r3, r1)
            java.lang.String r1 = "REDIRECT_URI"
            java.lang.String r0 = r0.f119001e
            r2.putExtra(r1, r0)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x0104
        L_0x0102:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0104:
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x0004
            return r0
        L_0x010b:
            r9 = 0
            throw r9
        L_0x010d:
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.accountlinking.p10981d.C147421a.m240339a(android.content.pm.PackageManager, java.util.List, java.util.List, java.lang.String):com.google.common.base.ax");
    }

    /* renamed from: b */
    private static String m240340b(PackageManager packageManager, String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(packageManager.getPackageInfo(str, 64).signatures[0].toByteArray()))).getEncoded());
            Formatter formatter = new Formatter();
            int i = 0;
            while (true) {
                int length = digest.length - 1;
                if (i < length) {
                    formatter.format("%02x:", new Object[]{Byte.valueOf(digest[i])});
                    i++;
                } else {
                    formatter.format("%02x", new Object[]{Byte.valueOf(digest[length])});
                    return formatter.toString();
                }
            }
        } catch (NoSuchAlgorithmException | CertificateException e) {
            ((C58970a) ((C58970a) ((C58970a) f397947a.mo56224b()).mo56382g(e)).mo56372aa(42246)).mo56386p("Failed to process the certificate");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            ((C58970a) ((C58970a) ((C58970a) f397947a.mo56224b()).mo56382g(e2)).mo56372aa(42247)).mo56386p("Failed to find an app with the given package name");
            return null;
        }
    }
}
