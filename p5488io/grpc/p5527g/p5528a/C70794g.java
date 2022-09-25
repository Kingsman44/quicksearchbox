package p5488io.grpc.p5527g.p5528a;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;

/* renamed from: io.grpc.g.a.g */
/* compiled from: PG */
public final class C70794g implements HostnameVerifier {

    /* renamed from: a */
    public static final C70794g f188794a = new C70794g();

    /* renamed from: b */
    private static final Pattern f188795b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private C70794g() {
    }

    /* renamed from: a */
    private static List m103549a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (!(next == null || next.size() < 2 || (num = (Integer) next.get(0)) == null || num.intValue() != i || (str = (String) next.get(1)) == null)) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    private static final boolean m103550b(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ec, code lost:
        r1 = r3.f188789d;
        r7 = new java.lang.String(r8, r1, r3.f188790e - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x017f, code lost:
        r3.f188790e = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean verify(java.lang.String r17, javax.net.ssl.SSLSession r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = 0
            java.security.cert.Certificate[] r2 = r18.getPeerCertificates()     // Catch:{ SSLException -> 0x0280 }
            r2 = r2[r1]     // Catch:{ SSLException -> 0x0280 }
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch:{ SSLException -> 0x0280 }
            java.util.regex.Pattern r3 = f188795b     // Catch:{ SSLException -> 0x0280 }
            java.util.regex.Matcher r3 = r3.matcher(r0)     // Catch:{ SSLException -> 0x0280 }
            boolean r3 = r3.matches()     // Catch:{ SSLException -> 0x0280 }
            r4 = 1
            if (r3 == 0) goto L_0x0036
            r3 = 7
            java.util.List r2 = m103549a(r2, r3)     // Catch:{ SSLException -> 0x0280 }
            int r3 = r2.size()     // Catch:{ SSLException -> 0x0280 }
            r5 = 0
        L_0x0022:
            if (r5 >= r3) goto L_0x027f
            java.lang.Object r6 = r2.get(r5)     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ SSLException -> 0x0280 }
            boolean r6 = r0.equalsIgnoreCase(r6)     // Catch:{ SSLException -> 0x0280 }
            if (r6 == 0) goto L_0x0033
        L_0x0030:
            r1 = 1
            goto L_0x027f
        L_0x0033:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x0036:
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r0 = r0.toLowerCase(r3)     // Catch:{ SSLException -> 0x0280 }
            r3 = 2
            java.util.List r3 = m103549a(r2, r3)     // Catch:{ SSLException -> 0x0280 }
            int r5 = r3.size()     // Catch:{ SSLException -> 0x0280 }
            r6 = 0
            r7 = 0
        L_0x0047:
            if (r6 >= r5) goto L_0x005a
            java.lang.Object r7 = r3.get(r6)     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ SSLException -> 0x0280 }
            boolean r7 = m103550b(r0, r7)     // Catch:{ SSLException -> 0x0280 }
            if (r7 == 0) goto L_0x0056
            goto L_0x0030
        L_0x0056:
            int r6 = r6 + 1
            r7 = 1
            goto L_0x0047
        L_0x005a:
            if (r7 != 0) goto L_0x027e
            javax.security.auth.x500.X500Principal r2 = r2.getSubjectX500Principal()     // Catch:{ SSLException -> 0x0280 }
            io.grpc.g.a.d r3 = new io.grpc.g.a.d     // Catch:{ SSLException -> 0x0280 }
            r3.<init>(r2)     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r2 = "cn"
            r3.f188788c = r1     // Catch:{ SSLException -> 0x0280 }
            r3.f188789d = r1     // Catch:{ SSLException -> 0x0280 }
            r3.f188790e = r1     // Catch:{ SSLException -> 0x0280 }
            r3.f188791f = r1     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r5 = r3.f188786a     // Catch:{ SSLException -> 0x0280 }
            char[] r5 = r5.toCharArray()     // Catch:{ SSLException -> 0x0280 }
            r3.f188792g = r5     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r5 = r3.mo62496c()     // Catch:{ SSLException -> 0x0280 }
            if (r5 != 0) goto L_0x0080
        L_0x007d:
            r6 = 0
            goto L_0x0211
        L_0x0080:
            java.lang.String r7 = ""
            int r8 = r3.f188788c     // Catch:{ SSLException -> 0x0280 }
            int r9 = r3.f188787b     // Catch:{ SSLException -> 0x0280 }
            if (r8 != r9) goto L_0x0089
            goto L_0x007d
        L_0x0089:
            char[] r10 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            char r10 = r10[r8]     // Catch:{ SSLException -> 0x0280 }
            r11 = 92
            r12 = 34
            java.lang.String r13 = "Unexpected end of DN: "
            r14 = 59
            r15 = 44
            r6 = 43
            r1 = 32
            if (r10 == r12) goto L_0x01cc
            r12 = 35
            if (r10 == r12) goto L_0x0139
            if (r10 == r6) goto L_0x0201
            if (r10 == r15) goto L_0x0201
            if (r10 == r14) goto L_0x0201
            r3.f188789d = r8     // Catch:{ SSLException -> 0x0280 }
            r3.f188790e = r8     // Catch:{ SSLException -> 0x0280 }
        L_0x00ab:
            int r7 = r3.f188788c     // Catch:{ SSLException -> 0x0280 }
            int r8 = r3.f188787b     // Catch:{ SSLException -> 0x0280 }
            if (r7 < r8) goto L_0x00bf
            java.lang.String r7 = new java.lang.String     // Catch:{ SSLException -> 0x0280 }
            char[] r1 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            int r8 = r3.f188789d     // Catch:{ SSLException -> 0x0280 }
            int r9 = r3.f188790e     // Catch:{ SSLException -> 0x0280 }
            int r9 = r9 - r8
            r7.<init>(r1, r8, r9)     // Catch:{ SSLException -> 0x0280 }
            goto L_0x0201
        L_0x00bf:
            char[] r8 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            char r9 = r8[r7]     // Catch:{ SSLException -> 0x0280 }
            if (r9 == r1) goto L_0x00f8
            if (r9 == r14) goto L_0x00ec
            if (r9 == r11) goto L_0x00da
            if (r9 == r6) goto L_0x00ec
            if (r9 == r15) goto L_0x00ec
            int r10 = r3.f188790e     // Catch:{ SSLException -> 0x0280 }
            int r12 = r10 + 1
            r3.f188790e = r12     // Catch:{ SSLException -> 0x0280 }
            r8[r10] = r9     // Catch:{ SSLException -> 0x0280 }
            int r7 = r7 + 1
            r3.f188788c = r7     // Catch:{ SSLException -> 0x0280 }
            goto L_0x00ab
        L_0x00da:
            int r7 = r3.f188790e     // Catch:{ SSLException -> 0x0280 }
            int r9 = r7 + 1
            r3.f188790e = r9     // Catch:{ SSLException -> 0x0280 }
            char r9 = r3.mo62494a()     // Catch:{ SSLException -> 0x0280 }
            r8[r7] = r9     // Catch:{ SSLException -> 0x0280 }
            int r7 = r3.f188788c     // Catch:{ SSLException -> 0x0280 }
            int r7 = r7 + r4
            r3.f188788c = r7     // Catch:{ SSLException -> 0x0280 }
            goto L_0x00ab
        L_0x00ec:
            java.lang.String r7 = new java.lang.String     // Catch:{ SSLException -> 0x0280 }
            int r1 = r3.f188789d     // Catch:{ SSLException -> 0x0280 }
            int r9 = r3.f188790e     // Catch:{ SSLException -> 0x0280 }
            int r9 = r9 - r1
            r7.<init>(r8, r1, r9)     // Catch:{ SSLException -> 0x0280 }
            goto L_0x0201
        L_0x00f8:
            int r9 = r3.f188790e     // Catch:{ SSLException -> 0x0280 }
            r3.f188791f = r9     // Catch:{ SSLException -> 0x0280 }
            int r7 = r7 + 1
            r3.f188788c = r7     // Catch:{ SSLException -> 0x0280 }
            int r7 = r9 + 1
            r3.f188790e = r7     // Catch:{ SSLException -> 0x0280 }
            r8[r9] = r1     // Catch:{ SSLException -> 0x0280 }
        L_0x0106:
            int r7 = r3.f188788c     // Catch:{ SSLException -> 0x0280 }
            int r8 = r3.f188787b     // Catch:{ SSLException -> 0x0280 }
            if (r7 >= r8) goto L_0x011f
            char[] r9 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            char r10 = r9[r7]     // Catch:{ SSLException -> 0x0280 }
            if (r10 != r1) goto L_0x011f
            int r8 = r3.f188790e     // Catch:{ SSLException -> 0x0280 }
            int r10 = r8 + 1
            r3.f188790e = r10     // Catch:{ SSLException -> 0x0280 }
            r9[r8] = r1     // Catch:{ SSLException -> 0x0280 }
            int r7 = r7 + 1
            r3.f188788c = r7     // Catch:{ SSLException -> 0x0280 }
            goto L_0x0106
        L_0x011f:
            if (r7 == r8) goto L_0x012b
            char[] r8 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            char r7 = r8[r7]     // Catch:{ SSLException -> 0x0280 }
            if (r7 == r15) goto L_0x012b
            if (r7 == r6) goto L_0x012b
            if (r7 != r14) goto L_0x00ab
        L_0x012b:
            java.lang.String r7 = new java.lang.String     // Catch:{ SSLException -> 0x0280 }
            char[] r1 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            int r8 = r3.f188789d     // Catch:{ SSLException -> 0x0280 }
            int r9 = r3.f188791f     // Catch:{ SSLException -> 0x0280 }
            int r9 = r9 - r8
            r7.<init>(r1, r8, r9)     // Catch:{ SSLException -> 0x0280 }
            goto L_0x0201
        L_0x0139:
            int r7 = r8 + 4
            if (r7 >= r9) goto L_0x01bc
            r3.f188789d = r8     // Catch:{ SSLException -> 0x0280 }
            int r8 = r8 + 1
            r3.f188788c = r8     // Catch:{ SSLException -> 0x0280 }
        L_0x0143:
            int r7 = r3.f188788c     // Catch:{ SSLException -> 0x0280 }
            int r8 = r3.f188787b     // Catch:{ SSLException -> 0x0280 }
            if (r7 == r8) goto L_0x017f
            char[] r8 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            char r9 = r8[r7]     // Catch:{ SSLException -> 0x0280 }
            if (r9 == r6) goto L_0x017f
            if (r9 == r15) goto L_0x017f
            if (r9 != r14) goto L_0x0154
            goto L_0x017f
        L_0x0154:
            if (r9 != r1) goto L_0x016d
            r3.f188790e = r7     // Catch:{ SSLException -> 0x0280 }
            int r7 = r7 + 1
            r3.f188788c = r7     // Catch:{ SSLException -> 0x0280 }
        L_0x015c:
            int r7 = r3.f188788c     // Catch:{ SSLException -> 0x0280 }
            int r8 = r3.f188787b     // Catch:{ SSLException -> 0x0280 }
            if (r7 >= r8) goto L_0x0181
            char[] r8 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            char r8 = r8[r7]     // Catch:{ SSLException -> 0x0280 }
            if (r8 != r1) goto L_0x0181
            int r7 = r7 + 1
            r3.f188788c = r7     // Catch:{ SSLException -> 0x0280 }
            goto L_0x015c
        L_0x016d:
            r10 = 65
            if (r9 < r10) goto L_0x017a
            r10 = 70
            if (r9 > r10) goto L_0x017a
            int r9 = r9 + 32
            char r9 = (char) r9     // Catch:{ SSLException -> 0x0280 }
            r8[r7] = r9     // Catch:{ SSLException -> 0x0280 }
        L_0x017a:
            int r7 = r7 + 1
            r3.f188788c = r7     // Catch:{ SSLException -> 0x0280 }
            goto L_0x0143
        L_0x017f:
            r3.f188790e = r7     // Catch:{ SSLException -> 0x0280 }
        L_0x0181:
            int r1 = r3.f188790e     // Catch:{ SSLException -> 0x0280 }
            int r7 = r3.f188789d     // Catch:{ SSLException -> 0x0280 }
            int r1 = r1 - r7
            r8 = 5
            if (r1 < r8) goto L_0x01ac
            r8 = r1 & 1
            if (r8 == 0) goto L_0x01ac
            int r8 = r1 >> 1
            byte[] r9 = new byte[r8]     // Catch:{ SSLException -> 0x0280 }
            int r7 = r7 + 1
            r10 = 0
        L_0x0194:
            if (r10 >= r8) goto L_0x01a2
            int r11 = r3.mo62495b(r7)     // Catch:{ SSLException -> 0x0280 }
            byte r11 = (byte) r11     // Catch:{ SSLException -> 0x0280 }
            r9[r10] = r11     // Catch:{ SSLException -> 0x0280 }
            int r7 = r7 + 2
            int r10 = r10 + 1
            goto L_0x0194
        L_0x01a2:
            java.lang.String r7 = new java.lang.String     // Catch:{ SSLException -> 0x0280 }
            char[] r8 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            int r9 = r3.f188789d     // Catch:{ SSLException -> 0x0280 }
            r7.<init>(r8, r9, r1)     // Catch:{ SSLException -> 0x0280 }
            goto L_0x0201
        L_0x01ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = r3.f188786a     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = r13.concat(r1)     // Catch:{ SSLException -> 0x0280 }
            r0.<init>(r1)     // Catch:{ SSLException -> 0x0280 }
            throw r0     // Catch:{ SSLException -> 0x0280 }
        L_0x01bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = r3.f188786a     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = r13.concat(r1)     // Catch:{ SSLException -> 0x0280 }
            r0.<init>(r1)     // Catch:{ SSLException -> 0x0280 }
            throw r0     // Catch:{ SSLException -> 0x0280 }
        L_0x01cc:
            int r8 = r8 + 1
            r3.f188788c = r8     // Catch:{ SSLException -> 0x0280 }
            r3.f188789d = r8     // Catch:{ SSLException -> 0x0280 }
            r3.f188790e = r8     // Catch:{ SSLException -> 0x0280 }
        L_0x01d4:
            int r7 = r3.f188788c     // Catch:{ SSLException -> 0x0280 }
            int r8 = r3.f188787b     // Catch:{ SSLException -> 0x0280 }
            if (r7 == r8) goto L_0x026e
            char[] r8 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            char r9 = r8[r7]     // Catch:{ SSLException -> 0x0280 }
            if (r9 != r12) goto L_0x0253
            int r7 = r7 + 1
            r3.f188788c = r7     // Catch:{ SSLException -> 0x0280 }
        L_0x01e4:
            int r7 = r3.f188788c     // Catch:{ SSLException -> 0x0280 }
            int r8 = r3.f188787b     // Catch:{ SSLException -> 0x0280 }
            if (r7 >= r8) goto L_0x01f5
            char[] r8 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            char r8 = r8[r7]     // Catch:{ SSLException -> 0x0280 }
            if (r8 != r1) goto L_0x01f5
            int r7 = r7 + 1
            r3.f188788c = r7     // Catch:{ SSLException -> 0x0280 }
            goto L_0x01e4
        L_0x01f5:
            java.lang.String r7 = new java.lang.String     // Catch:{ SSLException -> 0x0280 }
            char[] r1 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            int r8 = r3.f188789d     // Catch:{ SSLException -> 0x0280 }
            int r9 = r3.f188790e     // Catch:{ SSLException -> 0x0280 }
            int r9 = r9 - r8
            r7.<init>(r1, r8, r9)     // Catch:{ SSLException -> 0x0280 }
        L_0x0201:
            boolean r1 = r2.equalsIgnoreCase(r5)     // Catch:{ SSLException -> 0x0280 }
            if (r1 == 0) goto L_0x0209
            r6 = r7
            goto L_0x0211
        L_0x0209:
            int r1 = r3.f188788c     // Catch:{ SSLException -> 0x0280 }
            int r5 = r3.f188787b     // Catch:{ SSLException -> 0x0280 }
            if (r1 < r5) goto L_0x0218
            goto L_0x007d
        L_0x0211:
            if (r6 == 0) goto L_0x027e
            boolean r1 = m103550b(r0, r6)     // Catch:{ SSLException -> 0x0280 }
            goto L_0x027f
        L_0x0218:
            char[] r5 = r3.f188792g     // Catch:{ SSLException -> 0x0280 }
            char r5 = r5[r1]     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r7 = "Malformed DN: "
            if (r5 == r15) goto L_0x0236
            if (r5 != r14) goto L_0x0223
            goto L_0x0236
        L_0x0223:
            if (r5 != r6) goto L_0x0226
            goto L_0x0236
        L_0x0226:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = r3.f188786a     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = r7.concat(r1)     // Catch:{ SSLException -> 0x0280 }
            r0.<init>(r1)     // Catch:{ SSLException -> 0x0280 }
            throw r0     // Catch:{ SSLException -> 0x0280 }
        L_0x0236:
            int r1 = r1 + 1
            r3.f188788c = r1     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r5 = r3.mo62496c()     // Catch:{ SSLException -> 0x0280 }
            if (r5 == 0) goto L_0x0243
            r1 = 0
            goto L_0x0080
        L_0x0243:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = r3.f188786a     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = r7.concat(r1)     // Catch:{ SSLException -> 0x0280 }
            r0.<init>(r1)     // Catch:{ SSLException -> 0x0280 }
            throw r0     // Catch:{ SSLException -> 0x0280 }
        L_0x0253:
            if (r9 != r11) goto L_0x025e
            int r7 = r3.f188790e     // Catch:{ SSLException -> 0x0280 }
            char r9 = r3.mo62494a()     // Catch:{ SSLException -> 0x0280 }
            r8[r7] = r9     // Catch:{ SSLException -> 0x0280 }
            goto L_0x0262
        L_0x025e:
            int r7 = r3.f188790e     // Catch:{ SSLException -> 0x0280 }
            r8[r7] = r9     // Catch:{ SSLException -> 0x0280 }
        L_0x0262:
            int r7 = r3.f188788c     // Catch:{ SSLException -> 0x0280 }
            int r7 = r7 + r4
            r3.f188788c = r7     // Catch:{ SSLException -> 0x0280 }
            int r7 = r3.f188790e     // Catch:{ SSLException -> 0x0280 }
            int r7 = r7 + r4
            r3.f188790e = r7     // Catch:{ SSLException -> 0x0280 }
            goto L_0x01d4
        L_0x026e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = r3.f188786a     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SSLException -> 0x0280 }
            java.lang.String r1 = r13.concat(r1)     // Catch:{ SSLException -> 0x0280 }
            r0.<init>(r1)     // Catch:{ SSLException -> 0x0280 }
            throw r0     // Catch:{ SSLException -> 0x0280 }
        L_0x027e:
            r1 = 0
        L_0x027f:
            return r1
        L_0x0280:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5527g.p5528a.C70794g.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }
}
