package com.google.android.libraries.elements.p1729h;

import android.util.SparseArray;
import com.google.android.libraries.elements.interfaces.C21307n;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g.C40369aa;
import com.google.common.p4522b.C58733pz;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.elements.h.f */
/* compiled from: PG */
public final class C21208f implements C21307n {

    /* renamed from: b */
    public static final SparseArray f59507b;

    /* renamed from: c */
    public final int f59508c;

    /* renamed from: d */
    public boolean f59509d = false;

    /* renamed from: e */
    public final long f59510e;

    /* renamed from: f */
    public long f59511f;

    /* renamed from: g */
    public long f59512g;

    /* renamed from: h */
    public long f59513h;

    /* renamed from: i */
    public long f59514i;

    /* renamed from: j */
    public long f59515j;

    /* renamed from: k */
    private final C21203af f59516k;

    /* renamed from: l */
    private final C21225w f59517l;

    /* renamed from: m */
    private final Executor f59518m;

    /* renamed from: n */
    private final String f59519n;

    /* renamed from: o */
    private int f59520o = -1;

    /* renamed from: p */
    private String f59521p = null;

    /* renamed from: q */
    private final C40369aa f59522q;

    static {
        SparseArray sparseArray = new SparseArray();
        f59507b = sparseArray;
        sparseArray.put(16, C21199ab.FIRST_ROOT_PREPARATION);
        sparseArray.put(6, C21199ab.ROOT_MOUNTING);
    }

    public C21208f(int i, String str, C40369aa aaVar, C21203af afVar, Executor executor) {
        this.f59508c = i;
        this.f59522q = aaVar;
        this.f59518m = executor;
        this.f59516k = afVar;
        this.f59510e = TimeUnit.MICROSECONDS.convert(aaVar.f106020a.mo26872d(), TimeUnit.NANOSECONDS);
        this.f59517l = C21224v.m39930a();
        this.f59519n = str;
    }

    /* renamed from: a */
    public final void mo13235a(String str, String str2) {
        if ("CellLogId".equals(str)) {
            try {
                this.f59520o = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                this.f59520o = -1;
            }
        } else if ("CELL_NODE_ID".equals(str)) {
            this.f59521p = str2;
        }
    }

    /* renamed from: c */
    public final void mo26257c() {
        this.f59509d = true;
    }

    /* renamed from: d */
    public final void mo26258d() {
        this.f59511f = TimeUnit.MICROSECONDS.convert(this.f59522q.f106020a.mo26872d(), TimeUnit.NANOSECONDS);
        this.f59518m.execute(new C21207e(this));
    }

    /* renamed from: e */
    public final boolean mo26259e() {
        return !this.f59509d;
    }

    /* renamed from: f */
    public final void mo26260f(String str, long j, long j2) {
        C21228z k = C21198aa.m39840k();
        C21205c cVar = (C21205c) k;
        cVar.f59497a = this.f59517l;
        k.mo26252c(C58733pz.f156496a);
        String str2 = this.f59521p;
        if (str2 != null) {
            cVar.f59498b = str2;
        }
        C21197a aVar = new C21197a();
        aVar.mo26220b(str);
        aVar.f59464a = Long.valueOf(j);
        aVar.f59465b = Long.valueOf(j2);
        aVar.f59467d = k.mo26250a();
        C21200ac a = aVar.mo26219a();
        int i = this.f59520o;
        if (i > 0) {
            this.f59516k.mo26245d(this.f59519n, i, a);
        } else {
            this.f59516k.mo26246e(this.f59519n, a);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13236b(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r6.f59508c
            r1 = 16
            if (r0 == r1) goto L_0x0007
            return
        L_0x0007:
            int r0 = r7.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -2086025552: goto L_0x0030;
                case -935948671: goto L_0x0026;
                case 749650793: goto L_0x001c;
                case 1694616058: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x003a
        L_0x0012:
            java.lang.String r0 = "end_measure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003a
            r7 = 3
            goto L_0x003b
        L_0x001c:
            java.lang.String r0 = "end_create_layout"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003a
            r7 = 1
            goto L_0x003b
        L_0x0026:
            java.lang.String r0 = "start_measure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003a
            r7 = 2
            goto L_0x003b
        L_0x0030:
            java.lang.String r0 = "start_create_layout"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003a
            r7 = 0
            goto L_0x003b
        L_0x003a:
            r7 = -1
        L_0x003b:
            r4 = -1
            if (r7 == 0) goto L_0x0069
            if (r7 == r3) goto L_0x005e
            if (r7 == r2) goto L_0x0051
            if (r7 == r1) goto L_0x0046
            return
        L_0x0046:
            com.google.android.libraries.search.rendering.xuikit.d.g.aa r7 = r6.f59522q
            com.google.android.libraries.f.a r7 = r7.f106020a
            long r0 = java.util.concurrent.TimeUnit.MICROSECONDS.convert(r7.mo26872d(), java.util.concurrent.TimeUnit.NANOSECONDS)
            r6.f59513h = r0
            return
        L_0x0051:
            com.google.android.libraries.search.rendering.xuikit.d.g.aa r7 = r6.f59522q
            com.google.android.libraries.f.a r7 = r7.f106020a
            long r0 = java.util.concurrent.TimeUnit.MICROSECONDS.convert(r7.mo26872d(), java.util.concurrent.TimeUnit.NANOSECONDS)
            r6.f59512g = r0
            r6.f59513h = r4
            return
        L_0x005e:
            com.google.android.libraries.search.rendering.xuikit.d.g.aa r7 = r6.f59522q
            com.google.android.libraries.f.a r7 = r7.f106020a
            long r0 = java.util.concurrent.TimeUnit.MICROSECONDS.convert(r7.mo26872d(), java.util.concurrent.TimeUnit.NANOSECONDS)
            r6.f59515j = r0
            return
        L_0x0069:
            com.google.android.libraries.search.rendering.xuikit.d.g.aa r7 = r6.f59522q
            com.google.android.libraries.f.a r7 = r7.f106020a
            long r0 = java.util.concurrent.TimeUnit.MICROSECONDS.convert(r7.mo26872d(), java.util.concurrent.TimeUnit.NANOSECONDS)
            r6.f59514i = r0
            r6.f59515j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1729h.C21208f.mo13236b(java.lang.String):void");
    }
}
