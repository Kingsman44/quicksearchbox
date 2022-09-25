package androidx.media3.p132b.p133a;

import android.os.ConditionVariable;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.p131a.C2452c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: androidx.media3.b.a.z */
/* compiled from: PG */
public final class C2481z implements C2457b {

    /* renamed from: f */
    private static final HashSet f6819f = new HashSet();

    /* renamed from: a */
    public final File f6820a;

    /* renamed from: b */
    public final C2473r f6821b;

    /* renamed from: c */
    public final C2463h f6822c;

    /* renamed from: d */
    public long f6823d;

    /* renamed from: e */
    public C2455a f6824e;

    /* renamed from: g */
    private final HashMap f6825g;

    /* renamed from: h */
    private final Random f6826h;

    /* renamed from: i */
    private long f6827i;

    /* renamed from: j */
    private final C2478w f6828j;

    public C2481z(File file, C2478w wVar, C2452c cVar) {
        C2473r rVar = new C2473r(cVar, file);
        C2463h hVar = new C2463h(cVar);
        if (m6537n(file)) {
            this.f6820a = file;
            this.f6828j = wVar;
            this.f6821b = rVar;
            this.f6822c = hVar;
            this.f6825g = new HashMap();
            this.f6826h = new Random();
            this.f6823d = -1;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C2480y(this, conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: ".concat(file.toString()));
    }

    /* renamed from: i */
    public static void m6533i(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String concat = "Failed to create cache directory: ".concat(file.toString());
            C2633u.m7048c("SimpleCache", concat);
            throw new C2455a(concat);
        }
    }

    /* renamed from: k */
    private final void m6534k(C2456aa aaVar) {
        this.f6821b.mo5902b(aaVar.f6782a).f6792c.add(aaVar);
        this.f6827i += aaVar.f6784c;
        ArrayList arrayList = (ArrayList) this.f6825g.get(aaVar.f6782a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C2478w) arrayList.get(size)).mo5914b(this, aaVar);
            }
        }
        this.f6828j.mo5914b(this, aaVar);
    }

    /* renamed from: l */
    private final void m6535l(C2467l lVar) {
        C2469n a = this.f6821b.mo5901a(lVar.f6782a);
        if (a != null && a.f6792c.remove(lVar)) {
            File file = lVar.f6786e;
            if (file != null) {
                file.delete();
            }
            this.f6827i -= lVar.f6784c;
            String name = lVar.f6786e.getName();
            try {
                this.f6822c.mo5887c(name);
            } catch (IOException unused) {
                C2633u.m7050e("SimpleCache", "Failed to remove file index entry for: ".concat(String.valueOf(name)));
            }
            this.f6821b.mo5903d(a.f6791b);
            ArrayList arrayList = (ArrayList) this.f6825g.get(lVar.f6782a);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((C2478w) arrayList.get(size)).mo5915c(lVar);
                }
            }
            this.f6828j.mo5915c(lVar);
        }
    }

    /* renamed from: m */
    private final void m6536m() {
        ArrayList arrayList = new ArrayList();
        for (C2469n nVar : Collections.unmodifiableCollection(this.f6821b.f6802a.values())) {
            Iterator it = nVar.f6792c.iterator();
            while (it.hasNext()) {
                C2467l lVar = (C2467l) it.next();
                if (lVar.f6786e.length() != lVar.f6784c) {
                    arrayList.add(lVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m6535l((C2467l) arrayList.get(i));
        }
    }

    /* renamed from: n */
    private static synchronized boolean m6537n(File file) {
        boolean add;
        synchronized (C2481z.class) {
            add = f6819f.add(file.getAbsoluteFile());
        }
        return add;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012b, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized androidx.media3.p132b.p133a.C2467l mo5868a(java.lang.String r20, long r21, long r23) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r11 = r21
            r13 = r23
            monitor-enter(r19)
            r19.mo5919h()     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.r r2 = r1.f6821b     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.n r15 = r2.mo5901a(r0)     // Catch:{ all -> 0x0139 }
            r16 = -1
            if (r15 == 0) goto L_0x0073
        L_0x0016:
            java.lang.String r3 = r15.f6791b     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.aa r10 = new androidx.media3.b.a.aa     // Catch:{ all -> 0x0139 }
            r6 = -1
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r18 = 0
            r2 = r10
            r4 = r21
            r0 = r10
            r10 = r18
            r2.<init>(r3, r4, r6, r8, r10)     // Catch:{ all -> 0x0139 }
            java.util.TreeSet r2 = r15.f6792c     // Catch:{ all -> 0x0139 }
            java.lang.Object r2 = r2.floor(r0)     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.aa r2 = (androidx.media3.p132b.p133a.C2456aa) r2     // Catch:{ all -> 0x0139 }
            if (r2 == 0) goto L_0x003f
            long r3 = r2.f6783b     // Catch:{ all -> 0x0139 }
            long r5 = r2.f6784c     // Catch:{ all -> 0x0139 }
            long r3 = r3 + r5
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x005d
        L_0x003f:
            java.util.TreeSet r2 = r15.f6792c     // Catch:{ all -> 0x0139 }
            java.lang.Object r0 = r2.ceiling(r0)     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.aa r0 = (androidx.media3.p132b.p133a.C2456aa) r0     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x0056
            long r2 = r0.f6783b     // Catch:{ all -> 0x0139 }
            long r2 = r2 - r11
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            long r2 = java.lang.Math.min(r2, r13)     // Catch:{ all -> 0x0139 }
            goto L_0x0057
        L_0x0056:
            r2 = r13
        L_0x0057:
            java.lang.String r0 = r15.f6791b     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.aa r2 = androidx.media3.p132b.p133a.C2456aa.m6473d(r0, r11, r2)     // Catch:{ all -> 0x0139 }
        L_0x005d:
            boolean r0 = r2.f6785d     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x0077
            java.io.File r0 = r2.f6786e     // Catch:{ all -> 0x0139 }
            long r3 = r0.length()     // Catch:{ all -> 0x0139 }
            long r5 = r2.f6784c     // Catch:{ all -> 0x0139 }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            r19.m6536m()     // Catch:{ all -> 0x0139 }
            r0 = r20
            goto L_0x0016
        L_0x0073:
            androidx.media3.b.a.aa r2 = androidx.media3.p132b.p133a.C2456aa.m6473d(r20, r21, r23)     // Catch:{ all -> 0x0139 }
        L_0x0077:
            boolean r0 = r2.f6785d     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x00ef
            java.io.File r0 = r2.f6786e     // Catch:{ all -> 0x0139 }
            r0.getClass()
            java.lang.String r4 = r0.getName()     // Catch:{ all -> 0x0139 }
            long r5 = r2.f6784c     // Catch:{ all -> 0x0139 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.h r3 = r1.f6822c     // Catch:{ all -> 0x0139 }
            r7 = r13
            r3.mo5889e(r4, r5, r7)     // Catch:{ IOException -> 0x0091 }
            goto L_0x0098
        L_0x0091:
            java.lang.String r0 = "SimpleCache"
            java.lang.String r3 = "Failed to update index with new touch timestamp."
            androidx.media3.common.p136b.C2633u.m7050e(r0, r3)     // Catch:{ all -> 0x0139 }
        L_0x0098:
            androidx.media3.b.a.r r0 = r1.f6821b     // Catch:{ all -> 0x0139 }
            r3 = r20
            androidx.media3.b.a.n r0 = r0.mo5901a(r3)     // Catch:{ all -> 0x0139 }
            java.util.TreeSet r3 = r0.f6792c     // Catch:{ all -> 0x0139 }
            boolean r3 = r3.remove(r2)     // Catch:{ all -> 0x0139 }
            androidx.media3.common.p136b.C2601a.m6832d(r3)     // Catch:{ all -> 0x0139 }
            java.io.File r15 = r2.f6786e     // Catch:{ all -> 0x0139 }
            r15.getClass()
            boolean r3 = r2.f6785d     // Catch:{ all -> 0x0139 }
            androidx.media3.common.p136b.C2601a.m6832d(r3)     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.aa r3 = new androidx.media3.b.a.aa     // Catch:{ all -> 0x0139 }
            java.lang.String r8 = r2.f6782a     // Catch:{ all -> 0x0139 }
            long r9 = r2.f6783b     // Catch:{ all -> 0x0139 }
            long r11 = r2.f6784c     // Catch:{ all -> 0x0139 }
            r7 = r3
            r7.<init>(r8, r9, r11, r13, r15)     // Catch:{ all -> 0x0139 }
            java.util.TreeSet r0 = r0.f6792c     // Catch:{ all -> 0x0139 }
            r0.add(r3)     // Catch:{ all -> 0x0139 }
            java.util.HashMap r0 = r1.f6825g     // Catch:{ all -> 0x0139 }
            java.lang.String r4 = r2.f6782a     // Catch:{ all -> 0x0139 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0139 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x00e5
            int r4 = r0.size()     // Catch:{ all -> 0x0139 }
        L_0x00d4:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x00e5
            java.lang.Object r5 = r0.get(r4)     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.w r5 = (androidx.media3.p132b.p133a.C2478w) r5     // Catch:{ all -> 0x0139 }
            r5.mo5915c(r2)     // Catch:{ all -> 0x0139 }
            r5.mo5914b(r1, r3)     // Catch:{ all -> 0x0139 }
            goto L_0x00d4
        L_0x00e5:
            androidx.media3.b.a.w r0 = r1.f6828j     // Catch:{ all -> 0x0139 }
            r0.mo5915c(r2)     // Catch:{ all -> 0x0139 }
            r0.mo5914b(r1, r3)     // Catch:{ all -> 0x0139 }
            monitor-exit(r19)
            return r3
        L_0x00ef:
            r3 = r20
            androidx.media3.b.a.r r0 = r1.f6821b     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.n r0 = r0.mo5902b(r3)     // Catch:{ all -> 0x0139 }
            long r3 = r2.f6784c     // Catch:{ all -> 0x0139 }
            r5 = 0
        L_0x00fa:
            java.util.ArrayList r6 = r0.f6793d     // Catch:{ all -> 0x0139 }
            int r6 = r6.size()     // Catch:{ all -> 0x0139 }
            if (r5 >= r6) goto L_0x012d
            java.util.ArrayList r6 = r0.f6793d     // Catch:{ all -> 0x0139 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.m r6 = (androidx.media3.p132b.p133a.C2468m) r6     // Catch:{ all -> 0x0139 }
            long r7 = r6.f6788a     // Catch:{ all -> 0x0139 }
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x011c
            long r9 = r6.f6789b     // Catch:{ all -> 0x0139 }
            int r6 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x012a
            long r7 = r7 + r9
            int r6 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x012a
            goto L_0x0127
        L_0x011c:
            int r6 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x012a
            long r9 = r11 + r3
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0127
            goto L_0x012a
        L_0x0127:
            int r5 = r5 + 1
            goto L_0x00fa
        L_0x012a:
            monitor-exit(r19)
            r0 = 0
            return r0
        L_0x012d:
            java.util.ArrayList r0 = r0.f6793d     // Catch:{ all -> 0x0139 }
            androidx.media3.b.a.m r5 = new androidx.media3.b.a.m     // Catch:{ all -> 0x0139 }
            r5.<init>(r11, r3)     // Catch:{ all -> 0x0139 }
            r0.add(r5)     // Catch:{ all -> 0x0139 }
            monitor-exit(r19)
            return r2
        L_0x0139:
            r0 = move-exception
            monitor-exit(r19)
            goto L_0x013d
        L_0x013c:
            throw r0
        L_0x013d:
            goto L_0x013c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p132b.p133a.C2481z.mo5868a(java.lang.String, long, long):androidx.media3.b.a.l");
    }

    /* renamed from: b */
    public final synchronized C2474s mo5869b(String str) {
        C2476u uVar;
        C2469n a = this.f6821b.mo5901a(str);
        if (a != null) {
            uVar = a.f6794e;
        } else {
            uVar = C2476u.f6810a;
        }
        return uVar;
    }

    /* renamed from: c */
    public final synchronized File mo5870c(String str, long j, long j2) {
        C2469n a;
        File file;
        mo5919h();
        a = this.f6821b.mo5901a(str);
        a.getClass();
        C2601a.m6832d(a.mo5894a(j, j2));
        if (!this.f6820a.exists()) {
            m6533i(this.f6820a);
            m6536m();
        }
        C2478w wVar = this.f6828j;
        if (j2 != -1) {
            wVar.mo5913a(this, j2);
        }
        file = new File(this.f6820a, Integer.toString(this.f6826h.nextInt(10)));
        if (!file.exists()) {
            m6533i(file);
        }
        return C2456aa.m6474e(file, a.f6790a, j, System.currentTimeMillis());
    }

    /* renamed from: d */
    public final synchronized void mo5871d(String str, C2475t tVar) {
        mo5919h();
        C2473r rVar = this.f6821b;
        C2469n b = rVar.mo5902b(str);
        C2476u uVar = b.f6794e;
        b.f6794e = uVar.mo5909c(tVar);
        if (!b.f6794e.equals(uVar)) {
            rVar.f6804c.mo5898b(b);
        }
        try {
            this.f6821b.mo5904e();
        } catch (IOException e) {
            throw new C2455a((Throwable) e);
        }
    }

    /* renamed from: e */
    public final synchronized void mo5872e(File file, long j) {
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C2456aa c = C2456aa.m6472c(file, j, -9223372036854775807L, this.f6821b);
            c.getClass();
            C2469n a = this.f6821b.mo5901a(c.f6782a);
            a.getClass();
            C2601a.m6832d(a.mo5894a(c.f6783b, c.f6784c));
            long a2 = a.f6794e.mo5905a();
            if (a2 != -1) {
                C2601a.m6832d(c.f6783b + c.f6784c <= a2);
            }
            try {
                this.f6822c.mo5889e(file.getName(), c.f6784c, c.f6787f);
                m6534k(c);
                this.f6821b.mo5904e();
                notifyAll();
            } catch (IOException e) {
                throw new C2455a((Throwable) e);
            } catch (IOException e2) {
                throw new C2455a((Throwable) e2);
            }
        }
    }

    /* renamed from: f */
    public final synchronized void mo5873f(C2467l lVar) {
        C2469n a = this.f6821b.mo5901a(lVar.f6782a);
        a.getClass();
        long j = lVar.f6783b;
        int i = 0;
        while (i < a.f6793d.size()) {
            if (((C2468m) a.f6793d.get(i)).f6788a == j) {
                a.f6793d.remove(i);
                this.f6821b.mo5903d(a.f6791b);
                notifyAll();
            } else {
                i++;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public final synchronized void mo5874g(C2467l lVar) {
        m6535l(lVar);
    }

    /* renamed from: h */
    public final synchronized void mo5919h() {
        C2455a aVar = this.f6824e;
        if (aVar != null) {
            throw aVar;
        }
    }

    /* renamed from: j */
    public final void mo5920j(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr != null && (r0 = fileArr.length) != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z) {
                    if (name.indexOf(46) == -1) {
                        mo5920j(file2, false, file2.listFiles(), map);
                    } else if (!name.startsWith("cached_content_index.exi")) {
                        if (name.endsWith(".uid")) {
                        }
                    }
                }
                C2462g gVar = (C2462g) map.remove(name);
                if (gVar != null) {
                    j2 = gVar.f6774a;
                    j = gVar.f6775b;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                C2456aa c = C2456aa.m6472c(file2, j2, j, this.f6821b);
                if (c != null) {
                    m6534k(c);
                } else {
                    file2.delete();
                }
            }
        } else if (!z) {
            file.delete();
        }
    }
}
