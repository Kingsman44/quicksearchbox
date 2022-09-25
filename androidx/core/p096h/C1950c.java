package androidx.core.p096h;

import android.text.SpannableStringBuilder;
import com.evernote.android.state.BuildConfig;
import java.util.Locale;

/* renamed from: androidx.core.h.c */
/* compiled from: PG */
public final class C1950c {

    /* renamed from: a */
    static final C1956i f5862a;

    /* renamed from: b */
    static final C1950c f5863b;

    /* renamed from: c */
    static final C1950c f5864c;

    /* renamed from: e */
    private static final String f5865e = Character.toString(8206);

    /* renamed from: f */
    private static final String f5866f = Character.toString(8207);

    /* renamed from: d */
    public final C1956i f5867d;

    /* renamed from: g */
    private final boolean f5868g;

    /* renamed from: h */
    private final int f5869h;

    static {
        C1956i iVar = C1963p.f5881c;
        f5862a = iVar;
        f5863b = new C1950c(false, 2, iVar);
        f5864c = new C1950c(true, 2, iVar);
    }

    public C1950c(boolean z, int i, C1956i iVar) {
        this.f5868g = z;
        this.f5869h = i;
        this.f5867d = iVar;
    }

    /* renamed from: a */
    public static C1950c m5272a() {
        return new C1948a().mo5098a();
    }

    /* renamed from: b */
    public static C1950c m5273b(Locale locale) {
        return new C1948a(locale).mo5098a();
    }

    /* renamed from: c */
    public static C1950c m5274c(boolean z) {
        return new C1948a(z).mo5098a();
    }

