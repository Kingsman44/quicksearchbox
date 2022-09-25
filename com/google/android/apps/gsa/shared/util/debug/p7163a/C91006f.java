package com.google.android.apps.gsa.shared.util.debug.p7163a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7158b.C90744a;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58832aw;
import com.google.common.base.C58880cq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.IllegalFormatException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.f */
/* compiled from: PG */
public final class C91006f {

    /* renamed from: d */
    private static final C59071e f254234d = C59071e.m91332i("com.google.android.apps.gsa.shared.util.debug.a.f");

    /* renamed from: e */
    private static final String[] f254235e = {BuildConfig.FLAVOR, C58880cq.m90966b("  ", 1), C58880cq.m90966b("  ", 2), C58880cq.m90966b("  ", 3), C58880cq.m90966b("  ", 4), C58880cq.m90966b("  ", 5), C58880cq.m90966b("  ", 6), C58880cq.m90966b("  ", 7), C58880cq.m90966b("  ", 8), C58880cq.m90966b("  ", 9)};

    /* renamed from: a */
    public final C59795fw f254236a;

    /* renamed from: b */
    public final Map f254237b;

    /* renamed from: c */
    public final Map f254238c;

    /* renamed from: f */
    private final List f254239f;

    /* renamed from: g */
    private final int f254240g;

    /* renamed from: h */
    private final WeakReference f254241h;

    /* renamed from: i */
    private final C91006f f254242i;

    /* renamed from: j */
    private final Map f254243j;

    /* renamed from: k */
    private final Map f254244k;

    /* renamed from: l */
    private boolean f254245l = false;

    /* renamed from: m */
    private final long f254246m;

    private C91006f(long j, int i, List list, C59795fw fwVar, Map map, Map map2, C91006f fVar, WeakReference weakReference, Map map3, Map map4) {
        this.f254246m = j;
        this.f254240g = i;
        synchronized (list) {
            list.getClass();
            this.f254239f = list;
        }
        map.getClass();
        this.f254237b = map;
        map2.getClass();
        this.f254238c = map2;
        this.f254236a = fwVar;
        this.f254242i = fVar;
        weakReference.getClass();
        this.f254241h = weakReference;
        map3.getClass();
        this.f254243j = map3;
        map4.getClass();
        this.f254244k = map4;
    }

    /* renamed from: A */
    private final boolean m148642A(C91012l lVar) {
        int i;
        Integer num = (Integer) this.f254243j.get(lVar);
        String W = lVar.mo27493W();
        if (num != null) {
            mo85293t("[%s #%s - see above for complete dump]", C90752i.m148229c(W), C90752i.m148230d(num));
            return true;
        }
        Integer num2 = (Integer) this.f254244k.get(W);
        Map map = this.f254244k;
        if (num2 == null) {
            i = 0;
        } else {
            i = num2.intValue();
        }
        map.put(W, Integer.valueOf(i + 1));
        Integer num3 = (Integer) this.f254244k.get(W);
        this.f254243j.put(lVar, num3);
        mo85293t("[%s #%s]", C90752i.m148229c(W), C90752i.m148230d(num3));
        return false;
    }

    /* renamed from: B */
    private final boolean m148643B(Object obj) {
        if (this.f254241h.get() == obj) {
            return true;
        }
        C91006f fVar = this.f254242i;
        return fVar != null && fVar.m148643B(obj);
    }

    /* renamed from: a */
    public static C90752i m148644a(C91010j jVar) {
        return new C91004d(jVar);
    }

    /* renamed from: f */
    public static C91006f m148645f(C90476a aVar) {
        long j = 0;
        if (!aVar.mo84225b() && !C58832aw.m90831a("developer", C90744a.m148217a("gsa.dumper"))) {
            j = 1;
        }
        return m148646g(j);
    }

    /* renamed from: g */
    public static C91006f m148646g(long j) {
        return new C91006f(j, 0, new LinkedList(), (C59795fw) C59796fx.f161580r.createBuilder(), new LinkedHashMap(), new LinkedHashMap(), (C91006f) null, new WeakReference((Object) null), new IdentityHashMap(), new HashMap());
    }

