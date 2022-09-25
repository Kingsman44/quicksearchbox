package com.google.android.libraries.assistant.auto.ondevice.p713e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.e.l */
/* compiled from: PG */
public final class C11896l implements C11890f {

    /* renamed from: d */
    public static final /* synthetic */ int f38261d = 0;

    /* renamed from: a */
    public final Object f38262a = new Object();

    /* renamed from: b */
    public final C11904t f38263b;

    /* renamed from: c */
    public final List f38264c = new ArrayList();

    /* renamed from: e */
    private final C22871g f38265e;

    /* renamed from: f */
    private final C86124t f38266f;

    static {
        C58974d.m91134h("ClientLogAggregator");
    }

    public C11896l(C11904t tVar, C22871g gVar, C86124t tVar2) {
        this.f38263b = tVar;
        this.f38265e = gVar;
        this.f38266f = tVar2;
    }

    /* renamed from: a */
    public final boolean mo20278a(long j) {
        return Collection.EL.stream(mo20279b(j).mo20293a()).anyMatch(C11891g.f38255a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.assistant.auto.ondevice.p713e.C11903s mo20279b(long r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f38262a
            monitor-enter(r0)
            java.util.List r1 = r6.f38264c     // Catch:{ all -> 0x0048 }
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)     // Catch:{ all -> 0x0048 }
            com.google.android.libraries.assistant.auto.ondevice.e.k r2 = new com.google.android.libraries.assistant.auto.ondevice.e.k     // Catch:{ all -> 0x0048 }
            r2.<init>(r7)     // Catch:{ all -> 0x0048 }
            j$.util.stream.Stream r1 = r1.filter(r2)     // Catch:{ all -> 0x0048 }
            j$.util.Optional r1 = r1.findFirst()     // Catch:{ all -> 0x0048 }
            boolean r2 = r1.isPresent()     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x0024
            java.lang.Object r7 = r1.get()     // Catch:{ all -> 0x0048 }
            com.google.android.libraries.assistant.auto.ondevice.e.s r7 = (com.google.android.libraries.assistant.auto.ondevice.p713e.C11903s) r7     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return r7
        L_0x0024:
            com.google.android.libraries.assistant.auto.ondevice.e.s r1 = new com.google.android.libraries.assistant.auto.ondevice.e.s     // Catch:{ all -> 0x0048 }
            r1.<init>(r7)     // Catch:{ all -> 0x0048 }
            java.util.List r2 = r6.f38264c     // Catch:{ all -> 0x0048 }
            r2.add(r1)     // Catch:{ all -> 0x0048 }
            com.google.android.apps.gsa.search.core.i.t r2 = r6.f38266f     // Catch:{ all -> 0x0048 }
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250336bH     // Catch:{ all -> 0x0048 }
            boolean r2 = r2.mo79746e(r3)     // Catch:{ all -> 0x0048 }
            if (r2 != 0) goto L_0x0046
            com.google.android.libraries.gsa.k.g r2 = r6.f38265e     // Catch:{ all -> 0x0048 }
            com.google.android.libraries.assistant.auto.ondevice.e.j r3 = new com.google.android.libraries.assistant.auto.ondevice.e.j     // Catch:{ all -> 0x0048 }
            r3.<init>(r6, r7)     // Catch:{ all -> 0x0048 }
            java.lang.String r7 = "Record the session"
            r4 = 30000(0x7530, double:1.4822E-319)
            r2.mo28213m(r7, r4, r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return r1
        L_0x0048:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p713e.C11896l.mo20279b(long):com.google.android.libraries.assistant.auto.ondevice.e.s");
    }
}
