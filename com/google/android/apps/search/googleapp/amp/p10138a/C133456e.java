package com.google.android.apps.search.googleapp.amp.p10138a;

import android.net.Uri;
import com.google.common.base.C58890d;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4537i.C59294s;
import com.google.common.p4541l.C59326i;
import java.util.regex.Matcher;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.amp.a.e */
/* compiled from: PG */
public final class C133456e {

    /* renamed from: a */
    public static final C58528ij f363652a = C58528ij.m90013M("amp_r", "amp_js_v", "amp_gsa", "usqp");

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        if (r2.contains("-") != false) goto L_0x0104;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p3186j$.util.Optional m216614a(android.net.Uri r10) {
        /*
            java.lang.String r0 = r10.getScheme()
            java.lang.String r1 = r10.getHost()
            java.lang.String r10 = r10.getEncodedPath()
            boolean r2 = com.google.common.base.C58837ba.m90859h(r0)
            if (r2 != 0) goto L_0x0142
            boolean r2 = com.google.common.base.C58837ba.m90859h(r1)
            if (r2 != 0) goto L_0x0142
            boolean r2 = com.google.common.base.C58837ba.m90859h(r10)
            if (r2 == 0) goto L_0x0020
            goto L_0x0142
        L_0x0020:
            r2 = 4
            android.icu.text.IDNA r2 = android.icu.text.IDNA.getUTS46Instance(r2)
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            r3 = 76
            android.icu.text.IDNA r3 = android.icu.text.IDNA.getUTS46Instance(r3)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            boolean r4 = r2.isPresent()
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0043
            boolean r4 = r3.isPresent()
            if (r4 == 0) goto L_0x0043
            r4 = 1
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            java.lang.String r7 = "This method is only functional in Android N+."
            com.google.common.base.C58838bb.m90884s(r4, r7)
            java.lang.Object r2 = r2.get()
            android.icu.text.IDNA r2 = (android.icu.text.IDNA) r2
            android.icu.text.IDNA$Info r4 = new android.icu.text.IDNA$Info
            r4.<init>()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r2 = r2.nameToUnicode(r1, r7, r4)
            java.lang.String r2 = r2.toString()
            boolean r4 = r4.hasErrors()
            if (r4 == 0) goto L_0x006d
            java.lang.String r2 = m216617d(r1)
            goto L_0x0104
        L_0x006d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0072:
            int r7 = r2.length()
            if (r5 >= r7) goto L_0x0091
            char r7 = r2.charAt(r5)
            r8 = 46
            r9 = 45
            if (r7 != r8) goto L_0x0085
            r8 = 45
            goto L_0x0086
        L_0x0085:
            r8 = r7
        L_0x0086:
            r4.append(r8)
            if (r7 != r9) goto L_0x008e
            r4.append(r9)
        L_0x008e:
            int r5 = r5 + 1
            goto L_0x0072
        L_0x0091:
            java.lang.Object r2 = r3.get()
            android.icu.text.IDNA r2 = (android.icu.text.IDNA) r2
            android.icu.text.IDNA$Info r3 = new android.icu.text.IDNA$Info
            r3.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r2.labelToASCII(r4, r5, r3)
            java.lang.String r5 = r5.toString()
            boolean r7 = r3.hasErrors()
            java.lang.String r8 = "-"
            if (r7 != 0) goto L_0x00b9
            boolean r7 = r5.contains(r8)
            if (r7 == 0) goto L_0x00b9
            r2 = r5
            goto L_0x0104
        L_0x00b9:
            java.util.Set r5 = r3.getErrors()
            int r5 = r5.size()
            if (r5 != r6) goto L_0x0100
            java.util.Set r3 = r3.getErrors()
            android.icu.text.IDNA$Error r5 = android.icu.text.IDNA.Error.HYPHEN_3_4
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x0100
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "0-"
            r3.<init>(r5)
            r3.append(r4)
            java.lang.String r4 = "-0"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.icu.text.IDNA$Info r4 = new android.icu.text.IDNA$Info
            r4.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r2 = r2.labelToASCII(r3, r5, r4)
            java.lang.String r2 = r2.toString()
            boolean r3 = r4.hasErrors()
            if (r3 != 0) goto L_0x0100
            boolean r3 = r2.contains(r8)
            if (r3 != 0) goto L_0x0104
        L_0x0100:
            java.lang.String r2 = m216617d(r1)
        L_0x0104:
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r4 = "https"
            android.net.Uri$Builder r3 = r3.scheme(r4)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = ".cdn.ampproject.org"
            java.lang.String r2 = r2.concat(r5)
            android.net.Uri$Builder r2 = r3.authority(r2)
            java.lang.String r3 = "v"
            android.net.Uri$Builder r2 = r2.appendPath(r3)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x012e
            java.lang.String r0 = "s"
            r2.appendPath(r0)
        L_0x012e:
            android.net.Uri$Builder r0 = r2.appendPath(r1)
            java.lang.String r10 = r10.substring(r6)
            r0.appendEncodedPath(r10)
            android.net.Uri r10 = r2.build()
            j$.util.Optional r10 = p3186j$.util.Optional.m71637of(r10)
            return r10
        L_0x0142:
            j$.util.Optional r10 = p3186j$.util.Optional.empty()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.amp.p10138a.C133456e.m216614a(android.net.Uri):j$.util.Optional");
    }

    /* renamed from: b */
    public static Optional m216615b(Uri uri) {
        return m216616c(uri).map(C133453b.f363650a);
    }

    /* renamed from: c */
    public static Optional m216616c(Uri uri) {
        Matcher matcher = C133452a.f363649a.matcher(uri.toString());
        if (!matcher.matches()) {
            return Optional.empty();
        }
        boolean z = matcher.group(2) != null;
        String group = matcher.group(3);
        C58893dc.m90996a(group);
        return Optional.m71637of(new C133457f(uri, z, group));
    }

    /* renamed from: d */
    private static String m216617d(String str) {
        C59326i iVar = C59326i.f157518f;
        byte[] e = C59294s.m92135e().mo56759a(str, StandardCharsets.UTF_8).mo56775e();
        return C58890d.m90988c(iVar.mo56837l(e, e.length).substring(0, 52));
    }
}
