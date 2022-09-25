package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95874b;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.w */
/* compiled from: PG */
public final class C95005w implements AutoCloseable {

    /* renamed from: e */
    private static final C59071e f265802e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.h.w");

    /* renamed from: f */
    private static final long f265803f = Duration.ofSeconds(10).toMillis();

    /* renamed from: g */
    private static final long f265804g = Duration.ofSeconds(5).toMillis();

    /* renamed from: h */
    private static final long f265805h = Duration.ofSeconds(10).toMillis();

    /* renamed from: i */
    private static final long f265806i = Duration.ofSeconds(10).toMillis();

    /* renamed from: a */
    public final C60888db f265807a;

    /* renamed from: b */
    public final C94995m f265808b;

    /* renamed from: c */
    public final C94983ab f265809c;

    /* renamed from: d */
    C95004v f265810d = C95004v.NOT_WAITING;

    /* renamed from: j */
    private C60870cx f265811j;

    static {
        Duration.ofSeconds(60).toMillis();
    }

    public C95005w(C94995m mVar, C94983ab abVar, C60888db dbVar, C95850a aVar) {
        this.f265807a = dbVar;
        this.f265808b = mVar;
        this.f265809c = abVar;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    /* renamed from: c */
    private final synchronized void m156852c() {
        if (this.f265811j != null) {
            C58976aa aaVar = C58975e.f156826a;
            this.f265811j.cancel(false);
        }
    }

    /* renamed from: d */
    private final synchronized void m156853d(C95007y yVar, C95004v vVar) {
        m156852c();
        long j = f265806i;
        C48098ce ceVar = C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED;
        C95004v vVar2 = C95004v.WAITING_FOR_RECOGNIZED_TEXT;
        int ordinal = vVar.ordinal();
        if (ordinal == 0) {
            boolean z = C95874b.f268447a.f268448b;
            j = f265805h;
            ceVar = C48098ce.NO_SPEECH;
        } else if (ordinal == 1) {
            j = f265804g;
        } else if (ordinal != 2) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            boolean z2 = C95874b.f268447a.f268448b;
            j = f265803f;
            ceVar = C48098ce.TIMEOUT;
        }
        this.f265811j = this.f265807a.mo29164d(new C94998p(this, vVar, yVar, ceVar), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo88910a() {
        C58976aa aaVar = C58975e.f156826a;
        m156852c();
        mo88911b((C95007y) null, C95004v.NOT_WAITING);
        this.f265807a.execute(new C94996n(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo88911b(com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95007y r4, com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95004v r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.m156852c()     // Catch:{ all -> 0x0033 }
            com.google.common.f.e r0 = f265802e     // Catch:{ all -> 0x0033 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0033 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "GsaDialogHandler"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x0033 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0033 }
            r1 = 17823(0x459f, float:2.4975E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0033 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "From %s to %s"
            com.google.android.apps.gsa.staticplugins.bisto.ac.h.v r2 = r3.f265810d     // Catch:{ all -> 0x0033 }
            r0.mo56354G(r1, r2, r5)     // Catch:{ all -> 0x0033 }
            r3.f265810d = r5     // Catch:{ all -> 0x0033 }
            com.google.android.apps.gsa.staticplugins.bisto.ac.h.v r0 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95004v.NOT_WAITING     // Catch:{ all -> 0x0033 }
            if (r5 == r0) goto L_0x0031
            if (r4 == 0) goto L_0x0031
            com.google.android.apps.gsa.staticplugins.bisto.ac.h.v r5 = r3.f265810d     // Catch:{ all -> 0x0033 }
            r3.m156853d(r4, r5)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)
            return
        L_0x0031:
            monitor-exit(r3)
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h.C95005w.mo88911b(com.google.android.apps.gsa.staticplugins.bisto.ac.h.y, com.google.android.apps.gsa.staticplugins.bisto.ac.h.v):void");
    }

    public final void close() {
        C58976aa aaVar = C58975e.f156826a;
        mo88910a();
        if (!this.f265808b.f265761x.f265734d.equals("IDLE")) {
            C59104x d = f265802e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GsaDialogHandler");
            ((C59052c) ((C59052c) d).mo56372aa(17822)).mo56386p("Still in query or transcription after destroy!");
            int i = C90755l.f253831a;
        }
    }
}
