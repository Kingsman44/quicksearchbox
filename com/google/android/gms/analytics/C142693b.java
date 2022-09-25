package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C142718ao;
import com.google.android.gms.analytics.internal.C142731ba;
import com.google.android.gms.analytics.internal.C142736f;
import com.google.android.gms.analytics.internal.C142738h;
import com.google.android.gms.analytics.internal.C142740j;
import com.google.android.gms.analytics.internal.C142742l;
import com.google.android.gms.analytics.p10733a.C142680a;
import com.google.android.gms.analytics.p10733a.C142689j;
import com.google.android.gms.common.internal.C143919bh;
import com.google.common.p4535g.C59203do;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.b */
/* compiled from: PG */
public final class C142693b extends C142736f implements C142766s {

    /* renamed from: a */
    private static DecimalFormat f387199a;

    /* renamed from: b */
    private final C142740j f387200b;

    /* renamed from: c */
    private final String f387201c;

    /* renamed from: d */
    private final Uri f387202d;

    public C142693b(C142740j jVar, String str) {
        super(jVar);
        C143919bh.m233969l(str);
        this.f387200b = jVar;
        this.f387201c = str;
        this.f387202d = m231518a(str);
    }

    /* renamed from: a */
    public static Uri m231518a(String str) {
        C143919bh.m233969l(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    /* renamed from: c */
    static String m231519c(double d) {
        if (f387199a == null) {
            f387199a = new DecimalFormat("0.######");
        }
        return f387199a.format(d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0020 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map m231520d(com.google.android.gms.analytics.C142701h r10) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class<com.google.android.gms.analytics.a.e> r1 = com.google.android.gms.analytics.p10733a.C142684e.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.e r1 = (com.google.android.gms.analytics.p10733a.C142684e) r1
            r2 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0073
            java.util.Map r1 = r1.f387185a
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0020:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r1.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            if (r6 != 0) goto L_0x0034
        L_0x0032:
            r6 = r4
            goto L_0x0067
        L_0x0034:
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L_0x0041
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x0067
            goto L_0x0032
        L_0x0041:
            boolean r7 = r6 instanceof java.lang.Double
            if (r7 == 0) goto L_0x0058
            java.lang.Double r6 = (java.lang.Double) r6
            double r7 = r6.doubleValue()
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x0032
            double r6 = r6.doubleValue()
            java.lang.String r6 = m231519c(r6)
            goto L_0x0067
        L_0x0058:
            boolean r7 = r6 instanceof java.lang.Boolean
            if (r7 == 0) goto L_0x0063
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            if (r6 == r7) goto L_0x0032
            java.lang.String r6 = "1"
            goto L_0x0067
        L_0x0063:
            java.lang.String r6 = r6.toString()
        L_0x0067:
            if (r6 == 0) goto L_0x0020
            java.lang.Object r5 = r5.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r0.put(r5, r6)
            goto L_0x0020
        L_0x0073:
            java.lang.Class<com.google.android.gms.analytics.a.j> r1 = com.google.android.gms.analytics.p10733a.C142689j.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.j r1 = (com.google.android.gms.analytics.p10733a.C142689j) r1
            if (r1 == 0) goto L_0x00ac
            java.lang.String r5 = "t"
            java.lang.String r6 = r1.f387192a
            m231521f(r0, r5, r6)
            java.lang.String r5 = "cid"
            java.lang.String r6 = r1.f387193b
            m231521f(r0, r5, r6)
            java.lang.String r5 = "uid"
            java.lang.String r6 = r1.f387194c
            m231521f(r0, r5, r6)
            java.lang.String r5 = "sc"
            m231521f(r0, r5, r4)
            java.lang.String r5 = "ni"
            boolean r6 = r1.f387197f
            m231522g(r0, r5, r6)
            java.lang.String r5 = "adid"
            java.lang.String r6 = r1.f387195d
            m231521f(r0, r5, r6)
            java.lang.String r5 = "ate"
            boolean r1 = r1.f387196e
            m231522g(r0, r5, r1)
        L_0x00ac:
            java.lang.Class<com.google.android.gms.analytics.a.k> r1 = com.google.android.gms.analytics.p10733a.C142690k.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.k r1 = (com.google.android.gms.analytics.p10733a.C142690k) r1
            java.lang.String r5 = "cd"
            if (r1 == 0) goto L_0x00d0
            m231521f(r0, r5, r4)
            int r1 = r1.f387198a
            double r6 = (double) r1
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = "a"
            java.lang.String r2 = m231519c(r6)
            r0.put(r1, r2)
        L_0x00cb:
            java.lang.String r1 = "dr"
            m231521f(r0, r1, r4)
        L_0x00d0:
            java.lang.Class<com.google.android.gms.analytics.a.h> r1 = com.google.android.gms.analytics.p10733a.C142687h.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.h r1 = (com.google.android.gms.analytics.p10733a.C142687h) r1
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = "ec"
            m231521f(r0, r1, r4)
            java.lang.String r1 = "ea"
            m231521f(r0, r1, r4)
            java.lang.String r1 = "el"
            m231521f(r0, r1, r4)
        L_0x00e9:
            java.lang.Class<com.google.android.gms.analytics.a.b> r1 = com.google.android.gms.analytics.p10733a.C142681b.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.b r1 = (com.google.android.gms.analytics.p10733a.C142681b) r1
            java.lang.String r2 = "cm"
            if (r1 == 0) goto L_0x0139
            java.lang.String r3 = "cn"
            java.lang.String r6 = r1.f387173a
            m231521f(r0, r3, r6)
            java.lang.String r3 = "cs"
            java.lang.String r6 = r1.f387174b
            m231521f(r0, r3, r6)
            java.lang.String r3 = r1.f387175c
            m231521f(r0, r2, r3)
            java.lang.String r3 = "ck"
            java.lang.String r6 = r1.f387176d
            m231521f(r0, r3, r6)
            java.lang.String r3 = "cc"
            java.lang.String r6 = r1.f387177e
            m231521f(r0, r3, r6)
            java.lang.String r3 = "ci"
            java.lang.String r6 = r1.f387178f
            m231521f(r0, r3, r6)
            java.lang.String r3 = "anid"
            java.lang.String r6 = r1.f387179g
            m231521f(r0, r3, r6)
            java.lang.String r3 = "gclid"
            java.lang.String r6 = r1.f387180h
            m231521f(r0, r3, r6)
            java.lang.String r3 = "dclid"
            java.lang.String r6 = r1.f387181i
            m231521f(r0, r3, r6)
            java.lang.String r3 = "aclid"
            java.lang.String r1 = r1.f387182j
            m231521f(r0, r3, r1)
        L_0x0139:
            java.lang.Class<com.google.android.gms.analytics.a.i> r1 = com.google.android.gms.analytics.p10733a.C142688i.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.i r1 = (com.google.android.gms.analytics.p10733a.C142688i) r1
            if (r1 == 0) goto L_0x0148
            java.lang.String r1 = "exd"
            m231521f(r0, r1, r4)
        L_0x0148:
            java.lang.Class<com.google.android.gms.analytics.a.l> r1 = com.google.android.gms.analytics.p10733a.C142691l.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.l r1 = (com.google.android.gms.analytics.p10733a.C142691l) r1
            if (r1 == 0) goto L_0x0161
            java.lang.String r1 = "sn"
            m231521f(r0, r1, r4)
            java.lang.String r1 = "sa"
            m231521f(r0, r1, r4)
            java.lang.String r1 = "st"
            m231521f(r0, r1, r4)
        L_0x0161:
            java.lang.Class<com.google.android.gms.analytics.a.m> r1 = com.google.android.gms.analytics.p10733a.C142692m.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.m r1 = (com.google.android.gms.analytics.p10733a.C142692m) r1
            if (r1 == 0) goto L_0x017a
            java.lang.String r1 = "utv"
            m231521f(r0, r1, r4)
            java.lang.String r1 = "utc"
            m231521f(r0, r1, r4)
            java.lang.String r1 = "utl"
            m231521f(r0, r1, r4)
        L_0x017a:
            java.lang.Class<com.google.android.gms.analytics.a.c> r1 = com.google.android.gms.analytics.p10733a.C142682c.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.c r1 = (com.google.android.gms.analytics.p10733a.C142682c) r1
            if (r1 == 0) goto L_0x01bc
            java.util.Map r1 = r1.f387183a
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0192:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01bc
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getKey()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r6 = com.google.android.gms.analytics.C142697d.m231525a(r5, r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0192
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r0.put(r6, r3)
            goto L_0x0192
        L_0x01bc:
            java.lang.Class<com.google.android.gms.analytics.a.d> r1 = com.google.android.gms.analytics.p10733a.C142683d.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.d r1 = (com.google.android.gms.analytics.p10733a.C142683d) r1
            if (r1 == 0) goto L_0x0206
            java.util.Map r1 = r1.f387184a
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x01d4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0206
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r5 = com.google.android.gms.analytics.C142697d.m231525a(r2, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x01d4
            java.lang.Object r3 = r3.getValue()
            java.lang.Double r3 = (java.lang.Double) r3
            double r6 = r3.doubleValue()
            java.lang.String r3 = m231519c(r6)
            r0.put(r5, r3)
            goto L_0x01d4
        L_0x0206:
            java.lang.Class<com.google.android.gms.analytics.a.g> r1 = com.google.android.gms.analytics.p10733a.C142686g.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.g r1 = (com.google.android.gms.analytics.p10733a.C142686g) r1
            if (r1 == 0) goto L_0x02af
            java.util.List r2 = r1.f387190b
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            r5 = 1
            if (r3 != 0) goto L_0x029e
            java.util.List r2 = r1.f387189a
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L_0x028d
            java.util.Map r1 = r1.f387191c
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L_0x023c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02af
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getValue()
            java.util.List r6 = (java.util.List) r6
            java.lang.String r7 = "il"
            java.lang.String r7 = com.google.android.gms.analytics.C142697d.m231525a(r7, r2)
            java.util.Iterator r6 = r6.iterator()
            boolean r8 = r6.hasNext()
            if (r8 != 0) goto L_0x027c
            java.lang.Object r6 = r3.getKey()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0279
            java.lang.String r6 = "nm"
            java.lang.String r6 = r7.concat(r6)
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.put(r6, r3)
        L_0x0279:
            int r2 = r2 + 1
            goto L_0x023c
        L_0x027c:
            java.lang.Object r10 = r6.next()
            com.google.android.gms.analytics.b.a r10 = (com.google.android.gms.analytics.p10734b.C142694a) r10
            java.lang.String r10 = "pi"
            com.google.android.gms.analytics.C142697d.m231525a(r10, r5)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            throw r4
        L_0x028d:
            java.lang.Object r10 = r2.next()
            com.google.android.gms.analytics.b.a r10 = (com.google.android.gms.analytics.p10734b.C142694a) r10
            java.lang.String r10 = "pr"
            com.google.android.gms.analytics.C142697d.m231525a(r10, r5)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            throw r4
        L_0x029e:
            java.lang.Object r10 = r2.next()
            com.google.android.gms.analytics.b.b r10 = (com.google.android.gms.analytics.p10734b.C142695b) r10
            java.lang.String r10 = "promo"
            com.google.android.gms.analytics.C142697d.m231525a(r10, r5)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            throw r4
        L_0x02af:
            java.lang.Class<com.google.android.gms.analytics.a.f> r1 = com.google.android.gms.analytics.p10733a.C142685f.class
            com.google.android.gms.analytics.j r1 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.f r1 = (com.google.android.gms.analytics.p10733a.C142685f) r1
            if (r1 == 0) goto L_0x02e1
            java.lang.String r2 = "ul"
            java.lang.String r3 = r1.f387186a
            m231521f(r0, r2, r3)
            int r2 = r1.f387187b
            int r1 = r1.f387188c
            if (r2 <= 0) goto L_0x02e1
            if (r1 <= 0) goto L_0x02e1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "x"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "sr"
            java.lang.String r2 = r3.toString()
            r0.put(r1, r2)
        L_0x02e1:
            java.lang.Class<com.google.android.gms.analytics.a.a> r1 = com.google.android.gms.analytics.p10733a.C142680a.class
            com.google.android.gms.analytics.j r10 = r10.mo117483b(r1)
            com.google.android.gms.analytics.a.a r10 = (com.google.android.gms.analytics.p10733a.C142680a) r10
            if (r10 == 0) goto L_0x0307
            java.lang.String r1 = "an"
            java.lang.String r2 = r10.f387169a
            m231521f(r0, r1, r2)
            java.lang.String r1 = "aid"
            java.lang.String r2 = r10.f387171c
            m231521f(r0, r1, r2)
            java.lang.String r1 = "aiid"
            java.lang.String r2 = r10.f387172d
            m231521f(r0, r1, r2)
            java.lang.String r1 = "av"
            java.lang.String r10 = r10.f387170b
            m231521f(r0, r1, r10)
        L_0x0307:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.C142693b.m231520d(com.google.android.gms.analytics.h):java.util.Map");
    }

    /* renamed from: f */
    private static void m231521f(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: g */
    private static void m231522g(Map map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    /* renamed from: b */
    public final Uri mo117476b() {
        return this.f387202d;
    }

    /* renamed from: e */
    public final void mo117477e(C142701h hVar) {
        C143919bh.m233960c(hVar.f387211b, "Can't deliver not submitted measurement");
        C143919bh.m233965h("deliver should be called on worker thread");
        C142701h hVar2 = new C142701h(hVar);
        C142689j jVar = (C142689j) hVar2.mo117482a(C142689j.class);
        if (TextUtils.isEmpty(jVar.f387192a)) {
            this.f387328e.mo117548h().mo117510c(m231520d(hVar2), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(jVar.f387193b)) {
            this.f387328e.mo117548h().mo117510c(m231520d(hVar2), "Ignoring measurement without client id");
        } else {
            boolean z = this.f387200b.mo117541a().f387207e;
            if (C142731ba.m231607g(C59203do.f157270a, jVar.f387193b)) {
                super.mo117536i(3, "Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(C59203do.f157270a), (Object) null, (Object) null);
                return;
            }
            Map d = m231520d(hVar2);
            d.put("v", "1");
            d.put("_v", C142738h.f387331b);
            d.put("tid", this.f387201c);
            if (this.f387200b.mo117541a().f387206d) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : d.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append((String) entry.getValue());
                }
                super.mo117536i(4, "Dry run is enabled. GoogleAnalytics would have sent", sb.toString(), (Object) null, (Object) null);
                return;
            }
            HashMap hashMap = new HashMap();
            C142731ba.m231604d(hashMap, "uid", jVar.f387194c);
            C142680a aVar = (C142680a) hVar.mo117483b(C142680a.class);
            if (aVar != null) {
                C142731ba.m231604d(hashMap, "an", aVar.f387169a);
                C142731ba.m231604d(hashMap, "aid", aVar.f387171c);
                C142731ba.m231604d(hashMap, "av", aVar.f387170b);
                C142731ba.m231604d(hashMap, "aiid", aVar.f387172d);
            }
            d.put("_s", String.valueOf(this.f387328e.mo117544d().mo117530b(new C142742l(jVar.f387193b, this.f387201c, !TextUtils.isEmpty(jVar.f387195d), hashMap))));
            this.f387328e.mo117544d().mo117531c(new C142718ao(this.f387328e.mo117548h(), d, hVar.f387212c, true));
        }
    }
}
