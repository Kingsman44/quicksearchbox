package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a;

import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.C88615s;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88568b;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.util.debug.C91030n;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.a.o */
/* compiled from: PG */
public final class C88564o extends C88582c implements C89204i, C89199d, C89200e {

    /* renamed from: a */
    public static final C59071e f239368a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.c.b.a.o");

    /* renamed from: b */
    public boolean f239369b;

    /* renamed from: c */
    private final C88560k f239370c;

    /* renamed from: d */
    private final C88550a f239371d;

    /* renamed from: e */
    private final Object f239372e = new Object();

    /* renamed from: f */
    private final LinkedList f239373f = new LinkedList();

    /* renamed from: g */
    private C88555f f239374g;

    /* renamed from: h */
    private List f239375h;

    /* renamed from: i */
    private int f239376i;

    public C88564o(C88560k kVar, C88550a aVar) {
        this.f239370c = kVar;
        this.f239371d = aVar;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88614r rVar = (C88614r) obj;
        this.f239374g = rVar.f239552w;
        this.f239375h = rVar.f239551v;
    }

    /* renamed from: hD */
    public final /* synthetic */ void mo82217hD(Object obj) {
        this.f239376i = (int) ((C88615s) obj).f239555a.mo79743a(C90120fr.f250792aE);
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        this.f239369b = false;
        synchronized (this.f239372e) {
            while (!this.f239373f.isEmpty()) {
                C60870cx cxVar = (C60870cx) this.f239373f.poll();
                cxVar.getClass();
                cxVar.cancel(true);
            }
        }
    }