    /* renamed from: d */
    static boolean m5275d(Locale locale) {
        return C1965r.m5296a(locale) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0085, code lost:
        r3 = r3 - 1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m5276g(java.lang.CharSequence r9) {
        /*
            androidx.core.h.b r0 = new androidx.core.h.b
            r0.<init>(r9)
            r9 = 0
            r0.f5860c = r9
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000b:
            int r4 = r0.f5860c
            int r5 = r0.f5859b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L_0x0067
            if (r1 != 0) goto L_0x0067
            java.lang.CharSequence r5 = r0.f5858a
            char r4 = r5.charAt(r4)
            r0.f5861d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L_0x0039
            java.lang.CharSequence r4 = r0.f5858a
            int r5 = r0.f5860c
            int r4 = java.lang.Character.codePointAt(r4, r5)
            int r5 = r0.f5860c
            int r8 = java.lang.Character.charCount(r4)
            int r5 = r5 + r8
            r0.f5860c = r5
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L_0x0044
        L_0x0039:
            int r4 = r0.f5860c
            int r4 = r4 + r7
            r0.f5860c = r4
            char r4 = r0.f5861d
            byte r4 = androidx.core.p096h.C1949b.m5270b(r4)
        L_0x0044:
            if (r4 == 0) goto L_0x0062
            if (r4 == r7) goto L_0x005f
            r5 = 2
            if (r4 == r5) goto L_0x005f
            r5 = 9
            if (r4 == r5) goto L_0x000b
            switch(r4) {
                case 14: goto L_0x005b;
                case 15: goto L_0x005b;
                case 16: goto L_0x0057;
                case 17: goto L_0x0057;
                case 18: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x0065
        L_0x0053:
            int r3 = r3 + -1
            r2 = 0
            goto L_0x000b
        L_0x0057:
            int r3 = r3 + 1
            r2 = 1
            goto L_0x000b
        L_0x005b:
            int r3 = r3 + 1
            r2 = -1
            goto L_0x000b
        L_0x005f:
            if (r3 != 0) goto L_0x0065
            goto L_0x007f
        L_0x0062:
            if (r3 != 0) goto L_0x0065
            goto L_0x0083
        L_0x0065:
            r1 = r3
            goto L_0x000b
        L_0x0067:
            if (r1 != 0) goto L_0x006a
            goto L_0x0088
        L_0x006a:
            if (r2 == 0) goto L_0x006e
            r9 = r2
            goto L_0x0088
        L_0x006e:
            int r2 = r0.f5860c
            if (r2 <= 0) goto L_0x0088
            byte r2 = r0.mo5099a()
            switch(r2) {
                case 14: goto L_0x0081;
                case 15: goto L_0x0081;
                case 16: goto L_0x007d;
                case 17: goto L_0x007d;
                case 18: goto L_0x007a;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x006e
        L_0x007a:
            int r3 = r3 + 1
            goto L_0x006e
        L_0x007d:
            if (r1 != r3) goto L_0x0085
        L_0x007f:
            r9 = 1
            goto L_0x0088
        L_0x0081:
            if (r1 != r3) goto L_0x0085
        L_0x0083:
            r9 = -1
            goto L_0x0088
        L_0x0085:
            int r3 = r3 + -1
            goto L_0x006e
        L_0x0088:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p096h.C1950c.m5276g(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r1 = r1 - 1;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m5277h(java.lang.CharSequence r7) {
        /*
            androidx.core.h.b r0 = new androidx.core.h.b
            r0.<init>(r7)
            int r7 = r0.f5859b
            r0.f5860c = r7
            r7 = 0
            r1 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.f5860c
            if (r3 <= 0) goto L_0x0042
            byte r3 = r0.mo5099a()
            r4 = -1
            if (r3 == 0) goto L_0x003a
            r5 = 1
            if (r3 == r5) goto L_0x0033
            r6 = 2
            if (r3 == r6) goto L_0x0033
            r6 = 9
            if (r3 == r6) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002d;
                case 15: goto L_0x002d;
                case 16: goto L_0x002a;
                case 17: goto L_0x002a;
                case 18: goto L_0x0027;
                default: goto L_0x0024;
            }
        L_0x0024:
            if (r2 != 0) goto L_0x000c
            goto L_0x0040
        L_0x0027:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x002a:
            if (r2 != r1) goto L_0x0030
            goto L_0x0035
        L_0x002d:
            if (r2 != r1) goto L_0x0030
            goto L_0x003c
        L_0x0030:
            int r1 = r1 + -1
            goto L_0x000c
        L_0x0033:
            if (r1 != 0) goto L_0x0037
        L_0x0035:
            r7 = 1
            goto L_0x0042
        L_0x0037:
            if (r2 != 0) goto L_0x000c
            goto L_0x0040
        L_0x003a:
            if (r1 != 0) goto L_0x003e
        L_0x003c:
            r7 = -1
            goto L_0x0042
        L_0x003e:
            if (r2 != 0) goto L_0x000c
        L_0x0040:
            r2 = r1
            goto L_0x000c
        L_0x0042:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p096h.C1950c.m5277h(java.lang.CharSequence):int");
    }

    /* renamed from: e */
    public final CharSequence mo5100e(CharSequence charSequence, C1956i iVar) {
        C1956i iVar2;
        C1956i iVar3;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean a = iVar.mo5116a(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.f5869h & 2;
        boolean z = false;
        String str2 = BuildConfig.FLAVOR;
        if (i != 0) {
            if (a) {
                iVar3 = C1963p.f5880b;
            } else {
                iVar3 = C1963p.f5879a;
            }
            boolean a2 = iVar3.mo5116a(charSequence, charSequence.length());
            if (!this.f5868g) {
                if (a2 || m5276g(charSequence) == 1) {
                    str = f5865e;
                    spannableStringBuilder.append(str);
                } else {
                    a2 = false;
                }
            }
            str = (!this.f5868g || (a2 && m5276g(charSequence) != -1)) ? str2 : f5866f;
            spannableStringBuilder.append(str);
        }
        if (a != this.f5868g) {
            spannableStringBuilder.append(true != a ? (char) 8234 : 8235);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (a) {
            iVar2 = C1963p.f5880b;
        } else {
            iVar2 = C1963p.f5879a;
        }
        boolean a3 = iVar2.mo5116a(charSequence, charSequence.length());
        if (this.f5868g) {
            z = a3;
        } else if (a3 || m5277h(charSequence) == 1) {
            str2 = f5865e;
            spannableStringBuilder.append(str2);
            return spannableStringBuilder;
        }
        if (this.f5868g && (!z || m5277h(charSequence) == -1)) {
            str2 = f5866f;
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }

    /* renamed from: f */
    public final String mo5101f(String str, C1956i iVar) {
        if (str == null) {
            return null;
        }
        return mo5100e(str, iVar).toString();
    }
}
