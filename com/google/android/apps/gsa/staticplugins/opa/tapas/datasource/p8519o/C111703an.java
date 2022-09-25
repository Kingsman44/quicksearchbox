package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88639l;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88644q;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88567r;
import com.google.android.apps.gsa.shared.p6990an.C89208aa;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89207l;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58832aw;
import com.google.common.base.C58879cp;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.an */
/* compiled from: PG */
public final class C111703an implements C88567r, C89207l {

    /* renamed from: a */
    public final C21370a f310523a;

    /* renamed from: b */
    public final C88644q f310524b;

    /* renamed from: c */
    public final long f310525c;

    /* renamed from: d */
    public String f310526d;

    /* renamed from: e */
    C88639l f310527e;

    /* renamed from: f */
    private final C86054o f310528f;

    /* renamed from: g */
    private final C22871g f310529g;

    public C111703an(C86054o oVar, C21370a aVar, C88644q qVar, C22871g gVar, C68214a aVar2) {
        this.f310528f = oVar;
        this.f310523a = aVar;
        this.f310524b = qVar;
        this.f310529g = gVar;
        this.f310525c = ((C86124t) aVar2.mo27525b()).mo79743a(C90063do.f249597gY);
    }

    /* renamed from: c */
    private final synchronized void m185512c(C89208aa aaVar) {
        this.f310526d = this.f310528f.mo79659F();
        if (C89208aa.TAPAS.equals(aaVar)) {
            this.f310529g.mo28212l("persistCache", new C111701al(this, aaVar));
        }
    }