    /* renamed from: j */
    public final int mo82233j() {
        C88560k kVar = this.f239370c;
        int i = kVar.f239355e;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            if (i2 > (kVar.f239353c.mo82183a() - 2) / 2) {
                break;
            }
            i += i;
            i2 = i3;
        }
        return i < kVar.f239359i ? kVar.f239359i : i;
    }

    /* renamed from: k */
    public final int mo82234k(Suggestion suggestion) {
        int i = suggestion.f108910k;
        if (i == 35 || i == 83 || suggestion.f108925z.contains(39)) {
            return this.f239371d.mo82213a(suggestion) ? 2 : 1;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.searchbox.root.C41626a mo82235l(com.google.android.libraries.searchbox.shared.p3201b.C41642a r12) {
        /*
            r11 = this;
            com.google.android.apps.gsa.searchbox.c.b.a.k r0 = r11.f239370c
            com.google.android.apps.gsa.searchbox.c.b.a.f r1 = r0.f239354d
            r2 = r12
            com.google.android.apps.gsa.searchbox.c.t r2 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r2
            com.google.android.apps.gsa.shared.search.Query r3 = r2.f239556a
            java.lang.String r3 = r3.mo84352bk()
            boolean r3 = r3.isEmpty()
            r4 = 1
            if (r3 == 0) goto L_0x002a
            java.lang.String r3 = "web"
            java.lang.String r5 = r2.f239558c
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x002a
            boolean r3 = com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88555f.m143067g(r2)
            if (r3 == 0) goto L_0x002a
            com.google.android.libraries.searchbox.root.a r1 = r1.mo82215c(r2)
            goto L_0x008f
        L_0x002a:
            com.google.android.libraries.f.a r3 = r1.f239334a
            long r5 = r3.mo26871c()
            int r3 = r1.f239339f
            long r7 = (long) r3
            long r5 = r5 - r7
            android.util.LruCache r3 = r1.f239342i
            r7 = 0
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r3.get(r12)
            android.util.Pair r3 = (android.util.Pair) r3
            if (r3 == 0) goto L_0x005e
            java.lang.Object r8 = r3.first
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            java.lang.Object r3 = r3.second
            com.google.at.h.d.a.ar r3 = (com.google.p4017at.p4060h.p4073d.p4074a.C54229ar) r3
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0057
            android.util.LruCache r3 = r1.f239342i
            r3.remove(r12)
            goto L_0x005e
        L_0x0057:
            com.google.android.apps.gsa.searchbox.c.b.a.m r5 = r1.f239335b
            com.google.android.libraries.searchbox.root.a r3 = r5.mo82232a(r3, r4)
            goto L_0x005f
        L_0x005e:
            r3 = r7
        L_0x005f:
            if (r3 == 0) goto L_0x0072
            com.google.at.h.d.a.at r5 = r3.f108840e
            boolean r5 = r5.f142366f
            if (r5 == 0) goto L_0x0070
            int r5 = r1.f239341h
            int r1 = r1.f239340g
            if (r5 > r1) goto L_0x0070
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x008e
        L_0x0070:
            r1 = r3
            goto L_0x008f
        L_0x0072:
            r3 = 0
        L_0x0073:
            android.util.SparseArray r5 = r1.f239337d
            int r5 = r5.size()
            if (r3 >= r5) goto L_0x008e
            android.util.SparseArray r5 = r1.f239337d
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.apps.gsa.searchbox.c.b.a.l r5 = (com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88561l) r5
            com.google.android.libraries.searchbox.root.a r5 = r5.mo82229b(r2)
            if (r5 == 0) goto L_0x008b
            r1 = r5
            goto L_0x008f
        L_0x008b:
            int r3 = r3 + 1
            goto L_0x0073
        L_0x008e:
            r1 = r7
        L_0x008f:
            if (r1 == 0) goto L_0x00a4
            com.google.android.libraries.searchbox.root.a r1 = r0.mo82221b(r2, r1)
            boolean r3 = r1.f108839d
            if (r3 == 0) goto L_0x009f
            com.google.android.apps.gsa.searchbox.c.a.c r0 = r0.f239353c
            r0.mo82194n(r12)
            goto L_0x00a4
        L_0x009f:
            com.google.android.apps.gsa.searchbox.c.a.c r0 = r0.f239353c
            r0.mo82188h(r12)
        L_0x00a4:
            android.os.Bundle r0 = r2.f239561f
            java.lang.String r3 = "cs::force_fetching"
            boolean r0 = r0.getBoolean(r3)
            if (r0 == 0) goto L_0x00d3
            android.os.Bundle r0 = r2.f239561f
            java.lang.String r3 = "bs:bootstrapping"
            boolean r0 = r0.getBoolean(r3)
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r11.f239369b
            if (r0 != 0) goto L_0x00d3
            if (r1 == 0) goto L_0x00d3
            android.os.Bundle r0 = r2.f239561f
            java.lang.String r2 = "cs::skip_edit"
            r0.putBoolean(r2, r4)
            com.google.common.util.concurrent.cx r12 = r11.mo82236m(r12)
            com.google.android.apps.gsa.searchbox.c.b.a.n r0 = new com.google.android.apps.gsa.searchbox.c.b.a.n
            r0.<init>(r11)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r12, r0, r2)
        L_0x00d3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88564o.mo82235l(com.google.android.libraries.searchbox.shared.b.a):com.google.android.libraries.searchbox.root.a");
    }

    /* renamed from: m */
    public final C60870cx mo82236m(C41642a aVar) {
        C60870cx c;
        synchronized (this.f239372e) {
            while (this.f239373f.size() >= this.f239376i) {
                C58976aa aaVar = C58975e.f156826a;
                C60870cx cxVar = (C60870cx) this.f239373f.poll();
                cxVar.getClass();
                cxVar.cancel(true);
            }
            C88560k kVar = this.f239370c;
            if (kVar.f239358h.mo84225b()) {
                C91030n.m148695a("CompleteServerResponseFetcher.fetchSuggestions", kVar.f239358h);
            }
            kVar.f239353c.mo82197q(aVar);
            long c2 = kVar.f239357g.mo26871c();
            c = kVar.f239356f.mo85138c(new C88557h(kVar, (C88616t) aVar));
            C60856cj.m92911t(c, new C88558i(kVar, (C88616t) aVar), C60826bg.f164896a);
            kVar.f239356f.mo85142g(c, new C88559j(kVar, (C88616t) aVar, c2));
            if (kVar.f239358h.mo84225b()) {
                C91030n.m148696b(kVar.f239358h);
            }
            this.f239373f.add(c);
        }
        C88568b.m143111a(c, this.f239373f, this.f239372e);
        return c;
    }

    /* renamed from: n */
    public final void mo82237n() {
        this.f239374g.mo82216f();
    }

    /* renamed from: o */
    public final boolean mo82238o(C41642a aVar) {
        C58801sm G = ((C58485gu) this.f239375h).listIterator(0);
        int i = 1;
        while (G.hasNext()) {
            int c = ((C88552c) G.next()).mo82214c((C88616t) aVar);
            if (c > i) {
                i = c;
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        return i <= 2;
    }
}
