package com.google.android.libraries.p11002ag;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p11002ag.p11003a.C147555e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.ag.a */
/* compiled from: PG */
public final class C147550a {

    /* renamed from: f */
    private static final C147579i f398221f;

    /* renamed from: g */
    private static final Pattern f398222g = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)*");

    /* renamed from: h */
    private static final Pattern f398223h = Pattern.compile("[- ]");

    /* renamed from: i */
    private static final Pattern f398224i = Pattern.compile(" ");

    /* renamed from: a */
    public String f398225a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public final StringBuilder f398226b = new StringBuilder();

    /* renamed from: c */
    public boolean f398227c = true;

    /* renamed from: d */
    public int f398228d = 0;

    /* renamed from: e */
    public int f398229e = 0;

    /* renamed from: j */
    private final StringBuilder f398230j = new StringBuilder();

    /* renamed from: k */
    private String f398231k = BuildConfig.FLAVOR;

    /* renamed from: l */
    private final StringBuilder f398232l = new StringBuilder();

    /* renamed from: m */
    private boolean f398233m = false;

    /* renamed from: n */
    private boolean f398234n = false;

    /* renamed from: o */
    private boolean f398235o = false;

    /* renamed from: p */
    private final C147576f f398236p = C147576f.m240621c();

    /* renamed from: q */
    private final String f398237q;

    /* renamed from: r */
    private final C147579i f398238r;

    /* renamed from: s */
    private C147579i f398239s;

    /* renamed from: t */
    private int f398240t = 0;

    /* renamed from: u */
    private final StringBuilder f398241u = new StringBuilder();

    /* renamed from: v */
    private boolean f398242v = false;

    /* renamed from: w */
    private String f398243w = BuildConfig.FLAVOR;

    /* renamed from: x */
    private final StringBuilder f398244x = new StringBuilder();

    /* renamed from: y */
    private final List f398245y = new ArrayList();

    /* renamed from: z */
    private final C147555e f398246z = new C147555e(64);

    static {
        C147578h hVar = new C147578h();
        hVar.f398349n = "<ignored>";
        hVar.f398351p = "NA";
        f398221f = hVar;
    }

    public C147550a(String str) {
        this.f398237q = str;
        C147579i d = m240574d(str);
        this.f398239s = d;
        this.f398238r = d;
    }

    /* renamed from: d */
    private final C147579i m240574d(String str) {
        C147579i e = this.f398236p.mo124319e(this.f398236p.mo124322i(this.f398236p.mo124317b(str)));
        return e != null ? e : f398221f;
    }

    /* renamed from: e */
    private final String m240575e(String str) {
        int length = this.f398241u.length();
        if (!this.f398242v || length <= 0 || this.f398241u.charAt(length - 1) == ' ') {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = this.f398241u;
            sb.append(sb2);
            return sb2.toString().concat(String.valueOf(str));
        }
        return new String(this.f398241u) + ' ' + str;
    }

    /* renamed from: f */
    private final String m240576f() {
        List<C147577g> list;
        if (this.f398244x.length() < 3) {
            return m240575e(this.f398244x.toString());
        }
        String sb = this.f398244x.toString();
        if (!this.f398234n || this.f398243w.length() != 0 || this.f398239s.mo124338c() <= 0) {
            list = this.f398239s.f398358w;
        } else {
            list = this.f398239s.f398359x;
        }
        for (C147577g gVar : list) {
            if ((this.f398243w.length() <= 0 || !C147576f.m240625m(gVar.f398301c) || gVar.f398302d || gVar.f398303e) && ((this.f398243w.length() != 0 || this.f398234n || C147576f.m240625m(gVar.f398301c) || gVar.f398302d) && f398222g.matcher(gVar.f398300b).matches())) {
                this.f398245y.add(gVar);
            }
        }
        m240581k(sb);
        String a = mo124302a();
        if (a.length() > 0) {
            return a;
        }
        return m240584n() ? m240578h() : this.f398232l.toString();
    }

    /* renamed from: g */
    private final String m240577g() {
        this.f398227c = true;
        this.f398235o = false;
        this.f398245y.clear();
        this.f398240t = 0;
        this.f398230j.setLength(0);
        this.f398231k = BuildConfig.FLAVOR;
        return m240576f();
    }

    /* renamed from: h */
    private final String m240578h() {
        int length = this.f398244x.length();
        if (length <= 0) {
            return this.f398241u.toString();
        }
        String str = BuildConfig.FLAVOR;
        for (int i = 0; i < length; i++) {
            str = m240579i(this.f398244x.charAt(i));
        }
        return this.f398227c ? m240575e(str) : this.f398232l.toString();
    }

    /* renamed from: i */
    private final String m240579i(char c) {
        Matcher matcher = f398224i.matcher(this.f398230j);
        if (matcher.find(this.f398240t)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.f398230j.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.f398240t = start;
            return this.f398230j.substring(0, start + 1);
        }
        if (this.f398245y.size() == 1) {
            this.f398227c = false;
        }
        this.f398231k = BuildConfig.FLAVOR;
        return this.f398232l.toString();
    }

    /* renamed from: j */
    private final String m240580j() {
        int i = 1;
        if (this.f398239s.f398350o != 1 || this.f398244x.charAt(0) != '1' || this.f398244x.charAt(1) == '0' || this.f398244x.charAt(1) == '1') {
            C147579i iVar = this.f398239s;
            if (iVar.f398354s) {
                Matcher matcher = this.f398246z.mo124309a(iVar.f398355t).matcher(this.f398244x);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.f398234n = true;
                    i = matcher.end();
                    this.f398241u.append(this.f398244x.substring(0, i));
                }
            }
            i = 0;
        } else {
            this.f398241u.append("1 ");
            this.f398234n = true;
        }
        String substring = this.f398244x.substring(0, i);
        this.f398244x.delete(0, i);
        return substring;
    }

    /* renamed from: k */
    private final void m240581k(String str) {
        int length = str.length() - 3;
        Iterator it = this.f398245y.iterator();
        while (it.hasNext()) {
            C147577g gVar = (C147577g) it.next();
            if (gVar.mo124332a() != 0) {
                if (!this.f398246z.mo124309a(gVar.mo124333b(Math.min(length, gVar.mo124332a() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r0 = new java.lang.StringBuilder();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m240582l() {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = r4.f398244x
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.google.android.libraries.ag.f r2 = r4.f398236p
            java.lang.StringBuilder r3 = r4.f398244x
            int r2 = r2.mo124316a(r3, r0)
            if (r2 != 0) goto L_0x001a
            return r1
        L_0x001a:
            java.lang.StringBuilder r3 = r4.f398244x
            r3.setLength(r1)
            java.lang.StringBuilder r1 = r4.f398244x
            r1.append(r0)
            com.google.android.libraries.ag.f r0 = r4.f398236p
            java.lang.String r0 = r0.mo124322i(r2)
            java.lang.String r1 = "001"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003b
            com.google.android.libraries.ag.f r0 = r4.f398236p
            com.google.android.libraries.ag.i r0 = r0.mo124318d(r2)
            r4.f398239s = r0
            goto L_0x0049
        L_0x003b:
            java.lang.String r1 = r4.f398237q
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0049
            com.google.android.libraries.ag.i r0 = r4.m240574d(r0)
            r4.f398239s = r0
        L_0x0049:
            java.lang.String r0 = java.lang.Integer.toString(r2)
            java.lang.StringBuilder r1 = r4.f398241u
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = ""
            r4.f398243w = r0
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p11002ag.C147550a.m240582l():boolean");
    }

    /* renamed from: m */
    private final boolean m240583m() {
        Matcher matcher = this.f398246z.mo124309a("\\+|".concat(String.valueOf(this.f398239s.f398351p))).matcher(this.f398226b);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f398234n = true;
        int end = matcher.end();
        this.f398244x.setLength(0);
        this.f398244x.append(this.f398226b.substring(end));
        this.f398241u.setLength(0);
        this.f398241u.append(this.f398226b.substring(0, end));
        if (this.f398226b.charAt(0) != '+') {
            this.f398241u.append(' ');
        }
        return true;
    }

    /* renamed from: n */
    private final boolean m240584n() {
        String str;
        Iterator it = this.f398245y.iterator();
        while (it.hasNext()) {
            C147577g gVar = (C147577g) it.next();
            String str2 = gVar.f398299a;
            if (this.f398231k.equals(str2)) {
                return false;
            }
            String str3 = gVar.f398299a;
            this.f398230j.setLength(0);
            String str4 = gVar.f398300b;
            Matcher matcher = this.f398246z.mo124309a(str3).matcher("999999999999999");
            matcher.find();
            String group = matcher.group();
            if (group.length() < this.f398244x.length()) {
                str = BuildConfig.FLAVOR;
            } else {
                str = group.replaceAll(str3, str4).replaceAll("9", " ");
            }
            if (str.length() > 0) {
                this.f398230j.append(str);
                this.f398231k = str2;
                this.f398242v = f398223h.matcher(gVar.f398301c).find();
                this.f398240t = 0;
                return true;
            }
            it.remove();
        }
        this.f398227c = false;
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo124302a() {
        for (C147577g gVar : this.f398245y) {
            Matcher matcher = this.f398246z.mo124309a(gVar.f398299a).matcher(this.f398244x);
            if (matcher.matches()) {
                this.f398242v = f398223h.matcher(gVar.f398301c).find();
                String e = m240575e(matcher.replaceAll(gVar.f398300b));
                if (C147576f.m240629x(e, C147576f.f398274a).contentEquals(this.f398226b)) {
                    return e;
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    public final String mo124303b(char c, boolean z) {
        this.f398232l.append(c);
        if (z) {
            this.f398228d = this.f398232l.length();
        }
        if (Character.isDigit(c) || (this.f398232l.length() == 1 && C147576f.f398275b.matcher(Character.toString(c)).matches())) {
            if (c == '+') {
                this.f398226b.append('+');
            } else {
                c = Character.forDigit(Character.digit(c, 10), 10);
                this.f398226b.append(c);
                this.f398244x.append(c);
            }
            if (z) {
                this.f398229e = this.f398226b.length();
            }
        } else {
            this.f398227c = false;
            this.f398233m = true;
        }
        if (this.f398227c) {
            int length = this.f398226b.length();
            if (length == 0 || length == 1 || length == 2) {
                return this.f398232l.toString();
            }
            if (length == 3) {
                if (m240583m()) {
                    this.f398235o = true;
                } else {
                    this.f398243w = m240580j();
                    return m240576f();
                }
            }
            if (this.f398235o) {
                if (m240582l()) {
                    this.f398235o = false;
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = this.f398241u;
                sb.append(sb2);
                return sb2.toString().concat(this.f398244x.toString());
            } else if (this.f398245y.size() <= 0) {
                return m240576f();
            } else {
                String i = m240579i(c);
                String a = mo124302a();
                if (a.length() > 0) {
                    return a;
                }
                m240581k(this.f398244x.toString());
                if (m240584n()) {
                    return m240578h();
                }
                return this.f398227c ? m240575e(i) : this.f398232l.toString();
            }
        } else if (this.f398233m) {
            return this.f398232l.toString();
        } else {
            if (!m240583m()) {
                if (this.f398243w.length() > 0) {
                    this.f398244x.insert(0, this.f398243w);
                    this.f398241u.setLength(this.f398241u.lastIndexOf(this.f398243w));
                }
                if (!this.f398243w.equals(m240580j())) {
                    this.f398241u.append(' ');
                    return m240577g();
                }
            } else if (m240582l()) {
                return m240577g();
            }
            return this.f398232l.toString();
        }
    }

    /* renamed from: c */
    public final void mo124304c() {
        this.f398225a = BuildConfig.FLAVOR;
        this.f398232l.setLength(0);
        this.f398226b.setLength(0);
        this.f398230j.setLength(0);
        this.f398240t = 0;
        this.f398231k = BuildConfig.FLAVOR;
        this.f398241u.setLength(0);
        this.f398243w = BuildConfig.FLAVOR;
        this.f398244x.setLength(0);
        this.f398227c = true;
        this.f398233m = false;
        this.f398229e = 0;
        this.f398228d = 0;
        this.f398234n = false;
        this.f398235o = false;
        this.f398245y.clear();
        this.f398242v = false;
        if (!this.f398239s.equals(this.f398238r)) {
            this.f398239s = m240574d(this.f398237q);
        }
    }
}