    /* renamed from: a */
    public final synchronized void mo99208a(C89208aa aaVar) {
        if (C89208aa.TAPAS.equals(aaVar)) {
            this.f310527e = null;
            m185512c(aaVar);
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0054=Splitter:B:31:0x0054, B:35:0x0058=Splitter:B:35:0x0058} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.protobuf.MessageLite mo82240b(com.google.android.apps.gsa.searchbox.p6944c.C88616t r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.apps.gsa.shared.search.Query r8 = r8.f239556a     // Catch:{ all -> 0x005c }
            r0 = 0
            if (r8 == 0) goto L_0x0058
            java.lang.CharSequence r8 = r8.f252768g     // Catch:{ all -> 0x005c }
            int r8 = r8.length()     // Catch:{ all -> 0x005c }
            if (r8 <= 0) goto L_0x000f
            goto L_0x0058
        L_0x000f:
            com.google.android.apps.gsa.search.core.google.gaia.o r8 = r7.f310528f     // Catch:{ all -> 0x005c }
            java.lang.String r8 = r8.mo79659F()     // Catch:{ all -> 0x005c }
            boolean r1 = com.google.common.base.C58879cp.m90962d(r8)     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x001f
            r7.f310527e = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r7)
            return r0
        L_0x001f:
            java.lang.String r1 = r7.f310526d     // Catch:{ all -> 0x005c }
            boolean r1 = com.google.common.base.C58832aw.m90831a(r1, r8)     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x002b
            r7.f310527e = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r7)
            return r0
        L_0x002b:
            com.google.android.apps.gsa.searchbox.client.gsa.a.l r1 = r7.f310527e     // Catch:{ all -> 0x005c }
            if (r1 != 0) goto L_0x0031
            monitor-exit(r7)
            return r0
        L_0x0031:
            java.lang.String r2 = r7.f310526d     // Catch:{ all -> 0x005c }
            boolean r8 = com.google.common.base.C58832aw.m90831a(r8, r2)     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x0054
            com.google.android.libraries.f.a r8 = r7.f310523a     // Catch:{ all -> 0x005c }
            long r2 = r8.mo26870b()     // Catch:{ all -> 0x005c }
            long r4 = r1.f239628b     // Catch:{ all -> 0x005c }
            long r2 = r2 - r4
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r4 = r7.f310525c     // Catch:{ all -> 0x005c }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x005c }
            long r4 = r8.convert(r4, r6)     // Catch:{ all -> 0x005c }
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0054
            r7.f310527e = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r7)
            return r0
        L_0x0054:
            com.google.protobuf.MessageLite r8 = r1.f239627a     // Catch:{ all -> 0x005c }
            monitor-exit(r7)
            return r8
        L_0x0058:
            r7.f310527e = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r7)
            return r0
        L_0x005c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111703an.mo82240b(com.google.android.apps.gsa.searchbox.c.t):com.google.protobuf.MessageLite");
    }

    /* renamed from: e */
    public final synchronized void mo78004e() {
        String F = this.f310528f.mo79659F();
        if (C58879cp.m90962d(F)) {
            mo82241j();
        } else if (this.f310527e == null || !C58832aw.m90831a(F, this.f310526d) || this.f310523a.mo26870b() - this.f310527e.f239628b > TimeUnit.MILLISECONDS.convert(this.f310525c, TimeUnit.DAYS)) {
            this.f310529g.mo28212l("updateState", new C111702am(this, F));
        }
    }

    /* renamed from: j */
    public final synchronized void mo82241j() {
        mo99208a(C89208aa.TAPAS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82242k(com.google.android.apps.gsa.searchbox.p6944c.C88616t r7, com.google.protobuf.MessageLite r8, com.google.android.libraries.searchbox.root.C41626a r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.apps.gsa.shared.search.Query r7 = r7.f239556a     // Catch:{ all -> 0x0041 }
            if (r7 == 0) goto L_0x003f
            java.lang.CharSequence r7 = r7.f252768g     // Catch:{ all -> 0x0041 }
            int r7 = r7.length()     // Catch:{ all -> 0x0041 }
            if (r7 <= 0) goto L_0x000e
            goto L_0x003f
        L_0x000e:
            boolean r7 = r8 instanceof com.google.assistant.p3858ar.p3859a.C49728r     // Catch:{ all -> 0x0041 }
            if (r7 != 0) goto L_0x0014
            monitor-exit(r6)
            return
        L_0x0014:
            com.google.android.apps.gsa.search.core.google.gaia.o r7 = r6.f310528f     // Catch:{ all -> 0x0041 }
            java.lang.String r7 = r7.mo79659F()     // Catch:{ all -> 0x0041 }
            r6.f310526d = r7     // Catch:{ all -> 0x0041 }
            boolean r7 = com.google.common.base.C58879cp.m90962d(r7)     // Catch:{ all -> 0x0041 }
            if (r7 == 0) goto L_0x0027
            r7 = 0
            r6.f310527e = r7     // Catch:{ all -> 0x0041 }
            monitor-exit(r6)
            return
        L_0x0027:
            com.google.android.apps.gsa.searchbox.client.gsa.a.l r7 = new com.google.android.apps.gsa.searchbox.client.gsa.a.l     // Catch:{ all -> 0x0041 }
            com.google.android.libraries.f.a r9 = r6.f310523a     // Catch:{ all -> 0x0041 }
            long r2 = r9.mo26870b()     // Catch:{ all -> 0x0041 }
            r4 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r4)     // Catch:{ all -> 0x0041 }
            r6.f310527e = r7     // Catch:{ all -> 0x0041 }
            com.google.android.apps.gsa.shared.an.aa r7 = com.google.android.apps.gsa.shared.p6990an.C89208aa.TAPAS     // Catch:{ all -> 0x0041 }
            r6.m185512c(r7)     // Catch:{ all -> 0x0041 }
            monitor-exit(r6)
            return
        L_0x003f:
            monitor-exit(r6)
            return
        L_0x0041:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111703an.mo82242k(com.google.android.apps.gsa.searchbox.c.t, com.google.protobuf.MessageLite, com.google.android.libraries.searchbox.root.a):void");
    }
}
