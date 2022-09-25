package com.google.common.p4574q;

import com.google.common.p4522b.C58422el;
import com.google.common.p4522b.C58438fa;
import com.google.common.p4522b.C58584kl;
import com.google.common.p4522b.C58585km;
import com.google.common.p4522b.C58671nr;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import p3186j$.net.URLDecoder;

/* renamed from: com.google.common.q.v */
/* compiled from: PG */
public final class C60743v extends C58438fa implements Cloneable, Serializable {

    /* renamed from: a */
    public static final C60743v f164780a = new C60743v(C58422el.f156033a);

    /* renamed from: c */
    private static final Charset f164781c = Charset.forName("ISO-8859-1");
    private static final long serialVersionUID = -3053773769157973706L;

    /* renamed from: b */
    public final C58585km f164782b;

    public C60743v() {
        this(new C58584kl(12));
    }

    /* renamed from: l */
    private static String m92710l(String str, int i, int i2, Charset charset, boolean z) {
        if (!z) {
            return URLDecoder.decode(str.substring(i, i2), charset.name());
        }
        try {
            return new String(URLDecoder.decode(str.substring(i, i2), "ISO-8859-1").getBytes(f164781c), charset);
        } catch (IllegalArgumentException unused) {
            return str.substring(i, i2);
        } catch (UnsupportedEncodingException unused2) {
            return str.substring(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C58585km mo55275b() {
        return this.f164782b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C58671nr mo55276d() {
        return this.f164782b;
    }

    /* renamed from: e */
    public final C60743v clone() {
        return new C60743v(new C58584kl((C58671nr) this.f164782b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f164782b;
    }

    /* renamed from: k */
    public final String mo57143k(String str) {
        List g = mo54902c(str);
        if (g.isEmpty()) {
            return null;
        }
        return (String) g.get(0);
    }

    public final String toString() {
        return C60739r.m92700e(this, C60742u.f164776a);
    }

    public C60743v(C58585km kmVar) {
        this.f164782b = new C60733l(kmVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r1.regionMatches(true, r8 - 9, "SHIFT_JIS", 0, 9) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r1.regionMatches(true, r8 - 11, "WINDOWS-31J", 0, 11) != false) goto L_0x0047;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4574q.C60743v m92709f(java.lang.String r11, java.nio.charset.Charset r12) {
        /*
            r12.getClass()
            com.google.common.q.v r0 = new com.google.common.q.v
            com.google.common.b.kl r1 = new com.google.common.b.kl
            r2 = 12
            r1.<init>((int) r2)
            r0.<init>(r1)
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x007d
            java.lang.String r1 = r12.name()
            int r8 = r1.length()
            r2 = 9
            r9 = 0
            r10 = 1
            if (r8 < r2) goto L_0x0032
            r3 = 1
            int r4 = r8 + -9
            java.lang.String r5 = "SHIFT_JIS"
            r6 = 0
            r7 = 9
            r2 = r1
            boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L_0x0047
        L_0x0032:
            r2 = 11
            if (r8 < r2) goto L_0x0046
            r3 = 1
            int r4 = r8 + -11
            java.lang.String r5 = "WINDOWS-31J"
            r6 = 0
            r7 = 11
            r2 = r1
            boolean r1 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r10 = 0
        L_0x0047:
            int r1 = r11.length()
            if (r9 > r1) goto L_0x007d
            r1 = 38
            int r1 = r11.indexOf(r1, r9)
            r2 = -1
            if (r1 != r2) goto L_0x005a
            int r1 = r11.length()
        L_0x005a:
            r3 = 61
            int r3 = r11.indexOf(r3, r9)
            if (r3 <= r1) goto L_0x0063
            r3 = -1
        L_0x0063:
            if (r3 != r2) goto L_0x0067
            r4 = r1
            goto L_0x0068
        L_0x0067:
            r4 = r3
        L_0x0068:
            java.lang.String r4 = m92710l(r11, r9, r4, r12, r10)
            if (r3 != r2) goto L_0x0071
            java.lang.String r2 = ""
            goto L_0x0077
        L_0x0071:
            int r3 = r3 + 1
            java.lang.String r2 = m92710l(r11, r3, r1, r12, r10)
        L_0x0077:
            r0.mo54920x(r4, r2)
            int r9 = r1 + 1
            goto L_0x0047
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4574q.C60743v.m92709f(java.lang.String, java.nio.charset.Charset):com.google.common.q.v");
    }
}
