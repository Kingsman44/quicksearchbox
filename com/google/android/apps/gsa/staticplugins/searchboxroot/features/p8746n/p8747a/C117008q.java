package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89995ba;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8748b.C117010a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.a.q */
/* compiled from: PG */
public final class C117008q {

    /* renamed from: a */
    public final C21370a f324819a;

    /* renamed from: b */
    public final C68214a f324820b;

    /* renamed from: c */
    private final C86124t f324821c;

    /* renamed from: d */
    private final C22871g f324822d;

    /* renamed from: e */
    private final C68214a f324823e;

    /* renamed from: f */
    private int f324824f = 0;

    /* renamed from: g */
    private C58833ax f324825g = C58833ax.m90834k(-1L);

    /* renamed from: h */
    private long f324826h = -1;

    public C117008q(C86124t tVar, C21370a aVar, C22871g gVar, C68214a aVar2, C68214a aVar3) {
        this.f324821c = tVar;
        this.f324819a = aVar;
        this.f324822d = gVar;
        this.f324820b = aVar2;
        this.f324823e = aVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return false;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m194451f() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.libraries.f.a r0 = r7.f324819a     // Catch:{ all -> 0x002e }
            long r0 = r0.mo26871c()     // Catch:{ all -> 0x002e }
            long r2 = r7.f324826h     // Catch:{ all -> 0x002e }
            long r0 = r0 - r2
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x002b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x002b
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002e }
            com.google.android.apps.gsa.search.core.i.t r3 = r7.f324821c     // Catch:{ all -> 0x002e }
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C89995ba.f246769q     // Catch:{ all -> 0x002e }
            long r3 = r3.mo79743a(r4)     // Catch:{ all -> 0x002e }
            long r2 = r2.toMillis(r3)     // Catch:{ all -> 0x002e }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x002b
            monitor-exit(r7)
            r0 = 1
            return r0
        L_0x002b:
            monitor-exit(r7)
            r0 = 0
            return r0
        L_0x002e:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a.C117008q.m194451f():boolean");
    }

    /* renamed from: a */
    public final synchronized Long mo103089a() {
        C117010a aVar = (C117010a) this.f324823e.mo27525b();
        aVar.mo103097h(this.f324824f);
        if (m194451f()) {
            aVar.mo103095c(true);
            return (Long) ((C58847bk) this.f324825g).f156646a;
        }
        aVar.mo103095c(false);
        return -1L;
    }

    /* renamed from: b */
    public final synchronized void mo103090b() {
        long c = this.f324819a.mo26871c();
        long j = this.f324826h;
        long c2 = this.f324819a.mo26871c() - j;
        if (j != -1 && c2 >= 0) {
            if (c2 <= TimeUnit.SECONDS.toMillis(this.f324821c.mo79743a(C89995ba.f246766n))) {
                mo103093e(c, 2);
                return;
            }
        }
        this.f324822d.mo28207g("load YouTube data", new C117007p(this, c));
    }

    /* renamed from: c */
    public final synchronized void mo103091c(int i, C58833ax axVar, long j) {
        this.f324824f = i;
        this.f324825g = axVar;
        this.f324826h = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return true;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo103092d(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = -1
            r2 = 0
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x000a
            monitor-exit(r5)
            return r2
        L_0x000a:
            com.google.android.libraries.f.a r0 = r5.f324819a     // Catch:{ all -> 0x002f }
            long r0 = r0.mo26871c()     // Catch:{ all -> 0x002f }
            long r0 = r0 - r6
            r6 = 0
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x002c
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002f }
            com.google.android.apps.gsa.search.core.i.t r7 = r5.f324821c     // Catch:{ all -> 0x002f }
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250624aV     // Catch:{ all -> 0x002f }
            long r3 = r7.mo79743a(r3)     // Catch:{ all -> 0x002f }
            long r6 = r6.toMillis(r3)     // Catch:{ all -> 0x002f }
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            monitor-exit(r5)
            return r2
        L_0x002c:
            monitor-exit(r5)
            r6 = 1
            return r6
        L_0x002f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a.C117008q.mo103092d(long):boolean");
    }

    /* renamed from: e */
    public final void mo103093e(long j, int i) {
        ((C117010a) this.f324823e.mo27525b()).mo103096g((int) (this.f324819a.mo26871c() - j));
        ((C117010a) this.f324823e.mo27525b()).mo103099j(i);
    }
}