    /* renamed from: h */
    public static String m148647h(boolean z, String str, C90752i... iVarArr) {
        Object[] objArr = new Object[iVarArr.length];
        for (int i = 0; i < iVarArr.length; i++) {
            objArr[i] = iVarArr[i].mo85092a(z);
        }
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException unused) {
            return String.format(Locale.US, "Illegal format [%s, %s]", new Object[]{str, Arrays.toString(objArr)});
        }
    }

    /* renamed from: y */
    private final void m148648y(String str, CharSequence charSequence, int i) {
        synchronized (this.f254239f) {
            this.f254239f.add(new C91003c(this.f254240g, str, charSequence, i));
        }
        this.f254245l = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        r0 = false;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m148649z(java.lang.String r13, java.lang.Appendable r14) {
        /*
            r12 = this;
            java.lang.String r0 = "\n"
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r0 = r0.concat(r1)
            com.google.common.o.fw r1 = r12.f254236a
            com.google.protobuf.bv r1 = r1.build()
            com.google.common.o.fx r1 = (com.google.common.p4552o.C59796fx) r1
            com.google.android.apps.gsa.shared.util.debug.a.a.j r2 = new com.google.android.apps.gsa.shared.util.debug.a.a.j
            r2.<init>()
            com.google.android.apps.gsa.shared.util.debug.a.a.a r3 = new com.google.android.apps.gsa.shared.util.debug.a.a.a
            r3.<init>(r2)
            com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a.C90972h.m148591b(r1, r3)
            java.util.List r1 = r2.f254185a
            boolean r2 = r1.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x004b
            r14.append(r13)
            com.google.common.base.ar r2 = new com.google.common.base.ar
            r2.<init>((java.lang.String) r0)
            java.util.Iterator r0 = r1.iterator()
            r2.mo56092b(r14, r0)
            java.util.List r0 = r12.f254239f
            monitor-enter(r0)
            java.util.List r1 = r12.f254239f     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0045
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            r0 = 0
            goto L_0x004c
        L_0x0048:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r13
        L_0x004b:
            r0 = 1
        L_0x004c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.List r2 = r12.f254239f
            monitor-enter(r2)
            java.util.List r5 = r12.f254239f     // Catch:{ all -> 0x00fe }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00fe }
            r6 = 0
        L_0x005b:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x00fe }
            if (r7 == 0) goto L_0x00e8
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x00fe }
            com.google.android.apps.gsa.shared.util.debug.a.c r7 = (com.google.android.apps.gsa.shared.util.debug.p7163a.C91003c) r7     // Catch:{ all -> 0x00fe }
            int r8 = r7.f254226a     // Catch:{ all -> 0x00fe }
            if (r8 >= 0) goto L_0x0070
            java.lang.String[] r8 = f254235e     // Catch:{ all -> 0x00fe }
            r8 = r8[r4]     // Catch:{ all -> 0x00fe }
            goto L_0x0080
        L_0x0070:
            java.lang.String[] r9 = f254235e     // Catch:{ all -> 0x00fe }
            int r10 = r9.length     // Catch:{ all -> 0x00fe }
            r10 = 10
            if (r8 >= r10) goto L_0x007a
            r8 = r9[r8]     // Catch:{ all -> 0x00fe }
            goto L_0x0080
        L_0x007a:
            java.lang.String r9 = "  "
            java.lang.String r8 = com.google.common.base.C58880cq.m90966b(r9, r8)     // Catch:{ all -> 0x00fe }
        L_0x0080:
            java.lang.String r9 = r7.toString()     // Catch:{ all -> 0x00fe }
            int r10 = r7.f254227b     // Catch:{ all -> 0x00fe }
            r10 = r10 & r3
            if (r10 == 0) goto L_0x00a9
            int r10 = r7.f254226a     // Catch:{ all -> 0x00fe }
            if (r10 != r6) goto L_0x00a9
            int r10 = r1.length()     // Catch:{ all -> 0x00fe }
            int r11 = r9.length()     // Catch:{ all -> 0x00fe }
            int r10 = r10 + r11
            r11 = 97
            if (r10 > r11) goto L_0x00a9
            int r7 = r1.length()     // Catch:{ all -> 0x00fe }
            if (r7 == 0) goto L_0x00a2
            java.lang.String r8 = " | "
        L_0x00a2:
            r1.append(r8)     // Catch:{ all -> 0x00fe }
            r1.append(r9)     // Catch:{ all -> 0x00fe }
            goto L_0x005b
        L_0x00a9:
            int r6 = r1.length()     // Catch:{ all -> 0x00fe }
            if (r6 <= 0) goto L_0x00c3
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "\n"
            r14.append(r0)     // Catch:{ all -> 0x00fe }
        L_0x00b6:
            java.lang.Appendable r0 = r14.append(r13)     // Catch:{ all -> 0x00fe }
            r0.append(r1)     // Catch:{ all -> 0x00fe }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
            r1.<init>()     // Catch:{ all -> 0x00fe }
            r0 = 0
        L_0x00c3:
            int r6 = r7.f254226a     // Catch:{ all -> 0x00fe }
            r1.append(r8)     // Catch:{ all -> 0x00fe }
            r1.append(r9)     // Catch:{ all -> 0x00fe }
            int r7 = r7.f254227b     // Catch:{ all -> 0x00fe }
            r7 = r7 & 2
            if (r7 != 0) goto L_0x005b
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "\n"
            r14.append(r0)     // Catch:{ all -> 0x00fe }
        L_0x00d8:
            java.lang.Appendable r0 = r14.append(r13)     // Catch:{ all -> 0x00fe }
            r0.append(r1)     // Catch:{ all -> 0x00fe }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
            r0.<init>()     // Catch:{ all -> 0x00fe }
            r1 = r0
            r0 = 0
            goto L_0x005b
        L_0x00e8:
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x00fd
            if (r0 != 0) goto L_0x00f6
            java.lang.String r0 = "\n"
            r14.append(r0)
        L_0x00f6:
            java.lang.Appendable r13 = r14.append(r13)
            r13.append(r1)
        L_0x00fd:
            return
        L_0x00fe:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            goto L_0x0102
        L_0x0101:
            throw r13
        L_0x0102:
            goto L_0x0101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f.m148649z(java.lang.String, java.lang.Appendable):void");
    }

    /* renamed from: b */
    public final C91005e mo85278b(String str) {
        StringBuilder sb = new StringBuilder();
        m148648y(str, sb, true != this.f254245l ? 2 : 3);
        StringBuilder sb2 = new StringBuilder();
        this.f254237b.put(str, sb2);
        return new C91005e(mo85298x(), sb, sb2);
    }

    /* renamed from: c */
    public final C91005e mo85279c(String str) {
        return mo85280d(str, true != this.f254245l ? 2 : 3);
    }

    /* renamed from: d */
    public final C91005e mo85280d(String str, int i) {
        StringBuilder sb = new StringBuilder();
        m148648y(str, sb, i);
        return new C91005e(mo85298x(), sb, (StringBuilder) null);
    }

    /* renamed from: e */
    public final C91006f mo85281e(Object obj) {
        return new C91006f(this.f254246m, this.f254240g + 1, this.f254239f, this.f254236a, this.f254237b, this.f254238c, this, new WeakReference(obj), this.f254243j, this.f254244k);
    }

    /* renamed from: i */
    public final String mo85282i() {
        StringBuilder sb = new StringBuilder();
        try {
            m148649z(BuildConfig.FLAVOR, sb);
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f254234d.mo56226d()).mo56382g(e)).mo56372aa(11403)).mo56386p("Problem building dump String");
        }
        return sb.toString();
    }

    /* renamed from: j */
    public final void mo85283j(String str, String str2, boolean z) {
        if (!z || mo85298x()) {
            this.f254238c.put(str, str2);
        }
    }

    /* renamed from: k */
    public final void mo85284k(String str, String str2) {
        this.f254237b.put(str, str2);
    }

    /* renamed from: l */
    public final void mo85285l(C90964a aVar) {
        if (aVar != null) {
            if (m148643B(aVar)) {
                mo85293t("[cycle detected]", new C90752i[0]);
            } else if (!(aVar instanceof C91012l) || !m148642A((C91012l) aVar)) {
                C91006f e = mo85281e(aVar);
                try {
                    aVar.mo17602gS(e);
                } catch (Exception e2) {
                    e.mo85293t("[%s]", C90752i.m148229c(e2.getClass().getSimpleName()));
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo85286m(C90991b bVar) {
        if (bVar != null) {
            if (m148643B(bVar)) {
                mo85293t("[cycle detected]", new C90752i[0]);
            } else if (!(bVar instanceof C91012l) || !m148642A((C91012l) bVar)) {
                C91006f e = mo85281e(bVar);
                try {
                    bVar.mo17602gS(e);
                } catch (Exception e2) {
                    e.mo85293t("[%s]", C90752i.m148229c(e2.getClass().getSimpleName()));
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo85287n(C91007g gVar) {
        C22872h.m42743c(C86593a.class);
        if (gVar != null) {
            if (m148643B(gVar)) {
                mo85293t("[cycle detected]", new C90752i[0]);
            } else if (!(gVar instanceof C91012l) || !m148642A((C91012l) gVar)) {
                C91006f e = mo85281e(gVar);
                try {
                    gVar.mo17602gS(e);
                } catch (Exception e2) {
                    e.mo85293t("[%s]", C90752i.m148229c(e2.getClass().getSimpleName()));
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo85288o(String str, C90964a aVar) {
        if (aVar == null) {
            mo85279c(str).mo85277b("null", new C90752i[0]);
            return;
        }
        m148648y(str, BuildConfig.FLAVOR, 0);
        mo85281e((Object) null).mo85285l(aVar);
    }

    /* renamed from: p */
    public final void mo85289p(String str, C90991b bVar) {
        if (bVar == null) {
            mo85279c(str).mo85277b("null", new C90752i[0]);
            return;
        }
        m148648y(str, BuildConfig.FLAVOR, 0);
        mo85281e((Object) null).mo85286m(bVar);
    }

    /* renamed from: q */
    public final void mo85290q(String str, C91007g gVar) {
        if (gVar == null) {
            mo85279c(str).mo85277b("null", new C90752i[0]);
            return;
        }
        m148648y(str, BuildConfig.FLAVOR, 0);
        mo85281e((Object) null).mo85287n(gVar);
    }

    /* renamed from: r */
    public final void mo85291r(String str) {
        synchronized (this.f254239f) {
            this.f254239f.add(new C91003c(this.f254240g - 1, str, BuildConfig.FLAVOR, 0));
        }
        this.f254245l = true;
    }

    /* renamed from: s */
    public final void mo85292s(C90752i iVar) {
        mo85293t("%s", iVar);
    }

    /* renamed from: t */
    public final void mo85293t(String str, C90752i... iVarArr) {
        m148648y(BuildConfig.FLAVOR, m148647h(mo85298x(), str, iVarArr), 0);
    }

    public final String toString() {
        return mo85282i();
    }

    /* renamed from: u */
    public final void mo85295u(PrintWriter printWriter, String str) {
        try {
            m148649z(str, printWriter);
            printWriter.append("\n");
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f254234d.mo56226d()).mo56382g(e)).mo56372aa(11407)).mo56386p("Problem writing dump data");
        }
    }

    /* renamed from: v */
    public final boolean mo85296v() {
        return (this.f254246m & 4) != 0;
    }

    /* renamed from: w */
    public final boolean mo85297w() {
        return (this.f254246m & 2) != 0;
    }

    /* renamed from: x */
    public final boolean mo85298x() {
        return (this.f254246m & 1) == 0;
    }
}
