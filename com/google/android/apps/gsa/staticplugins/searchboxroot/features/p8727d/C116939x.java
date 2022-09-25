package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88584c;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.util.C91146y;
import com.google.android.apps.gsa.shared.util.C91147z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.x */
/* compiled from: PG */
public final class C116939x implements C41630d, C89200e {

    /* renamed from: a */
    public static final C59071e f324662a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.x");

    /* renamed from: b */
    private final C91147z f324663b;

    /* renamed from: c */
    private final C86124t f324664c;

    /* renamed from: d */
    private C88584c f324665d;

    public C116939x(PackageManager packageManager, C21370a aVar, C86124t tVar) {
        C91146y yVar = new C91146y();
        yVar.f254473a = 10;
        long millis = TimeUnit.MINUTES.toMillis(10);
        C58838bb.m90872g(millis > 0, "Cache expiration duration must be positive, got %s", millis);
        yVar.f254474b = millis;
        aVar.getClass();
        yVar.f254475c = aVar;
        yVar.f254476d = new C116938w(packageManager);
        this.f324663b = new C91147z(yVar);
        this.f324664c = tVar;
    }

    /* renamed from: c */
    private final boolean m194328c(String str) {
        if (str == null) {
            return false;
        }
        C88584c cVar = this.f324665d;
        if (cVar.f239426a.get(str) != null) {
            return ((Boolean) cVar.f239426a.get(str)).booleanValue();
        }
        try {
            cVar.f239427b.getPackageInfo(str, 0);
            cVar.f239426a.put(str, true);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            cVar.f239426a.put(str, false);
            return false;
        }
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 3700;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d1, code lost:
        if (r3.booleanValue() != false) goto L_0x0105;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44214b(com.google.android.libraries.searchbox.shared.p3201b.C41642a r14, java.util.List r15) {
        /*
            r13 = this;
            java.util.ListIterator r15 = r15.listIterator()
        L_0x0004:
            boolean r0 = r15.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x010c
            java.lang.Object r0 = r15.next()
            com.google.android.libraries.searchbox.root.a.g r0 = (com.google.android.libraries.searchbox.root.p3199a.C41633g) r0
            int r2 = r0.mo44217m()
            r3 = 84
            r4 = 1
            if (r2 == r3) goto L_0x00d4
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 == r3) goto L_0x0041
            r3 = 158(0x9e, float:2.21E-43)
            if (r2 == r3) goto L_0x0023
            goto L_0x0004
        L_0x0023:
            boolean r2 = r0.mo44223s()
            if (r2 == 0) goto L_0x0105
            com.google.at.h.d.a.aq r0 = r0.mo44219o()
            int r2 = r0.f142330a
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0105
            com.google.at.h.d.a.t r0 = r0.f142344p
            if (r0 != 0) goto L_0x0039
            com.google.at.h.d.a.t r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54256t.f142458b
        L_0x0039:
            java.lang.String r0 = r0.f142460a
            boolean r1 = r13.m194328c(r0)
            goto L_0x0105
        L_0x0041:
            boolean r2 = r0.mo44223s()
            r3 = 0
            if (r2 == 0) goto L_0x005b
            com.google.at.h.d.a.aq r0 = r0.mo44219o()
            int r2 = r0.f142330a
            r2 = r2 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x005b
            com.google.at.h.d.a.f r0 = r0.f142343o
            if (r0 != 0) goto L_0x0058
            com.google.at.h.d.a.f r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54242f.f142415f
        L_0x0058:
            java.lang.String r0 = r0.f142418b
            goto L_0x005c
        L_0x005b:
            r0 = r3
        L_0x005c:
            if (r0 != 0) goto L_0x0061
        L_0x005e:
            r1 = 1
            goto L_0x0105
        L_0x0061:
            com.google.android.apps.gsa.shared.util.z r2 = r13.f324663b
            android.util.LruCache r5 = r2.f254477a
            java.lang.Object r5 = r5.get(r0)
            android.util.Pair r5 = (android.util.Pair) r5
            if (r5 != 0) goto L_0x006e
            goto L_0x00c9
        L_0x006e:
            java.lang.Object r6 = r5.first
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            java.lang.Object r5 = r5.second
            long r8 = r2.f254478b
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x0081
            goto L_0x00c8
        L_0x0081:
            long r6 = r6 + r8
            com.google.android.libraries.f.a r8 = r2.f254479c
            long r8 = r8.mo26870b()
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c8
            monitor-enter(r2)
            android.util.LruCache r5 = r2.f254477a     // Catch:{ all -> 0x00c5 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x00c5 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ all -> 0x00c5 }
            if (r5 == 0) goto L_0x00b0
            java.lang.Object r6 = r5.first     // Catch:{ all -> 0x00c5 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x00c5 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x00c5 }
            long r8 = r2.f254478b     // Catch:{ all -> 0x00c5 }
            long r6 = r6 + r8
            com.google.android.libraries.f.a r8 = r2.f254479c     // Catch:{ all -> 0x00c5 }
            long r8 = r8.mo26870b()     // Catch:{ all -> 0x00c5 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00ad
            goto L_0x00b0
        L_0x00ad:
            java.lang.Object r0 = r5.second     // Catch:{ all -> 0x00c5 }
            goto L_0x00c2
        L_0x00b0:
            android.util.LruCache r5 = r2.f254477a     // Catch:{ all -> 0x00c5 }
            r5.remove(r0)     // Catch:{ all -> 0x00c5 }
            android.util.LruCache r5 = r2.f254477a     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x00c5 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x00c5 }
            if (r0 != 0) goto L_0x00c0
            goto L_0x00c3
        L_0x00c0:
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x00c5 }
        L_0x00c2:
            r3 = r0
        L_0x00c3:
            monitor-exit(r2)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c9
        L_0x00c5:
            r14 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c5 }
            throw r14
        L_0x00c8:
            r3 = r5
        L_0x00c9:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x005e
            boolean r0 = r3.booleanValue()
            if (r0 != 0) goto L_0x0105
            goto L_0x005e
        L_0x00d4:
            com.google.android.apps.gsa.search.core.i.t r1 = r13.f324664c
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C89995ba.f246760h
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x0004
            r1 = r14
            com.google.android.apps.gsa.searchbox.c.t r1 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r1
            com.google.android.apps.gsa.shared.search.Query r1 = r1.f239556a
            java.lang.String r1 = r1.mo84352bk()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0004
            com.google.android.libraries.searchbox.shared.suggestion.e r0 = r0.mo44218n()
            com.google.android.libraries.searchbox.shared.suggestion.s r0 = r0.f109009c
            if (r0 != 0) goto L_0x00f7
            com.google.android.libraries.searchbox.shared.suggestion.s r0 = com.google.android.libraries.searchbox.shared.suggestion.C41693s.f109053h
        L_0x00f7:
            java.lang.String r1 = r0.f109057c
            java.lang.String r0 = r0.f109059e
            java.lang.String r0 = com.google.android.apps.gsa.shared.p6990an.C89235z.m145136h(r1, r0)
            boolean r0 = r13.m194328c(r0)
            r1 = r0 ^ 1
        L_0x0105:
            if (r1 == 0) goto L_0x0004
            r15.remove()
            goto L_0x0004
        L_0x010c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116939x.mo44214b(com.google.android.libraries.searchbox.shared.b.a, java.util.List):boolean");
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f324665d = ((C88614r) obj).f239532c;
    }
}
